// Generated from CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CMMParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CMMParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt_block}
	 * labeled alternative in {@link CMMParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(CMMParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_decl}
	 * labeled alternative in {@link CMMParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CMMParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(CMMParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CMMParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CMMParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CMMParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CMMParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link CMMParser#breakstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read_stmt}
	 * labeled alternative in {@link CMMParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write_stmt}
	 * labeled alternative in {@link CMMParser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(CMMParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link CMMParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CMMParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(CMMParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less_or_greater}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_or_greater(CMMParser.Less_or_greaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(CMMParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(CMMParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(CMMParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CMMParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater_or_equal}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_or_equal(CMMParser.Greater_or_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_equal}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal(CMMParser.Not_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divmulmod}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivmulmod(CMMParser.DivmulmodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CMMParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less_or_equal}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_or_equal(CMMParser.Less_or_equalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flip}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlip(CMMParser.FlipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(CMMParser.GreaterContext ctx);
}