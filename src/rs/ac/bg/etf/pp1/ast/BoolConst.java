// generated with ast extension for cup
// version 0.8
// 27/1/2023 18:53:9


package rs.ac.bg.etf.pp1.ast;

public class BoolConst extends ConstVal {

    private BoolConstVal BoolConstVal;

    public BoolConst (BoolConstVal BoolConstVal) {
        this.BoolConstVal=BoolConstVal;
        if(BoolConstVal!=null) BoolConstVal.setParent(this);
    }

    public BoolConstVal getBoolConstVal() {
        return BoolConstVal;
    }

    public void setBoolConstVal(BoolConstVal BoolConstVal) {
        this.BoolConstVal=BoolConstVal;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BoolConstVal!=null) BoolConstVal.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BoolConstVal!=null) BoolConstVal.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BoolConstVal!=null) BoolConstVal.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolConst(\n");

        if(BoolConstVal!=null)
            buffer.append(BoolConstVal.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolConst]");
        return buffer.toString();
    }
}
