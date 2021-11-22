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

prog
	:
	stat+
	;
stat
	:	
	(
	  comando';'
	)
	| teste
	| iteracao
	;	
	
comando
 	:	
	VAR ':=' expr 
	{ System.out.println("Resultado expressão: " + $expr.v); }
	{ memory.put($VAR.text, new Double($expr.v)); } 
	{ System.out.println("Variável " + $VAR.text + " = " + $expr.v + " inserida na lista"); }
	; 

teste
	:
	('if' expr_rel 'then' prog alternativa) 
	;

alternativa
	:
	('else' prog)	
	|
	;
iteracao
	:
	('while' expr_rel 'do' prog)
	;
																																																																																																																																																																					

expr_rel returns [ boolean t ]
    : 
    ( e = expr ) 
    ( 
      '='  {System.out.println("Expressao Relacional: = identificada");} d = expr {$t = $e.v == $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " = "  + $d.v + " : " + $t);} 
    | '<'  {System.out.println("Expressao Relacional: < identificada");} d = expr {$t = $e.v <  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " < "  + $d.v + " : " + $t);}
    | '>'  {System.out.println("Expressao Relacional: > identificada");} d = expr {$t = $e.v >  $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " > "  + $d.v + " : " + $t);} 
    | '>=' {System.out.println("Expressao Relacional: >= identificada");} d = expr {$t = $e.v >= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " >= " + $d.v + " : " + $t);}
    | '<=' {System.out.println("Expressao Relacional: <= identificada");} d = expr {$t = $e.v <= $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <= " + $d.v + " : " + $t);}
    | '<>' {System.out.println("Expressao Relacional: <> identificada");} d = expr {$t = $e.v != $d.v;} {System.out.println("Resultado Expressao Relacional: " + $e.v + " <> " + $d.v + " : " + $t);} 
    )   
    ;
expr returns [ double v ]
	:
	(
	  INT { $v = Double.parseDouble( $INT.text);} {System.out.println("Valor encontrado na Expressão: " + $v);}
    | VAR { $v = memory.getOrDefault($VAR.text, 0.0); } {System.out.println("Variável "+ $VAR.text +" valor lido da lista: " + $v);} )
	(
	  '-' {System.out.println("Sinal '-' encontrado");} e = expr {$v -= $e.v;} {System.out.println("Resultado Subtração: " + $v);}
	| '+' {System.out.println("Sinal '+' encontrado");} e = expr {$v += $e.v;} {System.out.println("Resultado Soma: " + $v);}
	| '/' {System.out.println("Sinal '/' encontrado");} e = expr {$v /= $e.v;} {System.out.println("Resultado Divisão: " + $v);}
	| '*' {System.out.println("Sinal '*' encontrado");} e = expr {$v *= $e.v;} {System.out.println("Resultado Multiplicação: " + $v);}
	|  //Caso seja o valor único e não uma nova expressão
	)	
    | '(' e = expr {$v = $e.v;} ')' {System.out.println("Expressão com '()' encontrado, prioridade na expressão");}
/*    |
	(
	  INT {$v = Double.parseDouble( $INT.text);}{System.out.println("Valor encontrado: " + $v);} 
    | VAR { $v = memory.get($VAR.text); } {NT {$v = Double.parseDouble( $INT.text);}{System.out.println("Valor encontrado: " + $v);} System.out.println("Valor lido da lista: " + $v);} 
    )
*/
    ;

    
WS:  (' ' | '\t' | '\r' | '\n')+ {skip();};
INT: ('0'..'9')+ ;
VAR	: ('a'..'z' | 'A'..'Z')+;
