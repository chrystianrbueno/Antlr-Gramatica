grammar Gramatica;		

options {
	language=Java;
}

prog:
	stat+
	;
stat	:	
	(resultado';')
	;	 
resultado returns [ double v ]:

	(e = expr {$v = $e.v;} {System.out.println("Resultado: " + $v);})+ 
	;

expr returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);} ('+' e = expr {$v += $e.v;} | '-' e = expr {$v -= $e.v;} | '*' e = expr {$v *= $e.v;} | '/' e = expr {$v /= $e.v;})	
    |	INT {$v = Double.parseDouble( $INT.text);}
    

    |	'(' e = expr {$v = $e.v;} ')'
    ;
NEWLINE : ('\r' | '\n')+ {skip();};
INT     : ('0'..'9')+ ;