// Generated from partners.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link partnersParser}.
 */
public interface partnersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link partnersParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(partnersParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link partnersParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(partnersParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link partnersParser#partners}.
	 * @param ctx the parse tree
	 */
	void enterPartners(partnersParser.PartnersContext ctx);
	/**
	 * Exit a parse tree produced by {@link partnersParser#partners}.
	 * @param ctx the parse tree
	 */
	void exitPartners(partnersParser.PartnersContext ctx);
	/**
	 * Enter a parse tree produced by {@link partnersParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(partnersParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link partnersParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(partnersParser.UserContext ctx);
}