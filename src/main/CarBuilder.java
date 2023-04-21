package cars;

public interface CarBuilder
{
	public void buildEngine();
	public void buildBody();
	public void buildTires();
	public void buildUpholstery();
	public Cars getCar();
}
