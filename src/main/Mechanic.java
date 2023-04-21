package cars;

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
