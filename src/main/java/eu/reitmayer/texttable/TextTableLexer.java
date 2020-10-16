// $ANTLR 3.4 eu\\reitmayer\\texttable\\TextTable.g 2020-10-16 17:37:34
package eu.reitmayer.texttable.lang;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TextTableLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int ALIGN_LEFT=4;
    public static final int ALIGN_RIGHT=5;
    public static final int BEGIN=6;
    public static final int BY=7;
    public static final int Digit=8;
    public static final int END=9;
    public static final int FROM=10;
    public static final int ID=11;
    public static final int INT=12;
    public static final int LENGTH=13;
    public static final int Letter=14;
    public static final int ML=15;
    public static final int PLAIN=16;
    public static final int PLAIN_ELEM=17;
    public static final int PLAIN_ELEM_LIST=18;
    public static final int PLAIN_FILE=19;
    public static final int SEPARATED=20;
    public static final int SL=21;
    public static final int TEXT_COMMA=22;
    public static final int TEXT_SEMICOLON=23;
    public static final int TO=24;
    public static final int WS=25;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TextTableLexer() {} 
    public TextTableLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TextTableLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "eu\\reitmayer\\texttable\\TextTable.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:9:7: ( ',' )
            // eu\\reitmayer\\texttable\\TextTable.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:10:7: ( ';' )
            // eu\\reitmayer\\texttable\\TextTable.g:10:9: ';'
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
    // $ANTLR end "T__27"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:63:4: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // eu\\reitmayer\\texttable\\TextTable.g:64:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // eu\\reitmayer\\texttable\\TextTable.g:64:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // eu\\reitmayer\\texttable\\TextTable.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML"
    public final void mML() throws RecognitionException {
        try {
            int _type = ML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:66:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // eu\\reitmayer\\texttable\\TextTable.g:67:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // eu\\reitmayer\\texttable\\TextTable.g:67:8: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // eu\\reitmayer\\texttable\\TextTable.g:67:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:70:4: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // eu\\reitmayer\\texttable\\TextTable.g:71:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // eu\\reitmayer\\texttable\\TextTable.g:71:8: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // eu\\reitmayer\\texttable\\TextTable.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop3;
                }
            } while (true);


            // eu\\reitmayer\\texttable\\TextTable.g:71:24: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt5=3;
            switch ( input.LA(1) ) {
                case '\n':
                    {
                    alt5=1;
                    }
                    break;
                case '\r':
                    {
                    alt5=2;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // eu\\reitmayer\\texttable\\TextTable.g:71:25: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // eu\\reitmayer\\texttable\\TextTable.g:71:30: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // eu\\reitmayer\\texttable\\TextTable.g:71:34: ( '\\n' )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case '\n':
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // eu\\reitmayer\\texttable\\TextTable.g:71:35: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:74:6: ( 'begin' )
            // eu\\reitmayer\\texttable\\TextTable.g:74:8: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:75:4: ( 'end' )
            // eu\\reitmayer\\texttable\\TextTable.g:75:6: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "PLAIN"
    public final void mPLAIN() throws RecognitionException {
        try {
            int _type = PLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:76:6: ( 'plain' )
            // eu\\reitmayer\\texttable\\TextTable.g:76:8: 'plain'
            {
            match("plain"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLAIN"

    // $ANTLR start "SEPARATED"
    public final void mSEPARATED() throws RecognitionException {
        try {
            int _type = SEPARATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:77:10: ( 'separated' )
            // eu\\reitmayer\\texttable\\TextTable.g:77:12: 'separated'
            {
            match("separated"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATED"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:78:3: ( 'by' )
            // eu\\reitmayer\\texttable\\TextTable.g:78:5: 'by'
            {
            match("by"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "TEXT_SEMICOLON"
    public final void mTEXT_SEMICOLON() throws RecognitionException {
        try {
            int _type = TEXT_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:79:15: ( 'semicolon' )
            // eu\\reitmayer\\texttable\\TextTable.g:79:17: 'semicolon'
            {
            match("semicolon"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT_SEMICOLON"

    // $ANTLR start "TEXT_COMMA"
    public final void mTEXT_COMMA() throws RecognitionException {
        try {
            int _type = TEXT_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:80:11: ( 'comma' )
            // eu\\reitmayer\\texttable\\TextTable.g:80:13: 'comma'
            {
            match("comma"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT_COMMA"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:81:5: ( 'from' )
            // eu\\reitmayer\\texttable\\TextTable.g:81:7: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:82:3: ( 'to' )
            // eu\\reitmayer\\texttable\\TextTable.g:82:5: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "LENGTH"
    public final void mLENGTH() throws RecognitionException {
        try {
            int _type = LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:83:7: ( 'length' )
            // eu\\reitmayer\\texttable\\TextTable.g:83:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LENGTH"

    // $ANTLR start "ALIGN_LEFT"
    public final void mALIGN_LEFT() throws RecognitionException {
        try {
            int _type = ALIGN_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:84:11: ( 'left' )
            // eu\\reitmayer\\texttable\\TextTable.g:84:13: 'left'
            {
            match("left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALIGN_LEFT"

    // $ANTLR start "ALIGN_RIGHT"
    public final void mALIGN_RIGHT() throws RecognitionException {
        try {
            int _type = ALIGN_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:85:12: ( 'right' )
            // eu\\reitmayer\\texttable\\TextTable.g:85:14: 'right'
            {
            match("right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALIGN_RIGHT"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // eu\\reitmayer\\texttable\\TextTable.g:90:7: ( '0' .. '9' )
            // eu\\reitmayer\\texttable\\TextTable.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // eu\\reitmayer\\texttable\\TextTable.g:93:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // eu\\reitmayer\\texttable\\TextTable.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:95:4: ( Letter ( Letter | Digit | '_' )* )
            // eu\\reitmayer\\texttable\\TextTable.g:96:3: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 


            // eu\\reitmayer\\texttable\\TextTable.g:96:10: ( Letter | Digit | '_' )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
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
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
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
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // eu\\reitmayer\\texttable\\TextTable.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // eu\\reitmayer\\texttable\\TextTable.g:98:5: ( Digit ( Digit )* )
            // eu\\reitmayer\\texttable\\TextTable.g:99:3: Digit ( Digit )*
            {
            mDigit(); 


            // eu\\reitmayer\\texttable\\TextTable.g:99:9: ( Digit )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
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
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // eu\\reitmayer\\texttable\\TextTable.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    public void mTokens() throws RecognitionException {
        // eu\\reitmayer\\texttable\\TextTable.g:1:8: ( T__26 | T__27 | WS | ML | SL | BEGIN | END | PLAIN | SEPARATED | BY | TEXT_SEMICOLON | TEXT_COMMA | FROM | TO | LENGTH | ALIGN_LEFT | ALIGN_RIGHT | ID | INT )
        int alt8=19;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:10: T__26
                {
                mT__26(); 


                }
                break;
            case 2 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:16: T__27
                {
                mT__27(); 


                }
                break;
            case 3 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:22: WS
                {
                mWS(); 


                }
                break;
            case 4 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:25: ML
                {
                mML(); 


                }
                break;
            case 5 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:28: SL
                {
                mSL(); 


                }
                break;
            case 6 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:31: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 7 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:37: END
                {
                mEND(); 


                }
                break;
            case 8 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:41: PLAIN
                {
                mPLAIN(); 


                }
                break;
            case 9 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:47: SEPARATED
                {
                mSEPARATED(); 


                }
                break;
            case 10 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:57: BY
                {
                mBY(); 


                }
                break;
            case 11 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:60: TEXT_SEMICOLON
                {
                mTEXT_SEMICOLON(); 


                }
                break;
            case 12 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:75: TEXT_COMMA
                {
                mTEXT_COMMA(); 


                }
                break;
            case 13 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:86: FROM
                {
                mFROM(); 


                }
                break;
            case 14 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:91: TO
                {
                mTO(); 


                }
                break;
            case 15 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:94: LENGTH
                {
                mLENGTH(); 


                }
                break;
            case 16 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:101: ALIGN_LEFT
                {
                mALIGN_LEFT(); 


                }
                break;
            case 17 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:112: ALIGN_RIGHT
                {
                mALIGN_RIGHT(); 


                }
                break;
            case 18 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:124: ID
                {
                mID(); 


                }
                break;
            case 19 :
                // eu\\reitmayer\\texttable\\TextTable.g:1:127: INT
                {
                mINT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\5\uffff\11\16\4\uffff\1\16\1\35\5\16\1\44\3\16\1\uffff\1\51\5\16"+
        "\1\uffff\4\16\1\uffff\4\16\1\67\1\16\1\71\1\16\1\73\1\74\2\16\1"+
        "\77\1\uffff\1\16\1\uffff\1\101\2\uffff\2\16\1\uffff\1\104\1\uffff"+
        "\2\16\1\uffff\2\16\1\111\1\112\2\uffff";
    static final String DFA8_eofS =
        "\113\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\52\1\145\1\156\1\154\1\145\1\157\1\162\1\157\1\145"+
        "\1\151\4\uffff\1\147\1\60\1\144\1\141\2\155\1\157\1\60\1\146\1\147"+
        "\1\151\1\uffff\1\60\1\151\1\141\1\151\2\155\1\uffff\1\147\1\164"+
        "\1\150\1\156\1\uffff\1\156\1\162\1\143\1\141\1\60\1\164\1\60\1\164"+
        "\2\60\1\141\1\157\1\60\1\uffff\1\150\1\uffff\1\60\2\uffff\1\164"+
        "\1\154\1\uffff\1\60\1\uffff\1\145\1\157\1\uffff\1\144\1\156\2\60"+
        "\2\uffff";
    static final String DFA8_maxS =
        "\1\172\3\uffff\1\57\1\171\1\156\1\154\1\145\1\157\1\162\1\157\1"+
        "\145\1\151\4\uffff\1\147\1\172\1\144\1\141\1\160\1\155\1\157\1\172"+
        "\1\156\1\147\1\151\1\uffff\1\172\1\151\1\141\1\151\2\155\1\uffff"+
        "\1\147\1\164\1\150\1\156\1\uffff\1\156\1\162\1\143\1\141\1\172\1"+
        "\164\1\172\1\164\2\172\1\141\1\157\1\172\1\uffff\1\150\1\uffff\1"+
        "\172\2\uffff\1\164\1\154\1\uffff\1\172\1\uffff\1\145\1\157\1\uffff"+
        "\1\144\1\156\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\12\uffff\1\22\1\23\1\4\1\5\13\uffff\1\12\6"+
        "\uffff\1\16\4\uffff\1\7\15\uffff\1\15\1\uffff\1\20\1\uffff\1\6\1"+
        "\10\2\uffff\1\14\1\uffff\1\21\2\uffff\1\17\4\uffff\1\11\1\13";
    static final String DFA8_specialS =
        "\113\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\3\1\uffff\2\3\22\uffff\1\3\13\uffff\1\1\2\uffff\1\4\12\17"+
            "\1\uffff\1\2\5\uffff\32\16\6\uffff\1\16\1\5\1\11\1\16\1\6\1"+
            "\12\5\16\1\14\3\16\1\7\1\16\1\15\1\10\1\13\6\16",
            "",
            "",
            "",
            "\1\20\4\uffff\1\21",
            "\1\22\23\uffff\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "",
            "\1\34",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\36",
            "\1\37",
            "\1\41\2\uffff\1\40",
            "\1\42",
            "\1\43",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\46\7\uffff\1\45",
            "\1\47",
            "\1\50",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\70",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\72",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\75",
            "\1\76",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\100",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | WS | ML | SL | BEGIN | END | PLAIN | SEPARATED | BY | TEXT_SEMICOLON | TEXT_COMMA | FROM | TO | LENGTH | ALIGN_LEFT | ALIGN_RIGHT | ID | INT );";
        }
    }
 

}