public interface LogicalSentance {
    boolean isValid();
    boolean evaluate(TruthAssignment ta);
    boolean unsatisfiable();
}
