// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public class AddOpExpression extends BaseExpr {

    private BaseExpr BaseExpr;
    private AddOp AddOp;
    private Term Term;

    public AddOpExpression (BaseExpr BaseExpr, AddOp AddOp, Term Term) {
        this.BaseExpr=BaseExpr;
        if(BaseExpr!=null) BaseExpr.setParent(this);
        this.AddOp=AddOp;
        if(AddOp!=null) AddOp.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public BaseExpr getBaseExpr() {
        return BaseExpr;
    }

    public void setBaseExpr(BaseExpr BaseExpr) {
        this.BaseExpr=BaseExpr;
    }

    public AddOp getAddOp() {
        return AddOp;
    }

    public void setAddOp(AddOp AddOp) {
        this.AddOp=AddOp;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BaseExpr!=null) BaseExpr.accept(visitor);
        if(AddOp!=null) AddOp.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BaseExpr!=null) BaseExpr.traverseTopDown(visitor);
        if(AddOp!=null) AddOp.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BaseExpr!=null) BaseExpr.traverseBottomUp(visitor);
        if(AddOp!=null) AddOp.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AddOpExpression(\n");

        if(BaseExpr!=null)
            buffer.append(BaseExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddOp!=null)
            buffer.append(AddOp.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AddOpExpression]");
        return buffer.toString();
    }
}
