package org.api4.java.ai.ml.classification;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <I>
 * @param <D>
 */
public interface IClassifier extends ISupervisedLearner<ILabeledInstance, ILabeledDataset<? extends ILabeledInstance>> {

}
