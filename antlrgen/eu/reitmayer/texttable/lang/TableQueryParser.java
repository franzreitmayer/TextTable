// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g 2013-02-24 08:28:12

package eu.reitmayer.texttable.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TableQueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ALL", "AND", "AS", "BOOL_NOT", "BUT", "COLUMN_LIST", "COLUMN_SPEC", "CONCAT", "DELETE", "DROP", "Digit", "EQUALS", "FALSE", "ID", "INT", "LOWER_CASE", "Letter", "MATCHES", "ML", "NOT", "NUM", "OR", "RANDOM_LIST", "RANDOM_STRING", "REPLACE", "ROW_NUMBER", "SELECT", "SET", "SL", "STRING", "SUB_STRING", "TEXT", "TEXTNUM", "TRUE", "UPDATE", "UPDATE_VAL_ELEM", "UPDATE_VAL_LIST", "UPPER_CASE", "WHERE", "WITH", "WS", "'('", "')'", "','"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TableQueryParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TableQueryParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TableQueryParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g"; }


    public List<RecognitionException> errors = new ArrayList<RecognitionException>();

    public void reportError(RecognitionException e) {
    	super.reportError(e);
    	if (e.token.getType() != EOF)
    	errors.add(e);
    }


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:41:1: statement : ( select_statement | update_statement | delete_statement );
    public final TableQueryParser.statement_return statement() throws RecognitionException {
        TableQueryParser.statement_return retval = new TableQueryParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        TableQueryParser.select_statement_return select_statement1 =null;

        TableQueryParser.update_statement_return update_statement2 =null;

        TableQueryParser.delete_statement_return delete_statement3 =null;



        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:41:10: ( select_statement | update_statement | delete_statement )
            int alt1=3;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt1=1;
                }
                break;
            case UPDATE:
                {
                alt1=2;
                }
                break;
            case DELETE:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:42:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_statement106);
                    select_statement1=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement1.getTree());

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:44:3: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_statement114);
                    update_statement2=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement2.getTree());

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:46:3: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_statement122);
                    delete_statement3=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class select_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_statement"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:51:1: select_statement : SELECT col_list= column_list ( WHERE bex= bool_expression )? -> ^( SELECT $col_list ( $bex)? ) ;
    public final TableQueryParser.select_statement_return select_statement() throws RecognitionException {
        TableQueryParser.select_statement_return retval = new TableQueryParser.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SELECT4=null;
        Token WHERE5=null;
        TableQueryParser.column_list_return col_list =null;

        TableQueryParser.bool_expression_return bex =null;


        CommonTree SELECT4_tree=null;
        CommonTree WHERE5_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_bool_expression=new RewriteRuleSubtreeStream(adaptor,"rule bool_expression");
        RewriteRuleSubtreeStream stream_column_list=new RewriteRuleSubtreeStream(adaptor,"rule column_list");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:51:17: ( SELECT col_list= column_list ( WHERE bex= bool_expression )? -> ^( SELECT $col_list ( $bex)? ) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:52:2: SELECT col_list= column_list ( WHERE bex= bool_expression )?
            {
            SELECT4=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement135);  
            stream_SELECT.add(SELECT4);


            pushFollow(FOLLOW_column_list_in_select_statement139);
            col_list=column_list();

            state._fsp--;

            stream_column_list.add(col_list.getTree());

            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:52:30: ( WHERE bex= bool_expression )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:52:31: WHERE bex= bool_expression
                    {
                    WHERE5=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_statement142);  
                    stream_WHERE.add(WHERE5);


                    pushFollow(FOLLOW_bool_expression_in_select_statement146);
                    bex=bool_expression();

                    state._fsp--;

                    stream_bool_expression.add(bex.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: col_list, SELECT, bex
            // token labels: 
            // rule labels: retval, bex, col_list
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_bex=new RewriteRuleSubtreeStream(adaptor,"rule bex",bex!=null?bex.tree:null);
            RewriteRuleSubtreeStream stream_col_list=new RewriteRuleSubtreeStream(adaptor,"rule col_list",col_list!=null?col_list.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:59: -> ^( SELECT $col_list ( $bex)? )
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:52:62: ^( SELECT $col_list ( $bex)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_SELECT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_col_list.nextTree());

                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:52:82: ( $bex)?
                if ( stream_bex.hasNext() ) {
                    adaptor.addChild(root_1, stream_bex.nextTree());

                }
                stream_bex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_statement"


    public static class update_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_statement"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:55:1: update_statement : UPDATE SET uval= update_value_list ( WHERE b= bool_expression )? -> ^( UPDATE $uval ( $b)? ) ;
    public final TableQueryParser.update_statement_return update_statement() throws RecognitionException {
        TableQueryParser.update_statement_return retval = new TableQueryParser.update_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token UPDATE6=null;
        Token SET7=null;
        Token WHERE8=null;
        TableQueryParser.update_value_list_return uval =null;

        TableQueryParser.bool_expression_return b =null;


        CommonTree UPDATE6_tree=null;
        CommonTree SET7_tree=null;
        CommonTree WHERE8_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleSubtreeStream stream_bool_expression=new RewriteRuleSubtreeStream(adaptor,"rule bool_expression");
        RewriteRuleSubtreeStream stream_update_value_list=new RewriteRuleSubtreeStream(adaptor,"rule update_value_list");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:55:17: ( UPDATE SET uval= update_value_list ( WHERE b= bool_expression )? -> ^( UPDATE $uval ( $b)? ) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:56:2: UPDATE SET uval= update_value_list ( WHERE b= bool_expression )?
            {
            UPDATE6=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement170);  
            stream_UPDATE.add(UPDATE6);


            SET7=(Token)match(input,SET,FOLLOW_SET_in_update_statement172);  
            stream_SET.add(SET7);


            pushFollow(FOLLOW_update_value_list_in_update_statement176);
            uval=update_value_list();

            state._fsp--;

            stream_update_value_list.add(uval.getTree());

            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:56:36: ( WHERE b= bool_expression )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:56:37: WHERE b= bool_expression
                    {
                    WHERE8=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_statement179);  
                    stream_WHERE.add(WHERE8);


                    pushFollow(FOLLOW_bool_expression_in_update_statement183);
                    b=bool_expression();

                    state._fsp--;

                    stream_bool_expression.add(b.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: uval, UPDATE, b
            // token labels: 
            // rule labels: retval, b, uval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_uval=new RewriteRuleSubtreeStream(adaptor,"rule uval",uval!=null?uval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:63: -> ^( UPDATE $uval ( $b)? )
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:56:66: ^( UPDATE $uval ( $b)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_UPDATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_uval.nextTree());

                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:56:82: ( $b)?
                if ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_statement"


    public static class delete_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_statement"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:59:1: delete_statement : DELETE WHERE b= bool_expression -> ^( DELETE $b) ;
    public final TableQueryParser.delete_statement_return delete_statement() throws RecognitionException {
        TableQueryParser.delete_statement_return retval = new TableQueryParser.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DELETE9=null;
        Token WHERE10=null;
        TableQueryParser.bool_expression_return b =null;


        CommonTree DELETE9_tree=null;
        CommonTree WHERE10_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleSubtreeStream stream_bool_expression=new RewriteRuleSubtreeStream(adaptor,"rule bool_expression");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:59:17: ( DELETE WHERE b= bool_expression -> ^( DELETE $b) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:60:2: DELETE WHERE b= bool_expression
            {
            DELETE9=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement207);  
            stream_DELETE.add(DELETE9);


            WHERE10=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_statement209);  
            stream_WHERE.add(WHERE10);


            pushFollow(FOLLOW_bool_expression_in_delete_statement213);
            b=bool_expression();

            state._fsp--;

            stream_bool_expression.add(b.getTree());

            // AST REWRITE
            // elements: b, DELETE
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:33: -> ^( DELETE $b)
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:60:36: ^( DELETE $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_DELETE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_statement"


    public static class column_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_list"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:69:1: column_list : (cspec+= column_spec ( ',' cspec+= column_spec )* -> ^( COLUMN_LIST ( $cspec)+ ) | ALL -> ^( COLUMN_LIST ALL ) );
    public final TableQueryParser.column_list_return column_list() throws RecognitionException {
        TableQueryParser.column_list_return retval = new TableQueryParser.column_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal11=null;
        Token ALL12=null;
        List list_cspec=null;
        RuleReturnScope cspec = null;
        CommonTree char_literal11_tree=null;
        CommonTree ALL12_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_column_spec=new RewriteRuleSubtreeStream(adaptor,"rule column_spec");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:69:12: (cspec+= column_spec ( ',' cspec+= column_spec )* -> ^( COLUMN_LIST ( $cspec)+ ) | ALL -> ^( COLUMN_LIST ALL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||LA5_0==LOWER_CASE||(LA5_0 >= RANDOM_LIST && LA5_0 <= ROW_NUMBER)||(LA5_0 >= STRING && LA5_0 <= SUB_STRING)||LA5_0==UPPER_CASE) ) {
                alt5=1;
            }
            else if ( (LA5_0==ALL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:70:2: cspec+= column_spec ( ',' cspec+= column_spec )*
                    {
                    pushFollow(FOLLOW_column_spec_in_column_list239);
                    cspec=column_spec();

                    state._fsp--;

                    stream_column_spec.add(cspec.getTree());
                    if (list_cspec==null) list_cspec=new ArrayList();
                    list_cspec.add(cspec.getTree());


                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:70:21: ( ',' cspec+= column_spec )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==48) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:70:22: ',' cspec+= column_spec
                    	    {
                    	    char_literal11=(Token)match(input,48,FOLLOW_48_in_column_list242);  
                    	    stream_48.add(char_literal11);


                    	    pushFollow(FOLLOW_column_spec_in_column_list246);
                    	    cspec=column_spec();

                    	    state._fsp--;

                    	    stream_column_spec.add(cspec.getTree());
                    	    if (list_cspec==null) list_cspec=new ArrayList();
                    	    list_cspec.add(cspec.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: cspec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: cspec
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cspec=new RewriteRuleSubtreeStream(adaptor,"token cspec",list_cspec);
                    root_0 = (CommonTree)adaptor.nil();
                    // 70:47: -> ^( COLUMN_LIST ( $cspec)+ )
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:70:50: ^( COLUMN_LIST ( $cspec)+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                        , root_1);

                        if ( !(stream_cspec.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cspec.hasNext() ) {
                            adaptor.addChild(root_1, stream_cspec.nextTree());

                        }
                        stream_cspec.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:72:2: ALL
                    {
                    ALL12=(Token)match(input,ALL,FOLLOW_ALL_in_column_list264);  
                    stream_ALL.add(ALL12);


                    // AST REWRITE
                    // elements: ALL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:6: -> ^( COLUMN_LIST ALL )
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:72:9: ^( COLUMN_LIST ALL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLUMN_LIST, "COLUMN_LIST")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ALL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_list"


    public static class column_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_spec"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:85:1: column_spec : sexp= string_expression ( AS alias= ID )? -> ^( COLUMN_SPEC $sexp ( $alias)? ) ;
    public final TableQueryParser.column_spec_return column_spec() throws RecognitionException {
        TableQueryParser.column_spec_return retval = new TableQueryParser.column_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token alias=null;
        Token AS13=null;
        TableQueryParser.string_expression_return sexp =null;


        CommonTree alias_tree=null;
        CommonTree AS13_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_string_expression=new RewriteRuleSubtreeStream(adaptor,"rule string_expression");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:85:12: (sexp= string_expression ( AS alias= ID )? -> ^( COLUMN_SPEC $sexp ( $alias)? ) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:86:2: sexp= string_expression ( AS alias= ID )?
            {
            pushFollow(FOLLOW_string_expression_in_column_spec297);
            sexp=string_expression();

            state._fsp--;

            stream_string_expression.add(sexp.getTree());

            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:86:26: ( AS alias= ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:86:27: AS alias= ID
                    {
                    AS13=(Token)match(input,AS,FOLLOW_AS_in_column_spec300);  
                    stream_AS.add(AS13);


                    alias=(Token)match(input,ID,FOLLOW_ID_in_column_spec304);  
                    stream_ID.add(alias);


                    }
                    break;

            }


            // AST REWRITE
            // elements: sexp, alias
            // token labels: alias
            // rule labels: retval, sexp
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sexp=new RewriteRuleSubtreeStream(adaptor,"rule sexp",sexp!=null?sexp.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 86:41: -> ^( COLUMN_SPEC $sexp ( $alias)? )
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:86:44: ^( COLUMN_SPEC $sexp ( $alias)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN_SPEC, "COLUMN_SPEC")
                , root_1);

                adaptor.addChild(root_1, stream_sexp.nextTree());

                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:86:65: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextNode());

                }
                stream_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_spec"


    public static class update_value_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_value_list"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:89:1: update_value_list :uval_elem+= update_value_element ( ',' uval_elem+= update_value_element )* -> ^( UPDATE_VAL_LIST ( $uval_elem)+ ) ;
    public final TableQueryParser.update_value_list_return update_value_list() throws RecognitionException {
        TableQueryParser.update_value_list_return retval = new TableQueryParser.update_value_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal14=null;
        List list_uval_elem=null;
        RuleReturnScope uval_elem = null;
        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_update_value_element=new RewriteRuleSubtreeStream(adaptor,"rule update_value_element");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:89:18: (uval_elem+= update_value_element ( ',' uval_elem+= update_value_element )* -> ^( UPDATE_VAL_LIST ( $uval_elem)+ ) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:90:3: uval_elem+= update_value_element ( ',' uval_elem+= update_value_element )*
            {
            pushFollow(FOLLOW_update_value_element_in_update_value_list333);
            uval_elem=update_value_element();

            state._fsp--;

            stream_update_value_element.add(uval_elem.getTree());
            if (list_uval_elem==null) list_uval_elem=new ArrayList();
            list_uval_elem.add(uval_elem.getTree());


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:90:35: ( ',' uval_elem+= update_value_element )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:90:36: ',' uval_elem+= update_value_element
            	    {
            	    char_literal14=(Token)match(input,48,FOLLOW_48_in_update_value_list336);  
            	    stream_48.add(char_literal14);


            	    pushFollow(FOLLOW_update_value_element_in_update_value_list340);
            	    uval_elem=update_value_element();

            	    state._fsp--;

            	    stream_update_value_element.add(uval_elem.getTree());
            	    if (list_uval_elem==null) list_uval_elem=new ArrayList();
            	    list_uval_elem.add(uval_elem.getTree());


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: uval_elem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: uval_elem
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_uval_elem=new RewriteRuleSubtreeStream(adaptor,"token uval_elem",list_uval_elem);
            root_0 = (CommonTree)adaptor.nil();
            // 90:74: -> ^( UPDATE_VAL_LIST ( $uval_elem)+ )
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:90:77: ^( UPDATE_VAL_LIST ( $uval_elem)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_VAL_LIST, "UPDATE_VAL_LIST")
                , root_1);

                if ( !(stream_uval_elem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_uval_elem.hasNext() ) {
                    adaptor.addChild(root_1, stream_uval_elem.nextTree());

                }
                stream_uval_elem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_value_list"


    public static class update_value_element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_value_element"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:93:1: update_value_element : id= ID '=' sexp= string_expression -> ^( UPDATE_VAL_ELEM $id $sexp) ;
    public final TableQueryParser.update_value_element_return update_value_element() throws RecognitionException {
        TableQueryParser.update_value_element_return retval = new TableQueryParser.update_value_element_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id=null;
        Token char_literal15=null;
        TableQueryParser.string_expression_return sexp =null;


        CommonTree id_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_string_expression=new RewriteRuleSubtreeStream(adaptor,"rule string_expression");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:93:21: (id= ID '=' sexp= string_expression -> ^( UPDATE_VAL_ELEM $id $sexp) )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:94:2: id= ID '=' sexp= string_expression
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_update_value_element367);  
            stream_ID.add(id);


            char_literal15=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_value_element369);  
            stream_EQUALS.add(char_literal15);


            pushFollow(FOLLOW_string_expression_in_update_value_element373);
            sexp=string_expression();

            state._fsp--;

            stream_string_expression.add(sexp.getTree());

            // AST REWRITE
            // elements: sexp, id
            // token labels: id
            // rule labels: retval, sexp
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sexp=new RewriteRuleSubtreeStream(adaptor,"rule sexp",sexp!=null?sexp.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:35: -> ^( UPDATE_VAL_ELEM $id $sexp)
            {
                // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:94:38: ^( UPDATE_VAL_ELEM $id $sexp)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_VAL_ELEM, "UPDATE_VAL_ELEM")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextNode());

                adaptor.addChild(root_1, stream_sexp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_value_element"


    public static class string_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_expression"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:98:1: string_expression :cex+= concated_expression ( CONCAT ^cex+= concated_expression )* ;
    public final TableQueryParser.string_expression_return string_expression() throws RecognitionException {
        TableQueryParser.string_expression_return retval = new TableQueryParser.string_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CONCAT16=null;
        List list_cex=null;
        RuleReturnScope cex = null;
        CommonTree CONCAT16_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:98:18: (cex+= concated_expression ( CONCAT ^cex+= concated_expression )* )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:99:2: cex+= concated_expression ( CONCAT ^cex+= concated_expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_concated_expression_in_string_expression399);
            cex=concated_expression();

            state._fsp--;

            adaptor.addChild(root_0, cex.getTree());
            if (list_cex==null) list_cex=new ArrayList();
            list_cex.add(cex.getTree());


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:99:27: ( CONCAT ^cex+= concated_expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CONCAT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:99:28: CONCAT ^cex+= concated_expression
            	    {
            	    CONCAT16=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_string_expression402); 
            	    CONCAT16_tree = 
            	    (CommonTree)adaptor.create(CONCAT16)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(CONCAT16_tree, root_0);


            	    pushFollow(FOLLOW_concated_expression_in_string_expression407);
            	    cex=concated_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cex.getTree());
            	    if (list_cex==null) list_cex=new ArrayList();
            	    list_cex.add(cex.getTree());


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_expression"


    public static class concated_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concated_expression"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:102:1: concated_expression : ( ID -> ID | STRING -> STRING | built_in_func -> built_in_func );
    public final TableQueryParser.concated_expression_return concated_expression() throws RecognitionException {
        TableQueryParser.concated_expression_return retval = new TableQueryParser.concated_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID17=null;
        Token STRING18=null;
        TableQueryParser.built_in_func_return built_in_func19 =null;


        CommonTree ID17_tree=null;
        CommonTree STRING18_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_built_in_func=new RewriteRuleSubtreeStream(adaptor,"rule built_in_func");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:102:20: ( ID -> ID | STRING -> STRING | built_in_func -> built_in_func )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case STRING:
                {
                alt9=2;
                }
                break;
            case LOWER_CASE:
            case RANDOM_LIST:
            case RANDOM_STRING:
            case REPLACE:
            case ROW_NUMBER:
            case SUB_STRING:
            case UPPER_CASE:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:103:2: ID
                    {
                    ID17=(Token)match(input,ID,FOLLOW_ID_in_concated_expression419);  
                    stream_ID.add(ID17);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:5: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:105:2: STRING
                    {
                    STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_concated_expression429);  
                    stream_STRING.add(STRING18);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 105:9: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:107:2: built_in_func
                    {
                    pushFollow(FOLLOW_built_in_func_in_concated_expression439);
                    built_in_func19=built_in_func();

                    state._fsp--;

                    stream_built_in_func.add(built_in_func19.getTree());

                    // AST REWRITE
                    // elements: built_in_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 107:16: -> built_in_func
                    {
                        adaptor.addChild(root_0, stream_built_in_func.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "concated_expression"


    public static class built_in_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "built_in_func"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:110:1: built_in_func : ( SUB_STRING '(' sexp= string_expression ',' start_pos= INT ',' end_pos= INT ')' -> ^( SUB_STRING $sexp $start_pos $end_pos) | LOWER_CASE '(' sexp= string_expression ')' -> ^( LOWER_CASE $sexp) | UPPER_CASE '(' sexp= string_expression ')' -> ^( UPPER_CASE $sexp) | ROW_NUMBER -> ^( ROW_NUMBER ) | REPLACE '(' sexp1= string_expression ',' sexp2= string_expression ',' sexp3= string_expression ')' -> ^( REPLACE $sexp1 $sexp2 $sexp3) | RANDOM_STRING '(' min= INT ',' max= INT ',' (mod= STRING |mod= TEXT |mod= TEXTNUM |mod= NUM ) ')' -> ^( RANDOM_STRING $min $max $mod) | RANDOM_LIST '(' se+= string_expression ( ',' se+= string_expression )* ')' -> ^( RANDOM_LIST ( $se)+ ) );
    public final TableQueryParser.built_in_func_return built_in_func() throws RecognitionException {
        TableQueryParser.built_in_func_return retval = new TableQueryParser.built_in_func_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token start_pos=null;
        Token end_pos=null;
        Token min=null;
        Token max=null;
        Token mod=null;
        Token SUB_STRING20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token char_literal24=null;
        Token LOWER_CASE25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token UPPER_CASE28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token ROW_NUMBER31=null;
        Token REPLACE32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token RANDOM_STRING37=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token RANDOM_LIST42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        List list_se=null;
        TableQueryParser.string_expression_return sexp =null;

        TableQueryParser.string_expression_return sexp1 =null;

        TableQueryParser.string_expression_return sexp2 =null;

        TableQueryParser.string_expression_return sexp3 =null;

        RuleReturnScope se = null;
        CommonTree start_pos_tree=null;
        CommonTree end_pos_tree=null;
        CommonTree min_tree=null;
        CommonTree max_tree=null;
        CommonTree mod_tree=null;
        CommonTree SUB_STRING20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree LOWER_CASE25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree UPPER_CASE28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree ROW_NUMBER31_tree=null;
        CommonTree REPLACE32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree RANDOM_STRING37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree RANDOM_LIST42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_REPLACE=new RewriteRuleTokenStream(adaptor,"token REPLACE");
        RewriteRuleTokenStream stream_RANDOM_STRING=new RewriteRuleTokenStream(adaptor,"token RANDOM_STRING");
        RewriteRuleTokenStream stream_SUB_STRING=new RewriteRuleTokenStream(adaptor,"token SUB_STRING");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_RANDOM_LIST=new RewriteRuleTokenStream(adaptor,"token RANDOM_LIST");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_LOWER_CASE=new RewriteRuleTokenStream(adaptor,"token LOWER_CASE");
        RewriteRuleTokenStream stream_UPPER_CASE=new RewriteRuleTokenStream(adaptor,"token UPPER_CASE");
        RewriteRuleTokenStream stream_ROW_NUMBER=new RewriteRuleTokenStream(adaptor,"token ROW_NUMBER");
        RewriteRuleTokenStream stream_TEXTNUM=new RewriteRuleTokenStream(adaptor,"token TEXTNUM");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_string_expression=new RewriteRuleSubtreeStream(adaptor,"rule string_expression");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:110:14: ( SUB_STRING '(' sexp= string_expression ',' start_pos= INT ',' end_pos= INT ')' -> ^( SUB_STRING $sexp $start_pos $end_pos) | LOWER_CASE '(' sexp= string_expression ')' -> ^( LOWER_CASE $sexp) | UPPER_CASE '(' sexp= string_expression ')' -> ^( UPPER_CASE $sexp) | ROW_NUMBER -> ^( ROW_NUMBER ) | REPLACE '(' sexp1= string_expression ',' sexp2= string_expression ',' sexp3= string_expression ')' -> ^( REPLACE $sexp1 $sexp2 $sexp3) | RANDOM_STRING '(' min= INT ',' max= INT ',' (mod= STRING |mod= TEXT |mod= TEXTNUM |mod= NUM ) ')' -> ^( RANDOM_STRING $min $max $mod) | RANDOM_LIST '(' se+= string_expression ( ',' se+= string_expression )* ')' -> ^( RANDOM_LIST ( $se)+ ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case SUB_STRING:
                {
                alt12=1;
                }
                break;
            case LOWER_CASE:
                {
                alt12=2;
                }
                break;
            case UPPER_CASE:
                {
                alt12=3;
                }
                break;
            case ROW_NUMBER:
                {
                alt12=4;
                }
                break;
            case REPLACE:
                {
                alt12=5;
                }
                break;
            case RANDOM_STRING:
                {
                alt12=6;
                }
                break;
            case RANDOM_LIST:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:111:2: SUB_STRING '(' sexp= string_expression ',' start_pos= INT ',' end_pos= INT ')'
                    {
                    SUB_STRING20=(Token)match(input,SUB_STRING,FOLLOW_SUB_STRING_in_built_in_func454);  
                    stream_SUB_STRING.add(SUB_STRING20);


                    char_literal21=(Token)match(input,46,FOLLOW_46_in_built_in_func456);  
                    stream_46.add(char_literal21);


                    pushFollow(FOLLOW_string_expression_in_built_in_func462);
                    sexp=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp.getTree());

                    char_literal22=(Token)match(input,48,FOLLOW_48_in_built_in_func464);  
                    stream_48.add(char_literal22);


                    start_pos=(Token)match(input,INT,FOLLOW_INT_in_built_in_func468);  
                    stream_INT.add(start_pos);


                    char_literal23=(Token)match(input,48,FOLLOW_48_in_built_in_func470);  
                    stream_48.add(char_literal23);


                    end_pos=(Token)match(input,INT,FOLLOW_INT_in_built_in_func474);  
                    stream_INT.add(end_pos);


                    char_literal24=(Token)match(input,47,FOLLOW_47_in_built_in_func476);  
                    stream_47.add(char_literal24);


                    // AST REWRITE
                    // elements: sexp, start_pos, SUB_STRING, end_pos
                    // token labels: start_pos, end_pos
                    // rule labels: retval, sexp
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_start_pos=new RewriteRuleTokenStream(adaptor,"token start_pos",start_pos);
                    RewriteRuleTokenStream stream_end_pos=new RewriteRuleTokenStream(adaptor,"token end_pos",end_pos);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sexp=new RewriteRuleSubtreeStream(adaptor,"rule sexp",sexp!=null?sexp.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 111:80: -> ^( SUB_STRING $sexp $start_pos $end_pos)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:111:83: ^( SUB_STRING $sexp $start_pos $end_pos)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_SUB_STRING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_sexp.nextTree());

                        adaptor.addChild(root_1, stream_start_pos.nextNode());

                        adaptor.addChild(root_1, stream_end_pos.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:113:2: LOWER_CASE '(' sexp= string_expression ')'
                    {
                    LOWER_CASE25=(Token)match(input,LOWER_CASE,FOLLOW_LOWER_CASE_in_built_in_func497);  
                    stream_LOWER_CASE.add(LOWER_CASE25);


                    char_literal26=(Token)match(input,46,FOLLOW_46_in_built_in_func499);  
                    stream_46.add(char_literal26);


                    pushFollow(FOLLOW_string_expression_in_built_in_func504);
                    sexp=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp.getTree());

                    char_literal27=(Token)match(input,47,FOLLOW_47_in_built_in_func506);  
                    stream_47.add(char_literal27);


                    // AST REWRITE
                    // elements: LOWER_CASE, sexp
                    // token labels: 
                    // rule labels: retval, sexp
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sexp=new RewriteRuleSubtreeStream(adaptor,"rule sexp",sexp!=null?sexp.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 113:45: -> ^( LOWER_CASE $sexp)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:113:48: ^( LOWER_CASE $sexp)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_LOWER_CASE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_sexp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:115:2: UPPER_CASE '(' sexp= string_expression ')'
                    {
                    UPPER_CASE28=(Token)match(input,UPPER_CASE,FOLLOW_UPPER_CASE_in_built_in_func521);  
                    stream_UPPER_CASE.add(UPPER_CASE28);


                    char_literal29=(Token)match(input,46,FOLLOW_46_in_built_in_func523);  
                    stream_46.add(char_literal29);


                    pushFollow(FOLLOW_string_expression_in_built_in_func529);
                    sexp=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp.getTree());

                    char_literal30=(Token)match(input,47,FOLLOW_47_in_built_in_func531);  
                    stream_47.add(char_literal30);


                    // AST REWRITE
                    // elements: UPPER_CASE, sexp
                    // token labels: 
                    // rule labels: retval, sexp
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sexp=new RewriteRuleSubtreeStream(adaptor,"rule sexp",sexp!=null?sexp.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:46: -> ^( UPPER_CASE $sexp)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:115:49: ^( UPPER_CASE $sexp)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_UPPER_CASE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_sexp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:117:2: ROW_NUMBER
                    {
                    ROW_NUMBER31=(Token)match(input,ROW_NUMBER,FOLLOW_ROW_NUMBER_in_built_in_func546);  
                    stream_ROW_NUMBER.add(ROW_NUMBER31);


                    // AST REWRITE
                    // elements: ROW_NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:13: -> ^( ROW_NUMBER )
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:117:16: ^( ROW_NUMBER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ROW_NUMBER.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:119:2: REPLACE '(' sexp1= string_expression ',' sexp2= string_expression ',' sexp3= string_expression ')'
                    {
                    REPLACE32=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_built_in_func558);  
                    stream_REPLACE.add(REPLACE32);


                    char_literal33=(Token)match(input,46,FOLLOW_46_in_built_in_func560);  
                    stream_46.add(char_literal33);


                    pushFollow(FOLLOW_string_expression_in_built_in_func564);
                    sexp1=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp1.getTree());

                    char_literal34=(Token)match(input,48,FOLLOW_48_in_built_in_func566);  
                    stream_48.add(char_literal34);


                    pushFollow(FOLLOW_string_expression_in_built_in_func571);
                    sexp2=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp2.getTree());

                    char_literal35=(Token)match(input,48,FOLLOW_48_in_built_in_func573);  
                    stream_48.add(char_literal35);


                    pushFollow(FOLLOW_string_expression_in_built_in_func577);
                    sexp3=string_expression();

                    state._fsp--;

                    stream_string_expression.add(sexp3.getTree());

                    char_literal36=(Token)match(input,47,FOLLOW_47_in_built_in_func579);  
                    stream_47.add(char_literal36);


                    // AST REWRITE
                    // elements: sexp3, sexp1, REPLACE, sexp2
                    // token labels: 
                    // rule labels: retval, sexp1, sexp3, sexp2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_sexp1=new RewriteRuleSubtreeStream(adaptor,"rule sexp1",sexp1!=null?sexp1.tree:null);
                    RewriteRuleSubtreeStream stream_sexp3=new RewriteRuleSubtreeStream(adaptor,"rule sexp3",sexp3!=null?sexp3.tree:null);
                    RewriteRuleSubtreeStream stream_sexp2=new RewriteRuleSubtreeStream(adaptor,"rule sexp2",sexp2!=null?sexp2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:99: -> ^( REPLACE $sexp1 $sexp2 $sexp3)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:119:102: ^( REPLACE $sexp1 $sexp2 $sexp3)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_REPLACE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_sexp1.nextTree());

                        adaptor.addChild(root_1, stream_sexp2.nextTree());

                        adaptor.addChild(root_1, stream_sexp3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:2: RANDOM_STRING '(' min= INT ',' max= INT ',' (mod= STRING |mod= TEXT |mod= TEXTNUM |mod= NUM ) ')'
                    {
                    RANDOM_STRING37=(Token)match(input,RANDOM_STRING,FOLLOW_RANDOM_STRING_in_built_in_func600);  
                    stream_RANDOM_STRING.add(RANDOM_STRING37);


                    char_literal38=(Token)match(input,46,FOLLOW_46_in_built_in_func602);  
                    stream_46.add(char_literal38);


                    min=(Token)match(input,INT,FOLLOW_INT_in_built_in_func606);  
                    stream_INT.add(min);


                    char_literal39=(Token)match(input,48,FOLLOW_48_in_built_in_func608);  
                    stream_48.add(char_literal39);


                    max=(Token)match(input,INT,FOLLOW_INT_in_built_in_func612);  
                    stream_INT.add(max);


                    char_literal40=(Token)match(input,48,FOLLOW_48_in_built_in_func614);  
                    stream_48.add(char_literal40);


                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:44: (mod= STRING |mod= TEXT |mod= TEXTNUM |mod= NUM )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case STRING:
                        {
                        alt10=1;
                        }
                        break;
                    case TEXT:
                        {
                        alt10=2;
                        }
                        break;
                    case TEXTNUM:
                        {
                        alt10=3;
                        }
                        break;
                    case NUM:
                        {
                        alt10=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }

                    switch (alt10) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:45: mod= STRING
                            {
                            mod=(Token)match(input,STRING,FOLLOW_STRING_in_built_in_func619);  
                            stream_STRING.add(mod);


                            }
                            break;
                        case 2 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:58: mod= TEXT
                            {
                            mod=(Token)match(input,TEXT,FOLLOW_TEXT_in_built_in_func625);  
                            stream_TEXT.add(mod);


                            }
                            break;
                        case 3 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:69: mod= TEXTNUM
                            {
                            mod=(Token)match(input,TEXTNUM,FOLLOW_TEXTNUM_in_built_in_func633);  
                            stream_TEXTNUM.add(mod);


                            }
                            break;
                        case 4 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:85: mod= NUM
                            {
                            mod=(Token)match(input,NUM,FOLLOW_NUM_in_built_in_func639);  
                            stream_NUM.add(mod);


                            }
                            break;

                    }


                    char_literal41=(Token)match(input,47,FOLLOW_47_in_built_in_func642);  
                    stream_47.add(char_literal41);


                    // AST REWRITE
                    // elements: max, RANDOM_STRING, mod, min
                    // token labels: min, max, mod
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_min=new RewriteRuleTokenStream(adaptor,"token min",min);
                    RewriteRuleTokenStream stream_max=new RewriteRuleTokenStream(adaptor,"token max",max);
                    RewriteRuleTokenStream stream_mod=new RewriteRuleTokenStream(adaptor,"token mod",mod);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 121:98: -> ^( RANDOM_STRING $min $max $mod)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:121:101: ^( RANDOM_STRING $min $max $mod)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RANDOM_STRING.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_min.nextNode());

                        adaptor.addChild(root_1, stream_max.nextNode());

                        adaptor.addChild(root_1, stream_mod.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:123:2: RANDOM_LIST '(' se+= string_expression ( ',' se+= string_expression )* ')'
                    {
                    RANDOM_LIST42=(Token)match(input,RANDOM_LIST,FOLLOW_RANDOM_LIST_in_built_in_func663);  
                    stream_RANDOM_LIST.add(RANDOM_LIST42);


                    char_literal43=(Token)match(input,46,FOLLOW_46_in_built_in_func665);  
                    stream_46.add(char_literal43);


                    pushFollow(FOLLOW_string_expression_in_built_in_func669);
                    se=string_expression();

                    state._fsp--;

                    stream_string_expression.add(se.getTree());
                    if (list_se==null) list_se=new ArrayList();
                    list_se.add(se.getTree());


                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:123:40: ( ',' se+= string_expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==48) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:123:41: ',' se+= string_expression
                    	    {
                    	    char_literal44=(Token)match(input,48,FOLLOW_48_in_built_in_func672);  
                    	    stream_48.add(char_literal44);


                    	    pushFollow(FOLLOW_string_expression_in_built_in_func676);
                    	    se=string_expression();

                    	    state._fsp--;

                    	    stream_string_expression.add(se.getTree());
                    	    if (list_se==null) list_se=new ArrayList();
                    	    list_se.add(se.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    char_literal45=(Token)match(input,47,FOLLOW_47_in_built_in_func680);  
                    stream_47.add(char_literal45);


                    // AST REWRITE
                    // elements: se, RANDOM_LIST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: se
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"token se",list_se);
                    root_0 = (CommonTree)adaptor.nil();
                    // 123:73: -> ^( RANDOM_LIST ( $se)+ )
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:123:76: ^( RANDOM_LIST ( $se)+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RANDOM_LIST.nextNode()
                        , root_1);

                        if ( !(stream_se.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_se.hasNext() ) {
                            adaptor.addChild(root_1, stream_se.nextTree());

                        }
                        stream_se.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "built_in_func"


    public static class bool_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_expression"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:126:1: bool_expression :b+= bool_and (o= OR ^b+= bool_and )* ;
    public final TableQueryParser.bool_expression_return bool_expression() throws RecognitionException {
        TableQueryParser.bool_expression_return retval = new TableQueryParser.bool_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        List list_b=null;
        RuleReturnScope b = null;
        CommonTree o_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:126:16: (b+= bool_and (o= OR ^b+= bool_and )* )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:127:2: b+= bool_and (o= OR ^b+= bool_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_and_in_bool_expression702);
            b=bool_and();

            state._fsp--;

            adaptor.addChild(root_0, b.getTree());
            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTree());


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:127:14: (o= OR ^b+= bool_and )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==OR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:127:15: o= OR ^b+= bool_and
            	    {
            	    o=(Token)match(input,OR,FOLLOW_OR_in_bool_expression707); 
            	    o_tree = 
            	    (CommonTree)adaptor.create(o)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(o_tree, root_0);


            	    pushFollow(FOLLOW_bool_and_in_bool_expression712);
            	    b=bool_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());
            	    if (list_b==null) list_b=new ArrayList();
            	    list_b.add(b.getTree());


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_expression"


    public static class bool_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_and"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:130:1: bool_and :b+= bool_atom ( AND ^b+= bool_atom )* ;
    public final TableQueryParser.bool_and_return bool_and() throws RecognitionException {
        TableQueryParser.bool_and_return retval = new TableQueryParser.bool_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND46=null;
        List list_b=null;
        RuleReturnScope b = null;
        CommonTree AND46_tree=null;

        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:130:9: (b+= bool_atom ( AND ^b+= bool_atom )* )
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:131:2: b+= bool_atom ( AND ^b+= bool_atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bool_atom_in_bool_and727);
            b=bool_atom();

            state._fsp--;

            adaptor.addChild(root_0, b.getTree());
            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTree());


            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:131:15: ( AND ^b+= bool_atom )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:131:16: AND ^b+= bool_atom
            	    {
            	    AND46=(Token)match(input,AND,FOLLOW_AND_in_bool_and730); 
            	    AND46_tree = 
            	    (CommonTree)adaptor.create(AND46)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND46_tree, root_0);


            	    pushFollow(FOLLOW_bool_atom_in_bool_and735);
            	    b=bool_atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());
            	    if (list_b==null) list_b=new ArrayList();
            	    list_b.add(b.getTree());


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_and"


    public static class bool_atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_atom"
    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:139:1: bool_atom : ( '(' b= bool_expression ')' -> $b|str= string_expression (op= EQUALS |op= MATCHES ) pattern= string_expression -> ^( $op $str $pattern) | TRUE | FALSE );
    public final TableQueryParser.bool_atom_return bool_atom() throws RecognitionException {
        TableQueryParser.bool_atom_return retval = new TableQueryParser.bool_atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token op=null;
        Token char_literal47=null;
        Token char_literal48=null;
        Token TRUE49=null;
        Token FALSE50=null;
        TableQueryParser.bool_expression_return b =null;

        TableQueryParser.string_expression_return str =null;

        TableQueryParser.string_expression_return pattern =null;


        CommonTree op_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree TRUE49_tree=null;
        CommonTree FALSE50_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_MATCHES=new RewriteRuleTokenStream(adaptor,"token MATCHES");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_bool_expression=new RewriteRuleSubtreeStream(adaptor,"rule bool_expression");
        RewriteRuleSubtreeStream stream_string_expression=new RewriteRuleSubtreeStream(adaptor,"rule string_expression");
        try {
            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:139:10: ( '(' b= bool_expression ')' -> $b|str= string_expression (op= EQUALS |op= MATCHES ) pattern= string_expression -> ^( $op $str $pattern) | TRUE | FALSE )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt16=1;
                }
                break;
            case ID:
            case LOWER_CASE:
            case RANDOM_LIST:
            case RANDOM_STRING:
            case REPLACE:
            case ROW_NUMBER:
            case STRING:
            case SUB_STRING:
            case UPPER_CASE:
                {
                alt16=2;
                }
                break;
            case TRUE:
                {
                alt16=3;
                }
                break;
            case FALSE:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:140:3: '(' b= bool_expression ')'
                    {
                    char_literal47=(Token)match(input,46,FOLLOW_46_in_bool_atom755);  
                    stream_46.add(char_literal47);


                    pushFollow(FOLLOW_bool_expression_in_bool_atom759);
                    b=bool_expression();

                    state._fsp--;

                    stream_bool_expression.add(b.getTree());

                    char_literal48=(Token)match(input,47,FOLLOW_47_in_bool_atom761);  
                    stream_47.add(char_literal48);


                    // AST REWRITE
                    // elements: b
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 140:29: -> $b
                    {
                        adaptor.addChild(root_0, stream_b.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:142:3: str= string_expression (op= EQUALS |op= MATCHES ) pattern= string_expression
                    {
                    pushFollow(FOLLOW_string_expression_in_bool_atom776);
                    str=string_expression();

                    state._fsp--;

                    stream_string_expression.add(str.getTree());

                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:142:25: (op= EQUALS |op= MATCHES )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==EQUALS) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==MATCHES) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }
                    switch (alt15) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:142:26: op= EQUALS
                            {
                            op=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_bool_atom781);  
                            stream_EQUALS.add(op);


                            }
                            break;
                        case 2 :
                            // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:142:36: op= MATCHES
                            {
                            op=(Token)match(input,MATCHES,FOLLOW_MATCHES_in_bool_atom785);  
                            stream_MATCHES.add(op);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_string_expression_in_bool_atom790);
                    pattern=string_expression();

                    state._fsp--;

                    stream_string_expression.add(pattern.getTree());

                    // AST REWRITE
                    // elements: pattern, str, op
                    // token labels: op
                    // rule labels: retval, str, pattern
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_str=new RewriteRuleSubtreeStream(adaptor,"rule str",str!=null?str.tree:null);
                    RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern",pattern!=null?pattern.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:74: -> ^( $op $str $pattern)
                    {
                        // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:142:77: ^( $op $str $pattern)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_str.nextTree());

                        adaptor.addChild(root_1, stream_pattern.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:144:3: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE49=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool_atom813); 
                    TRUE49_tree = 
                    (CommonTree)adaptor.create(TRUE49)
                    ;
                    adaptor.addChild(root_0, TRUE49_tree);


                    }
                    break;
                case 4 :
                    // F:\\usr\\franz\\data\\workspace\\TextTable\\src\\eu\\reitmayer\\texttable\\lang\\TableQuery.g:146:3: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE50=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool_atom821); 
                    FALSE50_tree = 
                    (CommonTree)adaptor.create(FALSE50)
                    ;
                    adaptor.addChild(root_0, FALSE50_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_statement_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_statement122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement135 = new BitSet(new long[]{0x0000040C78140020L});
    public static final BitSet FOLLOW_column_list_in_select_statement139 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_statement142 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_expression_in_select_statement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement170 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_SET_in_update_statement172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_update_value_list_in_update_statement176 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHERE_in_update_statement179 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_expression_in_update_statement183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement207 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_statement209 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_expression_in_delete_statement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_column_list239 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_column_list242 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_column_spec_in_column_list246 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ALL_in_column_list264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_expression_in_column_spec297 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_AS_in_column_spec300 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_column_spec304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_value_element_in_update_value_list333 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_update_value_list336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_update_value_element_in_update_value_list340 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_update_value_element367 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUALS_in_update_value_element369 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_update_value_element373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concated_expression_in_string_expression399 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_CONCAT_in_string_expression402 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_concated_expression_in_string_expression407 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ID_in_concated_expression419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_concated_expression429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_built_in_func_in_concated_expression439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_STRING_in_built_in_func454 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func456 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func462 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_built_in_func468 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_built_in_func474 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWER_CASE_in_built_in_func497 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func499 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func504 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPER_CASE_in_built_in_func521 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func523 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func529 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROW_NUMBER_in_built_in_func546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPLACE_in_built_in_func558 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func560 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func564 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func566 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func571 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func573 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func577 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_STRING_in_built_in_func600 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_built_in_func606 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_in_built_in_func612 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func614 = new BitSet(new long[]{0x0000003402000000L});
    public static final BitSet FOLLOW_STRING_in_built_in_func619 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TEXT_in_built_in_func625 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_TEXTNUM_in_built_in_func633 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUM_in_built_in_func639 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANDOM_LIST_in_built_in_func663 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_built_in_func665 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func669 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_48_in_built_in_func672 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_built_in_func676 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_built_in_func680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_in_bool_expression702 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OR_in_bool_expression707 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_and_in_bool_expression712 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and727 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_bool_and730 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_atom_in_bool_and735 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_46_in_bool_atom755 = new BitSet(new long[]{0x0000444C78160000L});
    public static final BitSet FOLLOW_bool_expression_in_bool_atom759 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_bool_atom761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_expression_in_bool_atom776 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_EQUALS_in_bool_atom781 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_MATCHES_in_bool_atom785 = new BitSet(new long[]{0x0000040C78140000L});
    public static final BitSet FOLLOW_string_expression_in_bool_atom790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_bool_atom813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_bool_atom821 = new BitSet(new long[]{0x0000000000000002L});

}