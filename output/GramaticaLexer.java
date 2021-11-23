// $ANTLR 3.5.1 /home/chrystian/Downloads/TrabalhoGB/Gramatica.g 2021-11-22 21:54:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GramaticaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GramaticaLexer() {} 
	public GramaticaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GramaticaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/chrystian/Downloads/TrabalhoGB/Gramatica.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:7:6: ( '(' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:7:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:8:6: ( ')' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:8:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:9:6: ( '*' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:9:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:7: ( '+' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:11:7: ( '-' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:12:7: ( '/' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:13:7: ( ':=' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:13:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:14:7: ( ';' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:14:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:7: ( '<' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:15:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:16:7: ( '<=' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:16:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:7: ( '<>' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:17:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:18:7: ( '=' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:18:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:7: ( '>' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:19:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:20:7: ( '>=' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:20:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:7: ( 'do' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:21:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:22:7: ( 'else' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:22:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:7: ( 'if' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:23:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:24:7: ( 'then' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:24:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:25:7: ( 'while' )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:25:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:91:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:91:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:91:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:92:4: ( ( '0' .. '9' )+ )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:92:6: ( '0' .. '9' )+
			{
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:92:6: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:93:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:93:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:93:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | WS | INT | VAR )
		int alt4=22;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case ':':
			{
			alt4=7;
			}
			break;
		case ';':
			{
			alt4=8;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '=':
				{
				alt4=10;
				}
				break;
			case '>':
				{
				alt4=11;
				}
				break;
			default:
				alt4=9;
			}
			}
			break;
		case '=':
			{
			alt4=12;
			}
			break;
		case '>':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='=') ) {
				alt4=14;
			}

			else {
				alt4=13;
			}

			}
			break;
		case 'd':
			{
			int LA4_12 = input.LA(2);
			if ( (LA4_12=='o') ) {
				int LA4_25 = input.LA(3);
				if ( ((LA4_25 >= 'A' && LA4_25 <= 'Z')||(LA4_25 >= 'a' && LA4_25 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=15;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'e':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='l') ) {
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='s') ) {
					int LA4_31 = input.LA(4);
					if ( (LA4_31=='e') ) {
						int LA4_35 = input.LA(5);
						if ( ((LA4_35 >= 'A' && LA4_35 <= 'Z')||(LA4_35 >= 'a' && LA4_35 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'i':
			{
			int LA4_14 = input.LA(2);
			if ( (LA4_14=='f') ) {
				int LA4_27 = input.LA(3);
				if ( ((LA4_27 >= 'A' && LA4_27 <= 'Z')||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 't':
			{
			int LA4_15 = input.LA(2);
			if ( (LA4_15=='h') ) {
				int LA4_28 = input.LA(3);
				if ( (LA4_28=='e') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='n') ) {
						int LA4_36 = input.LA(5);
						if ( ((LA4_36 >= 'A' && LA4_36 <= 'Z')||(LA4_36 >= 'a' && LA4_36 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=18;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'w':
			{
			int LA4_16 = input.LA(2);
			if ( (LA4_16=='h') ) {
				int LA4_29 = input.LA(3);
				if ( (LA4_29=='i') ) {
					int LA4_34 = input.LA(4);
					if ( (LA4_34=='l') ) {
						int LA4_37 = input.LA(5);
						if ( (LA4_37=='e') ) {
							int LA4_40 = input.LA(6);
							if ( ((LA4_40 >= 'A' && LA4_40 <= 'Z')||(LA4_40 >= 'a' && LA4_40 <= 'z')) ) {
								alt4=22;
							}

							else {
								alt4=19;
							}

						}

						else {
							alt4=22;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=20;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=21;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=22;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:97: T__22
				{
				mT__22(); 

				}
				break;
			case 17 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:103: T__23
				{
				mT__23(); 

				}
				break;
			case 18 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:109: T__24
				{
				mT__24(); 

				}
				break;
			case 19 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:115: T__25
				{
				mT__25(); 

				}
				break;
			case 20 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:121: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:124: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// /home/chrystian/Downloads/TrabalhoGB/Gramatica.g:1:128: VAR
				{
				mVAR(); 

				}
				break;

		}
	}



}
