package cars;

class Demo
{
	public static void main(String[] args) 
	{
		CarBuilder carBuild = new SportsCarBuilder();
		Mechanic m = new Mechanic(carBuild);

		m.putCarTogether();

		Cars car = m.getCar();

		car.getSpecs();
	}
}
