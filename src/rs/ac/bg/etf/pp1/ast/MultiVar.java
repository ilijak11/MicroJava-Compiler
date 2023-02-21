// generated with ast extension for cup
// version 0.8
// 21/1/2023 18:42:18


package rs.ac.bg.etf.pp1.ast;

public class MultiVar extends Vars {

    private Vars Vars;
    private Var Var;

    public MultiVar (Vars Vars, Var Var) {
        this.Vars=Vars;
        if(Vars!=null) Vars.setParent(this);
        this.Var=Var;
        if(Var!=null) Var.setParent(this);
    }

    public Vars getVars() {
        return Vars;
    }

    public void setVars(Vars Vars) {
        this.Vars=Vars;
    }

    public Var getVar() {
        return Var;
    }

    public void setVar(Var Var) {
        this.Var=Var;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Vars!=null) Vars.accept(visitor);
        if(Var!=null) Var.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Vars!=null) Vars.traverseTopDown(visitor);
        if(Var!=null) Var.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Vars!=null) Vars.traverseBottomUp(visitor);
        if(Var!=null) Var.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiVar(\n");

        if(Vars!=null)
            buffer.append(Vars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Var!=null)
            buffer.append(Var.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiVar]");
        return buffer.toString();
    }
}
