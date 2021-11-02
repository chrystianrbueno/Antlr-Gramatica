// $ANTLR 3.5.1 /home/chrystian/Downloads/TrabalhoGB/Gramatica.g 2021-11-01 20:57:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GramaticaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "NEWLINE", "VAR", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "':='", "';'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int INT=4;
	public static final int NEWLINE=5;
	public static final int VAR=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "resultado", "stat", "expr", "comando"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GramaticaParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GramaticaParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GramaticaParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GramaticaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/chrystian/Downloads/TrabalhoGB/Gramatica.g"; }



	// $ANTLR start "prog"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:7:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:7:5: ( ( stat )+ )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:8:2: ( stat )+
			{
			dbg.location(8,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:8:2: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:8:2: stat
					{
					dbg.location(8,2);
					pushFollow(FOLLOW_stat_in_prog23);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:1: stat : ( comando ';' ) ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:6: ( ( comando ';' ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:11:2: ( comando ';' )
			{
			dbg.location(11,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:11:2: ( comando ';' )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:11:3: comando ';'
			{
			dbg.location(11,3);
			pushFollow(FOLLOW_comando_in_stat36);
			comando();
			state._fsp--;
			dbg.location(11,10);
			match(input,14,FOLLOW_14_in_stat37); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comando"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:14:1: comando : VAR ':=' resultado ;
	public final void comando() throws RecognitionException {
		Token VAR1=null;
		double resultado2 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:14:9: ( VAR ':=' resultado )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:2: VAR ':=' resultado
			{
			dbg.location(15,2);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_comando52); dbg.location(15,6);
			match(input,13,FOLLOW_13_in_comando54); dbg.location(15,11);
			pushFollow(FOLLOW_resultado_in_comando56);
			resultado2=resultado();
			state._fsp--;
			dbg.location(15,21);
			System.out.println("Variável " + (VAR1!=null?VAR1.getText():null) + " = " + resultado2);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "resultado"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:1: resultado returns [ double v ] : (e= expr )+ ;
	public final double resultado() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "resultado");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:31: ( (e= expr )+ )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:2: (e= expr )+
			{
			dbg.location(19,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:2: (e= expr )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT||LA2_0==7) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:3: e= expr
					{
					dbg.location(19,5);
					pushFollow(FOLLOW_expr_in_resultado78);
					e=expr();
					state._fsp--;
					dbg.location(19,12);
					v = e;dbg.location(19,25);
					System.out.println("Resultado: " + v);
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "resultado");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "resultado"



	// $ANTLR start "expr"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:22:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token INT4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:22:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= 9 && LA4_1 <= 12)) ) {
					alt4=1;
				}
				else if ( (LA4_1==INT||(LA4_1 >= 7 && LA4_1 <= 8)||LA4_1==14) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0==7) ) {
				alt4=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:2: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					{
					dbg.location(23,2);
					INT3=(Token)match(input,INT,FOLLOW_INT_in_expr99); dbg.location(23,6);
					v = Double.parseDouble( (INT3!=null?INT3.getText():null));dbg.location(23,45);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:45: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					int alt3=4;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					switch ( input.LA(1) ) {
					case 10:
						{
						alt3=1;
						}
						break;
					case 11:
						{
						alt3=2;
						}
						break;
					case 9:
						{
						alt3=3;
						}
						break;
					case 12:
						{
						alt3=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:46: '+' e= expr
							{
							dbg.location(23,46);
							match(input,10,FOLLOW_10_in_expr104); dbg.location(23,52);
							pushFollow(FOLLOW_expr_in_expr110);
							e=expr();
							state._fsp--;
							dbg.location(23,59);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:75: '-' e= expr
							{
							dbg.location(23,75);
							match(input,11,FOLLOW_11_in_expr116); dbg.location(23,81);
							pushFollow(FOLLOW_expr_in_expr122);
							e=expr();
							state._fsp--;
							dbg.location(23,88);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:104: '*' e= expr
							{
							dbg.location(23,104);
							match(input,9,FOLLOW_9_in_expr128); dbg.location(23,110);
							pushFollow(FOLLOW_expr_in_expr134);
							e=expr();
							state._fsp--;
							dbg.location(23,117);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:133: '/' e= expr
							{
							dbg.location(23,133);
							match(input,12,FOLLOW_12_in_expr140); dbg.location(23,139);
							pushFollow(FOLLOW_expr_in_expr146);
							e=expr();
							state._fsp--;
							dbg.location(23,146);
							v /= e;
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:24:7: INT
					{
					dbg.location(24,7);
					INT4=(Token)match(input,INT,FOLLOW_INT_in_expr158); dbg.location(24,11);
					v = Double.parseDouble( (INT4!=null?INT4.getText():null));
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:27:7: '(' e= expr ')'
					{
					dbg.location(27,7);
					match(input,7,FOLLOW_7_in_expr174); dbg.location(27,13);
					pushFollow(FOLLOW_expr_in_expr180);
					e=expr();
					state._fsp--;
					dbg.location(27,20);
					v = e;dbg.location(27,33);
					match(input,8,FOLLOW_8_in_expr184); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog23 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_comando_in_stat36 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stat37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando52 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_comando54 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_resultado_in_comando56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_resultado78 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_INT_in_expr99 = new BitSet(new long[]{0x0000000000001E00L});
	public static final BitSet FOLLOW_10_in_expr104 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr116 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr128 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr140 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr174 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr180 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr184 = new BitSet(new long[]{0x0000000000000002L});
}
