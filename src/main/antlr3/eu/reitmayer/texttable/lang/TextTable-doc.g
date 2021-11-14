/*
 don't edit this file! It's only edit to comply with antlr4 to allow the VSCode plugin to 
 render the railroad diagramms for documentation purposes.
 */
grammar TextTable;




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



ID :
  ['a'..'Z] (['a..'Z'] | ['0'..'9']| '_' )*;
  
INT :
  ['0'..'9']+;


table_desc:
	plain_descr
	|
	sep_descr
	;
	
	
plain_descr:
	PLAIN ID
	BEGIN
	  pl=plain_elem_list
	END ';'
	;

/**
 * separated test headers auto prefix ' ' strings enclosed by "\"" escaped by 
 */
sep_descr:
	SEPARATED ID
	BEGIN
	END ';'
	;

plain_elem_list:
	p+=plain_elem (',' p+=plain_elem)* 
	;
	
plain_elem:
  ID FROM i1=INT TO i2=INT (al=ALIGN_LEFT | al=ALIGN_RIGHT)? 
  |
  ID LENGTH i1=INT (al=ALIGN_LEFT | al=ALIGN_RIGHT)? 
  ;
  	
WS :
  (' ' | '\t' | '\f' | '\n' | '\r')+ {$channel=HIDDEN;};
  
ML :
  '/*'  '*/' {$channel=HIDDEN;};


SL :
  '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
  





