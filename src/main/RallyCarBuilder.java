package cars;

/**
 * This is a Concrete Builder.
 * This class extends our builder class to make 
 * a specific "build" for our product
 * @author Michael Sciole
 * @version 1.1
 **/

public class RallyCarBuilder implements CarBuilder
{
	private Cars car;

	public RallyCarBuilder()
	{
		this.car = new Cars();
	}

	public void buildEngine()
	{
		car.setEngine("1.6-liter direct-injection turbocharged v6");
	}

	public void buildBody()
	{
		car.setBody("Hatchback");
	}

	public void buildTires()
	{
		car.setTires("Off-Road Tires");
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
