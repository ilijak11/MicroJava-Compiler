// generated with ast extension for cup
// version 0.8
// 27/1/2023 18:53:9


package rs.ac.bg.etf.pp1.ast;

public class RelOpGT extends RelOp {

    public RelOpGT () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RelOpGT(\n");

        buffer.append(tab);
        buffer.append(") [RelOpGT]");
        return buffer.toString();
    }
}
