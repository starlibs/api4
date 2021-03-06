package org.api4.java.ai.ml.core.evaluation.learningcurve;

/**
 * Interface for the result of an learning curve extrapolation. Has to save the
 * data necessary for representing the curve and give information about the
 * values.
 * 
 * @author Lukas Brandt
 */
public interface ILearningCurve {

	/**
	 * Calculates or looks-up the curves value at a given point.
	 * 
	 * @param x
	 *            The x value of the point.
	 * @return The y value of the curve at the given x value.
	 */
	public double getCurveValue(double x);


}
