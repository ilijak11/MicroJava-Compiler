// generated with ast extension for cup
// version 0.8
// 20/1/2023 18:13:27


package rs.ac.bg.etf.pp1.ast;

public class BoolConstFalse extends ConstVal {

    public BoolConstFalse () {
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
        buffer.append("BoolConstFalse(\n");

        buffer.append(tab);
        buffer.append(") [BoolConstFalse]");
        return buffer.toString();
    }
}
