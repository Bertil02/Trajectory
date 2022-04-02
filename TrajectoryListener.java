// Generated from ./src/Trajectory.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrajectoryParser}.
 */
public interface TrajectoryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#trajectory}.
	 * @param ctx the parse tree
	 */
	void enterTrajectory(TrajectoryParser.TrajectoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#trajectory}.
	 * @param ctx the parse tree
	 */
	void exitTrajectory(TrajectoryParser.TrajectoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(TrajectoryParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(TrajectoryParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TrajectoryParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TrajectoryParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TrajectoryParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TrajectoryParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(TrajectoryParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(TrajectoryParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntry_declaration(TrajectoryParser.Entry_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntry_declaration(TrajectoryParser.Entry_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(TrajectoryParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(TrajectoryParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#longitude}.
	 * @param ctx the parse tree
	 */
	void enterLongitude(TrajectoryParser.LongitudeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#longitude}.
	 * @param ctx the parse tree
	 */
	void exitLongitude(TrajectoryParser.LongitudeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrajectoryParser#latitude}.
	 * @param ctx the parse tree
	 */
	void enterLatitude(TrajectoryParser.LatitudeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrajectoryParser#latitude}.
	 * @param ctx the parse tree
	 */
	void exitLatitude(TrajectoryParser.LatitudeContext ctx);
}