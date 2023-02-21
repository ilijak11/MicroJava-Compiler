// generated with ast extension for cup
// version 0.8
// 21/1/2023 18:42:18


package rs.ac.bg.etf.pp1.ast;

public class FormalParams extends FormalPars {

    private FormalParList FormalParList;

    public FormalParams (FormalParList FormalParList) {
        this.FormalParList=FormalParList;
        if(FormalParList!=null) FormalParList.setParent(this);
    }

    public FormalParList getFormalParList() {
        return FormalParList;
    }

    public void setFormalParList(FormalParList FormalParList) {
        this.FormalParList=FormalParList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalParList!=null) FormalParList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalParList!=null) FormalParList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalParList!=null) FormalParList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormalParams(\n");

        if(FormalParList!=null)
            buffer.append(FormalParList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormalParams]");
        return buffer.toString();
    }
}
