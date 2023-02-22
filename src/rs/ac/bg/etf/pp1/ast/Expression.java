// generated with ast extension for cup
// version 0.8
// 22/1/2023 19:2:10


package rs.ac.bg.etf.pp1.ast;

public class Expression extends Expr {

    private BaseExpr BaseExpr;

    public Expression (BaseExpr BaseExpr) {
        this.BaseExpr=BaseExpr;
        if(BaseExpr!=null) BaseExpr.setParent(this);
    }

    public BaseExpr getBaseExpr() {
        return BaseExpr;
    }

    public void setBaseExpr(BaseExpr BaseExpr) {
        this.BaseExpr=BaseExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BaseExpr!=null) BaseExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BaseExpr!=null) BaseExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BaseExpr!=null) BaseExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Expression(\n");

        if(BaseExpr!=null)
            buffer.append(BaseExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Expression]");
        return buffer.toString();
    }
}
