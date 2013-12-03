package org.pilercrane.test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.junit.Test;
import org.pilercrane.language.PilerCraneLexer;
import org.pilercrane.language.PilerCraneParser;
import org.pilercrane.language.PilerCraneParser.TakeContext;

public class ParserTest {
	@Test
	public void simpleParserTest() {
		
		String query = "take 5 boxes from (1,2,3)";
		
		PilerCraneLexer lex = new PilerCraneLexer(new ANTLRInputStream(
				query));
		CommonTokenStream ts = new CommonTokenStream(lex);

		PilerCraneParser p = new PilerCraneParser(ts);
		p.getInterpreter().setPredictionMode(PredictionMode.SLL);
		
		TakeContext t = p.take();
		
	}
}
