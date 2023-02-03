public class BasicLogicalSentence implements LogicalSentance{

    private String pc;

    BasicLogicalSentence(String s){
        pc = s;
    }

    public boolean isValid(){
        return false;
    }

    public boolean evaluate(TruthAssignment ta){
        return ta.get(pc);
    }

    public boolean unsatisfiable(){
        return false;
    }
}
