// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class ActualParamList extends ActualPars {

    private ActualParList ActualParList;

    public ActualParamList (ActualParList ActualParList) {
        this.ActualParList=ActualParList;
        if(ActualParList!=null) ActualParList.setParent(this);
    }

    public ActualParList getActualParList() {
        return ActualParList;
    }

    public void setActualParList(ActualParList ActualParList) {
        this.ActualParList=ActualParList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActualParList!=null) ActualParList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActualParList!=null) ActualParList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActualParList!=null) ActualParList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActualParamList(\n");

        if(ActualParList!=null)
            buffer.append(ActualParList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActualParamList]");
        return buffer.toString();
    }
}
