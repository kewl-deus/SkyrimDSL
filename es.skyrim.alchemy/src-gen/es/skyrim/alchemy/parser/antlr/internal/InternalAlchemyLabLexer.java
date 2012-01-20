package es.skyrim.alchemy.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlchemyLabLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalAlchemyLabLexer() {;} 
    public InternalAlchemyLabLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlchemyLabLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:11:7: ( 'ingredient' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:11:9: 'ingredient'
            {
            match("ingredient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:12:7: ( '{' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:13:7: ( 'price:' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:13:9: 'price:'
            {
            match("price:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:14:7: ( 'weight:' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:14:9: 'weight:'
            {
            match("weight:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:15:7: ( 'source:' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:15:9: 'source:'
            {
            match("source:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:16:7: ( '}' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:17:7: ( 'effect' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:17:9: 'effect'
            {
            match("effect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:18:7: ( '(' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:19:7: ( ')' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:20:7: ( ':' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:21:7: ( '->' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:21:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:22:7: ( '=' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:23:7: ( '+' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:23:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:24:7: ( '-' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:25:7: ( 'potion' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:25:9: 'potion'
            {
            match("potion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:26:7: ( 'poison' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:26:9: 'poison'
            {
            match("poison"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:9: ( '\"' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' )+ '\"' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:11: '\"' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' )+ '\"'
            {
            match('\"'); 
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:15: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:15: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:583:20: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00C4'||LA2_0=='\u00D6'||LA2_0=='\u00DC'||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:585:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:585:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:585:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:585:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:585:66: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:15: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:27: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:32: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:587:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:589:10: ( 'this one has been deactivated' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:589:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:591:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:591:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:591:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:591:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:41: ( '\\r' )? '\\n'
                    {
                    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:593:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:595:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:595:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:595:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:597:16: ( . )
            // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:597:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_STRING | RULE_NUMBER | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:106: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:114: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:126: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 20 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:147: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:163: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:179: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../es.skyrim.alchemy/src-gen/es/skyrim/alchemy/parser/antlr/internal/InternalAlchemyLab.g:1:187: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\24\1\uffff\3\24\1\uffff\1\24\3\uffff\1\41\2\uffff\2"+
        "\24\1\uffff\2\24\32\uffff";
    static final String DFA12_eofS =
        "\55\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\uffff\1\157\1\145\1\157\1\uffff\1\146\3\uffff\1\76"+
        "\2\uffff\1\40\1\0\1\uffff\1\150\1\52\5\uffff\1\151\24\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\uffff\1\162\1\145\1\157\1\uffff\1\146\3\uffff"+
        "\1\76\2\uffff\1\u00fc\1\uffff\1\uffff\1\150\1\57\5\uffff\1\164\24"+
        "\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\uffff\1\10\1\11\1\12\1\uffff\1\14\1"+
        "\15\2\uffff\1\23\2\uffff\1\27\1\30\1\1\1\2\1\3\1\uffff\1\4\1\5\1"+
        "\6\1\7\1\10\1\11\1\12\1\13\1\16\1\14\1\15\1\21\1\22\1\23\1\24\1"+
        "\25\1\26\1\27\1\17\1\20";
    static final String DFA12_specialS =
        "\1\0\16\uffff\1\1\35\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\16\4\24\1\17\1\10\1"+
            "\11\1\24\1\15\1\24\1\13\1\24\1\22\12\20\1\12\2\24\1\14\47\24"+
            "\1\7\3\24\1\1\6\24\1\3\2\24\1\5\1\21\2\24\1\4\3\24\1\2\1\24"+
            "\1\6\uff82\24",
            "\1\25",
            "",
            "\1\30\2\uffff\1\27",
            "\1\31",
            "\1\32",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\40",
            "",
            "",
            "\1\44\40\uffff\32\44\3\uffff\1\44\2\uffff\32\44\111\uffff"+
            "\1\44\21\uffff\1\44\5\uffff\1\44\7\uffff\1\44\21\uffff\1\44"+
            "\5\uffff\1\44",
            "\0\45",
            "",
            "\1\47",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\54\12\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_STRING | RULE_NUMBER | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='w') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='-') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='+') ) {s = 13;}

                        else if ( (LA12_0=='\"') ) {s = 14;}

                        else if ( (LA12_0=='\'') ) {s = 15;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0==','||LA12_0=='.'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_15 = input.LA(1);

                        s = -1;
                        if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}