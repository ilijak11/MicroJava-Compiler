// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class SingleFormalParam extends FormalParList {

    private FormalPar FormalPar;

    public SingleFormalParam (FormalPar FormalPar) {
        this.FormalPar=FormalPar;
        if(FormalPar!=null) FormalPar.setParent(this);
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
        if(FormalPar!=null) FormalPar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalPar!=null) FormalPar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalPar!=null) FormalPar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleFormalParam(\n");

        if(FormalPar!=null)
            buffer.append(FormalPar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleFormalParam]");
        return buffer.toString();
    }
}
