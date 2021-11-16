// $ANTLR 3.5.1 /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g 2021-11-16 17:02:06

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GramaticaParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "VAR", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'/'", "':='", "';'", "'<'", "'<='", "'<>'", "'='", 
		"'>'", "'>='", "'do'", "'if'", "'then'", "'while'"
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
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "comando", "prog", "expr_rel", "stat", "iteracao", "teste", 
		"expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "/home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g"; }


	    HashMap<String, Double> memory = new HashMap<>();



	// $ANTLR start "prog"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:15:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:16:2: ( ( stat )+ )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:17:2: ( stat )+
			{
			dbg.location(17,2);
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:17:2: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||LA1_0==22||LA1_0==24) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:17:2: stat
					{
					dbg.location(17,2);
					pushFollow(FOLLOW_stat_in_prog37);
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
		dbg.location(18, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:19:1: stat : ( ( comando ';' ) | teste | iteracao );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:20:2: ( ( comando ';' ) | teste | iteracao )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt2=1;
				}
				break;
			case 22:
				{
				alt2=2;
				}
				break;
			case 24:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:21:2: ( comando ';' )
					{
					dbg.location(21,2);
					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:21:2: ( comando ';' )
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:22:4: comando ';'
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_comando_in_stat55);
					comando();
					state._fsp--;
					dbg.location(22,11);
					match(input,14,FOLLOW_14_in_stat56); 
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:24:4: teste
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_teste_in_stat64);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:25:4: iteracao
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_iteracao_in_stat69);
					iteracao();
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
		dbg.location(26, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "comando"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:28:1: comando : VAR ':=' expr ;
	public final void comando() throws RecognitionException {
		Token VAR1=null;
		double expr2 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:29:3: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:30:2: VAR ':=' expr
			{
			dbg.location(30,2);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_comando85); dbg.location(30,6);
			match(input,13,FOLLOW_13_in_comando87); dbg.location(30,11);
			pushFollow(FOLLOW_expr_in_comando89);
			expr2=expr();
			state._fsp--;
			dbg.location(31,2);
			 memory.put((VAR1!=null?VAR1.getText():null), new Double(expr2)); dbg.location(32,2);
			 System.out.println("Variável " + (VAR1!=null?VAR1.getText():null) + " = " + expr2 + " inserida na lista"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "teste"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:35:1: teste : ( 'if' expr_rel 'then' stat ) ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:36:2: ( ( 'if' expr_rel 'then' stat ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:37:2: ( 'if' expr_rel 'then' stat )
			{
			dbg.location(37,2);
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:37:2: ( 'if' expr_rel 'then' stat )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:37:3: 'if' expr_rel 'then' stat
			{
			dbg.location(37,3);
			match(input,22,FOLLOW_22_in_teste111); dbg.location(37,8);
			pushFollow(FOLLOW_expr_rel_in_teste113);
			expr_rel();
			state._fsp--;
			dbg.location(37,17);
			match(input,23,FOLLOW_23_in_teste115); dbg.location(37,24);
			pushFollow(FOLLOW_stat_in_teste117);
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
		dbg.location(38, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "iteracao"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:40:1: iteracao : ( 'while' expr_rel 'do' stat ) ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:41:2: ( ( 'while' expr_rel 'do' stat ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:42:2: ( 'while' expr_rel 'do' stat )
			{
			dbg.location(42,2);
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:42:2: ( 'while' expr_rel 'do' stat )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:42:3: 'while' expr_rel 'do' stat
			{
			dbg.location(42,3);
			match(input,24,FOLLOW_24_in_iteracao131); dbg.location(42,11);
			pushFollow(FOLLOW_expr_rel_in_iteracao133);
			expr_rel();
			state._fsp--;
			dbg.location(42,20);
			match(input,21,FOLLOW_21_in_iteracao135); dbg.location(42,25);
			pushFollow(FOLLOW_stat_in_iteracao137);
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
		dbg.location(43, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expr"
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:45:1: expr returns [ double v ] : ( ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token VAR4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:45:26: ( ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |) | '(' e= expr ')' )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= INT && LA5_0 <= VAR)) ) {
				alt5=1;
			}
			else if ( (LA5_0==7) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:46:2: ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |)
					{
					dbg.location(46,2);
					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:46:2: ( INT | VAR )
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==INT) ) {
						alt3=1;
					}
					else if ( (LA3_0==VAR) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:47:4: INT
							{
							dbg.location(47,4);
							INT3=(Token)match(input,INT,FOLLOW_INT_in_expr322); dbg.location(47,8);
							v = Double.parseDouble( (INT3!=null?INT3.getText():null));dbg.location(47,47);
							System.out.println("Leitura valor unico: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:48:7: VAR
							{
							dbg.location(48,7);
							VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_expr334); dbg.location(48,11);
							 v = memory.get((VAR4!=null?VAR4.getText():null)); dbg.location(48,43);
							System.out.println("Valor lido da lista: " + v);
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(49,2);
					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:49:2: ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |)
					int alt4=5;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
					case 11:
						{
						alt4=1;
						}
						break;
					case 10:
						{
						alt4=2;
						}
						break;
					case 12:
						{
						alt4=3;
						}
						break;
					case 9:
						{
						alt4=4;
						}
						break;
					case 8:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 23:
						{
						alt4=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:50:4: '-' e= expr
							{
							dbg.location(50,4);
							match(input,11,FOLLOW_11_in_expr348); dbg.location(50,10);
							pushFollow(FOLLOW_expr_in_expr354);
							e=expr();
							state._fsp--;
							dbg.location(50,17);
							v -= e;dbg.location(50,31);
							System.out.println("Resultado Subtração: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:51:4: '+' e= expr
							{
							dbg.location(51,4);
							match(input,10,FOLLOW_10_in_expr363); dbg.location(51,10);
							pushFollow(FOLLOW_expr_in_expr369);
							e=expr();
							state._fsp--;
							dbg.location(51,17);
							v += e;dbg.location(51,31);
							System.out.println("Resultado Soma: " + v);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:52:4: '/' e= expr
							{
							dbg.location(52,4);
							match(input,12,FOLLOW_12_in_expr378); dbg.location(52,10);
							pushFollow(FOLLOW_expr_in_expr384);
							e=expr();
							state._fsp--;
							dbg.location(52,17);
							v /= e;dbg.location(52,31);
							System.out.println("Resultado Divisão: " + v);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:53:4: '*' e= expr
							{
							dbg.location(53,4);
							match(input,9,FOLLOW_9_in_expr393); dbg.location(53,10);
							pushFollow(FOLLOW_expr_in_expr399);
							e=expr();
							state._fsp--;
							dbg.location(53,17);
							v *= e;dbg.location(53,31);
							System.out.println("Resultado Multiplicação: " + v);
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:55:2: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:56:7: '(' e= expr ')'
					{
					dbg.location(56,7);
					match(input,7,FOLLOW_7_in_expr420); dbg.location(56,13);
					pushFollow(FOLLOW_expr_in_expr426);
					e=expr();
					state._fsp--;
					dbg.location(56,20);
					v = e;dbg.location(56,33);
					match(input,8,FOLLOW_8_in_expr430); 
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
		dbg.location(63, 4);

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
	// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:65:1: expr_rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) ;
	public final boolean expr_rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:66:5: ( (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:67:5: (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			{
			dbg.location(67,5);
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:67:5: (e= expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:67:7: e= expr
			{
			dbg.location(67,9);
			pushFollow(FOLLOW_expr_in_expr_rel464);
			e=expr();
			state._fsp--;

			}
			dbg.location(68,5);
			// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:68:5: ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			int alt6=6;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt6=1;
				}
				break;
			case 15:
				{
				alt6=2;
				}
				break;
			case 19:
				{
				alt6=3;
				}
				break;
			case 20:
				{
				alt6=4;
				}
				break;
			case 16:
				{
				alt6=5;
				}
				break;
			case 17:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:68:7: '=' d= expr
					{
					dbg.location(68,7);
					match(input,18,FOLLOW_18_in_expr_rel475); dbg.location(68,12);
					System.out.println("Expressao Relacional: = identificada");dbg.location(68,76);
					pushFollow(FOLLOW_expr_in_expr_rel484);
					d=expr();
					state._fsp--;
					dbg.location(68,83);
					t = e == d;dbg.location(68,104);
					System.out.println("Resultado Expressao Relacional: " + e + " = "  + d + " : " + t);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:69:7: '<' d= expr
					{
					dbg.location(69,7);
					match(input,15,FOLLOW_15_in_expr_rel497); dbg.location(69,12);
					System.out.println("Expressao Relacional: < identificada");dbg.location(69,76);
					pushFollow(FOLLOW_expr_in_expr_rel506);
					d=expr();
					state._fsp--;
					dbg.location(69,83);
					t = e <  d;dbg.location(69,104);
					System.out.println("Resultado Expressao Relacional: " + e + " < "  + d + " : " + t);
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:70:7: '>' d= expr
					{
					dbg.location(70,7);
					match(input,19,FOLLOW_19_in_expr_rel518); dbg.location(70,12);
					System.out.println("Expressao Relacional: > identificada");dbg.location(70,76);
					pushFollow(FOLLOW_expr_in_expr_rel527);
					d=expr();
					state._fsp--;
					dbg.location(70,83);
					t = e >  d;dbg.location(70,104);
					System.out.println("Resultado Expressao Relacional: " + e + " > "  + d + " : " + t);
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:71:7: '>=' d= expr
					{
					dbg.location(71,7);
					match(input,20,FOLLOW_20_in_expr_rel540); dbg.location(71,12);
					System.out.println("Expressao Relacional: >= identificada");dbg.location(71,77);
					pushFollow(FOLLOW_expr_in_expr_rel548);
					d=expr();
					state._fsp--;
					dbg.location(71,84);
					t = e >= d;dbg.location(71,105);
					System.out.println("Resultado Expressao Relacional: " + e + " >= " + d + " : " + t);
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:72:7: '<=' d= expr
					{
					dbg.location(72,7);
					match(input,16,FOLLOW_16_in_expr_rel560); dbg.location(72,12);
					System.out.println("Expressao Relacional: <= identificada");dbg.location(72,77);
					pushFollow(FOLLOW_expr_in_expr_rel568);
					d=expr();
					state._fsp--;
					dbg.location(72,84);
					t = e <= d;dbg.location(72,105);
					System.out.println("Resultado Expressao Relacional: " + e + " <= " + d + " : " + t);
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/chrystian/Downloads/TrabalhoGB/TrabalhoGB/Gramatica.g:73:7: '<>' d= expr
					{
					dbg.location(73,7);
					match(input,17,FOLLOW_17_in_expr_rel580); dbg.location(73,12);
					System.out.println("Expressao Relacional: <> identificada");dbg.location(73,77);
					pushFollow(FOLLOW_expr_in_expr_rel588);
					d=expr();
					state._fsp--;
					dbg.location(73,84);
					t = e != d;dbg.location(73,105);
					System.out.println("Resultado Expressao Relacional: " + e + " <> " + d + " : " + t);
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 4);

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



	public static final BitSet FOLLOW_stat_in_prog37 = new BitSet(new long[]{0x0000000001400022L});
	public static final BitSet FOLLOW_comando_in_stat55 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stat56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_stat64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando85 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_comando87 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_comando89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_teste111 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_rel_in_teste113 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_teste115 = new BitSet(new long[]{0x0000000001400020L});
	public static final BitSet FOLLOW_stat_in_teste117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_iteracao131 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_rel_in_iteracao133 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_iteracao135 = new BitSet(new long[]{0x0000000001400020L});
	public static final BitSet FOLLOW_stat_in_iteracao137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr322 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_VAR_in_expr334 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_11_in_expr348 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_expr363 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr378 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr393 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr420 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr426 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_rel464 = new BitSet(new long[]{0x00000000001F8000L});
	public static final BitSet FOLLOW_18_in_expr_rel475 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr_rel497 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_expr_rel518 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr_rel540 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr_rel560 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr_rel580 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel588 = new BitSet(new long[]{0x0000000000000002L});
}
