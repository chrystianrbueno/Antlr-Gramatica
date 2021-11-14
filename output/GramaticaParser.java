// $ANTLR 3.5.1 /home/chrystian/Downloads/TrabalhoGB/Gramatica.g 2021-11-14 17:10:27

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
		"')'", "'*'", "'+'", "'-'", "'/'", "':='", "';'", "'<'", "'<='", "'<>'", 
		"'='", "'>'", "'>='", "'do'", "'if'", "'then'", "'while'"
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
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int INT=4;
	public static final int NEWLINE=5;
	public static final int VAR=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "stat", "expr", "iteracao", "comando", "expr_rel", "teste", 
		"prog"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false
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
				if ( (LA1_0==VAR||LA1_0==22) ) {
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
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:1: stat : ( ( comando ';' ) | teste );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:6: ( ( comando ';' ) | teste )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==VAR) ) {
				alt2=1;
			}
			else if ( (LA2_0==22) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
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
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:12:4: teste
					{
					dbg.location(12,4);
					pushFollow(FOLLOW_teste_in_stat43);
					teste();
					state._fsp--;

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
		dbg.location(13, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comando"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:1: comando : VAR ':=' expr ;
	public final void comando() throws RecognitionException {
		Token VAR1=null;
		double expr2 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:9: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:16:2: VAR ':=' expr
			{
			dbg.location(16,2);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_comando57); dbg.location(16,6);
			match(input,13,FOLLOW_13_in_comando59); dbg.location(16,11);
			pushFollow(FOLLOW_expr_in_comando61);
			expr2=expr();
			state._fsp--;
			dbg.location(16,16);
			System.out.println("Variável " + (VAR1!=null?VAR1.getText():null) + " = " + expr2);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "teste"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:1: teste : ( 'if' expr_rel 'then' stat ) ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:20:2: ( ( 'if' expr_rel 'then' stat ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:2: ( 'if' expr_rel 'then' stat )
			{
			dbg.location(21,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:2: ( 'if' expr_rel 'then' stat )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:3: 'if' expr_rel 'then' stat
			{
			dbg.location(21,3);
			match(input,22,FOLLOW_22_in_teste77); dbg.location(21,8);
			pushFollow(FOLLOW_expr_rel_in_teste79);
			expr_rel();
			state._fsp--;
			dbg.location(21,17);
			match(input,23,FOLLOW_23_in_teste81); dbg.location(21,24);
			pushFollow(FOLLOW_stat_in_teste83);
			stat();
			state._fsp--;

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
		dbg.location(22, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "iteracao"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:24:1: iteracao : ( 'while' expr_rel 'do' stat ) ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:25:2: ( ( 'while' expr_rel 'do' stat ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:26:2: ( 'while' expr_rel 'do' stat )
			{
			dbg.location(26,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:26:2: ( 'while' expr_rel 'do' stat )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:26:3: 'while' expr_rel 'do' stat
			{
			dbg.location(26,3);
			match(input,24,FOLLOW_24_in_iteracao97); dbg.location(26,11);
			pushFollow(FOLLOW_expr_rel_in_iteracao99);
			expr_rel();
			state._fsp--;
			dbg.location(26,20);
			match(input,21,FOLLOW_21_in_iteracao101); dbg.location(26,25);
			pushFollow(FOLLOW_stat_in_iteracao103);
			stat();
			state._fsp--;

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
		dbg.location(27, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expr"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:29:1: expr returns [ double v ] : ( INT ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr ) | INT | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token INT4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:29:26: ( INT ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr ) | INT | '(' e= expr ')' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= 9 && LA4_1 <= 12)) ) {
					alt4=1;
				}
				else if ( (LA4_1==8||(LA4_1 >= 14 && LA4_1 <= 21)||LA4_1==23) ) {
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

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:30:2: INT ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr )
					{
					dbg.location(30,2);
					INT3=(Token)match(input,INT,FOLLOW_INT_in_expr283); dbg.location(30,6);
					v = Double.parseDouble( (INT3!=null?INT3.getText():null));dbg.location(31,2);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:31:2: ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr )
					int alt3=4;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					switch ( input.LA(1) ) {
					case 11:
						{
						alt3=1;
						}
						break;
					case 10:
						{
						alt3=2;
						}
						break;
					case 12:
						{
						alt3=3;
						}
						break;
					case 9:
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

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:32:4: '-' e= expr
							{
							dbg.location(32,4);
							match(input,11,FOLLOW_11_in_expr293); dbg.location(32,10);
							pushFollow(FOLLOW_expr_in_expr299);
							e=expr();
							state._fsp--;
							dbg.location(32,17);
							v -= e;dbg.location(32,31);
							System.out.println("Resultado Subtração: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:33:4: '+' e= expr
							{
							dbg.location(33,4);
							match(input,10,FOLLOW_10_in_expr308); dbg.location(33,10);
							pushFollow(FOLLOW_expr_in_expr314);
							e=expr();
							state._fsp--;
							dbg.location(33,17);
							v += e;dbg.location(33,31);
							System.out.println("Resultado Soma: " + v);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:34:4: '/' e= expr
							{
							dbg.location(34,4);
							match(input,12,FOLLOW_12_in_expr323); dbg.location(34,10);
							pushFollow(FOLLOW_expr_in_expr329);
							e=expr();
							state._fsp--;
							dbg.location(34,17);
							v /= e;dbg.location(34,31);
							System.out.println("Resultado Divisão: " + v);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:35:4: '*' e= expr
							{
							dbg.location(35,4);
							match(input,9,FOLLOW_9_in_expr338); dbg.location(35,10);
							pushFollow(FOLLOW_expr_in_expr344);
							e=expr();
							state._fsp--;
							dbg.location(35,17);
							v *= e;dbg.location(35,31);
							System.out.println("Resultado Multiplicação: " + v);
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:37:6: INT
					{
					dbg.location(37,6);
					INT4=(Token)match(input,INT,FOLLOW_INT_in_expr359); dbg.location(37,10);
					v = Double.parseDouble( (INT4!=null?INT4.getText():null));
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:38:6: '(' e= expr ')'
					{
					dbg.location(38,6);
					match(input,7,FOLLOW_7_in_expr368); dbg.location(38,12);
					pushFollow(FOLLOW_expr_in_expr374);
					e=expr();
					state._fsp--;
					dbg.location(38,19);
					v = e;dbg.location(38,32);
					match(input,8,FOLLOW_8_in_expr378); 
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
		dbg.location(39, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_rel"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:41:1: expr_rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) ;
	public final boolean expr_rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:42:5: ( (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:5: (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			{
			dbg.location(43,5);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:5: (e= expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:7: e= expr
			{
			dbg.location(43,9);
			pushFollow(FOLLOW_expr_in_expr_rel410);
			e=expr();
			state._fsp--;

			}
			dbg.location(44,5);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:44:5: ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			int alt5=6;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt5=1;
				}
				break;
			case 15:
				{
				alt5=2;
				}
				break;
			case 19:
				{
				alt5=3;
				}
				break;
			case 20:
				{
				alt5=4;
				}
				break;
			case 16:
				{
				alt5=5;
				}
				break;
			case 17:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:44:7: '=' d= expr
					{
					dbg.location(44,7);
					match(input,18,FOLLOW_18_in_expr_rel421); dbg.location(44,12);
					System.out.println("Expressao Relacional: = " );dbg.location(44,65);
					pushFollow(FOLLOW_expr_in_expr_rel430);
					d=expr();
					state._fsp--;
					dbg.location(44,72);
					t = e == d;dbg.location(44,93);
					System.out.println("Resultado Expressao Relacional: " + e + " = "  + d + " : " + t);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:45:7: '<' d= expr
					{
					dbg.location(45,7);
					match(input,15,FOLLOW_15_in_expr_rel443); dbg.location(45,12);
					System.out.println("Expressao Relacional: < " );dbg.location(45,65);
					pushFollow(FOLLOW_expr_in_expr_rel452);
					d=expr();
					state._fsp--;
					dbg.location(45,72);
					t = e <  d;dbg.location(45,93);
					System.out.println("Resultado Expressao Relacional: " + e + " < "  + d + " : " + t);
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:46:7: '>' d= expr
					{
					dbg.location(46,7);
					match(input,19,FOLLOW_19_in_expr_rel464); dbg.location(46,12);
					System.out.println("Expressao Relacional: > " );dbg.location(46,65);
					pushFollow(FOLLOW_expr_in_expr_rel473);
					d=expr();
					state._fsp--;
					dbg.location(46,72);
					t = e >  d;dbg.location(46,93);
					System.out.println("Resultado Expressao Relacional: " + e + " > "  + d + " : " + t);
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:47:7: '>=' d= expr
					{
					dbg.location(47,7);
					match(input,20,FOLLOW_20_in_expr_rel486); dbg.location(47,12);
					System.out.println("Expressao Relacional: >= ");dbg.location(47,65);
					pushFollow(FOLLOW_expr_in_expr_rel494);
					d=expr();
					state._fsp--;
					dbg.location(47,72);
					t = e >= d;dbg.location(47,93);
					System.out.println("Resultado Expressao Relacional: " + e + " >= " + d + " : " + t);
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:48:7: '<=' d= expr
					{
					dbg.location(48,7);
					match(input,16,FOLLOW_16_in_expr_rel506); dbg.location(48,12);
					System.out.println("Expressao Relacional: <= ");dbg.location(48,65);
					pushFollow(FOLLOW_expr_in_expr_rel514);
					d=expr();
					state._fsp--;
					dbg.location(48,72);
					t = e <= d;dbg.location(48,93);
					System.out.println("Resultado Expressao Relacional: " + e + " <= " + d + " : " + t);
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:49:7: '<>' d= expr
					{
					dbg.location(49,7);
					match(input,17,FOLLOW_17_in_expr_rel526); dbg.location(49,12);
					System.out.println("Expressao Relacional: <> ");dbg.location(49,65);
					pushFollow(FOLLOW_expr_in_expr_rel534);
					d=expr();
					state._fsp--;
					dbg.location(49,72);
					t = e != d;dbg.location(49,93);
					System.out.println("Resultado Expressao Relacional: " + e + " <> " + d + " : " + t);
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_rel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return t;
	}
	// $ANTLR end "expr_rel"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog23 = new BitSet(new long[]{0x0000000000400042L});
	public static final BitSet FOLLOW_comando_in_stat36 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stat37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_stat43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando57 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_comando59 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_comando61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste77 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_rel_in_teste79 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_teste81 = new BitSet(new long[]{0x0000000000400040L});
	public static final BitSet FOLLOW_stat_in_teste83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_iteracao97 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_rel_in_iteracao99 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_iteracao101 = new BitSet(new long[]{0x0000000000400040L});
	public static final BitSet FOLLOW_stat_in_iteracao103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr283 = new BitSet(new long[]{0x0000000000001E00L});
	public static final BitSet FOLLOW_11_in_expr293 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_expr308 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr323 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr338 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr368 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr374 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_rel410 = new BitSet(new long[]{0x00000000001F8000L});
	public static final BitSet FOLLOW_18_in_expr_rel421 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr_rel443 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_expr_rel464 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr_rel486 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr_rel506 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr_rel526 = new BitSet(new long[]{0x0000000000000090L});
	public static final BitSet FOLLOW_expr_in_expr_rel534 = new BitSet(new long[]{0x0000000000000002L});
}
