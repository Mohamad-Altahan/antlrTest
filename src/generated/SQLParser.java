// Generated from C:/Users/mhd/Desktop/co_Final/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SCOL=4, DOT=5, OPEN_PAR=6, CLOSE_PAR=7, COMMA=8, 
		ASSIGN=9, STAR=10, PLUS=11, MINUS=12, TILDE=13, PIPE2=14, DIV=15, MOD=16, 
		LT2=17, GT2=18, AMP=19, PIPE=20, LT=21, LT_EQ=22, GT=23, GT_EQ=24, EQ=25, 
		NOT_EQ1=26, NOT_EQ2=27, OPEN_B=28, CLOSE_B=29, MARK_Q=30, TWO_PO=31, OPEN_ARRAY=32, 
		CLOSE_ARRAY=33, K_ABORT=34, K_ACTION=35, K_ADD=36, K_AFTER=37, K_ALL=38, 
		K_ALTER=39, K_ANALYZE=40, K_AND=41, K_AS=42, K_ASC=43, K_ATTACH=44, K_AUTOINCREMENT=45, 
		K_BEFORE=46, K_BEGIN=47, K_BETWEEN=48, K_BY=49, K_CASCADE=50, K_CASE=51, 
		K_CAST=52, K_CHECK=53, K_COLLATE=54, K_COLUMN=55, K_COMMIT=56, K_CONFLICT=57, 
		K_CONSTRAINT=58, K_CREATE=59, K_CROSS=60, K_CURRENT_DATE=61, K_CURRENT_TIME=62, 
		K_CURRENT_TIMESTAMP=63, K_DATABASE=64, K_DEFAULT=65, K_DEFERRABLE=66, 
		K_DEFERRED=67, K_DELETE=68, K_DESC=69, K_DETACH=70, K_DISTINCT=71, K_DROP=72, 
		K_EACH=73, K_ELSE=74, K_END=75, K_ENABLE=76, K_ESCAPE=77, K_EXCEPT=78, 
		K_EXCLUSIVE=79, K_EXISTS=80, K_EXPLAIN=81, K_FAIL=82, K_FOR=83, K_FOREIGN=84, 
		K_FROM=85, K_FULL=86, K_GLOB=87, K_GROUP=88, K_HAVING=89, K_IF=90, K_IGNORE=91, 
		K_IMMEDIATE=92, K_IN=93, K_INDEX=94, K_INDEXED=95, K_INITIALLY=96, K_INNER=97, 
		K_INSERT=98, K_INSTEAD=99, K_INTERSECT=100, K_INTO=101, K_IS=102, K_ISNULL=103, 
		K_JOIN=104, K_KEY=105, K_LEFT=106, K_LIKE=107, K_LIMIT=108, K_MATCH=109, 
		K_NUMBER=110, K_NATURAL=111, K_NEXTVAL=112, K_NO=113, K_NOT=114, K_NOTNULL=115, 
		K_NULL=116, K_OF=117, K_OFFSET=118, K_ON=119, K_ONLY=120, K_OR=121, K_ORDER=122, 
		K_OUTER=123, K_PLAN=124, K_PRAGMA=125, K_PRIMARY=126, K_QUERY=127, K_RAISE=128, 
		K_RECURSIVE=129, K_REFERENCES=130, K_REGEXP=131, K_REINDEX=132, K_RELEASE=133, 
		K_RENAME=134, K_REPLACE=135, K_RESTRICT=136, K_RIGHT=137, K_ROLLBACK=138, 
		K_ROW=139, K_TRUE=140, K_FALSE=141, K_SAVEPOINT=142, K_SELECT=143, K_SET=144, 
		K_TABLE=145, K_TYPE=146, K_TEMP=147, K_TEMPORARY=148, K_THEN=149, K_TO=150, 
		K_TRANSACTION=151, K_TRIGGER=152, K_UNION=153, K_UNIQUE=154, K_UPDATE=155, 
		K_USING=156, K_VACUUM=157, K_VALUES=158, K_VIEW=159, K_VIRTUAL=160, K_WHEN=161, 
		K_WHERE=162, K_WITH=163, K_WITHOUT=164, K_BOOL=165, K_INT=166, K_STRING=167, 
		K_WHILE=168, K_DO=169, K_VAR=170, K_PRINT=171, K_FUNCTION=172, K_JSON=173, 
		K_CSV=174, K_PATH=175, K_FORMAT=176, K_PARAMETER=177, K_RETURN=178, K_SWITCH=179, 
		K_BREAK=180, K_JARPATH=181, K_CLASSNAME=182, K_METHODNAME=183, IDENTIFIER=184, 
		NUMERIC_LITERAL=185, BIND_PARAMETER=186, STRING_LITERAL=187, BLOB_LITERAL=188, 
		MULTILINE_COMMENT=189, SPACES=190, UNEXPECTED_CHAR=191;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_stmt_list = 4, RULE_stmt = 5, RULE_increase = 6, RULE_decrease = 7, 
		RULE_declare_variable = 8, RULE_assign_variable_array = 9, RULE_assign_variable = 10, 
		RULE_if_stmt = 11, RULE_if_stmt_way1 = 12, RULE_if1 = 13, RULE_else_if = 14, 
		RULE_else1 = 15, RULE_if_stmt_way2 = 16, RULE_while_stmt = 17, RULE_while_simple = 18, 
		RULE_do_while = 19, RULE_for_stmt = 20, RULE_for_simple = 21, RULE_assign_variable_for_loop = 22, 
		RULE_for_each = 23, RULE_print_stmt = 24, RULE_case1 = 25, RULE_switch_stmt = 26, 
		RULE_default_stmt = 27, RULE_alter_table_stmt = 28, RULE_alter_table_add_constraint = 29, 
		RULE_alter_table_add = 30, RULE_create_table_stmt = 31, RULE_create_table_composition_stmt = 32, 
		RULE_path = 33, RULE_format = 34, RULE_create_Type_stmt = 35, RULE_delete_stmt = 36, 
		RULE_drop_table_stmt = 37, RULE_factored_select_stmt = 38, RULE_insert_stmt = 39, 
		RULE_select_stmt = 40, RULE_select_or_values = 41, RULE_update_stmt = 42, 
		RULE_column_def = 43, RULE_type_name = 44, RULE_column_constraint = 45, 
		RULE_column_constraint_primary_key = 46, RULE_column_constraint_foreign_key = 47, 
		RULE_column_constraint_not_null = 48, RULE_column_constraint_null = 49, 
		RULE_column_default = 50, RULE_column_default_value = 51, RULE_conflict_clause = 52, 
		RULE_create_function_stmt = 53, RULE_parameterdeclarationlist = 54, RULE_parameterdeclaration = 55, 
		RULE_functionbody = 56, RULE_jumpstatement = 57, RULE_create_agg_func = 58, 
		RULE_method_name = 59, RULE_class_name = 60, RULE_jar_path = 61, RULE_array_of_Agg_function_params = 62, 
		RULE_dtype = 63, RULE_call_json_var = 64, RULE_json_access_name = 65, 
		RULE_json_access_key = 66, RULE_expr = 67, RULE_condition = 68, RULE_updateparameter_forloop = 69, 
		RULE_unary_operator_for_loop = 70, RULE_foreign_key_clause = 71, RULE_fk_target_column_name = 72, 
		RULE_cal_func = 73, RULE_agg_fun = 74, RULE_paramete_list_for_call_agg_func = 75, 
		RULE_function_simple = 76, RULE_func_parameter_list = 77, RULE_higher_order_function = 78, 
		RULE_function_order = 79, RULE_func_parameter = 80, RULE_json = 81, RULE_json_object = 82, 
		RULE_key_value = 83, RULE_key = 84, RULE_value = 85, RULE_array = 86, 
		RULE_array_json_object = 87, RULE_indexed_column = 88, RULE_table_constraint = 89, 
		RULE_table_constraint_primary_key = 90, RULE_table_constraint_foreign_key = 91, 
		RULE_table_constraint_unique = 92, RULE_table_constraint_key = 93, RULE_fk_origin_column_name = 94, 
		RULE_qualified_table_name = 95, RULE_ordering_term = 96, RULE_common_table_expression = 97, 
		RULE_result_column = 98, RULE_table_or_subquery = 99, RULE_join_clause = 100, 
		RULE_join_operator = 101, RULE_join_constraint = 102, RULE_select_core = 103, 
		RULE_signed_number = 104, RULE_literal_value = 105, RULE_unary_operator = 106, 
		RULE_error_message = 107, RULE_column_alias = 108, RULE_keyword = 109, 
		RULE_name = 110, RULE_function_name = 111, RULE_database_name = 112, RULE_source_table_name = 113, 
		RULE_table_name = 114, RULE_new_table_name = 115, RULE_column_name = 116, 
		RULE_collation_name = 117, RULE_foreign_table = 118, RULE_index_name = 119, 
		RULE_table_alias = 120, RULE_any_name = 121, RULE_bool = 122;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "stmt_list", "stmt", "increase", 
			"decrease", "declare_variable", "assign_variable_array", "assign_variable", 
			"if_stmt", "if_stmt_way1", "if1", "else_if", "else1", "if_stmt_way2", 
			"while_stmt", "while_simple", "do_while", "for_stmt", "for_simple", "assign_variable_for_loop", 
			"for_each", "print_stmt", "case1", "switch_stmt", "default_stmt", "alter_table_stmt", 
			"alter_table_add_constraint", "alter_table_add", "create_table_stmt", 
			"create_table_composition_stmt", "path", "format", "create_Type_stmt", 
			"delete_stmt", "drop_table_stmt", "factored_select_stmt", "insert_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "column_def", "type_name", 
			"column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "conflict_clause", "create_function_stmt", "parameterdeclarationlist", 
			"parameterdeclaration", "functionbody", "jumpstatement", "create_agg_func", 
			"method_name", "class_name", "jar_path", "array_of_Agg_function_params", 
			"dtype", "call_json_var", "json_access_name", "json_access_key", "expr", 
			"condition", "updateparameter_forloop", "unary_operator_for_loop", "foreign_key_clause", 
			"fk_target_column_name", "cal_func", "agg_fun", "paramete_list_for_call_agg_func", 
			"function_simple", "func_parameter_list", "higher_order_function", "function_order", 
			"func_parameter", "json", "json_object", "key_value", "key", "value", 
			"array", "array_json_object", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "common_table_expression", 
			"result_column", "table_or_subquery", "join_clause", "join_operator", 
			"join_constraint", "select_core", "signed_number", "literal_value", "unary_operator", 
			"error_message", "column_alias", "keyword", "name", "function_name", 
			"database_name", "source_table_name", "table_name", "new_table_name", 
			"column_name", "collation_name", "foreign_table", "index_name", "table_alias", 
			"any_name", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'++'", "'--'", "'::'", "';'", "'.'", "'('", "')'", "','", "'='", 
			"'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "'{'", "'}'", 
			"'?'", "':'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", 
			"ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", 
			"GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
			"NOT_EQ2", "OPEN_B", "CLOSE_B", "MARK_Q", "TWO_PO", "OPEN_ARRAY", "CLOSE_ARRAY", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", 
			"K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", 
			"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NUMBER", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", 
			"K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_TRUE", "K_FALSE", 
			"K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TYPE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_BOOL", "K_INT", "K_STRING", 
			"K_WHILE", "K_DO", "K_VAR", "K_PRINT", "K_FUNCTION", "K_JSON", "K_CSV", 
			"K_PATH", "K_FORMAT", "K_PARAMETER", "K_RETURN", "K_SWITCH", "K_BREAK", 
			"K_JARPATH", "K_CLASSNAME", "K_METHODNAME", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Create_function_stmtContext> create_function_stmt() {
			return getRuleContexts(Create_function_stmtContext.class);
		}
		public Create_function_stmtContext create_function_stmt(int i) {
			return getRuleContext(Create_function_stmtContext.class,i);
		}
		public List<Create_agg_funcContext> create_agg_func() {
			return getRuleContexts(Create_agg_funcContext.class);
		}
		public Create_agg_funcContext create_agg_func(int i) {
			return getRuleContext(Create_agg_funcContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ALTER) | (1L << K_CREATE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (K_SELECT - 143)) | (1L << (K_UPDATE - 143)) | (1L << (K_VALUES - 143)) | (1L << (K_BOOL - 143)) | (1L << (K_INT - 143)) | (1L << (K_STRING - 143)) | (1L << (K_VAR - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (UNEXPECTED_CHAR - 143)))) != 0)) {
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(246);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(247);
					create_function_stmt();
					}
					break;
				case 3:
					{
					setState(248);
					create_agg_func();
					}
					break;
				case 4:
					{
					setState(249);
					error();
					}
					break;
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			sql_stmt();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(261);
						match(SCOL);
						}
						}
						setState(264); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(266);
					sql_stmt();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(272);
				match(SCOL);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_Type_stmtContext create_Type_stmt() {
			return getRuleContext(Create_Type_stmtContext.class,0);
		}
		public Create_table_composition_stmtContext create_table_composition_stmt() {
			return getRuleContext(Create_table_composition_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(278);
				match(K_EXPLAIN);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(279);
					match(K_QUERY);
					setState(280);
					match(K_PLAN);
					}
				}

				}
			}

			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(285);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(286);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(287);
				create_Type_stmt();
				}
				break;
			case 4:
				{
				setState(288);
				create_table_composition_stmt();
				}
				break;
			case 5:
				{
				setState(289);
				delete_stmt();
				}
				break;
			case 6:
				{
				setState(290);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(291);
				factored_select_stmt();
				}
				break;
			case 8:
				{
				setState(292);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(293);
				update_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			stmt();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(304);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCOL:
						{
						setState(298); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(297);
							match(SCOL);
							}
							}
							setState(300); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SCOL );
						setState(302);
						stmt();
						}
						break;
					case T__0:
					case T__1:
					case OPEN_PAR:
					case PLUS:
					case MINUS:
					case TILDE:
					case OPEN_B:
					case OPEN_ARRAY:
					case K_ALTER:
					case K_CREATE:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_DELETE:
					case K_DROP:
					case K_EXISTS:
					case K_EXPLAIN:
					case K_FOR:
					case K_IF:
					case K_INSERT:
					case K_NUMBER:
					case K_NOT:
					case K_NULL:
					case K_TRUE:
					case K_FALSE:
					case K_SELECT:
					case K_UPDATE:
					case K_VALUES:
					case K_BOOL:
					case K_INT:
					case K_STRING:
					case K_WHILE:
					case K_DO:
					case K_VAR:
					case K_PRINT:
					case K_RETURN:
					case K_SWITCH:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case STRING_LITERAL:
					case BLOB_LITERAL:
						{
						setState(303);
						stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(SCOL);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public Assign_variableContext assign_variable() {
			return getRuleContext(Assign_variableContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Cal_funcContext cal_func() {
			return getRuleContext(Cal_funcContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				declare_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				assign_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				switch_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				jumpstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				sql_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				print_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(324);
				cal_func();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(325);
				json();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(326);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncreaseContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public IncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIncrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIncrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncreaseContext increase() throws RecognitionException {
		IncreaseContext _localctx = new IncreaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_increase);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				any_name();
				setState(330);
				match(T__0);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__0);
				setState(333);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecreaseContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public DecreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDecrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDecrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDecrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecreaseContext decrease() throws RecognitionException {
		DecreaseContext _localctx = new DecreaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decrease);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				any_name();
				setState(337);
				match(T__1);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__1);
				setState(340);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_variableContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Assign_variableContext assign_variable() {
			return getRuleContext(Assign_variableContext.class,0);
		}
		public Assign_variable_arrayContext assign_variable_array() {
			return getRuleContext(Assign_variable_arrayContext.class,0);
		}
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeclare_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeclare_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeclare_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare_variable);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				dtype();
				setState(344);
				any_name();
				setState(345);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				dtype();
				setState(348);
				assign_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				dtype();
				setState(351);
				assign_variable_array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_variable_arrayContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Assign_variable_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_variable_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_variable_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_variable_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variable_arrayContext assign_variable_array() throws RecognitionException {
		Assign_variable_arrayContext _localctx = new Assign_variable_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_variable_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_ARRAY) {
				{
				setState(355);
				match(OPEN_ARRAY);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_EXISTS - 80)) | (1L << (K_NOT - 80)) | (1L << (K_NULL - 80)) | (1L << (K_TRUE - 80)) | (1L << (K_FALSE - 80)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
					{
					setState(356);
					expr(0);
					}
				}

				setState(359);
				match(CLOSE_ARRAY);
				}
			}

			setState(362);
			any_name();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_ARRAY) {
				{
				setState(363);
				match(OPEN_ARRAY);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_EXISTS - 80)) | (1L << (K_NOT - 80)) | (1L << (K_NULL - 80)) | (1L << (K_TRUE - 80)) | (1L << (K_FALSE - 80)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
					{
					setState(364);
					expr(0);
					}
				}

				setState(367);
				match(CLOSE_ARRAY);
				}
			}

			setState(370);
			match(ASSIGN);
			setState(371);
			match(OPEN_B);
			setState(372);
			expr(0);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(373);
				match(COMMA);
				setState(374);
				expr(0);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(CLOSE_B);
			setState(381);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_variableContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Call_json_varContext call_json_var() {
			return getRuleContext(Call_json_varContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public If_stmt_way2Context if_stmt_way2() {
			return getRuleContext(If_stmt_way2Context.class,0);
		}
		public Assign_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variableContext assign_variable() throws RecognitionException {
		Assign_variableContext _localctx = new Assign_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(383);
				any_name();
				}
				break;
			case 2:
				{
				setState(384);
				call_json_var();
				}
				break;
			}
			setState(387);
			match(ASSIGN);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(388);
				condition(0);
				}
				break;
			case 2:
				{
				setState(389);
				json();
				}
				break;
			case 3:
				{
				setState(390);
				sql_stmt();
				}
				break;
			case 4:
				{
				setState(391);
				if_stmt_way2();
				}
				break;
			}
			setState(394);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_stmt_way1Context if_stmt_way1() {
			return getRuleContext(If_stmt_way1Context.class,0);
		}
		public If_stmt_way2Context if_stmt_way2() {
			return getRuleContext(If_stmt_way2Context.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				if_stmt_way1();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				if_stmt_way2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_way1Context extends ParserRuleContext {
		public If1Context if1() {
			return getRuleContext(If1Context.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else1Context else1() {
			return getRuleContext(Else1Context.class,0);
		}
		public If_stmt_way1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_way1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stmt_way1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stmt_way1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stmt_way1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_way1Context if_stmt_way1() throws RecognitionException {
		If_stmt_way1Context _localctx = new If_stmt_way1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt_way1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			if1();
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					else_if();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(407);
				else1();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If1Context extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public If1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If1Context if1() throws RecognitionException {
		If1Context _localctx = new If1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_if1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(K_IF);
			setState(411);
			match(OPEN_PAR);
			setState(412);
			condition(0);
			setState(413);
			match(CLOSE_PAR);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(414);
				match(OPEN_B);
				}
				break;
			}
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(417);
				stmt_list();
				}
				break;
			}
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(420);
				match(CLOSE_B);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(K_ELSE);
			setState(424);
			match(K_IF);
			setState(425);
			match(OPEN_PAR);
			setState(426);
			condition(0);
			setState(427);
			match(CLOSE_PAR);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(428);
				match(OPEN_B);
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(431);
				stmt_list();
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(434);
				match(CLOSE_B);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else1Context extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else1Context else1() throws RecognitionException {
		Else1Context _localctx = new Else1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_else1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(K_ELSE);
			setState(438);
			match(OPEN_B);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(439);
				stmt_list();
				}
			}

			setState(442);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt_way2Context extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode MARK_Q() { return getToken(SQLParser.MARK_Q, 0); }
		public TerminalNode TWO_PO() { return getToken(SQLParser.TWO_PO, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<If_stmt_way2Context> if_stmt_way2() {
			return getRuleContexts(If_stmt_way2Context.class);
		}
		public If_stmt_way2Context if_stmt_way2(int i) {
			return getRuleContext(If_stmt_way2Context.class,i);
		}
		public If_stmt_way2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_way2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stmt_way2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stmt_way2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stmt_way2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_way2Context if_stmt_way2() throws RecognitionException {
		If_stmt_way2Context _localctx = new If_stmt_way2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stmt_way2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OPEN_PAR);
			setState(445);
			condition(0);
			setState(446);
			match(MARK_Q);
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(447);
				condition(0);
				}
				break;
			case 2:
				{
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(448);
					match(OPEN_PAR);
					}
					break;
				}
				setState(451);
				if_stmt_way2();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAR) {
					{
					setState(452);
					match(CLOSE_PAR);
					}
				}

				}
				break;
			}
			setState(457);
			match(TWO_PO);
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(458);
				condition(0);
				}
				break;
			case 2:
				{
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(459);
					match(OPEN_PAR);
					}
					break;
				}
				setState(462);
				if_stmt_way2();
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(463);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			}
			setState(468);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public While_simpleContext while_simple() {
			return getRuleContext(While_simpleContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_stmt);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				while_simple();
				}
				break;
			case K_DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				do_while();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_simpleContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public While_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_simpleContext while_simple() throws RecognitionException {
		While_simpleContext _localctx = new While_simpleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(K_WHILE);
			setState(475);
			match(OPEN_PAR);
			setState(476);
			condition(0);
			setState(477);
			match(CLOSE_PAR);
			setState(478);
			match(OPEN_B);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(479);
				stmt_list();
				}
			}

			setState(482);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(K_DO);
			setState(485);
			functionbody();
			setState(486);
			match(K_WHILE);
			setState(487);
			match(OPEN_PAR);
			setState(488);
			condition(0);
			setState(489);
			match(CLOSE_PAR);
			setState(490);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public For_simpleContext for_simple() {
			return getRuleContext(For_simpleContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_stmt);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				for_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				for_each();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_simpleContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Assign_variable_for_loopContext assign_variable_for_loop() {
			return getRuleContext(Assign_variable_for_loopContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Unary_operator_for_loopContext unary_operator_for_loop() {
			return getRuleContext(Unary_operator_for_loopContext.class,0);
		}
		public Updateparameter_forloopContext updateparameter_forloop() {
			return getRuleContext(Updateparameter_forloopContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public For_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_simpleContext for_simple() throws RecognitionException {
		For_simpleContext _localctx = new For_simpleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(K_FOR);
			setState(497);
			match(OPEN_PAR);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0) || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(498);
				assign_variable_for_loop();
				}
			}

			setState(501);
			match(SCOL);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (K_NULL - 116)) | (1L << (K_TRUE - 116)) | (1L << (K_FALSE - 116)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
				{
				setState(502);
				condition(0);
				}
			}

			setState(505);
			match(SCOL);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(506);
				unary_operator_for_loop();
				}
				break;
			case 2:
				{
				setState(507);
				updateparameter_forloop();
				}
				break;
			}
			setState(510);
			match(CLOSE_PAR);
			setState(511);
			match(OPEN_B);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(512);
				stmt_list();
				}
			}

			setState(515);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_variable_for_loopContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public If_stmt_way2Context if_stmt_way2() {
			return getRuleContext(If_stmt_way2Context.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Assign_variable_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_variable_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_variable_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_variable_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variable_for_loopContext assign_variable_for_loop() throws RecognitionException {
		Assign_variable_for_loopContext _localctx = new Assign_variable_for_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_variable_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0)) {
				{
				setState(517);
				dtype();
				}
			}

			setState(520);
			any_name();
			setState(521);
			match(ASSIGN);
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(522);
				expr(0);
				}
				break;
			case 2:
				{
				setState(523);
				json();
				}
				break;
			case 3:
				{
				setState(524);
				sql_stmt();
				}
				break;
			case 4:
				{
				setState(525);
				if_stmt_way2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode TWO_PO() { return getToken(SQLParser.TWO_PO, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(K_FOR);
			setState(529);
			match(OPEN_PAR);
			setState(530);
			dtype();
			setState(531);
			any_name();
			setState(532);
			match(TWO_PO);
			setState(533);
			any_name();
			setState(534);
			match(CLOSE_PAR);
			setState(535);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<Call_json_varContext> call_json_var() {
			return getRuleContexts(Call_json_varContext.class);
		}
		public Call_json_varContext call_json_var(int i) {
			return getRuleContext(Call_json_varContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(K_PRINT);
			setState(538);
			match(OPEN_PAR);
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(539);
				call_json_var();
				}
				break;
			case 2:
				{
				setState(540);
				condition(0);
				}
				break;
			}
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << COMMA) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (K_NULL - 116)) | (1L << (K_TRUE - 116)) | (1L << (K_FALSE - 116)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
				{
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(543);
						match(COMMA);
						}
						}
						setState(546); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					setState(548);
					call_json_var();
					}
					break;
				case OPEN_PAR:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_NULL:
				case K_TRUE:
				case K_FALSE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(549);
					condition(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			match(CLOSE_PAR);
			setState(556);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case1Context extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TWO_PO() { return getToken(SQLParser.TWO_PO, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public Case1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCase1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCase1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case1Context case1() throws RecognitionException {
		Case1Context _localctx = new Case1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_case1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(K_CASE);
			setState(559);
			expr(0);
			setState(560);
			match(TWO_PO);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(561);
				stmt_list();
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BREAK) {
				{
				setState(564);
				match(K_BREAK);
				}
			}

			setState(567);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public List<Case1Context> case1() {
			return getRuleContexts(Case1Context.class);
		}
		public Case1Context case1(int i) {
			return getRuleContext(Case1Context.class,i);
		}
		public Default_stmtContext default_stmt() {
			return getRuleContext(Default_stmtContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(K_SWITCH);
			setState(570);
			match(OPEN_PAR);
			setState(571);
			expr(0);
			setState(572);
			match(CLOSE_PAR);
			setState(573);
			match(OPEN_B);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(574);
				case1();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(580);
				default_stmt();
				}
			}

			setState(583);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_stmtContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode TWO_PO() { return getToken(SQLParser.TWO_PO, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Default_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefault_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefault_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDefault_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_stmtContext default_stmt() throws RecognitionException {
		Default_stmtContext _localctx = new Default_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_default_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(K_DEFAULT);
			setState(586);
			match(TWO_PO);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(587);
				stmt_list();
				}
			}

			setState(590);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(K_ALTER);
			setState(593);
			match(K_TABLE);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(594);
				database_name();
				setState(595);
				match(DOT);
				}
				break;
			}
			setState(599);
			source_table_name();
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(600);
				match(K_RENAME);
				setState(601);
				match(K_TO);
				setState(602);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(603);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(604);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(605);
				match(K_ADD);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(606);
					match(K_COLUMN);
					}
				}

				setState(609);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(K_ADD);
			setState(613);
			match(K_CONSTRAINT);
			setState(614);
			any_name();
			setState(615);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(K_ADD);
			setState(618);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(K_CREATE);
			setState(621);
			match(K_TABLE);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(622);
				match(K_IF);
				setState(623);
				match(K_NOT);
				setState(624);
				match(K_EXISTS);
				}
			}

			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(627);
				database_name();
				setState(628);
				match(DOT);
				}
				break;
			}
			setState(632);
			table_name();
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(633);
				match(OPEN_PAR);
				setState(634);
				column_def();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(639);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(635);
						match(COMMA);
						setState(636);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(637);
						match(COMMA);
						setState(638);
						column_def();
						}
						break;
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(644);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(646);
				match(K_AS);
				setState(647);
				factored_select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_composition_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_composition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_composition_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_composition_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_composition_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_composition_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_composition_stmtContext create_table_composition_stmt() throws RecognitionException {
		Create_table_composition_stmtContext _localctx = new Create_table_composition_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_create_table_composition_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(K_CREATE);
			setState(651);
			match(K_TABLE);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(652);
				match(K_IF);
				setState(653);
				match(K_NOT);
				setState(654);
				match(K_EXISTS);
				}
			}

			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(657);
				database_name();
				setState(658);
				match(DOT);
				}
				break;
			}
			setState(662);
			table_name();
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(663);
				match(OPEN_PAR);
				setState(664);
				column_def();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(665);
						match(COMMA);
						setState(666);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(667);
						match(COMMA);
						setState(668);
						column_def();
						}
						break;
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(CLOSE_PAR);
				setState(675);
				format();
				setState(676);
				match(COMMA);
				setState(677);
				path();
				}
				break;
			case K_AS:
				{
				setState(679);
				match(K_AS);
				setState(680);
				factored_select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(K_PATH);
			setState(684);
			match(ASSIGN);
			setState(685);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode K_FORMAT() { return getToken(SQLParser.K_FORMAT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(K_FORMAT);
			setState(688);
			match(ASSIGN);
			setState(689);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_Type_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_Type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_Type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_Type_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_Type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Type_stmtContext create_Type_stmt() throws RecognitionException {
		Create_Type_stmtContext _localctx = new Create_Type_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_Type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(K_CREATE);
			setState(692);
			match(K_TYPE);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(693);
				match(K_IF);
				setState(694);
				match(K_NOT);
				setState(695);
				match(K_EXISTS);
				}
			}

			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(698);
				database_name();
				setState(699);
				match(DOT);
				}
				break;
			}
			setState(703);
			table_name();
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(704);
				match(OPEN_PAR);
				setState(705);
				column_def();
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(710);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(706);
						match(COMMA);
						setState(707);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(708);
						match(COMMA);
						setState(709);
						column_def();
						}
						break;
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(715);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(717);
				match(K_AS);
				setState(718);
				factored_select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(K_DELETE);
			setState(722);
			match(K_FROM);
			setState(723);
			qualified_table_name();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(724);
				match(K_WHERE);
				setState(725);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(K_DROP);
			setState(729);
			match(K_TABLE);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(730);
				match(K_IF);
				setState(731);
				match(K_EXISTS);
				}
			}

			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(734);
				database_name();
				setState(735);
				match(DOT);
				}
				break;
			}
			setState(739);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			select_core();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(742);
				match(K_ORDER);
				setState(743);
				match(K_BY);
				setState(744);
				ordering_term();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(745);
					match(COMMA);
					setState(746);
					ordering_term();
					}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(754);
				match(K_LIMIT);
				setState(755);
				expr(0);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(756);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(757);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(K_INSERT);
			setState(763);
			match(K_INTO);
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(764);
				database_name();
				setState(765);
				match(DOT);
				}
				break;
			}
			setState(769);
			table_name();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(770);
				match(OPEN_PAR);
				setState(771);
				column_name();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(772);
					match(COMMA);
					setState(773);
					column_name();
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(779);
				match(CLOSE_PAR);
				}
			}

			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(783);
				match(K_VALUES);
				setState(784);
				match(OPEN_PAR);
				setState(785);
				expr(0);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(786);
					match(COMMA);
					setState(787);
					expr(0);
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				match(CLOSE_PAR);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(794);
					match(COMMA);
					setState(795);
					match(OPEN_PAR);
					setState(796);
					expr(0);
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(797);
						match(COMMA);
						setState(798);
						expr(0);
						}
						}
						setState(803);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(804);
					match(CLOSE_PAR);
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(811);
				factored_select_stmt();
				}
				break;
			case 3:
				{
				setState(812);
				match(K_DEFAULT);
				setState(813);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			select_or_values();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(817);
				match(K_ORDER);
				setState(818);
				match(K_BY);
				setState(819);
				ordering_term();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(820);
					match(COMMA);
					setState(821);
					ordering_term();
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(829);
				match(K_LIMIT);
				setState(830);
				expr(0);
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(831);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(832);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_select_or_values);
		int _la;
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				match(K_SELECT);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(838);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(841);
				result_column();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					result_column();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(849);
					match(K_FROM);
					setState(859);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						setState(850);
						table_or_subquery();
						setState(855);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(851);
							match(COMMA);
							setState(852);
							table_or_subquery();
							}
							}
							setState(857);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(858);
						join_clause();
						}
						break;
					}
					}
				}

				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(863);
					match(K_WHERE);
					setState(864);
					expr(0);
					}
				}

				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(867);
					match(K_GROUP);
					setState(868);
					match(K_BY);
					setState(869);
					expr(0);
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(870);
						match(COMMA);
						setState(871);
						expr(0);
						}
						}
						setState(876);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(877);
						match(K_HAVING);
						setState(878);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(K_VALUES);
				setState(884);
				match(OPEN_PAR);
				setState(885);
				expr(0);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(886);
					match(COMMA);
					setState(887);
					expr(0);
					}
					}
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(893);
				match(CLOSE_PAR);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(894);
					match(COMMA);
					setState(895);
					match(OPEN_PAR);
					setState(896);
					expr(0);
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(897);
						match(COMMA);
						setState(898);
						expr(0);
						}
						}
						setState(903);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(904);
					match(CLOSE_PAR);
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(K_UPDATE);
			setState(914);
			qualified_table_name();
			setState(915);
			match(K_SET);
			setState(916);
			column_name();
			setState(917);
			match(ASSIGN);
			setState(918);
			expr(0);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(919);
				match(COMMA);
				setState(920);
				column_name();
				setState(921);
				match(ASSIGN);
				setState(922);
				expr(0);
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(929);
				match(K_WHERE);
				setState(930);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			column_name();
			setState(938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(936);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
					case K_UNIQUE:
						{
						setState(934);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case K_NUMBER:
					case K_BOOL:
					case K_INT:
					case K_STRING:
					case K_VAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(935);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type_name);
		int _la;
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				name();
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(942);
					match(OPEN_PAR);
					setState(943);
					signed_number();
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(944);
						any_name();
						}
					}

					setState(947);
					match(CLOSE_PAR);
					}
					break;
				case 2:
					{
					setState(949);
					match(OPEN_PAR);
					setState(950);
					signed_number();
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(951);
						any_name();
						}
					}

					setState(954);
					match(COMMA);
					setState(955);
					signed_number();
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(956);
						any_name();
						}
					}

					setState(959);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_NUMBER:
			case K_BOOL:
			case K_INT:
			case K_STRING:
			case K_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				dtype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(966);
				match(K_CONSTRAINT);
				setState(967);
				name();
				}
			}

			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(970);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(971);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(972);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(973);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(974);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(975);
				match(K_CHECK);
				setState(976);
				match(OPEN_PAR);
				setState(977);
				expr(0);
				setState(978);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(980);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(981);
				match(K_COLLATE);
				setState(982);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(K_PRIMARY);
			setState(986);
			match(K_KEY);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(987);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(990);
				match(K_AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(K_NOT);
			setState(996);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(K_DEFAULT);
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1001);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1002);
				match(OPEN_PAR);
				setState(1003);
				expr(0);
				setState(1004);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1006);
				match(K_NEXTVAL);
				setState(1007);
				match(OPEN_PAR);
				setState(1008);
				expr(0);
				setState(1009);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1011);
				any_name();
				}
				break;
			}
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(1014);
				match(T__2);
				setState(1016); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1015);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1018); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1022);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1023);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1026);
				match(K_ON);
				setState(1027);
				match(K_CONFLICT);
				setState(1028);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_FAIL - 82)) | (1L << (K_IGNORE - 82)) | (1L << (K_REPLACE - 82)) | (1L << (K_ROLLBACK - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0)) {
				{
				setState(1031);
				dtype();
				}
			}

			setState(1034);
			any_name();
			setState(1035);
			match(OPEN_PAR);
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0) || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1036);
				parameterdeclarationlist();
				}
			}

			setState(1039);
			match(CLOSE_PAR);
			setState(1040);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public List<ParameterdeclarationContext> parameterdeclaration() {
			return getRuleContexts(ParameterdeclarationContext.class);
		}
		public ParameterdeclarationContext parameterdeclaration(int i) {
			return getRuleContext(ParameterdeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameterdeclarationlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameterdeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterdeclarationlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			parameterdeclaration();
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1043);
				match(COMMA);
				setState(1044);
				parameterdeclaration();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameterdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameterdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameterdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0)) {
				{
				setState(1050);
				dtype();
				}
			}

			setState(1053);
			any_name();
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1054);
				match(ASSIGN);
				setState(1055);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(OPEN_B);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << OPEN_B) | (1L << OPEN_ARRAY) | (1L << K_ALTER) | (1L << K_CREATE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_EXISTS - 68)) | (1L << (K_EXPLAIN - 68)) | (1L << (K_FOR - 68)) | (1L << (K_IF - 68)) | (1L << (K_INSERT - 68)) | (1L << (K_NUMBER - 68)) | (1L << (K_NOT - 68)) | (1L << (K_NULL - 68)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_BOOL - 140)) | (1L << (K_INT - 140)) | (1L << (K_STRING - 140)) | (1L << (K_WHILE - 140)) | (1L << (K_DO - 140)) | (1L << (K_VAR - 140)) | (1L << (K_PRINT - 140)) | (1L << (K_RETURN - 140)) | (1L << (K_SWITCH - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(1059);
				stmt_list();
				}
			}

			setState(1062);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_stmt_way2Context if_stmt_way2() {
			return getRuleContext(If_stmt_way2Context.class,0);
		}
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJumpstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJumpstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jumpstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(K_RETURN);
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1065);
				condition(0);
				}
				break;
			case 2:
				{
				setState(1066);
				if_stmt_way2();
				}
				break;
			}
			setState(1069);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_agg_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Jar_pathContext jar_path() {
			return getRuleContext(Jar_pathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Create_agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_agg_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_agg_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_agg_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_agg_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_agg_funcContext create_agg_func() throws RecognitionException {
		Create_agg_funcContext _localctx = new Create_agg_funcContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_agg_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			any_name();
			setState(1072);
			match(OPEN_PAR);
			setState(1073);
			jar_path();
			setState(1074);
			match(COMMA);
			setState(1075);
			class_name();
			setState(1076);
			match(COMMA);
			setState(1077);
			method_name();
			setState(1078);
			match(COMMA);
			setState(1079);
			dtype();
			setState(1080);
			match(COMMA);
			setState(1081);
			array();
			setState(1082);
			match(CLOSE_PAR);
			setState(1083);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_pathContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Jar_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_pathContext jar_path() throws RecognitionException {
		Jar_pathContext _localctx = new Jar_pathContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_jar_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_of_Agg_function_paramsContext extends ParserRuleContext {
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public Array_of_Agg_function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_of_Agg_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_of_Agg_function_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_of_Agg_function_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_of_Agg_function_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_of_Agg_function_paramsContext array_of_Agg_function_params() throws RecognitionException {
		Array_of_Agg_function_paramsContext _localctx = new Array_of_Agg_function_paramsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_array_of_Agg_function_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(OPEN_ARRAY);
			setState(1092);
			parameterdeclarationlist();
			setState(1093);
			match(CLOSE_ARRAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode K_BOOL() { return getToken(SQLParser.K_BOOL, 0); }
		public TerminalNode K_NUMBER() { return getToken(SQLParser.K_NUMBER, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_NUMBER - 110)) | (1L << (K_BOOL - 110)) | (1L << (K_INT - 110)) | (1L << (K_STRING - 110)) | (1L << (K_VAR - 110)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_json_varContext extends ParserRuleContext {
		public Json_access_nameContext json_access_name() {
			return getRuleContext(Json_access_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<Json_access_keyContext> json_access_key() {
			return getRuleContexts(Json_access_keyContext.class);
		}
		public Json_access_keyContext json_access_key(int i) {
			return getRuleContext(Json_access_keyContext.class,i);
		}
		public Call_json_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_json_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCall_json_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCall_json_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCall_json_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_json_varContext call_json_var() throws RecognitionException {
		Call_json_varContext _localctx = new Call_json_varContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_call_json_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			json_access_name();
			setState(1100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1098);
				match(DOT);
				setState(1099);
				json_access_key();
				}
				}
				setState(1102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_access_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Json_access_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_access_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_access_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_access_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_access_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_access_nameContext json_access_name() throws RecognitionException {
		Json_access_nameContext _localctx = new Json_access_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_json_access_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_access_keyContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Json_access_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_access_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_access_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_access_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_access_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_access_keyContext json_access_key() throws RecognitionException {
		Json_access_keyContext _localctx = new Json_access_keyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_json_access_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Unary_operator_for_loopContext unary_operator_for_loop() {
			return getRuleContext(Unary_operator_for_loopContext.class,0);
		}
		public Cal_funcContext cal_func() {
			return getRuleContext(Cal_funcContext.class,0);
		}
		public Updateparameter_forloopContext updateparameter_forloop() {
			return getRuleContext(Updateparameter_forloopContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1109);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1110);
						database_name();
						setState(1111);
						match(DOT);
						}
						break;
					}
					setState(1115);
					table_name();
					setState(1116);
					match(DOT);
					}
					break;
				}
				setState(1120);
				column_name();
				}
				break;
			case 3:
				{
				setState(1121);
				unary_operator();
				setState(1122);
				expr(14);
				}
				break;
			case 4:
				{
				setState(1124);
				unary_operator_for_loop();
				}
				break;
			case 5:
				{
				setState(1125);
				cal_func();
				}
				break;
			case 6:
				{
				setState(1126);
				updateparameter_forloop();
				}
				break;
			case 7:
				{
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1127);
						match(K_NOT);
						}
					}

					setState(1130);
					match(K_EXISTS);
					}
				}

				setState(1133);
				match(OPEN_PAR);
				setState(1134);
				factored_select_stmt();
				setState(1135);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1139);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1140);
						match(PIPE2);
						setState(1141);
						((ExprContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1142);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1143);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1144);
						((ExprContext)_localctx).right = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1145);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1146);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1147);
						((ExprContext)_localctx).right = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1148);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1149);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1150);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1151);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1153);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1154);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1167);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
						case 1:
							{
							setState(1155);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1156);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1157);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1158);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1159);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1160);
							match(K_IS);
							setState(1161);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1162);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1163);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1164);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1165);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1166);
							match(K_REGEXP);
							}
							break;
						}
						setState(1169);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1170);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1171);
						match(K_AND);
						setState(1172);
						((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1174);
						match(K_OR);
						setState(1175);
						((ExprContext)_localctx).right = expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1178);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1177);
							match(K_NOT);
							}
						}

						setState(1180);
						match(K_IN);
						setState(1200);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
						case 1:
							{
							setState(1181);
							match(OPEN_PAR);
							setState(1191);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1182);
								factored_select_stmt();
								}
								break;
							case T__0:
							case T__1:
							case OPEN_PAR:
							case PLUS:
							case MINUS:
							case TILDE:
							case K_CURRENT_DATE:
							case K_CURRENT_TIME:
							case K_CURRENT_TIMESTAMP:
							case K_EXISTS:
							case K_NOT:
							case K_NULL:
							case K_TRUE:
							case K_FALSE:
							case IDENTIFIER:
							case NUMERIC_LITERAL:
							case STRING_LITERAL:
							case BLOB_LITERAL:
								{
								setState(1183);
								expr(0);
								setState(1188);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1184);
									match(COMMA);
									setState(1185);
									expr(0);
									}
									}
									setState(1190);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							case CLOSE_PAR:
								break;
							default:
								break;
							}
							setState(1193);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1197);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
							case 1:
								{
								setState(1194);
								database_name();
								setState(1195);
								match(DOT);
								}
								break;
							}
							setState(1199);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext left;
		public ConditionContext right;
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Cal_funcContext cal_func() {
			return getRuleContext(Cal_funcContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1208);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1209);
				any_name();
				}
				break;
			case 3:
				{
				setState(1210);
				cal_func();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1214);
						match(PIPE2);
						setState(1215);
						((ConditionContext)_localctx).right = condition(9);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1217);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1218);
						((ConditionContext)_localctx).right = condition(8);
						}
						break;
					case 3:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1220);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1221);
						((ConditionContext)_localctx).right = condition(7);
						}
						break;
					case 4:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1223);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1224);
						((ConditionContext)_localctx).right = condition(6);
						}
						break;
					case 5:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1227);
						((ConditionContext)_localctx).right = condition(5);
						}
						break;
					case 6:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1241);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
						case 1:
							{
							setState(1229);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1230);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1231);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1232);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1233);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1234);
							match(K_IS);
							setState(1235);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1236);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1237);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1238);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1239);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1240);
							match(K_REGEXP);
							}
							break;
						}
						setState(1243);
						((ConditionContext)_localctx).right = condition(4);
						}
						break;
					case 7:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1245);
						match(K_AND);
						setState(1246);
						((ConditionContext)_localctx).right = condition(3);
						}
						break;
					case 8:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(1247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1248);
						match(K_OR);
						setState(1249);
						((ConditionContext)_localctx).right = condition(2);
						}
						break;
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Updateparameter_forloopContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Updateparameter_forloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateparameter_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdateparameter_forloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdateparameter_forloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdateparameter_forloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Updateparameter_forloopContext updateparameter_forloop() throws RecognitionException {
		Updateparameter_forloopContext _localctx = new Updateparameter_forloopContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_updateparameter_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(IDENTIFIER);
			setState(1256);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1257);
			match(ASSIGN);
			setState(1258);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operator_for_loopContext extends ParserRuleContext {
		public IncreaseContext increase() {
			return getRuleContext(IncreaseContext.class,0);
		}
		public DecreaseContext decrease() {
			return getRuleContext(DecreaseContext.class,0);
		}
		public Unary_operator_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operator_for_loopContext unary_operator_for_loop() throws RecognitionException {
		Unary_operator_for_loopContext _localctx = new Unary_operator_for_loopContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unary_operator_for_loop);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				increase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				decrease();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(K_REFERENCES);
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1265);
				database_name();
				setState(1266);
				match(DOT);
				}
				break;
			}
			setState(1270);
			foreign_table();
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1271);
				match(OPEN_PAR);
				setState(1272);
				fk_target_column_name();
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1273);
					match(COMMA);
					setState(1274);
					fk_target_column_name();
					}
					}
					setState(1279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1280);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1284);
					match(K_ON);
					setState(1285);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1286);
						match(K_SET);
						setState(1287);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1288);
						match(K_SET);
						setState(1289);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1290);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1291);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1292);
						match(K_NO);
						setState(1293);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1296);
					match(K_MATCH);
					setState(1297);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1305);
					match(K_NOT);
					}
				}

				setState(1308);
				match(K_DEFERRABLE);
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1309);
					match(K_INITIALLY);
					setState(1310);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1311);
					match(K_INITIALLY);
					setState(1312);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1315);
					match(K_ENABLE);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cal_funcContext extends ParserRuleContext {
		public Function_simpleContext function_simple() {
			return getRuleContext(Function_simpleContext.class,0);
		}
		public Agg_funContext agg_fun() {
			return getRuleContext(Agg_funContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public Cal_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cal_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCal_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCal_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCal_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cal_funcContext cal_func() throws RecognitionException {
		Cal_funcContext _localctx = new Cal_funcContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cal_func);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				function_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				agg_fun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1324);
				higher_order_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Agg_funContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Paramete_list_for_call_agg_funcContext paramete_list_for_call_agg_func() {
			return getRuleContext(Paramete_list_for_call_agg_funcContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Agg_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAgg_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAgg_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAgg_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Agg_funContext agg_fun() throws RecognitionException {
		Agg_funContext _localctx = new Agg_funContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_agg_fun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			function_name();
			setState(1328);
			match(OPEN_PAR);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALL) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_DISTINCT - 71)) | (1L << (K_EXISTS - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_TRUE - 140)) | (1L << (K_FALSE - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (NUMERIC_LITERAL - 140)) | (1L << (STRING_LITERAL - 140)) | (1L << (BLOB_LITERAL - 140)))) != 0)) {
				{
				setState(1329);
				paramete_list_for_call_agg_func();
				}
			}

			setState(1332);
			match(CLOSE_PAR);
			setState(1336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1333);
					match(SCOL);
					}
					} 
				}
				setState(1338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Paramete_list_for_call_agg_funcContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DISTINCT() { return getTokens(SQLParser.K_DISTINCT); }
		public TerminalNode K_DISTINCT(int i) {
			return getToken(SQLParser.K_DISTINCT, i);
		}
		public List<TerminalNode> K_ALL() { return getTokens(SQLParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLParser.K_ALL, i);
		}
		public Paramete_list_for_call_agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramete_list_for_call_agg_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParamete_list_for_call_agg_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParamete_list_for_call_agg_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParamete_list_for_call_agg_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paramete_list_for_call_agg_funcContext paramete_list_for_call_agg_func() throws RecognitionException {
		Paramete_list_for_call_agg_funcContext _localctx = new Paramete_list_for_call_agg_funcContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_paramete_list_for_call_agg_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALL || _la==K_DISTINCT) {
				{
				setState(1339);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1342);
			result_column();
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1343);
				match(COMMA);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1344);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1347);
				result_column();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_simpleContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Func_parameter_listContext func_parameter_list() {
			return getRuleContext(Func_parameter_listContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Function_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_simpleContext function_simple() throws RecognitionException {
		Function_simpleContext _localctx = new Function_simpleContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_simple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			function_name();
			setState(1354);
			match(OPEN_PAR);
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (K_EXISTS - 80)) | (1L << (K_NOT - 80)) | (1L << (K_NULL - 80)) | (1L << (K_TRUE - 80)) | (1L << (K_FALSE - 80)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
				{
				setState(1355);
				func_parameter_list();
				}
			}

			setState(1358);
			match(CLOSE_PAR);
			setState(1362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1359);
					match(SCOL);
					}
					} 
				}
				setState(1364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_parameter_listContext extends ParserRuleContext {
		public List<Func_parameterContext> func_parameter() {
			return getRuleContexts(Func_parameterContext.class);
		}
		public Func_parameterContext func_parameter(int i) {
			return getRuleContext(Func_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Func_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parameter_listContext func_parameter_list() throws RecognitionException {
		Func_parameter_listContext _localctx = new Func_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_func_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			func_parameter();
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1366);
				match(COMMA);
				setState(1367);
				func_parameter();
				}
				}
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higher_order_functionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Func_parameterContext func_parameter() {
			return getRuleContext(Func_parameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Function_orderContext function_order() {
			return getRuleContext(Function_orderContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Higher_order_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_order_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_order_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_order_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_functionContext higher_order_function() throws RecognitionException {
		Higher_order_functionContext _localctx = new Higher_order_functionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_higher_order_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			function_name();
			setState(1374);
			match(OPEN_PAR);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DISTINCT) {
				{
				setState(1375);
				match(K_DISTINCT);
				}
			}

			setState(1378);
			func_parameter();
			setState(1379);
			match(COMMA);
			setState(1380);
			function_order();
			setState(1381);
			match(CLOSE_PAR);
			setState(1385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1382);
					match(SCOL);
					}
					} 
				}
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_orderContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public List<Func_parameterContext> func_parameter() {
			return getRuleContexts(Func_parameterContext.class);
		}
		public Func_parameterContext func_parameter(int i) {
			return getRuleContext(Func_parameterContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Function_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_order(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_orderContext function_order() throws RecognitionException {
		Function_orderContext _localctx = new Function_orderContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_function_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(K_FUNCTION);
			setState(1389);
			match(OPEN_PAR);
			setState(1402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DISTINCT:
			case K_EXISTS:
			case K_NOT:
			case K_NULL:
			case K_TRUE:
			case K_FALSE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DISTINCT) {
					{
					setState(1390);
					match(K_DISTINCT);
					}
				}

				setState(1393);
				func_parameter();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1394);
					match(COMMA);
					setState(1395);
					func_parameter();
					}
					}
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1401);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1404);
			match(CLOSE_PAR);
			setState(1405);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_parameterContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parameterContext func_parameter() throws RecognitionException {
		Func_parameterContext _localctx = new Func_parameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_func_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonContext extends ParserRuleContext {
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Array_json_objectContext array_json_object() {
			return getRuleContext(Array_json_objectContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_json);
		try {
			setState(1411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_B:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				json_object();
				}
				break;
			case OPEN_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				array_json_object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_objectContext extends ParserRuleContext {
		public TerminalNode OPEN_B() { return getToken(SQLParser.OPEN_B, 0); }
		public List<Key_valueContext> key_value() {
			return getRuleContexts(Key_valueContext.class);
		}
		public Key_valueContext key_value(int i) {
			return getRuleContext(Key_valueContext.class,i);
		}
		public TerminalNode CLOSE_B() { return getToken(SQLParser.CLOSE_B, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_objectContext json_object() throws RecognitionException {
		Json_objectContext _localctx = new Json_objectContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(OPEN_B);
			setState(1414);
			key_value();
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1415);
				match(COMMA);
				setState(1416);
				key_value();
				}
				}
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1422);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_valueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode TWO_PO() { return getToken(SQLParser.TWO_PO, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKey_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKey_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKey_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			key();
			setState(1425);
			match(TWO_PO);
			setState(1426);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Array_json_objectContext array_json_object() {
			return getRuleContext(Array_json_objectContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1430);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1431);
				array_json_object();
				}
				break;
			case 3:
				{
				setState(1432);
				json_object();
				}
				break;
			case 4:
				{
				setState(1433);
				array();
				}
				break;
			case 5:
				{
				setState(1434);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(OPEN_ARRAY);
			setState(1438);
			expr(0);
			setState(1443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1439);
				match(COMMA);
				setState(1440);
				expr(0);
				}
				}
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1446);
			match(CLOSE_ARRAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_json_objectContext extends ParserRuleContext {
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public List<Json_objectContext> json_object() {
			return getRuleContexts(Json_objectContext.class);
		}
		public Json_objectContext json_object(int i) {
			return getRuleContext(Json_objectContext.class,i);
		}
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_json_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_json_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_json_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_json_objectContext array_json_object() throws RecognitionException {
		Array_json_objectContext _localctx = new Array_json_objectContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_array_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(OPEN_ARRAY);
			setState(1449);
			json_object();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1450);
				match(COMMA);
				setState(1451);
				json_object();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457);
			match(CLOSE_ARRAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			column_name();
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1460);
				match(K_COLLATE);
				setState(1461);
				collation_name();
				}
			}

			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1464);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1467);
				match(K_CONSTRAINT);
				setState(1468);
				name();
				}
			}

			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1471);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1472);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1473);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1474);
				match(K_CHECK);
				setState(1475);
				match(OPEN_PAR);
				setState(1476);
				expr(0);
				setState(1477);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1479);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(K_PRIMARY);
			setState(1483);
			match(K_KEY);
			setState(1484);
			match(OPEN_PAR);
			setState(1485);
			indexed_column();
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1486);
				match(COMMA);
				setState(1487);
				indexed_column();
				}
				}
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1493);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(K_FOREIGN);
			setState(1496);
			match(K_KEY);
			setState(1497);
			match(OPEN_PAR);
			setState(1498);
			fk_origin_column_name();
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1499);
				match(COMMA);
				setState(1500);
				fk_origin_column_name();
				}
				}
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1506);
			match(CLOSE_PAR);
			setState(1507);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(K_UNIQUE);
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1510);
				match(K_KEY);
				}
			}

			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1513);
				name();
				}
				break;
			}
			setState(1516);
			match(OPEN_PAR);
			setState(1517);
			indexed_column();
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1518);
				match(COMMA);
				setState(1519);
				indexed_column();
				}
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1525);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(K_KEY);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1528);
				name();
				}
				break;
			}
			setState(1531);
			match(OPEN_PAR);
			setState(1532);
			indexed_column();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1533);
				match(COMMA);
				setState(1534);
				indexed_column();
				}
				}
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1540);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1544);
				database_name();
				setState(1545);
				match(DOT);
				}
				break;
			}
			setState(1549);
			table_name();
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1550);
				match(K_INDEXED);
				setState(1551);
				match(K_BY);
				setState(1552);
				index_name();
				}
				break;
			case 2:
				{
				setState(1553);
				match(K_NOT);
				setState(1554);
				match(K_INDEXED);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			expr(0);
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1558);
				match(K_COLLATE);
				setState(1559);
				collation_name();
				}
			}

			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1562);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			table_name();
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1566);
				match(OPEN_PAR);
				setState(1567);
				column_name();
				setState(1572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1568);
					match(COMMA);
					setState(1569);
					column_name();
					}
					}
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1575);
				match(CLOSE_PAR);
				}
			}

			setState(1579);
			match(K_AS);
			setState(1580);
			match(OPEN_PAR);
			setState(1581);
			factored_select_stmt();
			setState(1582);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_result_column);
		int _la;
		try {
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				table_name();
				setState(1586);
				match(DOT);
				setState(1587);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1589);
				expr(0);
				setState(1594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1590);
						match(K_AS);
						}
					}

					setState(1593);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_table_or_subquery);
		int _la;
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1598);
					database_name();
					setState(1599);
					match(DOT);
					}
					break;
				}
				setState(1603);
				table_name();
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1604);
						match(K_AS);
						}
					}

					setState(1607);
					table_alias();
					}
					break;
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1610);
					match(K_INDEXED);
					setState(1611);
					match(K_BY);
					setState(1612);
					index_name();
					}
					break;
				case 2:
					{
					setState(1613);
					match(K_NOT);
					setState(1614);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				match(OPEN_PAR);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1618);
					table_or_subquery();
					setState(1623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1619);
						match(COMMA);
						setState(1620);
						table_or_subquery();
						}
						}
						setState(1625);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1626);
					join_clause();
					}
					break;
				}
				setState(1629);
				match(CLOSE_PAR);
				setState(1634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1630);
						match(K_AS);
						}
					}

					setState(1633);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
				match(OPEN_PAR);
				setState(1637);
				factored_select_stmt();
				setState(1638);
				match(CLOSE_PAR);
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1639);
						match(K_AS);
						}
					}

					setState(1642);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			table_or_subquery();
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (K_INNER - 97)) | (1L << (K_JOIN - 97)) | (1L << (K_LEFT - 97)))) != 0)) {
				{
				{
				setState(1648);
				join_operator();
				setState(1649);
				table_or_subquery();
				setState(1650);
				join_constraint();
				}
				}
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_join_operator);
		int _la;
		try {
			setState(1666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1658);
					match(K_LEFT);
					setState(1660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1659);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1662);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1665);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1668);
				match(K_ON);
				setState(1669);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_select_core);
		int _la;
		try {
			setState(1746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				match(K_SELECT);
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1673);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1676);
				result_column();
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1677);
					match(COMMA);
					setState(1678);
					result_column();
					}
					}
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1684);
					match(K_FROM);
					setState(1694);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						setState(1685);
						table_or_subquery();
						setState(1690);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1686);
							match(COMMA);
							setState(1687);
							table_or_subquery();
							}
							}
							setState(1692);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1693);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1698);
					match(K_WHERE);
					setState(1699);
					expr(0);
					}
				}

				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1702);
					match(K_GROUP);
					setState(1703);
					match(K_BY);
					setState(1704);
					expr(0);
					setState(1709);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1705);
						match(COMMA);
						setState(1706);
						expr(0);
						}
						}
						setState(1711);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1712);
						match(K_HAVING);
						setState(1713);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				match(K_VALUES);
				setState(1719);
				match(OPEN_PAR);
				setState(1720);
				expr(0);
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1721);
					match(COMMA);
					setState(1722);
					expr(0);
					}
					}
					setState(1727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1728);
				match(CLOSE_PAR);
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1729);
					match(COMMA);
					setState(1730);
					match(OPEN_PAR);
					setState(1731);
					expr(0);
					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1732);
						match(COMMA);
						setState(1733);
						expr(0);
						}
						}
						setState(1738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1739);
					match(CLOSE_PAR);
					}
					}
					setState(1745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1748);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1751);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1752);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_literal_value);
		try {
			setState(1763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1757);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1758);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1759);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1760);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1761);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case K_TRUE:
			case K_FALSE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1762);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode K_NUMBER() { return getToken(SQLParser.K_NUMBER, 0); }
		public TerminalNode K_BOOL() { return getToken(SQLParser.K_BOOL, 0); }
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public TerminalNode K_CSV() { return getToken(SQLParser.K_CSV, 0); }
		public TerminalNode K_JSON() { return getToken(SQLParser.K_JSON, 0); }
		public TerminalNode K_FORMAT() { return getToken(SQLParser.K_FORMAT, 0); }
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode K_JARPATH() { return getToken(SQLParser.K_JARPATH, 0); }
		public TerminalNode K_CLASSNAME() { return getToken(SQLParser.K_CLASSNAME, 0); }
		public TerminalNode K_METHODNAME() { return getToken(SQLParser.K_METHODNAME, 0); }
		public TerminalNode K_PARAMETER() { return getToken(SQLParser.K_PARAMETER, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NUMBER - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_BOOL - 128)) | (1L << (K_INT - 128)) | (1L << (K_STRING - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_DO - 128)) | (1L << (K_VAR - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_JSON - 128)) | (1L << (K_CSV - 128)) | (1L << (K_PATH - 128)) | (1L << (K_FORMAT - 128)) | (1L << (K_PARAMETER - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_JARPATH - 128)) | (1L << (K_CLASSNAME - 128)) | (1L << (K_METHODNAME - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_any_name);
		try {
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				match(OPEN_PAR);
				setState(1798);
				any_name();
				setState(1799);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_la = _input.LA(1);
			if ( !(_la==K_TRUE || _la==K_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 67:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 68:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c1\u0710\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\3\2\3\2\3\2\3\2\7\2\u00fd\n\2\f\2\16"+
		"\2\u0100\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\6\4\u0109\n\4\r\4\16\4\u010a"+
		"\3\4\7\4\u010e\n\4\f\4\16\4\u0111\13\4\3\4\7\4\u0114\n\4\f\4\16\4\u0117"+
		"\13\4\3\5\3\5\3\5\5\5\u011c\n\5\5\5\u011e\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0129\n\5\3\6\3\6\6\6\u012d\n\6\r\6\16\6\u012e\3\6\3"+
		"\6\7\6\u0133\n\6\f\6\16\6\u0136\13\6\3\6\7\6\u0139\n\6\f\6\16\6\u013c"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u014a\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0151\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0158\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0164\n\n\3\13\3\13\5\13\u0168"+
		"\n\13\3\13\5\13\u016b\n\13\3\13\3\13\3\13\5\13\u0170\n\13\3\13\5\13\u0173"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u017a\n\13\f\13\16\13\u017d\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\5\f\u0184\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u018b\n"+
		"\f\3\f\3\f\3\r\3\r\5\r\u0191\n\r\3\16\3\16\7\16\u0195\n\16\f\16\16\16"+
		"\u0198\13\16\3\16\5\16\u019b\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u01a2"+
		"\n\17\3\17\5\17\u01a5\n\17\3\17\5\17\u01a8\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u01b0\n\20\3\20\5\20\u01b3\n\20\3\20\5\20\u01b6\n\20\3\21"+
		"\3\21\3\21\5\21\u01bb\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u01c4"+
		"\n\22\3\22\3\22\5\22\u01c8\n\22\5\22\u01ca\n\22\3\22\3\22\3\22\5\22\u01cf"+
		"\n\22\3\22\3\22\5\22\u01d3\n\22\5\22\u01d5\n\22\3\22\3\22\3\23\3\23\5"+
		"\23\u01db\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01e3\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u01f1\n\26\3\27"+
		"\3\27\3\27\5\27\u01f6\n\27\3\27\3\27\5\27\u01fa\n\27\3\27\3\27\3\27\5"+
		"\27\u01ff\n\27\3\27\3\27\3\27\5\27\u0204\n\27\3\27\3\27\3\30\5\30\u0209"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0211\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0220\n\32\3\32\6\32"+
		"\u0223\n\32\r\32\16\32\u0224\3\32\3\32\7\32\u0229\n\32\f\32\16\32\u022c"+
		"\13\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0235\n\33\3\33\5\33\u0238"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0242\n\34\f\34\16"+
		"\34\u0245\13\34\3\34\5\34\u0248\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u024f"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0258\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0262\n\36\3\36\5\36\u0265\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0274\n!\3!\3!\3!\5!\u0279"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\7!\u0282\n!\f!\16!\u0285\13!\3!\3!\3!\3!\5!\u028b"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0292\n\"\3\"\3\"\3\"\5\"\u0297\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u02a0\n\"\f\"\16\"\u02a3\13\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u02ac\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\5"+
		"%\u02bb\n%\3%\3%\3%\5%\u02c0\n%\3%\3%\3%\3%\3%\3%\3%\7%\u02c9\n%\f%\16"+
		"%\u02cc\13%\3%\3%\3%\3%\5%\u02d2\n%\3&\3&\3&\3&\3&\5&\u02d9\n&\3\'\3\'"+
		"\3\'\3\'\5\'\u02df\n\'\3\'\3\'\3\'\5\'\u02e4\n\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\7(\u02ee\n(\f(\16(\u02f1\13(\5(\u02f3\n(\3(\3(\3(\3(\5(\u02f9\n("+
		"\5(\u02fb\n(\3)\3)\3)\3)\3)\5)\u0302\n)\3)\3)\3)\3)\3)\7)\u0309\n)\f)"+
		"\16)\u030c\13)\3)\3)\5)\u0310\n)\3)\3)\3)\3)\3)\7)\u0317\n)\f)\16)\u031a"+
		"\13)\3)\3)\3)\3)\3)\3)\7)\u0322\n)\f)\16)\u0325\13)\3)\3)\7)\u0329\n)"+
		"\f)\16)\u032c\13)\3)\3)\3)\5)\u0331\n)\3*\3*\3*\3*\3*\3*\7*\u0339\n*\f"+
		"*\16*\u033c\13*\5*\u033e\n*\3*\3*\3*\3*\5*\u0344\n*\5*\u0346\n*\3+\3+"+
		"\5+\u034a\n+\3+\3+\3+\7+\u034f\n+\f+\16+\u0352\13+\3+\3+\3+\3+\7+\u0358"+
		"\n+\f+\16+\u035b\13+\3+\5+\u035e\n+\5+\u0360\n+\3+\3+\5+\u0364\n+\3+\3"+
		"+\3+\3+\3+\7+\u036b\n+\f+\16+\u036e\13+\3+\3+\5+\u0372\n+\5+\u0374\n+"+
		"\3+\3+\3+\3+\3+\7+\u037b\n+\f+\16+\u037e\13+\3+\3+\3+\3+\3+\3+\7+\u0386"+
		"\n+\f+\16+\u0389\13+\3+\3+\7+\u038d\n+\f+\16+\u0390\13+\5+\u0392\n+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u039f\n,\f,\16,\u03a2\13,\3,\3,\5,"+
		"\u03a6\n,\3-\3-\3-\7-\u03ab\n-\f-\16-\u03ae\13-\3.\3.\3.\3.\5.\u03b4\n"+
		".\3.\3.\3.\3.\3.\5.\u03bb\n.\3.\3.\3.\5.\u03c0\n.\3.\3.\5.\u03c4\n.\3"+
		".\5.\u03c7\n.\3/\3/\5/\u03cb\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\5/\u03da\n/\3\60\3\60\3\60\5\60\u03df\n\60\3\60\5\60\u03e2\n\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u03f7\n\64\3\64\3\64\6\64\u03fb\n\64\r\64\16"+
		"\64\u03fc\5\64\u03ff\n\64\3\65\3\65\5\65\u0403\n\65\3\66\3\66\3\66\5\66"+
		"\u0408\n\66\3\67\5\67\u040b\n\67\3\67\3\67\3\67\5\67\u0410\n\67\3\67\3"+
		"\67\3\67\38\38\38\78\u0418\n8\f8\168\u041b\138\39\59\u041e\n9\39\39\3"+
		"9\59\u0423\n9\3:\3:\5:\u0427\n:\3:\3:\3;\3;\3;\5;\u042e\n;\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3"+
		"A\3A\3B\3B\3B\6B\u044f\nB\rB\16B\u0450\3C\3C\3D\3D\3E\3E\3E\3E\3E\5E\u045c"+
		"\nE\3E\3E\3E\5E\u0461\nE\3E\3E\3E\3E\3E\3E\3E\3E\5E\u046b\nE\3E\5E\u046e"+
		"\nE\3E\3E\3E\3E\5E\u0474\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0492\nE\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\5E\u049d\nE\3E\3E\3E\3E\3E\3E\7E\u04a5\nE\fE\16E\u04a8\13"+
		"E\5E\u04aa\nE\3E\3E\3E\3E\5E\u04b0\nE\3E\5E\u04b3\nE\7E\u04b5\nE\fE\16"+
		"E\u04b8\13E\3F\3F\3F\3F\5F\u04be\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04dc\nF\3F\3F\3"+
		"F\3F\3F\3F\3F\7F\u04e5\nF\fF\16F\u04e8\13F\3G\3G\3G\3G\3G\3H\3H\5H\u04f1"+
		"\nH\3I\3I\3I\3I\5I\u04f7\nI\3I\3I\3I\3I\3I\7I\u04fe\nI\fI\16I\u0501\13"+
		"I\3I\3I\5I\u0505\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0511\nI\3I\3I\5"+
		"I\u0515\nI\7I\u0517\nI\fI\16I\u051a\13I\3I\5I\u051d\nI\3I\3I\3I\3I\3I"+
		"\5I\u0524\nI\3I\5I\u0527\nI\5I\u0529\nI\3J\3J\3K\3K\3K\5K\u0530\nK\3L"+
		"\3L\3L\5L\u0535\nL\3L\3L\7L\u0539\nL\fL\16L\u053c\13L\3M\5M\u053f\nM\3"+
		"M\3M\3M\5M\u0544\nM\3M\7M\u0547\nM\fM\16M\u054a\13M\3N\3N\3N\5N\u054f"+
		"\nN\3N\3N\7N\u0553\nN\fN\16N\u0556\13N\3O\3O\3O\7O\u055b\nO\fO\16O\u055e"+
		"\13O\3P\3P\3P\5P\u0563\nP\3P\3P\3P\3P\3P\7P\u056a\nP\fP\16P\u056d\13P"+
		"\3Q\3Q\3Q\5Q\u0572\nQ\3Q\3Q\3Q\7Q\u0577\nQ\fQ\16Q\u057a\13Q\3Q\5Q\u057d"+
		"\nQ\3Q\3Q\3Q\3R\3R\3S\3S\5S\u0586\nS\3T\3T\3T\3T\7T\u058c\nT\fT\16T\u058f"+
		"\13T\3T\3T\3U\3U\3U\3U\3V\3V\3W\3W\3W\3W\3W\5W\u059e\nW\3X\3X\3X\3X\7"+
		"X\u05a4\nX\fX\16X\u05a7\13X\3X\3X\3Y\3Y\3Y\3Y\7Y\u05af\nY\fY\16Y\u05b2"+
		"\13Y\3Y\3Y\3Z\3Z\3Z\5Z\u05b9\nZ\3Z\5Z\u05bc\nZ\3[\3[\5[\u05c0\n[\3[\3"+
		"[\3[\3[\3[\3[\3[\3[\3[\5[\u05cb\n[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u05d3\n"+
		"\\\f\\\16\\\u05d6\13\\\3\\\3\\\3]\3]\3]\3]\3]\3]\7]\u05e0\n]\f]\16]\u05e3"+
		"\13]\3]\3]\3]\3^\3^\5^\u05ea\n^\3^\5^\u05ed\n^\3^\3^\3^\3^\7^\u05f3\n"+
		"^\f^\16^\u05f6\13^\3^\3^\3_\3_\5_\u05fc\n_\3_\3_\3_\3_\7_\u0602\n_\f_"+
		"\16_\u0605\13_\3_\3_\3`\3`\3a\3a\3a\5a\u060e\na\3a\3a\3a\3a\3a\3a\5a\u0616"+
		"\na\3b\3b\3b\5b\u061b\nb\3b\5b\u061e\nb\3c\3c\3c\3c\3c\7c\u0625\nc\fc"+
		"\16c\u0628\13c\3c\3c\5c\u062c\nc\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u063a\nd\3d\5d\u063d\nd\5d\u063f\nd\3e\3e\3e\5e\u0644\ne\3e\3e\5e\u0648"+
		"\ne\3e\5e\u064b\ne\3e\3e\3e\3e\3e\5e\u0652\ne\3e\3e\3e\3e\7e\u0658\ne"+
		"\fe\16e\u065b\13e\3e\5e\u065e\ne\3e\3e\5e\u0662\ne\3e\5e\u0665\ne\3e\3"+
		"e\3e\3e\5e\u066b\ne\3e\5e\u066e\ne\5e\u0670\ne\3f\3f\3f\3f\3f\7f\u0677"+
		"\nf\ff\16f\u067a\13f\3g\3g\3g\5g\u067f\ng\3g\5g\u0682\ng\3g\5g\u0685\n"+
		"g\3h\3h\5h\u0689\nh\3i\3i\5i\u068d\ni\3i\3i\3i\7i\u0692\ni\fi\16i\u0695"+
		"\13i\3i\3i\3i\3i\7i\u069b\ni\fi\16i\u069e\13i\3i\5i\u06a1\ni\5i\u06a3"+
		"\ni\3i\3i\5i\u06a7\ni\3i\3i\3i\3i\3i\7i\u06ae\ni\fi\16i\u06b1\13i\3i\3"+
		"i\5i\u06b5\ni\5i\u06b7\ni\3i\3i\3i\3i\3i\7i\u06be\ni\fi\16i\u06c1\13i"+
		"\3i\3i\3i\3i\3i\3i\7i\u06c9\ni\fi\16i\u06cc\13i\3i\3i\7i\u06d0\ni\fi\16"+
		"i\u06d3\13i\5i\u06d5\ni\3j\5j\u06d8\nj\3j\3j\5j\u06dc\nj\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\5k\u06e6\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3"+
		"s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3{\3{\3{\3{\5{\u070c"+
		"\n{\3|\3|\3|\2\4\u0088\u008a}\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\2\20\4\2"+
		"\n\nxx\4\2((II\4\2--GG\7\2$$TT]]\u0089\u0089\u008c\u008c\5\2pp\u00a7\u00a9"+
		"\u00ac\u00ac\4\2\f\f\21\22\3\2\r\16\3\2\23\26\3\2\27\32\4\2FF\u009d\u009d"+
		"\4\2\r\17tt\4\2\u00ba\u00ba\u00bd\u00bd\5\2$y{\u00b3\u00b5\u00b9\3\2\u008e"+
		"\u008f\2\u07de\2\u00fe\3\2\2\2\4\u0103\3\2\2\2\6\u0106\3\2\2\2\b\u011d"+
		"\3\2\2\2\n\u012a\3\2\2\2\f\u0149\3\2\2\2\16\u0150\3\2\2\2\20\u0157\3\2"+
		"\2\2\22\u0163\3\2\2\2\24\u016a\3\2\2\2\26\u0183\3\2\2\2\30\u0190\3\2\2"+
		"\2\32\u0192\3\2\2\2\34\u019c\3\2\2\2\36\u01a9\3\2\2\2 \u01b7\3\2\2\2\""+
		"\u01be\3\2\2\2$\u01da\3\2\2\2&\u01dc\3\2\2\2(\u01e6\3\2\2\2*\u01f0\3\2"+
		"\2\2,\u01f2\3\2\2\2.\u0208\3\2\2\2\60\u0212\3\2\2\2\62\u021b\3\2\2\2\64"+
		"\u0230\3\2\2\2\66\u023b\3\2\2\28\u024b\3\2\2\2:\u0252\3\2\2\2<\u0266\3"+
		"\2\2\2>\u026b\3\2\2\2@\u026e\3\2\2\2B\u028c\3\2\2\2D\u02ad\3\2\2\2F\u02b1"+
		"\3\2\2\2H\u02b5\3\2\2\2J\u02d3\3\2\2\2L\u02da\3\2\2\2N\u02e7\3\2\2\2P"+
		"\u02fc\3\2\2\2R\u0332\3\2\2\2T\u0391\3\2\2\2V\u0393\3\2\2\2X\u03a7\3\2"+
		"\2\2Z\u03c6\3\2\2\2\\\u03ca\3\2\2\2^\u03db\3\2\2\2`\u03e3\3\2\2\2b\u03e5"+
		"\3\2\2\2d\u03e8\3\2\2\2f\u03ea\3\2\2\2h\u0402\3\2\2\2j\u0407\3\2\2\2l"+
		"\u040a\3\2\2\2n\u0414\3\2\2\2p\u041d\3\2\2\2r\u0424\3\2\2\2t\u042a\3\2"+
		"\2\2v\u0431\3\2\2\2x\u043f\3\2\2\2z\u0441\3\2\2\2|\u0443\3\2\2\2~\u0445"+
		"\3\2\2\2\u0080\u0449\3\2\2\2\u0082\u044b\3\2\2\2\u0084\u0452\3\2\2\2\u0086"+
		"\u0454\3\2\2\2\u0088\u0473\3\2\2\2\u008a\u04bd\3\2\2\2\u008c\u04e9\3\2"+
		"\2\2\u008e\u04f0\3\2\2\2\u0090\u04f2\3\2\2\2\u0092\u052a\3\2\2\2\u0094"+
		"\u052f\3\2\2\2\u0096\u0531\3\2\2\2\u0098\u053e\3\2\2\2\u009a\u054b\3\2"+
		"\2\2\u009c\u0557\3\2\2\2\u009e\u055f\3\2\2\2\u00a0\u056e\3\2\2\2\u00a2"+
		"\u0581\3\2\2\2\u00a4\u0585\3\2\2\2\u00a6\u0587\3\2\2\2\u00a8\u0592\3\2"+
		"\2\2\u00aa\u0596\3\2\2\2\u00ac\u059d\3\2\2\2\u00ae\u059f\3\2\2\2\u00b0"+
		"\u05aa\3\2\2\2\u00b2\u05b5\3\2\2\2\u00b4\u05bf\3\2\2\2\u00b6\u05cc\3\2"+
		"\2\2\u00b8\u05d9\3\2\2\2\u00ba\u05e7\3\2\2\2\u00bc\u05f9\3\2\2\2\u00be"+
		"\u0608\3\2\2\2\u00c0\u060d\3\2\2\2\u00c2\u0617\3\2\2\2\u00c4\u061f\3\2"+
		"\2\2\u00c6\u063e\3\2\2\2\u00c8\u066f\3\2\2\2\u00ca\u0671\3\2\2\2\u00cc"+
		"\u0684\3\2\2\2\u00ce\u0688\3\2\2\2\u00d0\u06d4\3\2\2\2\u00d2\u06db\3\2"+
		"\2\2\u00d4\u06e5\3\2\2\2\u00d6\u06e7\3\2\2\2\u00d8\u06e9\3\2\2\2\u00da"+
		"\u06eb\3\2\2\2\u00dc\u06ed\3\2\2\2\u00de\u06ef\3\2\2\2\u00e0\u06f1\3\2"+
		"\2\2\u00e2\u06f3\3\2\2\2\u00e4\u06f5\3\2\2\2\u00e6\u06f7\3\2\2\2\u00e8"+
		"\u06f9\3\2\2\2\u00ea\u06fb\3\2\2\2\u00ec\u06fd\3\2\2\2\u00ee\u06ff\3\2"+
		"\2\2\u00f0\u0701\3\2\2\2\u00f2\u0703\3\2\2\2\u00f4\u070b\3\2\2\2\u00f6"+
		"\u070d\3\2\2\2\u00f8\u00fd\5\6\4\2\u00f9\u00fd\5l\67\2\u00fa\u00fd\5v"+
		"<\2\u00fb\u00fd\5\4\3\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7\2\2\3\u0102\3\3\2\2\2\u0103\u0104\7\u00c1\2\2\u0104\u0105\b\3"+
		"\1\2\u0105\5\3\2\2\2\u0106\u010f\5\b\5\2\u0107\u0109\7\6\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\5\b\5\2\u010d\u0108\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0115\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0114\7\6\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\7\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011b\7S\2\2\u0119\u011a\7\u0081\2\2\u011a\u011c\7~\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0118"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0128\3\2\2\2\u011f\u0129\5:\36\2\u0120"+
		"\u0129\5@!\2\u0121\u0129\5H%\2\u0122\u0129\5B\"\2\u0123\u0129\5J&\2\u0124"+
		"\u0129\5L\'\2\u0125\u0129\5N(\2\u0126\u0129\5P)\2\u0127\u0129\5V,\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2"+
		"\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\t\3\2\2\2\u012a\u0134\5\f\7\2"+
		"\u012b\u012d\7\6\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\5\f\7\2\u0131"+
		"\u0133\5\f\7\2\u0132\u012c\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0139\7\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\13\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u014a\5\22\n\2\u013e\u014a\5\26\f\2\u013f\u014a\5\66\34"+
		"\2\u0140\u014a\5\30\r\2\u0141\u014a\5*\26\2\u0142\u014a\5$\23\2\u0143"+
		"\u014a\5t;\2\u0144\u014a\5\b\5\2\u0145\u014a\5\62\32\2\u0146\u014a\5\u0094"+
		"K\2\u0147\u014a\5\u00a4S\2\u0148\u014a\5\u0088E\2\u0149\u013d\3\2\2\2"+
		"\u0149\u013e\3\2\2\2\u0149\u013f\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0141"+
		"\3\2\2\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149"+
		"\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2"+
		"\2\2\u014a\r\3\2\2\2\u014b\u014c\5\u00f4{\2\u014c\u014d\7\3\2\2\u014d"+
		"\u0151\3\2\2\2\u014e\u014f\7\3\2\2\u014f\u0151\5\u00f4{\2\u0150\u014b"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\17\3\2\2\2\u0152\u0153\5\u00f4{\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0158\3\2\2\2\u0155\u0156\7\4\2\2\u0156\u0158\5\u00f4"+
		"{\2\u0157\u0152\3\2\2\2\u0157\u0155\3\2\2\2\u0158\21\3\2\2\2\u0159\u015a"+
		"\5\u0080A\2\u015a\u015b\5\u00f4{\2\u015b\u015c\7\6\2\2\u015c\u0164\3\2"+
		"\2\2\u015d\u015e\5\u0080A\2\u015e\u015f\5\26\f\2\u015f\u0164\3\2\2\2\u0160"+
		"\u0161\5\u0080A\2\u0161\u0162\5\24\13\2\u0162\u0164\3\2\2\2\u0163\u0159"+
		"\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\23\3\2\2\2\u0165"+
		"\u0167\7\"\2\2\u0166\u0168\5\u0088E\2\u0167\u0166\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7#\2\2\u016a\u0165\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0172\5\u00f4{\2\u016d\u016f"+
		"\7\"\2\2\u016e\u0170\5\u0088E\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2"+
		"\2\u0170\u0171\3\2\2\2\u0171\u0173\7#\2\2\u0172\u016d\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\13\2\2\u0175\u0176\7\36\2\2"+
		"\u0176\u017b\5\u0088E\2\u0177\u0178\7\n\2\2\u0178\u017a\5\u0088E\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\37\2\2\u017f"+
		"\u0180\7\6\2\2\u0180\25\3\2\2\2\u0181\u0184\5\u00f4{\2\u0182\u0184\5\u0082"+
		"B\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u018a\7\13\2\2\u0186\u018b\5\u008aF\2\u0187\u018b\5\u00a4S\2\u0188\u018b"+
		"\5\b\5\2\u0189\u018b\5\"\22\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2"+
		"\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d"+
		"\7\6\2\2\u018d\27\3\2\2\2\u018e\u0191\5\32\16\2\u018f\u0191\5\"\22\2\u0190"+
		"\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\31\3\2\2\2\u0192\u0196\5\34\17"+
		"\2\u0193\u0195\5\36\20\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199\u019b\5 \21\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\33\3\2\2\2\u019c\u019d\7\\\2\2\u019d\u019e\7\b\2\2\u019e\u019f\5\u008a"+
		"F\2\u019f\u01a1\7\t\2\2\u01a0\u01a2\7\36\2\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5\n\6\2\u01a4\u01a3\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\7\37\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\35\3\2\2\2\u01a9\u01aa\7L\2\2"+
		"\u01aa\u01ab\7\\\2\2\u01ab\u01ac\7\b\2\2\u01ac\u01ad\5\u008aF\2\u01ad"+
		"\u01af\7\t\2\2\u01ae\u01b0\7\36\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\5\n\6\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\7\37\2\2\u01b5\u01b4\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\37\3\2\2\2\u01b7\u01b8\7L\2\2\u01b8\u01ba"+
		"\7\36\2\2\u01b9\u01bb\5\n\6\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\37\2\2\u01bd!\3\2\2\2\u01be\u01bf\7"+
		"\b\2\2\u01bf\u01c0\5\u008aF\2\u01c0\u01c9\7 \2\2\u01c1\u01ca\5\u008aF"+
		"\2\u01c2\u01c4\7\b\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c7\5\"\22\2\u01c6\u01c8\7\t\2\2\u01c7\u01c6\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c1\3\2\2\2\u01c9\u01c3"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d4\7!\2\2\u01cc\u01d5\5\u008aF\2"+
		"\u01cd\u01cf\7\b\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\5\"\22\2\u01d1\u01d3\7\t\2\2\u01d2\u01d1\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d4\u01ce"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\t\2\2\u01d7#\3\2\2\2\u01d8"+
		"\u01db\5&\24\2\u01d9\u01db\5(\25\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db%\3\2\2\2\u01dc\u01dd\7\u00aa\2\2\u01dd\u01de\7\b\2\2\u01de"+
		"\u01df\5\u008aF\2\u01df\u01e0\7\t\2\2\u01e0\u01e2\7\36\2\2\u01e1\u01e3"+
		"\5\n\6\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\7\37\2\2\u01e5\'\3\2\2\2\u01e6\u01e7\7\u00ab\2\2\u01e7\u01e8\5"+
		"r:\2\u01e8\u01e9\7\u00aa\2\2\u01e9\u01ea\7\b\2\2\u01ea\u01eb\5\u008aF"+
		"\2\u01eb\u01ec\7\t\2\2\u01ec\u01ed\7\6\2\2\u01ed)\3\2\2\2\u01ee\u01f1"+
		"\5,\27\2\u01ef\u01f1\5\60\31\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2"+
		"\u01f1+\3\2\2\2\u01f2\u01f3\7U\2\2\u01f3\u01f5\7\b\2\2\u01f4\u01f6\5."+
		"\30\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\7\6\2\2\u01f8\u01fa\5\u008aF\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\7\6\2\2\u01fc\u01ff\5\u008eH"+
		"\2\u01fd\u01ff\5\u008cG\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7\t\2\2\u0201\u0203\7\36"+
		"\2\2\u0202\u0204\5\n\6\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\7\37\2\2\u0206-\3\2\2\2\u0207\u0209\5\u0080"+
		"A\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020b\5\u00f4{\2\u020b\u0210\7\13\2\2\u020c\u0211\5\u0088E\2\u020d\u0211"+
		"\5\u00a4S\2\u020e\u0211\5\b\5\2\u020f\u0211\5\"\22\2\u0210\u020c\3\2\2"+
		"\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211/"+
		"\3\2\2\2\u0212\u0213\7U\2\2\u0213\u0214\7\b\2\2\u0214\u0215\5\u0080A\2"+
		"\u0215\u0216\5\u00f4{\2\u0216\u0217\7!\2\2\u0217\u0218\5\u00f4{\2\u0218"+
		"\u0219\7\t\2\2\u0219\u021a\5r:\2\u021a\61\3\2\2\2\u021b\u021c\7\u00ad"+
		"\2\2\u021c\u021f\7\b\2\2\u021d\u0220\5\u0082B\2\u021e\u0220\5\u008aF\2"+
		"\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u022a\3\2\2\2\u0221\u0223"+
		"\7\n\2\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\5\u0082B\2\u0227\u0229"+
		"\5\u008aF\2\u0228\u0222\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2"+
		"\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022d\u022e\7\t\2\2\u022e\u022f\7\6\2\2\u022f\63\3\2\2\2\u0230"+
		"\u0231\7\65\2\2\u0231\u0232\5\u0088E\2\u0232\u0234\7!\2\2\u0233\u0235"+
		"\5\n\6\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0238\7\u00b6\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\7\6\2\2\u023a\65\3\2\2\2\u023b\u023c\7\u00b5\2\2"+
		"\u023c\u023d\7\b\2\2\u023d\u023e\5\u0088E\2\u023e\u023f\7\t\2\2\u023f"+
		"\u0243\7\36\2\2\u0240\u0242\5\64\33\2\u0241\u0240\3\2\2\2\u0242\u0245"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0248\58\35\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\37\2\2\u024a\67\3\2\2\2\u024b\u024c"+
		"\7C\2\2\u024c\u024e\7!\2\2\u024d\u024f\5\n\6\2\u024e\u024d\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7\6\2\2\u02519\3\2\2\2"+
		"\u0252\u0253\7)\2\2\u0253\u0257\7\u0093\2\2\u0254\u0255\5\u00e2r\2\u0255"+
		"\u0256\7\7\2\2\u0256\u0258\3\2\2\2\u0257\u0254\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u0264\5\u00e4s\2\u025a\u025b\7\u0088\2"+
		"\2\u025b\u025c\7\u0098\2\2\u025c\u0265\5\u00e8u\2\u025d\u0265\5> \2\u025e"+
		"\u0265\5<\37\2\u025f\u0261\7&\2\2\u0260\u0262\79\2\2\u0261\u0260\3\2\2"+
		"\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\5X-\2\u0264\u025a"+
		"\3\2\2\2\u0264\u025d\3\2\2\2\u0264\u025e\3\2\2\2\u0264\u025f\3\2\2\2\u0265"+
		";\3\2\2\2\u0266\u0267\7&\2\2\u0267\u0268\7<\2\2\u0268\u0269\5\u00f4{\2"+
		"\u0269\u026a\5\u00b4[\2\u026a=\3\2\2\2\u026b\u026c\7&\2\2\u026c\u026d"+
		"\5\u00b4[\2\u026d?\3\2\2\2\u026e\u026f\7=\2\2\u026f\u0273\7\u0093\2\2"+
		"\u0270\u0271\7\\\2\2\u0271\u0272\7t\2\2\u0272\u0274\7R\2\2\u0273\u0270"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0276\5\u00e2r"+
		"\2\u0276\u0277\7\7\2\2\u0277\u0279\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u028a\5\u00e6t\2\u027b\u027c\7\b\2"+
		"\2\u027c\u0283\5X-\2\u027d\u027e\7\n\2\2\u027e\u0282\5\u00b4[\2\u027f"+
		"\u0280\7\n\2\2\u0280\u0282\5X-\2\u0281\u027d\3\2\2\2\u0281\u027f\3\2\2"+
		"\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\t\2\2\u0287\u028b\3\2\2\2\u0288"+
		"\u0289\7,\2\2\u0289\u028b\5N(\2\u028a\u027b\3\2\2\2\u028a\u0288\3\2\2"+
		"\2\u028bA\3\2\2\2\u028c\u028d\7=\2\2\u028d\u0291\7\u0093\2\2\u028e\u028f"+
		"\7\\\2\2\u028f\u0290\7t\2\2\u0290\u0292\7R\2\2\u0291\u028e\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0296\3\2\2\2\u0293\u0294\5\u00e2r\2\u0294\u0295"+
		"\7\7\2\2\u0295\u0297\3\2\2\2\u0296\u0293\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u02ab\5\u00e6t\2\u0299\u029a\7\b\2\2\u029a\u02a1"+
		"\5X-\2\u029b\u029c\7\n\2\2\u029c\u02a0\5\u00b4[\2\u029d\u029e\7\n\2\2"+
		"\u029e\u02a0\5X-\2\u029f\u029b\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a3"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u02a5\7\t\2\2\u02a5\u02a6\5F$\2\u02a6\u02a7\7\n\2"+
		"\2\u02a7\u02a8\5D#\2\u02a8\u02ac\3\2\2\2\u02a9\u02aa\7,\2\2\u02aa\u02ac"+
		"\5N(\2\u02ab\u0299\3\2\2\2\u02ab\u02a9\3\2\2\2\u02acC\3\2\2\2\u02ad\u02ae"+
		"\7\u00b1\2\2\u02ae\u02af\7\13\2\2\u02af\u02b0\7\u00ba\2\2\u02b0E\3\2\2"+
		"\2\u02b1\u02b2\7\u00b2\2\2\u02b2\u02b3\7\13\2\2\u02b3\u02b4\7\u00ba\2"+
		"\2\u02b4G\3\2\2\2\u02b5\u02b6\7=\2\2\u02b6\u02ba\7\u0094\2\2\u02b7\u02b8"+
		"\7\\\2\2\u02b8\u02b9\7t\2\2\u02b9\u02bb\7R\2\2\u02ba\u02b7\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bf\3\2\2\2\u02bc\u02bd\5\u00e2r\2\u02bd\u02be"+
		"\7\7\2\2\u02be\u02c0\3\2\2\2\u02bf\u02bc\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02d1\5\u00e6t\2\u02c2\u02c3\7\b\2\2\u02c3\u02ca"+
		"\5X-\2\u02c4\u02c5\7\n\2\2\u02c5\u02c9\5\u00b4[\2\u02c6\u02c7\7\n\2\2"+
		"\u02c7\u02c9\5X-\2\u02c8\u02c4\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc"+
		"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02ce\7\t\2\2\u02ce\u02d2\3\2\2\2\u02cf\u02d0\7,"+
		"\2\2\u02d0\u02d2\5N(\2\u02d1\u02c2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2I"+
		"\3\2\2\2\u02d3\u02d4\7F\2\2\u02d4\u02d5\7W\2\2\u02d5\u02d8\5\u00c0a\2"+
		"\u02d6\u02d7\7\u00a4\2\2\u02d7\u02d9\5\u0088E\2\u02d8\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9K\3\2\2\2\u02da\u02db\7J\2\2\u02db\u02de\7\u0093\2"+
		"\2\u02dc\u02dd\7\\\2\2\u02dd\u02df\7R\2\2\u02de\u02dc\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e3\3\2\2\2\u02e0\u02e1\5\u00e2r\2\u02e1\u02e2\7\7\2"+
		"\2\u02e2\u02e4\3\2\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02e6\5\u00e6t\2\u02e6M\3\2\2\2\u02e7\u02f2\5\u00d0i\2"+
		"\u02e8\u02e9\7|\2\2\u02e9\u02ea\7\63\2\2\u02ea\u02ef\5\u00c2b\2\u02eb"+
		"\u02ec\7\n\2\2\u02ec\u02ee\5\u00c2b\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1"+
		"\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f2\u02e8\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fa\3\2"+
		"\2\2\u02f4\u02f5\7n\2\2\u02f5\u02f8\5\u0088E\2\u02f6\u02f7\t\2\2\2\u02f7"+
		"\u02f9\5\u0088E\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb"+
		"\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fbO\3\2\2\2\u02fc"+
		"\u02fd\7d\2\2\u02fd\u0301\7g\2\2\u02fe\u02ff\5\u00e2r\2\u02ff\u0300\7"+
		"\7\2\2\u0300\u0302\3\2\2\2\u0301\u02fe\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u030f\5\u00e6t\2\u0304\u0305\7\b\2\2\u0305\u030a"+
		"\5\u00eav\2\u0306\u0307\7\n\2\2\u0307\u0309\5\u00eav\2\u0308\u0306\3\2"+
		"\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7\t\2\2\u030e\u0310\3\2"+
		"\2\2\u030f\u0304\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0330\3\2\2\2\u0311"+
		"\u0312\7\u00a0\2\2\u0312\u0313\7\b\2\2\u0313\u0318\5\u0088E\2\u0314\u0315"+
		"\7\n\2\2\u0315\u0317\5\u0088E\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2"+
		"\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318"+
		"\3\2\2\2\u031b\u032a\7\t\2\2\u031c\u031d\7\n\2\2\u031d\u031e\7\b\2\2\u031e"+
		"\u0323\5\u0088E\2\u031f\u0320\7\n\2\2\u0320\u0322\5\u0088E\2\u0321\u031f"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7\t\2\2\u0327\u0329\3\2"+
		"\2\2\u0328\u031c\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u0331\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0331\5N"+
		"(\2\u032e\u032f\7C\2\2\u032f\u0331\7\u00a0\2\2\u0330\u0311\3\2\2\2\u0330"+
		"\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0331Q\3\2\2\2\u0332\u033d\5T+\2\u0333"+
		"\u0334\7|\2\2\u0334\u0335\7\63\2\2\u0335\u033a\5\u00c2b\2\u0336\u0337"+
		"\7\n\2\2\u0337\u0339\5\u00c2b\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2"+
		"\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033d\u0333\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0345\3\2\2\2\u033f"+
		"\u0340\7n\2\2\u0340\u0343\5\u0088E\2\u0341\u0342\t\2\2\2\u0342\u0344\5"+
		"\u0088E\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0346\3\2\2\2"+
		"\u0345\u033f\3\2\2\2\u0345\u0346\3\2\2\2\u0346S\3\2\2\2\u0347\u0349\7"+
		"\u0091\2\2\u0348\u034a\t\3\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u0350\5\u00c6d\2\u034c\u034d\7\n\2\2\u034d"+
		"\u034f\5\u00c6d\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e"+
		"\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u035f\3\2\2\2\u0352\u0350\3\2\2\2\u0353"+
		"\u035d\7W\2\2\u0354\u0359\5\u00c8e\2\u0355\u0356\7\n\2\2\u0356\u0358\5"+
		"\u00c8e\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2"+
		"\u0359\u035a\3\2\2\2\u035a\u035e\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035e"+
		"\5\u00caf\2\u035d\u0354\3\2\2\2\u035d\u035c\3\2\2\2\u035e\u0360\3\2\2"+
		"\2\u035f\u0353\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u0362"+
		"\7\u00a4\2\2\u0362\u0364\5\u0088E\2\u0363\u0361\3\2\2\2\u0363\u0364\3"+
		"\2\2\2\u0364\u0373\3\2\2\2\u0365\u0366\7Z\2\2\u0366\u0367\7\63\2\2\u0367"+
		"\u036c\5\u0088E\2\u0368\u0369\7\n\2\2\u0369\u036b\5\u0088E\2\u036a\u0368"+
		"\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u0371\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\7[\2\2\u0370\u0372\5\u0088"+
		"E\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373"+
		"\u0365\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0392\3\2\2\2\u0375\u0376\7\u00a0"+
		"\2\2\u0376\u0377\7\b\2\2\u0377\u037c\5\u0088E\2\u0378\u0379\7\n\2\2\u0379"+
		"\u037b\5\u0088E\2\u037a\u0378\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f"+
		"\u038e\7\t\2\2\u0380\u0381\7\n\2\2\u0381\u0382\7\b\2\2\u0382\u0387\5\u0088"+
		"E\2\u0383\u0384\7\n\2\2\u0384\u0386\5\u0088E\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2"+
		"\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\t\2\2\u038b\u038d\3\2\2\2\u038c"+
		"\u0380\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0347\3\2\2\2\u0391"+
		"\u0375\3\2\2\2\u0392U\3\2\2\2\u0393\u0394\7\u009d\2\2\u0394\u0395\5\u00c0"+
		"a\2\u0395\u0396\7\u0092\2\2\u0396\u0397\5\u00eav\2\u0397\u0398\7\13\2"+
		"\2\u0398\u03a0\5\u0088E\2\u0399\u039a\7\n\2\2\u039a\u039b\5\u00eav\2\u039b"+
		"\u039c\7\13\2\2\u039c\u039d\5\u0088E\2\u039d\u039f\3\2\2\2\u039e\u0399"+
		"\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a5\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\7\u00a4\2\2\u03a4\u03a6"+
		"\5\u0088E\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6W\3\2\2\2\u03a7"+
		"\u03ac\5\u00eav\2\u03a8\u03ab\5\\/\2\u03a9\u03ab\5Z.\2\u03aa\u03a8\3\2"+
		"\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03adY\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03c3\5\u00de"+
		"p\2\u03b0\u03b1\7\b\2\2\u03b1\u03b3\5\u00d2j\2\u03b2\u03b4\5\u00f4{\2"+
		"\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6"+
		"\7\t\2\2\u03b6\u03c4\3\2\2\2\u03b7\u03b8\7\b\2\2\u03b8\u03ba\5\u00d2j"+
		"\2\u03b9\u03bb\5\u00f4{\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03bd\7\n\2\2\u03bd\u03bf\5\u00d2j\2\u03be\u03c0"+
		"\5\u00f4{\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2"+
		"\2\u03c1\u03c2\7\t\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03b0\3\2\2\2\u03c3\u03b7"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c7\5\u0080A"+
		"\2\u03c6\u03af\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7[\3\2\2\2\u03c8\u03c9"+
		"\7<\2\2\u03c9\u03cb\5\u00dep\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2"+
		"\u03cb\u03d9\3\2\2\2\u03cc\u03da\5^\60\2\u03cd\u03da\5`\61\2\u03ce\u03da"+
		"\5b\62\2\u03cf\u03da\5d\63\2\u03d0\u03da\7\u009c\2\2\u03d1\u03d2\7\67"+
		"\2\2\u03d2\u03d3\7\b\2\2\u03d3\u03d4\5\u0088E\2\u03d4\u03d5\7\t\2\2\u03d5"+
		"\u03da\3\2\2\2\u03d6\u03da\5f\64\2\u03d7\u03d8\78\2\2\u03d8\u03da\5\u00ec"+
		"w\2\u03d9\u03cc\3\2\2\2\u03d9\u03cd\3\2\2\2\u03d9\u03ce\3\2\2\2\u03d9"+
		"\u03cf\3\2\2\2\u03d9\u03d0\3\2\2\2\u03d9\u03d1\3\2\2\2\u03d9\u03d6\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03da]\3\2\2\2\u03db\u03dc\7\u0080\2\2\u03dc"+
		"\u03de\7k\2\2\u03dd\u03df\t\4\2\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03df\u03e1\3\2\2\2\u03e0\u03e2\7/\2\2\u03e1\u03e0\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2_\3\2\2\2\u03e3\u03e4\5\u0090I\2\u03e4a\3\2\2\2\u03e5"+
		"\u03e6\7t\2\2\u03e6\u03e7\7v\2\2\u03e7c\3\2\2\2\u03e8\u03e9\7v\2\2\u03e9"+
		"e\3\2\2\2\u03ea\u03f6\7C\2\2\u03eb\u03f7\5h\65\2\u03ec\u03ed\7\b\2\2\u03ed"+
		"\u03ee\5\u0088E\2\u03ee\u03ef\7\t\2\2\u03ef\u03f7\3\2\2\2\u03f0\u03f1"+
		"\7r\2\2\u03f1\u03f2\7\b\2\2\u03f2\u03f3\5\u0088E\2\u03f3\u03f4\7\t\2\2"+
		"\u03f4\u03f7\3\2\2\2\u03f5\u03f7\5\u00f4{\2\u03f6\u03eb\3\2\2\2\u03f6"+
		"\u03ec\3\2\2\2\u03f6\u03f0\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7\u03fe\3\2"+
		"\2\2\u03f8\u03fa\7\5\2\2\u03f9\u03fb\5\u00f4{\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2"+
		"\2\2\u03fe\u03f8\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ffg\3\2\2\2\u0400\u0403"+
		"\5\u00d2j\2\u0401\u0403\5\u00d4k\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2"+
		"\2\2\u0403i\3\2\2\2\u0404\u0405\7y\2\2\u0405\u0406\7;\2\2\u0406\u0408"+
		"\t\5\2\2\u0407\u0404\3\2\2\2\u0407\u0408\3\2\2\2\u0408k\3\2\2\2\u0409"+
		"\u040b\5\u0080A\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040d\5\u00f4{\2\u040d\u040f\7\b\2\2\u040e\u0410\5n8\2"+
		"\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412"+
		"\7\t\2\2\u0412\u0413\5r:\2\u0413m\3\2\2\2\u0414\u0419\5p9\2\u0415\u0416"+
		"\7\n\2\2\u0416\u0418\5p9\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419"+
		"\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041ao\3\2\2\2\u041b\u0419\3\2\2\2"+
		"\u041c\u041e\5\u0080A\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0422\5\u00f4{\2\u0420\u0421\7\13\2\2\u0421\u0423"+
		"\5\u0088E\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423q\3\2\2\2\u0424"+
		"\u0426\7\36\2\2\u0425\u0427\5\n\6\2\u0426\u0425\3\2\2\2\u0426\u0427\3"+
		"\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\7\37\2\2\u0429s\3\2\2\2\u042a\u042d"+
		"\7\u00b4\2\2\u042b\u042e\5\u008aF\2\u042c\u042e\5\"\22\2\u042d\u042b\3"+
		"\2\2\2\u042d\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7\6\2\2\u0430"+
		"u\3\2\2\2\u0431\u0432\5\u00f4{\2\u0432\u0433\7\b\2\2\u0433\u0434\5|?\2"+
		"\u0434\u0435\7\n\2\2\u0435\u0436\5z>\2\u0436\u0437\7\n\2\2\u0437\u0438"+
		"\5x=\2\u0438\u0439\7\n\2\2\u0439\u043a\5\u0080A\2\u043a\u043b\7\n\2\2"+
		"\u043b\u043c\5\u00aeX\2\u043c\u043d\7\t\2\2\u043d\u043e\7\6\2\2\u043e"+
		"w\3\2\2\2\u043f\u0440\5\u00f4{\2\u0440y\3\2\2\2\u0441\u0442\5\u00f4{\2"+
		"\u0442{\3\2\2\2\u0443\u0444\5\u00f4{\2\u0444}\3\2\2\2\u0445\u0446\7\""+
		"\2\2\u0446\u0447\5n8\2\u0447\u0448\7#\2\2\u0448\177\3\2\2\2\u0449\u044a"+
		"\t\6\2\2\u044a\u0081\3\2\2\2\u044b\u044e\5\u0084C\2\u044c\u044d\7\7\2"+
		"\2\u044d\u044f\5\u0086D\2\u044e\u044c\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0083\3\2\2\2\u0452\u0453\5\u00f4"+
		"{\2\u0453\u0085\3\2\2\2\u0454\u0455\5\u00f4{\2\u0455\u0087\3\2\2\2\u0456"+
		"\u0457\bE\1\2\u0457\u0474\5\u00d4k\2\u0458\u0459\5\u00e2r\2\u0459\u045a"+
		"\7\7\2\2\u045a\u045c\3\2\2\2\u045b\u0458\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u045e\5\u00e6t\2\u045e\u045f\7\7\2\2\u045f\u0461"+
		"\3\2\2\2\u0460\u045b\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0474\5\u00eav\2\u0463\u0464\5\u00d6l\2\u0464\u0465\5\u0088E\20\u0465"+
		"\u0474\3\2\2\2\u0466\u0474\5\u008eH\2\u0467\u0474\5\u0094K\2\u0468\u0474"+
		"\5\u008cG\2\u0469\u046b\7t\2\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2"+
		"\u046b\u046c\3\2\2\2\u046c\u046e\7R\2\2\u046d\u046a\3\2\2\2\u046d\u046e"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\b\2\2\u0470\u0471\5N(\2\u0471"+
		"\u0472\7\t\2\2\u0472\u0474\3\2\2\2\u0473\u0456\3\2\2\2\u0473\u0460\3\2"+
		"\2\2\u0473\u0463\3\2\2\2\u0473\u0466\3\2\2\2\u0473\u0467\3\2\2\2\u0473"+
		"\u0468\3\2\2\2\u0473\u046d\3\2\2\2\u0474\u04b6\3\2\2\2\u0475\u0476\f\17"+
		"\2\2\u0476\u0477\7\20\2\2\u0477\u04b5\5\u0088E\20\u0478\u0479\f\r\2\2"+
		"\u0479\u047a\t\7\2\2\u047a\u04b5\5\u0088E\16\u047b\u047c\f\f\2\2\u047c"+
		"\u047d\t\b\2\2\u047d\u04b5\5\u0088E\r\u047e\u047f\f\13\2\2\u047f\u0480"+
		"\t\t\2\2\u0480\u04b5\5\u0088E\f\u0481\u0482\f\n\2\2\u0482\u0483\t\n\2"+
		"\2\u0483\u04b5\5\u0088E\13\u0484\u0491\f\t\2\2\u0485\u0492\7\13\2\2\u0486"+
		"\u0492\7\33\2\2\u0487\u0492\7\34\2\2\u0488\u0492\7\35\2\2\u0489\u0492"+
		"\7h\2\2\u048a\u048b\7h\2\2\u048b\u0492\7t\2\2\u048c\u0492\7_\2\2\u048d"+
		"\u0492\7m\2\2\u048e\u0492\7Y\2\2\u048f\u0492\7o\2\2\u0490\u0492\7\u0085"+
		"\2\2\u0491\u0485\3\2\2\2\u0491\u0486\3\2\2\2\u0491\u0487\3\2\2\2\u0491"+
		"\u0488\3\2\2\2\u0491\u0489\3\2\2\2\u0491\u048a\3\2\2\2\u0491\u048c\3\2"+
		"\2\2\u0491\u048d\3\2\2\2\u0491\u048e\3\2\2\2\u0491\u048f\3\2\2\2\u0491"+
		"\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u04b5\5\u0088E\n\u0494\u0495"+
		"\f\b\2\2\u0495\u0496\7+\2\2\u0496\u04b5\5\u0088E\t\u0497\u0498\f\7\2\2"+
		"\u0498\u0499\7{\2\2\u0499\u04b5\5\u0088E\b\u049a\u049c\f\4\2\2\u049b\u049d"+
		"\7t\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u04b2\7_\2\2\u049f\u04a9\7\b\2\2\u04a0\u04aa\5N(\2\u04a1\u04a6\5\u0088"+
		"E\2\u04a2\u04a3\7\n\2\2\u04a3\u04a5\5\u0088E\2\u04a4\u04a2\3\2\2\2\u04a5"+
		"\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04aa\3\2"+
		"\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04a0\3\2\2\2\u04a9\u04a1\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04b3\7\t\2\2\u04ac\u04ad\5\u00e2"+
		"r\2\u04ad\u04ae\7\7\2\2\u04ae\u04b0\3\2\2\2\u04af\u04ac\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\5\u00e6t\2\u04b2\u049f"+
		"\3\2\2\2\u04b2\u04af\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u0475\3\2\2\2\u04b4"+
		"\u0478\3\2\2\2\u04b4\u047b\3\2\2\2\u04b4\u047e\3\2\2\2\u04b4\u0481\3\2"+
		"\2\2\u04b4\u0484\3\2\2\2\u04b4\u0494\3\2\2\2\u04b4\u0497\3\2\2\2\u04b4"+
		"\u049a\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2"+
		"\2\2\u04b7\u0089\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04ba\bF\1\2\u04ba"+
		"\u04be\5\u00d4k\2\u04bb\u04be\5\u00f4{\2\u04bc\u04be\5\u0094K\2\u04bd"+
		"\u04b9\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u04e6\3\2"+
		"\2\2\u04bf\u04c0\f\n\2\2\u04c0\u04c1\7\20\2\2\u04c1\u04e5\5\u008aF\13"+
		"\u04c2\u04c3\f\t\2\2\u04c3\u04c4\t\7\2\2\u04c4\u04e5\5\u008aF\n\u04c5"+
		"\u04c6\f\b\2\2\u04c6\u04c7\t\b\2\2\u04c7\u04e5\5\u008aF\t\u04c8\u04c9"+
		"\f\7\2\2\u04c9\u04ca\t\t\2\2\u04ca\u04e5\5\u008aF\b\u04cb\u04cc\f\6\2"+
		"\2\u04cc\u04cd\t\n\2\2\u04cd\u04e5\5\u008aF\7\u04ce\u04db\f\5\2\2\u04cf"+
		"\u04dc\7\13\2\2\u04d0\u04dc\7\33\2\2\u04d1\u04dc\7\34\2\2\u04d2\u04dc"+
		"\7\35\2\2\u04d3\u04dc\7h\2\2\u04d4\u04d5\7h\2\2\u04d5\u04dc\7t\2\2\u04d6"+
		"\u04dc\7_\2\2\u04d7\u04dc\7m\2\2\u04d8\u04dc\7Y\2\2\u04d9\u04dc\7o\2\2"+
		"\u04da\u04dc\7\u0085\2\2\u04db\u04cf\3\2\2\2\u04db\u04d0\3\2\2\2\u04db"+
		"\u04d1\3\2\2\2\u04db\u04d2\3\2\2\2\u04db\u04d3\3\2\2\2\u04db\u04d4\3\2"+
		"\2\2\u04db\u04d6\3\2\2\2\u04db\u04d7\3\2\2\2\u04db\u04d8\3\2\2\2\u04db"+
		"\u04d9\3\2\2\2\u04db\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e5\5\u008a"+
		"F\6\u04de\u04df\f\4\2\2\u04df\u04e0\7+\2\2\u04e0\u04e5\5\u008aF\5\u04e1"+
		"\u04e2\f\3\2\2\u04e2\u04e3\7{\2\2\u04e3\u04e5\5\u008aF\4\u04e4\u04bf\3"+
		"\2\2\2\u04e4\u04c2\3\2\2\2\u04e4\u04c5\3\2\2\2\u04e4\u04c8\3\2\2\2\u04e4"+
		"\u04cb\3\2\2\2\u04e4\u04ce\3\2\2\2\u04e4\u04de\3\2\2\2\u04e4\u04e1\3\2"+
		"\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u008b\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7\u00ba\2\2\u04ea\u04eb"+
		"\t\b\2\2\u04eb\u04ec\7\13\2\2\u04ec\u04ed\5\u0088E\2\u04ed\u008d\3\2\2"+
		"\2\u04ee\u04f1\5\16\b\2\u04ef\u04f1\5\20\t\2\u04f0\u04ee\3\2\2\2\u04f0"+
		"\u04ef\3\2\2\2\u04f1\u008f\3\2\2\2\u04f2\u04f6\7\u0084\2\2\u04f3\u04f4"+
		"\5\u00e2r\2\u04f4\u04f5\7\7\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f3\3\2\2"+
		"\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u0504\5\u00eex\2\u04f9"+
		"\u04fa\7\b\2\2\u04fa\u04ff\5\u0092J\2\u04fb\u04fc\7\n\2\2\u04fc\u04fe"+
		"\5\u0092J\2\u04fd\u04fb\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2"+
		"\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u0503"+
		"\7\t\2\2\u0503\u0505\3\2\2\2\u0504\u04f9\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0518\3\2\2\2\u0506\u0507\7y\2\2\u0507\u0510\t\13\2\2\u0508\u0509\7\u0092"+
		"\2\2\u0509\u0511\7v\2\2\u050a\u050b\7\u0092\2\2\u050b\u0511\7C\2\2\u050c"+
		"\u0511\7\64\2\2\u050d\u0511\7\u008a\2\2\u050e\u050f\7s\2\2\u050f\u0511"+
		"\7%\2\2\u0510\u0508\3\2\2\2\u0510\u050a\3\2\2\2\u0510\u050c\3\2\2\2\u0510"+
		"\u050d\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0515\3\2\2\2\u0512\u0513\7o"+
		"\2\2\u0513\u0515\5\u00dep\2\u0514\u0506\3\2\2\2\u0514\u0512\3\2\2\2\u0515"+
		"\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2"+
		"\2\2\u0518\u0519\3\2\2\2\u0519\u0528\3\2\2\2\u051a\u0518\3\2\2\2\u051b"+
		"\u051d\7t\2\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2"+
		"\2\2\u051e\u0523\7D\2\2\u051f\u0520\7b\2\2\u0520\u0524\7E\2\2\u0521\u0522"+
		"\7b\2\2\u0522\u0524\7^\2\2\u0523\u051f\3\2\2\2\u0523\u0521\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0527\7N\2\2\u0526\u0525\3\2"+
		"\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u051c\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u0091\3\2\2\2\u052a\u052b\5\u00dep\2\u052b\u0093"+
		"\3\2\2\2\u052c\u0530\5\u009aN\2\u052d\u0530\5\u0096L\2\u052e\u0530\5\u009e"+
		"P\2\u052f\u052c\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u052e\3\2\2\2\u0530"+
		"\u0095\3\2\2\2\u0531\u0532\5\u00e0q\2\u0532\u0534\7\b\2\2\u0533\u0535"+
		"\5\u0098M\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2"+
		"\2\u0536\u053a\7\t\2\2\u0537\u0539\7\6\2\2\u0538\u0537\3\2\2\2\u0539\u053c"+
		"\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0097\3\2\2\2\u053c"+
		"\u053a\3\2\2\2\u053d\u053f\t\3\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2"+
		"\2\2\u053f\u0540\3\2\2\2\u0540\u0548\5\u00c6d\2\u0541\u0543\7\n\2\2\u0542"+
		"\u0544\t\3\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2"+
		"\2\2\u0545\u0547\5\u00c6d\2\u0546\u0541\3\2\2\2\u0547\u054a\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0099\3\2\2\2\u054a\u0548\3\2"+
		"\2\2\u054b\u054c\5\u00e0q\2\u054c\u054e\7\b\2\2\u054d\u054f\5\u009cO\2"+
		"\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0554"+
		"\7\t\2\2\u0551\u0553\7\6\2\2\u0552\u0551\3\2\2\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u009b\3\2\2\2\u0556\u0554\3\2"+
		"\2\2\u0557\u055c\5\u00a2R\2\u0558\u0559\7\n\2\2\u0559\u055b\5\u00a2R\2"+
		"\u055a\u0558\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u009d\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0560\5\u00e0q"+
		"\2\u0560\u0562\7\b\2\2\u0561\u0563\7I\2\2\u0562\u0561\3\2\2\2\u0562\u0563"+
		"\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\5\u00a2R\2\u0565\u0566\7\n\2"+
		"\2\u0566\u0567\5\u00a0Q\2\u0567\u056b\7\t\2\2\u0568\u056a\7\6\2\2\u0569"+
		"\u0568\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2"+
		"\2\2\u056c\u009f\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u056f\7\u00ae\2\2\u056f"+
		"\u057c\7\b\2\2\u0570\u0572\7I\2\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2"+
		"\2\2\u0572\u0573\3\2\2\2\u0573\u0578\5\u00a2R\2\u0574\u0575\7\n\2\2\u0575"+
		"\u0577\5\u00a2R\2\u0576\u0574\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057d\3\2\2\2\u057a\u0578\3\2\2\2\u057b"+
		"\u057d\7\f\2\2\u057c\u0571\3\2\2\2\u057c\u057b\3\2\2\2\u057d\u057e\3\2"+
		"\2\2\u057e\u057f\7\t\2\2\u057f\u0580\5r:\2\u0580\u00a1\3\2\2\2\u0581\u0582"+
		"\5\u0088E\2\u0582\u00a3\3\2\2\2\u0583\u0586\5\u00a6T\2\u0584\u0586\5\u00b0"+
		"Y\2\u0585\u0583\3\2\2\2\u0585\u0584\3\2\2\2\u0586\u00a5\3\2\2\2\u0587"+
		"\u0588\7\36\2\2\u0588\u058d\5\u00a8U\2\u0589\u058a\7\n\2\2\u058a\u058c"+
		"\5\u00a8U\2\u058b\u0589\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2"+
		"\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0591"+
		"\7\37\2\2\u0591\u00a7\3\2\2\2\u0592\u0593\5\u00aaV\2\u0593\u0594\7!\2"+
		"\2\u0594\u0595\5\u00acW\2\u0595\u00a9\3\2\2\2\u0596\u0597\7\u00ba\2\2"+
		"\u0597\u00ab\3\2\2\2\u0598\u059e\7\u00ba\2\2\u0599\u059e\5\u00b0Y\2\u059a"+
		"\u059e\5\u00a6T\2\u059b\u059e\5\u00aeX\2\u059c\u059e\5\u0088E\2\u059d"+
		"\u0598\3\2\2\2\u059d\u0599\3\2\2\2\u059d\u059a\3\2\2\2\u059d\u059b\3\2"+
		"\2\2\u059d\u059c\3\2\2\2\u059e\u00ad\3\2\2\2\u059f\u05a0\7\"\2\2\u05a0"+
		"\u05a5\5\u0088E\2\u05a1\u05a2\7\n\2\2\u05a2\u05a4\5\u0088E\2\u05a3\u05a1"+
		"\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6"+
		"\u05a8\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\7#\2\2\u05a9\u00af\3\2"+
		"\2\2\u05aa\u05ab\7\"\2\2\u05ab\u05b0\5\u00a6T\2\u05ac\u05ad\7\n\2\2\u05ad"+
		"\u05af\5\u00a6T\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae"+
		"\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3"+
		"\u05b4\7#\2\2\u05b4\u00b1\3\2\2\2\u05b5\u05b8\5\u00eav\2\u05b6\u05b7\7"+
		"8\2\2\u05b7\u05b9\5\u00ecw\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05bb\3\2\2\2\u05ba\u05bc\t\4\2\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2"+
		"\2\2\u05bc\u00b3\3\2\2\2\u05bd\u05be\7<\2\2\u05be\u05c0\5\u00dep\2\u05bf"+
		"\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05ca\3\2\2\2\u05c1\u05cb\5\u00b6"+
		"\\\2\u05c2\u05cb\5\u00bc_\2\u05c3\u05cb\5\u00ba^\2\u05c4\u05c5\7\67\2"+
		"\2\u05c5\u05c6\7\b\2\2\u05c6\u05c7\5\u0088E\2\u05c7\u05c8\7\t\2\2\u05c8"+
		"\u05cb\3\2\2\2\u05c9\u05cb\5\u00b8]\2\u05ca\u05c1\3\2\2\2\u05ca\u05c2"+
		"\3\2\2\2\u05ca\u05c3\3\2\2\2\u05ca\u05c4\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb"+
		"\u00b5\3\2\2\2\u05cc\u05cd\7\u0080\2\2\u05cd\u05ce\7k\2\2\u05ce\u05cf"+
		"\7\b\2\2\u05cf\u05d4\5\u00b2Z\2\u05d0\u05d1\7\n\2\2\u05d1\u05d3\5\u00b2"+
		"Z\2\u05d2\u05d0\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4"+
		"\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8\7\t"+
		"\2\2\u05d8\u00b7\3\2\2\2\u05d9\u05da\7V\2\2\u05da\u05db\7k\2\2\u05db\u05dc"+
		"\7\b\2\2\u05dc\u05e1\5\u00be`\2\u05dd\u05de\7\n\2\2\u05de\u05e0\5\u00be"+
		"`\2\u05df\u05dd\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05e5\7\t"+
		"\2\2\u05e5\u05e6\5\u0090I\2\u05e6\u00b9\3\2\2\2\u05e7\u05e9\7\u009c\2"+
		"\2\u05e8\u05ea\7k\2\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec"+
		"\3\2\2\2\u05eb\u05ed\5\u00dep\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2"+
		"\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\7\b\2\2\u05ef\u05f4\5\u00b2Z\2\u05f0"+
		"\u05f1\7\n\2\2\u05f1\u05f3\5\u00b2Z\2\u05f2\u05f0\3\2\2\2\u05f3\u05f6"+
		"\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6"+
		"\u05f4\3\2\2\2\u05f7\u05f8\7\t\2\2\u05f8\u00bb\3\2\2\2\u05f9\u05fb\7k"+
		"\2\2\u05fa\u05fc\5\u00dep\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u05fe\7\b\2\2\u05fe\u0603\5\u00b2Z\2\u05ff\u0600"+
		"\7\n\2\2\u0600\u0602\5\u00b2Z\2\u0601\u05ff\3\2\2\2\u0602\u0605\3\2\2"+
		"\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0606\3\2\2\2\u0605\u0603"+
		"\3\2\2\2\u0606\u0607\7\t\2\2\u0607\u00bd\3\2\2\2\u0608\u0609\5\u00eav"+
		"\2\u0609\u00bf\3\2\2\2\u060a\u060b\5\u00e2r\2\u060b\u060c\7\7\2\2\u060c"+
		"\u060e\3\2\2\2\u060d\u060a\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2"+
		"\2\2\u060f\u0615\5\u00e6t\2\u0610\u0611\7a\2\2\u0611\u0612\7\63\2\2\u0612"+
		"\u0616\5\u00f0y\2\u0613\u0614\7t\2\2\u0614\u0616\7a\2\2\u0615\u0610\3"+
		"\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u00c1\3\2\2\2\u0617"+
		"\u061a\5\u0088E\2\u0618\u0619\78\2\2\u0619\u061b\5\u00ecw\2\u061a\u0618"+
		"\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\t\4\2\2\u061d"+
		"\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u00c3\3\2\2\2\u061f\u062b\5\u00e6"+
		"t\2\u0620\u0621\7\b\2\2\u0621\u0626\5\u00eav\2\u0622\u0623\7\n\2\2\u0623"+
		"\u0625\5\u00eav\2\u0624\u0622\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624"+
		"\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\3\2\2\2\u0628\u0626\3\2\2\2\u0629"+
		"\u062a\7\t\2\2\u062a\u062c\3\2\2\2\u062b\u0620\3\2\2\2\u062b\u062c\3\2"+
		"\2\2\u062c\u062d\3\2\2\2\u062d\u062e\7,\2\2\u062e\u062f\7\b\2\2\u062f"+
		"\u0630\5N(\2\u0630\u0631\7\t\2\2\u0631\u00c5\3\2\2\2\u0632\u063f\7\f\2"+
		"\2\u0633\u0634\5\u00e6t\2\u0634\u0635\7\7\2\2\u0635\u0636\7\f\2\2\u0636"+
		"\u063f\3\2\2\2\u0637\u063c\5\u0088E\2\u0638\u063a\7,\2\2\u0639\u0638\3"+
		"\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\5\u00dan\2"+
		"\u063c\u0639\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u0632"+
		"\3\2\2\2\u063e\u0633\3\2\2\2\u063e\u0637\3\2\2\2\u063f\u00c7\3\2\2\2\u0640"+
		"\u0641\5\u00e2r\2\u0641\u0642\7\7\2\2\u0642\u0644\3\2\2\2\u0643\u0640"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u064a\5\u00e6t"+
		"\2\u0646\u0648\7,\2\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649"+
		"\3\2\2\2\u0649\u064b\5\u00f2z\2\u064a\u0647\3\2\2\2\u064a\u064b\3\2\2"+
		"\2\u064b\u0651\3\2\2\2\u064c\u064d\7a\2\2\u064d\u064e\7\63\2\2\u064e\u0652"+
		"\5\u00f0y\2\u064f\u0650\7t\2\2\u0650\u0652\7a\2\2\u0651\u064c\3\2\2\2"+
		"\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0670\3\2\2\2\u0653\u065d"+
		"\7\b\2\2\u0654\u0659\5\u00c8e\2\u0655\u0656\7\n\2\2\u0656\u0658\5\u00c8"+
		"e\2\u0657\u0655\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u0659"+
		"\u065a\3\2\2\2\u065a\u065e\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u065e\5\u00ca"+
		"f\2\u065d\u0654\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0664\7\t\2\2\u0660\u0662\7,\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2"+
		"\2\2\u0662\u0663\3\2\2\2\u0663\u0665\5\u00f2z\2\u0664\u0661\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0670\3\2\2\2\u0666\u0667\7\b\2\2\u0667\u0668\5N"+
		"(\2\u0668\u066d\7\t\2\2\u0669\u066b\7,\2\2\u066a\u0669\3\2\2\2\u066a\u066b"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066e\5\u00f2z\2\u066d\u066a\3\2\2"+
		"\2\u066d\u066e\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u0643\3\2\2\2\u066f\u0653"+
		"\3\2\2\2\u066f\u0666\3\2\2\2\u0670\u00c9\3\2\2\2\u0671\u0678\5\u00c8e"+
		"\2\u0672\u0673\5\u00ccg\2\u0673\u0674\5\u00c8e\2\u0674\u0675\5\u00ceh"+
		"\2\u0675\u0677\3\2\2\2\u0676\u0672\3\2\2\2\u0677\u067a\3\2\2\2\u0678\u0676"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u00cb\3\2\2\2\u067a\u0678\3\2\2\2\u067b"+
		"\u0685\7\n\2\2\u067c\u067e\7l\2\2\u067d\u067f\7}\2\2\u067e\u067d\3\2\2"+
		"\2\u067e\u067f\3\2\2\2\u067f\u0682\3\2\2\2\u0680\u0682\7c\2\2\u0681\u067c"+
		"\3\2\2\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683"+
		"\u0685\7j\2\2\u0684\u067b\3\2\2\2\u0684\u0681\3\2\2\2\u0685\u00cd\3\2"+
		"\2\2\u0686\u0687\7y\2\2\u0687\u0689\5\u0088E\2\u0688\u0686\3\2\2\2\u0688"+
		"\u0689\3\2\2\2\u0689\u00cf\3\2\2\2\u068a\u068c\7\u0091\2\2\u068b\u068d"+
		"\t\3\2\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e"+
		"\u0693\5\u00c6d\2\u068f\u0690\7\n\2\2\u0690\u0692\5\u00c6d\2\u0691\u068f"+
		"\3\2\2\2\u0692\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u06a2\3\2\2\2\u0695\u0693\3\2\2\2\u0696\u06a0\7W\2\2\u0697\u069c\5\u00c8"+
		"e\2\u0698\u0699\7\n\2\2\u0699\u069b\5\u00c8e\2\u069a\u0698\3\2\2\2\u069b"+
		"\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a1\3\2"+
		"\2\2\u069e\u069c\3\2\2\2\u069f\u06a1\5\u00caf\2\u06a0\u0697\3\2\2\2\u06a0"+
		"\u069f\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u0696\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a5\7\u00a4\2\2\u06a5\u06a7\5\u0088E"+
		"\2\u06a6\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06b6\3\2\2\2\u06a8\u06a9"+
		"\7Z\2\2\u06a9\u06aa\7\63\2\2\u06aa\u06af\5\u0088E\2\u06ab\u06ac\7\n\2"+
		"\2\u06ac\u06ae\5\u0088E\2\u06ad\u06ab\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af"+
		"\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b4\3\2\2\2\u06b1\u06af\3\2"+
		"\2\2\u06b2\u06b3\7[\2\2\u06b3\u06b5\5\u0088E\2\u06b4\u06b2\3\2\2\2\u06b4"+
		"\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06a8\3\2\2\2\u06b6\u06b7\3\2"+
		"\2\2\u06b7\u06d5\3\2\2\2\u06b8\u06b9\7\u00a0\2\2\u06b9\u06ba\7\b\2\2\u06ba"+
		"\u06bf\5\u0088E\2\u06bb\u06bc\7\n\2\2\u06bc\u06be\5\u0088E\2\u06bd\u06bb"+
		"\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0"+
		"\u06c2\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c2\u06d1\7\t\2\2\u06c3\u06c4\7\n"+
		"\2\2\u06c4\u06c5\7\b\2\2\u06c5\u06ca\5\u0088E\2\u06c6\u06c7\7\n\2\2\u06c7"+
		"\u06c9\5\u0088E\2\u06c8\u06c6\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8"+
		"\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd"+
		"\u06ce\7\t\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06c3\3\2\2\2\u06d0\u06d3\3\2"+
		"\2\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3"+
		"\u06d1\3\2\2\2\u06d4\u068a\3\2\2\2\u06d4\u06b8\3\2\2\2\u06d5\u00d1\3\2"+
		"\2\2\u06d6\u06d8\t\b\2\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06dc\7\u00bb\2\2\u06da\u06dc\7\f\2\2\u06db\u06d7"+
		"\3\2\2\2\u06db\u06da\3\2\2\2\u06dc\u00d3\3\2\2\2\u06dd\u06e6\7\u00bb\2"+
		"\2\u06de\u06e6\7\u00bd\2\2\u06df\u06e6\7\u00be\2\2\u06e0\u06e6\7v\2\2"+
		"\u06e1\u06e6\7@\2\2\u06e2\u06e6\7?\2\2\u06e3\u06e6\7A\2\2\u06e4\u06e6"+
		"\5\u00f6|\2\u06e5\u06dd\3\2\2\2\u06e5\u06de\3\2\2\2\u06e5\u06df\3\2\2"+
		"\2\u06e5\u06e0\3\2\2\2\u06e5\u06e1\3\2\2\2\u06e5\u06e2\3\2\2\2\u06e5\u06e3"+
		"\3\2\2\2\u06e5\u06e4\3\2\2\2\u06e6\u00d5\3\2\2\2\u06e7\u06e8\t\f\2\2\u06e8"+
		"\u00d7\3\2\2\2\u06e9\u06ea\7\u00bd\2\2\u06ea\u00d9\3\2\2\2\u06eb\u06ec"+
		"\t\r\2\2\u06ec\u00db\3\2\2\2\u06ed\u06ee\t\16\2\2\u06ee\u00dd\3\2\2\2"+
		"\u06ef\u06f0\5\u00f4{\2\u06f0\u00df\3\2\2\2\u06f1\u06f2\5\u00f4{\2\u06f2"+
		"\u00e1\3\2\2\2\u06f3\u06f4\5\u00f4{\2\u06f4\u00e3\3\2\2\2\u06f5\u06f6"+
		"\5\u00f4{\2\u06f6\u00e5\3\2\2\2\u06f7\u06f8\5\u00f4{\2\u06f8\u00e7\3\2"+
		"\2\2\u06f9\u06fa\5\u00f4{\2\u06fa\u00e9\3\2\2\2\u06fb\u06fc\5\u00f4{\2"+
		"\u06fc\u00eb\3\2\2\2\u06fd\u06fe\5\u00f4{\2\u06fe\u00ed\3\2\2\2\u06ff"+
		"\u0700\5\u00f4{\2\u0700\u00ef\3\2\2\2\u0701\u0702\5\u00f4{\2\u0702\u00f1"+
		"\3\2\2\2\u0703\u0704\5\u00f4{\2\u0704\u00f3\3\2\2\2\u0705\u070c\7\u00ba"+
		"\2\2\u0706\u070c\7\u00bd\2\2\u0707\u0708\7\b\2\2\u0708\u0709\5\u00f4{"+
		"\2\u0709\u070a\7\t\2\2\u070a\u070c\3\2\2\2\u070b\u0705\3\2\2\2\u070b\u0706"+
		"\3\2\2\2\u070b\u0707\3\2\2\2\u070c\u00f5\3\2\2\2\u070d\u070e\t\17\2\2"+
		"\u070e\u00f7\3\2\2\2\u00ea\u00fc\u00fe\u010a\u010f\u0115\u011b\u011d\u0128"+
		"\u012e\u0132\u0134\u013a\u0149\u0150\u0157\u0163\u0167\u016a\u016f\u0172"+
		"\u017b\u0183\u018a\u0190\u0196\u019a\u01a1\u01a4\u01a7\u01af\u01b2\u01b5"+
		"\u01ba\u01c3\u01c7\u01c9\u01ce\u01d2\u01d4\u01da\u01e2\u01f0\u01f5\u01f9"+
		"\u01fe\u0203\u0208\u0210\u021f\u0224\u0228\u022a\u0234\u0237\u0243\u0247"+
		"\u024e\u0257\u0261\u0264\u0273\u0278\u0281\u0283\u028a\u0291\u0296\u029f"+
		"\u02a1\u02ab\u02ba\u02bf\u02c8\u02ca\u02d1\u02d8\u02de\u02e3\u02ef\u02f2"+
		"\u02f8\u02fa\u0301\u030a\u030f\u0318\u0323\u032a\u0330\u033a\u033d\u0343"+
		"\u0345\u0349\u0350\u0359\u035d\u035f\u0363\u036c\u0371\u0373\u037c\u0387"+
		"\u038e\u0391\u03a0\u03a5\u03aa\u03ac\u03b3\u03ba\u03bf\u03c3\u03c6\u03ca"+
		"\u03d9\u03de\u03e1\u03f6\u03fc\u03fe\u0402\u0407\u040a\u040f\u0419\u041d"+
		"\u0422\u0426\u042d\u0450\u045b\u0460\u046a\u046d\u0473\u0491\u049c\u04a6"+
		"\u04a9\u04af\u04b2\u04b4\u04b6\u04bd\u04db\u04e4\u04e6\u04f0\u04f6\u04ff"+
		"\u0504\u0510\u0514\u0518\u051c\u0523\u0526\u0528\u052f\u0534\u053a\u053e"+
		"\u0543\u0548\u054e\u0554\u055c\u0562\u056b\u0571\u0578\u057c\u0585\u058d"+
		"\u059d\u05a5\u05b0\u05b8\u05bb\u05bf\u05ca\u05d4\u05e1\u05e9\u05ec\u05f4"+
		"\u05fb\u0603\u060d\u0615\u061a\u061d\u0626\u062b\u0639\u063c\u063e\u0643"+
		"\u0647\u064a\u0651\u0659\u065d\u0661\u0664\u066a\u066d\u066f\u0678\u067e"+
		"\u0681\u0684\u0688\u068c\u0693\u069c\u06a0\u06a2\u06a6\u06af\u06b4\u06b6"+
		"\u06bf\u06ca\u06d1\u06d4\u06d7\u06db\u06e5\u070b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}