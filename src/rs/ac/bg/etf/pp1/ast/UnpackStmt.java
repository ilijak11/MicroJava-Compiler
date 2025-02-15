// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class UnpackStmt extends DesignatorStatement {

    private DesignatorStatementUnpackList DesignatorStatementUnpackList;
    private Designator Designator;

    public UnpackStmt (DesignatorStatementUnpackList DesignatorStatementUnpackList, Designator Designator) {
        this.DesignatorStatementUnpackList=DesignatorStatementUnpackList;
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
    }

    public DesignatorStatementUnpackList getDesignatorStatementUnpackList() {
        return DesignatorStatementUnpackList;
    }

    public void setDesignatorStatementUnpackList(DesignatorStatementUnpackList DesignatorStatementUnpackList) {
        this.DesignatorStatementUnpackList=DesignatorStatementUnpackList;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementUnpackList!=null) DesignatorStatementUnpackList.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnpackStmt(\n");

        if(DesignatorStatementUnpackList!=null)
            buffer.append(DesignatorStatementUnpackList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnpackStmt]");
        return buffer.toString();
    }
}
