// Generated from PilerCrane.g4 by ANTLR 4.1

package org.pilercrane.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PilerCraneLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, TAKE=4, FROM=5, BOXES=6, MOVE_TO=7, PUT=8, INTO=9, 
		ALL=10, HERE=11, TRANSPORT=12, LEFT=13, RIGHT=14, UP=15, DOWN=16, TO=17, 
		NUMBER=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "TAKE", "'from'", "'boxes'", "'move to'", "'put'", 
		"'into'", "'all'", "'here'", "'transport'", "'left'", "'right'", "'up'", 
		"'down'", "'to'", "NUMBER", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "TAKE", "FROM", "BOXES", "MOVE_TO", "PUT", "INTO", 
		"ALL", "HERE", "TRANSPORT", "LEFT", "RIGHT", "UP", "DOWN", "TO", "DIGIT", 
		"NUMBER", "WS"
	};


	public PilerCraneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PilerCrane.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\6\24\177\n\24\r\24\16"+
		"\24\u0080\3\25\6\25\u0084\n\25\r\25\16\25\u0085\3\25\3\25\2\26\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'\24\1)\25\2\3\2\3\5\2\13"+
		"\f\16\17\"\"\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3"+
		"\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r;\3\2\2\2\17A\3\2\2\2\21I\3\2\2\2\23"+
		"M\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31[\3\2\2\2\33e\3\2\2\2\35j\3\2\2\2"+
		"\37p\3\2\2\2!s\3\2\2\2#x\3\2\2\2%{\3\2\2\2\'~\3\2\2\2)\u0083\3\2\2\2+"+
		",\7+\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2\2\2/\60\7*\2\2\60\b\3\2\2\2\61\62"+
		"\7v\2\2\62\63\7c\2\2\63\64\7m\2\2\64\65\7g\2\2\65\n\3\2\2\2\66\67\7h\2"+
		"\2\678\7t\2\289\7q\2\29:\7o\2\2:\f\3\2\2\2;<\7d\2\2<=\7q\2\2=>\7z\2\2"+
		">?\7g\2\2?@\7u\2\2@\16\3\2\2\2AB\7o\2\2BC\7q\2\2CD\7x\2\2DE\7g\2\2EF\7"+
		"\"\2\2FG\7v\2\2GH\7q\2\2H\20\3\2\2\2IJ\7r\2\2JK\7w\2\2KL\7v\2\2L\22\3"+
		"\2\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7q\2\2Q\24\3\2\2\2RS\7c\2\2ST\7n\2"+
		"\2TU\7n\2\2U\26\3\2\2\2VW\7j\2\2WX\7g\2\2XY\7t\2\2YZ\7g\2\2Z\30\3\2\2"+
		"\2[\\\7v\2\2\\]\7t\2\2]^\7c\2\2^_\7p\2\2_`\7u\2\2`a\7r\2\2ab\7q\2\2bc"+
		"\7t\2\2cd\7v\2\2d\32\3\2\2\2ef\7n\2\2fg\7g\2\2gh\7h\2\2hi\7v\2\2i\34\3"+
		"\2\2\2jk\7t\2\2kl\7k\2\2lm\7i\2\2mn\7j\2\2no\7v\2\2o\36\3\2\2\2pq\7w\2"+
		"\2qr\7r\2\2r \3\2\2\2st\7f\2\2tu\7q\2\2uv\7y\2\2vw\7p\2\2w\"\3\2\2\2x"+
		"y\7v\2\2yz\7q\2\2z$\3\2\2\2{|\4\62;\2|&\3\2\2\2}\177\5%\23\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081(\3\2\2\2\u0082"+
		"\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\25\2\2\u0088"+
		"*\3\2\2\2\5\2\u0080\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}