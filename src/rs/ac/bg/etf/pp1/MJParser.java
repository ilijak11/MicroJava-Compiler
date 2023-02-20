
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Feb 20 18:13:27 CET 2023
//----------------------------------------------------

package rs.ac.bg.etf.pp1;

import java_cup.runtime.*;
import org.apache.log4j.*;
import rs.ac.bg.etf.pp1.ast.*;

/** CUP v0.10k generated parser.
  * @version Mon Feb 20 18:13:27 CET 2023
  */
public class MJParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MJParser() {super();}

  /** Constructor which sets the default scanner. */
  public MJParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\003\007\000\002\002\004\000\002\004" +
    "\004\000\002\004\002\000\002\005\003\000\002\005\003" +
    "\000\002\006\005\000\002\007\006\000\002\012\005\000" +
    "\002\012\003\000\002\011\003\000\002\011\005\000\002" +
    "\014\005\000\002\014\003\000\002\013\005\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\015\003" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\004\004\004\001\002\000\004\064\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\020\021\ufffe\022\ufffe\023\ufffe\024\ufffe\055\ufffe\060" +
    "\ufffe\064\ufffe\001\002\000\020\021\013\022\022\023\015" +
    "\024\016\055\012\060\023\064\014\001\002\000\004\064" +
    "\043\001\002\000\004\056\041\001\002\000\004\064\uffee" +
    "\001\002\000\004\064\uffea\001\002\000\004\064\uffec\001" +
    "\002\000\004\064\uffeb\001\002\000\020\021\ufffd\022\ufffd" +
    "\023\ufffd\024\ufffd\055\ufffd\060\ufffd\064\ufffd\001\002\000" +
    "\020\021\uffff\022\uffff\023\uffff\024\uffff\055\uffff\060\uffff" +
    "\064\uffff\001\002\000\020\021\ufffc\022\ufffc\023\ufffc\024" +
    "\ufffc\055\ufffc\060\ufffc\064\ufffc\001\002\000\004\064\uffed" +
    "\001\002\000\014\021\013\022\022\023\015\024\016\064" +
    "\014\001\002\000\004\064\026\001\002\000\006\045\ufff4" +
    "\047\ufff4\001\002\000\004\044\033\001\002\000\006\045" +
    "\031\047\030\001\002\000\004\064\026\001\002\000\020" +
    "\021\ufffa\022\ufffa\023\ufffa\024\ufffa\055\ufffa\060\ufffa\064" +
    "\ufffa\001\002\000\006\045\ufff5\047\ufff5\001\002\000\012" +
    "\061\035\062\036\065\034\067\040\001\002\000\006\045" +
    "\ufff2\047\ufff2\001\002\000\006\045\ufff0\047\ufff0\001\002" +
    "\000\006\045\uffef\047\uffef\001\002\000\006\045\ufff3\047" +
    "\ufff3\001\002\000\006\045\ufff1\047\ufff1\001\002\000\004" +
    "\002\001\001\002\000\006\045\050\047\047\001\002\000" +
    "\010\045\ufff7\047\ufff7\053\045\001\002\000\006\045\ufff8" +
    "\047\ufff8\001\002\000\004\054\046\001\002\000\006\045" +
    "\ufff6\047\ufff6\001\002\000\004\064\043\001\002\000\020" +
    "\021\ufffb\022\ufffb\023\ufffb\024\ufffb\055\ufffb\060\ufffb\064" +
    "\ufffb\001\002\000\006\045\ufff9\047\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\004\003\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\012\005\017\006\016\007\020\010\010\001\001\000" +
    "\006\011\043\012\041\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\023\001\001\000\006\013" +
    "\024\014\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\036\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\050\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MJParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MJParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MJParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {

	Symbol s = this.getScanner().next_token();
	if (s != null && s.value != null) 
		log.info(s.toString() + " " + s.value.toString());
	return s;

    }



	Logger log = Logger.getLogger(getClass());
   
   
    // slede redefinisani metodi za prijavu gresaka radi izmene teksta poruke
     
    public void report_fatal_error(String message, Object info) throws java.lang.Exception {
      done_parsing();
      report_error(message, info);
    }
  
    public void syntax_error(Symbol cur_token) {
        report_error("\nSintaksna greska", cur_token);
    }
  
    public void unrecovered_syntax_error(Symbol cur_token) throws java.lang.Exception {
        report_fatal_error("Fatalna greska, parsiranje se ne moze nastaviti", cur_token);
    }

    public void report_error(String message, Object info) {
    	StringBuilder msg = new StringBuilder(message); 
    	if (info instanceof Symbol)
            msg.append (" na liniji ").append(((Symbol)info).left);
        log.error(msg.toString());
    }



}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MJParser$actions {
  private final MJParser parser;

  /** Constructor */
  CUP$MJParser$actions(MJParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MJParser$do_action(
    int                        CUP$MJParser$act_num,
    java_cup.runtime.lr_parser CUP$MJParser$parser,
    java.util.Stack            CUP$MJParser$stack,
    int                        CUP$MJParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MJParser$result;

      /* select the action based on the action number */
      switch (CUP$MJParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Type ::= IDENT 
            {
              Type RESULT = null;
		int I1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int I1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		String I1 = (String)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new TypeCustom(I1); RESULT.setLine(I1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Type ::= VOID 
            {
              Type RESULT = null;
		 RESULT=new TypeVoid(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Type ::= BOOL 
            {
              Type RESULT = null;
		 RESULT=new TypeBool(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Type ::= CHAR 
            {
              Type RESULT = null;
		 RESULT=new TypeChar(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Type ::= INT 
            {
              Type RESULT = null;
		 RESULT=new TypeInt(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ConstVal ::= FALSE 
            {
              ConstVal RESULT = null;
		 RESULT=new BoolConstFalse(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(11/*ConstVal*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ConstVal ::= TRUE 
            {
              ConstVal RESULT = null;
		 RESULT=new BoolConstTrue(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(11/*ConstVal*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ConstVal ::= CHAR_CONST 
            {
              ConstVal RESULT = null;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		Character C1 = (Character)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new CharConst(C1); RESULT.setLine(C1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(11/*ConstVal*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ConstVal ::= NUMERIC_CONST 
            {
              ConstVal RESULT = null;
		int N1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int N1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		Integer N1 = (Integer)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new NumericConst(N1); RESULT.setLine(N1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(11/*ConstVal*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ConstVar ::= IDENT EQUAL ConstVal 
            {
              ConstVar RESULT = null;
		int varNameleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int varNameright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		String varName = (String)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		ConstVal C1 = (ConstVal)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new ConstVarScalar(varName, C1); RESULT.setLine(varNameleft); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(9/*ConstVar*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ConstVars ::= ConstVar 
            {
              ConstVars RESULT = null;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		ConstVar C1 = (ConstVar)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new SingleConstVar(C1); RESULT.setLine(C1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(10/*ConstVars*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ConstVars ::= ConstVars COMMA ConstVar 
            {
              ConstVars RESULT = null;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		ConstVars C1 = (ConstVars)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		int C2left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int C2right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		ConstVar C2 = (ConstVar)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new MultiConstVar(C1, C2); RESULT.setLine(C1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(10/*ConstVars*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Var ::= IDENT LSQUARE RSQUARE 
            {
              Var RESULT = null;
		int varNameleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int varNameright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		String varName = (String)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		 RESULT=new VarArray(varName); RESULT.setLine(varNameleft); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(7/*Var*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Var ::= IDENT 
            {
              Var RESULT = null;
		int varNameleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int varNameright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		String varName = (String)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new VarScalar(varName); RESULT.setLine(varNameleft); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(7/*Var*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Vars ::= Var 
            {
              Vars RESULT = null;
		int V1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int V1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		Var V1 = (Var)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new SingleVar(V1); RESULT.setLine(V1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(8/*Vars*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Vars ::= Vars COMMA Var 
            {
              Vars RESULT = null;
		int V1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int V1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		Vars V1 = (Vars)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		int V2left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int V2right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		Var V2 = (Var)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new MultiVar(V1, V2); RESULT.setLine(V1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(8/*Vars*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ConstDecl ::= CONST Type ConstVars SEMICOL 
            {
              ConstDecl RESULT = null;
		int typeNameleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int typeNameright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		Type typeName = (Type)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).right;
		ConstVars C1 = (ConstVars)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).value;
		 RESULT=new ConstVarDecl(typeName, C1); RESULT.setLine(typeNameleft); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(5/*ConstDecl*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VarDecl ::= Type Vars SEMICOL 
            {
              VarDecl RESULT = null;
		int typeNameleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int typeNameright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		Type typeName = (Type)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		int V1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left;
		int V1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).right;
		Vars V1 = (Vars)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).value;
		 RESULT=new VarDecl(typeName, V1); RESULT.setLine(typeNameleft); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(4/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // GlobalDecl ::= ConstDecl 
            {
              GlobalDecl RESULT = null;
		int C1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int C1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		ConstDecl C1 = (ConstDecl)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new GlobalConstDecl(C1); RESULT.setLine(C1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(3/*GlobalDecl*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // GlobalDecl ::= VarDecl 
            {
              GlobalDecl RESULT = null;
		int V1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int V1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		VarDecl V1 = (VarDecl)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new GlobalVarDecl(V1); RESULT.setLine(V1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(3/*GlobalDecl*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // GlobalDeclList ::= 
            {
              GlobalDeclList RESULT = null;
		 RESULT=new NoDecls(); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(2/*GlobalDeclList*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // GlobalDeclList ::= GlobalDeclList GlobalDecl 
            {
              GlobalDeclList RESULT = null;
		int G1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left;
		int G1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).right;
		GlobalDeclList G1 = (GlobalDeclList)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).value;
		int G2left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).left;
		int G2right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right;
		GlobalDecl G2 = (GlobalDecl)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).value;
		 RESULT=new GlobalDecls(G1, G2); RESULT.setLine(G1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(2/*GlobalDeclList*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Prog EOF 
            {
              SyntaxNode RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).right;
		Prog start_val = (Prog)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).value;
		RESULT = start_val;
              CUP$MJParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MJParser$parser.done_parsing();
          return CUP$MJParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Prog ::= PROG IDENT GlobalDeclList LBRACE RBRACE 
            {
              Prog RESULT = null;
		int I1left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-3)).left;
		int I1right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-3)).right;
		String I1 = (String)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-3)).value;
		int G2left = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).left;
		int G2right = ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).right;
		GlobalDeclList G2 = (GlobalDeclList)((java_cup.runtime.Symbol) CUP$MJParser$stack.elementAt(CUP$MJParser$top-2)).value;
		 RESULT=new Prog(I1, G2); RESULT.setLine(I1left); 
              CUP$MJParser$result = new java_cup.runtime.Symbol(1/*Prog*/, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MJParser$stack.elementAt(CUP$MJParser$top-0)).right, RESULT);
            }
          return CUP$MJParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

