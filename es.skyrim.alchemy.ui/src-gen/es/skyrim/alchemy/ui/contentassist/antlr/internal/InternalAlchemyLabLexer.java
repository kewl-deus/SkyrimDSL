package es.skyrim.alchemy.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlchemyLabLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int RULE_STRONGID=7;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_NUMBER=6;
    public static final int T__14=14;
    public static final int T__13=13;
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
    public String getGrammarFileName() { return "../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:11:7: ( '+' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:11:9: '+'
            {
            match('+'); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:12:7: ( '-' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:12:9: '-'
            {
            match('-'); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:13:7: ( 'potion' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:13:9: 'potion'
            {
            match("potion"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:14:7: ( 'poison' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:14:9: 'poison'
            {
            match("poison"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:15:7: ( 'mixture' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:15:9: 'mixture'
            {
            match("mixture"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:16:7: ( 'effect' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:16:9: 'effect'
            {
            match("effect"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:17:7: ( '(' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:17:9: '('
            {
            match('('); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:18:7: ( ')' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:18:9: ')'
            {
            match(')'); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:19:7: ( ':' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:19:9: ':'
            {
            match(':'); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:20:7: ( '->' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:20:9: '->'
            {
            match("->"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:21:7: ( 'ealias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:21:9: 'ealias'
            {
            match("ealias"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:22:7: ( 'for' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:22:9: 'for'
            {
            match("for"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:23:7: ( 'ingredient' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:23:9: 'ingredient'
            {
            match("ingredient"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:24:7: ( '{' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:24:9: '{'
            {
            match('{'); 

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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:25:7: ( 'price:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:25:9: 'price:'
            {
            match("price:"); 


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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:26:7: ( 'weight:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:26:9: 'weight:'
            {
            match("weight:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:27:7: ( '}' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:27:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:28:7: ( 'source:' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:28:9: 'source:'
            {
            match("source:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:29:7: ( 'ialias' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:29:9: 'ialias'
            {
            match("ialias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:30:7: ( '=' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2304:9: ( '\"' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' | '\\u00DF' | '\\'' )+ '\"' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2304:11: '\"' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' | '\\u00DF' | '\\'' )+ '\"'
            {
            match('\"'); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2304:15: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2304:15: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2304:20: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '\\u00E4' | '\\u00C4' | '\\u00F6' | '\\u00D6' | '\\u00DC' | '\\u00FC' | '\\u00DF' | '\\'' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||LA2_0=='\''||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00C4'||LA2_0=='\u00D6'||LA2_0=='\u00DC'||LA2_0=='\u00DF'||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:
            	    {
            	    if ( input.LA(1)==' '||input.LA(1)=='\''||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
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

    // $ANTLR start "RULE_STRONGID"
    public final void mRULE_STRONGID() throws RecognitionException {
        try {
            int _type = RULE_STRONGID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2306:15: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2306:17: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2306:17: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2306:17: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2306:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRONGID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2308:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2308:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2308:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2308:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2308:66: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop5;
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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:15: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:27: ( '.' ( '0' .. '9' )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:32: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2310:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2312:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2312:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2312:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2312:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:41: ( '\\r' )? '\\n'
                    {
                    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2314:41: '\\r'
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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2316:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2316:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2316:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2318:16: ( . )
            // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:2318:18: .
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
        // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_STRONGID | RULE_STRING | RULE_NUMBER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=28;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:138: RULE_STRONGID
                {
                mRULE_STRONGID(); 

                }
                break;
            case 23 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:152: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:164: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 25 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:176: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:192: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:208: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../es.skyrim.alchemy.ui/src-gen/es/skyrim/alchemy/ui/contentassist/antlr/internal/InternalAlchemyLab.g:1:216: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\32\3\35\3\uffff\2\35\1\uffff\1\35\1\uffff\1\35\1\uffff"+
        "\2\27\1\uffff\1\27\1\uffff\1\27\5\uffff\2\35\1\uffff\3\35\3\uffff"+
        "\3\35\1\uffff\1\35\1\uffff\1\35\7\uffff\6\35\1\103\12\35\1\uffff"+
        "\16\35\1\134\1\135\1\uffff\1\35\1\137\1\140\1\35\1\142\2\35\2\uffff"+
        "\1\145\2\uffff\1\35\4\uffff\2\35\1\151\1\uffff";
    static final String DFA14_eofS =
        "\152\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\76\1\157\1\151\1\141\3\uffff\1\157\1\141\1\uffff"+
        "\1\145\1\uffff\1\157\1\uffff\1\40\1\101\1\uffff\1\0\1\uffff\1\52"+
        "\5\uffff\2\151\1\uffff\1\170\1\146\1\154\3\uffff\1\162\1\147\1\154"+
        "\1\uffff\1\151\1\uffff\1\165\7\uffff\1\151\1\163\1\143\1\164\1\145"+
        "\1\151\1\101\1\162\1\151\1\147\1\162\2\157\1\145\1\165\1\143\1\141"+
        "\1\uffff\1\145\1\141\1\150\1\143\2\156\1\72\1\162\1\164\1\163\1"+
        "\144\1\163\1\164\1\145\2\101\1\uffff\1\145\2\101\1\151\1\101\2\72"+
        "\2\uffff\1\101\2\uffff\1\145\4\uffff\1\156\1\164\1\101\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\76\1\162\1\151\1\146\3\uffff\1\157\1\156\1\uffff"+
        "\1\145\1\uffff\1\157\1\uffff\1\u00fc\1\172\1\uffff\1\uffff\1\uffff"+
        "\1\57\5\uffff\1\164\1\151\1\uffff\1\170\1\146\1\154\3\uffff\1\162"+
        "\1\147\1\154\1\uffff\1\151\1\uffff\1\165\7\uffff\1\151\1\163\1\143"+
        "\1\164\1\145\1\151\1\172\1\162\1\151\1\147\1\162\2\157\1\145\1\165"+
        "\1\143\1\141\1\uffff\1\145\1\141\1\150\1\143\2\156\1\72\1\162\1"+
        "\164\1\163\1\144\1\163\1\164\1\145\2\172\1\uffff\1\145\2\172\1\151"+
        "\1\172\2\72\2\uffff\1\172\2\uffff\1\145\4\uffff\1\156\1\164\1\172"+
        "\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\4\uffff\1\7\1\10\1\11\2\uffff\1\16\1\uffff\1\21\1"+
        "\uffff\1\24\2\uffff\1\26\1\uffff\1\30\1\uffff\1\33\1\34\1\1\1\12"+
        "\1\2\2\uffff\1\26\3\uffff\1\7\1\10\1\11\3\uffff\1\16\1\uffff\1\21"+
        "\1\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33\21\uffff\1\14\20\uffff"+
        "\1\17\7\uffff\1\3\1\4\1\uffff\1\6\1\13\1\uffff\1\23\1\20\1\22\1"+
        "\5\3\uffff\1\15";
    static final String DFA14_specialS =
        "\1\0\22\uffff\1\1\126\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\20\4\27\1\23\1\6\1"+
            "\7\1\27\1\1\1\27\1\2\1\27\1\25\12\24\1\10\2\27\1\17\3\27\32"+
            "\22\3\27\1\21\1\22\1\27\4\22\1\5\1\11\2\22\1\12\3\22\1\4\2\22"+
            "\1\3\2\22\1\16\3\22\1\14\3\22\1\13\1\27\1\15\uff82\27",
            "",
            "\1\31",
            "\1\33\2\uffff\1\34",
            "\1\36",
            "\1\40\4\uffff\1\37",
            "",
            "",
            "",
            "\1\44",
            "\1\46\14\uffff\1\45",
            "",
            "\1\50",
            "",
            "\1\52",
            "",
            "\1\54\6\uffff\1\54\31\uffff\32\54\3\uffff\1\54\2\uffff\32"+
            "\54\111\uffff\1\54\21\uffff\1\54\5\uffff\1\54\2\uffff\1\54\4"+
            "\uffff\1\54\21\uffff\1\54\5\uffff\1\54",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\0\55",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "\1\63\12\uffff\1\62",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
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
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\136",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\141",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\143",
            "\1\144",
            "",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\146",
            "",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_STRONGID | RULE_STRING | RULE_NUMBER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='+') ) {s = 1;}

                        else if ( (LA14_0=='-') ) {s = 2;}

                        else if ( (LA14_0=='p') ) {s = 3;}

                        else if ( (LA14_0=='m') ) {s = 4;}

                        else if ( (LA14_0=='e') ) {s = 5;}

                        else if ( (LA14_0=='(') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0==':') ) {s = 8;}

                        else if ( (LA14_0=='f') ) {s = 9;}

                        else if ( (LA14_0=='i') ) {s = 10;}

                        else if ( (LA14_0=='{') ) {s = 11;}

                        else if ( (LA14_0=='w') ) {s = 12;}

                        else if ( (LA14_0=='}') ) {s = 13;}

                        else if ( (LA14_0=='s') ) {s = 14;}

                        else if ( (LA14_0=='=') ) {s = 15;}

                        else if ( (LA14_0=='\"') ) {s = 16;}

                        else if ( (LA14_0=='^') ) {s = 17;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 18;}

                        else if ( (LA14_0=='\'') ) {s = 19;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 20;}

                        else if ( (LA14_0=='/') ) {s = 21;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 22;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||LA14_0=='*'||LA14_0==','||LA14_0=='.'||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='\u0000' && LA14_19<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}