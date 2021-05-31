package quintoEjercicio;

public class TerminalExpNumber extends AbstractExpresion{

    public TerminalExpNumber(int amountDigit){
        this.amountDigit=amountDigit;
    }
    @Override
    public void interpretar(ContextOp context) {
        context.output=context.output+Integer.parseInt(context.input.substring(0, this.amountDigit));
        context.input=context.input.substring(this.amountDigit);

    }
}
