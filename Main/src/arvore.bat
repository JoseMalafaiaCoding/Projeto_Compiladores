SET CLASSPATH=.;C:\Users\Jose\Documents\Anhembi\Compiladores\Projeto\Main\src\antlr-4.10.1-complete.jar %CLASSPATH%
java org.antlr.v4.Tool Gramatica.g4
javac *.java
java org.antlr.v4.gui.TestRig Gramatica init -gui < entrada.txt