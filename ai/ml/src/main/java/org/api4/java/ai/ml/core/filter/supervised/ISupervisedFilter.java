package org.api4.java.ai.ml.core.filter.supervised;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.filter.IFilter;
import org.api4.java.ai.ml.core.learner.IFittable;

public interface ISupervisedFilter extends IFittable<ILabeledInstance, ILabeledDataset<ILabeledInstance>>, IFilter {

}
