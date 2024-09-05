// Generated from TrigCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TrigCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIN=1, COS=2, TAN=3, LPAREN=4, RPAREN=5, NUMBER=6, WS=7;
	public static final int
		RULE_expr = 0, RULE_calculation = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "calculation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sin'", "'Cos'", "'Tan'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIN", "COS", "TAN", "LPAREN", "RPAREN", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "TrigCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrigCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(TrigCalcParser.SIN, 0); }
		public TerminalNode LPAREN() { return getToken(TrigCalcParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TrigCalcParser.RPAREN, 0); }
		public TerminalNode COS() { return getToken(TrigCalcParser.COS, 0); }
		public TerminalNode TAN() { return getToken(TrigCalcParser.TAN, 0); }
		public TerminalNode NUMBER() { return getToken(TrigCalcParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigCalcListener ) ((TrigCalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigCalcListener ) ((TrigCalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(SIN);
				setState(5);
				match(LPAREN);
				setState(6);
				expr();
				setState(7);
				match(RPAREN);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(COS);
				setState(10);
				match(LPAREN);
				setState(11);
				expr();
				setState(12);
				match(RPAREN);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(TAN);
				setState(15);
				match(LPAREN);
				setState(16);
				expr();
				setState(17);
				match(RPAREN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalculationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigCalcListener ) ((TrigCalcListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigCalcListener ) ((TrigCalcListener)listener).exitCalculation(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calculation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				expr();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 78L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000"+
		"\u0001\u0001\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u001d\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0005\u0005"+
		"\u0001\u0000\u0000\u0005\u0006\u0005\u0004\u0000\u0000\u0006\u0007\u0003"+
		"\u0000\u0000\u0000\u0007\b\u0005\u0005\u0000\u0000\b\u0015\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b\u0005\u0004\u0000\u0000"+
		"\u000b\f\u0003\u0000\u0000\u0000\f\r\u0005\u0005\u0000\u0000\r\u0015\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0010\u0005"+
		"\u0004\u0000\u0000\u0010\u0011\u0003\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0005\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0015\u0005"+
		"\u0006\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000\u0014\t\u0001\u0000"+
		"\u0000\u0000\u0014\u000e\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0000"+
		"\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u0002\u0014\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}