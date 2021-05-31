package quintoEjercicio;

public class TerminalExpResta extends AbstractExpresion{

    public TerminalExpResta(int amountDigit){
        this.amountDigit=amountDigit;
    }
    @Override
    public void interpretar(ContextOp context) {

        if(context.input.startsWith("restar")){
            context.signo=-1;
            context.input= context.input.substring(this.amountDigit);
        }


    }
}
