package examenFilaBRecuperacion.quintoEjercicio;

import java.util.ArrayList;
import java.util.List;
public class NonTerminal extends AbsNumero{


    private List<AbsNumero> parseTree= new ArrayList<>();
    private ContextRomano context;

    public NonTerminal(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextRomano(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "I":
                    parseTree.add(new Term1());
                    break;
                case "II":
                    parseTree.add(new Term2());
                    break;
                case "III":
                    parseTree.add(new Term3());
                    break;
                case "IV":
                    parseTree.add(new Term4());
                    break;
                case "V":
                    parseTree.add(new Term5());
                    break;
                case "VI":
                    parseTree.add(new Term6());
                    break;
                case "VII":
                    parseTree.add(new Term7());
                    break;
                case "VIII":
                    parseTree.add(new Term8());
                    break;
                case "IX":
                    parseTree.add(new Term9());
                    break;
                case "X":
                    parseTree.add(new Term10());
                    break;

                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (AbsNumero terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }



    @Override
    public void interpreter(ContextRomano context) {

    }

}