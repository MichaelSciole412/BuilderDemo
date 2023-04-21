package cars;

public class Cars implements CarSpecs
{
	
	private String engine;
	private String body;
	private String tires;
	private String upholstery;

	public void setEngine(String engine)
	{
		this.engine = engine;
	}

	public void setBody(String body)
        {
                this.body = body;
        }

	public void setTires(String tires)
        {
                this.tires = tires;
        }

	public void setUpholstery(String upholstery)
        {
                this.upholstery = upholstery;
        }

	public void getSpecs()
	{
		System.out.println("The car has a " + this.engine + " engine, and a body made of " + this.body);
	}
}
