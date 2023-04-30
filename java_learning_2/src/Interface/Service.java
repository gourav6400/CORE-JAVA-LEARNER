package Interface;

interface Service5{
	void service1();
	void service2();
}

class ServiceImpl implements Service5{

	@Override
	public void service1() {
		System.out.println("service1 is called");	
	}

	@Override
	public void service2() {
		System.out.println("service2 is called");	
	}
	
}
class Product{
	private Service5 service;
	
	Product(Service5 service){
		this.service = service;
	}
	
	public void getData(){
		service.service1();
	}
}

public class Service {

	public static void main(String[] args) {
		Service5 service = new ServiceImpl();
        Product product = new Product(service);
        product.getData();
	}

}
