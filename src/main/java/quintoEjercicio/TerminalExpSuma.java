package quintoEjercicio;

public class TerminalExpSuma  extends AbstractExpresion{

    public TerminalExpSuma(int amountDigit){
        this.amountDigit=amountDigit;
    }
    @Override
    public void interpretar(ContextOp context) {

        if(context.input.startsWith("suma")){
            context.signo=-1;
            context.input= context.input.substring(this.amountDigit);
        }
    }
}
