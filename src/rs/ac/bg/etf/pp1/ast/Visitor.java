// generated with ast extension for cup
// version 0.8
// 21/1/2023 18:42:18


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(MethodDecl MethodDecl);
    public void visit(FormalParList FormalParList);
    public void visit(GlobalDeclList GlobalDeclList);
    public void visit(Var Var);
    public void visit(ConstDecl ConstDecl);
    public void visit(MulOp MulOp);
    public void visit(ReturnExpr ReturnExpr);
    public void visit(UnmatchedStatement UnmatchedStatement);
    public void visit(Expr Expr);
    public void visit(FormalPar FormalPar);
    public void visit(ConstVars ConstVars);
    public void visit(ConstVar ConstVar);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(Statement Statement);
    public void visit(VarDecls VarDecls);
    public void visit(FormalPars FormalPars);
    public void visit(AddOp AddOp);
    public void visit(Vars Vars);
    public void visit(ConstVal ConstVal);
    public void visit(MatchedStatement MatchedStatement);
    public void visit(ConditionFactor ConditionFactor);
    public void visit(Condition Condition);
    public void visit(RelOp RelOp);
    public void visit(ConditionTerm ConditionTerm);
    public void visit(StatementList StatementList);
    public void visit(GlobalDecl GlobalDecl);
    public void visit(MulOpMod MulOpMod);
    public void visit(MulOpDiv MulOpDiv);
    public void visit(MulOpTimes MulOpTimes);
    public void visit(AddOpMinus AddOpMinus);
    public void visit(AddOpPlus AddOpPlus);
    public void visit(RelOpLTE RelOpLTE);
    public void visit(RelOpLT RelOpLT);
    public void visit(RelOpGTE RelOpGTE);
    public void visit(RelOpGT RelOpGT);
    public void visit(RelOpNotEqual RelOpNotEqual);
    public void visit(RelOpEqual RelOpEqual);
    public void visit(AssignOp AssignOp);
    public void visit(ExprVar ExprVar);
    public void visit(SingleFactor SingleFactor);
    public void visit(MultiFactor MultiFactor);
    public void visit(SingleFactorTermCondition SingleFactorTermCondition);
    public void visit(MultiFactorTermCondition MultiFactorTermCondition);
    public void visit(SingleTermCondition SingleTermCondition);
    public void visit(MultiTermCondition MultiTermCondition);
    public void visit(NoRetExpr NoRetExpr);
    public void visit(RetExpr RetExpr);
    public void visit(MultiStmt MultiStmt);
    public void visit(IfElseStmt IfElseStmt);
    public void visit(ReturnStmt ReturnStmt);
    public void visit(ContinueStmt ContinueStmt);
    public void visit(BreakStmt BreakStmt);
    public void visit(WhileStmt WhileStmt);
    public void visit(UnmatchedIfElseStmt UnmatchedIfElseStmt);
    public void visit(UnmatchedIfStmt UnmatchedIfStmt);
    public void visit(UnmatchedStmt UnmatchedStmt);
    public void visit(MatchedStmt MatchedStmt);
    public void visit(NoStmt NoStmt);
    public void visit(StmtList StmtList);
    public void visit(FormalParam FormalParam);
    public void visit(SingleFormalParam SingleFormalParam);
    public void visit(MultiFormalParam MultiFormalParam);
    public void visit(NoFormalParams NoFormalParams);
    public void visit(FormalParams FormalParams);
    public void visit(VoidMethodDecl VoidMethodDecl);
    public void visit(TypedMethodDecl TypedMethodDecl);
    public void visit(NoVars NoVars);
    public void visit(VarDeclList VarDeclList);
    public void visit(NoMethods NoMethods);
    public void visit(MethodDecls MethodDecls);
    public void visit(Type Type);
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
    public void visit(NoDeclsGlobal NoDeclsGlobal);
    public void visit(GlobalDecls GlobalDecls);
    public void visit(Prog Prog);

}
