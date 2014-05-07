import java.util.Random;
public class dice {

	int newValue,total,newBounces;
	int value;
	int Bounces;

	static Random random = new Random();

	public dice(int Bounces)
	{
		this.Bounces = Bounces;
	}

	public int Throw(int Bounces)
	{			
		for(int i=Bounces;i>0;i--)
		{
		value=value+random.nextInt(6)+1;
		System.out.println(value);
		}
		value=value/Bounces;
		System.out.println("new"+value);
		return value;
	}

	public int Throw()
	{
		newValue = random.nextInt(6)+1;
		return newValue;
	}

}
