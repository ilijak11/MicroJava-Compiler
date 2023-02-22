// generated with ast extension for cup
// version 0.8
// 22/1/2023 19:2:10


package rs.ac.bg.etf.pp1.ast;

public class UnpackSingle extends DesignatorStatementUnpackList {

    private DesignatorStatementUnpackPart DesignatorStatementUnpackPart;

    public UnpackSingle (DesignatorStatementUnpackPart DesignatorStatementUnpackPart) {
        this.DesignatorStatementUnpackPart=DesignatorStatementUnpackPart;
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.setParent(this);
    }

    public DesignatorStatementUnpackPart getDesignatorStatementUnpackPart() {
        return DesignatorStatementUnpackPart;
    }

    public void setDesignatorStatementUnpackPart(DesignatorStatementUnpackPart DesignatorStatementUnpackPart) {
        this.DesignatorStatementUnpackPart=DesignatorStatementUnpackPart;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnpackSingle(\n");

        if(DesignatorStatementUnpackPart!=null)
            buffer.append(DesignatorStatementUnpackPart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnpackSingle]");
        return buffer.toString();
    }
}
