package org.api4.java.ai.ml.core.evaluation.execution;

import java.util.Collection;

import org.api4.java.ai.ml.core.evaluation.loss.IMeasure;
import org.api4.java.common.attributedobjects.IObjectEvaluator;

public interface ISupervisedLearnerMetric extends IObjectEvaluator<Collection<? extends ILearnerRunReport>, Double> {

	@Override
	default Double evaluate(final Collection<? extends ILearnerRunReport> reports) {
		return this.evaluateToDouble(reports);
	}

	public double evaluateToDouble(Collection<? extends ILearnerRunReport> reports);

	public IMeasure getMeasure();
}