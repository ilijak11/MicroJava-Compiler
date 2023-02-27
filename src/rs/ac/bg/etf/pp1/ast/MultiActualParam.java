// generated with ast extension for cup
// version 0.8
// 27/1/2023 18:53:9


package rs.ac.bg.etf.pp1.ast;

public class MultiActualParam extends ActualParList {

    private ActualParList ActualParList;
    private Expr Expr;

    public MultiActualParam (ActualParList ActualParList, Expr Expr) {
        this.ActualParList=ActualParList;
        if(ActualParList!=null) ActualParList.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public ActualParList getActualParList() {
        return ActualParList;
    }

    public void setActualParList(ActualParList ActualParList) {
        this.ActualParList=ActualParList;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActualParList!=null) ActualParList.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActualParList!=null) ActualParList.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActualParList!=null) ActualParList.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiActualParam(\n");

        if(ActualParList!=null)
            buffer.append(ActualParList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiActualParam]");
        return buffer.toString();
    }
}
