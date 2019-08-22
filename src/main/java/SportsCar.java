
public class SportsCar extends Car {
	
	public SportsCar(String engine, String wheels) {
		super(engine, wheels);
		// TODO Auto-generated constructor stub
	}

	private String lights;

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.lights+"are shining, "+this.getEngine() +"is on and" + this.getWheels()  +"are running!");
	}
	
	public void speedOn() {
		System.out.println(this.getEngine()+" is overload and "+this.getWheels()+" are super running!");
	}

	
}
