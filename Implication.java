public class Implication{
    private LogicalSentance arg1, arg2;
    Implication(LogicalSentance _arg1, LogicalSentance _arg2){
        arg1 = _arg1;
        arg2 = _arg2;
    }

    public boolean unsatisfiable(){
        LogicalSentance allMyPCs = new Conjunction(arg1, arg2);
        for(TruthAssignment e: allTruthAssignments(allMyPCs)){
            if(arg1.evaluate(e) && !arg2.evaluate(e)){
                return false;
            }
            
        }
    }
    
    public boolean isValid(){
        return arg1.isValid() || !arg2.isValid();
    }
    public boolean evaluate(TruthAssignment ta){
        return arg1.evaluate(ta) || !arg2.evaluate(ta);
    }
}