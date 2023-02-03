public class Conjunction implements LogicalSentance{

    private LogicalSentance arg1, arg2;
    Conjunction(LogicalSentance _arg1, LogicalSentance _arg2){
        arg1 = _arg1;
        arg2 = _arg2;
    }

    public boolean unsatisfiable(){
        return arg1.unsatisfiable() && arg2.unsatisfiable();
    }
    
    public boolean isValid(){
        return arg1.isValid() && arg2.isValid();
    }
    public boolean evaluate(TruthAssignment ta){
        return arg1.evaluate(ta) && arg2.evaluate(ta);
    }
}
