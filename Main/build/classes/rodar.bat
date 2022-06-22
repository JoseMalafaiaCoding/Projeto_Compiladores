cls
del Teste.java
SET CLASSPATH=.;C:\Users\Jose\Documents\Anhembi\Compiladores\Projeto\Main\src\antlr-4.10.1-complete.jar %CLASSPATH%
java org.antlr.v4.Tool Gramatica.g4
javac *.java
java Main < entrada.txt > Teste.java
javac *.java
java Teste.java
