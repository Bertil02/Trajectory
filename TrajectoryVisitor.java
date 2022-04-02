// Generated from ./src/Trajectory.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrajectoryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrajectoryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#trajectory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrajectory(TrajectoryParser.TrajectoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(TrajectoryParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TrajectoryParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TrajectoryParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(TrajectoryParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#entry_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_declaration(TrajectoryParser.Entry_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(TrajectoryParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#longitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongitude(TrajectoryParser.LongitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrajectoryParser#latitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatitude(TrajectoryParser.LatitudeContext ctx);
}