// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class SingleTermCondition extends Condition {

    private ConditionTerm ConditionTerm;

    public SingleTermCondition (ConditionTerm ConditionTerm) {
        this.ConditionTerm=ConditionTerm;
        if(ConditionTerm!=null) ConditionTerm.setParent(this);
    }

    public ConditionTerm getConditionTerm() {
        return ConditionTerm;
    }

    public void setConditionTerm(ConditionTerm ConditionTerm) {
        this.ConditionTerm=ConditionTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionTerm!=null) ConditionTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionTerm!=null) ConditionTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionTerm!=null) ConditionTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleTermCondition(\n");

        if(ConditionTerm!=null)
            buffer.append(ConditionTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleTermCondition]");
        return buffer.toString();
    }
}
