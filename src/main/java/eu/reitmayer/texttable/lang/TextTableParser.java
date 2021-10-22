// $ANTLR 3.5 eu\\reitmayer\\texttable\\lang\\TextTable.g 2021-10-22 23:11:19
package eu.reitmayer.texttable.lang;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TextTableParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIGN_LEFT", "ALIGN_RIGHT", "BEGIN", 
		"BY", "Digit", "END", "FROM", "ID", "INT", "LENGTH", "Letter", "ML", "PLAIN", 
		"PLAIN_ELEM", "PLAIN_ELEM_LIST", "PLAIN_FILE", "SEPARATED", "SL", "TEXT_COMMA", 
		"TEXT_SEMICOLON", "TO", "WS", "','", "';'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TextTableParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TextTableParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TextTableParser.tokenNames; }
	@Override public String getGrammarFileName() { return "eu\\reitmayer\\texttable\\lang\\TextTable.g"; }


	public List<RecognitionException> errors = new ArrayList<RecognitionException>();

	public void reportError(RecognitionException e) {
		super.reportError(e);
		if (e.token.getType() != EOF)
		errors.add(e);
	}


	public static class table_desc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_desc"
	// eu\\reitmayer\\texttable\\lang\\TextTable.g:33:8: public table_desc : ( plain_descr | sep_descr );
	public final TextTableParser.table_desc_return table_desc() throws RecognitionException {
		TextTableParser.table_desc_return retval = new TextTableParser.table_desc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope plain_descr1 =null;
		ParserRuleReturnScope sep_descr2 =null;


		try {
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:33:18: ( plain_descr | sep_descr )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PLAIN) ) {
				alt1=1;
			}
			else if ( (LA1_0==SEPARATED) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// eu\\reitmayer\\texttable\\lang\\TextTable.g:34:2: plain_descr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_plain_descr_in_table_desc84);
					plain_descr1=plain_descr();
					state._fsp--;

					adaptor.addChild(root_0, plain_descr1.getTree());

					}
					break;
				case 2 :
					// eu\\reitmayer\\texttable\\lang\\TextTable.g:36:2: sep_descr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sep_descr_in_table_desc90);
					sep_descr2=sep_descr();
					state._fsp--;

					adaptor.addChild(root_0, sep_descr2.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_desc"


	public static class plain_descr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plain_descr"
	// eu\\reitmayer\\texttable\\lang\\TextTable.g:40:1: plain_descr : PLAIN ID BEGIN pl= plain_elem_list END ';' -> ^( PLAIN_FILE ID $pl) ;
	public final TextTableParser.plain_descr_return plain_descr() throws RecognitionException {
		TextTableParser.plain_descr_return retval = new TextTableParser.plain_descr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLAIN3=null;
		Token ID4=null;
		Token BEGIN5=null;
		Token END6=null;
		Token char_literal7=null;
		ParserRuleReturnScope pl =null;

		Object PLAIN3_tree=null;
		Object ID4_tree=null;
		Object BEGIN5_tree=null;
		Object END6_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_PLAIN=new RewriteRuleTokenStream(adaptor,"token PLAIN");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_plain_elem_list=new RewriteRuleSubtreeStream(adaptor,"rule plain_elem_list");

		try {
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:40:12: ( PLAIN ID BEGIN pl= plain_elem_list END ';' -> ^( PLAIN_FILE ID $pl) )
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:41:2: PLAIN ID BEGIN pl= plain_elem_list END ';'
			{
			PLAIN3=(Token)match(input,PLAIN,FOLLOW_PLAIN_in_plain_descr103);  
			stream_PLAIN.add(PLAIN3);

			ID4=(Token)match(input,ID,FOLLOW_ID_in_plain_descr105);  
			stream_ID.add(ID4);

			BEGIN5=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_plain_descr108);  
			stream_BEGIN.add(BEGIN5);

			pushFollow(FOLLOW_plain_elem_list_in_plain_descr115);
			pl=plain_elem_list();
			state._fsp--;

			stream_plain_elem_list.add(pl.getTree());
			END6=(Token)match(input,END,FOLLOW_END_in_plain_descr118);  
			stream_END.add(END6);

			char_literal7=(Token)match(input,27,FOLLOW_27_in_plain_descr120);  
			stream_27.add(char_literal7);

			// AST REWRITE
			// elements: ID, pl
			// token labels: 
			// rule labels: pl, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_pl=new RewriteRuleSubtreeStream(adaptor,"rule pl",pl!=null?pl.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:10: -> ^( PLAIN_FILE ID $pl)
			{
				// eu\\reitmayer\\texttable\\lang\\TextTable.g:44:13: ^( PLAIN_FILE ID $pl)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLAIN_FILE, "PLAIN_FILE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_pl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_descr"


	public static class sep_descr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sep_descr"
	// eu\\reitmayer\\texttable\\lang\\TextTable.g:47:1: sep_descr : SEPARATED BEGIN END ';' ;
	public final TextTableParser.sep_descr_return sep_descr() throws RecognitionException {
		TextTableParser.sep_descr_return retval = new TextTableParser.sep_descr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEPARATED8=null;
		Token BEGIN9=null;
		Token END10=null;
		Token char_literal11=null;

		Object SEPARATED8_tree=null;
		Object BEGIN9_tree=null;
		Object END10_tree=null;
		Object char_literal11_tree=null;

		try {
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:47:10: ( SEPARATED BEGIN END ';' )
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:48:2: SEPARATED BEGIN END ';'
			{
			root_0 = (Object)adaptor.nil();


			SEPARATED8=(Token)match(input,SEPARATED,FOLLOW_SEPARATED_in_sep_descr141); 
			SEPARATED8_tree = (Object)adaptor.create(SEPARATED8);
			adaptor.addChild(root_0, SEPARATED8_tree);

			BEGIN9=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_sep_descr144); 
			BEGIN9_tree = (Object)adaptor.create(BEGIN9);
			adaptor.addChild(root_0, BEGIN9_tree);

			END10=(Token)match(input,END,FOLLOW_END_in_sep_descr147); 
			END10_tree = (Object)adaptor.create(END10);
			adaptor.addChild(root_0, END10_tree);

			char_literal11=(Token)match(input,27,FOLLOW_27_in_sep_descr149); 
			char_literal11_tree = (Object)adaptor.create(char_literal11);
			adaptor.addChild(root_0, char_literal11_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sep_descr"


	public static class plain_elem_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plain_elem_list"
	// eu\\reitmayer\\texttable\\lang\\TextTable.g:53:1: plain_elem_list :p+= plain_elem ( ',' p+= plain_elem )* -> ^( PLAIN_ELEM_LIST ( $p)+ ) ;
	public final TextTableParser.plain_elem_list_return plain_elem_list() throws RecognitionException {
		TextTableParser.plain_elem_list_return retval = new TextTableParser.plain_elem_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal12=null;
		List<Object> list_p=null;
		RuleReturnScope p = null;
		Object char_literal12_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_plain_elem=new RewriteRuleSubtreeStream(adaptor,"rule plain_elem");

		try {
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:53:16: (p+= plain_elem ( ',' p+= plain_elem )* -> ^( PLAIN_ELEM_LIST ( $p)+ ) )
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:54:2: p+= plain_elem ( ',' p+= plain_elem )*
			{
			pushFollow(FOLLOW_plain_elem_in_plain_elem_list161);
			p=plain_elem();
			state._fsp--;

			stream_plain_elem.add(p.getTree());
			if (list_p==null) list_p=new ArrayList<Object>();
			list_p.add(p.getTree());
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:54:16: ( ',' p+= plain_elem )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==26) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// eu\\reitmayer\\texttable\\lang\\TextTable.g:54:17: ',' p+= plain_elem
					{
					char_literal12=(Token)match(input,26,FOLLOW_26_in_plain_elem_list164);  
					stream_26.add(char_literal12);

					pushFollow(FOLLOW_plain_elem_in_plain_elem_list168);
					p=plain_elem();
					state._fsp--;

					stream_plain_elem.add(p.getTree());
					if (list_p==null) list_p=new ArrayList<Object>();
					list_p.add(p.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: p
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: p
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"token p",list_p);
			root_0 = (Object)adaptor.nil();
			// 54:37: -> ^( PLAIN_ELEM_LIST ( $p)+ )
			{
				// eu\\reitmayer\\texttable\\lang\\TextTable.g:54:40: ^( PLAIN_ELEM_LIST ( $p)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLAIN_ELEM_LIST, "PLAIN_ELEM_LIST"), root_1);
				if ( !(stream_p.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_p.hasNext() ) {
					adaptor.addChild(root_1, stream_p.nextTree());
				}
				stream_p.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_elem_list"


	public static class plain_elem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "plain_elem"
	// eu\\reitmayer\\texttable\\lang\\TextTable.g:57:1: plain_elem : ( ID FROM i1= INT TO i2= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )? -> ^( ID $i1 $i2 ( $al)? ) | ID LENGTH i1= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )? -> ^( ID $i1 ( $al)? ) );
	public final TextTableParser.plain_elem_return plain_elem() throws RecognitionException {
		TextTableParser.plain_elem_return retval = new TextTableParser.plain_elem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i1=null;
		Token i2=null;
		Token al=null;
		Token ID13=null;
		Token FROM14=null;
		Token TO15=null;
		Token ID16=null;
		Token LENGTH17=null;

		Object i1_tree=null;
		Object i2_tree=null;
		Object al_tree=null;
		Object ID13_tree=null;
		Object FROM14_tree=null;
		Object TO15_tree=null;
		Object ID16_tree=null;
		Object LENGTH17_tree=null;
		RewriteRuleTokenStream stream_LENGTH=new RewriteRuleTokenStream(adaptor,"token LENGTH");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_ALIGN_RIGHT=new RewriteRuleTokenStream(adaptor,"token ALIGN_RIGHT");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_ALIGN_LEFT=new RewriteRuleTokenStream(adaptor,"token ALIGN_LEFT");

		try {
			// eu\\reitmayer\\texttable\\lang\\TextTable.g:57:11: ( ID FROM i1= INT TO i2= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )? -> ^( ID $i1 $i2 ( $al)? ) | ID LENGTH i1= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )? -> ^( ID $i1 ( $al)? ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==FROM) ) {
					alt5=1;
				}
				else if ( (LA5_1==LENGTH) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:3: ID FROM i1= INT TO i2= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )?
					{
					ID13=(Token)match(input,ID,FOLLOW_ID_in_plain_elem193);  
					stream_ID.add(ID13);

					FROM14=(Token)match(input,FROM,FOLLOW_FROM_in_plain_elem195);  
					stream_FROM.add(FROM14);

					i1=(Token)match(input,INT,FOLLOW_INT_in_plain_elem199);  
					stream_INT.add(i1);

					TO15=(Token)match(input,TO,FOLLOW_TO_in_plain_elem201);  
					stream_TO.add(TO15);

					i2=(Token)match(input,INT,FOLLOW_INT_in_plain_elem205);  
					stream_INT.add(i2);

					// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:28: (al= ALIGN_LEFT |al= ALIGN_RIGHT )?
					int alt3=3;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ALIGN_LEFT) ) {
						alt3=1;
					}
					else if ( (LA3_0==ALIGN_RIGHT) ) {
						alt3=2;
					}
					switch (alt3) {
						case 1 :
							// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:29: al= ALIGN_LEFT
							{
							al=(Token)match(input,ALIGN_LEFT,FOLLOW_ALIGN_LEFT_in_plain_elem210);  
							stream_ALIGN_LEFT.add(al);

							}
							break;
						case 2 :
							// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:45: al= ALIGN_RIGHT
							{
							al=(Token)match(input,ALIGN_RIGHT,FOLLOW_ALIGN_RIGHT_in_plain_elem216);  
							stream_ALIGN_RIGHT.add(al);

							}
							break;

					}

					// AST REWRITE
					// elements: i1, al, i2, ID
					// token labels: i1, i2, al
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
					RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
					RewriteRuleTokenStream stream_al=new RewriteRuleTokenStream(adaptor,"token al",al);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:62: -> ^( ID $i1 $i2 ( $al)? )
					{
						// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:65: ^( ID $i1 $i2 ( $al)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_i1.nextNode());
						adaptor.addChild(root_1, stream_i2.nextNode());
						// eu\\reitmayer\\texttable\\lang\\TextTable.g:58:79: ( $al)?
						if ( stream_al.hasNext() ) {
							adaptor.addChild(root_1, stream_al.nextNode());
						}
						stream_al.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:3: ID LENGTH i1= INT (al= ALIGN_LEFT |al= ALIGN_RIGHT )?
					{
					ID16=(Token)match(input,ID,FOLLOW_ID_in_plain_elem242);  
					stream_ID.add(ID16);

					LENGTH17=(Token)match(input,LENGTH,FOLLOW_LENGTH_in_plain_elem244);  
					stream_LENGTH.add(LENGTH17);

					i1=(Token)match(input,INT,FOLLOW_INT_in_plain_elem248);  
					stream_INT.add(i1);

					// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:20: (al= ALIGN_LEFT |al= ALIGN_RIGHT )?
					int alt4=3;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ALIGN_LEFT) ) {
						alt4=1;
					}
					else if ( (LA4_0==ALIGN_RIGHT) ) {
						alt4=2;
					}
					switch (alt4) {
						case 1 :
							// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:21: al= ALIGN_LEFT
							{
							al=(Token)match(input,ALIGN_LEFT,FOLLOW_ALIGN_LEFT_in_plain_elem253);  
							stream_ALIGN_LEFT.add(al);

							}
							break;
						case 2 :
							// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:37: al= ALIGN_RIGHT
							{
							al=(Token)match(input,ALIGN_RIGHT,FOLLOW_ALIGN_RIGHT_in_plain_elem259);  
							stream_ALIGN_RIGHT.add(al);

							}
							break;

					}

					// AST REWRITE
					// elements: al, ID, i1
					// token labels: i1, al
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
					RewriteRuleTokenStream stream_al=new RewriteRuleTokenStream(adaptor,"token al",al);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 60:54: -> ^( ID $i1 ( $al)? )
					{
						// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:57: ^( ID $i1 ( $al)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_i1.nextNode());
						// eu\\reitmayer\\texttable\\lang\\TextTable.g:60:67: ( $al)?
						if ( stream_al.hasNext() ) {
							adaptor.addChild(root_1, stream_al.nextNode());
						}
						stream_al.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_elem"

	// Delegated rules



	public static final BitSet FOLLOW_plain_descr_in_table_desc84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sep_descr_in_table_desc90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLAIN_in_plain_descr103 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_plain_descr105 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_plain_descr108 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_plain_elem_list_in_plain_descr115 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_plain_descr118 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_plain_descr120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEPARATED_in_sep_descr141 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BEGIN_in_sep_descr144 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_sep_descr147 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_sep_descr149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_elem_in_plain_elem_list161 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_plain_elem_list164 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_plain_elem_in_plain_elem_list168 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ID_in_plain_elem193 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_FROM_in_plain_elem195 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_plain_elem199 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TO_in_plain_elem201 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_plain_elem205 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_ALIGN_LEFT_in_plain_elem210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALIGN_RIGHT_in_plain_elem216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_plain_elem242 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_LENGTH_in_plain_elem244 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_plain_elem248 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_ALIGN_LEFT_in_plain_elem253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALIGN_RIGHT_in_plain_elem259 = new BitSet(new long[]{0x0000000000000002L});
}
