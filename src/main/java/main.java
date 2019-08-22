
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a= new Car("汽车发动机","汽车轮子");
		a.start();
		
		SportsCar b =new SportsCar("跑车发动机", "跑车轮子");
		b.start();
		b.speedOn();
		
		Truck truck = new Truck("卡车发动机", "卡车轮子", "卡车漏斗");
		truck.start();
		truck.load();	
		
	}

}
