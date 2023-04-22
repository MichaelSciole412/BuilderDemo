package cars;

/**
 * Builder class.
 * This interface has all of the methods 
 * that need to run for our product to be built.
 * It also holds a getCar method that
 * the director will use to return the product
 * @author Michael Sciole
 * @version 1.0
 **/

public interface CarBuilder
{
	public void buildEngine();
	public void buildBody();
	public void buildTires();
	public void buildUpholstery();
	public Cars getCar();
}
