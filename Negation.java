public class Negation{

    LogicalSentance theRestOfIt;

    private LogicalSentance arg;
    Negation(LogicalSentance _arg){
        arg = _arg;
    }
    
    boolean unsatisfiable(){
        return arg.isValid();
    }
    boolean isValid(){
            return arg.unsatisfiable();
    }
    boolean evaluate(TruthAssignment ta){
        return !theRestOfIt.evaluate(ta);
    }
}