grammar Gramatica;		

options {
	language=Java;
}

@header {
    import java.util.HashMap;
}

@members {
    HashMap<String, Double> memory = new HashMap<>();
}

prog:
	stat+
	;
stat	:	
	(comando';')
	| teste
	;	
	
comando	:	
	VAR ':=' expr 
	{ memory.put($VAR.text, new Double($expr.v)); } 
	{ System.out.println("Variável " + $VAR.text + " = " + $expr.v + " inserida na lista"); }
	; 

teste
	:
	('if' expr_rel 'then' stat)
	;

iteracao
	:
	('while' expr_rel 'do' stat)
	;
																																																																																																																																																																					
expr returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);}
	(
	  '-' e = expr {$v -= $e.v;} {System.out.println("Resultado Subtração: " + $v);}
	| '+' e = expr {$v += $e.v;} {System.out.println("Resultado Soma: " + $v);}
	| '/' e = expr {$v /= $e.v;} {System.out.println("Resultado Divisão: " + $v);}
	| '*' e = expr {$v *= $e.v;} {System.out.println("Resultado Multiplicação: " + $v);}
	)	
    |INT {$v = Double.parseDouble( $INT.text);}
    |'(' e = expr {$v = $e.v;} ')'
    ;

expr_rel returns [ boolean t ]
    : 
    ( e = expr ) 
    ( '='  {System.out.println("Expressao Relacional: = " );} d = expr {$t = $e.v == $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " = "  + $d.v + " : " + $t);} 
    | '<'  {System.out.println("Expressao Relacional: < " );} d = expr {$t = $e.v <  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " < "  + $d.v + " : " + $t);}
    | '>'  {System.out.println("Expressao Relacional: > " );} d = expr {$t = $e.v >  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " > "  + $d.v + " : " + $t);} 
    | '>=' {System.out.println("Expressao Relacional: >= ");} d = expr {$t = $e.v >= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " >= " + $d.v + " : " + $t);}
    | '<=' {System.out.println("Expressao Relacional: <= ");} d = expr {$t = $e.v <= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <= " + $d.v + " : " + $t);}
    | '<>' {System.out.println("Expressao Relacional: <> ");} d = expr {$t = $e.v != $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <> " + $d.v + " : " + $t);} 
    )   
    ;
    
WS : (' ' | '\t' | '\r' | '\n')+ {skip();};
INT     : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;