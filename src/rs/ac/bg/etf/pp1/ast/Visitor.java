// generated with ast extension for cup
// version 0.8
// 3/2/2023 15:36:3


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(MethodDecl MethodDecl);
    public void visit(MatchedStatement MatchedStatement);
    public void visit(DesignatorStatementUnpackPart DesignatorStatementUnpackPart);
    public void visit(Var Var);
    public void visit(StatementList StatementList);
    public void visit(ConditionTerm ConditionTerm);
    public void visit(DesignatorStatementUnpackList DesignatorStatementUnpackList);
    public void visit(Factor Factor);
    public void visit(VarList VarList);
    public void visit(Designator Designator);
    public void visit(FormalParList FormalParList);
    public void visit(Term Term);
    public void visit(Condition Condition);
    public void visit(MulOp MulOp);
    public void visit(RelOp RelOp);
    public void visit(ConstVar ConstVar);
    public void visit(GlobalDeclList GlobalDeclList);
    public void visit(VarDeclList VarDeclList);
    public void visit(ConstVal ConstVal);
    public void visit(Expr Expr);
    public void visit(FormalPar FormalPar);
    public void visit(AddOp AddOp);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(FormalPars FormalPars);
    public void visit(ActualPars ActualPars);
    public void visit(UnmatchedStatement UnmatchedStatement);
    public void visit(BoolConstVal BoolConstVal);
    public void visit(BaseExpr BaseExpr);
    public void visit(Statement Statement);
    public void visit(ReturnExpr ReturnExpr);
    public void visit(ConstVarList ConstVarList);
    public void visit(ClassDecl ClassDecl);
    public void visit(ConstDecl ConstDecl);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(ConditionFactor ConditionFactor);
    public void visit(GlobalDecl GlobalDecl);
    public void visit(ActualParList ActualParList);
    public void visit(PrintExpr PrintExpr);
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
    public void visit(GroupedFactor GroupedFactor);
    public void visit(NewArrayFactor NewArrayFactor);
    public void visit(BoolConstFactor BoolConstFactor);
    public void visit(CharConstFactor CharConstFactor);
    public void visit(NumConstFactor NumConstFactor);
    public void visit(FuncCallFactor FuncCallFactor);
    public void visit(DesignatorFactor DesignatorFactor);
    public void visit(SingleTerm SingleTerm);
    public void visit(MulOpTerm MulOpTerm);
    public void visit(SingleTermExpression SingleTermExpression);
    public void visit(AddOpExpression AddOpExpression);
    public void visit(NegatedExpression NegatedExpression);
    public void visit(Expression Expression);
    public void visit(SingleFactor SingleFactor);
    public void visit(MultiFactor MultiFactor);
    public void visit(SingleFactorTermCondition SingleFactorTermCondition);
    public void visit(MultiFactorTermCondition MultiFactorTermCondition);
    public void visit(SingleTermCondition SingleTermCondition);
    public void visit(MultiTermCondition MultiTermCondition);
    public void visit(SingleActualParam SingleActualParam);
    public void visit(MultiActualParam MultiActualParam);
    public void visit(NoActualParamList NoActualParamList);
    public void visit(ActualParamList ActualParamList);
    public void visit(PrintExprNoWidth PrintExprNoWidth);
    public void visit(PrintExprWidth PrintExprWidth);
    public void visit(NoRetExpr NoRetExpr);
    public void visit(RetExpr RetExpr);
    public void visit(ArrayDesignator ArrayDesignator);
    public void visit(VarDesignator VarDesignator);
    public void visit(NoDesignatorPart NoDesignatorPart);
    public void visit(DesignatorPart DesignatorPart);
    public void visit(UnpackSingle UnpackSingle);
    public void visit(UnpackList UnpackList);
    public void visit(UnpackStmt UnpackStmt);
    public void visit(DecStmt DecStmt);
    public void visit(IncStmt IncStmt);
    public void visit(FuncCallStmt FuncCallStmt);
    public void visit(AssignStmt AssignStmt);
    public void visit(MatchedStatementDerived1 MatchedStatementDerived1);
    public void visit(MultiStmt MultiStmt);
    public void visit(IfElseStmt IfElseStmt);
    public void visit(ForeachStmt ForeachStmt);
    public void visit(PrintStmt PrintStmt);
    public void visit(ReadStmt ReadStmt);
    public void visit(ReturnStmt ReturnStmt);
    public void visit(ContinueStmt ContinueStmt);
    public void visit(BreakStmt BreakStmt);
    public void visit(WhileStmt WhileStmt);
    public void visit(DesignatorStmt DesignatorStmt);
    public void visit(UnmatchedIfElseStmt UnmatchedIfElseStmt);
    public void visit(UnmatchedIfStmt UnmatchedIfStmt);
    public void visit(UnmatchedStmt UnmatchedStmt);
    public void visit(MatchedStmt MatchedStmt);
    public void visit(NoStmt NoStmt);
    public void visit(StmtList StmtList);
    public void visit(FormalParam FormalParam);
    public void visit(SingleFormalParam SingleFormalParam);
    public void visit(MultiFormalParam MultiFormalParam);
    public void visit(NoFormalParamList NoFormalParamList);
    public void visit(FormalParamList FormalParamList);
    public void visit(VoidMethodDecl VoidMethodDecl);
    public void visit(TypedMethodDecl TypedMethodDecl);
    public void visit(NoVars NoVars);
    public void visit(VarDecls VarDecls);
    public void visit(NoMethods NoMethods);
    public void visit(MethodDecls MethodDecls);
    public void visit(BoolConstFalse BoolConstFalse);
    public void visit(BoolConstTrue BoolConstTrue);
    public void visit(Type Type);
    public void visit(ConstValDerived1 ConstValDerived1);
    public void visit(BoolConst BoolConst);
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
    public void visit(ConstructorDecl ConstructorDecl);
    public void visit(ExtendedClassWithMethodsDecl ExtendedClassWithMethodsDecl);
    public void visit(ExtendedClassNoMethodsDecl ExtendedClassNoMethodsDecl);
    public void visit(BaseClassWithMethodsDecl BaseClassWithMethodsDecl);
    public void visit(BaseClassNoMethodsDecl BaseClassNoMethodsDecl);
    public void visit(GlobalClassDecl GlobalClassDecl);
    public void visit(GlobalConstDecl GlobalConstDecl);
    public void visit(GlobalVarDecl GlobalVarDecl);
    public void visit(NoDeclsGlobal NoDeclsGlobal);
    public void visit(GlobalDecls GlobalDecls);
    public void visit(Prog Prog);

}
