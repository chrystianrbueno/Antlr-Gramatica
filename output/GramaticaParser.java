// $ANTLR 3.5.1 /home/chrystian/Downloads/TrabalhoGB/Gramatica.g 2021-11-22 18:17:48

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
		"'>'", "'>='", "'do'", "'else'", "'if'", "'then'", "'while'"
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
	public static final int T__25=25;
	public static final int INT=4;
	public static final int VAR=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "comando", "teste", "iteracao", "expr_rel", "alternativa", 
		"stat", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false
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


	    HashMap<String, Double> memory = new HashMap<>();



	// $ANTLR start "prog"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:16:2: ( ( stat )+ )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:2: ( stat )+
			{
			dbg.location(17,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:2: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				switch ( input.LA(1) ) {
				case VAR:
					{
					alt1=1;
					}
					break;
				case 23:
					{
					alt1=1;
					}
					break;
				case 25:
					{
					alt1=1;
					}
					break;
				}
				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:2: stat
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
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:1: stat : ( ( comando ';' ) | teste | iteracao );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:20:2: ( ( comando ';' ) | teste | iteracao )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt2=1;
				}
				break;
			case 23:
				{
				alt2=2;
				}
				break;
			case 25:
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

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:2: ( comando ';' )
					{
					dbg.location(21,2);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:2: ( comando ';' )
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:22:4: comando ';'
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

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:24:4: teste
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_teste_in_stat64);
					teste();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:25:4: iteracao
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
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:28:1: comando : VAR ':=' expr ;
	public final void comando() throws RecognitionException {
		Token VAR2=null;
		double expr1 =0.0;

		try { dbg.enterRule(getGrammarFileName(), "comando");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:29:3: ( VAR ':=' expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:30:2: VAR ':=' expr
			{
			dbg.location(30,2);
			VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_comando85); dbg.location(30,6);
			match(input,13,FOLLOW_13_in_comando87); dbg.location(30,11);
			pushFollow(FOLLOW_expr_in_comando89);
			expr1=expr();
			state._fsp--;
			dbg.location(31,2);
			 System.out.println("Resultado expressão: " + expr1); dbg.location(32,2);
			 memory.put((VAR2!=null?VAR2.getText():null), new Double(expr1)); dbg.location(33,2);
			 System.out.println("Variável " + (VAR2!=null?VAR2.getText():null) + " = " + expr1 + " inserida na lista"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comando");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comando"



	// $ANTLR start "teste"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:36:1: teste : ( 'if' expr_rel 'then' prog alternativa ) ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:37:2: ( ( 'if' expr_rel 'then' prog alternativa ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:38:2: ( 'if' expr_rel 'then' prog alternativa )
			{
			dbg.location(38,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:38:2: ( 'if' expr_rel 'then' prog alternativa )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:38:3: 'if' expr_rel 'then' prog alternativa
			{
			dbg.location(38,3);
			match(input,23,FOLLOW_23_in_teste114); dbg.location(38,8);
			pushFollow(FOLLOW_expr_rel_in_teste116);
			expr_rel();
			state._fsp--;
			dbg.location(38,17);
			match(input,24,FOLLOW_24_in_teste118); dbg.location(38,24);
			pushFollow(FOLLOW_prog_in_teste120);
			prog();
			state._fsp--;
			dbg.location(38,29);
			pushFollow(FOLLOW_alternativa_in_teste122);
			alternativa();
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
		dbg.location(39, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"



	// $ANTLR start "alternativa"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:41:1: alternativa : ( ( 'else' prog ) |);
	public final void alternativa() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "alternativa");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:42:2: ( ( 'else' prog ) |)
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==22) ) {
				alt3=1;
			}
			else if ( (LA3_0==VAR||LA3_0==23||LA3_0==25) ) {
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

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:2: ( 'else' prog )
					{
					dbg.location(43,2);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:2: ( 'else' prog )
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:43:3: 'else' prog
					{
					dbg.location(43,3);
					match(input,22,FOLLOW_22_in_alternativa137); dbg.location(43,10);
					pushFollow(FOLLOW_prog_in_alternativa139);
					prog();
					state._fsp--;

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:45:2: 
					{
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
		dbg.location(45, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "alternativa");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "alternativa"



	// $ANTLR start "iteracao"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:46:1: iteracao : ( 'while' expr_rel 'do' prog ) ;
	public final void iteracao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "iteracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:47:2: ( ( 'while' expr_rel 'do' prog ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:48:2: ( 'while' expr_rel 'do' prog )
			{
			dbg.location(48,2);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:48:2: ( 'while' expr_rel 'do' prog )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:48:3: 'while' expr_rel 'do' prog
			{
			dbg.location(48,3);
			match(input,25,FOLLOW_25_in_iteracao156); dbg.location(48,11);
			pushFollow(FOLLOW_expr_rel_in_iteracao158);
			expr_rel();
			state._fsp--;
			dbg.location(48,20);
			match(input,21,FOLLOW_21_in_iteracao160); dbg.location(48,25);
			pushFollow(FOLLOW_prog_in_iteracao162);
			prog();
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
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteracao"



	// $ANTLR start "expr_rel"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:52:1: expr_rel returns [ boolean t ] : (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) ;
	public final boolean expr_rel() throws RecognitionException {
		boolean t = false;


		double e =0.0;
		double d =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_rel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:53:5: ( (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr ) )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:54:5: (e= expr ) ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			{
			dbg.location(54,5);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:54:5: (e= expr )
			dbg.enterAlt(1);

			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:54:7: e= expr
			{
			dbg.location(54,9);
			pushFollow(FOLLOW_expr_in_expr_rel358);
			e=expr();
			state._fsp--;

			}
			dbg.location(55,5);
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:55:5: ( '=' d= expr | '<' d= expr | '>' d= expr | '>=' d= expr | '<=' d= expr | '<>' d= expr )
			int alt4=6;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case 18:
				{
				alt4=1;
				}
				break;
			case 15:
				{
				alt4=2;
				}
				break;
			case 19:
				{
				alt4=3;
				}
				break;
			case 20:
				{
				alt4=4;
				}
				break;
			case 16:
				{
				alt4=5;
				}
				break;
			case 17:
				{
				alt4=6;
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

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:56:7: '=' d= expr
					{
					dbg.location(56,7);
					match(input,18,FOLLOW_18_in_expr_rel376); dbg.location(56,12);
					System.out.println("Expressao Relacional: = identificada");dbg.location(56,76);
					pushFollow(FOLLOW_expr_in_expr_rel385);
					d=expr();
					state._fsp--;
					dbg.location(56,83);
					t = e == d;dbg.location(56,104);
					System.out.println("Resultado Expressao Relacional: " + e + " = "  + d + " : " + t);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:57:7: '<' d= expr
					{
					dbg.location(57,7);
					match(input,15,FOLLOW_15_in_expr_rel398); dbg.location(57,12);
					System.out.println("Expressao Relacional: < identificada");dbg.location(57,76);
					pushFollow(FOLLOW_expr_in_expr_rel407);
					d=expr();
					state._fsp--;
					dbg.location(57,83);
					t = e <  d;dbg.location(57,104);
					System.out.println("Resultado Expressao Relacional: " + e + " < "  + d + " : " + t);
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:58:7: '>' d= expr
					{
					dbg.location(58,7);
					match(input,19,FOLLOW_19_in_expr_rel419); dbg.location(58,12);
					System.out.println("Expressao Relacional: > identificada");dbg.location(58,76);
					pushFollow(FOLLOW_expr_in_expr_rel428);
					d=expr();
					state._fsp--;
					dbg.location(58,83);
					t = e >  d;dbg.location(58,104);
					System.out.println("Resultado Expressao Relacional: " + e + " > "  + d + " : " + t);
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:59:7: '>=' d= expr
					{
					dbg.location(59,7);
					match(input,20,FOLLOW_20_in_expr_rel441); dbg.location(59,12);
					System.out.println("Expressao Relacional: >= identificada");dbg.location(59,77);
					pushFollow(FOLLOW_expr_in_expr_rel449);
					d=expr();
					state._fsp--;
					dbg.location(59,84);
					t = e >= d;dbg.location(59,105);
					System.out.println("Resultado Expressao Relacional: " + e + " >= " + d + " : " + t);
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:60:7: '<=' d= expr
					{
					dbg.location(60,7);
					match(input,16,FOLLOW_16_in_expr_rel461); dbg.location(60,12);
					System.out.println("Expressao Relacional: <= identificada");dbg.location(60,77);
					pushFollow(FOLLOW_expr_in_expr_rel469);
					d=expr();
					state._fsp--;
					dbg.location(60,84);
					t = e <= d;dbg.location(60,105);
					System.out.println("Resultado Expressao Relacional: " + e + " <= " + d + " : " + t);
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:61:7: '<>' d= expr
					{
					dbg.location(61,7);
					match(input,17,FOLLOW_17_in_expr_rel481); dbg.location(61,12);
					System.out.println("Expressao Relacional: <> identificada");dbg.location(61,77);
					pushFollow(FOLLOW_expr_in_expr_rel489);
					d=expr();
					state._fsp--;
					dbg.location(61,84);
					t = e != d;dbg.location(61,105);
					System.out.println("Resultado Expressao Relacional: " + e + " <> " + d + " : " + t);
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

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
			dbg.exitRule(getGrammarFileName(), "expr_rel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return t;
	}
	// $ANTLR end "expr_rel"



	// $ANTLR start "expr"
	// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:64:1: expr returns [ double v ] : ( ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |) | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT3=null;
		Token VAR4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:65:2: ( ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |) | '(' e= expr ')' )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= INT && LA7_0 <= VAR)) ) {
				alt7=1;
			}
			else if ( (LA7_0==7) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:66:2: ( INT | VAR ) ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |)
					{
					dbg.location(66,2);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:66:2: ( INT | VAR )
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					else if ( (LA5_0==VAR) ) {
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

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:67:4: INT
							{
							dbg.location(67,4);
							INT3=(Token)match(input,INT,FOLLOW_INT_in_expr526); dbg.location(67,8);
							 v = Double.parseDouble( (INT3!=null?INT3.getText():null));dbg.location(67,48);
							System.out.println("Valor encontrado na Expressão: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:68:7: VAR
							{
							dbg.location(68,7);
							VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_expr538); dbg.location(68,11);
							 v = memory.getOrDefault((VAR4!=null?VAR4.getText():null), 0.0); dbg.location(68,57);
							System.out.println("Variável "+ (VAR4!=null?VAR4.getText():null) +" valor lido da lista: " + v);
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(69,2);
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:69:2: ( '-' e= expr | '+' e= expr | '/' e= expr | '*' e= expr |)
					int alt6=5;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					switch ( input.LA(1) ) {
					case 11:
						{
						alt6=1;
						}
						break;
					case 10:
						{
						alt6=2;
						}
						break;
					case 12:
						{
						alt6=3;
						}
						break;
					case 9:
						{
						alt6=4;
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
					case 24:
						{
						alt6=5;
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

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:70:4: '-' e= expr
							{
							dbg.location(70,4);
							match(input,11,FOLLOW_11_in_expr552); dbg.location(70,8);
							System.out.println("Sinal '-' encontrado");dbg.location(70,56);
							pushFollow(FOLLOW_expr_in_expr560);
							e=expr();
							state._fsp--;
							dbg.location(70,63);
							v -= e;dbg.location(70,77);
							System.out.println("Resultado Subtração: " + v);
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:71:4: '+' e= expr
							{
							dbg.location(71,4);
							match(input,10,FOLLOW_10_in_expr569); dbg.location(71,8);
							System.out.println("Sinal '+' encontrado");dbg.location(71,56);
							pushFollow(FOLLOW_expr_in_expr577);
							e=expr();
							state._fsp--;
							dbg.location(71,63);
							v += e;dbg.location(71,77);
							System.out.println("Resultado Soma: " + v);
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:72:4: '/' e= expr
							{
							dbg.location(72,4);
							match(input,12,FOLLOW_12_in_expr586); dbg.location(72,8);
							System.out.println("Sinal '/' encontrado");dbg.location(72,56);
							pushFollow(FOLLOW_expr_in_expr594);
							e=expr();
							state._fsp--;
							dbg.location(72,63);
							v /= e;dbg.location(72,77);
							System.out.println("Resultado Divisão: " + v);
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:73:4: '*' e= expr
							{
							dbg.location(73,4);
							match(input,9,FOLLOW_9_in_expr603); dbg.location(73,8);
							System.out.println("Sinal '*' encontrado");dbg.location(73,56);
							pushFollow(FOLLOW_expr_in_expr611);
							e=expr();
							state._fsp--;
							dbg.location(73,63);
							v *= e;dbg.location(73,77);
							System.out.println("Resultado Multiplicação: " + v);
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:75:2: 
							{
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:76:7: '(' e= expr ')'
					{
					dbg.location(76,7);
					match(input,7,FOLLOW_7_in_expr632); dbg.location(76,13);
					pushFollow(FOLLOW_expr_in_expr638);
					e=expr();
					state._fsp--;
					dbg.location(76,20);
					v = e;dbg.location(76,33);
					match(input,8,FOLLOW_8_in_expr642); dbg.location(76,37);
					System.out.println("Expressão com '()' encontrado, prioridade na expressão");
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
		dbg.location(83, 4);

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



	public static final BitSet FOLLOW_stat_in_prog37 = new BitSet(new long[]{0x0000000002800022L});
	public static final BitSet FOLLOW_comando_in_stat55 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stat56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_teste_in_stat64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteracao_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_comando85 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_comando87 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_comando89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_teste114 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_rel_in_teste116 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_teste118 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_prog_in_teste120 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_alternativa_in_teste122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_alternativa137 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_prog_in_alternativa139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_iteracao156 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_rel_in_iteracao158 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_iteracao160 = new BitSet(new long[]{0x0000000002800020L});
	public static final BitSet FOLLOW_prog_in_iteracao162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_rel358 = new BitSet(new long[]{0x00000000001F8000L});
	public static final BitSet FOLLOW_18_in_expr_rel376 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr_rel398 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_expr_rel419 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr_rel441 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr_rel461 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr_rel481 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr_rel489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr526 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_VAR_in_expr538 = new BitSet(new long[]{0x0000000000001E02L});
	public static final BitSet FOLLOW_11_in_expr552 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_expr569 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_expr586 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr603 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_expr632 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_expr_in_expr638 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_expr642 = new BitSet(new long[]{0x0000000000000002L});
}
