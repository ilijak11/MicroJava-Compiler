// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class MultiFormalParam extends FormalParList {

    private FormalParList FormalParList;
    private FormalPar FormalPar;

    public MultiFormalParam (FormalParList FormalParList, FormalPar FormalPar) {
        this.FormalParList=FormalParList;
        if(FormalParList!=null) FormalParList.setParent(this);
        this.FormalPar=FormalPar;
        if(FormalPar!=null) FormalPar.setParent(this);
    }

    public FormalParList getFormalParList() {
        return FormalParList;
    }

    public void setFormalParList(FormalParList FormalParList) {
        this.FormalParList=FormalParList;
    }

    public FormalPar getFormalPar() {
        return FormalPar;
    }

    public void setFormalPar(FormalPar FormalPar) {
        this.FormalPar=FormalPar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalParList!=null) FormalParList.accept(visitor);
        if(FormalPar!=null) FormalPar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalParList!=null) FormalParList.traverseTopDown(visitor);
        if(FormalPar!=null) FormalPar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalParList!=null) FormalParList.traverseBottomUp(visitor);
        if(FormalPar!=null) FormalPar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiFormalParam(\n");

        if(FormalParList!=null)
            buffer.append(FormalParList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormalPar!=null)
            buffer.append(FormalPar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiFormalParam]");
        return buffer.toString();
    }
}
