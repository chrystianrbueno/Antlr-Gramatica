grammar Gramatica;		

options {
	language=Java;
}

prog:
	stat+
	;
stat	:	
	(comando';')
	| teste
	;	
	
comando	:	
	VAR ':=' expr_arit {System.out.println("Variável " + $VAR.text + " = " + $expr.v);}
	; 

teste
	:
	('if' expr_rel 'then' stat)
	;

iteracao
	:
	('while' expr_rel 'do' stat)
	;
																																																																																																																																																																					
expr_arit returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);}
	(
	  '-' e = expr_arit {$v -= $e.v;} {System.out.println("Resultado Subtração: " + $v);}
	| '+' e = expr_arit {$v += $e.v;} {System.out.println("Resultado Soma: " + $v);}
	| '/' e = expr_arit {$v /= $e.v;} {System.out.println("Resultado Divisão: " + $v);}
	| '*' e = expr_arit {$v *= $e.v;} {System.out.println("Resultado Multiplicação: " + $v);}
	)	
    |INT {$v = Double.parseDouble( $INT.text);}
    |'(' e = expr_arit {$v = $e.v;} ')'
    ;

expr_rel returns [ boolean t ]
    : 
    ( e = expr_rel ) 
    ( '='  {System.out.println("Expressao Relacional: = " );} d = expr_rel {$t = $e.v == $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " = "  + $d.v + " : " + $t);} 
    | '<'  {System.out.println("Expressao Relacional: < " );} d = expr_rel {$t = $e.v <  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " < "  + $d.v + " : " + $t);}
    | '>'  {System.out.println("Expressao Relacional: > " );} d = expr_rel {$t = $e.v >  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " > "  + $d.v + " : " + $t);} 
    | '>=' {System.out.println("Expressao Relacional: >= ");} d = expr_rel {$t = $e.v >= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " >= " + $d.v + " : " + $t);}
    | '<=' {System.out.println("Expressao Relacional: <= ");} d = expr_rel {$t = $e.v <= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <= " + $d.v + " : " + $t);}
    | '<>' {System.out.println("Expressao Relacional: <> ");} d = expr_rel {$t = $e.v != $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <> " + $d.v + " : " + $t);} 
    )   
    ;
    
NEWLINE : ('\r' | '\n')+ {skip();};
INT     : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;