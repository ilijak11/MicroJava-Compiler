// generated with ast extension for cup
// version 0.8
// 20/1/2023 18:13:27


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Type Type);
    public void visit(GlobalDecl GlobalDecl);
    public void visit(ConstVar ConstVar);
    public void visit(GlobalDeclList GlobalDeclList);
    public void visit(ConstVal ConstVal);
    public void visit(ConstVars ConstVars);
    public void visit(ConstDecl ConstDecl);
    public void visit(Vars Vars);
    public void visit(Var Var);
    public void visit(TypeCustom TypeCustom);
    public void visit(TypeVoid TypeVoid);
    public void visit(TypeBool TypeBool);
    public void visit(TypeChar TypeChar);
    public void visit(TypeInt TypeInt);
    public void visit(BoolConstFalse BoolConstFalse);
    public void visit(BoolConstTrue BoolConstTrue);
    public void visit(CharConst CharConst);
    public void visit(NumericConst NumericConst);
    public void visit(ConstVarScalar ConstVarScalar);
    public void visit(SingleConstVar SingleConstVar);
    public void visit(MultiConstVar MultiConstVar);
    public void visit(VarArray VarArray);
    public void visit(VarScalar VarScalar);
    public void visit(SingleVar SingleVar);
    public void visit(MultiVar MultiVar);
    public void visit(ConstVarDecl ConstVarDecl);
    public void visit(VarDecl VarDecl);
    public void visit(GlobalConstDecl GlobalConstDecl);
    public void visit(GlobalVarDecl GlobalVarDecl);
    public void visit(NoDecls NoDecls);
    public void visit(GlobalDecls GlobalDecls);
    public void visit(Prog Prog);

}
