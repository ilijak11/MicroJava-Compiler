// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class MultiConstVar extends ConstVarList {

    private ConstVarList ConstVarList;
    private ConstVar ConstVar;

    public MultiConstVar (ConstVarList ConstVarList, ConstVar ConstVar) {
        this.ConstVarList=ConstVarList;
        if(ConstVarList!=null) ConstVarList.setParent(this);
        this.ConstVar=ConstVar;
        if(ConstVar!=null) ConstVar.setParent(this);
    }

    public ConstVarList getConstVarList() {
        return ConstVarList;
    }

    public void setConstVarList(ConstVarList ConstVarList) {
        this.ConstVarList=ConstVarList;
    }

    public ConstVar getConstVar() {
        return ConstVar;
    }

    public void setConstVar(ConstVar ConstVar) {
        this.ConstVar=ConstVar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstVarList!=null) ConstVarList.accept(visitor);
        if(ConstVar!=null) ConstVar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstVarList!=null) ConstVarList.traverseTopDown(visitor);
        if(ConstVar!=null) ConstVar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstVarList!=null) ConstVarList.traverseBottomUp(visitor);
        if(ConstVar!=null) ConstVar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiConstVar(\n");

        if(ConstVarList!=null)
            buffer.append(ConstVarList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstVar!=null)
            buffer.append(ConstVar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiConstVar]");
        return buffer.toString();
    }
}
