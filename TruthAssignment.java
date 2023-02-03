import java.util.HashMap;

public class TruthAssignment {

    private HashMap<String,Boolean> theRep;

    TruthAssignment(){
        theRep = new HashMap<String,Boolean>();
    }

    public int size(){
        return theRep.size();
    }

    void put(String so, boolean v){
        theRep.put(so, v);
    }

    boolean get(String so){
        return theRep.get(so);
    }
}
