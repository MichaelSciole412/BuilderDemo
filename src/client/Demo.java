package cars;

import java.util.Scanner;

class Demo
{
	public static void main(String[] args) 
	{
		Mechanic m = null;
		CarBuilder carBuild = null;
		Scanner s = new Scanner(System.in);
		System.out.println("What car would you like?\n1. Sports Car\n2. Rally Car");
		int choice = s.nextInt();
		if (choice == 1)
		{
			carBuild = new SportsCarBuilder();
			m = new Mechanic(carBuild);
		}
		else if (choice == 2)
		{
			carBuild = new RallyCarBuilder();
                        m = new Mechanic(carBuild);
		}
		m.putCarTogether();

		Cars car = m.getCar();

		car.getSpecs();
	}
}
