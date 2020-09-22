package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.evaluation.IPrediction;
import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;
import org.api4.java.ai.ml.core.exception.PredictionException;

public interface IPredictor {

	public IPrediction predict(IInstance xTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(IDataSource dTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(IInstance[] dTest) throws PredictionException, InterruptedException;

}
