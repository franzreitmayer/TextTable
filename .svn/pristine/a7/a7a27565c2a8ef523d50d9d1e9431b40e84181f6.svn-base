grammar TableQuery;

options {
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
  // backtrack = true;
}


tokens {
	BOOL_NOT = 'BOOL_NOT';
	UPDATE_VAL_LIST;
	COLUMN_LIST;
	AND;
	NOT;
	COLUMN_SPEC;
	UPDATE_VAL_ELEM;
}


@header{
package eu.reitmayer.texttable.lang;
}

@lexer::header{
package eu.reitmayer.texttable.lang;
}


@parser::members {
public List<RecognitionException> errors = new ArrayList<RecognitionException>();

public void reportError(RecognitionException e) {
	super.reportError(e);
	if (e.token.getType() != EOF)
	errors.add(e);
}
}

statement:
 	select_statement
 	|
 	update_statement
 	|
 	delete_statement
 	;



select_statement:
	SELECT col_list=column_list (WHERE bex=bool_expression)? -> ^(SELECT $col_list $bex?)
;

update_statement:
	UPDATE SET uval=update_value_list (WHERE b=bool_expression)? -> ^(UPDATE $uval $b?)
;

delete_statement:
	DELETE WHERE b=bool_expression -> ^(DELETE $b)
;

//column_list:
//	(sexp+=string_expression ('as' s+=STRING)? (',' sexp+=string_expression ('as' s+=STRING)? )*) -> ^(COLUMN_LIST $sexp+ $s*) 
//	| 
//	('*') -> ^(COLUMN_LIST '*')
//	;

column_list:
	cspec+=column_spec (',' cspec+=column_spec)* -> ^(COLUMN_LIST $cspec+)
	|
	ALL -> ^(COLUMN_LIST ALL)
//	|
//	ALL BUT rcspec+=replace_col_spec (',' rcspec+=replace_col_spec)*
	;
	
//replace_col_spec:
//	mod=REPLACE ID WITH column_spec
//	|
//	mod=DROP ID
//	|
//	mod=ADD column_spec
//	;
	
column_spec:
	sexp= string_expression (AS alias=ID)? -> ^(COLUMN_SPEC $sexp $alias?)
	;
	
update_value_list:
  uval_elem+=update_value_element (',' uval_elem+=update_value_element)* -> ^(UPDATE_VAL_LIST $uval_elem+)
  ;
  
update_value_element:
	id=ID '=' sexp=string_expression -> ^(UPDATE_VAL_ELEM $id $sexp)
	;
	

string_expression:
	cex+=concated_expression (CONCAT^ cex+=concated_expression)*
	;

concated_expression:
	ID -> ID
	|
	STRING -> STRING
	|
	built_in_func -> built_in_func
	;
	
built_in_func:
	SUB_STRING '(' sexp = string_expression ',' start_pos=INT ',' end_pos=INT ')' -> ^(SUB_STRING $sexp $start_pos $end_pos)
	|
	LOWER_CASE '(' sexp= string_expression ')' -> ^(LOWER_CASE $sexp)
	|
	UPPER_CASE '(' sexp = string_expression ')' -> ^(UPPER_CASE $sexp)
	|
	ROW_NUMBER -> ^(ROW_NUMBER)
	|
	REPLACE '(' sexp1=string_expression ','  sexp2=string_expression ',' sexp3=string_expression ')' -> ^(REPLACE $sexp1	$sexp2 $sexp3)
	|
	RANDOM_STRING '(' min=INT ',' max=INT ',' (mod=STRING | mod=TEXT | mod = TEXTNUM | mod=NUM) ')' -> ^(RANDOM_STRING $min $max $mod)
	|
	RANDOM_LIST '(' se+=string_expression (',' se+=string_expression)* ')' -> ^(RANDOM_LIST $se+)
;
	
bool_expression:
	b+=bool_and (o=OR^ b+=bool_and)* 
	;

bool_and:
	b+=bool_atom (AND^ b+=bool_atom)*
	;
	
//bool_not:
//  b=bool_atom -> BOOL_NOT
//  ;

 
bool_atom:
  '(' b=bool_expression ')' -> $b
  |
  str=string_expression (op=EQUALS|op=MATCHES) pattern=string_expression -> ^($op $str $pattern)
  |  
  TRUE
  |
  FALSE
  ;
   	

WS :
  (' ' | '\t' | '\f' | '\n' | '\r')+ {$channel=HIDDEN;};
  
ML :
  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};


SL :
  '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
  
fragment
Digit :
  '0'..'9';
fragment
Letter :
  'a'..'z' |
  'A'..'Z';


SELECT:
  'select'
  ;
  
DELETE:
  'delete'
  ;
  
UPDATE:
	'update'
	;
	
SET:
  'set';
	
WHERE:
 'where'
 ;

  
AND:
	'and';
	
OR:
  'or'
  ;

NOT:
  'not'
  ;
  
FALSE:
	'false'
	;

TRUE:
  'true'
  ;
  
EQUALS:
	'='
	;
	
MATCHES:
  'matches'
  ;
  
ALL:
	'*'
	;
	
BUT:
	'but'
	;
	
DROP:
	'drop'
	;
	
ADD:
	'add'
	;
	
CONCAT:
	'||'
	;
	
SUB_STRING:
	'sub_string'
	;
	
LOWER_CASE:
	'lower_case'
	;
	
UPPER_CASE:
	'upper_case'
	;
 
REPLACE:
 'replace'
 ;
 
RANDOM_STRING:
	'random_string'
	;
	
RANDOM_LIST:
	'random_list'
	;
	
ROW_NUMBER:
	'row_num'
	;
	
AS:
	'as'
	;

WITH:
	'with'
	;
	
TEXT:
	'TEXT'
	;
	
TEXTNUM:
	'TEXTNUM'
	;
	
NUM:
	'NUM'
	;
	
STRING :
  '"' (~('"'|'\n'|'\r'))* '"'; 
 
ID :
  Letter (Letter | Digit | '_' )*;
  
INT :
  Digit Digit*;
  
