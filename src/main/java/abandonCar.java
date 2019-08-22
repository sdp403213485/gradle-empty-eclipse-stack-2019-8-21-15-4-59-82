
public class abandonCar {
	private String engine;
	private String wheels;
	
	


	public String getEngine() {
		return engine;
	}



	public void setEngine(String engine) {
		this.engine = engine;
	}



	public String getWheels() {
		return wheels;
	}



	public void setWheels(String wheels) {
		this.wheels = wheels;
	}



	public void start() {
		System.out.println(this.engine +"is on and" + this.wheels  +"are running!");
	}

	
}
