// Generated from PilerCrane.g4 by ANTLR 4.1

package org.pilercrane.language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PilerCraneParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, TAKE=4, FROM=5, BOXES=6, MOVE_TO=7, PUT=8, INTO=9, 
		ALL=10, HERE=11, TRANSPORT=12, LEFT=13, RIGHT=14, UP=15, DOWN=16, TO=17, 
		NUMBER=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'('", "TAKE", "'from'", "'boxes'", "'move to'", 
		"'put'", "'into'", "'all'", "'here'", "'transport'", "'left'", "'right'", 
		"'up'", "'down'", "'to'", "NUMBER", "WS"
	};
	public static final int
		RULE_coord = 0, RULE_boxCount = 1, RULE_departure = 2, RULE_destination = 3, 
		RULE_take = 4, RULE_put = 5, RULE_transport = 6, RULE_moveTo = 7;
	public static final String[] ruleNames = {
		"coord", "boxCount", "departure", "destination", "take", "put", "transport", 
		"moveTo"
	};

	@Override
	public String getGrammarFileName() { return "PilerCrane.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PilerCraneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CoordContext extends ParserRuleContext {
		public TerminalNode DOWN() { return getToken(PilerCraneParser.DOWN, 0); }
		public TerminalNode UP() { return getToken(PilerCraneParser.UP, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(PilerCraneParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PilerCraneParser.NUMBER); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode TO() { return getToken(PilerCraneParser.TO, 0); }
		public TerminalNode LEFT() { return getToken(PilerCraneParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PilerCraneParser.RIGHT, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_coord);
		try {
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16); match(3);
				setState(17); match(NUMBER);
				setState(18); match(2);
				setState(19); match(NUMBER);
				setState(20); match(2);
				setState(21); match(NUMBER);
				setState(22); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); match(LEFT);
				setState(24); match(TO);
				setState(25); coord();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26); match(UP);
				setState(27); match(TO);
				setState(28); coord();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); match(DOWN);
				setState(30); match(TO);
				setState(31); coord();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32); match(RIGHT);
				setState(33); match(TO);
				setState(34); coord();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35); match(3);
				setState(36); coord();
				setState(37); match(1);
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

	public static class BoxCountContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PilerCraneParser.ALL, 0); }
		public TerminalNode NUMBER() { return getToken(PilerCraneParser.NUMBER, 0); }
		public BoxCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxCount; }
	}

	public final BoxCountContext boxCount() throws RecognitionException {
		BoxCountContext _localctx = new BoxCountContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boxCount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepartureContext extends ParserRuleContext {
		public TerminalNode HERE() { return getToken(PilerCraneParser.HERE, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PilerCraneParser.FROM, 0); }
		public DepartureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure; }
	}

	public final DepartureContext departure() throws RecognitionException {
		DepartureContext _localctx = new DepartureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_departure);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(FROM);
				setState(44); coord();
				}
				break;
			case HERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(HERE);
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

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode HERE() { return getToken(PilerCraneParser.HERE, 0); }
		public TerminalNode INTO() { return getToken(PilerCraneParser.INTO, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_destination);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case INTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(INTO);
				setState(49); coord();
				}
				break;
			case HERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(HERE);
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

	public static class TakeContext extends ParserRuleContext {
		public BoxCountContext boxCount() {
			return getRuleContext(BoxCountContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(PilerCraneParser.TAKE, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode BOXES() { return getToken(PilerCraneParser.BOXES, 0); }
		public TerminalNode FROM() { return getToken(PilerCraneParser.FROM, 0); }
		public TakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take; }
	}

	public final TakeContext take() throws RecognitionException {
		TakeContext _localctx = new TakeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_take);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(TAKE);
			setState(54); boxCount();
			setState(55); match(BOXES);
			setState(58);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(56); match(FROM);
				setState(57); coord();
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

	public static class PutContext extends ParserRuleContext {
		public BoxCountContext boxCount() {
			return getRuleContext(BoxCountContext.class,0);
		}
		public TerminalNode PUT() { return getToken(PilerCraneParser.PUT, 0); }
		public TerminalNode INTO() { return getToken(PilerCraneParser.INTO, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TerminalNode BOXES() { return getToken(PilerCraneParser.BOXES, 0); }
		public PutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put; }
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_put);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(PUT);
			setState(61); boxCount();
			setState(62); match(BOXES);
			setState(65);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(63); match(INTO);
				setState(64); coord();
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

	public static class TransportContext extends ParserRuleContext {
		public BoxCountContext boxCount() {
			return getRuleContext(BoxCountContext.class,0);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public TerminalNode TRANSPORT() { return getToken(PilerCraneParser.TRANSPORT, 0); }
		public TerminalNode INTO() { return getToken(PilerCraneParser.INTO, 0); }
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public TerminalNode BOXES() { return getToken(PilerCraneParser.BOXES, 0); }
		public TerminalNode FROM() { return getToken(PilerCraneParser.FROM, 0); }
		public TransportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transport; }
	}

	public final TransportContext transport() throws RecognitionException {
		TransportContext _localctx = new TransportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(TRANSPORT);
			setState(68); boxCount();
			setState(69); match(BOXES);
			setState(70); match(FROM);
			setState(71); coord();
			setState(72); match(INTO);
			setState(73); coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveToContext extends ParserRuleContext {
		public TerminalNode MOVE_TO() { return getToken(PilerCraneParser.MOVE_TO, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public MoveToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveTo; }
	}

	public final MoveToContext moveTo() throws RecognitionException {
		MoveToContext _localctx = new MoveToContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moveTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(MOVE_TO);
			setState(76); coord();
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\25Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2*\n\2\3\3\3\3\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\5\5\66\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\3\4\2\f\f\24"+
		"\24Q\2)\3\2\2\2\4+\3\2\2\2\6\60\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f>\3"+
		"\2\2\2\16E\3\2\2\2\20M\3\2\2\2\22\23\7\5\2\2\23\24\7\24\2\2\24\25\7\4"+
		"\2\2\25\26\7\24\2\2\26\27\7\4\2\2\27\30\7\24\2\2\30*\7\3\2\2\31\32\7\17"+
		"\2\2\32\33\7\23\2\2\33*\5\2\2\2\34\35\7\21\2\2\35\36\7\23\2\2\36*\5\2"+
		"\2\2\37 \7\22\2\2 !\7\23\2\2!*\5\2\2\2\"#\7\20\2\2#$\7\23\2\2$*\5\2\2"+
		"\2%&\7\5\2\2&\'\5\2\2\2\'(\7\3\2\2(*\3\2\2\2)\22\3\2\2\2)\31\3\2\2\2)"+
		"\34\3\2\2\2)\37\3\2\2\2)\"\3\2\2\2)%\3\2\2\2*\3\3\2\2\2+,\t\2\2\2,\5\3"+
		"\2\2\2-.\7\7\2\2.\61\5\2\2\2/\61\7\r\2\2\60-\3\2\2\2\60/\3\2\2\2\61\7"+
		"\3\2\2\2\62\63\7\13\2\2\63\66\5\2\2\2\64\66\7\r\2\2\65\62\3\2\2\2\65\64"+
		"\3\2\2\2\66\t\3\2\2\2\678\7\6\2\289\5\4\3\29<\7\b\2\2:;\7\7\2\2;=\5\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2>?\7\n\2\2?@\5\4\3\2@C\7\b\2\2AB\7"+
		"\13\2\2BD\5\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EF\7\16\2\2FG\5\4\3\2"+
		"GH\7\b\2\2HI\7\7\2\2IJ\5\2\2\2JK\7\13\2\2KL\5\2\2\2L\17\3\2\2\2MN\7\t"+
		"\2\2NO\5\2\2\2O\21\3\2\2\2\7)\60\65<C";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}