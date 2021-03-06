package org.api4.java.ai.ml.ranking;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface IRankingPredictionAndGroundTruthTable extends IPredictionAndGroundTruthTable<IRanking<?>, IRanking<?>> {

	@Override
	public IRanking<?> getPrediction(int instance);

	@Override
	public IRanking<?> getGroundTruth(int instance);

	@Override
	public List<IRanking<?>> getPredictionsAsList();

	@Override
	public IRanking<?>[] getPredictionsAsArray();

	@Override
	public List<IRanking<?>> getGroundTruthAsList();

	@Override
	public IRanking<?>[] getGroundTruthAsArray();

}
