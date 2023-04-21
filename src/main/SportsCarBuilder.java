package cars;

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
		car.setBody("Carbon-Fiber and Aluminum");
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
