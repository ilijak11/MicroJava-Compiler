// generated with ast extension for cup
// version 0.8
// 21/1/2023 18:42:18


package rs.ac.bg.etf.pp1.ast;

public class RelOpLTE extends RelOp {

    public RelOpLTE () {
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
        buffer.append("RelOpLTE(\n");

        buffer.append(tab);
        buffer.append(") [RelOpLTE]");
        return buffer.toString();
    }
}
