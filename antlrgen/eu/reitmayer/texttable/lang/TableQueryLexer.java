// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g 2013-02-24 08:28:13

package eu.reitmayer.texttable.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TableQueryLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int ADD=4;
    public static final int ALL=5;
    public static final int AND=6;
    public static final int AS=7;
    public static final int BOOL_NOT=8;
    public static final int BUT=9;
    public static final int COLUMN_LIST=10;
    public static final int COLUMN_SPEC=11;
    public static final int CONCAT=12;
    public static final int DELETE=13;
    public static final int DROP=14;
    public static final int Digit=15;
    public static final int EQUALS=16;
    public static final int FALSE=17;
    public static final int ID=18;
    public static final int INT=19;
    public static final int LOWER_CASE=20;
    public static final int Letter=21;
    public static final int MATCHES=22;
    public static final int ML=23;
    public static final int NOT=24;
    public static final int NUM=25;
    public static final int OR=26;
    public static final int RANDOM_LIST=27;
    public static final int RANDOM_STRING=28;
    public static final int REPLACE=29;
    public static final int ROW_NUMBER=30;
    public static final int SELECT=31;
    public static final int SET=32;
    public static final int SL=33;
    public static final int STRING=34;
    public static final int SUB_STRING=35;
    public static final int TEXT=36;
    public static final int TEXTNUM=37;
    public static final int TRUE=38;
    public static final int UPDATE=39;
    public static final int UPDATE_VAL_ELEM=40;
    public static final int UPDATE_VAL_LIST=41;
    public static final int UPPER_CASE=42;
    public static final int WHERE=43;
    public static final int WITH=44;
    public static final int WS=45;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TableQueryLexer() {} 
    public TableQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TableQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g"; }

    // $ANTLR start "BOOL_NOT"
    public final void mBOOL_NOT() throws RecognitionException {
        try {
            int _type = BOOL_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:11:10: ( 'BOOL_NOT' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:11:12: 'BOOL_NOT'
            {
            match("BOOL_NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL_NOT"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:12:7: ( '(' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:12:9: '('
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:13:7: ( ')' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:13:9: ')'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:14:7: ( ',' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:14:9: ','
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
    // $ANTLR end "T__48"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:150:4: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:151:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:151:3: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:153:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:154:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:154:8: ( options {greedy=false; } : . )*
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
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:154:36: .
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
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:157:4: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:8: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:24: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\r') ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:25: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:30: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:34: ( '\\n' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\n') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:158:35: '\\n'
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

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:162:7: ( '0' .. '9' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:165:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:169:7: ( 'select' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:170:3: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:173:7: ( 'delete' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:174:3: 'delete'
            {
            match("delete"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:177:7: ( 'update' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:178:2: 'update'
            {
            match("update"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:181:4: ( 'set' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:182:3: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:184:6: ( 'where' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:185:2: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:189:4: ( 'and' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:190:2: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:192:3: ( 'or' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:193:3: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:196:4: ( 'not' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:197:3: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:200:6: ( 'false' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:201:2: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:204:5: ( 'true' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:205:3: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:208:7: ( '=' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:209:2: '='
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
    // $ANTLR end "EQUALS"

    // $ANTLR start "MATCHES"
    public final void mMATCHES() throws RecognitionException {
        try {
            int _type = MATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:212:8: ( 'matches' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:213:3: 'matches'
            {
            match("matches"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATCHES"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:216:4: ( '*' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:217:2: '*'
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
    // $ANTLR end "ALL"

    // $ANTLR start "BUT"
    public final void mBUT() throws RecognitionException {
        try {
            int _type = BUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:220:4: ( 'but' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:221:2: 'but'
            {
            match("but"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BUT"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:224:5: ( 'drop' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:225:2: 'drop'
            {
            match("drop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:228:4: ( 'add' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:229:2: 'add'
            {
            match("add"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:232:7: ( '||' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:233:2: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "SUB_STRING"
    public final void mSUB_STRING() throws RecognitionException {
        try {
            int _type = SUB_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:236:11: ( 'sub_string' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:237:2: 'sub_string'
            {
            match("sub_string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB_STRING"

    // $ANTLR start "LOWER_CASE"
    public final void mLOWER_CASE() throws RecognitionException {
        try {
            int _type = LOWER_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:240:11: ( 'lower_case' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:241:2: 'lower_case'
            {
            match("lower_case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWER_CASE"

    // $ANTLR start "UPPER_CASE"
    public final void mUPPER_CASE() throws RecognitionException {
        try {
            int _type = UPPER_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:244:11: ( 'upper_case' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:245:2: 'upper_case'
            {
            match("upper_case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPPER_CASE"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:248:8: ( 'replace' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:249:2: 'replace'
            {
            match("replace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "RANDOM_STRING"
    public final void mRANDOM_STRING() throws RecognitionException {
        try {
            int _type = RANDOM_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:252:14: ( 'random_string' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:253:2: 'random_string'
            {
            match("random_string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANDOM_STRING"

    // $ANTLR start "RANDOM_LIST"
    public final void mRANDOM_LIST() throws RecognitionException {
        try {
            int _type = RANDOM_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:256:12: ( 'random_list' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:257:2: 'random_list'
            {
            match("random_list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANDOM_LIST"

    // $ANTLR start "ROW_NUMBER"
    public final void mROW_NUMBER() throws RecognitionException {
        try {
            int _type = ROW_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:260:11: ( 'row_num' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:261:2: 'row_num'
            {
            match("row_num"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROW_NUMBER"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:264:3: ( 'as' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:265:2: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:268:5: ( 'with' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:269:2: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:272:5: ( 'TEXT' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:273:2: 'TEXT'
            {
            match("TEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "TEXTNUM"
    public final void mTEXTNUM() throws RecognitionException {
        try {
            int _type = TEXTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:276:8: ( 'TEXTNUM' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:277:2: 'TEXTNUM'
            {
            match("TEXTNUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTNUM"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:280:4: ( 'NUM' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:281:2: 'NUM'
            {
            match("NUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:284:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:285:3: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:285:7: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:287:4: ( Letter ( Letter | Digit | '_' )* )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:288:3: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:288:10: ( Letter | Digit | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:290:5: ( Digit ( Digit )* )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:291:3: Digit ( Digit )*
            {
            mDigit(); 


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:291:9: ( Digit )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:
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
            	    break loop8;
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
        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:8: ( BOOL_NOT | T__46 | T__47 | T__48 | WS | ML | SL | SELECT | DELETE | UPDATE | SET | WHERE | AND | OR | NOT | FALSE | TRUE | EQUALS | MATCHES | ALL | BUT | DROP | ADD | CONCAT | SUB_STRING | LOWER_CASE | UPPER_CASE | REPLACE | RANDOM_STRING | RANDOM_LIST | ROW_NUMBER | AS | WITH | TEXT | TEXTNUM | NUM | STRING | ID | INT )
        int alt9=39;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:10: BOOL_NOT
                {
                mBOOL_NOT(); 


                }
                break;
            case 2 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:19: T__46
                {
                mT__46(); 


                }
                break;
            case 3 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:25: T__47
                {
                mT__47(); 


                }
                break;
            case 4 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:31: T__48
                {
                mT__48(); 


                }
                break;
            case 5 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:37: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:40: ML
                {
                mML(); 


                }
                break;
            case 7 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:43: SL
                {
                mSL(); 


                }
                break;
            case 8 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:46: SELECT
                {
                mSELECT(); 


                }
                break;
            case 9 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:53: DELETE
                {
                mDELETE(); 


                }
                break;
            case 10 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:60: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 11 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:67: SET
                {
                mSET(); 


                }
                break;
            case 12 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:71: WHERE
                {
                mWHERE(); 


                }
                break;
            case 13 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:77: AND
                {
                mAND(); 


                }
                break;
            case 14 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:81: OR
                {
                mOR(); 


                }
                break;
            case 15 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:84: NOT
                {
                mNOT(); 


                }
                break;
            case 16 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:88: FALSE
                {
                mFALSE(); 


                }
                break;
            case 17 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:94: TRUE
                {
                mTRUE(); 


                }
                break;
            case 18 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:99: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 19 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:106: MATCHES
                {
                mMATCHES(); 


                }
                break;
            case 20 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:114: ALL
                {
                mALL(); 


                }
                break;
            case 21 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:118: BUT
                {
                mBUT(); 


                }
                break;
            case 22 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:122: DROP
                {
                mDROP(); 


                }
                break;
            case 23 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:127: ADD
                {
                mADD(); 


                }
                break;
            case 24 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:131: CONCAT
                {
                mCONCAT(); 


                }
                break;
            case 25 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:138: SUB_STRING
                {
                mSUB_STRING(); 


                }
                break;
            case 26 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:149: LOWER_CASE
                {
                mLOWER_CASE(); 


                }
                break;
            case 27 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:160: UPPER_CASE
                {
                mUPPER_CASE(); 


                }
                break;
            case 28 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:171: REPLACE
                {
                mREPLACE(); 


                }
                break;
            case 29 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:179: RANDOM_STRING
                {
                mRANDOM_STRING(); 


                }
                break;
            case 30 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:193: RANDOM_LIST
                {
                mRANDOM_LIST(); 


                }
                break;
            case 31 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:205: ROW_NUMBER
                {
                mROW_NUMBER(); 


                }
                break;
            case 32 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:216: AS
                {
                mAS(); 


                }
                break;
            case 33 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:219: WITH
                {
                mWITH(); 


                }
                break;
            case 34 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:224: TEXT
                {
                mTEXT(); 


                }
                break;
            case 35 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:229: TEXTNUM
                {
                mTEXTNUM(); 


                }
                break;
            case 36 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:237: NUM
                {
                mNUM(); 


                }
                break;
            case 37 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:241: STRING
                {
                mSTRING(); 


                }
                break;
            case 38 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:248: ID
                {
                mID(); 


                }
                break;
            case 39 :
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:1:251: INT
                {
                mINT(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\32\5\uffff\11\32\1\uffff\1\32\1\uffff\1\32\1\uffff\4"+
        "\32\3\uffff\1\32\2\uffff\11\32\1\101\1\102\15\32\1\120\7\32\1\130"+
        "\1\131\2\uffff\1\132\3\32\1\136\5\32\1\144\2\32\1\uffff\2\32\1\151"+
        "\3\32\1\155\3\uffff\1\32\1\157\1\32\1\uffff\4\32\1\166\1\uffff\4"+
        "\32\1\uffff\2\32\1\175\1\uffff\1\176\1\uffff\6\32\1\uffff\1\32\1"+
        "\u0086\1\32\1\u0088\1\u0089\1\32\2\uffff\7\32\1\uffff\1\32\2\uffff"+
        "\1\32\1\u0094\1\32\1\u0096\1\32\1\u0099\1\u009a\1\u009b\2\32\1\uffff"+
        "\1\32\1\uffff\2\32\3\uffff\5\32\1\u00a6\1\u00a7\1\u00a8\2\32\3\uffff"+
        "\1\32\1\u00ac\1\32\1\uffff\1\u00ae\1\uffff";
    static final String DFA9_eofS =
        "\u00af\uffff";
    static final String DFA9_minS =
        "\1\11\1\117\4\uffff\1\52\2\145\1\160\1\150\1\144\1\162\1\157\1\141"+
        "\1\162\1\uffff\1\141\1\uffff\1\165\1\uffff\1\157\1\141\1\105\1\125"+
        "\3\uffff\1\117\2\uffff\1\154\1\142\1\154\1\157\1\144\1\145\1\164"+
        "\2\144\2\60\1\164\1\154\1\165\2\164\1\167\1\160\1\156\1\167\1\130"+
        "\1\115\1\114\1\145\1\60\1\137\1\145\1\160\1\141\1\145\1\162\1\150"+
        "\2\60\2\uffff\1\60\1\163\1\145\1\143\1\60\1\145\1\154\1\144\1\137"+
        "\1\124\1\60\1\137\1\143\1\uffff\1\163\1\164\1\60\1\164\1\162\1\145"+
        "\1\60\3\uffff\1\145\1\60\1\150\1\uffff\1\162\1\141\1\157\1\156\1"+
        "\60\1\uffff\1\116\2\164\1\145\1\uffff\1\145\1\137\1\60\1\uffff\1"+
        "\60\1\uffff\1\145\1\137\1\143\1\155\1\165\1\125\1\uffff\1\117\1"+
        "\60\1\162\2\60\1\143\2\uffff\1\163\1\143\1\145\1\137\1\155\1\115"+
        "\1\124\1\uffff\1\151\2\uffff\1\141\1\60\1\141\1\60\1\154\3\60\1"+
        "\156\1\163\1\uffff\1\163\1\uffff\1\164\1\151\3\uffff\1\147\2\145"+
        "\1\162\1\163\3\60\1\151\1\164\3\uffff\1\156\1\60\1\147\1\uffff\1"+
        "\60\1\uffff";
    static final String DFA9_maxS =
        "\1\174\1\117\4\uffff\1\57\1\165\1\162\1\160\1\151\1\163\1\162\1"+
        "\157\1\141\1\162\1\uffff\1\141\1\uffff\1\165\1\uffff\2\157\1\105"+
        "\1\125\3\uffff\1\117\2\uffff\1\164\1\142\1\154\1\157\1\160\1\145"+
        "\1\164\2\144\2\172\1\164\1\154\1\165\2\164\1\167\1\160\1\156\1\167"+
        "\1\130\1\115\1\114\1\145\1\172\1\137\1\145\1\160\1\141\1\145\1\162"+
        "\1\150\2\172\2\uffff\1\172\1\163\1\145\1\143\1\172\1\145\1\154\1"+
        "\144\1\137\1\124\1\172\1\137\1\143\1\uffff\1\163\1\164\1\172\1\164"+
        "\1\162\1\145\1\172\3\uffff\1\145\1\172\1\150\1\uffff\1\162\1\141"+
        "\1\157\1\156\1\172\1\uffff\1\116\2\164\1\145\1\uffff\1\145\1\137"+
        "\1\172\1\uffff\1\172\1\uffff\1\145\1\137\1\143\1\155\1\165\1\125"+
        "\1\uffff\1\117\1\172\1\162\2\172\1\143\2\uffff\1\163\1\143\1\145"+
        "\1\137\1\155\1\115\1\124\1\uffff\1\151\2\uffff\1\141\1\172\1\141"+
        "\1\172\1\163\3\172\1\156\1\163\1\uffff\1\163\1\uffff\1\164\1\151"+
        "\3\uffff\1\147\2\145\1\162\1\163\3\172\1\151\1\164\3\uffff\1\156"+
        "\1\172\1\147\1\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\12\uffff\1\22\1\uffff\1\24\1\uffff\1\30"+
        "\4\uffff\1\45\1\46\1\47\1\uffff\1\6\1\7\42\uffff\1\40\1\16\15\uffff"+
        "\1\13\7\uffff\1\15\1\27\1\17\3\uffff\1\25\5\uffff\1\44\4\uffff\1"+
        "\26\3\uffff\1\41\1\uffff\1\21\6\uffff\1\42\6\uffff\1\14\1\20\7\uffff"+
        "\1\10\1\uffff\1\11\1\12\12\uffff\1\23\1\uffff\1\34\2\uffff\1\37"+
        "\1\43\1\1\12\uffff\1\31\1\33\1\32\3\uffff\1\36\1\uffff\1\35";
    static final String DFA9_specialS =
        "\u00af\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\5\1\uffff\2\5\22\uffff\1\5\1\uffff\1\31\5\uffff\1\2\1\3\1"+
            "\22\1\uffff\1\4\2\uffff\1\6\12\33\3\uffff\1\20\3\uffff\1\32"+
            "\1\1\13\32\1\30\5\32\1\27\6\32\6\uffff\1\13\1\23\1\32\1\10\1"+
            "\32\1\16\5\32\1\25\1\21\1\15\1\14\2\32\1\26\1\7\1\17\1\11\1"+
            "\32\1\12\3\32\1\uffff\1\24",
            "\1\34",
            "",
            "",
            "",
            "",
            "\1\35\4\uffff\1\36",
            "\1\37\17\uffff\1\40",
            "\1\41\14\uffff\1\42",
            "\1\43",
            "\1\44\1\45",
            "\1\47\11\uffff\1\46\4\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "\1\55",
            "",
            "\1\56",
            "",
            "\1\57",
            "\1\61\3\uffff\1\60\11\uffff\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "\1\66\7\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\13\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\156",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\32\7\uffff\15\32\1\165\14\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0087",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0095",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0098\6\uffff\1\u0097",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00ad",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BOOL_NOT | T__46 | T__47 | T__48 | WS | ML | SL | SELECT | DELETE | UPDATE | SET | WHERE | AND | OR | NOT | FALSE | TRUE | EQUALS | MATCHES | ALL | BUT | DROP | ADD | CONCAT | SUB_STRING | LOWER_CASE | UPPER_CASE | REPLACE | RANDOM_STRING | RANDOM_LIST | ROW_NUMBER | AS | WITH | TEXT | TEXTNUM | NUM | STRING | ID | INT );";
        }
    }
 

}