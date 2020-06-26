// Generated from D:/compiler version seconde semester/Compiler for the seconde semester/kkkk/Compiler 2 one for (seconde semester )/Compiler 2 one for (seconde semester )/src\SQL.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, DOUBEL=3, SCOL=4, DOT=5, OPEN_PAR=6, CLOSE_PAR=7, OPEN_SQER_BAR=8, 
		CLOSE_SQER_PAR=9, OPEN_BRACKET=10, CLOSE_BRACKET=11, COMMA=12, COLON=13, 
		ASSIGN=14, STAR=15, POWER=16, PLUS=17, MINUS=18, TILDE=19, PIPE2=20, DIV=21, 
		MOD=22, LT2=23, GT2=24, GT3=25, AMP=26, AMP2=27, PIPE=28, LT=29, LT_EQ=30, 
		GT=31, GT_EQ=32, EQ=33, NOT_EQ1=34, NOT_EQ2=35, PLUS_PLUS=36, MINUS_MINUS=37, 
		QUESTION_MARK=38, K_ABORT=39, K_ACTION=40, K_ADD=41, K_AFTER=42, K_ALL=43, 
		K_ALTER=44, K_ANALYZE=45, K_AND=46, K_AS=47, K_ASC=48, K_ATTACH=49, K_AUTOINCREMENT=50, 
		K_BEFORE=51, K_BEGIN=52, K_BETWEEN=53, K_BY=54, K_BREAK=55, K_CASCADE=56, 
		K_CASE=57, K_CAST=58, K_CHECK=59, K_COLLATE=60, K_COLUMN=61, K_COMMIT=62, 
		K_CONFLICT=63, K_CONSTRAINT=64, K_CREATE=65, K_CROSS=66, K_CURRENT_DATE=67, 
		K_CURRENT_TIME=68, K_CURRENT_TIMESTAMP=69, K_DATABASE=70, K_DEFAULT=71, 
		K_DEFERRABLE=72, K_DEFERRED=73, K_DELETE=74, K_DESC=75, K_DO=76, K_DETACH=77, 
		K_DISTINCT=78, K_DROP=79, K_EACH=80, K_ELSE=81, K_ELSE_IF=82, K_END=83, 
		K_ENABLE=84, K_ESCAPE=85, K_EXCEPT=86, K_EXCLUSIVE=87, K_EXISTS=88, K_EXPLAIN=89, 
		K_FAIL=90, K_FALSE=91, K_FUNCTION=92, K_FOR=93, K_FOREACH=94, K_FOREIGN=95, 
		K_FROM=96, K_FULL=97, K_GLOB=98, K_GROUP=99, K_HAVING=100, K_IF=101, K_IGNORE=102, 
		K_IMMEDIATE=103, K_IN=104, K_INDEX=105, K_INDEXED=106, K_INITIALLY=107, 
		K_INNER=108, K_INSERT=109, K_INSTEAD=110, K_INTERSECT=111, K_INTO=112, 
		K_IS=113, K_ISNULL=114, K_JOIN=115, K_KEY=116, K_LEFT=117, K_LIKE=118, 
		K_LIMIT=119, K_MATCH=120, K_NATURAL=121, K_NEXTVAL=122, K_NO=123, K_NOT=124, 
		K_NOTNULL=125, K_NULL=126, K_OF=127, K_OFFSET=128, K_ON=129, K_ONLY=130, 
		K_OR=131, K_ORDER=132, K_OUTER=133, K_PLAN=134, K_PRAGMA=135, K_PRIMARY=136, 
		K_PRINT=137, K_QUERY=138, K_RAISE=139, K_RECURSIVE=140, K_REFERENCES=141, 
		K_REGEXP=142, K_REINDEX=143, K_RELEASE=144, K_RETURN=145, K_RENAME=146, 
		K_REPLACE=147, K_RESTRICT=148, K_RIGHT=149, K_ROLLBACK=150, K_ROW=151, 
		K_SAVEPOINT=152, K_SELECT=153, K_SET=154, K_SWITCH=155, K_TABLE=156, K_TEMP=157, 
		K_TEMPORARY=158, K_THEN=159, K_TO=160, K_TRANSACTION=161, K_TRUE=162, 
		K_TRIGGER=163, K_UNION=164, K_UNIQUE=165, K_UPDATE=166, K_USING=167, K_VACUUM=168, 
		K_VALUES=169, K_VAR=170, K_VIEW=171, K_VIRTUAL=172, K_WHEN=173, K_WHERE=174, 
		K_WITH=175, K_WITHOUT=176, K_WHILE=177, K_CONTINUE=178, K_JSON=179, K_AGGREGATION=180, 
		K_STRING=181, K_BOOLEAN=182, K_NUMBER=183, ONE_CHAR_LETTER=184, STRING_LITERAL=185, 
		IDENTIFIER=186, RANDOM_NAME=187, NUMERIC_LITERAL=188, BIND_PARAMETER=189, 
		BLOB_LITERAL=190, MULTILINE_COMMENT=191, SPACES=192, UNEXPECTED_CHAR=193;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_renametable = 5, RULE_addcolumn = 6, RULE_alter_table_add_constraint = 7, 
		RULE_alter_table_add = 8, RULE_create_table_stmt = 9, RULE_delete_stmt = 10, 
		RULE_drop_table_stmt = 11, RULE_factored_select_stmt = 12, RULE_insert_stmt = 13, 
		RULE_select_stmt = 14, RULE_limit_expr = 15, RULE_select_or_values = 16, 
		RULE_where_expr = 17, RULE_update_stmt = 18, RULE_asign_expr_to_column = 19, 
		RULE_column_def = 20, RULE_type_name = 21, RULE_signed_number1 = 22, RULE_signed_number2 = 23, 
		RULE_column_constraint = 24, RULE_column_check = 25, RULE_column_unique = 26, 
		RULE_column_constraint_primary_key = 27, RULE_column_constraint_foreign_key = 28, 
		RULE_column_constraint_not_null = 29, RULE_column_constraint_null = 30, 
		RULE_column_default = 31, RULE_column_default_value = 32, RULE_expr = 33, 
		RULE_commn_expr_opreator = 34, RULE_foreign_key_clause = 35, RULE_fk_target_column_name = 36, 
		RULE_indexed_column = 37, RULE_table_constraint = 38, RULE_table_check = 39, 
		RULE_table_constraint_primary_key = 40, RULE_table_constraint_foreign_key = 41, 
		RULE_table_constraint_unique = 42, RULE_table_constraint_key = 43, RULE_fk_origin_column_name = 44, 
		RULE_qualified_table_name = 45, RULE_ordering_term = 46, RULE_pragma_value = 47, 
		RULE_common_table_expression = 48, RULE_result_column = 49, RULE_table_or_subquery = 50, 
		RULE_join_clause = 51, RULE_join_operator = 52, RULE_join_constraint = 53, 
		RULE_select_core = 54, RULE_list_of_expr = 55, RULE_list_of_list_of_expr = 56, 
		RULE_having_expr = 57, RULE_cte_table_name = 58, RULE_signed_number = 59, 
		RULE_literal_value = 60, RULE_unary_operator = 61, RULE_error_message = 62, 
		RULE_module_argument = 63, RULE_column_alias = 64, RULE_keyword = 65, 
		RULE_unknown = 66, RULE_name = 67, RULE_function_name = 68, RULE_database_name = 69, 
		RULE_source_table_name = 70, RULE_table_name = 71, RULE_table_or_index_name = 72, 
		RULE_new_table_name = 73, RULE_column_name = 74, RULE_collation_name = 75, 
		RULE_foreign_table = 76, RULE_index_name = 77, RULE_trigger_name = 78, 
		RULE_view_name = 79, RULE_module_name = 80, RULE_pragma_name = 81, RULE_savepoint_name = 82, 
		RULE_table_alias = 83, RULE_transaction_name = 84, RULE_any_name = 85, 
		RULE_create_aggregation_function = 86, RULE_jar_pathe = 87, RULE_parames = 88, 
		RULE_funtion = 89, RULE_function_header = 90, RULE_function_body = 91, 
		RULE_sub_function_body = 92, RULE_instructions = 93, RULE_functional_instruction = 94, 
		RULE_nonfunctional_instruction = 95, RULE_call_function = 96, RULE_callback_func = 97, 
		RULE_args = 98, RULE_prameters = 99, RULE_return_rule = 100, RULE_exiting_loops = 101, 
		RULE_return_type = 102, RULE_print_statment = 103, RULE_indisde_the_print = 104, 
		RULE_if_else_rule = 105, RULE_if_rule = 106, RULE_else_if_rule = 107, 
		RULE_else_rulse = 108, RULE_while_rule = 109, RULE_do_while = 110, RULE_for_loop_rule = 111, 
		RULE_inside_for_loop = 112, RULE_foreach = 113, RULE_switch_rule = 114, 
		RULE_defult = 115, RULE_case_rule = 116, RULE_grnral_creating = 117, RULE_creating_with_assign = 118, 
		RULE_creat_without_assign = 119, RULE_genral_assign = 120, RULE_varible_name = 121, 
		RULE_assign_varible = 122, RULE_create_varible_without_assign = 123, RULE_create_varible_with_assign = 124, 
		RULE_array_name = 125, RULE_assign_array = 126, RULE_create_array_form = 127, 
		RULE_create_Array_without_assign = 128, RULE_create_Array_with_assign = 129, 
		RULE_array_base_form_without_index = 130, RULE_array_base_form_with_index = 131, 
		RULE_array_identifier_form = 132, RULE_array_boolean_form = 133, RULE_array_integer_form = 134, 
		RULE_array_charecter_form = 135, RULE_array_objects_form = 136, RULE_array_objects_form2 = 137, 
		RULE_array_varible_form = 138, RULE_array_anyType_form = 139, RULE_array_arrayes_form = 140, 
		RULE_value_left_side = 141, RULE_left_side_array = 142, RULE_json_name = 143, 
		RULE_assign_json = 144, RULE_create_json_form = 145, RULE_create_json_object_without_assign = 146, 
		RULE_create_json_with_assign = 147, RULE_inside_json_statmnet = 148, RULE_json_statment = 149, 
		RULE_value_json_statmnet = 150, RULE_varible_from_object = 151, RULE_shortcut_statments = 152, 
		RULE_any_arithmetic_oprator = 153, RULE_expression = 154, RULE_intral_expression_value = 155, 
		RULE_use_random_name = 156;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "renametable", 
			"addcolumn", "alter_table_add_constraint", "alter_table_add", "create_table_stmt", 
			"delete_stmt", "drop_table_stmt", "factored_select_stmt", "insert_stmt", 
			"select_stmt", "limit_expr", "select_or_values", "where_expr", "update_stmt", 
			"asign_expr_to_column", "column_def", "type_name", "signed_number1", 
			"signed_number2", "column_constraint", "column_check", "column_unique", 
			"column_constraint_primary_key", "column_constraint_foreign_key", "column_constraint_not_null", 
			"column_constraint_null", "column_default", "column_default_value", "expr", 
			"commn_expr_opreator", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_check", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "list_of_expr", "list_of_list_of_expr", 
			"having_expr", "cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name", 
			"create_aggregation_function", "jar_pathe", "parames", "funtion", "function_header", 
			"function_body", "sub_function_body", "instructions", "functional_instruction", 
			"nonfunctional_instruction", "call_function", "callback_func", "args", 
			"prameters", "return_rule", "exiting_loops", "return_type", "print_statment", 
			"indisde_the_print", "if_else_rule", "if_rule", "else_if_rule", "else_rulse", 
			"while_rule", "do_while", "for_loop_rule", "inside_for_loop", "foreach", 
			"switch_rule", "defult", "case_rule", "grnral_creating", "creating_with_assign", 
			"creat_without_assign", "genral_assign", "varible_name", "assign_varible", 
			"create_varible_without_assign", "create_varible_with_assign", "array_name", 
			"assign_array", "create_array_form", "create_Array_without_assign", "create_Array_with_assign", 
			"array_base_form_without_index", "array_base_form_with_index", "array_identifier_form", 
			"array_boolean_form", "array_integer_form", "array_charecter_form", "array_objects_form", 
			"array_objects_form2", "array_varible_form", "array_anyType_form", "array_arrayes_form", 
			"value_left_side", "left_side_array", "json_name", "assign_json", "create_json_form", 
			"create_json_object_without_assign", "create_json_with_assign", "inside_json_statmnet", 
			"json_statment", "value_json_statmnet", "varible_from_object", "shortcut_statments", 
			"any_arithmetic_oprator", "expression", "intral_expression_value", "use_random_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'[]'", "'\"'", "';'", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "','", "':'", "'='", "'*'", "'^'", "'+'", "'-'", "'~'", 
			"'||'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'&'", "'&&'", "'|'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "'++'", "'--'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DOUBEL", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_SQER_BAR", 
			"CLOSE_SQER_PAR", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "COLON", 
			"ASSIGN", "STAR", "POWER", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", 
			"MOD", "LT2", "GT2", "GT3", "AMP", "AMP2", "PIPE", "LT", "LT_EQ", "GT", 
			"GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "PLUS_PLUS", "MINUS_MINUS", "QUESTION_MARK", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BY", "K_BREAK", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DO", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
			"K_ELSE_IF", "K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", 
			"K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FALSE", "K_FUNCTION", "K_FOR", 
			"K_FOREACH", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", 
			"K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_PRINT", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RETURN", "K_RENAME", 
			"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
			"K_SELECT", "K_SET", "K_SWITCH", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRUE", "K_TRIGGER", "K_UNION", 
			"K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VAR", "K_VIEW", 
			"K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_WHILE", "K_CONTINUE", 
			"K_JSON", "K_AGGREGATION", "K_STRING", "K_BOOLEAN", "K_NUMBER", "ONE_CHAR_LETTER", 
			"STRING_LITERAL", "IDENTIFIER", "RANDOM_NAME", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
		public List<Create_aggregation_functionContext> create_aggregation_function() {
			return getRuleContexts(Create_aggregation_functionContext.class);
		}
		public Create_aggregation_functionContext create_aggregation_function(int i) {
			return getRuleContext(Create_aggregation_functionContext.class,i);
		}
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<FuntionContext> funtion() {
			return getRuleContexts(FuntionContext.class);
		}
		public FuntionContext funtion(int i) {
			return getRuleContext(FuntionContext.class,i);
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
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_ALTER || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DELETE - 65)) | (1L << (K_DROP - 65)) | (1L << (K_FUNCTION - 65)) | (1L << (K_INSERT - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_SELECT - 153)) | (1L << (K_UPDATE - 153)) | (1L << (K_VALUES - 153)) | (1L << (RANDOM_NAME - 153)) | (1L << (UNEXPECTED_CHAR - 153)))) != 0)) {
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(314);
					create_aggregation_function();
					}
					break;
				case 2:
					{
					setState(315);
					sql_stmt_list();
					}
					break;
				case 3:
					{
					setState(316);
					error();
					}
					break;
				case 4:
					{
					setState(317);
					funtion();
					}
					break;
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
			setState(325);
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(328);
				match(SCOL);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			sql_stmt();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(335);
						match(SCOL);
						}
						}
						setState(338); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(340);
					sql_stmt();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(SCOL);
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public Create_aggregation_functionContext create_aggregation_function() {
			return getRuleContext(Create_aggregation_functionContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(352);
				create_aggregation_function();
				}
				break;
			case 2:
				{
				setState(353);
				alter_table_stmt();
				}
				break;
			case 3:
				{
				setState(354);
				create_table_stmt();
				}
				break;
			case 4:
				{
				setState(355);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(356);
				drop_table_stmt();
				}
				break;
			case 6:
				{
				setState(357);
				factored_select_stmt();
				}
				break;
			case 7:
				{
				setState(358);
				insert_stmt();
				}
				break;
			case 8:
				{
				setState(359);
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public RenametableContext renametable() {
			return getRuleContext(RenametableContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public AddcolumnContext addcolumn() {
			return getRuleContext(AddcolumnContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
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
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(K_ALTER);
			setState(363);
			match(K_TABLE);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(364);
				database_name();
				setState(365);
				match(DOT);
				}
				break;
			}
			setState(369);
			source_table_name();
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(370);
				renametable();
				}
				break;
			case 2:
				{
				setState(371);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(372);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(373);
				addcolumn();
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

	public static class RenametableContext extends ParserRuleContext {
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public RenametableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renametable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRenametable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRenametable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRenametable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenametableContext renametable() throws RecognitionException {
		RenametableContext _localctx = new RenametableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_renametable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(K_RENAME);
			setState(377);
			match(K_TO);
			setState(378);
			new_table_name();
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

	public static class AddcolumnContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public AddcolumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcolumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAddcolumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAddcolumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAddcolumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddcolumnContext addcolumn() throws RecognitionException {
		AddcolumnContext _localctx = new AddcolumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addcolumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(K_ADD);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLUMN) {
				{
				setState(381);
				match(K_COLUMN);
				}
			}

			setState(384);
			column_def();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 14, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(K_ADD);
			setState(387);
			match(K_CONSTRAINT);
			setState(388);
			use_random_name();
			setState(389);
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
		enterRule(_localctx, 16, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(K_ADD);
			setState(392);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 18, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(K_CREATE);
			setState(395);
			match(K_TABLE);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(396);
				match(K_IF);
				setState(397);
				match(K_NOT);
				setState(398);
				match(K_EXISTS);
				}
			}

			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(401);
				database_name();
				setState(402);
				match(DOT);
				}
				break;
			}
			setState(406);
			table_name();
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(407);
				match(OPEN_PAR);
				setState(408);
				column_def();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(409);
						match(COMMA);
						setState(410);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(411);
						match(COMMA);
						setState(412);
						column_def();
						}
						break;
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(420);
				match(K_AS);
				setState(421);
				select_stmt();
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
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
		enterRule(_localctx, 20, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(K_DELETE);
			setState(425);
			match(K_FROM);
			setState(426);
			qualified_table_name();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(427);
				where_expr();
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
		enterRule(_localctx, 22, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(K_DROP);
			setState(431);
			match(K_TABLE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(432);
				match(K_IF);
				setState(433);
				match(K_EXISTS);
				}
			}

			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(436);
				database_name();
				setState(437);
				match(DOT);
				}
				break;
			}
			setState(441);
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
		public Limit_exprContext limit_expr() {
			return getRuleContext(Limit_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 24, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			select_core();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(444);
				match(K_ORDER);
				setState(445);
				match(K_BY);
				setState(446);
				ordering_term();
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(447);
						match(COMMA);
						setState(448);
						ordering_term();
						}
						} 
					}
					setState(453);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
			}

			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(456);
				limit_expr();
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(457);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(458);
					expr(0);
					}
					break;
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 26, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(K_INSERT);
			setState(464);
			match(K_INTO);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(465);
				database_name();
				setState(466);
				match(DOT);
				}
				break;
			}
			setState(470);
			table_name();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(471);
				match(OPEN_PAR);
				setState(472);
				column_name();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(473);
					match(COMMA);
					setState(474);
					column_name();
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				match(CLOSE_PAR);
				}
			}

			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(484);
				match(K_VALUES);
				setState(485);
				match(OPEN_PAR);
				setState(486);
				expr(0);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(487);
					match(COMMA);
					setState(488);
					expr(0);
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				match(CLOSE_PAR);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(495);
					match(COMMA);
					setState(496);
					match(OPEN_PAR);
					setState(497);
					expr(0);
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(498);
						match(COMMA);
						setState(499);
						expr(0);
						}
						}
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(505);
					match(CLOSE_PAR);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(512);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(513);
				match(K_DEFAULT);
				setState(514);
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
		public Limit_exprContext limit_expr() {
			return getRuleContext(Limit_exprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 28, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			select_or_values();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(518);
				match(K_ORDER);
				setState(519);
				match(K_BY);
				setState(520);
				ordering_term();
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
						match(COMMA);
						setState(522);
						ordering_term();
						}
						} 
					}
					setState(527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(530);
				limit_expr();
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(531);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(532);
					expr(0);
					}
					break;
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

	public static class Limit_exprContext extends ParserRuleContext {
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Limit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLimit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLimit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLimit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_exprContext limit_expr() throws RecognitionException {
		Limit_exprContext _localctx = new Limit_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(K_LIMIT);
			setState(538);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		public Having_exprContext having_expr() {
			return getRuleContext(Having_exprContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(K_SELECT);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(541);
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

				setState(544);
				result_column();
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(545);
						match(COMMA);
						setState(546);
						result_column();
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(552);
					match(K_FROM);
					setState(562);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(553);
						table_or_subquery();
						setState(558);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(554);
								match(COMMA);
								setState(555);
								table_or_subquery();
								}
								} 
							}
							setState(560);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(561);
						join_clause();
						}
						break;
					}
					}
				}

				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(566);
					where_expr();
					}
				}

				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(569);
					match(K_GROUP);
					setState(570);
					match(K_BY);
					setState(571);
					expr(0);
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(572);
							match(COMMA);
							setState(573);
							expr(0);
							}
							} 
						}
						setState(578);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(579);
						having_expr();
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(K_VALUES);
				setState(585);
				match(OPEN_PAR);
				setState(586);
				expr(0);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(587);
					match(COMMA);
					setState(588);
					expr(0);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(CLOSE_PAR);
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(COMMA);
						setState(596);
						match(OPEN_PAR);
						setState(597);
						expr(0);
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(598);
							match(COMMA);
							setState(599);
							expr(0);
							}
							}
							setState(604);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(605);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class Where_exprContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhere_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhere_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhere_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_exprContext where_expr() throws RecognitionException {
		Where_exprContext _localctx = new Where_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_where_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(K_WHERE);
			setState(615);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Asign_expr_to_columnContext> asign_expr_to_column() {
			return getRuleContexts(Asign_expr_to_columnContext.class);
		}
		public Asign_expr_to_columnContext asign_expr_to_column(int i) {
			return getRuleContext(Asign_expr_to_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(K_UPDATE);
			setState(618);
			qualified_table_name();
			setState(619);
			match(K_SET);
			setState(620);
			asign_expr_to_column();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				asign_expr_to_column();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(628);
				match(K_WHERE);
				setState(629);
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

	public static class Asign_expr_to_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Asign_expr_to_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign_expr_to_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAsign_expr_to_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAsign_expr_to_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAsign_expr_to_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asign_expr_to_columnContext asign_expr_to_column() throws RecognitionException {
		Asign_expr_to_columnContext _localctx = new Asign_expr_to_columnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asign_expr_to_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			column_name();
			setState(633);
			match(ASSIGN);
			setState(634);
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
		enterRule(_localctx, 40, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			column_name();
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(639);
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
						setState(637);
						column_constraint();
						}
						break;
					case RANDOM_NAME:
						{
						setState(638);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		public Signed_number1Context signed_number1() {
			return getRuleContext(Signed_number1Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Signed_number2Context signed_number2() {
			return getRuleContext(Signed_number2Context.class,0);
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
		enterRule(_localctx, 42, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			name();
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(645);
				match(OPEN_PAR);
				setState(646);
				signed_number1();
				setState(647);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(649);
				match(OPEN_PAR);
				setState(650);
				signed_number2();
				setState(651);
				match(CLOSE_PAR);
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

	public static class Signed_number1Context extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Signed_number1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_number1Context signed_number1() throws RecognitionException {
		Signed_number1Context _localctx = new Signed_number1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_signed_number1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			signed_number();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(656);
				use_random_name();
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

	public static class Signed_number2Context extends ParserRuleContext {
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public Signed_number2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_number2Context signed_number2() throws RecognitionException {
		Signed_number2Context _localctx = new Signed_number2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_signed_number2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			signed_number();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(660);
				use_random_name();
				}
			}

			setState(663);
			match(COMMA);
			setState(664);
			signed_number();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(665);
				use_random_name();
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
		public Column_uniqueContext column_unique() {
			return getRuleContext(Column_uniqueContext.class,0);
		}
		public Column_checkContext column_check() {
			return getRuleContext(Column_checkContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(668);
				match(K_CONSTRAINT);
				setState(669);
				name();
				}
			}

			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(672);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(673);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(674);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(675);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(676);
				column_unique();
				}
				break;
			case K_CHECK:
				{
				setState(677);
				column_check();
				}
				break;
			case K_DEFAULT:
				{
				setState(678);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(679);
				match(K_COLLATE);
				setState(680);
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

	public static class Column_checkContext extends ParserRuleContext {
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_check(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_checkContext column_check() throws RecognitionException {
		Column_checkContext _localctx = new Column_checkContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(K_CHECK);
			setState(684);
			match(OPEN_PAR);
			setState(685);
			expr(0);
			setState(686);
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

	public static class Column_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public Column_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_uniqueContext column_unique() throws RecognitionException {
		Column_uniqueContext _localctx = new Column_uniqueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_column_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(K_UNIQUE);
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
		enterRule(_localctx, 54, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(K_PRIMARY);
			setState(691);
			match(K_KEY);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(692);
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

			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(695);
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
		enterRule(_localctx, 56, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		enterRule(_localctx, 58, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(K_NOT);
			setState(701);
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
		enterRule(_localctx, 60, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
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
		enterRule(_localctx, 62, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(K_DEFAULT);
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case PLUS:
			case MINUS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_NULL:
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
			case BLOB_LITERAL:
				{
				setState(706);
				column_default_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(707);
				match(OPEN_PAR);
				setState(708);
				expr(0);
				setState(709);
				match(CLOSE_PAR);
				}
				break;
			case K_NEXTVAL:
				{
				setState(711);
				match(K_NEXTVAL);
				setState(712);
				match(OPEN_PAR);
				setState(713);
				expr(0);
				setState(714);
				match(CLOSE_PAR);
				}
				break;
			case RANDOM_NAME:
				{
				setState(716);
				use_random_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(719);
				match(T__0);
				setState(721); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(720);
						use_random_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(723); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 64, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(727);
				signed_number();
				}
				break;
			case 2:
				{
				setState(728);
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

	public static class ExprContext extends ParserRuleContext {
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Commn_expr_opreatorContext commn_expr_opreator() {
			return getRuleContext(Commn_expr_opreatorContext.class,0);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(732);
				literal_value();
				}
				break;
			case 2:
				{
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(736);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(733);
						database_name();
						setState(734);
						match(DOT);
						}
						break;
					}
					setState(738);
					table_name();
					setState(739);
					match(DOT);
					}
					break;
				}
				setState(743);
				column_name();
				}
				break;
			case 3:
				{
				setState(744);
				unary_operator();
				setState(745);
				expr(4);
				}
				break;
			case 4:
				{
				setState(747);
				function_name();
				setState(748);
				match(OPEN_PAR);
				setState(761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_NOT:
				case K_NULL:
				case STRING_LITERAL:
				case RANDOM_NAME:
				case NUMERIC_LITERAL:
				case BLOB_LITERAL:
					{
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(749);
						match(K_DISTINCT);
						}
					}

					setState(752);
					expr(0);
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(753);
						match(COMMA);
						setState(754);
						expr(0);
						}
						}
						setState(759);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(760);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(763);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(765);
				match(OPEN_PAR);
				setState(766);
				expr(0);
				setState(767);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(771);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(772);
					commn_expr_opreator();
					setState(773);
					expr(4);
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class Commn_expr_opreatorContext extends ParserRuleContext {
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
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public Commn_expr_opreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commn_expr_opreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommn_expr_opreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommn_expr_opreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommn_expr_opreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commn_expr_opreatorContext commn_expr_opreator() throws RecognitionException {
		Commn_expr_opreatorContext _localctx = new Commn_expr_opreatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_commn_expr_opreator);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				match(PIPE2);
				}
				break;
			case STAR:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
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
				break;
			case LT2:
			case GT2:
			case AMP:
			case PIPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LT:
			case LT_EQ:
			case GT:
			case GT_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ASSIGN:
			case EQ:
			case NOT_EQ1:
			case NOT_EQ2:
			case K_GLOB:
			case K_IN:
			case K_IS:
			case K_LIKE:
			case K_MATCH:
			case K_REGEXP:
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(785);
					match(ASSIGN);
					}
					break;
				case 2:
					{
					setState(786);
					match(EQ);
					}
					break;
				case 3:
					{
					setState(787);
					match(NOT_EQ1);
					}
					break;
				case 4:
					{
					setState(788);
					match(NOT_EQ2);
					}
					break;
				case 5:
					{
					setState(789);
					match(K_IS);
					}
					break;
				case 6:
					{
					setState(790);
					match(K_IS);
					setState(791);
					match(K_NOT);
					}
					break;
				case 7:
					{
					setState(792);
					match(K_IN);
					}
					break;
				case 8:
					{
					setState(793);
					match(K_LIKE);
					}
					break;
				case 9:
					{
					setState(794);
					match(K_GLOB);
					}
					break;
				case 10:
					{
					setState(795);
					match(K_MATCH);
					}
					break;
				case 11:
					{
					setState(796);
					match(K_REGEXP);
					}
					break;
				}
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(799);
				match(K_AND);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(800);
				match(K_OR);
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
		enterRule(_localctx, 70, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(K_REFERENCES);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(804);
				database_name();
				setState(805);
				match(DOT);
				}
				break;
			}
			setState(809);
			foreign_table();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(810);
				match(OPEN_PAR);
				setState(811);
				fk_target_column_name();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(812);
					match(COMMA);
					setState(813);
					fk_target_column_name();
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(819);
				match(CLOSE_PAR);
				}
			}

			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(837);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(823);
					match(K_ON);
					setState(824);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(825);
						match(K_SET);
						setState(826);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(827);
						match(K_SET);
						setState(828);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(829);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(830);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(831);
						match(K_NO);
						setState(832);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(835);
					match(K_MATCH);
					setState(836);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(844);
					match(K_NOT);
					}
				}

				setState(847);
				match(K_DEFERRABLE);
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(848);
					match(K_INITIALLY);
					setState(849);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(850);
					match(K_INITIALLY);
					setState(851);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(854);
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
		enterRule(_localctx, 72, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
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
		enterRule(_localctx, 74, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			column_name();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(862);
				match(K_COLLATE);
				setState(863);
				collation_name();
				}
			}

			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(866);
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
		public Table_checkContext table_check() {
			return getRuleContext(Table_checkContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(869);
				match(K_CONSTRAINT);
				setState(870);
				name();
				}
			}

			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(873);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(874);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(875);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(876);
				table_check();
				}
				break;
			case K_FOREIGN:
				{
				setState(877);
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

	public static class Table_checkContext extends ParserRuleContext {
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_check(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_checkContext table_check() throws RecognitionException {
		Table_checkContext _localctx = new Table_checkContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(K_CHECK);
			setState(881);
			match(OPEN_PAR);
			setState(882);
			expr(0);
			setState(883);
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
		enterRule(_localctx, 80, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(K_PRIMARY);
			setState(886);
			match(K_KEY);
			setState(887);
			match(OPEN_PAR);
			setState(888);
			indexed_column();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(889);
				match(COMMA);
				setState(890);
				indexed_column();
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
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
		enterRule(_localctx, 82, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(K_FOREIGN);
			setState(899);
			match(K_KEY);
			setState(900);
			match(OPEN_PAR);
			setState(901);
			fk_origin_column_name();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(902);
				match(COMMA);
				setState(903);
				fk_origin_column_name();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(909);
			match(CLOSE_PAR);
			setState(910);
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
		enterRule(_localctx, 84, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(K_UNIQUE);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(913);
				match(K_KEY);
				}
			}

			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(916);
				name();
				}
			}

			setState(919);
			match(OPEN_PAR);
			setState(920);
			indexed_column();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(921);
				match(COMMA);
				setState(922);
				indexed_column();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
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
		enterRule(_localctx, 86, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(K_KEY);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(931);
				name();
				}
			}

			setState(934);
			match(OPEN_PAR);
			setState(935);
			indexed_column();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(936);
				match(COMMA);
				setState(937);
				indexed_column();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(943);
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
		enterRule(_localctx, 88, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
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
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(947);
				database_name();
				setState(948);
				match(DOT);
				}
				break;
			}
			setState(952);
			table_name();
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(953);
				match(K_INDEXED);
				setState(954);
				match(K_BY);
				setState(955);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(956);
				match(K_NOT);
				setState(957);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FUNCTION:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case RANDOM_NAME:
			case UNEXPECTED_CHAR:
				break;
			default:
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
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			expr(0);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(961);
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				signed_number();
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				name();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			table_name();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(970);
				match(OPEN_PAR);
				setState(971);
				column_name();
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(972);
					match(COMMA);
					setState(973);
					column_name();
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				match(CLOSE_PAR);
				}
			}

			setState(983);
			match(K_AS);
			setState(984);
			match(OPEN_PAR);
			setState(985);
			select_stmt();
			setState(986);
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
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				table_name();
				setState(990);
				match(DOT);
				setState(991);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				expr(0);
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(994);
						match(K_AS);
						}
					}

					setState(997);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1002);
					database_name();
					setState(1003);
					match(DOT);
					}
					break;
				}
				setState(1007);
				table_name();
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1008);
						match(K_AS);
						}
					}

					setState(1011);
					table_alias();
					}
					break;
				}
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1014);
					match(K_INDEXED);
					setState(1015);
					match(K_BY);
					setState(1016);
					index_name();
					}
					break;
				case 2:
					{
					setState(1017);
					match(K_NOT);
					setState(1018);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				match(OPEN_PAR);
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1022);
					table_or_subquery();
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1023);
						match(COMMA);
						setState(1024);
						table_or_subquery();
						}
						}
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1030);
					join_clause();
					}
					break;
				}
				setState(1033);
				match(CLOSE_PAR);
				setState(1038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1034);
						match(K_AS);
						}
					}

					setState(1037);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				match(OPEN_PAR);
				setState(1041);
				select_stmt();
				setState(1042);
				match(CLOSE_PAR);
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1043);
						match(K_AS);
						}
					}

					setState(1046);
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
		enterRule(_localctx, 102, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			table_or_subquery();
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1052);
					join_operator();
					setState(1053);
					table_or_subquery();
					setState(1054);
					join_constraint();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
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
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(SCOL);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1062);
					match(K_LEFT);
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1063);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1066);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1069);
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
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1072);
				match(K_ON);
				setState(1073);
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
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		public Having_exprContext having_expr() {
			return getRuleContext(Having_exprContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List_of_exprContext list_of_expr() {
			return getRuleContext(List_of_exprContext.class,0);
		}
		public List_of_list_of_exprContext list_of_list_of_expr() {
			return getRuleContext(List_of_list_of_exprContext.class,0);
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
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				match(K_SELECT);
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1077);
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

				setState(1080);
				result_column();
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1081);
						match(COMMA);
						setState(1082);
						result_column();
						}
						} 
					}
					setState(1087);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1088);
					match(K_FROM);
					setState(1098);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(1089);
						table_or_subquery();
						setState(1094);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1090);
								match(COMMA);
								setState(1091);
								table_or_subquery();
								}
								} 
							}
							setState(1096);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1097);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1102);
					where_expr();
					}
				}

				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1105);
					match(K_GROUP);
					setState(1106);
					match(K_BY);
					setState(1107);
					expr(0);
					setState(1112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1108);
							match(COMMA);
							setState(1109);
							expr(0);
							}
							} 
						}
						setState(1114);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
					}
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1115);
						having_expr();
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(K_VALUES);
				setState(1121);
				list_of_expr();
				setState(1122);
				list_of_list_of_expr();
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

	public static class List_of_exprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List_of_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterList_of_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitList_of_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitList_of_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_exprContext list_of_expr() throws RecognitionException {
		List_of_exprContext _localctx = new List_of_exprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_list_of_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			match(OPEN_PAR);
			setState(1127);
			expr(0);
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1128);
				match(COMMA);
				setState(1129);
				expr(0);
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1135);
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

	public static class List_of_list_of_exprContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<List_of_exprContext> list_of_expr() {
			return getRuleContexts(List_of_exprContext.class);
		}
		public List_of_exprContext list_of_expr(int i) {
			return getRuleContext(List_of_exprContext.class,i);
		}
		public List_of_list_of_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_list_of_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterList_of_list_of_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitList_of_list_of_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitList_of_list_of_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_list_of_exprContext list_of_list_of_expr() throws RecognitionException {
		List_of_list_of_exprContext _localctx = new List_of_list_of_exprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_list_of_list_of_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1137);
					match(COMMA);
					setState(1138);
					list_of_expr();
					}
					} 
				}
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class Having_exprContext extends ParserRuleContext {
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Having_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHaving_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHaving_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHaving_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_exprContext having_expr() throws RecognitionException {
		Having_exprContext _localctx = new Having_exprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_having_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(K_HAVING);
			setState(1145);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			table_name();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1148);
				match(OPEN_PAR);
				setState(1149);
				column_name();
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1150);
					match(COMMA);
					setState(1151);
					column_name();
					}
					}
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1157);
				match(CLOSE_PAR);
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
		enterRule(_localctx, 118, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1161);
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

				setState(1164);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1165);
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
		enterRule(_localctx, 120, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CURRENT_DATE - 67)) | (1L << (K_CURRENT_TIME - 67)) | (1L << (K_CURRENT_TIMESTAMP - 67)) | (1L << (K_NULL - 67)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (STRING_LITERAL - 185)) | (1L << (NUMERIC_LITERAL - 185)) | (1L << (BLOB_LITERAL - 185)))) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
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
		enterRule(_localctx, 124, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_module_argument);
		try {
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
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
		enterRule(_localctx, 128, RULE_column_alias);
		try {
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(STRING_LITERAL);
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1180);
				use_random_name();
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
		enterRule(_localctx, 130, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DOUBEL) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << OPEN_SQER_BAR) | (1L << CLOSE_SQER_PAR) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << COMMA) | (1L << COLON) | (1L << ASSIGN) | (1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << GT3) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << QUESTION_MARK) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_BREAK) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DO - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_ELSE_IF - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREACH - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VAR - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_JSON - 128)) | (1L << (K_AGGREGATION - 128)) | (1L << (K_STRING - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_NUMBER - 128)) | (1L << (ONE_CHAR_LETTER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (RANDOM_NAME - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (MULTILINE_COMMENT - 128)))) != 0) || _la==SPACES || _la==UNEXPECTED_CHAR) {
				{
				{
				setState(1185);
				matchWildcard();
				}
				}
				setState(1190);
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

	public static class NameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 134, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 136, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 138, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 140, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 142, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			use_random_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 146, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 148, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 150, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 152, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
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
		enterRule(_localctx, 154, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			use_random_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			use_random_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			use_random_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			use_random_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			use_random_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			use_random_name();
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
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 166, RULE_table_alias);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				use_random_name();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(IDENTIFIER);
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			use_random_name();
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
		public TerminalNode RANDOM_NAME() { return getToken(SQLParser.RANDOM_NAME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 170, RULE_any_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_la = _input.LA(1);
			if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (STRING_LITERAL - 185)) | (1L << (IDENTIFIER - 185)) | (1L << (RANDOM_NAME - 185)))) != 0)) ) {
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

	public static class Create_aggregation_functionContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_AGGREGATION() { return getToken(SQLParser.K_AGGREGATION, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Jar_patheContext jar_pathe() {
			return getRuleContext(Jar_patheContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode OPEN_SQER_BAR() { return getToken(SQLParser.OPEN_SQER_BAR, 0); }
		public TerminalNode CLOSE_SQER_PAR() { return getToken(SQLParser.CLOSE_SQER_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ParamesContext> parames() {
			return getRuleContexts(ParamesContext.class);
		}
		public ParamesContext parames(int i) {
			return getRuleContext(ParamesContext.class,i);
		}
		public Create_aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggregation_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_aggregation_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_aggregation_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_aggregation_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggregation_functionContext create_aggregation_function() throws RecognitionException {
		Create_aggregation_functionContext _localctx = new Create_aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_create_aggregation_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(K_CREATE);
			setState(1232);
			match(K_AGGREGATION);
			setState(1233);
			match(K_FUNCTION);
			setState(1234);
			use_random_name();
			setState(1235);
			match(OPEN_PAR);
			setState(1236);
			jar_pathe();
			setState(1237);
			match(COMMA);
			setState(1238);
			use_random_name();
			setState(1239);
			match(COMMA);
			setState(1240);
			use_random_name();
			setState(1241);
			match(COMMA);
			setState(1242);
			use_random_name();
			setState(1243);
			match(COMMA);
			setState(1244);
			match(OPEN_SQER_BAR);
			{
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (K_STRING - 181)) | (1L << (K_BOOLEAN - 181)) | (1L << (K_NUMBER - 181)) | (1L << (RANDOM_NAME - 181)))) != 0)) {
				{
				setState(1245);
				parames();
				}
			}

			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1248);
				match(COMMA);
				setState(1249);
				parames();
				}
				}
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1255);
			match(CLOSE_SQER_PAR);
			setState(1256);
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

	public static class Jar_patheContext extends ParserRuleContext {
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public List<TerminalNode> DIV() { return getTokens(SQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SQLParser.DIV, i);
		}
		public Jar_patheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_pathe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJar_pathe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJar_pathe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJar_pathe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_patheContext jar_pathe() throws RecognitionException {
		Jar_patheContext _localctx = new Jar_patheContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_jar_pathe);
		int _la;
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1258);
				use_random_name();
				setState(1259);
				match(COLON);
				setState(1260);
				match(DIV);
				setState(1261);
				use_random_name();
				}
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(1263);
					match(DIV);
					setState(1264);
					use_random_name();
					}
					}
					setState(1269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				use_random_name();
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

	public static class ParamesContext extends ParserRuleContext {
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_NUMBER() { return getToken(SQLParser.K_NUMBER, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ParamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamesContext parames() throws RecognitionException {
		ParamesContext _localctx = new ParamesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_parames);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(K_STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(K_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1275);
				match(K_BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1276);
				table_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1277);
				column_name();
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

	public static class FuntionContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public FuntionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFuntion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFuntion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFuntion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionContext funtion() throws RecognitionException {
		FuntionContext _localctx = new FuntionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_funtion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(1280);
				match(K_FUNCTION);
				}
			}

			setState(1283);
			function_header();
			setState(1284);
			function_body();
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

	public static class Function_headerContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Creating_with_assignContext> creating_with_assign() {
			return getRuleContexts(Creating_with_assignContext.class);
		}
		public Creating_with_assignContext creating_with_assign(int i) {
			return getRuleContext(Creating_with_assignContext.class,i);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_function_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			use_random_name();
			setState(1287);
			match(OPEN_PAR);
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR || _la==RANDOM_NAME) {
				{
				{
				setState(1288);
				args();
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1289);
						match(COMMA);
						setState(1290);
						args();
						}
						} 
					}
					setState(1295);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1296);
					match(COMMA);
					{
					setState(1297);
					creating_with_assign();
					}
					}
					}
					setState(1302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1305);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public List<Sub_function_bodyContext> sub_function_body() {
			return getRuleContexts(Sub_function_bodyContext.class);
		}
		public Sub_function_bodyContext sub_function_body(int i) {
			return getRuleContext(Sub_function_bodyContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(OPEN_BRACKET);
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				setState(1310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(1308);
					sub_function_body();
					}
					break;
				case PLUS_PLUS:
				case MINUS_MINUS:
				case K_CREATE:
				case K_DO:
				case K_FOR:
				case K_FOREACH:
				case K_IF:
				case K_PRINT:
				case K_SWITCH:
				case K_VAR:
				case K_WHILE:
				case RANDOM_NAME:
					{
					setState(1309);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_RETURN) {
				{
				setState(1315);
				return_rule();
				setState(1316);
				match(SCOL);
				}
			}

			setState(1320);
			match(CLOSE_BRACKET);
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

	public static class Sub_function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public List<Sub_function_bodyContext> sub_function_body() {
			return getRuleContexts(Sub_function_bodyContext.class);
		}
		public Sub_function_bodyContext sub_function_body(int i) {
			return getRuleContext(Sub_function_bodyContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Sub_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSub_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSub_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSub_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_function_bodyContext sub_function_body() throws RecognitionException {
		Sub_function_bodyContext _localctx = new Sub_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_sub_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(OPEN_BRACKET);
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				setState(1325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(1323);
					sub_function_body();
					}
					break;
				case PLUS_PLUS:
				case MINUS_MINUS:
				case K_CREATE:
				case K_DO:
				case K_FOR:
				case K_FOREACH:
				case K_IF:
				case K_PRINT:
				case K_SWITCH:
				case K_VAR:
				case K_WHILE:
				case RANDOM_NAME:
					{
					setState(1324);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1330);
			match(CLOSE_BRACKET);
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

	public static class InstructionsContext extends ParserRuleContext {
		public Functional_instructionContext functional_instruction() {
			return getRuleContext(Functional_instructionContext.class,0);
		}
		public Nonfunctional_instructionContext nonfunctional_instruction() {
			return getRuleContext(Nonfunctional_instructionContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DO:
			case K_FOR:
			case K_FOREACH:
			case K_IF:
			case K_SWITCH:
			case K_WHILE:
				{
				setState(1332);
				functional_instruction();
				}
				break;
			case PLUS_PLUS:
			case MINUS_MINUS:
			case K_CREATE:
			case K_PRINT:
			case K_VAR:
			case RANDOM_NAME:
				{
				setState(1333);
				nonfunctional_instruction();
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

	public static class Functional_instructionContext extends ParserRuleContext {
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public If_else_ruleContext if_else_rule() {
			return getRuleContext(If_else_ruleContext.class,0);
		}
		public Switch_ruleContext switch_rule() {
			return getRuleContext(Switch_ruleContext.class,0);
		}
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public For_loop_ruleContext for_loop_rule() {
			return getRuleContext(For_loop_ruleContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Exiting_loopsContext exiting_loops() {
			return getRuleContext(Exiting_loopsContext.class,0);
		}
		public Functional_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctional_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctional_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunctional_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functional_instructionContext functional_instruction() throws RecognitionException {
		Functional_instructionContext _localctx = new Functional_instructionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functional_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DO:
				{
				setState(1336);
				do_while();
				}
				break;
			case K_IF:
				{
				setState(1337);
				if_else_rule();
				}
				break;
			case K_SWITCH:
				{
				setState(1338);
				switch_rule();
				}
				break;
			case K_FOR:
			case K_FOREACH:
			case K_WHILE:
				{
				setState(1342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_WHILE:
					{
					setState(1339);
					while_rule();
					}
					break;
				case K_FOREACH:
					{
					setState(1340);
					foreach();
					}
					break;
				case K_FOR:
					{
					setState(1341);
					for_loop_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_BREAK:
				case K_RETURN:
				case K_CONTINUE:
					{
					setState(1345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1344);
						exiting_loops();
						}
						break;
					}
					setState(1347);
					match(SCOL);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(1348);
					match(OPEN_BRACKET);
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
						{
						{
						setState(1349);
						instructions();
						}
						}
						setState(1354);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SCOL || _la==K_BREAK || _la==K_RETURN || _la==K_CONTINUE) {
						{
						setState(1355);
						exiting_loops();
						setState(1356);
						match(SCOL);
						}
					}

					setState(1360);
					match(CLOSE_BRACKET);
					}
					break;
				case PLUS_PLUS:
				case MINUS_MINUS:
				case K_CREATE:
				case K_DO:
				case K_FOR:
				case K_FOREACH:
				case K_IF:
				case K_PRINT:
				case K_SWITCH:
				case K_VAR:
				case K_WHILE:
				case RANDOM_NAME:
					{
					setState(1361);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Nonfunctional_instructionContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Print_statmentContext print_statment() {
			return getRuleContext(Print_statmentContext.class,0);
		}
		public Shortcut_statmentsContext shortcut_statments() {
			return getRuleContext(Shortcut_statmentsContext.class,0);
		}
		public Grnral_creatingContext grnral_creating() {
			return getRuleContext(Grnral_creatingContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public Create_aggregation_functionContext create_aggregation_function() {
			return getRuleContext(Create_aggregation_functionContext.class,0);
		}
		public Nonfunctional_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonfunctional_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNonfunctional_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNonfunctional_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNonfunctional_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonfunctional_instructionContext nonfunctional_instruction() throws RecognitionException {
		Nonfunctional_instructionContext _localctx = new Nonfunctional_instructionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nonfunctional_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1366);
				call_function();
				}
				break;
			case 2:
				{
				setState(1367);
				print_statment();
				}
				break;
			case 3:
				{
				setState(1368);
				shortcut_statments();
				}
				break;
			case 4:
				{
				setState(1369);
				grnral_creating();
				}
				break;
			case 5:
				{
				setState(1370);
				genral_assign();
				}
				break;
			case 6:
				{
				setState(1371);
				create_aggregation_function();
				}
				break;
			}
			setState(1374);
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

	public static class Call_functionContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<PrametersContext> prameters() {
			return getRuleContexts(PrametersContext.class);
		}
		public PrametersContext prameters(int i) {
			return getRuleContext(PrametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			use_random_name();
			setState(1377);
			match(OPEN_PAR);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==K_FALSE || _la==K_NOT || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_TRUE - 162)) | (1L << (ONE_CHAR_LETTER - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (RANDOM_NAME - 162)) | (1L << (NUMERIC_LITERAL - 162)))) != 0)) {
				{
				{
				setState(1378);
				prameters();
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1379);
					match(COMMA);
					setState(1380);
					prameters();
					}
					}
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
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

	public static class Callback_funcContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Callback_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callback_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCallback_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCallback_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCallback_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callback_funcContext callback_func() throws RecognitionException {
		Callback_funcContext _localctx = new Callback_funcContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_callback_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			function_header();
			setState(1394);
			function_body();
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

	public static class ArgsContext extends ParserRuleContext {
		public Creat_without_assignContext creat_without_assign() {
			return getRuleContext(Creat_without_assignContext.class,0);
		}
		public Callback_funcContext callback_func() {
			return getRuleContext(Callback_funcContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_args);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				creat_without_assign();
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				callback_func();
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

	public static class PrametersContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public PrametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrametersContext prameters() throws RecognitionException {
		PrametersContext _localctx = new PrametersContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_prameters);
		try {
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1403);
				call_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1404);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1405);
				use_random_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1406);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1407);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1408);
				genral_assign();
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

	public static class Return_ruleContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Return_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_ruleContext return_rule() throws RecognitionException {
		Return_ruleContext _localctx = new Return_ruleContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_return_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(1411);
				match(K_RETURN);
				{
				setState(1412);
				return_type();
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

	public static class Exiting_loopsContext extends ParserRuleContext {
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public Exiting_loopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exiting_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExiting_loops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExiting_loops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExiting_loops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exiting_loopsContext exiting_loops() throws RecognitionException {
		Exiting_loopsContext _localctx = new Exiting_loopsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_exiting_loops);
		int _la;
		try {
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
			case K_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1415);
				return_rule();
				}
				}
				break;
			case K_BREAK:
			case K_CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				_la = _input.LA(1);
				if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Return_typeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Assign_arrayContext assign_array() {
			return getRuleContext(Assign_arrayContext.class,0);
		}
		public Assign_jsonContext assign_json() {
			return getRuleContext(Assign_jsonContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_return_type);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1422);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1423);
				call_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1424);
				match(K_TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1425);
				match(K_FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1426);
				match(K_NULL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1427);
				varible_name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1428);
				array_base_form_with_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1429);
				varible_from_object();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1430);
				assign_varible();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1431);
				assign_array();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1432);
				assign_json();
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

	public static class Print_statmentContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Indisde_the_printContext> indisde_the_print() {
			return getRuleContexts(Indisde_the_printContext.class);
		}
		public Indisde_the_printContext indisde_the_print(int i) {
			return getRuleContext(Indisde_the_printContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Print_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statmentContext print_statment() throws RecognitionException {
		Print_statmentContext _localctx = new Print_statmentContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_print_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(K_PRINT);
			setState(1436);
			match(OPEN_PAR);
			{
			setState(1437);
			indisde_the_print();
			}
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1438);
				match(PLUS);
				setState(1439);
				indisde_the_print();
				}
				}
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1445);
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

	public static class Indisde_the_printContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Indisde_the_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indisde_the_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndisde_the_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndisde_the_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndisde_the_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indisde_the_printContext indisde_the_print() throws RecognitionException {
		Indisde_the_printContext _localctx = new Indisde_the_printContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_indisde_the_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1447);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1448);
				use_random_name();
				}
				break;
			case 3:
				{
				setState(1449);
				call_function();
				}
				break;
			case 4:
				{
				setState(1450);
				varible_from_object();
				}
				break;
			case 5:
				{
				setState(1451);
				array_base_form_with_index();
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

	public static class If_else_ruleContext extends ParserRuleContext {
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public List<Else_if_ruleContext> else_if_rule() {
			return getRuleContexts(Else_if_ruleContext.class);
		}
		public Else_if_ruleContext else_if_rule(int i) {
			return getRuleContext(Else_if_ruleContext.class,i);
		}
		public Else_rulseContext else_rulse() {
			return getRuleContext(Else_rulseContext.class,0);
		}
		public If_else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_else_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_else_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_else_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_ruleContext if_else_rule() throws RecognitionException {
		If_else_ruleContext _localctx = new If_else_ruleContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_if_else_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			if_rule();
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSE_IF) {
				{
				{
				setState(1455);
				else_if_rule();
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(1461);
				else_rulse();
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

	public static class If_ruleContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(K_IF);
			setState(1465);
			match(OPEN_PAR);
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1466);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1467);
				genral_assign();
				}
				break;
			}
			setState(1470);
			match(CLOSE_PAR);
			setState(1489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1471);
				match(OPEN_BRACKET);
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1472);
					instructions();
					}
					}
					setState(1477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1478);
					return_rule();
					setState(1479);
					match(SCOL);
					}
				}

				setState(1483);
				match(CLOSE_BRACKET);
				}
				break;
			case SCOL:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case K_CREATE:
			case K_DO:
			case K_FOR:
			case K_FOREACH:
			case K_IF:
			case K_PRINT:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case RANDOM_NAME:
				{
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1484);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1485);
					instructions();
					}
					break;
				}
				setState(1488);
				match(SCOL);
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

	public static class Else_if_ruleContext extends ParserRuleContext {
		public TerminalNode K_ELSE_IF() { return getToken(SQLParser.K_ELSE_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Else_if_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_if_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_if_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_if_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_ruleContext else_if_rule() throws RecognitionException {
		Else_if_ruleContext _localctx = new Else_if_ruleContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_else_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(K_ELSE_IF);
			setState(1492);
			match(OPEN_PAR);
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1493);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1494);
				genral_assign();
				}
				break;
			}
			setState(1497);
			match(CLOSE_PAR);
			setState(1516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1498);
				match(OPEN_BRACKET);
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1499);
					instructions();
					}
					}
					setState(1504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1505);
					return_rule();
					setState(1506);
					match(SCOL);
					}
				}

				setState(1510);
				match(CLOSE_BRACKET);
				}
				break;
			case SCOL:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case K_CREATE:
			case K_DO:
			case K_FOR:
			case K_FOREACH:
			case K_IF:
			case K_PRINT:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case RANDOM_NAME:
				{
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1511);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1512);
					instructions();
					}
					break;
				}
				setState(1515);
				match(SCOL);
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

	public static class Else_rulseContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Else_rulseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_rulse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_rulse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_rulse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_rulse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_rulseContext else_rulse() throws RecognitionException {
		Else_rulseContext _localctx = new Else_rulseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_else_rulse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(K_ELSE);
			setState(1537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1519);
				match(OPEN_BRACKET);
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1520);
					instructions();
					}
					}
					setState(1525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1526);
					return_rule();
					setState(1527);
					match(SCOL);
					}
				}

				setState(1531);
				match(CLOSE_BRACKET);
				}
				break;
			case SCOL:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case K_CREATE:
			case K_DO:
			case K_FOR:
			case K_FOREACH:
			case K_IF:
			case K_PRINT:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case RANDOM_NAME:
				{
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1532);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1533);
					instructions();
					}
					break;
				}
				setState(1536);
				match(SCOL);
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

	public static class While_ruleContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_while_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(K_WHILE);
			setState(1540);
			match(OPEN_PAR);
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1541);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1542);
				genral_assign();
				}
				break;
			}
			setState(1545);
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public Exiting_loopsContext exiting_loops() {
			return getRuleContext(Exiting_loopsContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
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
		enterRule(_localctx, 220, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(K_DO);
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1548);
					exiting_loops();
					}
					break;
				}
				setState(1551);
				match(SCOL);
				}
				break;
			case 2:
				{
				{
				setState(1552);
				match(OPEN_BRACKET);
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1553);
					instructions();
					}
					}
					setState(1558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_BREAK || _la==K_RETURN || _la==K_CONTINUE) {
					{
					setState(1559);
					exiting_loops();
					setState(1560);
					match(SCOL);
					}
				}

				setState(1564);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 3:
				{
				setState(1565);
				match(SCOL);
				}
				break;
			}
			setState(1568);
			while_rule();
			setState(1569);
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

	public static class For_loop_ruleContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Inside_for_loopContext> inside_for_loop() {
			return getRuleContexts(Inside_for_loopContext.class);
		}
		public Inside_for_loopContext inside_for_loop(int i) {
			return getRuleContext(Inside_for_loopContext.class,i);
		}
		public Create_varible_with_assignContext create_varible_with_assign() {
			return getRuleContext(Create_varible_with_assignContext.class,0);
		}
		public Create_varible_without_assignContext create_varible_without_assign() {
			return getRuleContext(Create_varible_without_assignContext.class,0);
		}
		public For_loop_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_loop_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_loop_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_loop_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_ruleContext for_loop_rule() throws RecognitionException {
		For_loop_ruleContext _localctx = new For_loop_ruleContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_for_loop_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(K_FOR);
			setState(1572);
			match(OPEN_PAR);
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_PLUS || _la==MINUS_MINUS || _la==K_VAR || _la==RANDOM_NAME) {
				{
				setState(1576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1573);
					create_varible_with_assign();
					}
					break;
				case 2:
					{
					setState(1574);
					create_varible_without_assign();
					}
					break;
				case 3:
					{
					setState(1575);
					inside_for_loop();
					}
					break;
				}
				}
			}

			setState(1580);
			match(SCOL);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==K_FALSE || _la==K_NOT || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_TRUE - 162)) | (1L << (ONE_CHAR_LETTER - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (RANDOM_NAME - 162)) | (1L << (NUMERIC_LITERAL - 162)))) != 0)) {
				{
				setState(1581);
				expression(0);
				}
			}

			setState(1584);
			match(SCOL);
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_PLUS || _la==MINUS_MINUS || _la==K_VAR || _la==RANDOM_NAME) {
				{
				setState(1585);
				inside_for_loop();
				}
			}

			setState(1588);
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

	public static class Inside_for_loopContext extends ParserRuleContext {
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Assign_arrayContext assign_array() {
			return getRuleContext(Assign_arrayContext.class,0);
		}
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Shortcut_statmentsContext shortcut_statments() {
			return getRuleContext(Shortcut_statmentsContext.class,0);
		}
		public Inside_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInside_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInside_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInside_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_for_loopContext inside_for_loop() throws RecognitionException {
		Inside_for_loopContext _localctx = new Inside_for_loopContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_inside_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1590);
				assign_varible();
				}
				break;
			case 2:
				{
				setState(1591);
				assign_array();
				}
				break;
			case 3:
				{
				setState(1592);
				create_Array_without_assign();
				}
				break;
			case 4:
				{
				setState(1593);
				shortcut_statments();
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

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode K_FOREACH() { return getToken(SQLParser.K_FOREACH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(K_FOREACH);
			setState(1597);
			match(OPEN_PAR);
			setState(1598);
			match(K_VAR);
			setState(1599);
			use_random_name();
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1600);
				match(T__1);
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1606);
			match(COLON);
			setState(1607);
			use_random_name();
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1608);
				match(T__1);
				}
				}
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1614);
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

	public static class Switch_ruleContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public List<Case_ruleContext> case_rule() {
			return getRuleContexts(Case_ruleContext.class);
		}
		public Case_ruleContext case_rule(int i) {
			return getRuleContext(Case_ruleContext.class,i);
		}
		public DefultContext defult() {
			return getRuleContext(DefultContext.class,0);
		}
		public Switch_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_ruleContext switch_rule() throws RecognitionException {
		Switch_ruleContext _localctx = new Switch_ruleContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_switch_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(K_SWITCH);
			setState(1617);
			match(OPEN_PAR);
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1618);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1619);
				use_random_name();
				}
				break;
			case 3:
				{
				setState(1620);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(1621);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(1622);
				genral_assign();
				}
				break;
			case 6:
				{
				setState(1623);
				call_function();
				}
				break;
			case 7:
				{
				setState(1624);
				varible_from_object();
				}
				break;
			}
			setState(1627);
			match(CLOSE_PAR);
			setState(1628);
			match(OPEN_BRACKET);
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CASE) {
					{
					{
					setState(1629);
					case_rule();
					}
					}
					setState(1634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1635);
					defult();
					}
				}

				}
				break;
			}
			setState(1640);
			match(CLOSE_BRACKET);
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

	public static class DefultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public DefultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDefult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefultContext defult() throws RecognitionException {
		DefultContext _localctx = new DefultContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(K_DEFAULT);
			setState(1643);
			match(COLON);
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				{
				setState(1644);
				instructions();
				}
				}
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_BREAK || _la==K_RETURN) {
				{
				setState(1652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(1650);
					match(K_BREAK);
					}
					break;
				case SCOL:
				case K_RETURN:
					{
					setState(1651);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1654);
				match(SCOL);
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

	public static class Case_ruleContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Case_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCase_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCase_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCase_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_ruleContext case_rule() throws RecognitionException {
		Case_ruleContext _localctx = new Case_ruleContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_case_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(K_CASE);
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1658);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1659);
				any_name();
				}
				break;
			case 3:
				{
				setState(1660);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(1661);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(1662);
				varible_from_object();
				}
				break;
			}
			setState(1665);
			match(COLON);
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				{
				setState(1666);
				instructions();
				}
				}
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_BREAK || _la==K_RETURN) {
				{
				setState(1674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(1672);
					match(K_BREAK);
					}
					break;
				case SCOL:
				case K_RETURN:
					{
					setState(1673);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1676);
				match(SCOL);
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

	public static class Grnral_creatingContext extends ParserRuleContext {
		public Creat_without_assignContext creat_without_assign() {
			return getRuleContext(Creat_without_assignContext.class,0);
		}
		public Creating_with_assignContext creating_with_assign() {
			return getRuleContext(Creating_with_assignContext.class,0);
		}
		public Grnral_creatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grnral_creating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGrnral_creating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGrnral_creating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGrnral_creating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grnral_creatingContext grnral_creating() throws RecognitionException {
		Grnral_creatingContext _localctx = new Grnral_creatingContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_grnral_creating);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				creat_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1680);
				creating_with_assign();
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

	public static class Creating_with_assignContext extends ParserRuleContext {
		public Create_varible_with_assignContext create_varible_with_assign() {
			return getRuleContext(Create_varible_with_assignContext.class,0);
		}
		public Create_json_with_assignContext create_json_with_assign() {
			return getRuleContext(Create_json_with_assignContext.class,0);
		}
		public Create_Array_with_assignContext create_Array_with_assign() {
			return getRuleContext(Create_Array_with_assignContext.class,0);
		}
		public Creating_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creating_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreating_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreating_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreating_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creating_with_assignContext creating_with_assign() throws RecognitionException {
		Creating_with_assignContext _localctx = new Creating_with_assignContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_creating_with_assign);
		try {
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				create_varible_with_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				create_json_with_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				create_Array_with_assign();
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

	public static class Creat_without_assignContext extends ParserRuleContext {
		public Create_varible_without_assignContext create_varible_without_assign() {
			return getRuleContext(Create_varible_without_assignContext.class,0);
		}
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Create_json_object_without_assignContext create_json_object_without_assign() {
			return getRuleContext(Create_json_object_without_assignContext.class,0);
		}
		public Creat_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creat_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreat_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreat_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreat_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creat_without_assignContext creat_without_assign() throws RecognitionException {
		Creat_without_assignContext _localctx = new Creat_without_assignContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_creat_without_assign);
		try {
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				create_varible_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				create_Array_without_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1690);
				create_json_object_without_assign();
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

	public static class Genral_assignContext extends ParserRuleContext {
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Assign_arrayContext assign_array() {
			return getRuleContext(Assign_arrayContext.class,0);
		}
		public Assign_jsonContext assign_json() {
			return getRuleContext(Assign_jsonContext.class,0);
		}
		public Genral_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genral_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGenral_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGenral_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGenral_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Genral_assignContext genral_assign() throws RecognitionException {
		Genral_assignContext _localctx = new Genral_assignContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_genral_assign);
		try {
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				assign_varible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				assign_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1695);
				assign_json();
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

	public static class Varible_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Varible_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVarible_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVarible_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVarible_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varible_nameContext varible_name() throws RecognitionException {
		Varible_nameContext _localctx = new Varible_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_varible_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			use_random_name();
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

	public static class Assign_varibleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public List<Any_arithmetic_opratorContext> any_arithmetic_oprator() {
			return getRuleContexts(Any_arithmetic_opratorContext.class);
		}
		public Any_arithmetic_opratorContext any_arithmetic_oprator(int i) {
			return getRuleContext(Any_arithmetic_opratorContext.class,i);
		}
		public Assign_varibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_varible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_varible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_varible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_varible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varibleContext assign_varible() throws RecognitionException {
		Assign_varibleContext _localctx = new Assign_varibleContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_assign_varible);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(1700);
					use_random_name();
					}
					setState(1702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						setState(1701);
						any_arithmetic_oprator();
						}
					}

					setState(1704);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1708); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1710);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1711);
				factored_select_stmt();
				}
				break;
			case 3:
				{
				setState(1712);
				select_stmt();
				}
				break;
			case 4:
				{
				setState(1713);
				match(K_NULL);
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

	public static class Create_varible_without_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public Create_varible_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_varible_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_varible_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_varible_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_varible_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_varible_without_assignContext create_varible_without_assign() throws RecognitionException {
		Create_varible_without_assignContext _localctx = new Create_varible_without_assignContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_create_varible_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(K_VAR);
			setState(1717);
			varible_name();
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

	public static class Create_varible_with_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Create_varible_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_varible_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_varible_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_varible_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_varible_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_varible_with_assignContext create_varible_with_assign() throws RecognitionException {
		Create_varible_with_assignContext _localctx = new Create_varible_with_assignContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_create_varible_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(K_VAR);
			setState(1720);
			assign_varible();
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

	public static class Array_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			use_random_name();
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

	public static class Assign_arrayContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Array_base_form_with_indexContext> array_base_form_with_index() {
			return getRuleContexts(Array_base_form_with_indexContext.class);
		}
		public Array_base_form_with_indexContext array_base_form_with_index(int i) {
			return getRuleContext(Array_base_form_with_indexContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<Any_arithmetic_opratorContext> any_arithmetic_oprator() {
			return getRuleContexts(Any_arithmetic_opratorContext.class);
		}
		public Any_arithmetic_opratorContext any_arithmetic_oprator(int i) {
			return getRuleContext(Any_arithmetic_opratorContext.class,i);
		}
		public Assign_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_arrayContext assign_array() throws RecognitionException {
		Assign_arrayContext _localctx = new Assign_arrayContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_assign_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1730); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1724);
					array_base_form_with_index();
					setState(1726);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						setState(1725);
						any_arithmetic_oprator();
						}
					}

					setState(1728);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1732); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1734);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1735);
				factored_select_stmt();
				}
				break;
			case 3:
				{
				setState(1736);
				select_stmt();
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

	public static class Create_array_formContext extends ParserRuleContext {
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Create_Array_with_assignContext create_Array_with_assign() {
			return getRuleContext(Create_Array_with_assignContext.class,0);
		}
		public Create_array_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_array_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_array_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_array_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_array_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_array_formContext create_array_form() throws RecognitionException {
		Create_array_formContext _localctx = new Create_array_formContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_create_array_form);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				create_Array_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				create_Array_with_assign();
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

	public static class Create_Array_without_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Array_base_form_without_indexContext array_base_form_without_index() {
			return getRuleContext(Array_base_form_without_indexContext.class,0);
		}
		public Create_Array_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Array_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_Array_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_Array_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_Array_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Array_without_assignContext create_Array_without_assign() throws RecognitionException {
		Create_Array_without_assignContext _localctx = new Create_Array_without_assignContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_create_Array_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(K_VAR);
			setState(1744);
			array_base_form_without_index();
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

	public static class Create_Array_with_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Array_base_form_without_indexContext array_base_form_without_index() {
			return getRuleContext(Array_base_form_without_indexContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Left_side_arrayContext left_side_array() {
			return getRuleContext(Left_side_arrayContext.class,0);
		}
		public Create_Array_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Array_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_Array_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_Array_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_Array_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Array_with_assignContext create_Array_with_assign() throws RecognitionException {
		Create_Array_with_assignContext _localctx = new Create_Array_with_assignContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_create_Array_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(K_VAR);
			setState(1747);
			array_base_form_without_index();
			{
			setState(1748);
			match(ASSIGN);
			setState(1749);
			left_side_array();
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

	public static class Array_base_form_without_indexContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Array_base_form_without_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_base_form_without_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_base_form_without_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_base_form_without_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_base_form_without_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_base_form_without_indexContext array_base_form_without_index() throws RecognitionException {
		Array_base_form_without_indexContext _localctx = new Array_base_form_without_indexContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_array_base_form_without_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			array_name();
			setState(1753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1752);
				match(T__1);
				}
				}
				setState(1755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class Array_base_form_with_indexContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public List<TerminalNode> OPEN_SQER_BAR() { return getTokens(SQLParser.OPEN_SQER_BAR); }
		public TerminalNode OPEN_SQER_BAR(int i) {
			return getToken(SQLParser.OPEN_SQER_BAR, i);
		}
		public List<TerminalNode> CLOSE_SQER_PAR() { return getTokens(SQLParser.CLOSE_SQER_PAR); }
		public TerminalNode CLOSE_SQER_PAR(int i) {
			return getToken(SQLParser.CLOSE_SQER_PAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public Array_base_form_with_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_base_form_with_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_base_form_with_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_base_form_with_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_base_form_with_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_base_form_with_indexContext array_base_form_with_index() throws RecognitionException {
		Array_base_form_with_indexContext _localctx = new Array_base_form_with_indexContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_array_base_form_with_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			array_name();
			setState(1765); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1758);
					match(OPEN_SQER_BAR);
					setState(1762);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1759);
						expression(0);
						}
						break;
					case 2:
						{
						setState(1760);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(1761);
						varible_name();
						}
						break;
					}
					setState(1764);
					match(CLOSE_SQER_PAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1767); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Array_identifier_formContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_identifier_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_identifier_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_identifier_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_identifier_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_identifier_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_identifier_formContext array_identifier_form() throws RecognitionException {
		Array_identifier_formContext _localctx = new Array_identifier_formContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_array_identifier_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			match(IDENTIFIER);
			setState(1774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1770);
					match(COMMA);
					setState(1771);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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

	public static class Array_boolean_formContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Array_boolean_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_boolean_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_boolean_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_boolean_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_boolean_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_boolean_formContext array_boolean_form() throws RecognitionException {
		Array_boolean_formContext _localctx = new Array_boolean_formContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_array_boolean_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			expression(0);
			{
			setState(1778);
			match(COMMA);
			setState(1779);
			expression(0);
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

	public static class Array_integer_formContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_integer_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_integer_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_integer_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_integer_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_integer_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_integer_formContext array_integer_form() throws RecognitionException {
		Array_integer_formContext _localctx = new Array_integer_formContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_array_integer_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1781);
			expression(0);
			}
			setState(1786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1782);
					match(COMMA);
					{
					setState(1783);
					expression(0);
					}
					}
					} 
				}
				setState(1788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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

	public static class Array_charecter_formContext extends ParserRuleContext {
		public List<TerminalNode> ONE_CHAR_LETTER() { return getTokens(SQLParser.ONE_CHAR_LETTER); }
		public TerminalNode ONE_CHAR_LETTER(int i) {
			return getToken(SQLParser.ONE_CHAR_LETTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_charecter_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_charecter_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_charecter_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_charecter_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_charecter_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_charecter_formContext array_charecter_form() throws RecognitionException {
		Array_charecter_formContext _localctx = new Array_charecter_formContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_array_charecter_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			match(ONE_CHAR_LETTER);
			setState(1794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1790);
					match(COMMA);
					setState(1791);
					match(ONE_CHAR_LETTER);
					}
					} 
				}
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	public static class Array_objects_formContext extends ParserRuleContext {
		public List<Json_statmentContext> json_statment() {
			return getRuleContexts(Json_statmentContext.class);
		}
		public Json_statmentContext json_statment(int i) {
			return getRuleContext(Json_statmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_objects_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_objects_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_objects_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_objects_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_objects_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_objects_formContext array_objects_form() throws RecognitionException {
		Array_objects_formContext _localctx = new Array_objects_formContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_array_objects_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			json_statment();
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1798);
					match(COMMA);
					setState(1799);
					json_statment();
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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

	public static class Array_objects_form2Context extends ParserRuleContext {
		public TerminalNode OPEN_SQER_BAR() { return getToken(SQLParser.OPEN_SQER_BAR, 0); }
		public Array_objects_formContext array_objects_form() {
			return getRuleContext(Array_objects_formContext.class,0);
		}
		public TerminalNode CLOSE_SQER_PAR() { return getToken(SQLParser.CLOSE_SQER_PAR, 0); }
		public Array_objects_form2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_objects_form2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_objects_form2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_objects_form2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_objects_form2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_objects_form2Context array_objects_form2() throws RecognitionException {
		Array_objects_form2Context _localctx = new Array_objects_form2Context(_ctx, getState());
		enterRule(_localctx, 274, RULE_array_objects_form2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(OPEN_SQER_BAR);
			setState(1806);
			array_objects_form();
			setState(1807);
			match(CLOSE_SQER_PAR);
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

	public static class Array_varible_formContext extends ParserRuleContext {
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public List<Varible_from_objectContext> varible_from_object() {
			return getRuleContexts(Varible_from_objectContext.class);
		}
		public Varible_from_objectContext varible_from_object(int i) {
			return getRuleContext(Varible_from_objectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_varible_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_varible_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_varible_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_varible_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_varible_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_varible_formContext array_varible_form() throws RecognitionException {
		Array_varible_formContext _localctx = new Array_varible_formContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_array_varible_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1809);
				varible_name();
				}
				break;
			case 2:
				{
				setState(1810);
				varible_from_object();
				}
				break;
			}
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1813);
					match(COMMA);
					setState(1816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1814);
						varible_name();
						}
						break;
					case 2:
						{
						setState(1815);
						varible_from_object();
						}
						break;
					}
					}
					} 
				}
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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

	public static class Array_anyType_formContext extends ParserRuleContext {
		public List<Array_identifier_formContext> array_identifier_form() {
			return getRuleContexts(Array_identifier_formContext.class);
		}
		public Array_identifier_formContext array_identifier_form(int i) {
			return getRuleContext(Array_identifier_formContext.class,i);
		}
		public List<Array_integer_formContext> array_integer_form() {
			return getRuleContexts(Array_integer_formContext.class);
		}
		public Array_integer_formContext array_integer_form(int i) {
			return getRuleContext(Array_integer_formContext.class,i);
		}
		public List<Array_charecter_formContext> array_charecter_form() {
			return getRuleContexts(Array_charecter_formContext.class);
		}
		public Array_charecter_formContext array_charecter_form(int i) {
			return getRuleContext(Array_charecter_formContext.class,i);
		}
		public List<Array_objects_formContext> array_objects_form() {
			return getRuleContexts(Array_objects_formContext.class);
		}
		public Array_objects_formContext array_objects_form(int i) {
			return getRuleContext(Array_objects_formContext.class,i);
		}
		public List<Array_varible_formContext> array_varible_form() {
			return getRuleContexts(Array_varible_formContext.class);
		}
		public Array_varible_formContext array_varible_form(int i) {
			return getRuleContext(Array_varible_formContext.class,i);
		}
		public List<Array_boolean_formContext> array_boolean_form() {
			return getRuleContexts(Array_boolean_formContext.class);
		}
		public Array_boolean_formContext array_boolean_form(int i) {
			return getRuleContext(Array_boolean_formContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Array_arrayes_formContext> array_arrayes_form() {
			return getRuleContexts(Array_arrayes_formContext.class);
		}
		public Array_arrayes_formContext array_arrayes_form(int i) {
			return getRuleContext(Array_arrayes_formContext.class,i);
		}
		public Array_anyType_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_anyType_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_anyType_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_anyType_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_anyType_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_anyType_formContext array_anyType_form() throws RecognitionException {
		Array_anyType_formContext _localctx = new Array_anyType_formContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_array_anyType_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1823);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1824);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1825);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1826);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1827);
				array_varible_form();
				}
				break;
			case 6:
				{
				setState(1828);
				array_boolean_form();
				}
				break;
			}
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1831);
				match(COMMA);
				setState(1839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1832);
					array_identifier_form();
					}
					break;
				case 2:
					{
					setState(1833);
					array_integer_form();
					}
					break;
				case 3:
					{
					setState(1834);
					array_charecter_form();
					}
					break;
				case 4:
					{
					setState(1835);
					array_objects_form();
					}
					break;
				case 5:
					{
					setState(1836);
					array_arrayes_form();
					}
					break;
				case 6:
					{
					setState(1837);
					array_varible_form();
					}
					break;
				case 7:
					{
					setState(1838);
					array_boolean_form();
					}
					break;
				}
				}
				}
				setState(1845);
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

	public static class Array_arrayes_formContext extends ParserRuleContext {
		public List<Left_side_arrayContext> left_side_array() {
			return getRuleContexts(Left_side_arrayContext.class);
		}
		public Left_side_arrayContext left_side_array(int i) {
			return getRuleContext(Left_side_arrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_arrayes_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_arrayes_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_arrayes_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_arrayes_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_arrayes_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_arrayes_formContext array_arrayes_form() throws RecognitionException {
		Array_arrayes_formContext _localctx = new Array_arrayes_formContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_array_arrayes_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			left_side_array();
			setState(1851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1847);
					match(COMMA);
					{
					setState(1848);
					left_side_array();
					}
					}
					} 
				}
				setState(1853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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

	public static class Value_left_sideContext extends ParserRuleContext {
		public Array_identifier_formContext array_identifier_form() {
			return getRuleContext(Array_identifier_formContext.class,0);
		}
		public Array_integer_formContext array_integer_form() {
			return getRuleContext(Array_integer_formContext.class,0);
		}
		public Array_charecter_formContext array_charecter_form() {
			return getRuleContext(Array_charecter_formContext.class,0);
		}
		public Array_objects_formContext array_objects_form() {
			return getRuleContext(Array_objects_formContext.class,0);
		}
		public Array_objects_form2Context array_objects_form2() {
			return getRuleContext(Array_objects_form2Context.class,0);
		}
		public Array_arrayes_formContext array_arrayes_form() {
			return getRuleContext(Array_arrayes_formContext.class,0);
		}
		public Array_boolean_formContext array_boolean_form() {
			return getRuleContext(Array_boolean_formContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_anyType_formContext array_anyType_form() {
			return getRuleContext(Array_anyType_formContext.class,0);
		}
		public Array_varible_formContext array_varible_form() {
			return getRuleContext(Array_varible_formContext.class,0);
		}
		public Value_left_sideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_left_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue_left_side(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue_left_side(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue_left_side(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_left_sideContext value_left_side() throws RecognitionException {
		Value_left_sideContext _localctx = new Value_left_sideContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_value_left_side);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1854);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1855);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1856);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1857);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1858);
				array_objects_form2();
				}
				break;
			case 6:
				{
				setState(1859);
				array_arrayes_form();
				}
				break;
			case 7:
				{
				setState(1860);
				array_boolean_form();
				}
				break;
			case 8:
				{
				setState(1861);
				varible_from_object();
				}
				break;
			case 9:
				{
				setState(1862);
				array_anyType_form();
				}
				break;
			case 10:
				{
				setState(1863);
				array_varible_form();
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

	public static class Left_side_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public Value_left_sideContext value_left_side() {
			return getRuleContext(Value_left_sideContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Left_side_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_side_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLeft_side_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLeft_side_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLeft_side_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_side_arrayContext left_side_array() throws RecognitionException {
		Left_side_arrayContext _localctx = new Left_side_arrayContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_left_side_array);
		int _la;
		try {
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1866);
				match(OPEN_BRACKET);
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_SQER_BAR) | (1L << OPEN_BRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FALSE - 91)) | (1L << (K_NOT - 91)) | (1L << (K_SELECT - 91)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_TRUE - 162)) | (1L << (K_VALUES - 162)) | (1L << (ONE_CHAR_LETTER - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (RANDOM_NAME - 162)) | (1L << (NUMERIC_LITERAL - 162)))) != 0)) {
					{
					setState(1867);
					value_left_side();
					}
				}

				setState(1870);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1871);
				factored_select_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1872);
				select_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1873);
				array_name();
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

	public static class Json_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Json_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_nameContext json_name() throws RecognitionException {
		Json_nameContext _localctx = new Json_nameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_json_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			use_random_name();
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

	public static class Assign_jsonContext extends ParserRuleContext {
		public List<Json_nameContext> json_name() {
			return getRuleContexts(Json_nameContext.class);
		}
		public Json_nameContext json_name(int i) {
			return getRuleContext(Json_nameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Json_statmentContext json_statment() {
			return getRuleContext(Json_statmentContext.class,0);
		}
		public Assign_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssign_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssign_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssign_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_jsonContext assign_json() throws RecognitionException {
		Assign_jsonContext _localctx = new Assign_jsonContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_assign_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			json_name();
			setState(1879);
			match(ASSIGN);
			setState(1882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM_NAME:
				{
				setState(1880);
				json_name();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(1881);
				json_statment();
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

	public static class Create_json_formContext extends ParserRuleContext {
		public Create_json_object_without_assignContext create_json_object_without_assign() {
			return getRuleContext(Create_json_object_without_assignContext.class,0);
		}
		public Create_json_with_assignContext create_json_with_assign() {
			return getRuleContext(Create_json_with_assignContext.class,0);
		}
		public Create_json_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_json_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_json_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_json_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_formContext create_json_form() throws RecognitionException {
		Create_json_formContext _localctx = new Create_json_formContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_create_json_form);
		try {
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1884);
				create_json_object_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				create_json_with_assign();
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

	public static class Create_json_object_without_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Json_nameContext json_name() {
			return getRuleContext(Json_nameContext.class,0);
		}
		public Create_json_object_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_object_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_json_object_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_json_object_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_json_object_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_object_without_assignContext create_json_object_without_assign() throws RecognitionException {
		Create_json_object_without_assignContext _localctx = new Create_json_object_without_assignContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_create_json_object_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(K_VAR);
			setState(1889);
			json_name();
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

	public static class Create_json_with_assignContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Assign_jsonContext assign_json() {
			return getRuleContext(Assign_jsonContext.class,0);
		}
		public Create_json_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_json_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_json_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_json_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_with_assignContext create_json_with_assign() throws RecognitionException {
		Create_json_with_assignContext _localctx = new Create_json_with_assignContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_create_json_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(K_VAR);
			setState(1892);
			assign_json();
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

	public static class Inside_json_statmnetContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public Value_json_statmnetContext value_json_statmnet() {
			return getRuleContext(Value_json_statmnetContext.class,0);
		}
		public Inside_json_statmnetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_json_statmnet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInside_json_statmnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInside_json_statmnet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInside_json_statmnet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_json_statmnetContext inside_json_statmnet() throws RecognitionException {
		Inside_json_statmnetContext _localctx = new Inside_json_statmnetContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_inside_json_statmnet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			use_random_name();
			setState(1895);
			match(COLON);
			setState(1896);
			value_json_statmnet();
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

	public static class Json_statmentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(SQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(SQLParser.CLOSE_BRACKET, 0); }
		public List<Inside_json_statmnetContext> inside_json_statmnet() {
			return getRuleContexts(Inside_json_statmnetContext.class);
		}
		public Inside_json_statmnetContext inside_json_statmnet(int i) {
			return getRuleContext(Inside_json_statmnetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_statmentContext json_statment() throws RecognitionException {
		Json_statmentContext _localctx = new Json_statmentContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_json_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			match(OPEN_BRACKET);
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				{
				setState(1899);
				inside_json_statmnet();
				}
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1900);
					match(COMMA);
					setState(1901);
					inside_json_statmnet();
					}
					}
					setState(1906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1909);
			match(CLOSE_BRACKET);
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

	public static class Value_json_statmnetContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public Json_statmentContext json_statment() {
			return getRuleContext(Json_statmentContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Array_objects_form2Context array_objects_form2() {
			return getRuleContext(Array_objects_form2Context.class,0);
		}
		public TerminalNode OPEN_SQER_BAR() { return getToken(SQLParser.OPEN_SQER_BAR, 0); }
		public Value_left_sideContext value_left_side() {
			return getRuleContext(Value_left_sideContext.class,0);
		}
		public TerminalNode CLOSE_SQER_PAR() { return getToken(SQLParser.CLOSE_SQER_PAR, 0); }
		public Value_json_statmnetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_json_statmnet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue_json_statmnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue_json_statmnet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue_json_statmnet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_json_statmnetContext value_json_statmnet() throws RecognitionException {
		Value_json_statmnetContext _localctx = new Value_json_statmnetContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_value_json_statmnet);
		try {
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1913);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1914);
				match(K_NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1915);
				varible_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1916);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1917);
				json_statment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1918);
				varible_from_object();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1919);
				call_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1920);
				array_base_form_with_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1921);
				array_objects_form2();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1922);
				match(OPEN_SQER_BAR);
				setState(1923);
				value_left_side();
				setState(1924);
				match(CLOSE_SQER_PAR);
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

	public static class Varible_from_objectContext extends ParserRuleContext {
		public Json_nameContext json_name() {
			return getRuleContext(Json_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public Varible_from_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible_from_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVarible_from_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVarible_from_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVarible_from_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varible_from_objectContext varible_from_object() throws RecognitionException {
		Varible_from_objectContext _localctx = new Varible_from_objectContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_varible_from_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			json_name();
			setState(1931); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1929);
					match(DOT);
					setState(1930);
					varible_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1933); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Shortcut_statmentsContext extends ParserRuleContext {
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public Shortcut_statmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterShortcut_statments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitShortcut_statments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitShortcut_statments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shortcut_statmentsContext shortcut_statments() throws RecognitionException {
		Shortcut_statmentsContext _localctx = new Shortcut_statmentsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_shortcut_statments);
		try {
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1935);
				match(MINUS_MINUS);
				setState(1936);
				use_random_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1937);
				match(PLUS_PLUS);
				setState(1938);
				use_random_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1939);
				use_random_name();
				setState(1940);
				match(MINUS_MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1942);
				use_random_name();
				setState(1943);
				match(PLUS_PLUS);
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

	public static class Any_arithmetic_opratorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode POWER() { return getToken(SQLParser.POWER, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Any_arithmetic_opratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_arithmetic_oprator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_arithmetic_oprator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_arithmetic_oprator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_arithmetic_oprator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_arithmetic_opratorContext any_arithmetic_oprator() throws RecognitionException {
		Any_arithmetic_opratorContext _localctx = new Any_arithmetic_opratorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_any_arithmetic_oprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public Intral_expression_valueContext intral_expression_value() {
			return getRuleContext(Intral_expression_valueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode GT3() { return getToken(SQLParser.GT3, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode AMP2() { return getToken(SQLParser.AMP2, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(SQLParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FALSE:
			case K_TRUE:
			case ONE_CHAR_LETTER:
			case IDENTIFIER:
			case RANDOM_NAME:
			case NUMERIC_LITERAL:
				{
				setState(1950);
				intral_expression_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1952); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1951);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1954); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1956);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1957);
					genral_assign();
					}
					break;
				}
				setState(1961); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1960);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1963); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PLUS_PLUS:
				{
				setState(1965);
				match(PLUS_PLUS);
				setState(1966);
				expression(13);
				}
				break;
			case MINUS_MINUS:
				{
				setState(1967);
				match(MINUS_MINUS);
				setState(1968);
				expression(12);
				}
				break;
			case PLUS:
			case MINUS:
			case TILDE:
			case K_NOT:
				{
				setState(1969);
				unary_operator();
				setState(1970);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2011);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1974);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1975);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1976);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1977);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1978);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1979);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1980);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1981);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << GT3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1982);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1983);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1984);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1985);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1986);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1987);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1988);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1989);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1990);
						match(AMP);
						setState(1991);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1992);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1993);
						match(PIPE);
						setState(1994);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1995);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1996);
						match(AMP2);
						setState(1997);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1998);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1999);
						match(PIPE2);
						setState(2000);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2001);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2002);
						match(QUESTION_MARK);
						setState(2003);
						expression(0);
						setState(2004);
						match(COLON);
						setState(2005);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2007);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2008);
						match(PLUS_PLUS);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2009);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2010);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(2015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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

	public static class Intral_expression_valueContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(SQLParser.ONE_CHAR_LETTER, 0); }
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Intral_expression_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intral_expression_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIntral_expression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIntral_expression_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIntral_expression_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intral_expression_valueContext intral_expression_value() throws RecognitionException {
		Intral_expression_valueContext _localctx = new Intral_expression_valueContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_intral_expression_value);
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2016);
				match(K_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
				match(K_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2018);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2019);
				varible_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2020);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2021);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2022);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2023);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2024);
				call_function();
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

	public static class Use_random_nameContext extends ParserRuleContext {
		public TerminalNode RANDOM_NAME() { return getToken(SQLParser.RANDOM_NAME, 0); }
		public Use_random_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_random_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUse_random_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUse_random_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUse_random_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_random_nameContext use_random_name() throws RecognitionException {
		Use_random_nameContext _localctx = new Use_random_nameContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_use_random_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(RANDOM_NAME);
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
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 154:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c3\u07f0\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\3\2\3\2\3\2\3\2\7\2\u0141"+
		"\n\2\f\2\16\2\u0144\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u014c\n\4\f\4\16"+
		"\4\u014f\13\4\3\4\3\4\6\4\u0153\n\4\r\4\16\4\u0154\3\4\7\4\u0158\n\4\f"+
		"\4\16\4\u015b\13\4\3\4\7\4\u015e\n\4\f\4\16\4\u0161\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u016b\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0172\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0179\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u0181\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0192"+
		"\n\13\3\13\3\13\3\13\5\13\u0197\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u01a0\n\13\f\13\16\13\u01a3\13\13\3\13\3\13\3\13\3\13\5\13\u01a9"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u01af\n\f\3\r\3\r\3\r\3\r\5\r\u01b5\n\r\3\r"+
		"\3\r\3\r\5\r\u01ba\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01c4"+
		"\n\16\f\16\16\16\u01c7\13\16\5\16\u01c9\n\16\3\16\3\16\3\16\5\16\u01ce"+
		"\n\16\5\16\u01d0\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u01d7\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u01de\n\17\f\17\16\17\u01e1\13\17\3\17\3\17\5"+
		"\17\u01e5\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u01ec\n\17\f\17\16\17\u01ef"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01f7\n\17\f\17\16\17\u01fa"+
		"\13\17\3\17\3\17\7\17\u01fe\n\17\f\17\16\17\u0201\13\17\3\17\3\17\3\17"+
		"\5\17\u0206\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u020e\n\20\f\20\16"+
		"\20\u0211\13\20\5\20\u0213\n\20\3\20\3\20\3\20\5\20\u0218\n\20\5\20\u021a"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u0221\n\22\3\22\3\22\3\22\7\22\u0226"+
		"\n\22\f\22\16\22\u0229\13\22\3\22\3\22\3\22\3\22\7\22\u022f\n\22\f\22"+
		"\16\22\u0232\13\22\3\22\5\22\u0235\n\22\5\22\u0237\n\22\3\22\5\22\u023a"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u0241\n\22\f\22\16\22\u0244\13\22"+
		"\3\22\5\22\u0247\n\22\5\22\u0249\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u0250"+
		"\n\22\f\22\16\22\u0253\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u025b"+
		"\n\22\f\22\16\22\u025e\13\22\3\22\3\22\7\22\u0262\n\22\f\22\16\22\u0265"+
		"\13\22\5\22\u0267\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0272\n\24\f\24\16\24\u0275\13\24\3\24\3\24\5\24\u0279\n\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\7\26\u0282\n\26\f\26\16\26\u0285\13\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0290\n\27\3\30\3\30"+
		"\5\30\u0294\n\30\3\31\3\31\5\31\u0298\n\31\3\31\3\31\3\31\5\31\u029d\n"+
		"\31\3\32\3\32\5\32\u02a1\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u02ac\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u02b8\n\35\3\35\5\35\u02bb\n\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02d0\n!\3!\3!\6!\u02d4\n!\r!\16"+
		"!\u02d5\5!\u02d8\n!\3\"\3\"\5\"\u02dc\n\"\3#\3#\3#\3#\3#\5#\u02e3\n#\3"+
		"#\3#\3#\5#\u02e8\n#\3#\3#\3#\3#\3#\3#\3#\5#\u02f1\n#\3#\3#\3#\7#\u02f6"+
		"\n#\f#\16#\u02f9\13#\3#\5#\u02fc\n#\3#\3#\3#\3#\3#\3#\5#\u0304\n#\3#\3"+
		"#\3#\3#\7#\u030a\n#\f#\16#\u030d\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\5$\u0320\n$\3$\3$\5$\u0324\n$\3%\3%\3%\3%\5%\u032a"+
		"\n%\3%\3%\3%\3%\3%\7%\u0331\n%\f%\16%\u0334\13%\3%\3%\5%\u0338\n%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0344\n%\3%\3%\5%\u0348\n%\7%\u034a\n%\f"+
		"%\16%\u034d\13%\3%\5%\u0350\n%\3%\3%\3%\3%\3%\5%\u0357\n%\3%\5%\u035a"+
		"\n%\5%\u035c\n%\3&\3&\3\'\3\'\3\'\5\'\u0363\n\'\3\'\5\'\u0366\n\'\3(\3"+
		"(\5(\u036a\n(\3(\3(\3(\3(\3(\5(\u0371\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\7*\u037e\n*\f*\16*\u0381\13*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u038b\n+"+
		"\f+\16+\u038e\13+\3+\3+\3+\3,\3,\5,\u0395\n,\3,\5,\u0398\n,\3,\3,\3,\3"+
		",\7,\u039e\n,\f,\16,\u03a1\13,\3,\3,\3-\3-\5-\u03a7\n-\3-\3-\3-\3-\7-"+
		"\u03ad\n-\f-\16-\u03b0\13-\3-\3-\3.\3.\3/\3/\3/\5/\u03b9\n/\3/\3/\3/\3"+
		"/\3/\3/\5/\u03c1\n/\3\60\3\60\5\60\u03c5\n\60\3\61\3\61\3\61\5\61\u03ca"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u03d1\n\62\f\62\16\62\u03d4\13\62"+
		"\3\62\3\62\5\62\u03d8\n\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u03e6\n\63\3\63\5\63\u03e9\n\63\5\63\u03eb\n\63\3"+
		"\64\3\64\3\64\5\64\u03f0\n\64\3\64\3\64\5\64\u03f4\n\64\3\64\5\64\u03f7"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u03fe\n\64\3\64\3\64\3\64\3\64\7\64"+
		"\u0404\n\64\f\64\16\64\u0407\13\64\3\64\5\64\u040a\n\64\3\64\3\64\5\64"+
		"\u040e\n\64\3\64\5\64\u0411\n\64\3\64\3\64\3\64\3\64\5\64\u0417\n\64\3"+
		"\64\5\64\u041a\n\64\5\64\u041c\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u0423"+
		"\n\65\f\65\16\65\u0426\13\65\3\66\3\66\3\66\5\66\u042b\n\66\3\66\5\66"+
		"\u042e\n\66\3\66\5\66\u0431\n\66\3\67\3\67\5\67\u0435\n\67\38\38\58\u0439"+
		"\n8\38\38\38\78\u043e\n8\f8\168\u0441\138\38\38\38\38\78\u0447\n8\f8\16"+
		"8\u044a\138\38\58\u044d\n8\58\u044f\n8\38\58\u0452\n8\38\38\38\38\38\7"+
		"8\u0459\n8\f8\168\u045c\138\38\58\u045f\n8\58\u0461\n8\38\38\38\38\58"+
		"\u0467\n8\39\39\39\39\79\u046d\n9\f9\169\u0470\139\39\39\3:\3:\7:\u0476"+
		"\n:\f:\16:\u0479\13:\3;\3;\3;\3<\3<\3<\3<\3<\7<\u0483\n<\f<\16<\u0486"+
		"\13<\3<\3<\5<\u048a\n<\3=\5=\u048d\n=\3=\3=\5=\u0491\n=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\5A\u049b\nA\3B\3B\3B\5B\u04a0\nB\3C\3C\3D\7D\u04a5\nD\fD\16"+
		"D\u04a8\13D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3"+
		"N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\5U\u04cc\nU\3V\3V\3W\3W\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04e1\nX\3X\3X\7X\u04e5"+
		"\nX\fX\16X\u04e8\13X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u04f4\nY\fY\16Y"+
		"\u04f7\13Y\3Y\5Y\u04fa\nY\3Z\3Z\3Z\3Z\3Z\5Z\u0501\nZ\3[\5[\u0504\n[\3"+
		"[\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u050e\n\\\f\\\16\\\u0511\13\\\3\\\3\\"+
		"\7\\\u0515\n\\\f\\\16\\\u0518\13\\\5\\\u051a\n\\\3\\\3\\\3]\3]\3]\7]\u0521"+
		"\n]\f]\16]\u0524\13]\3]\3]\3]\5]\u0529\n]\3]\3]\3^\3^\3^\7^\u0530\n^\f"+
		"^\16^\u0533\13^\3^\3^\3_\3_\5_\u0539\n_\3`\3`\3`\3`\3`\3`\5`\u0541\n`"+
		"\3`\5`\u0544\n`\3`\3`\3`\7`\u0549\n`\f`\16`\u054c\13`\3`\3`\3`\5`\u0551"+
		"\n`\3`\3`\5`\u0555\n`\5`\u0557\n`\3a\3a\3a\3a\3a\3a\5a\u055f\na\3a\3a"+
		"\3b\3b\3b\3b\3b\7b\u0568\nb\fb\16b\u056b\13b\7b\u056d\nb\fb\16b\u0570"+
		"\13b\3b\3b\3c\3c\3c\3d\3d\5d\u0579\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0584"+
		"\ne\3f\3f\5f\u0588\nf\3g\3g\5g\u058c\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\5h\u059c\nh\3i\3i\3i\3i\3i\7i\u05a3\ni\fi\16i\u05a6\13i\3"+
		"i\3i\3j\3j\3j\3j\3j\5j\u05af\nj\3k\3k\7k\u05b3\nk\fk\16k\u05b6\13k\3k"+
		"\5k\u05b9\nk\3l\3l\3l\3l\5l\u05bf\nl\3l\3l\3l\7l\u05c4\nl\fl\16l\u05c7"+
		"\13l\3l\3l\3l\5l\u05cc\nl\3l\3l\3l\5l\u05d1\nl\3l\5l\u05d4\nl\3m\3m\3"+
		"m\3m\5m\u05da\nm\3m\3m\3m\7m\u05df\nm\fm\16m\u05e2\13m\3m\3m\3m\5m\u05e7"+
		"\nm\3m\3m\3m\5m\u05ec\nm\3m\5m\u05ef\nm\3n\3n\3n\7n\u05f4\nn\fn\16n\u05f7"+
		"\13n\3n\3n\3n\5n\u05fc\nn\3n\3n\3n\5n\u0601\nn\3n\5n\u0604\nn\3o\3o\3"+
		"o\3o\5o\u060a\no\3o\3o\3p\3p\5p\u0610\np\3p\3p\3p\7p\u0615\np\fp\16p\u0618"+
		"\13p\3p\3p\3p\5p\u061d\np\3p\3p\5p\u0621\np\3p\3p\3p\3q\3q\3q\3q\3q\5"+
		"q\u062b\nq\5q\u062d\nq\3q\3q\5q\u0631\nq\3q\3q\5q\u0635\nq\3q\3q\3r\3"+
		"r\3r\3r\5r\u063d\nr\3s\3s\3s\3s\3s\7s\u0644\ns\fs\16s\u0647\13s\3s\3s"+
		"\3s\7s\u064c\ns\fs\16s\u064f\13s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u065c"+
		"\nt\3t\3t\3t\7t\u0661\nt\ft\16t\u0664\13t\3t\5t\u0667\nt\5t\u0669\nt\3"+
		"t\3t\3u\3u\3u\7u\u0670\nu\fu\16u\u0673\13u\3u\3u\5u\u0677\nu\3u\5u\u067a"+
		"\nu\3v\3v\3v\3v\3v\3v\5v\u0682\nv\3v\3v\7v\u0686\nv\fv\16v\u0689\13v\3"+
		"v\3v\5v\u068d\nv\3v\5v\u0690\nv\3w\3w\5w\u0694\nw\3x\3x\3x\5x\u0699\n"+
		"x\3y\3y\3y\5y\u069e\ny\3z\3z\3z\5z\u06a3\nz\3{\3{\3|\3|\5|\u06a9\n|\3"+
		"|\3|\6|\u06ad\n|\r|\16|\u06ae\3|\3|\3|\3|\5|\u06b5\n|\3}\3}\3}\3~\3~\3"+
		"~\3\177\3\177\3\u0080\3\u0080\5\u0080\u06c1\n\u0080\3\u0080\3\u0080\6"+
		"\u0080\u06c5\n\u0080\r\u0080\16\u0080\u06c6\3\u0080\3\u0080\3\u0080\5"+
		"\u0080\u06cc\n\u0080\3\u0081\3\u0081\5\u0081\u06d0\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\6\u0084"+
		"\u06dc\n\u0084\r\u0084\16\u0084\u06dd\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u06e5\n\u0085\3\u0085\6\u0085\u06e8\n\u0085\r\u0085\16"+
		"\u0085\u06e9\3\u0086\3\u0086\3\u0086\7\u0086\u06ef\n\u0086\f\u0086\16"+
		"\u0086\u06f2\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\7\u0088\u06fb\n\u0088\f\u0088\16\u0088\u06fe\13\u0088\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u0703\n\u0089\f\u0089\16\u0089\u0706\13\u0089"+
		"\3\u008a\3\u008a\3\u008a\7\u008a\u070b\n\u008a\f\u008a\16\u008a\u070e"+
		"\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u0716"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u071b\n\u008c\7\u008c\u071d\n"+
		"\u008c\f\u008c\16\u008c\u0720\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0728\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0732\n\u008d\7\u008d\u0734\n"+
		"\u008d\f\u008d\16\u008d\u0737\13\u008d\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u073c\n\u008e\f\u008e\16\u008e\u073f\13\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u074b"+
		"\n\u008f\3\u0090\3\u0090\5\u0090\u074f\n\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0755\n\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u075d\n\u0092\3\u0093\3\u0093\5\u0093\u0761\n\u0093\3"+
		"\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u0771\n\u0097\f\u0097"+
		"\16\u0097\u0774\13\u0097\5\u0097\u0776\n\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0789\n\u0098\3\u0099"+
		"\3\u0099\3\u0099\6\u0099\u078e\n\u0099\r\u0099\16\u0099\u078f\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u079c\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\6\u009c"+
		"\u07a3\n\u009c\r\u009c\16\u009c\u07a4\3\u009c\3\u009c\5\u009c\u07a9\n"+
		"\u009c\3\u009c\6\u009c\u07ac\n\u009c\r\u009c\16\u009c\u07ad\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u07b7\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\7\u009c\u07de\n\u009c\f\u009c\16\u009c\u07e1\13\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u07ec\n\u009d\3\u009e\3\u009e\3\u009e\2\4D\u0136\u009f\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\2\22\4\2\16\16\u0082\u0082\4\2--PP\4\2\62\62MM\4\2\21\21\27\30\3\2\23"+
		"\24\5\2\31\32\34\34\36\36\3\2\37\"\4\2LL\u00a8\u00a8\7\2EG\u0080\u0080"+
		"\u00bb\u00bb\u00be\u00be\u00c0\u00c0\4\2\23\25~~\16\2)8:MOSU\\__a\u0083"+
		"\u0085\u008a\u008c\u0092\u0094\u009c\u009e\u00a3\u00a5\u00ab\u00ad\u00b2"+
		"\3\2\u00bb\u00bd\4\299\u00b4\u00b4\4\2\21\24\27\30\3\2\31\33\3\2#$\2\u08ea"+
		"\2\u0142\3\2\2\2\4\u0147\3\2\2\2\6\u014d\3\2\2\2\b\u016a\3\2\2\2\n\u016c"+
		"\3\2\2\2\f\u017a\3\2\2\2\16\u017e\3\2\2\2\20\u0184\3\2\2\2\22\u0189\3"+
		"\2\2\2\24\u018c\3\2\2\2\26\u01aa\3\2\2\2\30\u01b0\3\2\2\2\32\u01bd\3\2"+
		"\2\2\34\u01d1\3\2\2\2\36\u0207\3\2\2\2 \u021b\3\2\2\2\"\u0266\3\2\2\2"+
		"$\u0268\3\2\2\2&\u026b\3\2\2\2(\u027a\3\2\2\2*\u027e\3\2\2\2,\u0286\3"+
		"\2\2\2.\u0291\3\2\2\2\60\u0295\3\2\2\2\62\u02a0\3\2\2\2\64\u02ad\3\2\2"+
		"\2\66\u02b2\3\2\2\28\u02b4\3\2\2\2:\u02bc\3\2\2\2<\u02be\3\2\2\2>\u02c1"+
		"\3\2\2\2@\u02c3\3\2\2\2B\u02db\3\2\2\2D\u0303\3\2\2\2F\u0323\3\2\2\2H"+
		"\u0325\3\2\2\2J\u035d\3\2\2\2L\u035f\3\2\2\2N\u0369\3\2\2\2P\u0372\3\2"+
		"\2\2R\u0377\3\2\2\2T\u0384\3\2\2\2V\u0392\3\2\2\2X\u03a4\3\2\2\2Z\u03b3"+
		"\3\2\2\2\\\u03b8\3\2\2\2^\u03c2\3\2\2\2`\u03c9\3\2\2\2b\u03cb\3\2\2\2"+
		"d\u03ea\3\2\2\2f\u041b\3\2\2\2h\u041d\3\2\2\2j\u0430\3\2\2\2l\u0434\3"+
		"\2\2\2n\u0466\3\2\2\2p\u0468\3\2\2\2r\u0477\3\2\2\2t\u047a\3\2\2\2v\u047d"+
		"\3\2\2\2x\u0490\3\2\2\2z\u0492\3\2\2\2|\u0494\3\2\2\2~\u0496\3\2\2\2\u0080"+
		"\u049a\3\2\2\2\u0082\u049f\3\2\2\2\u0084\u04a1\3\2\2\2\u0086\u04a6\3\2"+
		"\2\2\u0088\u04a9\3\2\2\2\u008a\u04ab\3\2\2\2\u008c\u04ad\3\2\2\2\u008e"+
		"\u04af\3\2\2\2\u0090\u04b1\3\2\2\2\u0092\u04b3\3\2\2\2\u0094\u04b5\3\2"+
		"\2\2\u0096\u04b7\3\2\2\2\u0098\u04b9\3\2\2\2\u009a\u04bb\3\2\2\2\u009c"+
		"\u04bd\3\2\2\2\u009e\u04bf\3\2\2\2\u00a0\u04c1\3\2\2\2\u00a2\u04c3\3\2"+
		"\2\2\u00a4\u04c5\3\2\2\2\u00a6\u04c7\3\2\2\2\u00a8\u04cb\3\2\2\2\u00aa"+
		"\u04cd\3\2\2\2\u00ac\u04cf\3\2\2\2\u00ae\u04d1\3\2\2\2\u00b0\u04f9\3\2"+
		"\2\2\u00b2\u0500\3\2\2\2\u00b4\u0503\3\2\2\2\u00b6\u0508\3\2\2\2\u00b8"+
		"\u051d\3\2\2\2\u00ba\u052c\3\2\2\2\u00bc\u0538\3\2\2\2\u00be\u0556\3\2"+
		"\2\2\u00c0\u055e\3\2\2\2\u00c2\u0562\3\2\2\2\u00c4\u0573\3\2\2\2\u00c6"+
		"\u0578\3\2\2\2\u00c8\u0583\3\2\2\2\u00ca\u0587\3\2\2\2\u00cc\u058b\3\2"+
		"\2\2\u00ce\u059b\3\2\2\2\u00d0\u059d\3\2\2\2\u00d2\u05ae\3\2\2\2\u00d4"+
		"\u05b0\3\2\2\2\u00d6\u05ba\3\2\2\2\u00d8\u05d5\3\2\2\2\u00da\u05f0\3\2"+
		"\2\2\u00dc\u0605\3\2\2\2\u00de\u060d\3\2\2\2\u00e0\u0625\3\2\2\2\u00e2"+
		"\u063c\3\2\2\2\u00e4\u063e\3\2\2\2\u00e6\u0652\3\2\2\2\u00e8\u066c\3\2"+
		"\2\2\u00ea\u067b\3\2\2\2\u00ec\u0693\3\2\2\2\u00ee\u0698\3\2\2\2\u00f0"+
		"\u069d\3\2\2\2\u00f2\u06a2\3\2\2\2\u00f4\u06a4\3\2\2\2\u00f6\u06ac\3\2"+
		"\2\2\u00f8\u06b6\3\2\2\2\u00fa\u06b9\3\2\2\2\u00fc\u06bc\3\2\2\2\u00fe"+
		"\u06c4\3\2\2\2\u0100\u06cf\3\2\2\2\u0102\u06d1\3\2\2\2\u0104\u06d4\3\2"+
		"\2\2\u0106\u06d9\3\2\2\2\u0108\u06df\3\2\2\2\u010a\u06eb\3\2\2\2\u010c"+
		"\u06f3\3\2\2\2\u010e\u06f7\3\2\2\2\u0110\u06ff\3\2\2\2\u0112\u0707\3\2"+
		"\2\2\u0114\u070f\3\2\2\2\u0116\u0715\3\2\2\2\u0118\u0727\3\2\2\2\u011a"+
		"\u0738\3\2\2\2\u011c\u074a\3\2\2\2\u011e\u0754\3\2\2\2\u0120\u0756\3\2"+
		"\2\2\u0122\u0758\3\2\2\2\u0124\u0760\3\2\2\2\u0126\u0762\3\2\2\2\u0128"+
		"\u0765\3\2\2\2\u012a\u0768\3\2\2\2\u012c\u076c\3\2\2\2\u012e\u0788\3\2"+
		"\2\2\u0130\u078a\3\2\2\2\u0132\u079b\3\2\2\2\u0134\u079d\3\2\2\2\u0136"+
		"\u07b6\3\2\2\2\u0138\u07eb\3\2\2\2\u013a\u07ed\3\2\2\2\u013c\u0141\5\u00ae"+
		"X\2\u013d\u0141\5\6\4\2\u013e\u0141\5\4\3\2\u013f\u0141\5\u00b4[\2\u0140"+
		"\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\2\2\3\u0146\3\3\2\2\2"+
		"\u0147\u0148\7\u00c3\2\2\u0148\u0149\b\3\1\2\u0149\5\3\2\2\2\u014a\u014c"+
		"\7\6\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0159\5\b"+
		"\5\2\u0151\u0153\7\6\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\5\b"+
		"\5\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\7\6"+
		"\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\7\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u016b\5\u00ae"+
		"X\2\u0163\u016b\5\n\6\2\u0164\u016b\5\24\13\2\u0165\u016b\5\26\f\2\u0166"+
		"\u016b\5\30\r\2\u0167\u016b\5\32\16\2\u0168\u016b\5\34\17\2\u0169\u016b"+
		"\5&\24\2\u016a\u0162\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u0169\3\2\2\2\u016b\t\3\2\2\2\u016c\u016d\7.\2\2\u016d\u0171"+
		"\7\u009e\2\2\u016e\u016f\5\u008cG\2\u016f\u0170\7\7\2\2\u0170\u0172\3"+
		"\2\2\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0178\5\u008eH\2\u0174\u0179\5\f\7\2\u0175\u0179\5\22\n\2\u0176\u0179"+
		"\5\20\t\2\u0177\u0179\5\16\b\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\13\3\2\2\2\u017a\u017b"+
		"\7\u0094\2\2\u017b\u017c\7\u00a2\2\2\u017c\u017d\5\u0094K\2\u017d\r\3"+
		"\2\2\2\u017e\u0180\7+\2\2\u017f\u0181\7?\2\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5*\26\2\u0183\17\3\2\2"+
		"\2\u0184\u0185\7+\2\2\u0185\u0186\7B\2\2\u0186\u0187\5\u013a\u009e\2\u0187"+
		"\u0188\5N(\2\u0188\21\3\2\2\2\u0189\u018a\7+\2\2\u018a\u018b\5N(\2\u018b"+
		"\23\3\2\2\2\u018c\u018d\7C\2\2\u018d\u0191\7\u009e\2\2\u018e\u018f\7g"+
		"\2\2\u018f\u0190\7~\2\2\u0190\u0192\7Z\2\2\u0191\u018e\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0194\5\u008cG\2\u0194\u0195\7\7\2"+
		"\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u01a8\5\u0090I\2\u0199\u019a\7\b\2\2\u019a\u01a1\5*\26"+
		"\2\u019b\u019c\7\16\2\2\u019c\u01a0\5N(\2\u019d\u019e\7\16\2\2\u019e\u01a0"+
		"\5*\26\2\u019f\u019b\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a5\7\t\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a7\7\61\2\2\u01a7"+
		"\u01a9\5\36\20\2\u01a8\u0199\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\25\3\2"+
		"\2\2\u01aa\u01ab\7L\2\2\u01ab\u01ac\7b\2\2\u01ac\u01ae\5\\/\2\u01ad\u01af"+
		"\5$\23\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\27\3\2\2\2\u01b0"+
		"\u01b1\7Q\2\2\u01b1\u01b4\7\u009e\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b5\7"+
		"Z\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6"+
		"\u01b7\5\u008cG\2\u01b7\u01b8\7\7\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5\u0090I"+
		"\2\u01bc\31\3\2\2\2\u01bd\u01c8\5n8\2\u01be\u01bf\7\u0086\2\2\u01bf\u01c0"+
		"\78\2\2\u01c0\u01c5\5^\60\2\u01c1\u01c2\7\16\2\2\u01c2\u01c4\5^\60\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01be\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cf\3\2\2\2\u01ca\u01cd\5 \21\2\u01cb\u01cc\t\2"+
		"\2\2\u01cc\u01ce\5D#\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\33\3\2\2\2\u01d1"+
		"\u01d2\7o\2\2\u01d2\u01d6\7r\2\2\u01d3\u01d4\5\u008cG\2\u01d4\u01d5\7"+
		"\7\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01e4\5\u0090I\2\u01d9\u01da\7\b\2\2\u01da\u01df"+
		"\5\u0096L\2\u01db\u01dc\7\16\2\2\u01dc\u01de\5\u0096L\2\u01dd\u01db\3"+
		"\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\t\2\2\u01e3\u01e5\3\2"+
		"\2\2\u01e4\u01d9\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u0205\3\2\2\2\u01e6"+
		"\u01e7\7\u00ab\2\2\u01e7\u01e8\7\b\2\2\u01e8\u01ed\5D#\2\u01e9\u01ea\7"+
		"\16\2\2\u01ea\u01ec\5D#\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01f0\u01ff\7\t\2\2\u01f1\u01f2\7\16\2\2\u01f2\u01f3\7\b\2\2\u01f3"+
		"\u01f8\5D#\2\u01f4\u01f5\7\16\2\2\u01f5\u01f7\5D#\2\u01f6\u01f4\3\2\2"+
		"\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb"+
		"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7\t\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01f1\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0206\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0206\5\36\20\2\u0203"+
		"\u0204\7I\2\2\u0204\u0206\7\u00ab\2\2\u0205\u01e6\3\2\2\2\u0205\u0202"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0206\35\3\2\2\2\u0207\u0212\5\"\22\2\u0208"+
		"\u0209\7\u0086\2\2\u0209\u020a\78\2\2\u020a\u020f\5^\60\2\u020b\u020c"+
		"\7\16\2\2\u020c\u020e\5^\60\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f"+
		"\3\2\2\2\u0212\u0208\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0219\3\2\2\2\u0214"+
		"\u0217\5 \21\2\u0215\u0216\t\2\2\2\u0216\u0218\5D#\2\u0217\u0215\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\37\3\2\2\2\u021b\u021c\7y\2\2\u021c\u021d\5D#\2\u021d!"+
		"\3\2\2\2\u021e\u0220\7\u009b\2\2\u021f\u0221\t\3\2\2\u0220\u021f\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0227\5d\63\2\u0223\u0224"+
		"\7\16\2\2\u0224\u0226\5d\63\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0236\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u022a\u0234\7b\2\2\u022b\u0230\5f\64\2\u022c\u022d\7\16\2\2\u022d"+
		"\u022f\5f\64\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0235\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0235\5h\65\2\u0234\u022b\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u022a\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238"+
		"\u023a\5$\23\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0248\3\2"+
		"\2\2\u023b\u023c\7e\2\2\u023c\u023d\78\2\2\u023d\u0242\5D#\2\u023e\u023f"+
		"\7\16\2\2\u023f\u0241\5D#\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2"+
		"\2\2\u0245\u0247\5t;\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249"+
		"\3\2\2\2\u0248\u023b\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0267\3\2\2\2\u024a"+
		"\u024b\7\u00ab\2\2\u024b\u024c\7\b\2\2\u024c\u0251\5D#\2\u024d\u024e\7"+
		"\16\2\2\u024e\u0250\5D#\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u0263\7\t\2\2\u0255\u0256\7\16\2\2\u0256\u0257\7\b\2\2\u0257"+
		"\u025c\5D#\2\u0258\u0259\7\16\2\2\u0259\u025b\5D#\2\u025a\u0258\3\2\2"+
		"\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\7\t\2\2\u0260\u0262\3\2\2\2\u0261"+
		"\u0255\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u021e\3\2\2\2\u0266"+
		"\u024a\3\2\2\2\u0267#\3\2\2\2\u0268\u0269\7\u00b0\2\2\u0269\u026a\5D#"+
		"\2\u026a%\3\2\2\2\u026b\u026c\7\u00a8\2\2\u026c\u026d\5\\/\2\u026d\u026e"+
		"\7\u009c\2\2\u026e\u0273\5(\25\2\u026f\u0270\7\16\2\2\u0270\u0272\5(\25"+
		"\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7\u00b0\2"+
		"\2\u0277\u0279\5D#\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\'\3"+
		"\2\2\2\u027a\u027b\5\u0096L\2\u027b\u027c\7\20\2\2\u027c\u027d\5D#\2\u027d"+
		")\3\2\2\2\u027e\u0283\5\u0096L\2\u027f\u0282\5\62\32\2\u0280\u0282\5,"+
		"\27\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284+\3\2\2\2\u0285\u0283\3\2\2\2"+
		"\u0286\u028f\5\u0088E\2\u0287\u0288\7\b\2\2\u0288\u0289\5.\30\2\u0289"+
		"\u028a\7\t\2\2\u028a\u0290\3\2\2\2\u028b\u028c\7\b\2\2\u028c\u028d\5\60"+
		"\31\2\u028d\u028e\7\t\2\2\u028e\u0290\3\2\2\2\u028f\u0287\3\2\2\2\u028f"+
		"\u028b\3\2\2\2\u028f\u0290\3\2\2\2\u0290-\3\2\2\2\u0291\u0293\5x=\2\u0292"+
		"\u0294\5\u013a\u009e\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294/"+
		"\3\2\2\2\u0295\u0297\5x=\2\u0296\u0298\5\u013a\u009e\2\u0297\u0296\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7\16\2\2\u029a"+
		"\u029c\5x=\2\u029b\u029d\5\u013a\u009e\2\u029c\u029b\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\61\3\2\2\2\u029e\u029f\7B\2\2\u029f\u02a1\5\u0088E\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02ab\3\2\2\2\u02a2\u02ac\58"+
		"\35\2\u02a3\u02ac\5:\36\2\u02a4\u02ac\5<\37\2\u02a5\u02ac\5> \2\u02a6"+
		"\u02ac\5\66\34\2\u02a7\u02ac\5\64\33\2\u02a8\u02ac\5@!\2\u02a9\u02aa\7"+
		">\2\2\u02aa\u02ac\5\u0098M\2\u02ab\u02a2\3\2\2\2\u02ab\u02a3\3\2\2\2\u02ab"+
		"\u02a4\3\2\2\2\u02ab\u02a5\3\2\2\2\u02ab\u02a6\3\2\2\2\u02ab\u02a7\3\2"+
		"\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\63\3\2\2\2\u02ad\u02ae"+
		"\7=\2\2\u02ae\u02af\7\b\2\2\u02af\u02b0\5D#\2\u02b0\u02b1\7\t\2\2\u02b1"+
		"\65\3\2\2\2\u02b2\u02b3\7\u00a7\2\2\u02b3\67\3\2\2\2\u02b4\u02b5\7\u008a"+
		"\2\2\u02b5\u02b7\7v\2\2\u02b6\u02b8\t\4\2\2\u02b7\u02b6\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02bb\7\64\2\2\u02ba\u02b9\3"+
		"\2\2\2\u02ba\u02bb\3\2\2\2\u02bb9\3\2\2\2\u02bc\u02bd\5H%\2\u02bd;\3\2"+
		"\2\2\u02be\u02bf\7~\2\2\u02bf\u02c0\7\u0080\2\2\u02c0=\3\2\2\2\u02c1\u02c2"+
		"\7\u0080\2\2\u02c2?\3\2\2\2\u02c3\u02cf\7I\2\2\u02c4\u02d0\5B\"\2\u02c5"+
		"\u02c6\7\b\2\2\u02c6\u02c7\5D#\2\u02c7\u02c8\7\t\2\2\u02c8\u02d0\3\2\2"+
		"\2\u02c9\u02ca\7|\2\2\u02ca\u02cb\7\b\2\2\u02cb\u02cc\5D#\2\u02cc\u02cd"+
		"\7\t\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02d0\5\u013a\u009e\2\u02cf\u02c4\3"+
		"\2\2\2\u02cf\u02c5\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0"+
		"\u02d7\3\2\2\2\u02d1\u02d3\7\3\2\2\u02d2\u02d4\5\u013a\u009e\2\u02d3\u02d2"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d8\3\2\2\2\u02d7\u02d1\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8A\3\2\2\2"+
		"\u02d9\u02dc\5x=\2\u02da\u02dc\5z>\2\u02db\u02d9\3\2\2\2\u02db\u02da\3"+
		"\2\2\2\u02dcC\3\2\2\2\u02dd\u02de\b#\1\2\u02de\u0304\5z>\2\u02df\u02e0"+
		"\5\u008cG\2\u02e0\u02e1\7\7\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02df\3\2\2"+
		"\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\5\u0090I\2\u02e5"+
		"\u02e6\7\7\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0304\5\u0096L\2\u02ea\u02eb\5|?\2\u02eb"+
		"\u02ec\5D#\6\u02ec\u0304\3\2\2\2\u02ed\u02ee\5\u008aF\2\u02ee\u02fb\7"+
		"\b\2\2\u02ef\u02f1\7P\2\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f7\5D#\2\u02f3\u02f4\7\16\2\2\u02f4\u02f6\5D#"+
		"\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02fc\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc\7\21\2\2"+
		"\u02fb\u02f0\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u02fe\7\t\2\2\u02fe\u0304\3\2\2\2\u02ff\u0300\7\b\2\2\u0300"+
		"\u0301\5D#\2\u0301\u0302\7\t\2\2\u0302\u0304\3\2\2\2\u0303\u02dd\3\2\2"+
		"\2\u0303\u02e7\3\2\2\2\u0303\u02ea\3\2\2\2\u0303\u02ed\3\2\2\2\u0303\u02ff"+
		"\3\2\2\2\u0304\u030b\3\2\2\2\u0305\u0306\f\5\2\2\u0306\u0307\5F$\2\u0307"+
		"\u0308\5D#\6\u0308\u030a\3\2\2\2\u0309\u0305\3\2\2\2\u030a\u030d\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030cE\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030e\u0324\7\26\2\2\u030f\u0324\t\5\2\2\u0310\u0324\t\6\2\2"+
		"\u0311\u0324\t\7\2\2\u0312\u0324\t\b\2\2\u0313\u0320\7\20\2\2\u0314\u0320"+
		"\7#\2\2\u0315\u0320\7$\2\2\u0316\u0320\7%\2\2\u0317\u0320\7s\2\2\u0318"+
		"\u0319\7s\2\2\u0319\u0320\7~\2\2\u031a\u0320\7j\2\2\u031b\u0320\7x\2\2"+
		"\u031c\u0320\7d\2\2\u031d\u0320\7z\2\2\u031e\u0320\7\u0090\2\2\u031f\u0313"+
		"\3\2\2\2\u031f\u0314\3\2\2\2\u031f\u0315\3\2\2\2\u031f\u0316\3\2\2\2\u031f"+
		"\u0317\3\2\2\2\u031f\u0318\3\2\2\2\u031f\u031a\3\2\2\2\u031f\u031b\3\2"+
		"\2\2\u031f\u031c\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320"+
		"\u0324\3\2\2\2\u0321\u0324\7\60\2\2\u0322\u0324\7\u0085\2\2\u0323\u030e"+
		"\3\2\2\2\u0323\u030f\3\2\2\2\u0323\u0310\3\2\2\2\u0323\u0311\3\2\2\2\u0323"+
		"\u0312\3\2\2\2\u0323\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0322\3\2"+
		"\2\2\u0324G\3\2\2\2\u0325\u0329\7\u008f\2\2\u0326\u0327\5\u008cG\2\u0327"+
		"\u0328\7\7\2\2\u0328\u032a\3\2\2\2\u0329\u0326\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u0337\5\u009aN\2\u032c\u032d\7\b\2\2\u032d"+
		"\u0332\5J&\2\u032e\u032f\7\16\2\2\u032f\u0331\5J&\2\u0330\u032e\3\2\2"+
		"\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\7\t\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u032c\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u034b\3\2\2\2\u0339\u033a\7\u0083"+
		"\2\2\u033a\u0343\t\t\2\2\u033b\u033c\7\u009c\2\2\u033c\u0344\7\u0080\2"+
		"\2\u033d\u033e\7\u009c\2\2\u033e\u0344\7I\2\2\u033f\u0344\7:\2\2\u0340"+
		"\u0344\7\u0096\2\2\u0341\u0342\7}\2\2\u0342\u0344\7*\2\2\u0343\u033b\3"+
		"\2\2\2\u0343\u033d\3\2\2\2\u0343\u033f\3\2\2\2\u0343\u0340\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u0348\3\2\2\2\u0345\u0346\7z\2\2\u0346\u0348\5\u0088"+
		"E\2\u0347\u0339\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u034a\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u035b\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0350\7~\2\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0356\7J"+
		"\2\2\u0352\u0353\7m\2\2\u0353\u0357\7K\2\2\u0354\u0355\7m\2\2\u0355\u0357"+
		"\7i\2\2\u0356\u0352\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0359\3\2\2\2\u0358\u035a\7V\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u035c\3\2\2\2\u035b\u034f\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"I\3\2\2\2\u035d\u035e\5\u0088E\2\u035eK\3\2\2\2\u035f\u0362\5\u0096L\2"+
		"\u0360\u0361\7>\2\2\u0361\u0363\5\u0098M\2\u0362\u0360\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\t\4\2\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366M\3\2\2\2\u0367\u0368\7B\2\2\u0368\u036a\5\u0088E"+
		"\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0370\3\2\2\2\u036b\u0371"+
		"\5R*\2\u036c\u0371\5X-\2\u036d\u0371\5V,\2\u036e\u0371\5P)\2\u036f\u0371"+
		"\5T+\2\u0370\u036b\3\2\2\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371O\3\2\2\2\u0372\u0373\7=\2\2\u0373"+
		"\u0374\7\b\2\2\u0374\u0375\5D#\2\u0375\u0376\7\t\2\2\u0376Q\3\2\2\2\u0377"+
		"\u0378\7\u008a\2\2\u0378\u0379\7v\2\2\u0379\u037a\7\b\2\2\u037a\u037f"+
		"\5L\'\2\u037b\u037c\7\16\2\2\u037c\u037e\5L\'\2\u037d\u037b\3\2\2\2\u037e"+
		"\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2"+
		"\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7\t\2\2\u0383S\3\2\2\2\u0384\u0385"+
		"\7a\2\2\u0385\u0386\7v\2\2\u0386\u0387\7\b\2\2\u0387\u038c\5Z.\2\u0388"+
		"\u0389\7\16\2\2\u0389\u038b\5Z.\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2"+
		"\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038f\u0390\7\t\2\2\u0390\u0391\5H%\2\u0391U\3\2\2\2\u0392"+
		"\u0394\7\u00a7\2\2\u0393\u0395\7v\2\2\u0394\u0393\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0398\5\u0088E\2\u0397\u0396\3\2\2"+
		"\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\b\2\2\u039a\u039f"+
		"\5L\'\2\u039b\u039c\7\16\2\2\u039c\u039e\5L\'\2\u039d\u039b\3\2\2\2\u039e"+
		"\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2"+
		"\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7\t\2\2\u03a3W\3\2\2\2\u03a4\u03a6"+
		"\7v\2\2\u03a5\u03a7\5\u0088E\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2"+
		"\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7\b\2\2\u03a9\u03ae\5L\'\2\u03aa\u03ab"+
		"\7\16\2\2\u03ab\u03ad\5L\'\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2"+
		"\2\2\u03b1\u03b2\7\t\2\2\u03b2Y\3\2\2\2\u03b3\u03b4\5\u0096L\2\u03b4["+
		"\3\2\2\2\u03b5\u03b6\5\u008cG\2\u03b6\u03b7\7\7\2\2\u03b7\u03b9\3\2\2"+
		"\2\u03b8\u03b5\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c0"+
		"\5\u0090I\2\u03bb\u03bc\7l\2\2\u03bc\u03bd\78\2\2\u03bd\u03c1\5\u009c"+
		"O\2\u03be\u03bf\7~\2\2\u03bf\u03c1\7l\2\2\u03c0\u03bb\3\2\2\2\u03c0\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1]\3\2\2\2\u03c2\u03c4\5D#\2\u03c3\u03c5"+
		"\t\4\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5_\3\2\2\2\u03c6"+
		"\u03ca\5x=\2\u03c7\u03ca\5\u0088E\2\u03c8\u03ca\7\u00bb\2\2\u03c9\u03c6"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03c8\3\2\2\2\u03caa\3\2\2\2\u03cb"+
		"\u03d7\5\u0090I\2\u03cc\u03cd\7\b\2\2\u03cd\u03d2\5\u0096L\2\u03ce\u03cf"+
		"\7\16\2\2\u03cf\u03d1\5\u0096L\2\u03d0\u03ce\3\2\2\2\u03d1\u03d4\3\2\2"+
		"\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03d2"+
		"\3\2\2\2\u03d5\u03d6\7\t\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03cc\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7\61\2\2\u03da\u03db\7"+
		"\b\2\2\u03db\u03dc\5\36\20\2\u03dc\u03dd\7\t\2\2\u03ddc\3\2\2\2\u03de"+
		"\u03eb\7\21\2\2\u03df\u03e0\5\u0090I\2\u03e0\u03e1\7\7\2\2\u03e1\u03e2"+
		"\7\21\2\2\u03e2\u03eb\3\2\2\2\u03e3\u03e8\5D#\2\u03e4\u03e6\7\61\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\5\u0082"+
		"B\2\u03e8\u03e5\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea"+
		"\u03de\3\2\2\2\u03ea\u03df\3\2\2\2\u03ea\u03e3\3\2\2\2\u03ebe\3\2\2\2"+
		"\u03ec\u03ed\5\u008cG\2\u03ed\u03ee\7\7\2\2\u03ee\u03f0\3\2\2\2\u03ef"+
		"\u03ec\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f6\5\u0090"+
		"I\2\u03f2\u03f4\7\61\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f5\3\2\2\2\u03f5\u03f7\5\u00a8U\2\u03f6\u03f3\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03fd\3\2\2\2\u03f8\u03f9\7l\2\2\u03f9\u03fa\78\2\2\u03fa"+
		"\u03fe\5\u009cO\2\u03fb\u03fc\7~\2\2\u03fc\u03fe\7l\2\2\u03fd\u03f8\3"+
		"\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u041c\3\2\2\2\u03ff"+
		"\u0409\7\b\2\2\u0400\u0405\5f\64\2\u0401\u0402\7\16\2\2\u0402\u0404\5"+
		"f\64\2\u0403\u0401\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u040a\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u040a\5h"+
		"\65\2\u0409\u0400\3\2\2\2\u0409\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u0410\7\t\2\2\u040c\u040e\7\61\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3"+
		"\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\5\u00a8U\2\u0410\u040d\3\2\2\2"+
		"\u0410\u0411\3\2\2\2\u0411\u041c\3\2\2\2\u0412\u0413\7\b\2\2\u0413\u0414"+
		"\5\36\20\2\u0414\u0419\7\t\2\2\u0415\u0417\7\61\2\2\u0416\u0415\3\2\2"+
		"\2\u0416\u0417\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\5\u00a8U\2\u0419"+
		"\u0416\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u03ef\3\2"+
		"\2\2\u041b\u03ff\3\2\2\2\u041b\u0412\3\2\2\2\u041cg\3\2\2\2\u041d\u0424"+
		"\5f\64\2\u041e\u041f\5j\66\2\u041f\u0420\5f\64\2\u0420\u0421\5l\67\2\u0421"+
		"\u0423\3\2\2\2\u0422\u041e\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2"+
		"\2\2\u0424\u0425\3\2\2\2\u0425i\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0431"+
		"\7\6\2\2\u0428\u042a\7w\2\2\u0429\u042b\7\u0087\2\2\u042a\u0429\3\2\2"+
		"\2\u042a\u042b\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042e\7n\2\2\u042d\u0428"+
		"\3\2\2\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\7u\2\2\u0430\u0427\3\2\2\2\u0430\u042d\3\2\2\2\u0431k\3\2\2\2\u0432"+
		"\u0433\7\u0083\2\2\u0433\u0435\5D#\2\u0434\u0432\3\2\2\2\u0434\u0435\3"+
		"\2\2\2\u0435m\3\2\2\2\u0436\u0438\7\u009b\2\2\u0437\u0439\t\3\2\2\u0438"+
		"\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043f\5d"+
		"\63\2\u043b\u043c\7\16\2\2\u043c\u043e\5d\63\2\u043d\u043b\3\2\2\2\u043e"+
		"\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u044e\3\2"+
		"\2\2\u0441\u043f\3\2\2\2\u0442\u044c\7b\2\2\u0443\u0448\5f\64\2\u0444"+
		"\u0445\7\16\2\2\u0445\u0447\5f\64\2\u0446\u0444\3\2\2\2\u0447\u044a\3"+
		"\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044d\3\2\2\2\u044a"+
		"\u0448\3\2\2\2\u044b\u044d\5h\65\2\u044c\u0443\3\2\2\2\u044c\u044b\3\2"+
		"\2\2\u044d\u044f\3\2\2\2\u044e\u0442\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0451\3\2\2\2\u0450\u0452\5$\23\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2"+
		"\2\2\u0452\u0460\3\2\2\2\u0453\u0454\7e\2\2\u0454\u0455\78\2\2\u0455\u045a"+
		"\5D#\2\u0456\u0457\7\16\2\2\u0457\u0459\5D#\2\u0458\u0456\3\2\2\2\u0459"+
		"\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045e\3\2"+
		"\2\2\u045c\u045a\3\2\2\2\u045d\u045f\5t;\2\u045e\u045d\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u0453\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0467\3\2\2\2\u0462\u0463\7\u00ab\2\2\u0463\u0464\5p9\2\u0464\u0465\5"+
		"r:\2\u0465\u0467\3\2\2\2\u0466\u0436\3\2\2\2\u0466\u0462\3\2\2\2\u0467"+
		"o\3\2\2\2\u0468\u0469\7\b\2\2\u0469\u046e\5D#\2\u046a\u046b\7\16\2\2\u046b"+
		"\u046d\5D#\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2"+
		"\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0472"+
		"\7\t\2\2\u0472q\3\2\2\2\u0473\u0474\7\16\2\2\u0474\u0476\5p9\2\u0475\u0473"+
		"\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"s\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b\7f\2\2\u047b\u047c\5D#\2\u047c"+
		"u\3\2\2\2\u047d\u0489\5\u0090I\2\u047e\u047f\7\b\2\2\u047f\u0484\5\u0096"+
		"L\2\u0480\u0481\7\16\2\2\u0481\u0483\5\u0096L\2\u0482\u0480\3\2\2\2\u0483"+
		"\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2"+
		"\2\2\u0486\u0484\3\2\2\2\u0487\u0488\7\t\2\2\u0488\u048a\3\2\2\2\u0489"+
		"\u047e\3\2\2\2\u0489\u048a\3\2\2\2\u048aw\3\2\2\2\u048b\u048d\t\6\2\2"+
		"\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0491"+
		"\7\u00be\2\2\u048f\u0491\7\21\2\2\u0490\u048c\3\2\2\2\u0490\u048f\3\2"+
		"\2\2\u0491y\3\2\2\2\u0492\u0493\t\n\2\2\u0493{\3\2\2\2\u0494\u0495\t\13"+
		"\2\2\u0495}\3\2\2\2\u0496\u0497\7\u00bb\2\2\u0497\177\3\2\2\2\u0498\u049b"+
		"\5D#\2\u0499\u049b\5*\26\2\u049a\u0498\3\2\2\2\u049a\u0499\3\2\2\2\u049b"+
		"\u0081\3\2\2\2\u049c\u04a0\7\u00bc\2\2\u049d\u04a0\7\u00bb\2\2\u049e\u04a0"+
		"\5\u013a\u009e\2\u049f\u049c\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u049e\3"+
		"\2\2\2\u04a0\u0083\3\2\2\2\u04a1\u04a2\t\f\2\2\u04a2\u0085\3\2\2\2\u04a3"+
		"\u04a5\13\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3"+
		"\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u0087\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9"+
		"\u04aa\5\u013a\u009e\2\u04aa\u0089\3\2\2\2\u04ab\u04ac\5\u013a\u009e\2"+
		"\u04ac\u008b\3\2\2\2\u04ad\u04ae\5\u013a\u009e\2\u04ae\u008d\3\2\2\2\u04af"+
		"\u04b0\5\u013a\u009e\2\u04b0\u008f\3\2\2\2\u04b1\u04b2\5\u013a\u009e\2"+
		"\u04b2\u0091\3\2\2\2\u04b3\u04b4\5\u013a\u009e\2\u04b4\u0093\3\2\2\2\u04b5"+
		"\u04b6\5\u013a\u009e\2\u04b6\u0095\3\2\2\2\u04b7\u04b8\5\u013a\u009e\2"+
		"\u04b8\u0097\3\2\2\2\u04b9\u04ba\5\u013a\u009e\2\u04ba\u0099\3\2\2\2\u04bb"+
		"\u04bc\5\u013a\u009e\2\u04bc\u009b\3\2\2\2\u04bd\u04be\5\u013a\u009e\2"+
		"\u04be\u009d\3\2\2\2\u04bf\u04c0\5\u013a\u009e\2\u04c0\u009f\3\2\2\2\u04c1"+
		"\u04c2\5\u013a\u009e\2\u04c2\u00a1\3\2\2\2\u04c3\u04c4\5\u013a\u009e\2"+
		"\u04c4\u00a3\3\2\2\2\u04c5\u04c6\5\u013a\u009e\2\u04c6\u00a5\3\2\2\2\u04c7"+
		"\u04c8\5\u013a\u009e\2\u04c8\u00a7\3\2\2\2\u04c9\u04cc\5\u013a\u009e\2"+
		"\u04ca\u04cc\7\u00bc\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04cc"+
		"\u00a9\3\2\2\2\u04cd\u04ce\5\u013a\u009e\2\u04ce\u00ab\3\2\2\2\u04cf\u04d0"+
		"\t\r\2\2\u04d0\u00ad\3\2\2\2\u04d1\u04d2\7C\2\2\u04d2\u04d3\7\u00b6\2"+
		"\2\u04d3\u04d4\7^\2\2\u04d4\u04d5\5\u013a\u009e\2\u04d5\u04d6\7\b\2\2"+
		"\u04d6\u04d7\5\u00b0Y\2\u04d7\u04d8\7\16\2\2\u04d8\u04d9\5\u013a\u009e"+
		"\2\u04d9\u04da\7\16\2\2\u04da\u04db\5\u013a\u009e\2\u04db\u04dc\7\16\2"+
		"\2\u04dc\u04dd\5\u013a\u009e\2\u04dd\u04de\7\16\2\2\u04de\u04e0\7\n\2"+
		"\2\u04df\u04e1\5\u00b2Z\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e6\3\2\2\2\u04e2\u04e3\7\16\2\2\u04e3\u04e5\5\u00b2Z\2\u04e4\u04e2"+
		"\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7\13\2\2\u04ea\u04eb\7"+
		"\t\2\2\u04eb\u00af\3\2\2\2\u04ec\u04ed\5\u013a\u009e\2\u04ed\u04ee\7\17"+
		"\2\2\u04ee\u04ef\7\27\2\2\u04ef\u04f0\5\u013a\u009e\2\u04f0\u04f5\3\2"+
		"\2\2\u04f1\u04f2\7\27\2\2\u04f2\u04f4\5\u013a\u009e\2\u04f3\u04f1\3\2"+
		"\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04fa\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04fa\5\u013a\u009e\2\u04f9\u04ec"+
		"\3\2\2\2\u04f9\u04f8\3\2\2\2\u04fa\u00b1\3\2\2\2\u04fb\u0501\7\u00b7\2"+
		"\2\u04fc\u0501\7\u00b9\2\2\u04fd\u0501\7\u00b8\2\2\u04fe\u0501\5\u0090"+
		"I\2\u04ff\u0501\5\u0096L\2\u0500\u04fb\3\2\2\2\u0500\u04fc\3\2\2\2\u0500"+
		"\u04fd\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2\2\2\u0501\u00b3\3\2"+
		"\2\2\u0502\u0504\7^\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0505\3\2\2\2\u0505\u0506\5\u00b6\\\2\u0506\u0507\5\u00b8]\2\u0507\u00b5"+
		"\3\2\2\2\u0508\u0509\5\u013a\u009e\2\u0509\u0519\7\b\2\2\u050a\u050f\5"+
		"\u00c6d\2\u050b\u050c\7\16\2\2\u050c\u050e\5\u00c6d\2\u050d\u050b\3\2"+
		"\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510"+
		"\u0516\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0513\7\16\2\2\u0513\u0515\5"+
		"\u00eex\2\u0514\u0512\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2\2"+
		"\u0516\u0517\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u050a"+
		"\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\7\t\2\2\u051c"+
		"\u00b7\3\2\2\2\u051d\u0522\7\f\2\2\u051e\u0521\5\u00ba^\2\u051f\u0521"+
		"\5\u00bc_\2\u0520\u051e\3\2\2\2\u0520\u051f\3\2\2\2\u0521\u0524\3\2\2"+
		"\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0528\3\2\2\2\u0524\u0522"+
		"\3\2\2\2\u0525\u0526\5\u00caf\2\u0526\u0527\7\6\2\2\u0527\u0529\3\2\2"+
		"\2\u0528\u0525\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b"+
		"\7\r\2\2\u052b\u00b9\3\2\2\2\u052c\u0531\7\f\2\2\u052d\u0530\5\u00ba^"+
		"\2\u052e\u0530\5\u00bc_\2\u052f\u052d\3\2\2\2\u052f\u052e\3\2\2\2\u0530"+
		"\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2"+
		"\2\2\u0533\u0531\3\2\2\2\u0534\u0535\7\r\2\2\u0535\u00bb\3\2\2\2\u0536"+
		"\u0539\5\u00be`\2\u0537\u0539\5\u00c0a\2\u0538\u0536\3\2\2\2\u0538\u0537"+
		"\3\2\2\2\u0539\u00bd\3\2\2\2\u053a\u0557\5\u00dep\2\u053b\u0557\5\u00d4"+
		"k\2\u053c\u0557\5\u00e6t\2\u053d\u0541\5\u00dco\2\u053e\u0541\5\u00e4"+
		"s\2\u053f\u0541\5\u00e0q\2\u0540\u053d\3\2\2\2\u0540\u053e\3\2\2\2\u0540"+
		"\u053f\3\2\2\2\u0541\u0554\3\2\2\2\u0542\u0544\5\u00ccg\2\u0543\u0542"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0555\7\6\2\2\u0546"+
		"\u054a\7\f\2\2\u0547\u0549\5\u00bc_\2\u0548\u0547\3\2\2\2\u0549\u054c"+
		"\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0550\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u054e\5\u00ccg\2\u054e\u054f\7\6\2\2\u054f\u0551"+
		"\3\2\2\2\u0550\u054d\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0555\7\r\2\2\u0553\u0555\5\u00bc_\2\u0554\u0543\3\2\2\2\u0554\u0546"+
		"\3\2\2\2\u0554\u0553\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u053a\3\2\2\2\u0556"+
		"\u053b\3\2\2\2\u0556\u053c\3\2\2\2\u0556\u0540\3\2\2\2\u0557\u00bf\3\2"+
		"\2\2\u0558\u055f\5\u00c2b\2\u0559\u055f\5\u00d0i\2\u055a\u055f\5\u0132"+
		"\u009a\2\u055b\u055f\5\u00ecw\2\u055c\u055f\5\u00f2z\2\u055d\u055f\5\u00ae"+
		"X\2\u055e\u0558\3\2\2\2\u055e\u0559\3\2\2\2\u055e\u055a\3\2\2\2\u055e"+
		"\u055b\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055d\3\2\2\2\u055f\u0560\3\2"+
		"\2\2\u0560\u0561\7\6\2\2\u0561\u00c1\3\2\2\2\u0562\u0563\5\u013a\u009e"+
		"\2\u0563\u056e\7\b\2\2\u0564\u0569\5\u00c8e\2\u0565\u0566\7\16\2\2\u0566"+
		"\u0568\5\u00c8e\2\u0567\u0565\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056c"+
		"\u0564\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2"+
		"\2\2\u056f\u0571\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0572\7\t\2\2\u0572"+
		"\u00c3\3\2\2\2\u0573\u0574\5\u00b6\\\2\u0574\u0575\5\u00b8]\2\u0575\u00c5"+
		"\3\2\2\2\u0576\u0579\5\u00f0y\2\u0577\u0579\5\u00c4c\2\u0578\u0576\3\2"+
		"\2\2\u0578\u0577\3\2\2\2\u0579\u00c7\3\2\2\2\u057a\u0584\5\u0136\u009c"+
		"\2\u057b\u0584\7\u00be\2\2\u057c\u0584\7\u00ba\2\2\u057d\u0584\5\u00c2"+
		"b\2\u057e\u0584\7\u00bc\2\2\u057f\u0584\5\u013a\u009e\2\u0580\u0584\5"+
		"\u0130\u0099\2\u0581\u0584\5\u0108\u0085\2\u0582\u0584\5\u00f2z\2\u0583"+
		"\u057a\3\2\2\2\u0583\u057b\3\2\2\2\u0583\u057c\3\2\2\2\u0583\u057d\3\2"+
		"\2\2\u0583\u057e\3\2\2\2\u0583\u057f\3\2\2\2\u0583\u0580\3\2\2\2\u0583"+
		"\u0581\3\2\2\2\u0583\u0582\3\2\2\2\u0584\u00c9\3\2\2\2\u0585\u0586\7\u0093"+
		"\2\2\u0586\u0588\5\u00ceh\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u00cb\3\2\2\2\u0589\u058c\5\u00caf\2\u058a\u058c\t\16\2\2\u058b\u0589"+
		"\3\2\2\2\u058b\u058a\3\2\2\2\u058c\u00cd\3\2\2\2\u058d\u059c\3\2\2\2\u058e"+
		"\u059c\5\u0136\u009c\2\u058f\u059c\7\u00ba\2\2\u0590\u059c\7\u00bc\2\2"+
		"\u0591\u059c\5\u00c2b\2\u0592\u059c\7\u00a4\2\2\u0593\u059c\7]\2\2\u0594"+
		"\u059c\7\u0080\2\2\u0595\u059c\5\u00f4{\2\u0596\u059c\5\u0108\u0085\2"+
		"\u0597\u059c\5\u0130\u0099\2\u0598\u059c\5\u00f6|\2\u0599\u059c\5\u00fe"+
		"\u0080\2\u059a\u059c\5\u0122\u0092\2\u059b\u058d\3\2\2\2\u059b\u058e\3"+
		"\2\2\2\u059b\u058f\3\2\2\2\u059b\u0590\3\2\2\2\u059b\u0591\3\2\2\2\u059b"+
		"\u0592\3\2\2\2\u059b\u0593\3\2\2\2\u059b\u0594\3\2\2\2\u059b\u0595\3\2"+
		"\2\2\u059b\u0596\3\2\2\2\u059b\u0597\3\2\2\2\u059b\u0598\3\2\2\2\u059b"+
		"\u0599\3\2\2\2\u059b\u059a\3\2\2\2\u059c\u00cf\3\2\2\2\u059d\u059e\7\u008b"+
		"\2\2\u059e\u059f\7\b\2\2\u059f\u05a4\5\u00d2j\2\u05a0\u05a1\7\23\2\2\u05a1"+
		"\u05a3\5\u00d2j\2\u05a2\u05a0\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2"+
		"\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7"+
		"\u05a8\7\t\2\2\u05a8\u00d1\3\2\2\2\u05a9\u05af\7\u00bc\2\2\u05aa\u05af"+
		"\5\u013a\u009e\2\u05ab\u05af\5\u00c2b\2\u05ac\u05af\5\u0130\u0099\2\u05ad"+
		"\u05af\5\u0108\u0085\2\u05ae\u05a9\3\2\2\2\u05ae\u05aa\3\2\2\2\u05ae\u05ab"+
		"\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2\2\2\u05af\u00d3\3\2\2\2\u05b0"+
		"\u05b4\5\u00d6l\2\u05b1\u05b3\5\u00d8m\2\u05b2\u05b1\3\2\2\2\u05b3\u05b6"+
		"\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6"+
		"\u05b4\3\2\2\2\u05b7\u05b9\5\u00dan\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9"+
		"\3\2\2\2\u05b9\u00d5\3\2\2\2\u05ba\u05bb\7g\2\2\u05bb\u05be\7\b\2\2\u05bc"+
		"\u05bf\5\u0136\u009c\2\u05bd\u05bf\5\u00f2z\2\u05be\u05bc\3\2\2\2\u05be"+
		"\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05d3\7\t\2\2\u05c1\u05c5\7\f"+
		"\2\2\u05c2\u05c4\5\u00bc_\2\u05c3\u05c2\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5"+
		"\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05cb\3\2\2\2\u05c7\u05c5\3\2"+
		"\2\2\u05c8\u05c9\5\u00caf\2\u05c9\u05ca\7\6\2\2\u05ca\u05cc\3\2\2\2\u05cb"+
		"\u05c8\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d4\7\r"+
		"\2\2\u05ce\u05d1\5\u00caf\2\u05cf\u05d1\5\u00bc_\2\u05d0\u05ce\3\2\2\2"+
		"\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4"+
		"\7\6\2\2\u05d3\u05c1\3\2\2\2\u05d3\u05d0\3\2\2\2\u05d4\u00d7\3\2\2\2\u05d5"+
		"\u05d6\7T\2\2\u05d6\u05d9\7\b\2\2\u05d7\u05da\5\u0136\u009c\2\u05d8\u05da"+
		"\5\u00f2z\2\u05d9\u05d7\3\2\2\2\u05d9\u05d8\3\2\2\2\u05da\u05db\3\2\2"+
		"\2\u05db\u05ee\7\t\2\2\u05dc\u05e0\7\f\2\2\u05dd\u05df\5\u00bc_\2\u05de"+
		"\u05dd\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2"+
		"\2\2\u05e1\u05e6\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05e4\5\u00caf\2\u05e4"+
		"\u05e5\7\6\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e7\3\2"+
		"\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ef\7\r\2\2\u05e9\u05ec\5\u00caf\2\u05ea"+
		"\u05ec\5\u00bc_\2\u05eb\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec"+
		"\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\7\6\2\2\u05ee\u05dc\3\2\2\2\u05ee"+
		"\u05eb\3\2\2\2\u05ef\u00d9\3\2\2\2\u05f0\u0603\7S\2\2\u05f1\u05f5\7\f"+
		"\2\2\u05f2\u05f4\5\u00bc_\2\u05f3\u05f2\3\2\2\2\u05f4\u05f7\3\2\2\2\u05f5"+
		"\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05fb\3\2\2\2\u05f7\u05f5\3\2"+
		"\2\2\u05f8\u05f9\5\u00caf\2\u05f9\u05fa\7\6\2\2\u05fa\u05fc\3\2\2\2\u05fb"+
		"\u05f8\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0604\7\r"+
		"\2\2\u05fe\u0601\5\u00caf\2\u05ff\u0601\5\u00bc_\2\u0600\u05fe\3\2\2\2"+
		"\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604"+
		"\7\6\2\2\u0603\u05f1\3\2\2\2\u0603\u0600\3\2\2\2\u0604\u00db\3\2\2\2\u0605"+
		"\u0606\7\u00b3\2\2\u0606\u0609\7\b\2\2\u0607\u060a\5\u0136\u009c\2\u0608"+
		"\u060a\5\u00f2z\2\u0609\u0607\3\2\2\2\u0609\u0608\3\2\2\2\u060a\u060b"+
		"\3\2\2\2\u060b\u060c\7\t\2\2\u060c\u00dd\3\2\2\2\u060d\u0620\7N\2\2\u060e"+
		"\u0610\5\u00ccg\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0621\7\6\2\2\u0612\u0616\7\f\2\2\u0613\u0615\5\u00bc_"+
		"\2\u0614\u0613\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u061c\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061a\5\u00ccg"+
		"\2\u061a\u061b\7\6\2\2\u061b\u061d\3\2\2\2\u061c\u0619\3\2\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621\7\r\2\2\u061f\u0621\7\6\2\2\u0620"+
		"\u060f\3\2\2\2\u0620\u0612\3\2\2\2\u0620\u061f\3\2\2\2\u0621\u0622\3\2"+
		"\2\2\u0622\u0623\5\u00dco\2\u0623\u0624\7\6\2\2\u0624\u00df\3\2\2\2\u0625"+
		"\u0626\7_\2\2\u0626\u062c\7\b\2\2\u0627\u062b\5\u00fa~\2\u0628\u062b\5"+
		"\u00f8}\2\u0629\u062b\5\u00e2r\2\u062a\u0627\3\2\2\2\u062a\u0628\3\2\2"+
		"\2\u062a\u0629\3\2\2\2\u062b\u062d\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0630\7\6\2\2\u062f\u0631\5\u0136\u009c"+
		"\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634"+
		"\7\6\2\2\u0633\u0635\5\u00e2r\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2"+
		"\2\u0635\u0636\3\2\2\2\u0636\u0637\7\t\2\2\u0637\u00e1\3\2\2\2\u0638\u063d"+
		"\5\u00f6|\2\u0639\u063d\5\u00fe\u0080\2\u063a\u063d\5\u0102\u0082\2\u063b"+
		"\u063d\5\u0132\u009a\2\u063c\u0638\3\2\2\2\u063c\u0639\3\2\2\2\u063c\u063a"+
		"\3\2\2\2\u063c\u063b\3\2\2\2\u063d\u00e3\3\2\2\2\u063e\u063f\7`\2\2\u063f"+
		"\u0640\7\b\2\2\u0640\u0641\7\u00ac\2\2\u0641\u0645\5\u013a\u009e\2\u0642"+
		"\u0644\7\4\2\2\u0643\u0642\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643\3\2"+
		"\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0645\3\2\2\2\u0648"+
		"\u0649\7\17\2\2\u0649\u064d\5\u013a\u009e\2\u064a\u064c\7\4\2\2\u064b"+
		"\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0651\7\t\2\2\u0651"+
		"\u00e5\3\2\2\2\u0652\u0653\7\u009d\2\2\u0653\u065b\7\b\2\2\u0654\u065c"+
		"\5\u0136\u009c\2\u0655\u065c\5\u013a\u009e\2\u0656\u065c\7\u00ba\2\2\u0657"+
		"\u065c\7\u00be\2\2\u0658\u065c\5\u00f2z\2\u0659\u065c\5\u00c2b\2\u065a"+
		"\u065c\5\u0130\u0099\2\u065b\u0654\3\2\2\2\u065b\u0655\3\2\2\2\u065b\u0656"+
		"\3\2\2\2\u065b\u0657\3\2\2\2\u065b\u0658\3\2\2\2\u065b\u0659\3\2\2\2\u065b"+
		"\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\7\t\2\2\u065e\u0668\7\f"+
		"\2\2\u065f\u0661\5\u00eav\2\u0660\u065f\3\2\2\2\u0661\u0664\3\2\2\2\u0662"+
		"\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2"+
		"\2\2\u0665\u0667\5\u00e8u\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0669\3\2\2\2\u0668\u0662\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2"+
		"\2\2\u066a\u066b\7\r\2\2\u066b\u00e7\3\2\2\2\u066c\u066d\7I\2\2\u066d"+
		"\u0671\7\17\2\2\u066e\u0670\5\u00bc_\2\u066f\u066e\3\2\2\2\u0670\u0673"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0679\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0674\u0677\79\2\2\u0675\u0677\5\u00caf\2\u0676\u0674\3"+
		"\2\2\2\u0676\u0675\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067a\7\6\2\2\u0679"+
		"\u0676\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u00e9\3\2\2\2\u067b\u0681\7;"+
		"\2\2\u067c\u0682\5\u0136\u009c\2\u067d\u0682\5\u00acW\2\u067e\u0682\7"+
		"\u00ba\2\2\u067f\u0682\7\u00be\2\2\u0680\u0682\5\u0130\u0099\2\u0681\u067c"+
		"\3\2\2\2\u0681\u067d\3\2\2\2\u0681\u067e\3\2\2\2\u0681\u067f\3\2\2\2\u0681"+
		"\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0687\7\17\2\2\u0684\u0686\5"+
		"\u00bc_\2\u0685\u0684\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2\2\2"+
		"\u0687\u0688\3\2\2\2\u0688\u068f\3\2\2\2\u0689\u0687\3\2\2\2\u068a\u068d"+
		"\79\2\2\u068b\u068d\5\u00caf\2\u068c\u068a\3\2\2\2\u068c\u068b\3\2\2\2"+
		"\u068d\u068e\3\2\2\2\u068e\u0690\7\6\2\2\u068f\u068c\3\2\2\2\u068f\u0690"+
		"\3\2\2\2\u0690\u00eb\3\2\2\2\u0691\u0694\5\u00f0y\2\u0692\u0694\5\u00ee"+
		"x\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u00ed\3\2\2\2\u0695"+
		"\u0699\5\u00fa~\2\u0696\u0699\5\u0128\u0095\2\u0697\u0699\5\u0104\u0083"+
		"\2\u0698\u0695\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0697\3\2\2\2\u0699\u00ef"+
		"\3\2\2\2\u069a\u069e\5\u00f8}\2\u069b\u069e\5\u0102\u0082\2\u069c\u069e"+
		"\5\u0126\u0094\2\u069d\u069a\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069c\3"+
		"\2\2\2\u069e\u00f1\3\2\2\2\u069f\u06a3\5\u00f6|\2\u06a0\u06a3\5\u00fe"+
		"\u0080\2\u06a1\u06a3\5\u0122\u0092\2\u06a2\u069f\3\2\2\2\u06a2\u06a0\3"+
		"\2\2\2\u06a2\u06a1\3\2\2\2\u06a3\u00f3\3\2\2\2\u06a4\u06a5\5\u013a\u009e"+
		"\2\u06a5\u00f5\3\2\2\2\u06a6\u06a8\5\u013a\u009e\2\u06a7\u06a9\5\u0134"+
		"\u009b\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06ab\7\20\2\2\u06ab\u06ad\3\2\2\2\u06ac\u06a6\3\2\2\2\u06ad\u06ae\3"+
		"\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b4\3\2\2\2\u06b0"+
		"\u06b5\5\u0136\u009c\2\u06b1\u06b5\5\32\16\2\u06b2\u06b5\5\36\20\2\u06b3"+
		"\u06b5\7\u0080\2\2\u06b4\u06b0\3\2\2\2\u06b4\u06b1\3\2\2\2\u06b4\u06b2"+
		"\3\2\2\2\u06b4\u06b3\3\2\2\2\u06b5\u00f7\3\2\2\2\u06b6\u06b7\7\u00ac\2"+
		"\2\u06b7\u06b8\5\u00f4{\2\u06b8\u00f9\3\2\2\2\u06b9\u06ba\7\u00ac\2\2"+
		"\u06ba\u06bb\5\u00f6|\2\u06bb\u00fb\3\2\2\2\u06bc\u06bd\5\u013a\u009e"+
		"\2\u06bd\u00fd\3\2\2\2\u06be\u06c0\5\u0108\u0085\2\u06bf\u06c1\5\u0134"+
		"\u009b\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2"+
		"\u06c3\7\20\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06be\3\2\2\2\u06c5\u06c6\3"+
		"\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06cb\3\2\2\2\u06c8"+
		"\u06cc\5\u0136\u009c\2\u06c9\u06cc\5\32\16\2\u06ca\u06cc\5\36\20\2\u06cb"+
		"\u06c8\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06ca\3\2\2\2\u06cc\u00ff\3\2"+
		"\2\2\u06cd\u06d0\5\u0102\u0082\2\u06ce\u06d0\5\u0104\u0083\2\u06cf\u06cd"+
		"\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u0101\3\2\2\2\u06d1\u06d2\7\u00ac\2"+
		"\2\u06d2\u06d3\5\u0106\u0084\2\u06d3\u0103\3\2\2\2\u06d4\u06d5\7\u00ac"+
		"\2\2\u06d5\u06d6\5\u0106\u0084\2\u06d6\u06d7\7\20\2\2\u06d7\u06d8\5\u011e"+
		"\u0090\2\u06d8\u0105\3\2\2\2\u06d9\u06db\5\u00fc\177\2\u06da\u06dc\7\4"+
		"\2\2\u06db\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u0107\3\2\2\2\u06df\u06e7\5\u00fc\177\2\u06e0\u06e4"+
		"\7\n\2\2\u06e1\u06e5\5\u0136\u009c\2\u06e2\u06e5\7\u00be\2\2\u06e3\u06e5"+
		"\5\u00f4{\2\u06e4\u06e1\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e3\3\2\2"+
		"\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\7\13\2\2\u06e7\u06e0\3\2\2\2\u06e8"+
		"\u06e9\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u0109\3\2"+
		"\2\2\u06eb\u06f0\7\u00bc\2\2\u06ec\u06ed\7\16\2\2\u06ed\u06ef\7\u00bc"+
		"\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f0"+
		"\u06f1\3\2\2\2\u06f1\u010b\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f3\u06f4\5\u0136"+
		"\u009c\2\u06f4\u06f5\7\16\2\2\u06f5\u06f6\5\u0136\u009c\2\u06f6\u010d"+
		"\3\2\2\2\u06f7\u06fc\5\u0136\u009c\2\u06f8\u06f9\7\16\2\2\u06f9\u06fb"+
		"\5\u0136\u009c\2\u06fa\u06f8\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3"+
		"\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u010f\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff"+
		"\u0704\7\u00ba\2\2\u0700\u0701\7\16\2\2\u0701\u0703\7\u00ba\2\2\u0702"+
		"\u0700\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2"+
		"\2\2\u0705\u0111\3\2\2\2\u0706\u0704\3\2\2\2\u0707\u070c\5\u012c\u0097"+
		"\2\u0708\u0709\7\16\2\2\u0709\u070b\5\u012c\u0097\2\u070a\u0708\3\2\2"+
		"\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0113"+
		"\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0710\7\n\2\2\u0710\u0711\5\u0112\u008a"+
		"\2\u0711\u0712\7\13\2\2\u0712\u0115\3\2\2\2\u0713\u0716\5\u00f4{\2\u0714"+
		"\u0716\5\u0130\u0099\2\u0715\u0713\3\2\2\2\u0715\u0714\3\2\2\2\u0716\u071e"+
		"\3\2\2\2\u0717\u071a\7\16\2\2\u0718\u071b\5\u00f4{\2\u0719\u071b\5\u0130"+
		"\u0099\2\u071a\u0718\3\2\2\2\u071a\u0719\3\2\2\2\u071b\u071d\3\2\2\2\u071c"+
		"\u0717\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2"+
		"\2\2\u071f\u0117\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0728\5\u010a\u0086"+
		"\2\u0722\u0728\5\u010e\u0088\2\u0723\u0728\5\u0110\u0089\2\u0724\u0728"+
		"\5\u0112\u008a\2\u0725\u0728\5\u0116\u008c\2\u0726\u0728\5\u010c\u0087"+
		"\2\u0727\u0721\3\2\2\2\u0727\u0722\3\2\2\2\u0727\u0723\3\2\2\2\u0727\u0724"+
		"\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0726\3\2\2\2\u0728\u0735\3\2\2\2\u0729"+
		"\u0731\7\16\2\2\u072a\u0732\5\u010a\u0086\2\u072b\u0732\5\u010e\u0088"+
		"\2\u072c\u0732\5\u0110\u0089\2\u072d\u0732\5\u0112\u008a\2\u072e\u0732"+
		"\5\u011a\u008e\2\u072f\u0732\5\u0116\u008c\2\u0730\u0732\5\u010c\u0087"+
		"\2\u0731\u072a\3\2\2\2\u0731\u072b\3\2\2\2\u0731\u072c\3\2\2\2\u0731\u072d"+
		"\3\2\2\2\u0731\u072e\3\2\2\2\u0731\u072f\3\2\2\2\u0731\u0730\3\2\2\2\u0732"+
		"\u0734\3\2\2\2\u0733\u0729\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2"+
		"\2\2\u0735\u0736\3\2\2\2\u0736\u0119\3\2\2\2\u0737\u0735\3\2\2\2\u0738"+
		"\u073d\5\u011e\u0090\2\u0739\u073a\7\16\2\2\u073a\u073c\5\u011e\u0090"+
		"\2\u073b\u0739\3\2\2\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u011b\3\2\2\2\u073f\u073d\3\2\2\2\u0740\u074b\5\u010a\u0086"+
		"\2\u0741\u074b\5\u010e\u0088\2\u0742\u074b\5\u0110\u0089\2\u0743\u074b"+
		"\5\u0112\u008a\2\u0744\u074b\5\u0114\u008b\2\u0745\u074b\5\u011a\u008e"+
		"\2\u0746\u074b\5\u010c\u0087\2\u0747\u074b\5\u0130\u0099\2\u0748\u074b"+
		"\5\u0118\u008d\2\u0749\u074b\5\u0116\u008c\2\u074a\u0740\3\2\2\2\u074a"+
		"\u0741\3\2\2\2\u074a\u0742\3\2\2\2\u074a\u0743\3\2\2\2\u074a\u0744\3\2"+
		"\2\2\u074a\u0745\3\2\2\2\u074a\u0746\3\2\2\2\u074a\u0747\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074a\u0749\3\2\2\2\u074b\u011d\3\2\2\2\u074c\u074e\7\f"+
		"\2\2\u074d\u074f\5\u011c\u008f\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2"+
		"\2\u074f\u0750\3\2\2\2\u0750\u0755\7\r\2\2\u0751\u0755\5\32\16\2\u0752"+
		"\u0755\5\36\20\2\u0753\u0755\5\u00fc\177\2\u0754\u074c\3\2\2\2\u0754\u0751"+
		"\3\2\2\2\u0754\u0752\3\2\2\2\u0754\u0753\3\2\2\2\u0755\u011f\3\2\2\2\u0756"+
		"\u0757\5\u013a\u009e\2\u0757\u0121\3\2\2\2\u0758\u0759\5\u0120\u0091\2"+
		"\u0759\u075c\7\20\2\2\u075a\u075d\5\u0120\u0091\2\u075b\u075d\5\u012c"+
		"\u0097\2\u075c\u075a\3\2\2\2\u075c\u075b\3\2\2\2\u075d\u0123\3\2\2\2\u075e"+
		"\u0761\5\u0126\u0094\2\u075f\u0761\5\u0128\u0095\2\u0760\u075e\3\2\2\2"+
		"\u0760\u075f\3\2\2\2\u0761\u0125\3\2\2\2\u0762\u0763\7\u00ac\2\2\u0763"+
		"\u0764\5\u0120\u0091\2\u0764\u0127\3\2\2\2\u0765\u0766\7\u00ac\2\2\u0766"+
		"\u0767\5\u0122\u0092\2\u0767\u0129\3\2\2\2\u0768\u0769\5\u013a\u009e\2"+
		"\u0769\u076a\7\17\2\2\u076a\u076b\5\u012e\u0098\2\u076b\u012b\3\2\2\2"+
		"\u076c\u0775\7\f\2\2\u076d\u0772\5\u012a\u0096\2\u076e\u076f\7\16\2\2"+
		"\u076f\u0771\5\u012a\u0096\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2\2\2\u0772"+
		"\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0776\3\2\2\2\u0774\u0772\3\2"+
		"\2\2\u0775\u076d\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0778\7\r\2\2\u0778\u012d\3\2\2\2\u0779\u0789\5\u0136\u009c\2\u077a\u0789"+
		"\7\u00bc\2\2\u077b\u0789\7\u00be\2\2\u077c\u0789\7\u0080\2\2\u077d\u0789"+
		"\5\u00f4{\2\u077e\u0789\7\u00ba\2\2\u077f\u0789\5\u012c\u0097\2\u0780"+
		"\u0789\5\u0130\u0099\2\u0781\u0789\5\u00c2b\2\u0782\u0789\5\u0108\u0085"+
		"\2\u0783\u0789\5\u0114\u008b\2\u0784\u0785\7\n\2\2\u0785\u0786\5\u011c"+
		"\u008f\2\u0786\u0787\7\13\2\2\u0787\u0789\3\2\2\2\u0788\u0779\3\2\2\2"+
		"\u0788\u077a\3\2\2\2\u0788\u077b\3\2\2\2\u0788\u077c\3\2\2\2\u0788\u077d"+
		"\3\2\2\2\u0788\u077e\3\2\2\2\u0788\u077f\3\2\2\2\u0788\u0780\3\2\2\2\u0788"+
		"\u0781\3\2\2\2\u0788\u0782\3\2\2\2\u0788\u0783\3\2\2\2\u0788\u0784\3\2"+
		"\2\2\u0789\u012f\3\2\2\2\u078a\u078d\5\u0120\u0091\2\u078b\u078c\7\7\2"+
		"\2\u078c\u078e\5\u00f4{\2\u078d\u078b\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0131\3\2\2\2\u0791\u0792\7\'"+
		"\2\2\u0792\u079c\5\u013a\u009e\2\u0793\u0794\7&\2\2\u0794\u079c\5\u013a"+
		"\u009e\2\u0795\u0796\5\u013a\u009e\2\u0796\u0797\7\'\2\2\u0797\u079c\3"+
		"\2\2\2\u0798\u0799\5\u013a\u009e\2\u0799\u079a\7&\2\2\u079a\u079c\3\2"+
		"\2\2\u079b\u0791\3\2\2\2\u079b\u0793\3\2\2\2\u079b\u0795\3\2\2\2\u079b"+
		"\u0798\3\2\2\2\u079c\u0133\3\2\2\2\u079d\u079e\t\17\2\2\u079e\u0135\3"+
		"\2\2\2\u079f\u07a0\b\u009c\1\2\u07a0\u07b7\5\u0138\u009d\2\u07a1\u07a3"+
		"\7\b\2\2\u07a2\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4"+
		"\u07a5\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a9\5\u0136\u009c\2\u07a7\u07a9"+
		"\5\u00f2z\2\u07a8\u07a6\3\2\2\2\u07a8\u07a7\3\2\2\2\u07a9\u07ab\3\2\2"+
		"\2\u07aa\u07ac\7\t\2\2\u07ab\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ab"+
		"\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b7\3\2\2\2\u07af\u07b0\7&\2\2\u07b0"+
		"\u07b7\5\u0136\u009c\17\u07b1\u07b2\7\'\2\2\u07b2\u07b7\5\u0136\u009c"+
		"\16\u07b3\u07b4\5|?\2\u07b4\u07b5\5\u0136\u009c\r\u07b5\u07b7\3\2\2\2"+
		"\u07b6\u079f\3\2\2\2\u07b6\u07a2\3\2\2\2\u07b6\u07af\3\2\2\2\u07b6\u07b1"+
		"\3\2\2\2\u07b6\u07b3\3\2\2\2\u07b7\u07df\3\2\2\2\u07b8\u07b9\f\f\2\2\u07b9"+
		"\u07ba\t\5\2\2\u07ba\u07de\5\u0136\u009c\r\u07bb\u07bc\f\13\2\2\u07bc"+
		"\u07bd\t\6\2\2\u07bd\u07de\5\u0136\u009c\f\u07be\u07bf\f\n\2\2\u07bf\u07c0"+
		"\t\20\2\2\u07c0\u07de\5\u0136\u009c\13\u07c1\u07c2\f\t\2\2\u07c2\u07c3"+
		"\t\b\2\2\u07c3\u07de\5\u0136\u009c\n\u07c4\u07c5\f\b\2\2\u07c5\u07c6\t"+
		"\21\2\2\u07c6\u07de\5\u0136\u009c\t\u07c7\u07c8\f\7\2\2\u07c8\u07c9\7"+
		"\34\2\2\u07c9\u07de\5\u0136\u009c\b\u07ca\u07cb\f\6\2\2\u07cb\u07cc\7"+
		"\36\2\2\u07cc\u07de\5\u0136\u009c\7\u07cd\u07ce\f\5\2\2\u07ce\u07cf\7"+
		"\35\2\2\u07cf\u07de\5\u0136\u009c\6\u07d0\u07d1\f\4\2\2\u07d1\u07d2\7"+
		"\26\2\2\u07d2\u07de\5\u0136\u009c\5\u07d3\u07d4\f\3\2\2\u07d4\u07d5\7"+
		"(\2\2\u07d5\u07d6\5\u0136\u009c\2\u07d6\u07d7\7\17\2\2\u07d7\u07d8\5\u0136"+
		"\u009c\4\u07d8\u07de\3\2\2\2\u07d9\u07da\f\21\2\2\u07da\u07de\7&\2\2\u07db"+
		"\u07dc\f\20\2\2\u07dc\u07de\7\'\2\2\u07dd\u07b8\3\2\2\2\u07dd\u07bb\3"+
		"\2\2\2\u07dd\u07be\3\2\2\2\u07dd\u07c1\3\2\2\2\u07dd\u07c4\3\2\2\2\u07dd"+
		"\u07c7\3\2\2\2\u07dd\u07ca\3\2\2\2\u07dd\u07cd\3\2\2\2\u07dd\u07d0\3\2"+
		"\2\2\u07dd\u07d3\3\2\2\2\u07dd\u07d9\3\2\2\2\u07dd\u07db\3\2\2\2\u07de"+
		"\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u0137\3\2"+
		"\2\2\u07e1\u07df\3\2\2\2\u07e2\u07ec\7\u00a4\2\2\u07e3\u07ec\7]\2\2\u07e4"+
		"\u07ec\7\u00be\2\2\u07e5\u07ec\5\u00f4{\2\u07e6\u07ec\7\u00bc\2\2\u07e7"+
		"\u07ec\7\u00ba\2\2\u07e8\u07ec\5\u0130\u0099\2\u07e9\u07ec\5\u0108\u0085"+
		"\2\u07ea\u07ec\5\u00c2b\2\u07eb\u07e2\3\2\2\2\u07eb\u07e3\3\2\2\2\u07eb"+
		"\u07e4\3\2\2\2\u07eb\u07e5\3\2\2\2\u07eb\u07e6\3\2\2\2\u07eb\u07e7\3\2"+
		"\2\2\u07eb\u07e8\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ea\3\2\2\2\u07ec"+
		"\u0139\3\2\2\2\u07ed\u07ee\7\u00bd\2\2\u07ee\u013b\3\2\2\2\u00fb\u0140"+
		"\u0142\u014d\u0154\u0159\u015f\u016a\u0171\u0178\u0180\u0191\u0196\u019f"+
		"\u01a1\u01a8\u01ae\u01b4\u01b9\u01c5\u01c8\u01cd\u01cf\u01d6\u01df\u01e4"+
		"\u01ed\u01f8\u01ff\u0205\u020f\u0212\u0217\u0219\u0220\u0227\u0230\u0234"+
		"\u0236\u0239\u0242\u0246\u0248\u0251\u025c\u0263\u0266\u0273\u0278\u0281"+
		"\u0283\u028f\u0293\u0297\u029c\u02a0\u02ab\u02b7\u02ba\u02cf\u02d5\u02d7"+
		"\u02db\u02e2\u02e7\u02f0\u02f7\u02fb\u0303\u030b\u031f\u0323\u0329\u0332"+
		"\u0337\u0343\u0347\u034b\u034f\u0356\u0359\u035b\u0362\u0365\u0369\u0370"+
		"\u037f\u038c\u0394\u0397\u039f\u03a6\u03ae\u03b8\u03c0\u03c4\u03c9\u03d2"+
		"\u03d7\u03e5\u03e8\u03ea\u03ef\u03f3\u03f6\u03fd\u0405\u0409\u040d\u0410"+
		"\u0416\u0419\u041b\u0424\u042a\u042d\u0430\u0434\u0438\u043f\u0448\u044c"+
		"\u044e\u0451\u045a\u045e\u0460\u0466\u046e\u0477\u0484\u0489\u048c\u0490"+
		"\u049a\u049f\u04a6\u04cb\u04e0\u04e6\u04f5\u04f9\u0500\u0503\u050f\u0516"+
		"\u0519\u0520\u0522\u0528\u052f\u0531\u0538\u0540\u0543\u054a\u0550\u0554"+
		"\u0556\u055e\u0569\u056e\u0578\u0583\u0587\u058b\u059b\u05a4\u05ae\u05b4"+
		"\u05b8\u05be\u05c5\u05cb\u05d0\u05d3\u05d9\u05e0\u05e6\u05eb\u05ee\u05f5"+
		"\u05fb\u0600\u0603\u0609\u060f\u0616\u061c\u0620\u062a\u062c\u0630\u0634"+
		"\u063c\u0645\u064d\u065b\u0662\u0666\u0668\u0671\u0676\u0679\u0681\u0687"+
		"\u068c\u068f\u0693\u0698\u069d\u06a2\u06a8\u06ae\u06b4\u06c0\u06c6\u06cb"+
		"\u06cf\u06dd\u06e4\u06e9\u06f0\u06fc\u0704\u070c\u0715\u071a\u071e\u0727"+
		"\u0731\u0735\u073d\u074a\u074e\u0754\u075c\u0760\u0772\u0775\u0788\u078f"+
		"\u079b\u07a4\u07a8\u07ad\u07b6\u07dd\u07df\u07eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}