# Antlr-Gramatica
Gramática
Construa uma GLC que represente a seguinte linguagem de programação:
* Programa: uma lista de um ou mais comandos. Se houver mais de um comando na lista,
eles serão separados por “;”.
* Comando de atribuição: variável seguida de “:=” e de uma expressão aritmética.
* Comandos de teste, com duas formas distintas:
(a) “if” seguido de expressão relacional, seguida de “then”, seguido de lista de um
ou mais comandos comandos separados por ";" ou
(b) “if” seguido de expressão relacional, seguida de “then”, seguido de lista de um ou
mais comandos separados por ";" finalizada por “else” que é seguido por uma nova lista de
um ou mais comandos separados por ";".
* Comando de iteração: “while” seguido de expressão relacional, seguida de “do”, seguido
de uma lista de um ou mais comandos separados por “;” .
* Expressão aritmética: formada com os operadores de “+”, “-”, “*”, “/” e (opcionalmente)
parênteses balanceados aplicados sobre variáveis, constantes ou expressões aritméticas.
* Expressão relacional: formada por uma expressão aritmética seguida de um dos seguintes
operadores relacionais: “=”, “<>”, “<”, “>”, “<=”, “>=”, seguida de outra expressão aritmética.
* Variáveis são palavras de [a-zA-Z]
+ e as constantes são palavras de [0-9]
+
.
Considere que cada palavra (ou seja, trechos de código) que não fizer parte da gramática desta
linguagem, deverá ser identificado e apresentado em que parte do processo de derivação este erro
foi encontrado. Portanto, deverá será realizada a análise sintática e semântica.
Exemplo de um trecho de código:

![image](https://user-images.githubusercontent.com/73067604/139755084-72319af5-17a8-4074-ae63-9fee174cc111.png)


A gramática deverá ser desenvolvida utilizando a ferramenta ANTLR.
