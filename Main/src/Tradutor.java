
import java.util.HashMap;
import java.util.Map;

public class Tradutor extends GramaticaBaseListener {

    private Map<String, String> tabelaGeral;
    private Map<String, String> tabelaInteiro;
    private Map<String, String> tabelaDecimal;
    private Map<String, String> tabelaTexto;
    private Map<String, String> tabelaVarredura;

    public Tradutor() {
        tabelaGeral = new HashMap<>();
        tabelaInteiro = new HashMap<>();
        tabelaDecimal = new HashMap<>();
        tabelaTexto = new HashMap<>();
        tabelaVarredura = new HashMap<>();
    }

    //#2
    @Override
    public void enterClasse_principal(GramaticaParser.Classe_principalContext ctx) {
        System.out.println("import java.util.Scanner;");
        System.out.print("public class ");

    }

    @Override
    public void exitClasse_principal(GramaticaParser.Classe_principalContext ctx) {
        System.out.println("}");
        System.out.println("}");
    }

    //#2
    @Override
    public void exitNome_classe(GramaticaParser.Nome_classeContext ctx) {
        System.out.println(ctx.NOME_CLASSE().getText() + "{");
        System.out.print("\t");
        System.out.println("public static void main(String[] args){");
        System.out.print("\t\t");
    }

    //#3
    @Override
    public void exitId(GramaticaParser.IdContext ctx) {
        System.out.print(" " + ctx.ID().getText());
    }

    //#4
    @Override
    public void exitTipo_inteiro(GramaticaParser.Tipo_inteiroContext ctx) {
        System.out.print(" int");
    }

    //#4
    @Override
    public void exitTipo_decimal(GramaticaParser.Tipo_decimalContext ctx) {
        System.out.print(" double");
    }

    //#4
    @Override
    public void exitTipo_booleano(GramaticaParser.Tipo_booleanoContext ctx) {
        System.out.print(" boolean");
    }

    //#4
    @Override
    public void exitTipo_texto(GramaticaParser.Tipo_textoContext ctx) {
        System.out.print(" String");
    }

    //#5
    @Override
    public void exitLiteral_inteiro(GramaticaParser.Literal_inteiroContext ctx) {
        System.out.print(" " + ctx.LITERAL_INTEIRO().getText());
    }

    //#5
    @Override
    public void exitLiteral_decimal(GramaticaParser.Literal_decimalContext ctx) {
        System.out.print(" " + ctx.LITERAL_DECIMAL().getText());
    }

    //#5
    @Override
    public void exitLiteral_texto(GramaticaParser.Literal_textoContext ctx) {
        System.out.print(" " + ctx.LITERAL_TEXTO().getText());
    }

    //#5
    @Override
    public void exitLiteral_booleano(GramaticaParser.Literal_booleanoContext ctx) {
        if (ctx.getText().equals("verdadeiro")) {
            System.out.print(" true");
        } else {
            System.out.print(" false");
        }
    }

    //#6
    @Override
    public void exitOperador_aritmetico(GramaticaParser.Operador_aritmeticoContext ctx) {
        System.out.print(" " + ctx.getText());
    }

    //#6
    @Override
    public void exitOperador_relacional(GramaticaParser.Operador_relacionalContext ctx) {
        System.out.print(" " + ctx.getText());
    }

    //#6
    @Override
    public void exitOperador_logico(GramaticaParser.Operador_logicoContext ctx) {
        System.out.print(" " + ctx.getText());
    }

    //#6
    @Override
    public void exitOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx) {
        System.out.print(" =");
    }

    //#6
    @Override
    public void exitOperador_concatenacao(GramaticaParser.Operador_concatenacaoContext ctx) {
        System.out.print(" +");
    }

    //#6
    @Override
    public void exitAbre_parenteses(GramaticaParser.Abre_parentesesContext ctx) {
        System.out.print(" (");
    }

    //#6
    @Override
    public void exitFecha_parenteses(GramaticaParser.Fecha_parentesesContext ctx) {
        System.out.print(" )");
    }

    //#6
    @Override
    public void exitAbre_chaves(GramaticaParser.Abre_chavesContext ctx) {
        System.out.println(" {");
    }

    //#6
    @Override
    public void exitFim_linha(GramaticaParser.Fim_linhaContext ctx) {
        System.out.print("; ");
    }

    //#7
    @Override
    public void exitExpressao_aritmetica_inteiro(GramaticaParser.Expressao_aritmetica_inteiroContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaInteiro.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe ou nao foi declarada como inteiro");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#7
    @Override
    public void exitExpressao_aritmetica_decimal(GramaticaParser.Expressao_aritmetica_decimalContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaDecimal.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe ou nao foi declarada como decimal");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#7
    @Override
    public void exitExpressao_concatenacao(GramaticaParser.Expressao_concatenacaoContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaGeral.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#7
    @Override
    public void exitExpressao_relacional(GramaticaParser.Expressao_relacionalContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaGeral.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#7
    @Override
    public void exitExpressao_logica(GramaticaParser.Expressao_logicaContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaGeral.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#8.1
    @Override
    public void exitInstrucao(GramaticaParser.InstrucaoContext ctx) {
        System.out.println("");
    }

    //#8.2
    @Override
    public void exitInstrucao_declaracao_inteiro(GramaticaParser.Instrucao_declaracao_inteiroContext ctx) {
        if (tabelaGeral.containsKey(ctx.id(0).getText())) {
            System.err.println("Variavel " + ctx.id(0).getText() + " ja existe");
            System.out.println("");
            System.exit(0);
        }
        tabelaInteiro.put(ctx.id(0).getText(), "inteiro");
        tabelaGeral.put(ctx.id(0).getText(), "inteiro");
    }

    //#8.2
    @Override
    public void exitInstrucao_atribuicao_inteiro(GramaticaParser.Instrucao_atribuicao_inteiroContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaInteiro.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe ou nao foi declarada como inteiro");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#8.2
    @Override
    public void exitInstrucao_declaracao_decimal(GramaticaParser.Instrucao_declaracao_decimalContext ctx) {
        if (tabelaGeral.containsKey(ctx.id(0).getText())) {
            System.err.println("Variavel " + ctx.id(0) + " ja existe");
            System.out.println("");
            System.exit(0);
        }
        tabelaDecimal.put(ctx.id(0).getText(), "decimal");
        tabelaGeral.put(ctx.id(0).getText(), "decimal");
    }

    //#8.2
    @Override
    public void exitInstrucao_atribuicao_decimal(GramaticaParser.Instrucao_atribuicao_decimalContext ctx) {
        try {
            for (int i = 0; i < 2; i++) {
                if (!tabelaDecimal.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i) + " nao existe ou nao foi declarada como decimal");
                    System.out.println("");
                    System.exit(0);
                }
            }
        } catch (NullPointerException e) {
            System.out.print("");
        }
    }

    //#8.2
    @Override
    public void exitInstrucao_declaracao_texto(GramaticaParser.Instrucao_declaracao_textoContext ctx) {
        if (tabelaGeral.containsKey(ctx.id(0).getText())) {
            System.err.println("Variavel " + ctx.id(0).getText() + " ja existe");
            System.out.println("");
            System.exit(0);
        }
        tabelaTexto.put(ctx.id(0).getText(), "texto");
        tabelaGeral.put(ctx.id(0).getText(), "texto");
    }
    
    //#8.2
    @Override
    public void exitInstrucao_atribuicao_texto(GramaticaParser.Instrucao_atribuicao_textoContext ctx) {
        try{
            for (int i = 0; i < 2; i++) {
                if (!tabelaTexto.containsKey(ctx.id(i).getText())) {
                    System.err.println("Variavel " + ctx.id(i).getText() + " nao existe");
                    System.out.println("");
                    System.exit(0);
                }
            }
        }catch(NullPointerException e){
            System.out.print("");
        }
    }

    //#8.3
    @Override
    public void enterInstrucao_condicional(GramaticaParser.Instrucao_condicionalContext ctx) {
        System.out.print("if");
    }

    //#8.3
    @Override
    public void exitInstrucao_condicional(GramaticaParser.Instrucao_condicionalContext ctx) {
        System.out.println("}");
    }

    //#8.3
    @Override
    public void enterSenao(GramaticaParser.SenaoContext ctx) {
        if (!ctx.getText().equals("")) {
            System.out.println("} else {");
        }
    }

    //8.3
    @Override
    public void exitSenao(GramaticaParser.SenaoContext ctx) {
        System.out.println("");
    }

    //#8.4
    @Override
    public void exitSeparacao_argumentos(GramaticaParser.Separacao_argumentosContext ctx) {
        System.out.print(";");
    }

    //#8.4
    @Override
    public void enterRepeticao_para(GramaticaParser.Repeticao_paraContext ctx) {
        System.out.print("for");
    }

    //#8.4
    @Override
    public void exitRepeticao_para(GramaticaParser.Repeticao_paraContext ctx) {
        System.out.println("}");
    }

    //#8.4
    @Override
    public void enterRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx) {
        System.out.print("while");
    }

    //#8.4
    @Override
    public void exitRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx) {
        System.out.println("}");
    }

    //#8.4
    @Override
    public void enterMeio_ciclo(GramaticaParser.Meio_cicloContext ctx) {
        System.out.print("} while ");
    }

    //#8.4
    @Override
    public void enterRepeticao_ciclo(GramaticaParser.Repeticao_cicloContext ctx) {
        System.out.println("do{");
    }

    //#8.5
    @Override
    public void enterInstrucao_varredura(GramaticaParser.Instrucao_varreduraContext ctx) {
        System.out.print("Scanner");
    }
    
    @Override
    public void exitInstrucao_varredura(GramaticaParser.Instrucao_varreduraContext ctx){
        if(tabelaGeral.containsKey(ctx.id().getText())){
            System.err.println("Variavel " + ctx.id().getText() + " ja existe");
            System.out.println("");
            System.exit(0);
        }
        tabelaVarredura.put(ctx.id().getText(), "varredura");
        tabelaGeral.put(ctx.id().getText(), "varredura");
    }

    //#8.5
    @Override
    public void enterNova_varredura(GramaticaParser.Nova_varreduraContext ctx) {
        System.out.print(" new Scanner(System.in)");
    }

    //#8.5
    @Override
    public void exitProximo_inteiro(GramaticaParser.Proximo_inteiroContext ctx) {
        if (!tabelaVarredura.containsKey(ctx.id().getText())) {
            System.err.println("Variavel " + ctx.id().getText() + " nao existe ou nao foi declarada como varredura");
            System.out.println("");
            System.exit(0);
        }
        System.out.print(".nextInt()");
    }

    //#8.5
    @Override
    public void exitProximo_decimal(GramaticaParser.Proximo_decimalContext ctx) {
        if (!tabelaVarredura.containsKey(ctx.id().getText())) {
            System.err.println("Variavel " +ctx.id().getText()+ "nao existe ou nao foi declarada como varredura");
            System.out.println("");
            System.exit(0);
        }
        System.out.println(".nextDouble()");
    }

    //#8.5
    @Override
    public void exitProximo_texto(GramaticaParser.Proximo_textoContext ctx) {
        if (!tabelaVarredura.containsKey(ctx.id().getText())) {
            System.err.println("Variavel " + ctx.id().getText() + " nao existe ou nao foi declarada como varredura");
            System.out.println("");
            System.exit(0);
        }
        System.out.println(".nextLine()");
    }

    //#8.6
    @Override
    public void enterInstrucao_imprecao(GramaticaParser.Instrucao_imprecaoContext ctx) {
        System.out.print(" System.out.println(");
    }

    //#8.6
    @Override
    public void exitInstrucao_imprecao(GramaticaParser.Instrucao_imprecaoContext ctx) {
        System.out.print(" );");
    }
}
