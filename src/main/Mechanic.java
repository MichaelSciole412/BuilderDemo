package cars;

/**
 * Director class.
 * This class is what puts the product together
 * It passes the builder to its constructor
 * puts the car together in putCarTogether()
 * and returns the car to the client with getCar()
 * @author Michael Sciole
 * @version 1.1
 **/

public class Mechanic
{
	
	private CarBuilder carBuilder;
	
	public Mechanic(CarBuilder carB)
	{
		this.carBuilder = carB;
	}

	public Cars getCar()
	{
		return this.carBuilder.getCar();
	}

	public void putCarTogether()
	{
		this.carBuilder.buildEngine();
		this.carBuilder.buildBody();
		this.carBuilder.buildTires();
		this.carBuilder.buildUpholstery();
	}
}
