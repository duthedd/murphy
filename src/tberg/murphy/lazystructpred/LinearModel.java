package tberg.murphy.lazystructpred;

import java.util.List;

import tberg.murphy.counter.CounterInterface;
import tberg.murphy.counter.IntCounter;


public interface LinearModel<T> {

	public UpdateBundle getUpdateBundle(T datum);

	public List<UpdateBundle> getUpdateBundleBatch(List<T> datum);

	public void setWeights(CounterInterface<Integer> weights);

	public void updateWeights(IntCounter weightsDelta, double scale);

	public CounterInterface<Integer> getWeights();

	public void startIteration(int t);

}