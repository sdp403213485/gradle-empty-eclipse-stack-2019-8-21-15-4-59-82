
public class Truck extends Car {

	private String payload;
	
	public Truck(String engine, String wheels, String payload) {
		super(engine, wheels);
		this.payload=payload;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("tips, "+this.getEngine() +"is on and" + this.getWheels()  +"are running!");
		
	}
		
	public void load() {
		System.out.println(this.payload+" is loading goods");
	}
}
