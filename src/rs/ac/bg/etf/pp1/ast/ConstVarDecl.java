// generated with ast extension for cup
// version 0.8
// 20/1/2023 18:13:27


package rs.ac.bg.etf.pp1.ast;

public class ConstVarDecl extends ConstDecl {

    private Type Type;
    private ConstVars ConstVars;

    public ConstVarDecl (Type Type, ConstVars ConstVars) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstVars=ConstVars;
        if(ConstVars!=null) ConstVars.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstVars getConstVars() {
        return ConstVars;
    }

    public void setConstVars(ConstVars ConstVars) {
        this.ConstVars=ConstVars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstVars!=null) ConstVars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstVars!=null) ConstVars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstVars!=null) ConstVars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstVarDecl(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstVars!=null)
            buffer.append(ConstVars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstVarDecl]");
        return buffer.toString();
    }
}
