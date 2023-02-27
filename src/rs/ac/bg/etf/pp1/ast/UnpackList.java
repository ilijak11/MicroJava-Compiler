// generated with ast extension for cup
// version 0.8
// 27/1/2023 18:53:9


package rs.ac.bg.etf.pp1.ast;

public class UnpackList extends DesignatorStatementUnpackList {

    private DesignatorStatementUnpackList DesignatorStatementUnpackList;
    private DesignatorStatementUnpackPart DesignatorStatementUnpackPart;

    public UnpackList (DesignatorStatementUnpackList DesignatorStatementUnpackList, DesignatorStatementUnpackPart DesignatorStatementUnpackPart) {
        this.DesignatorStatementUnpackList=DesignatorStatementUnpackList;
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.setParent(this);
        this.DesignatorStatementUnpackPart=DesignatorStatementUnpackPart;
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.setParent(this);
    }

    public DesignatorStatementUnpackList getDesignatorStatementUnpackList() {
        return DesignatorStatementUnpackList;
    }

    public void setDesignatorStatementUnpackList(DesignatorStatementUnpackList DesignatorStatementUnpackList) {
        this.DesignatorStatementUnpackList=DesignatorStatementUnpackList;
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
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.accept(visitor);
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.traverseTopDown(visitor);
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.traverseBottomUp(visitor);
        if(DesignatorStatementUnpackPart!=null) DesignatorStatementUnpackPart.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnpackList(\n");

        if(DesignatorStatementUnpackList!=null)
            buffer.append(DesignatorStatementUnpackList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatementUnpackPart!=null)
            buffer.append(DesignatorStatementUnpackPart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnpackList]");
        return buffer.toString();
    }
}
