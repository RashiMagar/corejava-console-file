package JungleBook.java;

public class Animal implements IAnimal  {
	String name ;
	String color;
	String weight;
	String height;
	 
		public void hunt()
		{
			System.out.println(name + " is hunting");
		}
	 
	public void eat()
	{
		System.out.println(name + " is eating");
	}
	public void drink()
	{
		System.out.println(name + " is  drinking");
	}
	
	public void run()
	{
		System.out.println(name + " is running");
	}
	public void bite()
	{
		System.out.println(name + " is biting");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
	
