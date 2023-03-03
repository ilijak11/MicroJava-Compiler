// generated with ast extension for cup
// version 0.8
// 3/2/2023 14:45:11


package rs.ac.bg.etf.pp1.ast;

public class RelOpLT extends RelOp {

    public RelOpLT () {
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
        buffer.append("RelOpLT(\n");

        buffer.append(tab);
        buffer.append(") [RelOpLT]");
        return buffer.toString();
    }
}
