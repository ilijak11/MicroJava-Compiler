// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class ConstVarDecl extends ConstDecl {

    private Type Type;
    private ConstVarList ConstVarList;

    public ConstVarDecl (Type Type, ConstVarList ConstVarList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstVarList=ConstVarList;
        if(ConstVarList!=null) ConstVarList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstVarList getConstVarList() {
        return ConstVarList;
    }

    public void setConstVarList(ConstVarList ConstVarList) {
        this.ConstVarList=ConstVarList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstVarList!=null) ConstVarList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstVarList!=null) ConstVarList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstVarList!=null) ConstVarList.traverseBottomUp(visitor);
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

        if(ConstVarList!=null)
            buffer.append(ConstVarList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstVarDecl]");
        return buffer.toString();
    }
}
