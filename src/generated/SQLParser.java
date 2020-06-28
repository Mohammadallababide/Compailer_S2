// Generated from C:/Users/Dell/Desktop/compile_s2/Compailer_S2/src\SQL.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		K_SAVEPOINT=152, K_SELECT=153, K_SET=154, K_SWITCH=155, K_TYPE=156, K_TABLE=157, 
		K_TEMP=158, K_TEMPORARY=159, K_THEN=160, K_TO=161, K_TRANSACTION=162, 
		K_TRUE=163, K_TRIGGER=164, K_UNION=165, K_UNIQUE=166, K_UPDATE=167, K_USING=168, 
		K_VACUUM=169, K_VALUES=170, K_VAR=171, K_VIEW=172, K_VIRTUAL=173, K_WHEN=174, 
		K_WHERE=175, K_WITH=176, K_WITHOUT=177, K_WHILE=178, K_CONTINUE=179, K_JSON=180, 
		K_AGGREGATION=181, K_STRING=182, K_BOOLEAN=183, K_NUMBER=184, K_PATH=185, 
		ONE_CHAR_LETTER=186, STRING_LITERAL=187, IDENTIFIER=188, RANDOM_NAME=189, 
		NUMERIC_LITERAL=190, BIND_PARAMETER=191, BLOB_LITERAL=192, MULTILINE_COMMENT=193, 
		SPACES=194, UNEXPECTED_CHAR=195;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_create_type = 4, RULE_inside_create_type = 5, RULE_alter_table_stmt = 6, 
		RULE_renametable = 7, RULE_addcolumn = 8, RULE_alter_table_add_constraint = 9, 
		RULE_alter_table_add = 10, RULE_create_table_stmt = 11, RULE_declare_type_table = 12, 
		RULE_declare_path_table = 13, RULE_delete_stmt = 14, RULE_drop_table_stmt = 15, 
		RULE_factored_select_stmt = 16, RULE_insert_stmt = 17, RULE_select_stmt = 18, 
		RULE_limit_expr = 19, RULE_select_or_values = 20, RULE_where_expr = 21, 
		RULE_update_stmt = 22, RULE_asign_expr_to_column = 23, RULE_column_def = 24, 
		RULE_type_name = 25, RULE_oneOftype_name = 26, RULE_signed_number1 = 27, 
		RULE_signed_number2 = 28, RULE_column_constraint = 29, RULE_column_check = 30, 
		RULE_column_unique = 31, RULE_column_constraint_primary_key = 32, RULE_column_constraint_foreign_key = 33, 
		RULE_column_constraint_not_null = 34, RULE_column_constraint_null = 35, 
		RULE_column_default = 36, RULE_column_default_value = 37, RULE_expr = 38, 
		RULE_commn_expr_opreator = 39, RULE_foreign_key_clause = 40, RULE_fk_target_column_name = 41, 
		RULE_indexed_column = 42, RULE_table_constraint = 43, RULE_table_check = 44, 
		RULE_table_constraint_primary_key = 45, RULE_table_constraint_foreign_key = 46, 
		RULE_table_constraint_unique = 47, RULE_table_constraint_key = 48, RULE_fk_origin_column_name = 49, 
		RULE_qualified_table_name = 50, RULE_ordering_term = 51, RULE_pragma_value = 52, 
		RULE_common_table_expression = 53, RULE_result_column = 54, RULE_table_or_subquery = 55, 
		RULE_join_clause = 56, RULE_join_operator = 57, RULE_join_constraint = 58, 
		RULE_select_core = 59, RULE_list_of_expr = 60, RULE_list_of_list_of_expr = 61, 
		RULE_having_expr = 62, RULE_cte_table_name = 63, RULE_signed_number = 64, 
		RULE_literal_value = 65, RULE_unary_operator = 66, RULE_error_message = 67, 
		RULE_module_argument = 68, RULE_column_alias = 69, RULE_keyword = 70, 
		RULE_unknown = 71, RULE_name = 72, RULE_function_name = 73, RULE_database_name = 74, 
		RULE_source_table_name = 75, RULE_table_name = 76, RULE_table_or_index_name = 77, 
		RULE_new_table_name = 78, RULE_column_name = 79, RULE_collation_name = 80, 
		RULE_foreign_table = 81, RULE_index_name = 82, RULE_trigger_name = 83, 
		RULE_view_name = 84, RULE_module_name = 85, RULE_pragma_name = 86, RULE_savepoint_name = 87, 
		RULE_table_alias = 88, RULE_transaction_name = 89, RULE_any_name = 90, 
		RULE_create_aggregation_function = 91, RULE_jar_pathe = 92, RULE_parames = 93, 
		RULE_funtion = 94, RULE_function_header = 95, RULE_function_body = 96, 
		RULE_sub_function_body = 97, RULE_instructions = 98, RULE_functional_instruction = 99, 
		RULE_nonfunctional_instruction = 100, RULE_call_function = 101, RULE_callback_func = 102, 
		RULE_args = 103, RULE_prameters = 104, RULE_return_rule = 105, RULE_exiting_loops = 106, 
		RULE_return_type = 107, RULE_print_statment = 108, RULE_indisde_the_print = 109, 
		RULE_if_else_rule = 110, RULE_if_rule = 111, RULE_else_if_rule = 112, 
		RULE_else_rulse = 113, RULE_while_rule = 114, RULE_do_while = 115, RULE_for_loop_rule = 116, 
		RULE_inside_for_loop = 117, RULE_foreach = 118, RULE_switch_rule = 119, 
		RULE_defult = 120, RULE_case_rule = 121, RULE_grnral_creating = 122, RULE_creating_with_assign = 123, 
		RULE_creat_without_assign = 124, RULE_genral_assign = 125, RULE_varible_name = 126, 
		RULE_assign_varible = 127, RULE_create_varible_without_assign = 128, RULE_create_varible_with_assign = 129, 
		RULE_array_name = 130, RULE_assign_array = 131, RULE_create_array_form = 132, 
		RULE_create_Array_without_assign = 133, RULE_create_Array_with_assign = 134, 
		RULE_array_base_form_without_index = 135, RULE_array_base_form_with_index = 136, 
		RULE_array_identifier_form = 137, RULE_array_boolean_form = 138, RULE_array_integer_form = 139, 
		RULE_array_charecter_form = 140, RULE_array_objects_form = 141, RULE_array_objects_form2 = 142, 
		RULE_array_varible_form = 143, RULE_array_anyType_form = 144, RULE_array_arrayes_form = 145, 
		RULE_value_left_side = 146, RULE_left_side_array = 147, RULE_json_name = 148, 
		RULE_assign_json = 149, RULE_create_json_form = 150, RULE_create_json_object_without_assign = 151, 
		RULE_create_json_with_assign = 152, RULE_inside_json_statmnet = 153, RULE_json_statment = 154, 
		RULE_value_json_statmnet = 155, RULE_varible_from_object = 156, RULE_shortcut_statments = 157, 
		RULE_any_arithmetic_oprator = 158, RULE_expression = 159, RULE_intral_expression_value = 160, 
		RULE_use_random_name = 161;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "create_type", "inside_create_type", 
			"alter_table_stmt", "renametable", "addcolumn", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "declare_type_table", "declare_path_table", 
			"delete_stmt", "drop_table_stmt", "factored_select_stmt", "insert_stmt", 
			"select_stmt", "limit_expr", "select_or_values", "where_expr", "update_stmt", 
			"asign_expr_to_column", "column_def", "type_name", "oneOftype_name", 
			"signed_number1", "signed_number2", "column_constraint", "column_check", 
			"column_unique", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "commn_expr_opreator", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_check", 
			"table_constraint_primary_key", "table_constraint_foreign_key", "table_constraint_unique", 
			"table_constraint_key", "fk_origin_column_name", "qualified_table_name", 
			"ordering_term", "pragma_value", "common_table_expression", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "list_of_expr", "list_of_list_of_expr", "having_expr", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
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
			"K_SELECT", "K_SET", "K_SWITCH", "K_TYPE", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRUE", "K_TRIGGER", "K_UNION", 
			"K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VAR", "K_VIEW", 
			"K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_WHILE", "K_CONTINUE", 
			"K_JSON", "K_AGGREGATION", "K_STRING", "K_BOOLEAN", "K_NUMBER", "K_PATH", 
			"ONE_CHAR_LETTER", "STRING_LITERAL", "IDENTIFIER", "RANDOM_NAME", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_ALTER || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DELETE - 65)) | (1L << (K_DROP - 65)) | (1L << (K_FUNCTION - 65)) | (1L << (K_INSERT - 65)))) != 0) || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_SELECT - 153)) | (1L << (K_UPDATE - 153)) | (1L << (K_VALUES - 153)) | (1L << (RANDOM_NAME - 153)) | (1L << (UNEXPECTED_CHAR - 153)))) != 0)) {
				{
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(324);
					create_aggregation_function();
					}
					break;
				case 2:
					{
					setState(325);
					sql_stmt_list();
					}
					break;
				case 3:
					{
					setState(326);
					error();
					}
					break;
				case 4:
					{
					setState(327);
					funtion();
					}
					break;
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
			setState(335);
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
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(338);
				match(SCOL);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			sql_stmt();
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(345);
						match(SCOL);
						}
						}
						setState(348); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(350);
					sql_stmt();
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					match(SCOL);
					}
					} 
				}
				setState(361);
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
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(362);
				create_aggregation_function();
				}
				break;
			case 2:
				{
				setState(363);
				alter_table_stmt();
				}
				break;
			case 3:
				{
				setState(364);
				create_table_stmt();
				}
				break;
			case 4:
				{
				setState(365);
				delete_stmt();
				}
				break;
			case 5:
				{
				setState(366);
				drop_table_stmt();
				}
				break;
			case 6:
				{
				setState(367);
				factored_select_stmt();
				}
				break;
			case 7:
				{
				setState(368);
				insert_stmt();
				}
				break;
			case 8:
				{
				setState(369);
				update_stmt();
				}
				break;
			case 9:
				{
				setState(370);
				create_type();
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

	public static class Create_typeContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Inside_create_typeContext> inside_create_type() {
			return getRuleContexts(Inside_create_typeContext.class);
		}
		public Inside_create_typeContext inside_create_type(int i) {
			return getRuleContext(Inside_create_typeContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(K_CREATE);
			setState(374);
			match(K_TYPE);
			setState(375);
			use_random_name();
			setState(376);
			match(OPEN_PAR);
			setState(377);
			inside_create_type();
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(378);
				match(COMMA);
				setState(379);
				inside_create_type();
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(384);
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

	public static class Inside_create_typeContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public OneOftype_nameContext oneOftype_name() {
			return getRuleContext(OneOftype_nameContext.class,0);
		}
		public Inside_create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInside_create_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInside_create_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInside_create_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_create_typeContext inside_create_type() throws RecognitionException {
		Inside_create_typeContext _localctx = new Inside_create_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inside_create_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			use_random_name();
			setState(387);
			oneOftype_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(K_ALTER);
			setState(390);
			match(K_TABLE);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(391);
				database_name();
				setState(392);
				match(DOT);
				}
				break;
			}
			setState(396);
			source_table_name();
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(397);
				renametable();
				}
				break;
			case 2:
				{
				setState(398);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(399);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(400);
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
		enterRule(_localctx, 14, RULE_renametable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(K_RENAME);
			setState(404);
			match(K_TO);
			setState(405);
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
		enterRule(_localctx, 16, RULE_addcolumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(K_ADD);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLUMN) {
				{
				setState(408);
				match(K_COLUMN);
				}
			}

			setState(411);
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
		enterRule(_localctx, 18, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(K_ADD);
			setState(414);
			match(K_CONSTRAINT);
			setState(415);
			use_random_name();
			setState(416);
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
		enterRule(_localctx, 20, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(K_ADD);
			setState(419);
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
		public Declare_type_tableContext declare_type_table() {
			return getRuleContext(Declare_type_tableContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Declare_path_tableContext declare_path_table() {
			return getRuleContext(Declare_path_tableContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
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
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(K_CREATE);
			setState(422);
			match(K_TABLE);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(423);
				match(K_IF);
				setState(424);
				match(K_NOT);
				setState(425);
				match(K_EXISTS);
				}
			}

			setState(428);
			table_name();
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(429);
				match(OPEN_PAR);
				setState(430);
				column_def();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(431);
						match(COMMA);
						setState(432);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(433);
						match(COMMA);
						setState(434);
						column_def();
						}
						break;
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(CLOSE_PAR);
				setState(441);
				declare_type_table();
				setState(442);
				match(COMMA);
				setState(443);
				declare_path_table();
				}
				break;
			case K_AS:
				{
				setState(445);
				match(K_AS);
				setState(446);
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

	public static class Declare_type_tableContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Declare_type_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_type_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeclare_type_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeclare_type_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeclare_type_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_type_tableContext declare_type_table() throws RecognitionException {
		Declare_type_tableContext _localctx = new Declare_type_tableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare_type_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(K_TYPE);
			setState(450);
			match(ASSIGN);
			setState(451);
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

	public static class Declare_path_tableContext extends ParserRuleContext {
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Declare_path_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_path_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeclare_path_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeclare_path_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeclare_path_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_path_tableContext declare_path_table() throws RecognitionException {
		Declare_path_tableContext _localctx = new Declare_path_tableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declare_path_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(K_PATH);
			setState(454);
			match(ASSIGN);
			setState(455);
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
		enterRule(_localctx, 28, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(K_DELETE);
			setState(458);
			match(K_FROM);
			setState(459);
			qualified_table_name();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(460);
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
		enterRule(_localctx, 30, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(K_DROP);
			setState(464);
			match(K_TABLE);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(465);
				match(K_IF);
				setState(466);
				match(K_EXISTS);
				}
			}

			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(469);
				database_name();
				setState(470);
				match(DOT);
				}
				break;
			}
			setState(474);
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
		enterRule(_localctx, 32, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			select_core();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(477);
				match(K_ORDER);
				setState(478);
				match(K_BY);
				setState(479);
				ordering_term();
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(480);
						match(COMMA);
						setState(481);
						ordering_term();
						}
						} 
					}
					setState(486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
			}

			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(489);
				limit_expr();
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(490);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(491);
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
		enterRule(_localctx, 34, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(K_INSERT);
			setState(497);
			match(K_INTO);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(498);
				database_name();
				setState(499);
				match(DOT);
				}
				break;
			}
			setState(503);
			table_name();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(504);
				match(OPEN_PAR);
				setState(505);
				column_name();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(506);
					match(COMMA);
					setState(507);
					column_name();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				match(CLOSE_PAR);
				}
			}

			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(517);
				match(K_VALUES);
				setState(518);
				match(OPEN_PAR);
				setState(519);
				expr(0);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(520);
					match(COMMA);
					setState(521);
					expr(0);
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(527);
				match(CLOSE_PAR);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(528);
					match(COMMA);
					setState(529);
					match(OPEN_PAR);
					setState(530);
					expr(0);
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(531);
						match(COMMA);
						setState(532);
						expr(0);
						}
						}
						setState(537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(538);
					match(CLOSE_PAR);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(545);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(546);
				match(K_DEFAULT);
				setState(547);
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
		enterRule(_localctx, 36, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			select_or_values();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(551);
				match(K_ORDER);
				setState(552);
				match(K_BY);
				setState(553);
				ordering_term();
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						match(COMMA);
						setState(555);
						ordering_term();
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
			}

			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(563);
				limit_expr();
				setState(566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(565);
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
		enterRule(_localctx, 38, RULE_limit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(K_LIMIT);
			setState(571);
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
		enterRule(_localctx, 40, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(K_SELECT);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(574);
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

				setState(577);
				result_column();
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						match(COMMA);
						setState(579);
						result_column();
						}
						} 
					}
					setState(584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(585);
					match(K_FROM);
					setState(595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(586);
						table_or_subquery();
						setState(591);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(587);
								match(COMMA);
								setState(588);
								table_or_subquery();
								}
								} 
							}
							setState(593);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(594);
						join_clause();
						}
						break;
					}
					}
				}

				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(599);
					where_expr();
					}
				}

				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(602);
					match(K_GROUP);
					setState(603);
					match(K_BY);
					setState(604);
					expr(0);
					setState(609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(605);
							match(COMMA);
							setState(606);
							expr(0);
							}
							} 
						}
						setState(611);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(612);
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
				setState(617);
				match(K_VALUES);
				setState(618);
				match(OPEN_PAR);
				setState(619);
				expr(0);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(620);
					match(COMMA);
					setState(621);
					expr(0);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				match(CLOSE_PAR);
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(628);
						match(COMMA);
						setState(629);
						match(OPEN_PAR);
						setState(630);
						expr(0);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(631);
							match(COMMA);
							setState(632);
							expr(0);
							}
							}
							setState(637);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(638);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(644);
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
		enterRule(_localctx, 42, RULE_where_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(K_WHERE);
			setState(648);
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
		enterRule(_localctx, 44, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(K_UPDATE);
			setState(651);
			qualified_table_name();
			setState(652);
			match(K_SET);
			setState(653);
			asign_expr_to_column();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654);
				match(COMMA);
				setState(655);
				asign_expr_to_column();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(661);
				match(K_WHERE);
				setState(662);
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
		enterRule(_localctx, 46, RULE_asign_expr_to_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			column_name();
			setState(666);
			match(ASSIGN);
			setState(667);
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
		enterRule(_localctx, 48, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			column_name();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(672);
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
						setState(670);
						column_constraint();
						}
						break;
					case K_STRING:
					case K_BOOLEAN:
					case K_NUMBER:
					case RANDOM_NAME:
						{
						setState(671);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(676);
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
		public OneOftype_nameContext oneOftype_name() {
			return getRuleContext(OneOftype_nameContext.class,0);
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
		enterRule(_localctx, 50, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			oneOftype_name();
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(678);
				match(OPEN_PAR);
				setState(679);
				signed_number1();
				setState(680);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(682);
				match(OPEN_PAR);
				setState(683);
				signed_number2();
				setState(684);
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

	public static class OneOftype_nameContext extends ParserRuleContext {
		public TerminalNode K_NUMBER() { return getToken(SQLParser.K_NUMBER, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public OneOftype_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOftype_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOneOftype_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOneOftype_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOneOftype_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOftype_nameContext oneOftype_name() throws RecognitionException {
		OneOftype_nameContext _localctx = new OneOftype_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_oneOftype_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NUMBER:
				{
				setState(688);
				match(K_NUMBER);
				}
				break;
			case K_STRING:
				{
				setState(689);
				match(K_STRING);
				}
				break;
			case K_BOOLEAN:
				{
				setState(690);
				match(K_BOOLEAN);
				}
				break;
			case RANDOM_NAME:
				{
				setState(691);
				use_random_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 54, RULE_signed_number1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			signed_number();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(695);
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
		enterRule(_localctx, 56, RULE_signed_number2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			signed_number();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(699);
				use_random_name();
				}
			}

			setState(702);
			match(COMMA);
			setState(703);
			signed_number();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(704);
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
		enterRule(_localctx, 58, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(707);
				match(K_CONSTRAINT);
				setState(708);
				name();
				}
			}

			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(711);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(712);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(713);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(714);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(715);
				column_unique();
				}
				break;
			case K_CHECK:
				{
				setState(716);
				column_check();
				}
				break;
			case K_DEFAULT:
				{
				setState(717);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(718);
				match(K_COLLATE);
				setState(719);
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
		enterRule(_localctx, 60, RULE_column_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(K_CHECK);
			setState(723);
			match(OPEN_PAR);
			setState(724);
			expr(0);
			setState(725);
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
		enterRule(_localctx, 62, RULE_column_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		enterRule(_localctx, 64, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(K_PRIMARY);
			setState(730);
			match(K_KEY);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(731);
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

			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(734);
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
		enterRule(_localctx, 66, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
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
		enterRule(_localctx, 68, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(K_NOT);
			setState(740);
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
		enterRule(_localctx, 70, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
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
		enterRule(_localctx, 72, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(K_DEFAULT);
			setState(756);
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
				setState(745);
				column_default_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(746);
				match(OPEN_PAR);
				setState(747);
				expr(0);
				setState(748);
				match(CLOSE_PAR);
				}
				break;
			case K_NEXTVAL:
				{
				setState(750);
				match(K_NEXTVAL);
				setState(751);
				match(OPEN_PAR);
				setState(752);
				expr(0);
				setState(753);
				match(CLOSE_PAR);
				}
				break;
			case RANDOM_NAME:
				{
				setState(755);
				use_random_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(758);
				match(T__0);
				setState(760); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(759);
						use_random_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(762); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 74, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(766);
				signed_number();
				}
				break;
			case 2:
				{
				setState(767);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(771);
				literal_value();
				}
				break;
			case 2:
				{
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(772);
						database_name();
						setState(773);
						match(DOT);
						}
						break;
					}
					setState(777);
					table_name();
					setState(778);
					match(DOT);
					}
					break;
				}
				setState(782);
				column_name();
				}
				break;
			case 3:
				{
				setState(783);
				unary_operator();
				setState(784);
				expr(4);
				}
				break;
			case 4:
				{
				setState(786);
				function_name();
				setState(787);
				match(OPEN_PAR);
				setState(800);
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
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(788);
						match(K_DISTINCT);
						}
					}

					setState(791);
					expr(0);
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(792);
						match(COMMA);
						setState(793);
						expr(0);
						}
						}
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(799);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(802);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(804);
				match(OPEN_PAR);
				setState(805);
				expr(0);
				setState(806);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(810);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(811);
					commn_expr_opreator();
					setState(812);
					expr(4);
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 78, RULE_commn_expr_opreator);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(PIPE2);
				}
				break;
			case STAR:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
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
				setState(821);
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
				setState(822);
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
				setState(823);
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
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(824);
					match(ASSIGN);
					}
					break;
				case 2:
					{
					setState(825);
					match(EQ);
					}
					break;
				case 3:
					{
					setState(826);
					match(NOT_EQ1);
					}
					break;
				case 4:
					{
					setState(827);
					match(NOT_EQ2);
					}
					break;
				case 5:
					{
					setState(828);
					match(K_IS);
					}
					break;
				case 6:
					{
					setState(829);
					match(K_IS);
					setState(830);
					match(K_NOT);
					}
					break;
				case 7:
					{
					setState(831);
					match(K_IN);
					}
					break;
				case 8:
					{
					setState(832);
					match(K_LIKE);
					}
					break;
				case 9:
					{
					setState(833);
					match(K_GLOB);
					}
					break;
				case 10:
					{
					setState(834);
					match(K_MATCH);
					}
					break;
				case 11:
					{
					setState(835);
					match(K_REGEXP);
					}
					break;
				}
				}
				break;
			case K_AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
				match(K_AND);
				}
				break;
			case K_OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(839);
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
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(K_REFERENCES);
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(843);
				database_name();
				setState(844);
				match(DOT);
				}
				break;
			}
			setState(848);
			foreign_table();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(849);
				match(OPEN_PAR);
				setState(850);
				fk_target_column_name();
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(851);
					match(COMMA);
					setState(852);
					fk_target_column_name();
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(858);
				match(CLOSE_PAR);
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(876);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(862);
					match(K_ON);
					setState(863);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(864);
						match(K_SET);
						setState(865);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(866);
						match(K_SET);
						setState(867);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(868);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(869);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(870);
						match(K_NO);
						setState(871);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(874);
					match(K_MATCH);
					setState(875);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(883);
					match(K_NOT);
					}
				}

				setState(886);
				match(K_DEFERRABLE);
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(887);
					match(K_INITIALLY);
					setState(888);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(889);
					match(K_INITIALLY);
					setState(890);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(893);
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
		enterRule(_localctx, 82, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
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
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			column_name();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(901);
				match(K_COLLATE);
				setState(902);
				collation_name();
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(905);
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
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(908);
				match(K_CONSTRAINT);
				setState(909);
				name();
				}
			}

			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(912);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(913);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(914);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(915);
				table_check();
				}
				break;
			case K_FOREIGN:
				{
				setState(916);
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
		enterRule(_localctx, 88, RULE_table_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(K_CHECK);
			setState(920);
			match(OPEN_PAR);
			setState(921);
			expr(0);
			setState(922);
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
		enterRule(_localctx, 90, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(K_PRIMARY);
			setState(925);
			match(K_KEY);
			setState(926);
			match(OPEN_PAR);
			setState(927);
			indexed_column();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(928);
				match(COMMA);
				setState(929);
				indexed_column();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
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
		enterRule(_localctx, 92, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(K_FOREIGN);
			setState(938);
			match(K_KEY);
			setState(939);
			match(OPEN_PAR);
			setState(940);
			fk_origin_column_name();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(941);
				match(COMMA);
				setState(942);
				fk_origin_column_name();
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			match(CLOSE_PAR);
			setState(949);
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
		enterRule(_localctx, 94, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(K_UNIQUE);
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(952);
				match(K_KEY);
				}
			}

			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(955);
				name();
				}
			}

			setState(958);
			match(OPEN_PAR);
			setState(959);
			indexed_column();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				indexed_column();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
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
		enterRule(_localctx, 96, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(K_KEY);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				setState(970);
				name();
				}
			}

			setState(973);
			match(OPEN_PAR);
			setState(974);
			indexed_column();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(975);
				match(COMMA);
				setState(976);
				indexed_column();
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
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
		enterRule(_localctx, 98, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
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
		enterRule(_localctx, 100, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(986);
				database_name();
				setState(987);
				match(DOT);
				}
				break;
			}
			setState(991);
			table_name();
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(992);
				match(K_INDEXED);
				setState(993);
				match(K_BY);
				setState(994);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(995);
				match(K_NOT);
				setState(996);
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
		enterRule(_localctx, 102, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			expr(0);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1000);
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
		enterRule(_localctx, 104, RULE_pragma_value);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				signed_number();
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				name();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
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
		enterRule(_localctx, 106, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			table_name();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1009);
				match(OPEN_PAR);
				setState(1010);
				column_name();
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1011);
					match(COMMA);
					setState(1012);
					column_name();
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				match(CLOSE_PAR);
				}
			}

			setState(1022);
			match(K_AS);
			setState(1023);
			match(OPEN_PAR);
			setState(1024);
			select_stmt();
			setState(1025);
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
		enterRule(_localctx, 108, RULE_result_column);
		int _la;
		try {
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				table_name();
				setState(1029);
				match(DOT);
				setState(1030);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				expr(0);
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1033);
						match(K_AS);
						}
					}

					setState(1036);
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
		enterRule(_localctx, 110, RULE_table_or_subquery);
		int _la;
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1041);
					database_name();
					setState(1042);
					match(DOT);
					}
					break;
				}
				setState(1046);
				table_name();
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1047);
						match(K_AS);
						}
					}

					setState(1050);
					table_alias();
					}
					break;
				}
				setState(1058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1053);
					match(K_INDEXED);
					setState(1054);
					match(K_BY);
					setState(1055);
					index_name();
					}
					break;
				case 2:
					{
					setState(1056);
					match(K_NOT);
					setState(1057);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(OPEN_PAR);
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1061);
					table_or_subquery();
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1062);
						match(COMMA);
						setState(1063);
						table_or_subquery();
						}
						}
						setState(1068);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1069);
					join_clause();
					}
					break;
				}
				setState(1072);
				match(CLOSE_PAR);
				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1073);
						match(K_AS);
						}
					}

					setState(1076);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(OPEN_PAR);
				setState(1080);
				select_stmt();
				setState(1081);
				match(CLOSE_PAR);
				setState(1086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1083);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1082);
						match(K_AS);
						}
					}

					setState(1085);
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
		enterRule(_localctx, 112, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			table_or_subquery();
			setState(1097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1091);
					join_operator();
					setState(1092);
					table_or_subquery();
					setState(1093);
					join_constraint();
					}
					} 
				}
				setState(1099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		enterRule(_localctx, 114, RULE_join_operator);
		int _la;
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				match(SCOL);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1101);
					match(K_LEFT);
					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1102);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1105);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1108);
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
		enterRule(_localctx, 116, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1111);
				match(K_ON);
				setState(1112);
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
		enterRule(_localctx, 118, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				match(K_SELECT);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1116);
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

				setState(1119);
				result_column();
				setState(1124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1120);
						match(COMMA);
						setState(1121);
						result_column();
						}
						} 
					}
					setState(1126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1127);
					match(K_FROM);
					setState(1137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(1128);
						table_or_subquery();
						setState(1133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1129);
								match(COMMA);
								setState(1130);
								table_or_subquery();
								}
								} 
							}
							setState(1135);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1136);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1141);
					where_expr();
					}
				}

				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1144);
					match(K_GROUP);
					setState(1145);
					match(K_BY);
					setState(1146);
					expr(0);
					setState(1151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1147);
							match(COMMA);
							setState(1148);
							expr(0);
							}
							} 
						}
						setState(1153);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					}
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1154);
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
				setState(1159);
				match(K_VALUES);
				setState(1160);
				list_of_expr();
				setState(1161);
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
		enterRule(_localctx, 120, RULE_list_of_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(OPEN_PAR);
			setState(1166);
			expr(0);
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1167);
				match(COMMA);
				setState(1168);
				expr(0);
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
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
		enterRule(_localctx, 122, RULE_list_of_list_of_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1176);
					match(COMMA);
					setState(1177);
					list_of_expr();
					}
					} 
				}
				setState(1182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 124, RULE_having_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(K_HAVING);
			setState(1184);
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
		enterRule(_localctx, 126, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			table_name();
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1187);
				match(OPEN_PAR);
				setState(1188);
				column_name();
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1189);
					match(COMMA);
					setState(1190);
					column_name();
					}
					}
					setState(1195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1196);
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
		enterRule(_localctx, 128, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1200);
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

				setState(1203);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1204);
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
		enterRule(_localctx, 130, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CURRENT_DATE - 67)) | (1L << (K_CURRENT_TIME - 67)) | (1L << (K_CURRENT_TIMESTAMP - 67)) | (1L << (K_NULL - 67)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (STRING_LITERAL - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) ) {
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
		enterRule(_localctx, 132, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
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
		enterRule(_localctx, 134, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
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
		enterRule(_localctx, 136, RULE_module_argument);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
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
		enterRule(_localctx, 138, RULE_column_alias);
		try {
			setState(1220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				match(STRING_LITERAL);
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
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
		enterRule(_localctx, 140, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
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
		enterRule(_localctx, 142, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DOUBEL) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << OPEN_SQER_BAR) | (1L << CLOSE_SQER_PAR) | (1L << OPEN_BRACKET) | (1L << CLOSE_BRACKET) | (1L << COMMA) | (1L << COLON) | (1L << ASSIGN) | (1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << GT3) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << QUESTION_MARK) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_BREAK) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DO - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_ELSE_IF - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FALSE - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREACH - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VAR - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_JSON - 128)) | (1L << (K_AGGREGATION - 128)) | (1L << (K_STRING - 128)) | (1L << (K_BOOLEAN - 128)) | (1L << (K_NUMBER - 128)) | (1L << (K_PATH - 128)) | (1L << (ONE_CHAR_LETTER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (RANDOM_NAME - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BLOB_LITERAL - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)))) != 0)) {
				{
				{
				setState(1224);
				matchWildcard();
				}
				}
				setState(1229);
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
		enterRule(_localctx, 144, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
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
		enterRule(_localctx, 146, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
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
		enterRule(_localctx, 148, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
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
		enterRule(_localctx, 150, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
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
		enterRule(_localctx, 152, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
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
		enterRule(_localctx, 154, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
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
		enterRule(_localctx, 156, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
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
		enterRule(_localctx, 158, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
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
		enterRule(_localctx, 160, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
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
		enterRule(_localctx, 162, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
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
		enterRule(_localctx, 164, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
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
		enterRule(_localctx, 166, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
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
		enterRule(_localctx, 168, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
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
		enterRule(_localctx, 170, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
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
		enterRule(_localctx, 172, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
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
		enterRule(_localctx, 174, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
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
		enterRule(_localctx, 176, RULE_table_alias);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				use_random_name();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
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
		enterRule(_localctx, 178, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
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
		enterRule(_localctx, 180, RULE_any_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_la = _input.LA(1);
			if ( !(((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (STRING_LITERAL - 187)) | (1L << (IDENTIFIER - 187)) | (1L << (RANDOM_NAME - 187)))) != 0)) ) {
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
		enterRule(_localctx, 182, RULE_create_aggregation_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(K_CREATE);
			setState(1271);
			match(K_AGGREGATION);
			setState(1272);
			match(K_FUNCTION);
			setState(1273);
			use_random_name();
			setState(1274);
			match(OPEN_PAR);
			setState(1275);
			jar_pathe();
			setState(1276);
			match(COMMA);
			setState(1277);
			use_random_name();
			setState(1278);
			match(COMMA);
			setState(1279);
			use_random_name();
			setState(1280);
			match(COMMA);
			setState(1281);
			use_random_name();
			setState(1282);
			match(COMMA);
			setState(1283);
			match(OPEN_SQER_BAR);
			{
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (K_STRING - 182)) | (1L << (K_BOOLEAN - 182)) | (1L << (K_NUMBER - 182)) | (1L << (RANDOM_NAME - 182)))) != 0)) {
				{
				setState(1284);
				parames();
				}
			}

			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1287);
				match(COMMA);
				setState(1288);
				parames();
				}
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1294);
			match(CLOSE_SQER_PAR);
			setState(1295);
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
		enterRule(_localctx, 184, RULE_jar_pathe);
		int _la;
		try {
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1297);
				use_random_name();
				setState(1298);
				match(COLON);
				setState(1299);
				match(DIV);
				setState(1300);
				use_random_name();
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(1302);
					match(DIV);
					setState(1303);
					use_random_name();
					}
					}
					setState(1308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
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
		enterRule(_localctx, 186, RULE_parames);
		try {
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				match(K_STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				match(K_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				match(K_BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315);
				table_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1316);
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
		enterRule(_localctx, 188, RULE_funtion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(1319);
				match(K_FUNCTION);
				}
			}

			setState(1322);
			function_header();
			setState(1323);
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
		enterRule(_localctx, 190, RULE_function_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			use_random_name();
			setState(1326);
			match(OPEN_PAR);
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR || _la==RANDOM_NAME) {
				{
				{
				setState(1327);
				args();
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1328);
						match(COMMA);
						setState(1329);
						args();
						}
						} 
					}
					setState(1334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				}
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1335);
					match(COMMA);
					{
					setState(1336);
					creating_with_assign();
					}
					}
					}
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1344);
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
		enterRule(_localctx, 192, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(OPEN_BRACKET);
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				setState(1349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(1347);
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
					setState(1348);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_RETURN) {
				{
				setState(1354);
				return_rule();
				setState(1355);
				match(SCOL);
				}
			}

			setState(1359);
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
		enterRule(_localctx, 194, RULE_sub_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(OPEN_BRACKET);
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				setState(1364);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACKET:
					{
					setState(1362);
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
					setState(1363);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
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
		enterRule(_localctx, 196, RULE_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DO:
			case K_FOR:
			case K_FOREACH:
			case K_IF:
			case K_SWITCH:
			case K_WHILE:
				{
				setState(1371);
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
				setState(1372);
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
		enterRule(_localctx, 198, RULE_functional_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DO:
				{
				setState(1375);
				do_while();
				}
				break;
			case K_IF:
				{
				setState(1376);
				if_else_rule();
				}
				break;
			case K_SWITCH:
				{
				setState(1377);
				switch_rule();
				}
				break;
			case K_FOR:
			case K_FOREACH:
			case K_WHILE:
				{
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_WHILE:
					{
					setState(1378);
					while_rule();
					}
					break;
				case K_FOREACH:
					{
					setState(1379);
					foreach();
					}
					break;
				case K_FOR:
					{
					setState(1380);
					for_loop_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_BREAK:
				case K_RETURN:
				case K_CONTINUE:
					{
					setState(1384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1383);
						exiting_loops();
						}
						break;
					}
					setState(1386);
					match(SCOL);
					}
					break;
				case OPEN_BRACKET:
					{
					setState(1387);
					match(OPEN_BRACKET);
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
						{
						{
						setState(1388);
						instructions();
						}
						}
						setState(1393);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SCOL || _la==K_BREAK || _la==K_RETURN || _la==K_CONTINUE) {
						{
						setState(1394);
						exiting_loops();
						setState(1395);
						match(SCOL);
						}
					}

					setState(1399);
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
					setState(1400);
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
		enterRule(_localctx, 200, RULE_nonfunctional_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1405);
				call_function();
				}
				break;
			case 2:
				{
				setState(1406);
				print_statment();
				}
				break;
			case 3:
				{
				setState(1407);
				shortcut_statments();
				}
				break;
			case 4:
				{
				setState(1408);
				grnral_creating();
				}
				break;
			case 5:
				{
				setState(1409);
				genral_assign();
				}
				break;
			case 6:
				{
				setState(1410);
				create_aggregation_function();
				}
				break;
			}
			setState(1413);
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
		enterRule(_localctx, 202, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			use_random_name();
			setState(1416);
			match(OPEN_PAR);
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==K_FALSE || _la==K_NOT || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (K_TRUE - 163)) | (1L << (ONE_CHAR_LETTER - 163)) | (1L << (IDENTIFIER - 163)) | (1L << (RANDOM_NAME - 163)) | (1L << (NUMERIC_LITERAL - 163)))) != 0)) {
				{
				{
				setState(1417);
				prameters();
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1418);
					match(COMMA);
					setState(1419);
					prameters();
					}
					}
					setState(1424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1430);
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
		enterRule(_localctx, 204, RULE_callback_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			function_header();
			setState(1433);
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
		enterRule(_localctx, 206, RULE_args);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				creat_without_assign();
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
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
		enterRule(_localctx, 208, RULE_prameters);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1442);
				call_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1444);
				use_random_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1445);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1446);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1447);
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
		enterRule(_localctx, 210, RULE_return_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(1450);
				match(K_RETURN);
				{
				setState(1451);
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
		enterRule(_localctx, 212, RULE_exiting_loops);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
			case K_RETURN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1454);
				return_rule();
				}
				}
				break;
			case K_BREAK:
			case K_CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
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
		enterRule(_localctx, 214, RULE_return_type);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1461);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1462);
				call_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1463);
				match(K_TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1464);
				match(K_FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1465);
				match(K_NULL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1466);
				varible_name();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1467);
				array_base_form_with_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1468);
				varible_from_object();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1469);
				assign_varible();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1470);
				assign_array();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1471);
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
		enterRule(_localctx, 216, RULE_print_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			match(K_PRINT);
			setState(1475);
			match(OPEN_PAR);
			{
			setState(1476);
			indisde_the_print();
			}
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1477);
				match(PLUS);
				setState(1478);
				indisde_the_print();
				}
				}
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1484);
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
		enterRule(_localctx, 218, RULE_indisde_the_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1486);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1487);
				use_random_name();
				}
				break;
			case 3:
				{
				setState(1488);
				call_function();
				}
				break;
			case 4:
				{
				setState(1489);
				varible_from_object();
				}
				break;
			case 5:
				{
				setState(1490);
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
		enterRule(_localctx, 220, RULE_if_else_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			if_rule();
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSE_IF) {
				{
				{
				setState(1494);
				else_if_rule();
				}
				}
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ELSE) {
				{
				setState(1500);
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
		enterRule(_localctx, 222, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(K_IF);
			setState(1504);
			match(OPEN_PAR);
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1505);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1506);
				genral_assign();
				}
				break;
			}
			setState(1509);
			match(CLOSE_PAR);
			setState(1528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1510);
				match(OPEN_BRACKET);
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1511);
					instructions();
					}
					}
					setState(1516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1517);
					return_rule();
					setState(1518);
					match(SCOL);
					}
				}

				setState(1522);
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
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1523);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1524);
					instructions();
					}
					break;
				}
				setState(1527);
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
		enterRule(_localctx, 224, RULE_else_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(K_ELSE_IF);
			setState(1531);
			match(OPEN_PAR);
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1532);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1533);
				genral_assign();
				}
				break;
			}
			setState(1536);
			match(CLOSE_PAR);
			setState(1555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1537);
				match(OPEN_BRACKET);
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1538);
					instructions();
					}
					}
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1544);
					return_rule();
					setState(1545);
					match(SCOL);
					}
				}

				setState(1549);
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
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1550);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1551);
					instructions();
					}
					break;
				}
				setState(1554);
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
		enterRule(_localctx, 226, RULE_else_rulse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			match(K_ELSE);
			setState(1576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(1558);
				match(OPEN_BRACKET);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1559);
					instructions();
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_RETURN) {
					{
					setState(1565);
					return_rule();
					setState(1566);
					match(SCOL);
					}
				}

				setState(1570);
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
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1571);
					return_rule();
					}
					break;
				case 2:
					{
					setState(1572);
					instructions();
					}
					break;
				}
				setState(1575);
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
		enterRule(_localctx, 228, RULE_while_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(K_WHILE);
			setState(1579);
			match(OPEN_PAR);
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1580);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1581);
				genral_assign();
				}
				break;
			}
			setState(1584);
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
		enterRule(_localctx, 230, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(K_DO);
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1587);
					exiting_loops();
					}
					break;
				}
				setState(1590);
				match(SCOL);
				}
				break;
			case 2:
				{
				{
				setState(1591);
				match(OPEN_BRACKET);
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
					{
					{
					setState(1592);
					instructions();
					}
					}
					setState(1597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL || _la==K_BREAK || _la==K_RETURN || _la==K_CONTINUE) {
					{
					setState(1598);
					exiting_loops();
					setState(1599);
					match(SCOL);
					}
				}

				setState(1603);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 3:
				{
				setState(1604);
				match(SCOL);
				}
				break;
			}
			setState(1607);
			while_rule();
			setState(1608);
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
		enterRule(_localctx, 232, RULE_for_loop_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(K_FOR);
			setState(1611);
			match(OPEN_PAR);
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_PLUS || _la==MINUS_MINUS || _la==K_VAR || _la==RANDOM_NAME) {
				{
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1612);
					create_varible_with_assign();
					}
					break;
				case 2:
					{
					setState(1613);
					create_varible_without_assign();
					}
					break;
				case 3:
					{
					setState(1614);
					inside_for_loop();
					}
					break;
				}
				}
			}

			setState(1619);
			match(SCOL);
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==K_FALSE || _la==K_NOT || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (K_TRUE - 163)) | (1L << (ONE_CHAR_LETTER - 163)) | (1L << (IDENTIFIER - 163)) | (1L << (RANDOM_NAME - 163)) | (1L << (NUMERIC_LITERAL - 163)))) != 0)) {
				{
				setState(1620);
				expression(0);
				}
			}

			setState(1623);
			match(SCOL);
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_PLUS || _la==MINUS_MINUS || _la==K_VAR || _la==RANDOM_NAME) {
				{
				setState(1624);
				inside_for_loop();
				}
			}

			setState(1627);
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
		enterRule(_localctx, 234, RULE_inside_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1629);
				assign_varible();
				}
				break;
			case 2:
				{
				setState(1630);
				assign_array();
				}
				break;
			case 3:
				{
				setState(1631);
				create_Array_without_assign();
				}
				break;
			case 4:
				{
				setState(1632);
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
		enterRule(_localctx, 236, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(K_FOREACH);
			setState(1636);
			match(OPEN_PAR);
			setState(1637);
			match(K_VAR);
			setState(1638);
			use_random_name();
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1639);
				match(T__1);
				}
				}
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1645);
			match(COLON);
			setState(1646);
			use_random_name();
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1647);
				match(T__1);
				}
				}
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1653);
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
		enterRule(_localctx, 238, RULE_switch_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(K_SWITCH);
			setState(1656);
			match(OPEN_PAR);
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1657);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1658);
				use_random_name();
				}
				break;
			case 3:
				{
				setState(1659);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(1660);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(1661);
				genral_assign();
				}
				break;
			case 6:
				{
				setState(1662);
				call_function();
				}
				break;
			case 7:
				{
				setState(1663);
				varible_from_object();
				}
				break;
			}
			setState(1666);
			match(CLOSE_PAR);
			setState(1667);
			match(OPEN_BRACKET);
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CASE) {
					{
					{
					setState(1668);
					case_rule();
					}
					}
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1674);
					defult();
					}
				}

				}
				break;
			}
			setState(1679);
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
		enterRule(_localctx, 240, RULE_defult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			match(K_DEFAULT);
			setState(1682);
			match(COLON);
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				{
				setState(1683);
				instructions();
				}
				}
				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_BREAK || _la==K_RETURN) {
				{
				setState(1691);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(1689);
					match(K_BREAK);
					}
					break;
				case SCOL:
				case K_RETURN:
					{
					setState(1690);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1693);
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
		enterRule(_localctx, 242, RULE_case_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(K_CASE);
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1697);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1698);
				any_name();
				}
				break;
			case 3:
				{
				setState(1699);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(1700);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(1701);
				varible_from_object();
				}
				break;
			}
			setState(1704);
			match(COLON);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS_PLUS || _la==MINUS_MINUS || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREACH - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (K_PRINT - 137)) | (1L << (K_SWITCH - 137)) | (1L << (K_VAR - 137)) | (1L << (K_WHILE - 137)) | (1L << (RANDOM_NAME - 137)))) != 0)) {
				{
				{
				setState(1705);
				instructions();
				}
				}
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL || _la==K_BREAK || _la==K_RETURN) {
				{
				setState(1713);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(1711);
					match(K_BREAK);
					}
					break;
				case SCOL:
				case K_RETURN:
					{
					setState(1712);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1715);
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
		enterRule(_localctx, 244, RULE_grnral_creating);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				creat_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1719);
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
		enterRule(_localctx, 246, RULE_creating_with_assign);
		try {
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				create_varible_with_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				create_json_with_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
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
		enterRule(_localctx, 248, RULE_creat_without_assign);
		try {
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1727);
				create_varible_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1728);
				create_Array_without_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1729);
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
		enterRule(_localctx, 250, RULE_genral_assign);
		try {
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				assign_varible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				assign_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
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
		enterRule(_localctx, 252, RULE_varible_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
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
		enterRule(_localctx, 254, RULE_assign_varible);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1745); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(1739);
					use_random_name();
					}
					setState(1741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						setState(1740);
						any_arithmetic_oprator();
						}
					}

					setState(1743);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1747); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1749);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1750);
				factored_select_stmt();
				}
				break;
			case 3:
				{
				setState(1751);
				select_stmt();
				}
				break;
			case 4:
				{
				setState(1752);
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
		enterRule(_localctx, 256, RULE_create_varible_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(K_VAR);
			setState(1756);
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
		enterRule(_localctx, 258, RULE_create_varible_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(K_VAR);
			setState(1759);
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
		enterRule(_localctx, 260, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
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
		enterRule(_localctx, 262, RULE_assign_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1763);
					array_base_form_with_index();
					setState(1765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						setState(1764);
						any_arithmetic_oprator();
						}
					}

					setState(1767);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1771); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1773);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1774);
				factored_select_stmt();
				}
				break;
			case 3:
				{
				setState(1775);
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
		enterRule(_localctx, 264, RULE_create_array_form);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1778);
				create_Array_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1779);
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
		enterRule(_localctx, 266, RULE_create_Array_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(K_VAR);
			setState(1783);
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
		enterRule(_localctx, 268, RULE_create_Array_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(K_VAR);
			setState(1786);
			array_base_form_without_index();
			{
			setState(1787);
			match(ASSIGN);
			setState(1788);
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
		enterRule(_localctx, 270, RULE_array_base_form_without_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			array_name();
			setState(1792); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1791);
				match(T__1);
				}
				}
				setState(1794); 
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
		enterRule(_localctx, 272, RULE_array_base_form_with_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			array_name();
			setState(1804); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1797);
					match(OPEN_SQER_BAR);
					setState(1801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1798);
						expression(0);
						}
						break;
					case 2:
						{
						setState(1799);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(1800);
						varible_name();
						}
						break;
					}
					setState(1803);
					match(CLOSE_SQER_PAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1806); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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
		enterRule(_localctx, 274, RULE_array_identifier_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(IDENTIFIER);
			setState(1813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1809);
					match(COMMA);
					setState(1810);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1815);
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
		enterRule(_localctx, 276, RULE_array_boolean_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			expression(0);
			{
			setState(1817);
			match(COMMA);
			setState(1818);
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
		enterRule(_localctx, 278, RULE_array_integer_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1820);
			expression(0);
			}
			setState(1825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1821);
					match(COMMA);
					{
					setState(1822);
					expression(0);
					}
					}
					} 
				}
				setState(1827);
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
		enterRule(_localctx, 280, RULE_array_charecter_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(ONE_CHAR_LETTER);
			setState(1833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					match(COMMA);
					setState(1830);
					match(ONE_CHAR_LETTER);
					}
					} 
				}
				setState(1835);
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
		enterRule(_localctx, 282, RULE_array_objects_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			json_statment();
			setState(1841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1837);
					match(COMMA);
					setState(1838);
					json_statment();
					}
					} 
				}
				setState(1843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 284, RULE_array_objects_form2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			match(OPEN_SQER_BAR);
			setState(1845);
			array_objects_form();
			setState(1846);
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
		enterRule(_localctx, 286, RULE_array_varible_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1848);
				varible_name();
				}
				break;
			case 2:
				{
				setState(1849);
				varible_from_object();
				}
				break;
			}
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1852);
					match(COMMA);
					setState(1855);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
					case 1:
						{
						setState(1853);
						varible_name();
						}
						break;
					case 2:
						{
						setState(1854);
						varible_from_object();
						}
						break;
					}
					}
					} 
				}
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
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
		enterRule(_localctx, 288, RULE_array_anyType_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1862);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1863);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1864);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1865);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1866);
				array_varible_form();
				}
				break;
			case 6:
				{
				setState(1867);
				array_boolean_form();
				}
				break;
			}
			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1870);
				match(COMMA);
				setState(1878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1871);
					array_identifier_form();
					}
					break;
				case 2:
					{
					setState(1872);
					array_integer_form();
					}
					break;
				case 3:
					{
					setState(1873);
					array_charecter_form();
					}
					break;
				case 4:
					{
					setState(1874);
					array_objects_form();
					}
					break;
				case 5:
					{
					setState(1875);
					array_arrayes_form();
					}
					break;
				case 6:
					{
					setState(1876);
					array_varible_form();
					}
					break;
				case 7:
					{
					setState(1877);
					array_boolean_form();
					}
					break;
				}
				}
				}
				setState(1884);
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
		enterRule(_localctx, 290, RULE_array_arrayes_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			left_side_array();
			setState(1890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1886);
					match(COMMA);
					{
					setState(1887);
					left_side_array();
					}
					}
					} 
				}
				setState(1892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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
		enterRule(_localctx, 292, RULE_value_left_side);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1893);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1894);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1895);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1896);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1897);
				array_objects_form2();
				}
				break;
			case 6:
				{
				setState(1898);
				array_arrayes_form();
				}
				break;
			case 7:
				{
				setState(1899);
				array_boolean_form();
				}
				break;
			case 8:
				{
				setState(1900);
				varible_from_object();
				}
				break;
			case 9:
				{
				setState(1901);
				array_anyType_form();
				}
				break;
			case 10:
				{
				setState(1902);
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
		enterRule(_localctx, 294, RULE_left_side_array);
		int _la;
		try {
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1905);
				match(OPEN_BRACKET);
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << OPEN_SQER_BAR) | (1L << OPEN_BRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FALSE - 91)) | (1L << (K_NOT - 91)) | (1L << (K_SELECT - 91)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (K_TRUE - 163)) | (1L << (K_VALUES - 163)) | (1L << (ONE_CHAR_LETTER - 163)) | (1L << (IDENTIFIER - 163)) | (1L << (RANDOM_NAME - 163)) | (1L << (NUMERIC_LITERAL - 163)))) != 0)) {
					{
					setState(1906);
					value_left_side();
					}
				}

				setState(1909);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				factored_select_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1911);
				select_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1912);
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
		enterRule(_localctx, 296, RULE_json_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
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
		enterRule(_localctx, 298, RULE_assign_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			json_name();
			setState(1918);
			match(ASSIGN);
			setState(1921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM_NAME:
				{
				setState(1919);
				json_name();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(1920);
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
		enterRule(_localctx, 300, RULE_create_json_form);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				create_json_object_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
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
		enterRule(_localctx, 302, RULE_create_json_object_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(K_VAR);
			setState(1928);
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
		enterRule(_localctx, 304, RULE_create_json_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(K_VAR);
			setState(1931);
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
		enterRule(_localctx, 306, RULE_inside_json_statmnet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			use_random_name();
			setState(1934);
			match(COLON);
			setState(1935);
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
		enterRule(_localctx, 308, RULE_json_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(OPEN_BRACKET);
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				{
				setState(1938);
				inside_json_statmnet();
				}
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1939);
					match(COMMA);
					setState(1940);
					inside_json_statmnet();
					}
					}
					setState(1945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1948);
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
		enterRule(_localctx, 310, RULE_value_json_statmnet);
		try {
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1951);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1952);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1953);
				match(K_NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1954);
				varible_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1955);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1956);
				json_statment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1957);
				varible_from_object();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1958);
				call_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1959);
				array_base_form_with_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1960);
				array_objects_form2();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1961);
				match(OPEN_SQER_BAR);
				setState(1962);
				value_left_side();
				setState(1963);
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
		enterRule(_localctx, 312, RULE_varible_from_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			json_name();
			setState(1970); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1968);
					match(DOT);
					setState(1969);
					varible_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1972); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		enterRule(_localctx, 314, RULE_shortcut_statments);
		try {
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				match(MINUS_MINUS);
				setState(1975);
				use_random_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				match(PLUS_PLUS);
				setState(1977);
				use_random_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1978);
				use_random_name();
				setState(1979);
				match(MINUS_MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1981);
				use_random_name();
				setState(1982);
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
		enterRule(_localctx, 316, RULE_any_arithmetic_oprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
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
		int _startState = 318;
		enterRecursionRule(_localctx, 318, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FALSE:
			case K_TRUE:
			case ONE_CHAR_LETTER:
			case IDENTIFIER:
			case RANDOM_NAME:
			case NUMERIC_LITERAL:
				{
				setState(1989);
				intral_expression_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1991); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1990);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1993); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1995);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1996);
					genral_assign();
					}
					break;
				}
				setState(2000); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1999);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2002); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PLUS_PLUS:
				{
				setState(2004);
				match(PLUS_PLUS);
				setState(2005);
				expression(13);
				}
				break;
			case MINUS_MINUS:
				{
				setState(2006);
				match(MINUS_MINUS);
				setState(2007);
				expression(12);
				}
				break;
			case PLUS:
			case MINUS:
			case TILDE:
			case K_NOT:
				{
				setState(2008);
				unary_operator();
				setState(2009);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2050);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2013);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2014);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2015);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2016);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2017);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2018);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2019);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2020);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << GT3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2021);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2022);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2023);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2024);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2025);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2026);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NOT_EQ1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2027);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2028);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2029);
						match(AMP);
						setState(2030);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2031);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2032);
						match(PIPE);
						setState(2033);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2034);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2035);
						match(AMP2);
						setState(2036);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2037);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2038);
						match(PIPE2);
						setState(2039);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2040);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2041);
						match(QUESTION_MARK);
						setState(2042);
						expression(0);
						setState(2043);
						match(COLON);
						setState(2044);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2046);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2047);
						match(PLUS_PLUS);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2048);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2049);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(2054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
		enterRule(_localctx, 320, RULE_intral_expression_value);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2055);
				match(K_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2056);
				match(K_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2057);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2058);
				varible_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2059);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2060);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2061);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2062);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2063);
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
		enterRule(_localctx, 322, RULE_use_random_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
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
		case 38:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 159:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c5\u0817\4\2\t"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\3\2\3\2\3\2\3"+
		"\2\7\2\u014b\n\2\f\2\16\2\u014e\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u0156"+
		"\n\4\f\4\16\4\u0159\13\4\3\4\3\4\6\4\u015d\n\4\r\4\16\4\u015e\3\4\7\4"+
		"\u0162\n\4\f\4\16\4\u0165\13\4\3\4\7\4\u0168\n\4\f\4\16\4\u016b\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0176\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6\u017f\n\6\r\6\16\6\u0180\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u018d\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0194\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\5\n\u019c\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u01ad\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01b6"+
		"\n\r\f\r\16\r\u01b9\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01c2\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u01d0\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u01d6\n\21\3\21\3\21\3\21\5\21\u01db\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01e5\n\22\f\22\16\22\u01e8"+
		"\13\22\5\22\u01ea\n\22\3\22\3\22\3\22\5\22\u01ef\n\22\5\22\u01f1\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u01f8\n\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u01ff\n\23\f\23\16\23\u0202\13\23\3\23\3\23\5\23\u0206\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u020d\n\23\f\23\16\23\u0210\13\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0218\n\23\f\23\16\23\u021b\13\23\3\23\3\23\7\23"+
		"\u021f\n\23\f\23\16\23\u0222\13\23\3\23\3\23\3\23\5\23\u0227\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u022f\n\24\f\24\16\24\u0232\13\24\5\24"+
		"\u0234\n\24\3\24\3\24\3\24\5\24\u0239\n\24\5\24\u023b\n\24\3\25\3\25\3"+
		"\25\3\26\3\26\5\26\u0242\n\26\3\26\3\26\3\26\7\26\u0247\n\26\f\26\16\26"+
		"\u024a\13\26\3\26\3\26\3\26\3\26\7\26\u0250\n\26\f\26\16\26\u0253\13\26"+
		"\3\26\5\26\u0256\n\26\5\26\u0258\n\26\3\26\5\26\u025b\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0262\n\26\f\26\16\26\u0265\13\26\3\26\5\26\u0268\n"+
		"\26\5\26\u026a\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0271\n\26\f\26\16\26"+
		"\u0274\13\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u027c\n\26\f\26\16\26"+
		"\u027f\13\26\3\26\3\26\7\26\u0283\n\26\f\26\16\26\u0286\13\26\5\26\u0288"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0293\n\30\f\30"+
		"\16\30\u0296\13\30\3\30\3\30\5\30\u029a\n\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u02a3\n\32\f\32\16\32\u02a6\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02b1\n\33\3\34\3\34\3\34\3\34\5\34\u02b7"+
		"\n\34\3\35\3\35\5\35\u02bb\n\35\3\36\3\36\5\36\u02bf\n\36\3\36\3\36\3"+
		"\36\5\36\u02c4\n\36\3\37\3\37\5\37\u02c8\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u02d3\n\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\""+
		"\5\"\u02df\n\"\3\"\5\"\u02e2\n\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u02f7\n&\3&\3&\6&\u02fb\n&\r&\16&\u02fc\5&\u02ff"+
		"\n&\3\'\3\'\5\'\u0303\n\'\3(\3(\3(\3(\3(\5(\u030a\n(\3(\3(\3(\5(\u030f"+
		"\n(\3(\3(\3(\3(\3(\3(\3(\5(\u0318\n(\3(\3(\3(\7(\u031d\n(\f(\16(\u0320"+
		"\13(\3(\5(\u0323\n(\3(\3(\3(\3(\3(\3(\5(\u032b\n(\3(\3(\3(\3(\7(\u0331"+
		"\n(\f(\16(\u0334\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u0347\n)\3)\3)\5)\u034b\n)\3*\3*\3*\3*\5*\u0351\n*\3*\3*\3*\3*\3"+
		"*\7*\u0358\n*\f*\16*\u035b\13*\3*\3*\5*\u035f\n*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u036b\n*\3*\3*\5*\u036f\n*\7*\u0371\n*\f*\16*\u0374\13*\3"+
		"*\5*\u0377\n*\3*\3*\3*\3*\3*\5*\u037e\n*\3*\5*\u0381\n*\5*\u0383\n*\3"+
		"+\3+\3,\3,\3,\5,\u038a\n,\3,\5,\u038d\n,\3-\3-\5-\u0391\n-\3-\3-\3-\3"+
		"-\3-\5-\u0398\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u03a5\n/\f/\16/\u03a8"+
		"\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03b2\n\60\f\60\16\60\u03b5"+
		"\13\60\3\60\3\60\3\60\3\61\3\61\5\61\u03bc\n\61\3\61\5\61\u03bf\n\61\3"+
		"\61\3\61\3\61\3\61\7\61\u03c5\n\61\f\61\16\61\u03c8\13\61\3\61\3\61\3"+
		"\62\3\62\5\62\u03ce\n\62\3\62\3\62\3\62\3\62\7\62\u03d4\n\62\f\62\16\62"+
		"\u03d7\13\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\5\64\u03e0\n\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u03e8\n\64\3\65\3\65\5\65\u03ec\n\65\3\66"+
		"\3\66\3\66\5\66\u03f1\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u03f8\n\67\f"+
		"\67\16\67\u03fb\13\67\3\67\3\67\5\67\u03ff\n\67\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\38\38\38\58\u040d\n8\38\58\u0410\n8\58\u0412\n8\39\39"+
		"\39\59\u0417\n9\39\39\59\u041b\n9\39\59\u041e\n9\39\39\39\39\39\59\u0425"+
		"\n9\39\39\39\39\79\u042b\n9\f9\169\u042e\139\39\59\u0431\n9\39\39\59\u0435"+
		"\n9\39\59\u0438\n9\39\39\39\39\59\u043e\n9\39\59\u0441\n9\59\u0443\n9"+
		"\3:\3:\3:\3:\3:\7:\u044a\n:\f:\16:\u044d\13:\3;\3;\3;\5;\u0452\n;\3;\5"+
		";\u0455\n;\3;\5;\u0458\n;\3<\3<\5<\u045c\n<\3=\3=\5=\u0460\n=\3=\3=\3"+
		"=\7=\u0465\n=\f=\16=\u0468\13=\3=\3=\3=\3=\7=\u046e\n=\f=\16=\u0471\13"+
		"=\3=\5=\u0474\n=\5=\u0476\n=\3=\5=\u0479\n=\3=\3=\3=\3=\3=\7=\u0480\n"+
		"=\f=\16=\u0483\13=\3=\5=\u0486\n=\5=\u0488\n=\3=\3=\3=\3=\5=\u048e\n="+
		"\3>\3>\3>\3>\7>\u0494\n>\f>\16>\u0497\13>\3>\3>\3?\3?\7?\u049d\n?\f?\16"+
		"?\u04a0\13?\3@\3@\3@\3A\3A\3A\3A\3A\7A\u04aa\nA\fA\16A\u04ad\13A\3A\3"+
		"A\5A\u04b1\nA\3B\5B\u04b4\nB\3B\3B\5B\u04b8\nB\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\5F\u04c2\nF\3G\3G\3G\5G\u04c7\nG\3H\3H\3I\7I\u04cc\nI\fI\16I\u04cf\13"+
		"I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3"+
		"U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\5Z\u04f3\nZ\3[\3[\3\\\3\\\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0508\n]\3]\3]\7]\u050c\n]\f]"+
		"\16]\u050f\13]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\7^\u051b\n^\f^\16^\u051e"+
		"\13^\3^\5^\u0521\n^\3_\3_\3_\3_\3_\5_\u0528\n_\3`\5`\u052b\n`\3`\3`\3"+
		"`\3a\3a\3a\3a\3a\7a\u0535\na\fa\16a\u0538\13a\3a\3a\7a\u053c\na\fa\16"+
		"a\u053f\13a\5a\u0541\na\3a\3a\3b\3b\3b\7b\u0548\nb\fb\16b\u054b\13b\3"+
		"b\3b\3b\5b\u0550\nb\3b\3b\3c\3c\3c\7c\u0557\nc\fc\16c\u055a\13c\3c\3c"+
		"\3d\3d\5d\u0560\nd\3e\3e\3e\3e\3e\3e\5e\u0568\ne\3e\5e\u056b\ne\3e\3e"+
		"\3e\7e\u0570\ne\fe\16e\u0573\13e\3e\3e\3e\5e\u0578\ne\3e\3e\5e\u057c\n"+
		"e\5e\u057e\ne\3f\3f\3f\3f\3f\3f\5f\u0586\nf\3f\3f\3g\3g\3g\3g\3g\7g\u058f"+
		"\ng\fg\16g\u0592\13g\7g\u0594\ng\fg\16g\u0597\13g\3g\3g\3h\3h\3h\3i\3"+
		"i\5i\u05a0\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u05ab\nj\3k\3k\5k\u05af\n"+
		"k\3l\3l\5l\u05b3\nl\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u05c3"+
		"\nm\3n\3n\3n\3n\3n\7n\u05ca\nn\fn\16n\u05cd\13n\3n\3n\3o\3o\3o\3o\3o\5"+
		"o\u05d6\no\3p\3p\7p\u05da\np\fp\16p\u05dd\13p\3p\5p\u05e0\np\3q\3q\3q"+
		"\3q\5q\u05e6\nq\3q\3q\3q\7q\u05eb\nq\fq\16q\u05ee\13q\3q\3q\3q\5q\u05f3"+
		"\nq\3q\3q\3q\5q\u05f8\nq\3q\5q\u05fb\nq\3r\3r\3r\3r\5r\u0601\nr\3r\3r"+
		"\3r\7r\u0606\nr\fr\16r\u0609\13r\3r\3r\3r\5r\u060e\nr\3r\3r\3r\5r\u0613"+
		"\nr\3r\5r\u0616\nr\3s\3s\3s\7s\u061b\ns\fs\16s\u061e\13s\3s\3s\3s\5s\u0623"+
		"\ns\3s\3s\3s\5s\u0628\ns\3s\5s\u062b\ns\3t\3t\3t\3t\5t\u0631\nt\3t\3t"+
		"\3u\3u\5u\u0637\nu\3u\3u\3u\7u\u063c\nu\fu\16u\u063f\13u\3u\3u\3u\5u\u0644"+
		"\nu\3u\3u\5u\u0648\nu\3u\3u\3u\3v\3v\3v\3v\3v\5v\u0652\nv\5v\u0654\nv"+
		"\3v\3v\5v\u0658\nv\3v\3v\5v\u065c\nv\3v\3v\3w\3w\3w\3w\5w\u0664\nw\3x"+
		"\3x\3x\3x\3x\7x\u066b\nx\fx\16x\u066e\13x\3x\3x\3x\7x\u0673\nx\fx\16x"+
		"\u0676\13x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0683\ny\3y\3y\3y\7y\u0688"+
		"\ny\fy\16y\u068b\13y\3y\5y\u068e\ny\5y\u0690\ny\3y\3y\3z\3z\3z\7z\u0697"+
		"\nz\fz\16z\u069a\13z\3z\3z\5z\u069e\nz\3z\5z\u06a1\nz\3{\3{\3{\3{\3{\3"+
		"{\5{\u06a9\n{\3{\3{\7{\u06ad\n{\f{\16{\u06b0\13{\3{\3{\5{\u06b4\n{\3{"+
		"\5{\u06b7\n{\3|\3|\5|\u06bb\n|\3}\3}\3}\5}\u06c0\n}\3~\3~\3~\5~\u06c5"+
		"\n~\3\177\3\177\3\177\5\177\u06ca\n\177\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\5\u0081\u06d0\n\u0081\3\u0081\3\u0081\6\u0081\u06d4\n\u0081\r\u0081\16"+
		"\u0081\u06d5\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06dc\n\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\5\u0085\u06e8\n\u0085\3\u0085\3\u0085\6\u0085\u06ec\n\u0085\r\u0085\16"+
		"\u0085\u06ed\3\u0085\3\u0085\3\u0085\5\u0085\u06f3\n\u0085\3\u0086\3\u0086"+
		"\5\u0086\u06f7\n\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\6\u0089\u0703\n\u0089\r\u0089\16\u0089"+
		"\u0704\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u070c\n\u008a\3"+
		"\u008a\6\u008a\u070f\n\u008a\r\u008a\16\u008a\u0710\3\u008b\3\u008b\3"+
		"\u008b\7\u008b\u0716\n\u008b\f\u008b\16\u008b\u0719\13\u008b\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u0722\n\u008d\f"+
		"\u008d\16\u008d\u0725\13\u008d\3\u008e\3\u008e\3\u008e\7\u008e\u072a\n"+
		"\u008e\f\u008e\16\u008e\u072d\13\u008e\3\u008f\3\u008f\3\u008f\7\u008f"+
		"\u0732\n\u008f\f\u008f\16\u008f\u0735\13\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\5\u0091\u073d\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0742\n\u0091\7\u0091\u0744\n\u0091\f\u0091\16\u0091\u0747\13"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u074f\n"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u0759\n\u0092\7\u0092\u075b\n\u0092\f\u0092\16\u0092\u075e\13"+
		"\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u0763\n\u0093\f\u0093\16\u0093"+
		"\u0766\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0772\n\u0094\3\u0095\3\u0095\5\u0095"+
		"\u0776\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u077c\n\u0095\3"+
		"\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0784\n\u0097\3"+
		"\u0098\3\u0098\5\u0098\u0788\n\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3"+
		"\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\7\u009c\u0798\n\u009c\f\u009c\16\u009c\u079b\13\u009c\5\u009c"+
		"\u079d\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\5\u009d\u07b0\n\u009d\3\u009e\3\u009e\3\u009e\6\u009e\u07b5\n"+
		"\u009e\r\u009e\16\u009e\u07b6\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u07c3\n\u009f\3\u00a0"+
		"\3\u00a0\3\u00a1\3\u00a1\3\u00a1\6\u00a1\u07ca\n\u00a1\r\u00a1\16\u00a1"+
		"\u07cb\3\u00a1\3\u00a1\5\u00a1\u07d0\n\u00a1\3\u00a1\6\u00a1\u07d3\n\u00a1"+
		"\r\u00a1\16\u00a1\u07d4\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u07de\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0805\n\u00a1\f\u00a1"+
		"\16\u00a1\u0808\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0813\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\2\4N\u0140\u00a4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\2\22\4\2"+
		"\16\16\u0082\u0082\4\2--PP\4\2\62\62MM\4\2\21\21\27\30\3\2\23\24\5\2\31"+
		"\32\34\34\36\36\3\2\37\"\4\2LL\u00a9\u00a9\7\2EG\u0080\u0080\u00bd\u00bd"+
		"\u00c0\u00c0\u00c2\u00c2\4\2\23\25~~\16\2)8:MOSU\\__a\u0083\u0085\u008a"+
		"\u008c\u0092\u0094\u009c\u009f\u00a4\u00a6\u00ac\u00ae\u00b3\3\2\u00bd"+
		"\u00bf\4\299\u00b5\u00b5\4\2\21\24\27\30\3\2\31\33\3\2#$\2\u0910\2\u014c"+
		"\3\2\2\2\4\u0151\3\2\2\2\6\u0157\3\2\2\2\b\u0175\3\2\2\2\n\u0177\3\2\2"+
		"\2\f\u0184\3\2\2\2\16\u0187\3\2\2\2\20\u0195\3\2\2\2\22\u0199\3\2\2\2"+
		"\24\u019f\3\2\2\2\26\u01a4\3\2\2\2\30\u01a7\3\2\2\2\32\u01c3\3\2\2\2\34"+
		"\u01c7\3\2\2\2\36\u01cb\3\2\2\2 \u01d1\3\2\2\2\"\u01de\3\2\2\2$\u01f2"+
		"\3\2\2\2&\u0228\3\2\2\2(\u023c\3\2\2\2*\u0287\3\2\2\2,\u0289\3\2\2\2."+
		"\u028c\3\2\2\2\60\u029b\3\2\2\2\62\u029f\3\2\2\2\64\u02a7\3\2\2\2\66\u02b6"+
		"\3\2\2\28\u02b8\3\2\2\2:\u02bc\3\2\2\2<\u02c7\3\2\2\2>\u02d4\3\2\2\2@"+
		"\u02d9\3\2\2\2B\u02db\3\2\2\2D\u02e3\3\2\2\2F\u02e5\3\2\2\2H\u02e8\3\2"+
		"\2\2J\u02ea\3\2\2\2L\u0302\3\2\2\2N\u032a\3\2\2\2P\u034a\3\2\2\2R\u034c"+
		"\3\2\2\2T\u0384\3\2\2\2V\u0386\3\2\2\2X\u0390\3\2\2\2Z\u0399\3\2\2\2\\"+
		"\u039e\3\2\2\2^\u03ab\3\2\2\2`\u03b9\3\2\2\2b\u03cb\3\2\2\2d\u03da\3\2"+
		"\2\2f\u03df\3\2\2\2h\u03e9\3\2\2\2j\u03f0\3\2\2\2l\u03f2\3\2\2\2n\u0411"+
		"\3\2\2\2p\u0442\3\2\2\2r\u0444\3\2\2\2t\u0457\3\2\2\2v\u045b\3\2\2\2x"+
		"\u048d\3\2\2\2z\u048f\3\2\2\2|\u049e\3\2\2\2~\u04a1\3\2\2\2\u0080\u04a4"+
		"\3\2\2\2\u0082\u04b7\3\2\2\2\u0084\u04b9\3\2\2\2\u0086\u04bb\3\2\2\2\u0088"+
		"\u04bd\3\2\2\2\u008a\u04c1\3\2\2\2\u008c\u04c6\3\2\2\2\u008e\u04c8\3\2"+
		"\2\2\u0090\u04cd\3\2\2\2\u0092\u04d0\3\2\2\2\u0094\u04d2\3\2\2\2\u0096"+
		"\u04d4\3\2\2\2\u0098\u04d6\3\2\2\2\u009a\u04d8\3\2\2\2\u009c\u04da\3\2"+
		"\2\2\u009e\u04dc\3\2\2\2\u00a0\u04de\3\2\2\2\u00a2\u04e0\3\2\2\2\u00a4"+
		"\u04e2\3\2\2\2\u00a6\u04e4\3\2\2\2\u00a8\u04e6\3\2\2\2\u00aa\u04e8\3\2"+
		"\2\2\u00ac\u04ea\3\2\2\2\u00ae\u04ec\3\2\2\2\u00b0\u04ee\3\2\2\2\u00b2"+
		"\u04f2\3\2\2\2\u00b4\u04f4\3\2\2\2\u00b6\u04f6\3\2\2\2\u00b8\u04f8\3\2"+
		"\2\2\u00ba\u0520\3\2\2\2\u00bc\u0527\3\2\2\2\u00be\u052a\3\2\2\2\u00c0"+
		"\u052f\3\2\2\2\u00c2\u0544\3\2\2\2\u00c4\u0553\3\2\2\2\u00c6\u055f\3\2"+
		"\2\2\u00c8\u057d\3\2\2\2\u00ca\u0585\3\2\2\2\u00cc\u0589\3\2\2\2\u00ce"+
		"\u059a\3\2\2\2\u00d0\u059f\3\2\2\2\u00d2\u05aa\3\2\2\2\u00d4\u05ae\3\2"+
		"\2\2\u00d6\u05b2\3\2\2\2\u00d8\u05c2\3\2\2\2\u00da\u05c4\3\2\2\2\u00dc"+
		"\u05d5\3\2\2\2\u00de\u05d7\3\2\2\2\u00e0\u05e1\3\2\2\2\u00e2\u05fc\3\2"+
		"\2\2\u00e4\u0617\3\2\2\2\u00e6\u062c\3\2\2\2\u00e8\u0634\3\2\2\2\u00ea"+
		"\u064c\3\2\2\2\u00ec\u0663\3\2\2\2\u00ee\u0665\3\2\2\2\u00f0\u0679\3\2"+
		"\2\2\u00f2\u0693\3\2\2\2\u00f4\u06a2\3\2\2\2\u00f6\u06ba\3\2\2\2\u00f8"+
		"\u06bf\3\2\2\2\u00fa\u06c4\3\2\2\2\u00fc\u06c9\3\2\2\2\u00fe\u06cb\3\2"+
		"\2\2\u0100\u06d3\3\2\2\2\u0102\u06dd\3\2\2\2\u0104\u06e0\3\2\2\2\u0106"+
		"\u06e3\3\2\2\2\u0108\u06eb\3\2\2\2\u010a\u06f6\3\2\2\2\u010c\u06f8\3\2"+
		"\2\2\u010e\u06fb\3\2\2\2\u0110\u0700\3\2\2\2\u0112\u0706\3\2\2\2\u0114"+
		"\u0712\3\2\2\2\u0116\u071a\3\2\2\2\u0118\u071e\3\2\2\2\u011a\u0726\3\2"+
		"\2\2\u011c\u072e\3\2\2\2\u011e\u0736\3\2\2\2\u0120\u073c\3\2\2\2\u0122"+
		"\u074e\3\2\2\2\u0124\u075f\3\2\2\2\u0126\u0771\3\2\2\2\u0128\u077b\3\2"+
		"\2\2\u012a\u077d\3\2\2\2\u012c\u077f\3\2\2\2\u012e\u0787\3\2\2\2\u0130"+
		"\u0789\3\2\2\2\u0132\u078c\3\2\2\2\u0134\u078f\3\2\2\2\u0136\u0793\3\2"+
		"\2\2\u0138\u07af\3\2\2\2\u013a\u07b1\3\2\2\2\u013c\u07c2\3\2\2\2\u013e"+
		"\u07c4\3\2\2\2\u0140\u07dd\3\2\2\2\u0142\u0812\3\2\2\2\u0144\u0814\3\2"+
		"\2\2\u0146\u014b\5\u00b8]\2\u0147\u014b\5\6\4\2\u0148\u014b\5\4\3\2\u0149"+
		"\u014b\5\u00be`\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\2"+
		"\2\3\u0150\3\3\2\2\2\u0151\u0152\7\u00c5\2\2\u0152\u0153\b\3\1\2\u0153"+
		"\5\3\2\2\2\u0154\u0156\7\6\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u0163\5\b\5\2\u015b\u015d\7\6\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0162\5\b\5\2\u0161\u015c\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0169\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0166\u0168\7\6\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\7\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016c\u0176\5\u00b8]\2\u016d\u0176\5\16\b\2\u016e\u0176\5\30\r\2\u016f"+
		"\u0176\5\36\20\2\u0170\u0176\5 \21\2\u0171\u0176\5\"\22\2\u0172\u0176"+
		"\5$\23\2\u0173\u0176\5.\30\2\u0174\u0176\5\n\6\2\u0175\u016c\3\2\2\2\u0175"+
		"\u016d\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0170\3\2"+
		"\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\t\3\2\2\2\u0177\u0178\7C\2\2\u0178\u0179\7\u009e"+
		"\2\2\u0179\u017a\5\u0144\u00a3\2\u017a\u017b\7\b\2\2\u017b\u017e\5\f\7"+
		"\2\u017c\u017d\7\16\2\2\u017d\u017f\5\f\7\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\7\t\2\2\u0183\13\3\2\2\2\u0184\u0185\5\u0144\u00a3\2"+
		"\u0185\u0186\5\66\34\2\u0186\r\3\2\2\2\u0187\u0188\7.\2\2\u0188\u018c"+
		"\7\u009f\2\2\u0189\u018a\5\u0096L\2\u018a\u018b\7\7\2\2\u018b\u018d\3"+
		"\2\2\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0193\5\u0098M\2\u018f\u0194\5\20\t\2\u0190\u0194\5\26\f\2\u0191\u0194"+
		"\5\24\13\2\u0192\u0194\5\22\n\2\u0193\u018f\3\2\2\2\u0193\u0190\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\17\3\2\2\2\u0195\u0196"+
		"\7\u0094\2\2\u0196\u0197\7\u00a3\2\2\u0197\u0198\5\u009eP\2\u0198\21\3"+
		"\2\2\2\u0199\u019b\7+\2\2\u019a\u019c\7?\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\62\32\2\u019e\23\3\2"+
		"\2\2\u019f\u01a0\7+\2\2\u01a0\u01a1\7B\2\2\u01a1\u01a2\5\u0144\u00a3\2"+
		"\u01a2\u01a3\5X-\2\u01a3\25\3\2\2\2\u01a4\u01a5\7+\2\2\u01a5\u01a6\5X"+
		"-\2\u01a6\27\3\2\2\2\u01a7\u01a8\7C\2\2\u01a8\u01ac\7\u009f\2\2\u01a9"+
		"\u01aa\7g\2\2\u01aa\u01ab\7~\2\2\u01ab\u01ad\7Z\2\2\u01ac\u01a9\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01c1\5\u009aN\2\u01af"+
		"\u01b0\7\b\2\2\u01b0\u01b7\5\62\32\2\u01b1\u01b2\7\16\2\2\u01b2\u01b6"+
		"\5X-\2\u01b3\u01b4\7\16\2\2\u01b4\u01b6\5\62\32\2\u01b5\u01b1\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7\t\2\2\u01bb"+
		"\u01bc\5\32\16\2\u01bc\u01bd\7\16\2\2\u01bd\u01be\5\34\17\2\u01be\u01c2"+
		"\3\2\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c2\5&\24\2\u01c1\u01af\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c2\31\3\2\2\2\u01c3\u01c4\7\u009e\2\2\u01c4\u01c5"+
		"\7\20\2\2\u01c5\u01c6\7\u00be\2\2\u01c6\33\3\2\2\2\u01c7\u01c8\7\u00bb"+
		"\2\2\u01c8\u01c9\7\20\2\2\u01c9\u01ca\7\u00be\2\2\u01ca\35\3\2\2\2\u01cb"+
		"\u01cc\7L\2\2\u01cc\u01cd\7b\2\2\u01cd\u01cf\5f\64\2\u01ce\u01d0\5,\27"+
		"\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\37\3\2\2\2\u01d1\u01d2"+
		"\7Q\2\2\u01d2\u01d5\7\u009f\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d6\7Z\2\2"+
		"\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d8"+
		"\5\u0096L\2\u01d8\u01d9\7\7\2\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2"+
		"\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\5\u009aN\2\u01dd"+
		"!\3\2\2\2\u01de\u01e9\5x=\2\u01df\u01e0\7\u0086\2\2\u01e0\u01e1\78\2\2"+
		"\u01e1\u01e6\5h\65\2\u01e2\u01e3\7\16\2\2\u01e3\u01e5\5h\65\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01df\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01f0\3\2\2\2\u01eb\u01ee\5(\25\2\u01ec\u01ed\t\2\2\2\u01ed"+
		"\u01ef\5N(\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2"+
		"\2\u01f0\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1#\3\2\2\2\u01f2\u01f3"+
		"\7o\2\2\u01f3\u01f7\7r\2\2\u01f4\u01f5\5\u0096L\2\u01f5\u01f6\7\7\2\2"+
		"\u01f6\u01f8\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u0205\5\u009aN\2\u01fa\u01fb\7\b\2\2\u01fb\u0200\5\u00a0"+
		"Q\2\u01fc\u01fd\7\16\2\2\u01fd\u01ff\5\u00a0Q\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\t\2\2\u0204\u0206\3\2\2\2\u0205"+
		"\u01fa\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0226\3\2\2\2\u0207\u0208\7\u00ac"+
		"\2\2\u0208\u0209\7\b\2\2\u0209\u020e\5N(\2\u020a\u020b\7\16\2\2\u020b"+
		"\u020d\5N(\2\u020c\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2"+
		"\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0220"+
		"\7\t\2\2\u0212\u0213\7\16\2\2\u0213\u0214\7\b\2\2\u0214\u0219\5N(\2\u0215"+
		"\u0216\7\16\2\2\u0216\u0218\5N(\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7\t\2\2\u021d\u021f\3\2\2\2\u021e\u0212\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0227\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0227\5&\24\2\u0224\u0225\7I"+
		"\2\2\u0225\u0227\7\u00ac\2\2\u0226\u0207\3\2\2\2\u0226\u0223\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227%\3\2\2\2\u0228\u0233\5*\26\2\u0229\u022a\7\u0086"+
		"\2\2\u022a\u022b\78\2\2\u022b\u0230\5h\65\2\u022c\u022d\7\16\2\2\u022d"+
		"\u022f\5h\65\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0229\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u023a\3\2\2\2\u0235\u0238\5("+
		"\25\2\u0236\u0237\t\2\2\2\u0237\u0239\5N(\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0235\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\'\3\2\2\2\u023c\u023d\7y\2\2\u023d\u023e\5N(\2\u023e)\3\2\2"+
		"\2\u023f\u0241\7\u009b\2\2\u0240\u0242\t\3\2\2\u0241\u0240\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0248\5n8\2\u0244\u0245\7\16"+
		"\2\2\u0245\u0247\5n8\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0257\3\2\2\2\u024a\u0248\3\2\2\2\u024b"+
		"\u0255\7b\2\2\u024c\u0251\5p9\2\u024d\u024e\7\16\2\2\u024e\u0250\5p9\2"+
		"\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0256\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\5r:\2\u0255"+
		"\u024c\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u024b\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u025b\5,\27\2\u025a"+
		"\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0269\3\2\2\2\u025c\u025d\7e"+
		"\2\2\u025d\u025e\78\2\2\u025e\u0263\5N(\2\u025f\u0260\7\16\2\2\u0260\u0262"+
		"\5N(\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0268\5~"+
		"@\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269"+
		"\u025c\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0288\3\2\2\2\u026b\u026c\7\u00ac"+
		"\2\2\u026c\u026d\7\b\2\2\u026d\u0272\5N(\2\u026e\u026f\7\16\2\2\u026f"+
		"\u0271\5N(\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0284"+
		"\7\t\2\2\u0276\u0277\7\16\2\2\u0277\u0278\7\b\2\2\u0278\u027d\5N(\2\u0279"+
		"\u027a\7\16\2\2\u027a\u027c\5N(\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280\u0281\7\t\2\2\u0281\u0283\3\2\2\2\u0282\u0276\3\2"+
		"\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u023f\3\2\2\2\u0287\u026b\3\2"+
		"\2\2\u0288+\3\2\2\2\u0289\u028a\7\u00b1\2\2\u028a\u028b\5N(\2\u028b-\3"+
		"\2\2\2\u028c\u028d\7\u00a9\2\2\u028d\u028e\5f\64\2\u028e\u028f\7\u009c"+
		"\2\2\u028f\u0294\5\60\31\2\u0290\u0291\7\16\2\2\u0291\u0293\5\60\31\2"+
		"\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0299\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7\u00b1\2"+
		"\2\u0298\u029a\5N(\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a/\3"+
		"\2\2\2\u029b\u029c\5\u00a0Q\2\u029c\u029d\7\20\2\2\u029d\u029e\5N(\2\u029e"+
		"\61\3\2\2\2\u029f\u02a4\5\u00a0Q\2\u02a0\u02a3\5<\37\2\u02a1\u02a3\5\64"+
		"\33\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\63\3\2\2\2\u02a6\u02a4\3\2\2"+
		"\2\u02a7\u02b0\5\66\34\2\u02a8\u02a9\7\b\2\2\u02a9\u02aa\58\35\2\u02aa"+
		"\u02ab\7\t\2\2\u02ab\u02b1\3\2\2\2\u02ac\u02ad\7\b\2\2\u02ad\u02ae\5:"+
		"\36\2\u02ae\u02af\7\t\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\65\3\2\2\2\u02b2\u02b7\7\u00ba"+
		"\2\2\u02b3\u02b7\7\u00b8\2\2\u02b4\u02b7\7\u00b9\2\2\u02b5\u02b7\5\u0144"+
		"\u00a3\2\u02b6\u02b2\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6"+
		"\u02b5\3\2\2\2\u02b7\67\3\2\2\2\u02b8\u02ba\5\u0082B\2\u02b9\u02bb\5\u0144"+
		"\u00a3\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb9\3\2\2\2\u02bc"+
		"\u02be\5\u0082B\2\u02bd\u02bf\5\u0144\u00a3\2\u02be\u02bd\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\7\16\2\2\u02c1\u02c3\5"+
		"\u0082B\2\u02c2\u02c4\5\u0144\u00a3\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4"+
		"\3\2\2\2\u02c4;\3\2\2\2\u02c5\u02c6\7B\2\2\u02c6\u02c8\5\u0092J\2\u02c7"+
		"\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02d2\3\2\2\2\u02c9\u02d3\5B"+
		"\"\2\u02ca\u02d3\5D#\2\u02cb\u02d3\5F$\2\u02cc\u02d3\5H%\2\u02cd\u02d3"+
		"\5@!\2\u02ce\u02d3\5> \2\u02cf\u02d3\5J&\2\u02d0\u02d1\7>\2\2\u02d1\u02d3"+
		"\5\u00a2R\2\u02d2\u02c9\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d2\u02cb\3\2\2"+
		"\2\u02d2\u02cc\3\2\2\2\u02d2\u02cd\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d2\u02cf"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3=\3\2\2\2\u02d4\u02d5\7=\2\2\u02d5\u02d6"+
		"\7\b\2\2\u02d6\u02d7\5N(\2\u02d7\u02d8\7\t\2\2\u02d8?\3\2\2\2\u02d9\u02da"+
		"\7\u00a8\2\2\u02daA\3\2\2\2\u02db\u02dc\7\u008a\2\2\u02dc\u02de\7v\2\2"+
		"\u02dd\u02df\t\4\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02e2\7\64\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2"+
		"\u02e2C\3\2\2\2\u02e3\u02e4\5R*\2\u02e4E\3\2\2\2\u02e5\u02e6\7~\2\2\u02e6"+
		"\u02e7\7\u0080\2\2\u02e7G\3\2\2\2\u02e8\u02e9\7\u0080\2\2\u02e9I\3\2\2"+
		"\2\u02ea\u02f6\7I\2\2\u02eb\u02f7\5L\'\2\u02ec\u02ed\7\b\2\2\u02ed\u02ee"+
		"\5N(\2\u02ee\u02ef\7\t\2\2\u02ef\u02f7\3\2\2\2\u02f0\u02f1\7|\2\2\u02f1"+
		"\u02f2\7\b\2\2\u02f2\u02f3\5N(\2\u02f3\u02f4\7\t\2\2\u02f4\u02f7\3\2\2"+
		"\2\u02f5\u02f7\5\u0144\u00a3\2\u02f6\u02eb\3\2\2\2\u02f6\u02ec\3\2\2\2"+
		"\u02f6\u02f0\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02fe\3\2\2\2\u02f8\u02fa"+
		"\7\3\2\2\u02f9\u02fb\5\u0144\u00a3\2\u02fa\u02f9\3\2\2\2\u02fb\u02fc\3"+
		"\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02f8\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffK\3\2\2\2\u0300\u0303\5\u0082"+
		"B\2\u0301\u0303\5\u0084C\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303"+
		"M\3\2\2\2\u0304\u0305\b(\1\2\u0305\u032b\5\u0084C\2\u0306\u0307\5\u0096"+
		"L\2\u0307\u0308\7\7\2\2\u0308\u030a\3\2\2\2\u0309\u0306\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5\u009aN\2\u030c\u030d"+
		"\7\7\2\2\u030d\u030f\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u032b\5\u00a0Q\2\u0311\u0312\5\u0086D\2\u0312\u0313"+
		"\5N(\6\u0313\u032b\3\2\2\2\u0314\u0315\5\u0094K\2\u0315\u0322\7\b\2\2"+
		"\u0316\u0318\7P\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319"+
		"\3\2\2\2\u0319\u031e\5N(\2\u031a\u031b\7\16\2\2\u031b\u031d\5N(\2\u031c"+
		"\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0323\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0323\7\21\2\2\u0322"+
		"\u0317\3\2\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0325\7\t\2\2\u0325\u032b\3\2\2\2\u0326\u0327\7\b\2\2\u0327"+
		"\u0328\5N(\2\u0328\u0329\7\t\2\2\u0329\u032b\3\2\2\2\u032a\u0304\3\2\2"+
		"\2\u032a\u030e\3\2\2\2\u032a\u0311\3\2\2\2\u032a\u0314\3\2\2\2\u032a\u0326"+
		"\3\2\2\2\u032b\u0332\3\2\2\2\u032c\u032d\f\5\2\2\u032d\u032e\5P)\2\u032e"+
		"\u032f\5N(\6\u032f\u0331\3\2\2\2\u0330\u032c\3\2\2\2\u0331\u0334\3\2\2"+
		"\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333O\3\2\2\2\u0334\u0332"+
		"\3\2\2\2\u0335\u034b\7\26\2\2\u0336\u034b\t\5\2\2\u0337\u034b\t\6\2\2"+
		"\u0338\u034b\t\7\2\2\u0339\u034b\t\b\2\2\u033a\u0347\7\20\2\2\u033b\u0347"+
		"\7#\2\2\u033c\u0347\7$\2\2\u033d\u0347\7%\2\2\u033e\u0347\7s\2\2\u033f"+
		"\u0340\7s\2\2\u0340\u0347\7~\2\2\u0341\u0347\7j\2\2\u0342\u0347\7x\2\2"+
		"\u0343\u0347\7d\2\2\u0344\u0347\7z\2\2\u0345\u0347\7\u0090\2\2\u0346\u033a"+
		"\3\2\2\2\u0346\u033b\3\2\2\2\u0346\u033c\3\2\2\2\u0346\u033d\3\2\2\2\u0346"+
		"\u033e\3\2\2\2\u0346\u033f\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2"+
		"\2\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347"+
		"\u034b\3\2\2\2\u0348\u034b\7\60\2\2\u0349\u034b\7\u0085\2\2\u034a\u0335"+
		"\3\2\2\2\u034a\u0336\3\2\2\2\u034a\u0337\3\2\2\2\u034a\u0338\3\2\2\2\u034a"+
		"\u0339\3\2\2\2\u034a\u0346\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2"+
		"\2\2\u034bQ\3\2\2\2\u034c\u0350\7\u008f\2\2\u034d\u034e\5\u0096L\2\u034e"+
		"\u034f\7\7\2\2\u034f\u0351\3\2\2\2\u0350\u034d\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0352\3\2\2\2\u0352\u035e\5\u00a4S\2\u0353\u0354\7\b\2\2\u0354"+
		"\u0359\5T+\2\u0355\u0356\7\16\2\2\u0356\u0358\5T+\2\u0357\u0355\3\2\2"+
		"\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c"+
		"\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d\7\t\2\2\u035d\u035f\3\2\2\2\u035e"+
		"\u0353\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0372\3\2\2\2\u0360\u0361\7\u0083"+
		"\2\2\u0361\u036a\t\t\2\2\u0362\u0363\7\u009c\2\2\u0363\u036b\7\u0080\2"+
		"\2\u0364\u0365\7\u009c\2\2\u0365\u036b\7I\2\2\u0366\u036b\7:\2\2\u0367"+
		"\u036b\7\u0096\2\2\u0368\u0369\7}\2\2\u0369\u036b\7*\2\2\u036a\u0362\3"+
		"\2\2\2\u036a\u0364\3\2\2\2\u036a\u0366\3\2\2\2\u036a\u0367\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036f\3\2\2\2\u036c\u036d\7z\2\2\u036d\u036f\5\u0092"+
		"J\2\u036e\u0360\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0371\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0382\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0377\7~\2\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037d\7J"+
		"\2\2\u0379\u037a\7m\2\2\u037a\u037e\7K\2\2\u037b\u037c\7m\2\2\u037c\u037e"+
		"\7i\2\2\u037d\u0379\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u0380\3\2\2\2\u037f\u0381\7V\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381\u0383\3\2\2\2\u0382\u0376\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"S\3\2\2\2\u0384\u0385\5\u0092J\2\u0385U\3\2\2\2\u0386\u0389\5\u00a0Q\2"+
		"\u0387\u0388\7>\2\2\u0388\u038a\5\u00a2R\2\u0389\u0387\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u038d\t\4\2\2\u038c\u038b\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038dW\3\2\2\2\u038e\u038f\7B\2\2\u038f\u0391\5\u0092J"+
		"\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0397\3\2\2\2\u0392\u0398"+
		"\5\\/\2\u0393\u0398\5b\62\2\u0394\u0398\5`\61\2\u0395\u0398\5Z.\2\u0396"+
		"\u0398\5^\60\2\u0397\u0392\3\2\2\2\u0397\u0393\3\2\2\2\u0397\u0394\3\2"+
		"\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398Y\3\2\2\2\u0399\u039a"+
		"\7=\2\2\u039a\u039b\7\b\2\2\u039b\u039c\5N(\2\u039c\u039d\7\t\2\2\u039d"+
		"[\3\2\2\2\u039e\u039f\7\u008a\2\2\u039f\u03a0\7v\2\2\u03a0\u03a1\7\b\2"+
		"\2\u03a1\u03a6\5V,\2\u03a2\u03a3\7\16\2\2\u03a3\u03a5\5V,\2\u03a4\u03a2"+
		"\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\7\t\2\2\u03aa]\3\2\2\2"+
		"\u03ab\u03ac\7a\2\2\u03ac\u03ad\7v\2\2\u03ad\u03ae\7\b\2\2\u03ae\u03b3"+
		"\5d\63\2\u03af\u03b0\7\16\2\2\u03b0\u03b2\5d\63\2\u03b1\u03af\3\2\2\2"+
		"\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6"+
		"\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7\t\2\2\u03b7\u03b8\5R*\2\u03b8"+
		"_\3\2\2\2\u03b9\u03bb\7\u00a8\2\2\u03ba\u03bc\7v\2\2\u03bb\u03ba\3\2\2"+
		"\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bf\5\u0092J\2\u03be"+
		"\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7\b"+
		"\2\2\u03c1\u03c6\5V,\2\u03c2\u03c3\7\16\2\2\u03c3\u03c5\5V,\2\u03c4\u03c2"+
		"\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03c9\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\7\t\2\2\u03caa\3\2\2\2"+
		"\u03cb\u03cd\7v\2\2\u03cc\u03ce\5\u0092J\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7\b\2\2\u03d0\u03d5\5V,\2\u03d1"+
		"\u03d2\7\16\2\2\u03d2\u03d4\5V,\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7\3\2"+
		"\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d8\u03d9\7\t\2\2\u03d9c\3\2\2\2\u03da\u03db\5\u00a0"+
		"Q\2\u03dbe\3\2\2\2\u03dc\u03dd\5\u0096L\2\u03dd\u03de\7\7\2\2\u03de\u03e0"+
		"\3\2\2\2\u03df\u03dc\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e7\5\u009aN\2\u03e2\u03e3\7l\2\2\u03e3\u03e4\78\2\2\u03e4\u03e8\5"+
		"\u00a6T\2\u03e5\u03e6\7~\2\2\u03e6\u03e8\7l\2\2\u03e7\u03e2\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8g\3\2\2\2\u03e9\u03eb\5N(\2\u03ea"+
		"\u03ec\t\4\2\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03eci\3\2\2\2"+
		"\u03ed\u03f1\5\u0082B\2\u03ee\u03f1\5\u0092J\2\u03ef\u03f1\7\u00bd\2\2"+
		"\u03f0\u03ed\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1k\3"+
		"\2\2\2\u03f2\u03fe\5\u009aN\2\u03f3\u03f4\7\b\2\2\u03f4\u03f9\5\u00a0"+
		"Q\2\u03f5\u03f6\7\16\2\2\u03f6\u03f8\5\u00a0Q\2\u03f7\u03f5\3\2\2\2\u03f8"+
		"\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2"+
		"\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fd\7\t\2\2\u03fd\u03ff\3\2\2\2\u03fe"+
		"\u03f3\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\7\61"+
		"\2\2\u0401\u0402\7\b\2\2\u0402\u0403\5&\24\2\u0403\u0404\7\t\2\2\u0404"+
		"m\3\2\2\2\u0405\u0412\7\21\2\2\u0406\u0407\5\u009aN\2\u0407\u0408\7\7"+
		"\2\2\u0408\u0409\7\21\2\2\u0409\u0412\3\2\2\2\u040a\u040f\5N(\2\u040b"+
		"\u040d\7\61\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3"+
		"\2\2\2\u040e\u0410\5\u008cG\2\u040f\u040c\3\2\2\2\u040f\u0410\3\2\2\2"+
		"\u0410\u0412\3\2\2\2\u0411\u0405\3\2\2\2\u0411\u0406\3\2\2\2\u0411\u040a"+
		"\3\2\2\2\u0412o\3\2\2\2\u0413\u0414\5\u0096L\2\u0414\u0415\7\7\2\2\u0415"+
		"\u0417\3\2\2\2\u0416\u0413\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\3\2"+
		"\2\2\u0418\u041d\5\u009aN\2\u0419\u041b\7\61\2\2\u041a\u0419\3\2\2\2\u041a"+
		"\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\5\u00b2Z\2\u041d\u041a"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0424\3\2\2\2\u041f\u0420\7l\2\2\u0420"+
		"\u0421\78\2\2\u0421\u0425\5\u00a6T\2\u0422\u0423\7~\2\2\u0423\u0425\7"+
		"l\2\2\u0424\u041f\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0443\3\2\2\2\u0426\u0430\7\b\2\2\u0427\u042c\5p9\2\u0428\u0429\7\16"+
		"\2\2\u0429\u042b\5p9\2\u042a\u0428\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a"+
		"\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0431\3\2\2\2\u042e\u042c\3\2\2\2\u042f"+
		"\u0431\5r:\2\u0430\u0427\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u0432\3\2\2"+
		"\2\u0432\u0437\7\t\2\2\u0433\u0435\7\61\2\2\u0434\u0433\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\5\u00b2Z\2\u0437\u0434"+
		"\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0443\3\2\2\2\u0439\u043a\7\b\2\2\u043a"+
		"\u043b\5&\24\2\u043b\u0440\7\t\2\2\u043c\u043e\7\61\2\2\u043d\u043c\3"+
		"\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\5\u00b2Z\2"+
		"\u0440\u043d\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442\u0416"+
		"\3\2\2\2\u0442\u0426\3\2\2\2\u0442\u0439\3\2\2\2\u0443q\3\2\2\2\u0444"+
		"\u044b\5p9\2\u0445\u0446\5t;\2\u0446\u0447\5p9\2\u0447\u0448\5v<\2\u0448"+
		"\u044a\3\2\2\2\u0449\u0445\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044b\u044c\3\2\2\2\u044cs\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u0458"+
		"\7\6\2\2\u044f\u0451\7w\2\2\u0450\u0452\7\u0087\2\2\u0451\u0450\3\2\2"+
		"\2\u0451\u0452\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0455\7n\2\2\u0454\u044f"+
		"\3\2\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0458\7u\2\2\u0457\u044e\3\2\2\2\u0457\u0454\3\2\2\2\u0458u\3\2\2\2\u0459"+
		"\u045a\7\u0083\2\2\u045a\u045c\5N(\2\u045b\u0459\3\2\2\2\u045b\u045c\3"+
		"\2\2\2\u045cw\3\2\2\2\u045d\u045f\7\u009b\2\2\u045e\u0460\t\3\2\2\u045f"+
		"\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0466\5n"+
		"8\2\u0462\u0463\7\16\2\2\u0463\u0465\5n8\2\u0464\u0462\3\2\2\2\u0465\u0468"+
		"\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0475\3\2\2\2\u0468"+
		"\u0466\3\2\2\2\u0469\u0473\7b\2\2\u046a\u046f\5p9\2\u046b\u046c\7\16\2"+
		"\2\u046c\u046e\5p9\2\u046d\u046b\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0474\3\2\2\2\u0471\u046f\3\2\2\2\u0472"+
		"\u0474\5r:\2\u0473\u046a\3\2\2\2\u0473\u0472\3\2\2\2\u0474\u0476\3\2\2"+
		"\2\u0475\u0469\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0479"+
		"\5,\27\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0487\3\2\2\2\u047a"+
		"\u047b\7e\2\2\u047b\u047c\78\2\2\u047c\u0481\5N(\2\u047d\u047e\7\16\2"+
		"\2\u047e\u0480\5N(\2\u047f\u047d\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f"+
		"\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0484"+
		"\u0486\5~@\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2"+
		"\2\u0487\u047a\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048e\3\2\2\2\u0489\u048a"+
		"\7\u00ac\2\2\u048a\u048b\5z>\2\u048b\u048c\5|?\2\u048c\u048e\3\2\2\2\u048d"+
		"\u045d\3\2\2\2\u048d\u0489\3\2\2\2\u048ey\3\2\2\2\u048f\u0490\7\b\2\2"+
		"\u0490\u0495\5N(\2\u0491\u0492\7\16\2\2\u0492\u0494\5N(\2\u0493\u0491"+
		"\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u0499\7\t\2\2\u0499{\3\2\2\2"+
		"\u049a\u049b\7\16\2\2\u049b\u049d\5z>\2\u049c\u049a\3\2\2\2\u049d\u04a0"+
		"\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f}\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a2\7f\2\2\u04a2\u04a3\5N(\2\u04a3\177\3\2\2\2"+
		"\u04a4\u04b0\5\u009aN\2\u04a5\u04a6\7\b\2\2\u04a6\u04ab\5\u00a0Q\2\u04a7"+
		"\u04a8\7\16\2\2\u04a8\u04aa\5\u00a0Q\2\u04a9\u04a7\3\2\2\2\u04aa\u04ad"+
		"\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad"+
		"\u04ab\3\2\2\2\u04ae\u04af\7\t\2\2\u04af\u04b1\3\2\2\2\u04b0\u04a5\3\2"+
		"\2\2\u04b0\u04b1\3\2\2\2\u04b1\u0081\3\2\2\2\u04b2\u04b4\t\6\2\2\u04b3"+
		"\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b8\7\u00c0"+
		"\2\2\u04b6\u04b8\7\21\2\2\u04b7\u04b3\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8"+
		"\u0083\3\2\2\2\u04b9\u04ba\t\n\2\2\u04ba\u0085\3\2\2\2\u04bb\u04bc\t\13"+
		"\2\2\u04bc\u0087\3\2\2\2\u04bd\u04be\7\u00bd\2\2\u04be\u0089\3\2\2\2\u04bf"+
		"\u04c2\5N(\2\u04c0\u04c2\5\62\32\2\u04c1\u04bf\3\2\2\2\u04c1\u04c0\3\2"+
		"\2\2\u04c2\u008b\3\2\2\2\u04c3\u04c7\7\u00be\2\2\u04c4\u04c7\7\u00bd\2"+
		"\2\u04c5\u04c7\5\u0144\u00a3\2\u04c6\u04c3\3\2\2\2\u04c6\u04c4\3\2\2\2"+
		"\u04c6\u04c5\3\2\2\2\u04c7\u008d\3\2\2\2\u04c8\u04c9\t\f\2\2\u04c9\u008f"+
		"\3\2\2\2\u04ca\u04cc\13\2\2\2\u04cb\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2"+
		"\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u0091\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04d0\u04d1\5\u0144\u00a3\2\u04d1\u0093\3\2\2\2\u04d2\u04d3\5"+
		"\u0144\u00a3\2\u04d3\u0095\3\2\2\2\u04d4\u04d5\5\u0144\u00a3\2\u04d5\u0097"+
		"\3\2\2\2\u04d6\u04d7\5\u0144\u00a3\2\u04d7\u0099\3\2\2\2\u04d8\u04d9\5"+
		"\u0144\u00a3\2\u04d9\u009b\3\2\2\2\u04da\u04db\5\u0144\u00a3\2\u04db\u009d"+
		"\3\2\2\2\u04dc\u04dd\5\u0144\u00a3\2\u04dd\u009f\3\2\2\2\u04de\u04df\5"+
		"\u0144\u00a3\2\u04df\u00a1\3\2\2\2\u04e0\u04e1\5\u0144\u00a3\2\u04e1\u00a3"+
		"\3\2\2\2\u04e2\u04e3\5\u0144\u00a3\2\u04e3\u00a5\3\2\2\2\u04e4\u04e5\5"+
		"\u0144\u00a3\2\u04e5\u00a7\3\2\2\2\u04e6\u04e7\5\u0144\u00a3\2\u04e7\u00a9"+
		"\3\2\2\2\u04e8\u04e9\5\u0144\u00a3\2\u04e9\u00ab\3\2\2\2\u04ea\u04eb\5"+
		"\u0144\u00a3\2\u04eb\u00ad\3\2\2\2\u04ec\u04ed\5\u0144\u00a3\2\u04ed\u00af"+
		"\3\2\2\2\u04ee\u04ef\5\u0144\u00a3\2\u04ef\u00b1\3\2\2\2\u04f0\u04f3\5"+
		"\u0144\u00a3\2\u04f1\u04f3\7\u00be\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f1"+
		"\3\2\2\2\u04f3\u00b3\3\2\2\2\u04f4\u04f5\5\u0144\u00a3\2\u04f5\u00b5\3"+
		"\2\2\2\u04f6\u04f7\t\r\2\2\u04f7\u00b7\3\2\2\2\u04f8\u04f9\7C\2\2\u04f9"+
		"\u04fa\7\u00b7\2\2\u04fa\u04fb\7^\2\2\u04fb\u04fc\5\u0144\u00a3\2\u04fc"+
		"\u04fd\7\b\2\2\u04fd\u04fe\5\u00ba^\2\u04fe\u04ff\7\16\2\2\u04ff\u0500"+
		"\5\u0144\u00a3\2\u0500\u0501\7\16\2\2\u0501\u0502\5\u0144\u00a3\2\u0502"+
		"\u0503\7\16\2\2\u0503\u0504\5\u0144\u00a3\2\u0504\u0505\7\16\2\2\u0505"+
		"\u0507\7\n\2\2\u0506\u0508\5\u00bc_\2\u0507\u0506\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u050d\3\2\2\2\u0509\u050a\7\16\2\2\u050a\u050c\5\u00bc"+
		"_\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511\7\13"+
		"\2\2\u0511\u0512\7\t\2\2\u0512\u00b9\3\2\2\2\u0513\u0514\5\u0144\u00a3"+
		"\2\u0514\u0515\7\17\2\2\u0515\u0516\7\27\2\2\u0516\u0517\5\u0144\u00a3"+
		"\2\u0517\u051c\3\2\2\2\u0518\u0519\7\27\2\2\u0519\u051b\5\u0144\u00a3"+
		"\2\u051a\u0518\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d"+
		"\3\2\2\2\u051d\u0521\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u0521\5\u0144\u00a3"+
		"\2\u0520\u0513\3\2\2\2\u0520\u051f\3\2\2\2\u0521\u00bb\3\2\2\2\u0522\u0528"+
		"\7\u00b8\2\2\u0523\u0528\7\u00ba\2\2\u0524\u0528\7\u00b9\2\2\u0525\u0528"+
		"\5\u009aN\2\u0526\u0528\5\u00a0Q\2\u0527\u0522\3\2\2\2\u0527\u0523\3\2"+
		"\2\2\u0527\u0524\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0526\3\2\2\2\u0528"+
		"\u00bd\3\2\2\2\u0529\u052b\7^\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2"+
		"\2\2\u052b\u052c\3\2\2\2\u052c\u052d\5\u00c0a\2\u052d\u052e\5\u00c2b\2"+
		"\u052e\u00bf\3\2\2\2\u052f\u0530\5\u0144\u00a3\2\u0530\u0540\7\b\2\2\u0531"+
		"\u0536\5\u00d0i\2\u0532\u0533\7\16\2\2\u0533\u0535\5\u00d0i\2\u0534\u0532"+
		"\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537"+
		"\u053d\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u053a\7\16\2\2\u053a\u053c\5"+
		"\u00f8}\2\u053b\u0539\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2\2"+
		"\u053d\u053e\3\2\2\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0531"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\7\t\2\2\u0543"+
		"\u00c1\3\2\2\2\u0544\u0549\7\f\2\2\u0545\u0548\5\u00c4c\2\u0546\u0548"+
		"\5\u00c6d\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2\2\2\u0548\u054b\3\2\2"+
		"\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054f\3\2\2\2\u054b\u0549"+
		"\3\2\2\2\u054c\u054d\5\u00d4k\2\u054d\u054e\7\6\2\2\u054e\u0550\3\2\2"+
		"\2\u054f\u054c\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552"+
		"\7\r\2\2\u0552\u00c3\3\2\2\2\u0553\u0558\7\f\2\2\u0554\u0557\5\u00c4c"+
		"\2\u0555\u0557\5\u00c6d\2\u0556\u0554\3\2\2\2\u0556\u0555\3\2\2\2\u0557"+
		"\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2"+
		"\2\2\u055a\u0558\3\2\2\2\u055b\u055c\7\r\2\2\u055c\u00c5\3\2\2\2\u055d"+
		"\u0560\5\u00c8e\2\u055e\u0560\5\u00caf\2\u055f\u055d\3\2\2\2\u055f\u055e"+
		"\3\2\2\2\u0560\u00c7\3\2\2\2\u0561\u057e\5\u00e8u\2\u0562\u057e\5\u00de"+
		"p\2\u0563\u057e\5\u00f0y\2\u0564\u0568\5\u00e6t\2\u0565\u0568\5\u00ee"+
		"x\2\u0566\u0568\5\u00eav\2\u0567\u0564\3\2\2\2\u0567\u0565\3\2\2\2\u0567"+
		"\u0566\3\2\2\2\u0568\u057b\3\2\2\2\u0569\u056b\5\u00d6l\2\u056a\u0569"+
		"\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u057c\7\6\2\2\u056d"+
		"\u0571\7\f\2\2\u056e\u0570\5\u00c6d\2\u056f\u056e\3\2\2\2\u0570\u0573"+
		"\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0577\3\2\2\2\u0573"+
		"\u0571\3\2\2\2\u0574\u0575\5\u00d6l\2\u0575\u0576\7\6\2\2\u0576\u0578"+
		"\3\2\2\2\u0577\u0574\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057c\7\r\2\2\u057a\u057c\5\u00c6d\2\u057b\u056a\3\2\2\2\u057b\u056d"+
		"\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u0561\3\2\2\2\u057d"+
		"\u0562\3\2\2\2\u057d\u0563\3\2\2\2\u057d\u0567\3\2\2\2\u057e\u00c9\3\2"+
		"\2\2\u057f\u0586\5\u00ccg\2\u0580\u0586\5\u00dan\2\u0581\u0586\5\u013c"+
		"\u009f\2\u0582\u0586\5\u00f6|\2\u0583\u0586\5\u00fc\177\2\u0584\u0586"+
		"\5\u00b8]\2\u0585\u057f\3\2\2\2\u0585\u0580\3\2\2\2\u0585\u0581\3\2\2"+
		"\2\u0585\u0582\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0584\3\2\2\2\u0586\u0587"+
		"\3\2\2\2\u0587\u0588\7\6\2\2\u0588\u00cb\3\2\2\2\u0589\u058a\5\u0144\u00a3"+
		"\2\u058a\u0595\7\b\2\2\u058b\u0590\5\u00d2j\2\u058c\u058d\7\16\2\2\u058d"+
		"\u058f\5\u00d2j\2\u058e\u058c\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u058e"+
		"\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0593"+
		"\u058b\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596\3\2"+
		"\2\2\u0596\u0598\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u0599\7\t\2\2\u0599"+
		"\u00cd\3\2\2\2\u059a\u059b\5\u00c0a\2\u059b\u059c\5\u00c2b\2\u059c\u00cf"+
		"\3\2\2\2\u059d\u05a0\5\u00fa~\2\u059e\u05a0\5\u00ceh\2\u059f\u059d\3\2"+
		"\2\2\u059f\u059e\3\2\2\2\u05a0\u00d1\3\2\2\2\u05a1\u05ab\5\u0140\u00a1"+
		"\2\u05a2\u05ab\7\u00c0\2\2\u05a3\u05ab\7\u00bc\2\2\u05a4\u05ab\5\u00cc"+
		"g\2\u05a5\u05ab\7\u00be\2\2\u05a6\u05ab\5\u0144\u00a3\2\u05a7\u05ab\5"+
		"\u013a\u009e\2\u05a8\u05ab\5\u0112\u008a\2\u05a9\u05ab\5\u00fc\177\2\u05aa"+
		"\u05a1\3\2\2\2\u05aa\u05a2\3\2\2\2\u05aa\u05a3\3\2\2\2\u05aa\u05a4\3\2"+
		"\2\2\u05aa\u05a5\3\2\2\2\u05aa\u05a6\3\2\2\2\u05aa\u05a7\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05aa\u05a9\3\2\2\2\u05ab\u00d3\3\2\2\2\u05ac\u05ad\7\u0093"+
		"\2\2\u05ad\u05af\5\u00d8m\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u00d5\3\2\2\2\u05b0\u05b3\5\u00d4k\2\u05b1\u05b3\t\16\2\2\u05b2\u05b0"+
		"\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u00d7\3\2\2\2\u05b4\u05c3\3\2\2\2\u05b5"+
		"\u05c3\5\u0140\u00a1\2\u05b6\u05c3\7\u00bc\2\2\u05b7\u05c3\7\u00be\2\2"+
		"\u05b8\u05c3\5\u00ccg\2\u05b9\u05c3\7\u00a5\2\2\u05ba\u05c3\7]\2\2\u05bb"+
		"\u05c3\7\u0080\2\2\u05bc\u05c3\5\u00fe\u0080\2\u05bd\u05c3\5\u0112\u008a"+
		"\2\u05be\u05c3\5\u013a\u009e\2\u05bf\u05c3\5\u0100\u0081\2\u05c0\u05c3"+
		"\5\u0108\u0085\2\u05c1\u05c3\5\u012c\u0097\2\u05c2\u05b4\3\2\2\2\u05c2"+
		"\u05b5\3\2\2\2\u05c2\u05b6\3\2\2\2\u05c2\u05b7\3\2\2\2\u05c2\u05b8\3\2"+
		"\2\2\u05c2\u05b9\3\2\2\2\u05c2\u05ba\3\2\2\2\u05c2\u05bb\3\2\2\2\u05c2"+
		"\u05bc\3\2\2\2\u05c2\u05bd\3\2\2\2\u05c2\u05be\3\2\2\2\u05c2\u05bf\3\2"+
		"\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u00d9\3\2\2\2\u05c4"+
		"\u05c5\7\u008b\2\2\u05c5\u05c6\7\b\2\2\u05c6\u05cb\5\u00dco\2\u05c7\u05c8"+
		"\7\23\2\2\u05c8\u05ca\5\u00dco\2\u05c9\u05c7\3\2\2\2\u05ca\u05cd\3\2\2"+
		"\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cb"+
		"\3\2\2\2\u05ce\u05cf\7\t\2\2\u05cf\u00db\3\2\2\2\u05d0\u05d6\7\u00be\2"+
		"\2\u05d1\u05d6\5\u0144\u00a3\2\u05d2\u05d6\5\u00ccg\2\u05d3\u05d6\5\u013a"+
		"\u009e\2\u05d4\u05d6\5\u0112\u008a\2\u05d5\u05d0\3\2\2\2\u05d5\u05d1\3"+
		"\2\2\2\u05d5\u05d2\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d4\3\2\2\2\u05d6"+
		"\u00dd\3\2\2\2\u05d7\u05db\5\u00e0q\2\u05d8\u05da\5\u00e2r\2\u05d9\u05d8"+
		"\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc"+
		"\u05df\3\2\2\2\u05dd\u05db\3\2\2\2\u05de\u05e0\5\u00e4s\2\u05df\u05de"+
		"\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u00df\3\2\2\2\u05e1\u05e2\7g\2\2\u05e2"+
		"\u05e5\7\b\2\2\u05e3\u05e6\5\u0140\u00a1\2\u05e4\u05e6\5\u00fc\177\2\u05e5"+
		"\u05e3\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05fa\7\t"+
		"\2\2\u05e8\u05ec\7\f\2\2\u05e9\u05eb\5\u00c6d\2\u05ea\u05e9\3\2\2\2\u05eb"+
		"\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f2\3\2"+
		"\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f0\5\u00d4k\2\u05f0\u05f1\7\6\2\2\u05f1"+
		"\u05f3\3\2\2\2\u05f2\u05ef\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2"+
		"\2\2\u05f4\u05fb\7\r\2\2\u05f5\u05f8\5\u00d4k\2\u05f6\u05f8\5\u00c6d\2"+
		"\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fb\7\6\2\2\u05fa\u05e8\3\2\2\2\u05fa\u05f7\3\2\2\2\u05fb"+
		"\u00e1\3\2\2\2\u05fc\u05fd\7T\2\2\u05fd\u0600\7\b\2\2\u05fe\u0601\5\u0140"+
		"\u00a1\2\u05ff\u0601\5\u00fc\177\2\u0600\u05fe\3\2\2\2\u0600\u05ff\3\2"+
		"\2\2\u0601\u0602\3\2\2\2\u0602\u0615\7\t\2\2\u0603\u0607\7\f\2\2\u0604"+
		"\u0606\5\u00c6d\2\u0605\u0604\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605"+
		"\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060d\3\2\2\2\u0609\u0607\3\2\2\2\u060a"+
		"\u060b\5\u00d4k\2\u060b\u060c\7\6\2\2\u060c\u060e\3\2\2\2\u060d\u060a"+
		"\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0616\7\r\2\2\u0610"+
		"\u0613\5\u00d4k\2\u0611\u0613\5\u00c6d\2\u0612\u0610\3\2\2\2\u0612\u0611"+
		"\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0616\7\6\2\2\u0615"+
		"\u0603\3\2\2\2\u0615\u0612\3\2\2\2\u0616\u00e3\3\2\2\2\u0617\u062a\7S"+
		"\2\2\u0618\u061c\7\f\2\2\u0619\u061b\5\u00c6d\2\u061a\u0619\3\2\2\2\u061b"+
		"\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u0622\3\2"+
		"\2\2\u061e\u061c\3\2\2\2\u061f\u0620\5\u00d4k\2\u0620\u0621\7\6\2\2\u0621"+
		"\u0623\3\2\2\2\u0622\u061f\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u062b\7\r\2\2\u0625\u0628\5\u00d4k\2\u0626\u0628\5\u00c6d\2"+
		"\u0627\u0625\3\2\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629"+
		"\3\2\2\2\u0629\u062b\7\6\2\2\u062a\u0618\3\2\2\2\u062a\u0627\3\2\2\2\u062b"+
		"\u00e5\3\2\2\2\u062c\u062d\7\u00b4\2\2\u062d\u0630\7\b\2\2\u062e\u0631"+
		"\5\u0140\u00a1\2\u062f\u0631\5\u00fc\177\2\u0630\u062e\3\2\2\2\u0630\u062f"+
		"\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633\7\t\2\2\u0633\u00e7\3\2\2\2\u0634"+
		"\u0647\7N\2\2\u0635\u0637\5\u00d6l\2\u0636\u0635\3\2\2\2\u0636\u0637\3"+
		"\2\2\2\u0637\u0638\3\2\2\2\u0638\u0648\7\6\2\2\u0639\u063d\7\f\2\2\u063a"+
		"\u063c\5\u00c6d\2\u063b\u063a\3\2\2\2\u063c\u063f\3\2\2\2\u063d\u063b"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0643\3\2\2\2\u063f\u063d\3\2\2\2\u0640"+
		"\u0641\5\u00d6l\2\u0641\u0642\7\6\2\2\u0642\u0644\3\2\2\2\u0643\u0640"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0648\7\r\2\2\u0646"+
		"\u0648\7\6\2\2\u0647\u0636\3\2\2\2\u0647\u0639\3\2\2\2\u0647\u0646\3\2"+
		"\2\2\u0648\u0649\3\2\2\2\u0649\u064a\5\u00e6t\2\u064a\u064b\7\6\2\2\u064b"+
		"\u00e9\3\2\2\2\u064c\u064d\7_\2\2\u064d\u0653\7\b\2\2\u064e\u0652\5\u0104"+
		"\u0083\2\u064f\u0652\5\u0102\u0082\2\u0650\u0652\5\u00ecw\2\u0651\u064e"+
		"\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0650\3\2\2\2\u0652\u0654\3\2\2\2\u0653"+
		"\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\7\6"+
		"\2\2\u0656\u0658\5\u0140\u00a1\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2"+
		"\2\u0658\u0659\3\2\2\2\u0659\u065b\7\6\2\2\u065a\u065c\5\u00ecw\2\u065b"+
		"\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\7\t"+
		"\2\2\u065e\u00eb\3\2\2\2\u065f\u0664\5\u0100\u0081\2\u0660\u0664\5\u0108"+
		"\u0085\2\u0661\u0664\5\u010c\u0087\2\u0662\u0664\5\u013c\u009f\2\u0663"+
		"\u065f\3\2\2\2\u0663\u0660\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0662\3\2"+
		"\2\2\u0664\u00ed\3\2\2\2\u0665\u0666\7`\2\2\u0666\u0667\7\b\2\2\u0667"+
		"\u0668\7\u00ad\2\2\u0668\u066c\5\u0144\u00a3\2\u0669\u066b\7\4\2\2\u066a"+
		"\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2"+
		"\2\2\u066d\u066f\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0670\7\17\2\2\u0670"+
		"\u0674\5\u0144\u00a3\2\u0671\u0673\7\4\2\2\u0672\u0671\3\2\2\2\u0673\u0676"+
		"\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0677\u0678\7\t\2\2\u0678\u00ef\3\2\2\2\u0679\u067a\7\u009d"+
		"\2\2\u067a\u0682\7\b\2\2\u067b\u0683\5\u0140\u00a1\2\u067c\u0683\5\u0144"+
		"\u00a3\2\u067d\u0683\7\u00bc\2\2\u067e\u0683\7\u00c0\2\2\u067f\u0683\5"+
		"\u00fc\177\2\u0680\u0683\5\u00ccg\2\u0681\u0683\5\u013a\u009e\2\u0682"+
		"\u067b\3\2\2\2\u0682\u067c\3\2\2\2\u0682\u067d\3\2\2\2\u0682\u067e\3\2"+
		"\2\2\u0682\u067f\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2\u0683"+
		"\u0684\3\2\2\2\u0684\u0685\7\t\2\2\u0685\u068f\7\f\2\2\u0686\u0688\5\u00f4"+
		"{\2\u0687\u0686\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u068e\5\u00f2"+
		"z\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f"+
		"\u0689\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0692\7\r"+
		"\2\2\u0692\u00f1\3\2\2\2\u0693\u0694\7I\2\2\u0694\u0698\7\17\2\2\u0695"+
		"\u0697\5\u00c6d\2\u0696\u0695\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696"+
		"\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u06a0\3\2\2\2\u069a\u0698\3\2\2\2\u069b"+
		"\u069e\79\2\2\u069c\u069e\5\u00d4k\2\u069d\u069b\3\2\2\2\u069d\u069c\3"+
		"\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1\7\6\2\2\u06a0\u069d\3\2\2\2\u06a0"+
		"\u06a1\3\2\2\2\u06a1\u00f3\3\2\2\2\u06a2\u06a8\7;\2\2\u06a3\u06a9\5\u0140"+
		"\u00a1\2\u06a4\u06a9\5\u00b6\\\2\u06a5\u06a9\7\u00bc\2\2\u06a6\u06a9\7"+
		"\u00c0\2\2\u06a7\u06a9\5\u013a\u009e\2\u06a8\u06a3\3\2\2\2\u06a8\u06a4"+
		"\3\2\2\2\u06a8\u06a5\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a7\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u06ae\7\17\2\2\u06ab\u06ad\5\u00c6d\2\u06ac\u06ab"+
		"\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af"+
		"\u06b6\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06b4\79\2\2\u06b2\u06b4\5\u00d4"+
		"k\2\u06b3\u06b1\3\2\2\2\u06b3\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06b7\7\6\2\2\u06b6\u06b3\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u00f5\3\2"+
		"\2\2\u06b8\u06bb\5\u00fa~\2\u06b9\u06bb\5\u00f8}\2\u06ba\u06b8\3\2\2\2"+
		"\u06ba\u06b9\3\2\2\2\u06bb\u00f7\3\2\2\2\u06bc\u06c0\5\u0104\u0083\2\u06bd"+
		"\u06c0\5\u0132\u009a\2\u06be\u06c0\5\u010e\u0088\2\u06bf\u06bc\3\2\2\2"+
		"\u06bf\u06bd\3\2\2\2\u06bf\u06be\3\2\2\2\u06c0\u00f9\3\2\2\2\u06c1\u06c5"+
		"\5\u0102\u0082\2\u06c2\u06c5\5\u010c\u0087\2\u06c3\u06c5\5\u0130\u0099"+
		"\2\u06c4\u06c1\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c3\3\2\2\2\u06c5\u00fb"+
		"\3\2\2\2\u06c6\u06ca\5\u0100\u0081\2\u06c7\u06ca\5\u0108\u0085\2\u06c8"+
		"\u06ca\5\u012c\u0097\2\u06c9\u06c6\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06c8"+
		"\3\2\2\2\u06ca\u00fd\3\2\2\2\u06cb\u06cc\5\u0144\u00a3\2\u06cc\u00ff\3"+
		"\2\2\2\u06cd\u06cf\5\u0144\u00a3\2\u06ce\u06d0\5\u013e\u00a0\2\u06cf\u06ce"+
		"\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\7\20\2\2"+
		"\u06d2\u06d4\3\2\2\2\u06d3\u06cd\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d3"+
		"\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06db\3\2\2\2\u06d7\u06dc\5\u0140\u00a1"+
		"\2\u06d8\u06dc\5\"\22\2\u06d9\u06dc\5&\24\2\u06da\u06dc\7\u0080\2\2\u06db"+
		"\u06d7\3\2\2\2\u06db\u06d8\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06da\3\2"+
		"\2\2\u06dc\u0101\3\2\2\2\u06dd\u06de\7\u00ad\2\2\u06de\u06df\5\u00fe\u0080"+
		"\2\u06df\u0103\3\2\2\2\u06e0\u06e1\7\u00ad\2\2\u06e1\u06e2\5\u0100\u0081"+
		"\2\u06e2\u0105\3\2\2\2\u06e3\u06e4\5\u0144\u00a3\2\u06e4\u0107\3\2\2\2"+
		"\u06e5\u06e7\5\u0112\u008a\2\u06e6\u06e8\5\u013e\u00a0\2\u06e7\u06e6\3"+
		"\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\7\20\2\2\u06ea"+
		"\u06ec\3\2\2\2\u06eb\u06e5\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06eb\3\2"+
		"\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f2\3\2\2\2\u06ef\u06f3\5\u0140\u00a1"+
		"\2\u06f0\u06f3\5\"\22\2\u06f1\u06f3\5&\24\2\u06f2\u06ef\3\2\2\2\u06f2"+
		"\u06f0\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u0109\3\2\2\2\u06f4\u06f7\5\u010c"+
		"\u0087\2\u06f5\u06f7\5\u010e\u0088\2\u06f6\u06f4\3\2\2\2\u06f6\u06f5\3"+
		"\2\2\2\u06f7\u010b\3\2\2\2\u06f8\u06f9\7\u00ad\2\2\u06f9\u06fa\5\u0110"+
		"\u0089\2\u06fa\u010d\3\2\2\2\u06fb\u06fc\7\u00ad\2\2\u06fc\u06fd\5\u0110"+
		"\u0089\2\u06fd\u06fe\7\20\2\2\u06fe\u06ff\5\u0128\u0095\2\u06ff\u010f"+
		"\3\2\2\2\u0700\u0702\5\u0106\u0084\2\u0701\u0703\7\4\2\2\u0702\u0701\3"+
		"\2\2\2\u0703\u0704\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0111\3\2\2\2\u0706\u070e\5\u0106\u0084\2\u0707\u070b\7\n\2\2\u0708\u070c"+
		"\5\u0140\u00a1\2\u0709\u070c\7\u00c0\2\2\u070a\u070c\5\u00fe\u0080\2\u070b"+
		"\u0708\3\2\2\2\u070b\u0709\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u070d\3\2"+
		"\2\2\u070d\u070f\7\13\2\2\u070e\u0707\3\2\2\2\u070f\u0710\3\2\2\2\u0710"+
		"\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0113\3\2\2\2\u0712\u0717\7\u00be"+
		"\2\2\u0713\u0714\7\16\2\2\u0714\u0716\7\u00be\2\2\u0715\u0713\3\2\2\2"+
		"\u0716\u0719\3\2\2\2\u0717\u0715\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0115"+
		"\3\2\2\2\u0719\u0717\3\2\2\2\u071a\u071b\5\u0140\u00a1\2\u071b\u071c\7"+
		"\16\2\2\u071c\u071d\5\u0140\u00a1\2\u071d\u0117\3\2\2\2\u071e\u0723\5"+
		"\u0140\u00a1\2\u071f\u0720\7\16\2\2\u0720\u0722\5\u0140\u00a1\2\u0721"+
		"\u071f\3\2\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2"+
		"\2\2\u0724\u0119\3\2\2\2\u0725\u0723\3\2\2\2\u0726\u072b\7\u00bc\2\2\u0727"+
		"\u0728\7\16\2\2\u0728\u072a\7\u00bc\2\2\u0729\u0727\3\2\2\2\u072a\u072d"+
		"\3\2\2\2\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u011b\3\2\2\2\u072d"+
		"\u072b\3\2\2\2\u072e\u0733\5\u0136\u009c\2\u072f\u0730\7\16\2\2\u0730"+
		"\u0732\5\u0136\u009c\2\u0731\u072f\3\2\2\2\u0732\u0735\3\2\2\2\u0733\u0731"+
		"\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u011d\3\2\2\2\u0735\u0733\3\2\2\2\u0736"+
		"\u0737\7\n\2\2\u0737\u0738\5\u011c\u008f\2\u0738\u0739\7\13\2\2\u0739"+
		"\u011f\3\2\2\2\u073a\u073d\5\u00fe\u0080\2\u073b\u073d\5\u013a\u009e\2"+
		"\u073c\u073a\3\2\2\2\u073c\u073b\3\2\2\2\u073d\u0745\3\2\2\2\u073e\u0741"+
		"\7\16\2\2\u073f\u0742\5\u00fe\u0080\2\u0740\u0742\5\u013a\u009e\2\u0741"+
		"\u073f\3\2\2\2\u0741\u0740\3\2\2\2\u0742\u0744\3\2\2\2\u0743\u073e\3\2"+
		"\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746"+
		"\u0121\3\2\2\2\u0747\u0745\3\2\2\2\u0748\u074f\5\u0114\u008b\2\u0749\u074f"+
		"\5\u0118\u008d\2\u074a\u074f\5\u011a\u008e\2\u074b\u074f\5\u011c\u008f"+
		"\2\u074c\u074f\5\u0120\u0091\2\u074d\u074f\5\u0116\u008c\2\u074e\u0748"+
		"\3\2\2\2\u074e\u0749\3\2\2\2\u074e\u074a\3\2\2\2\u074e\u074b\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074e\u074d\3\2\2\2\u074f\u075c\3\2\2\2\u0750\u0758\7\16"+
		"\2\2\u0751\u0759\5\u0114\u008b\2\u0752\u0759\5\u0118\u008d\2\u0753\u0759"+
		"\5\u011a\u008e\2\u0754\u0759\5\u011c\u008f\2\u0755\u0759\5\u0124\u0093"+
		"\2\u0756\u0759\5\u0120\u0091\2\u0757\u0759\5\u0116\u008c\2\u0758\u0751"+
		"\3\2\2\2\u0758\u0752\3\2\2\2\u0758\u0753\3\2\2\2\u0758\u0754\3\2\2\2\u0758"+
		"\u0755\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0757\3\2\2\2\u0759\u075b\3\2"+
		"\2\2\u075a\u0750\3\2\2\2\u075b\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u0123\3\2\2\2\u075e\u075c\3\2\2\2\u075f\u0764\5\u0128"+
		"\u0095\2\u0760\u0761\7\16\2\2\u0761\u0763\5\u0128\u0095\2\u0762\u0760"+
		"\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762\3\2\2\2\u0764\u0765\3\2\2\2\u0765"+
		"\u0125\3\2\2\2\u0766\u0764\3\2\2\2\u0767\u0772\5\u0114\u008b\2\u0768\u0772"+
		"\5\u0118\u008d\2\u0769\u0772\5\u011a\u008e\2\u076a\u0772\5\u011c\u008f"+
		"\2\u076b\u0772\5\u011e\u0090\2\u076c\u0772\5\u0124\u0093\2\u076d\u0772"+
		"\5\u0116\u008c\2\u076e\u0772\5\u013a\u009e\2\u076f\u0772\5\u0122\u0092"+
		"\2\u0770\u0772\5\u0120\u0091\2\u0771\u0767\3\2\2\2\u0771\u0768\3\2\2\2"+
		"\u0771\u0769\3\2\2\2\u0771\u076a\3\2\2\2\u0771\u076b\3\2\2\2\u0771\u076c"+
		"\3\2\2\2\u0771\u076d\3\2\2\2\u0771\u076e\3\2\2\2\u0771\u076f\3\2\2\2\u0771"+
		"\u0770\3\2\2\2\u0772\u0127\3\2\2\2\u0773\u0775\7\f\2\2\u0774\u0776\5\u0126"+
		"\u0094\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u077c\7\r\2\2\u0778\u077c\5\"\22\2\u0779\u077c\5&\24\2\u077a\u077c\5"+
		"\u0106\u0084\2\u077b\u0773\3\2\2\2\u077b\u0778\3\2\2\2\u077b\u0779\3\2"+
		"\2\2\u077b\u077a\3\2\2\2\u077c\u0129\3\2\2\2\u077d\u077e\5\u0144\u00a3"+
		"\2\u077e\u012b\3\2\2\2\u077f\u0780\5\u012a\u0096\2\u0780\u0783\7\20\2"+
		"\2\u0781\u0784\5\u012a\u0096\2\u0782\u0784\5\u0136\u009c\2\u0783\u0781"+
		"\3\2\2\2\u0783\u0782\3\2\2\2\u0784\u012d\3\2\2\2\u0785\u0788\5\u0130\u0099"+
		"\2\u0786\u0788\5\u0132\u009a\2\u0787\u0785\3\2\2\2\u0787\u0786\3\2\2\2"+
		"\u0788\u012f\3\2\2\2\u0789\u078a\7\u00ad\2\2\u078a\u078b\5\u012a\u0096"+
		"\2\u078b\u0131\3\2\2\2\u078c\u078d\7\u00ad\2\2\u078d\u078e\5\u012c\u0097"+
		"\2\u078e\u0133\3\2\2\2\u078f\u0790\5\u0144\u00a3\2\u0790\u0791\7\17\2"+
		"\2\u0791\u0792\5\u0138\u009d\2\u0792\u0135\3\2\2\2\u0793\u079c\7\f\2\2"+
		"\u0794\u0799\5\u0134\u009b\2\u0795\u0796\7\16\2\2\u0796\u0798\5\u0134"+
		"\u009b\2\u0797\u0795\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797\3\2\2\2\u0799"+
		"\u079a\3\2\2\2\u079a\u079d\3\2\2\2\u079b\u0799\3\2\2\2\u079c\u0794\3\2"+
		"\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\7\r\2\2\u079f"+
		"\u0137\3\2\2\2\u07a0\u07b0\5\u0140\u00a1\2\u07a1\u07b0\7\u00be\2\2\u07a2"+
		"\u07b0\7\u00c0\2\2\u07a3\u07b0\7\u0080\2\2\u07a4\u07b0\5\u00fe\u0080\2"+
		"\u07a5\u07b0\7\u00bc\2\2\u07a6\u07b0\5\u0136\u009c\2\u07a7\u07b0\5\u013a"+
		"\u009e\2\u07a8\u07b0\5\u00ccg\2\u07a9\u07b0\5\u0112\u008a\2\u07aa\u07b0"+
		"\5\u011e\u0090\2\u07ab\u07ac\7\n\2\2\u07ac\u07ad\5\u0126\u0094\2\u07ad"+
		"\u07ae\7\13\2\2\u07ae\u07b0\3\2\2\2\u07af\u07a0\3\2\2\2\u07af\u07a1\3"+
		"\2\2\2\u07af\u07a2\3\2\2\2\u07af\u07a3\3\2\2\2\u07af\u07a4\3\2\2\2\u07af"+
		"\u07a5\3\2\2\2\u07af\u07a6\3\2\2\2\u07af\u07a7\3\2\2\2\u07af\u07a8\3\2"+
		"\2\2\u07af\u07a9\3\2\2\2\u07af\u07aa\3\2\2\2\u07af\u07ab\3\2\2\2\u07b0"+
		"\u0139\3\2\2\2\u07b1\u07b4\5\u012a\u0096\2\u07b2\u07b3\7\7\2\2\u07b3\u07b5"+
		"\5\u00fe\u0080\2\u07b4\u07b2\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b4\3"+
		"\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u013b\3\2\2\2\u07b8\u07b9\7\'\2\2\u07b9"+
		"\u07c3\5\u0144\u00a3\2\u07ba\u07bb\7&\2\2\u07bb\u07c3\5\u0144\u00a3\2"+
		"\u07bc\u07bd\5\u0144\u00a3\2\u07bd\u07be\7\'\2\2\u07be\u07c3\3\2\2\2\u07bf"+
		"\u07c0\5\u0144\u00a3\2\u07c0\u07c1\7&\2\2\u07c1\u07c3\3\2\2\2\u07c2\u07b8"+
		"\3\2\2\2\u07c2\u07ba\3\2\2\2\u07c2\u07bc\3\2\2\2\u07c2\u07bf\3\2\2\2\u07c3"+
		"\u013d\3\2\2\2\u07c4\u07c5\t\17\2\2\u07c5\u013f\3\2\2\2\u07c6\u07c7\b"+
		"\u00a1\1\2\u07c7\u07de\5\u0142\u00a2\2\u07c8\u07ca\7\b\2\2\u07c9\u07c8"+
		"\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc"+
		"\u07cf\3\2\2\2\u07cd\u07d0\5\u0140\u00a1\2\u07ce\u07d0\5\u00fc\177\2\u07cf"+
		"\u07cd\3\2\2\2\u07cf\u07ce\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07d3\7\t"+
		"\2\2\u07d2\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4"+
		"\u07d5\3\2\2\2\u07d5\u07de\3\2\2\2\u07d6\u07d7\7&\2\2\u07d7\u07de\5\u0140"+
		"\u00a1\17\u07d8\u07d9\7\'\2\2\u07d9\u07de\5\u0140\u00a1\16\u07da\u07db"+
		"\5\u0086D\2\u07db\u07dc\5\u0140\u00a1\r\u07dc\u07de\3\2\2\2\u07dd\u07c6"+
		"\3\2\2\2\u07dd\u07c9\3\2\2\2\u07dd\u07d6\3\2\2\2\u07dd\u07d8\3\2\2\2\u07dd"+
		"\u07da\3\2\2\2\u07de\u0806\3\2\2\2\u07df\u07e0\f\f\2\2\u07e0\u07e1\t\5"+
		"\2\2\u07e1\u0805\5\u0140\u00a1\r\u07e2\u07e3\f\13\2\2\u07e3\u07e4\t\6"+
		"\2\2\u07e4\u0805\5\u0140\u00a1\f\u07e5\u07e6\f\n\2\2\u07e6\u07e7\t\20"+
		"\2\2\u07e7\u0805\5\u0140\u00a1\13\u07e8\u07e9\f\t\2\2\u07e9\u07ea\t\b"+
		"\2\2\u07ea\u0805\5\u0140\u00a1\n\u07eb\u07ec\f\b\2\2\u07ec\u07ed\t\21"+
		"\2\2\u07ed\u0805\5\u0140\u00a1\t\u07ee\u07ef\f\7\2\2\u07ef\u07f0\7\34"+
		"\2\2\u07f0\u0805\5\u0140\u00a1\b\u07f1\u07f2\f\6\2\2\u07f2\u07f3\7\36"+
		"\2\2\u07f3\u0805\5\u0140\u00a1\7\u07f4\u07f5\f\5\2\2\u07f5\u07f6\7\35"+
		"\2\2\u07f6\u0805\5\u0140\u00a1\6\u07f7\u07f8\f\4\2\2\u07f8\u07f9\7\26"+
		"\2\2\u07f9\u0805\5\u0140\u00a1\5\u07fa\u07fb\f\3\2\2\u07fb\u07fc\7(\2"+
		"\2\u07fc\u07fd\5\u0140\u00a1\2\u07fd\u07fe\7\17\2\2\u07fe\u07ff\5\u0140"+
		"\u00a1\4\u07ff\u0805\3\2\2\2\u0800\u0801\f\21\2\2\u0801\u0805\7&\2\2\u0802"+
		"\u0803\f\20\2\2\u0803\u0805\7\'\2\2\u0804\u07df\3\2\2\2\u0804\u07e2\3"+
		"\2\2\2\u0804\u07e5\3\2\2\2\u0804\u07e8\3\2\2\2\u0804\u07eb\3\2\2\2\u0804"+
		"\u07ee\3\2\2\2\u0804\u07f1\3\2\2\2\u0804\u07f4\3\2\2\2\u0804\u07f7\3\2"+
		"\2\2\u0804\u07fa\3\2\2\2\u0804\u0800\3\2\2\2\u0804\u0802\3\2\2\2\u0805"+
		"\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0141\3\2"+
		"\2\2\u0808\u0806\3\2\2\2\u0809\u0813\7\u00a5\2\2\u080a\u0813\7]\2\2\u080b"+
		"\u0813\7\u00c0\2\2\u080c\u0813\5\u00fe\u0080\2\u080d\u0813\7\u00be\2\2"+
		"\u080e\u0813\7\u00bc\2\2\u080f\u0813\5\u013a\u009e\2\u0810\u0813\5\u0112"+
		"\u008a\2\u0811\u0813\5\u00ccg\2\u0812\u0809\3\2\2\2\u0812\u080a\3\2\2"+
		"\2\u0812\u080b\3\2\2\2\u0812\u080c\3\2\2\2\u0812\u080d\3\2\2\2\u0812\u080e"+
		"\3\2\2\2\u0812\u080f\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0811\3\2\2\2\u0813"+
		"\u0143\3\2\2\2\u0814\u0815\7\u00bf\2\2\u0815\u0145\3\2\2\2\u00fc\u014a"+
		"\u014c\u0157\u015e\u0163\u0169\u0175\u0180\u018c\u0193\u019b\u01ac\u01b5"+
		"\u01b7\u01c1\u01cf\u01d5\u01da\u01e6\u01e9\u01ee\u01f0\u01f7\u0200\u0205"+
		"\u020e\u0219\u0220\u0226\u0230\u0233\u0238\u023a\u0241\u0248\u0251\u0255"+
		"\u0257\u025a\u0263\u0267\u0269\u0272\u027d\u0284\u0287\u0294\u0299\u02a2"+
		"\u02a4\u02b0\u02b6\u02ba\u02be\u02c3\u02c7\u02d2\u02de\u02e1\u02f6\u02fc"+
		"\u02fe\u0302\u0309\u030e\u0317\u031e\u0322\u032a\u0332\u0346\u034a\u0350"+
		"\u0359\u035e\u036a\u036e\u0372\u0376\u037d\u0380\u0382\u0389\u038c\u0390"+
		"\u0397\u03a6\u03b3\u03bb\u03be\u03c6\u03cd\u03d5\u03df\u03e7\u03eb\u03f0"+
		"\u03f9\u03fe\u040c\u040f\u0411\u0416\u041a\u041d\u0424\u042c\u0430\u0434"+
		"\u0437\u043d\u0440\u0442\u044b\u0451\u0454\u0457\u045b\u045f\u0466\u046f"+
		"\u0473\u0475\u0478\u0481\u0485\u0487\u048d\u0495\u049e\u04ab\u04b0\u04b3"+
		"\u04b7\u04c1\u04c6\u04cd\u04f2\u0507\u050d\u051c\u0520\u0527\u052a\u0536"+
		"\u053d\u0540\u0547\u0549\u054f\u0556\u0558\u055f\u0567\u056a\u0571\u0577"+
		"\u057b\u057d\u0585\u0590\u0595\u059f\u05aa\u05ae\u05b2\u05c2\u05cb\u05d5"+
		"\u05db\u05df\u05e5\u05ec\u05f2\u05f7\u05fa\u0600\u0607\u060d\u0612\u0615"+
		"\u061c\u0622\u0627\u062a\u0630\u0636\u063d\u0643\u0647\u0651\u0653\u0657"+
		"\u065b\u0663\u066c\u0674\u0682\u0689\u068d\u068f\u0698\u069d\u06a0\u06a8"+
		"\u06ae\u06b3\u06b6\u06ba\u06bf\u06c4\u06c9\u06cf\u06d5\u06db\u06e7\u06ed"+
		"\u06f2\u06f6\u0704\u070b\u0710\u0717\u0723\u072b\u0733\u073c\u0741\u0745"+
		"\u074e\u0758\u075c\u0764\u0771\u0775\u077b\u0783\u0787\u0799\u079c\u07af"+
		"\u07b6\u07c2\u07cb\u07cf\u07d4\u07dd\u0804\u0806\u0812";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}