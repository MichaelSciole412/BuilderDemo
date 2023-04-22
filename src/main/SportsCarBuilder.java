package cars;

/**
 * This is a Concrete Builder.
 * This class extends our builder class to make 
 * a specific "build" for our product
 * @author Michael Sciole
 * @version 1.1
 **/

public class SportsCarBuilder implements CarBuilder
{
	private Cars car;

	public SportsCarBuilder()
	{
		this.car = new Cars();
	}

	public void buildEngine()
	{
		car.setEngine("Turbo Charged V8");
	}

	public void buildBody()
	{
		car.setBody("Sedan");
	}

	public void buildTires()
	{
		car.setTires("Racing Tires");
	}
	
	public void buildUpholstery()
	{
		car.setUpholstery("two-seater with fabric seats and plastic interior");
	}

	public Cars getCar()
        {
                return this.car;
        }
}
