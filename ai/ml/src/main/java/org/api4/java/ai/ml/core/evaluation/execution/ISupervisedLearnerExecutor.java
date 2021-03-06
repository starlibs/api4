package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;

public interface ISupervisedLearnerExecutor {

	public <I extends ILabeledInstance, D extends ILabeledDataset<? extends I>> ILearnerRunReport execute(ISupervisedLearner<I, D> learner, D train, D test) throws LearnerExecutionFailedException, LearnerExecutionInterruptedException;

	/**
	 * Here, the classifier is assumed to be trained already
	 **/
	public <I extends ILabeledInstance, D extends ILabeledDataset<? extends I>> ILearnerRunReport execute(ISupervisedLearner<I, D> learner, D test) throws LearnerExecutionFailedException, LearnerExecutionInterruptedException;
}
