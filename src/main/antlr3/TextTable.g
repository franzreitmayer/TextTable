grammar TextTable;

options {
  language = Java;
//   language = CSharp3;
   output = AST;
 //  ASTLabelType = CommonTree;
}

tokens{
	PLAIN_ELEM;
	PLAIN_FILE;
	PLAIN_ELEM_LIST;
}

@header {package eu.reitmayer.texttable.lang;}

@lexer::header {package eu.reitmayer.texttable.lang;} 

//@lexer::namespace {TextTableTool} 
//@parser::namespace {TextTableTool} 


@parser::members {
public List<RecognitionException> errors = new ArrayList<RecognitionException>();

public void reportError(RecognitionException e) {
	super.reportError(e);
	if (e.token.getType() != EOF)
	errors.add(e);
}
}
public table_desc:
	plain_descr
	|
	sep_descr
	;
	
	
plain_descr:
	PLAIN ID
	BEGIN
	  pl=plain_elem_list
	END ';' -> ^(PLAIN_FILE ID $pl)
	;

sep_descr:
	SEPARATED
	BEGIN
	END ';'
	;

plain_elem_list:
	p+=plain_elem (',' p+=plain_elem)* -> ^(PLAIN_ELEM_LIST $p+) 
	;
	
plain_elem:
  ID FROM i1=INT TO i2=INT (al=ALIGN_LEFT | al=ALIGN_RIGHT)? -> ^(ID $i1 $i2 $al?)
  |
  ID LENGTH i1=INT (al=ALIGN_LEFT | al=ALIGN_RIGHT)? -> ^(ID $i1 $al?)
  ;
  	
WS :
  (' ' | '\t' | '\f' | '\n' | '\r')+ {$channel=HIDDEN;};
  
ML :
  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};


SL :
  '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
  

BEGIN: 'begin';
END: 'end';
PLAIN: 'plain';
SEPARATED: 'separated';
BY: 'by';
TEXT_SEMICOLON: 'semicolon';
TEXT_COMMA: 'comma';
FROM: 'from';
TO: 'to';
LENGTH: 'length';
ALIGN_LEFT: 'left';
ALIGN_RIGHT: 'right';


fragment
Digit :
  '0'..'9';
fragment
Letter :
  'a'..'z' |
  'A'..'Z';
ID :
  Letter (Letter | Digit | '_' )*;
  
INT :
  Digit Digit*;



