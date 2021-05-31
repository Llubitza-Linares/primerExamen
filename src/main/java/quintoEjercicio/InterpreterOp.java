package quintoEjercicio;

import java.util.ArrayList;
import java.util.List;

public class InterpreterOp extends AbstractExpresion{

    private List<AbstractExpresion>parseTree=new ArrayList<>();
    private ContextOp context;

    public InterpreterOp (String word){
        this.interpretacion;
    }

    public void interpretacion(String words){
        String input =words;
        context= new ContextOp(input.replace("",""));
        for (String word: input.split("")){
            switch(word){
                case "sumar":
                    parseTree.add(new TerminalExpSuma(word.length()));
                    break;
                case "restar":
                    parseTree.add(new TerminalExpResta(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpNumber(word.length()));
                    break;
            }
        }
    }
    @Override
    public void interpretar(ContextOp context) {
        for (AbstractExpresion terminalExpresion: parseTree){
            terminalExpresion.interpretar(context);
        }
        return context.output;
    }

    @Override
    public void interpreter (ContextOp context){

    }
}
