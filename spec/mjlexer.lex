
package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;

%%

%{

	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}
	
	private Character translate_matched_string_to_char(){
		if(yytext().charAt(1) == '\\'){
			switch(yytext().charAt(2)){
				case 'n': return Character.valueOf('\n');
				case 't': return Character.valueOf('\t');
			}
		}
		return Character.valueOf(yytext().charAt(1));
	}

%}

%cup
%line
%column

%xstate COMMENT

%eofval{
	return new_symbol(sym.EOF);
%eofval}

%%

" " 	{ }
"\b" 	{ }
"\t" 	{ }
"\r\n" 	{ }
"\f" 	{ }

"program"   { return new_symbol(sym.PROG, yytext());}
"print" 	{ return new_symbol(sym.PRINT, yytext()); }
"return" 	{ return new_symbol(sym.RETURN, yytext()); }
"break" 	{ return new_symbol(sym.BREAK, yytext()); }
"if" 		{ return new_symbol(sym.IF, yytext()); }
"else" 		{ return new_symbol(sym.ELSE, yytext()); }
"const" 	{ return new_symbol(sym.CONST, yytext()); }
"class" 	{ return new_symbol(sym.CLASS, yytext()); }
"while" 	{ return new_symbol(sym.WHILE, yytext()); }
"read" 		{ return new_symbol(sym.READ, yytext()); }
"new" 		{ return new_symbol(sym.NEW, yytext()); }
"extends" 	{ return new_symbol(sym.EXTENDS, yytext()); }
"continue" 	{ return new_symbol(sym.CONTINUE, yytext()); }
"foreach" 	{ return new_symbol(sym.FOREACH, yytext()); }
"true" 		{ return new_symbol(sym.TRUE, true); }
"fasle" 	{ return new_symbol(sym.FALSE, false); }
//"int" 	{ return new_symbol(sym.INT, yytext()); }
//"bool" 	{ return new_symbol(sym.BOOL, yytext()); }
//"char" 	{ return new_symbol(sym.CHAR, yytext()); }
"void" 		{ return new_symbol(sym.VOID, yytext()); }
"null" 	{ return new_symbol(sym.NULL, yytext()); }

"++" 		{ return new_symbol(sym.INC, yytext()); }
"--" 		{ return new_symbol(sym.DEC, yytext()); }
"-" 		{ return new_symbol(sym.MINUS, yytext()); }
"+" 		{ return new_symbol(sym.PLUS, yytext()); }
"*" 		{ return new_symbol(sym.STAR, yytext()); }
"/" 		{ return new_symbol(sym.DIV, yytext()); }
"%" 		{ return new_symbol(sym.MOD, yytext()); }
"==" 		{ return new_symbol(sym.REL_EQUAL, yytext()); }
"!=" 		{ return new_symbol(sym.REL_NOT_EQUAL, yytext()); }
">" 		{ return new_symbol(sym.GT, yytext()); }
">=" 		{ return new_symbol(sym.GTE, yytext()); }
"<" 		{ return new_symbol(sym.LT, yytext()); }
"<=" 		{ return new_symbol(sym.LTE, yytext()); }
"&&" 		{ return new_symbol(sym.AND, yytext()); }
"||" 		{ return new_symbol(sym.OR, yytext()); }
"=" 		{ return new_symbol(sym.EQUAL, yytext()); }
";" 		{ return new_symbol(sym.SEMICOL, yytext()); }
":" 		{ return new_symbol(sym.COL, yytext()); }
"," 		{ return new_symbol(sym.COMMA, yytext()); }
"." 		{ return new_symbol(sym.DOT, yytext()); }
"(" 		{ return new_symbol(sym.LPAREN, yytext()); }
")" 		{ return new_symbol(sym.RPAREN, yytext()); }
"[" 		{ return new_symbol(sym.LSQUARE, yytext()); }
"]" 		{ return new_symbol(sym.RSQUARE, yytext()); }
"{" 		{ return new_symbol(sym.LBRACE, yytext()); }
"}"			{ return new_symbol(sym.RBRACE, yytext()); }
"=>" 		{ return new_symbol(sym.ARROW, yytext()); }

"//" {yybegin(COMMENT);}
<COMMENT> . {yybegin(COMMENT);}
<COMMENT> "\r\n" { yybegin(YYINITIAL); }

[0-9]+  { return new_symbol(sym.NUMERIC_CONST, Integer.valueOf(yytext())); }
\".*\"	{return new_symbol (sym.STR_CONST, yytext().substring(1, yytext().length())); }
'(\\[nt] | .)'  {return new_symbol (sym.CHAR_CONST, translate_matched_string_to_char()); }
([a-z]|[A-Z])[a-z|A-Z|0-9|_]* 	{return new_symbol (sym.IDENT, yytext()); }

. { System.err.println("Leksicka greska ("+yytext()+") u liniji "+(yyline+1)); }










