
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a= new Car("����������","��������");
		a.start();
		
		SportsCar b =new SportsCar("�ܳ�������", "�ܳ�����");
		b.start();
		b.speedOn();
		
		Truck truck = new Truck("����������", "��������", "����©��");
		truck.start();
		truck.load();	
		
	}

}
