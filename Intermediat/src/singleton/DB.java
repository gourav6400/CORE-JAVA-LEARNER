package singleton;

public class DB {
	
       
	

	private static DB obj = new DB();
	private DB(){}
	
	public static DB getObject() {
		return obj;
	}
    
	public void getConnection() {
		System.out.println("Connection established..");
	}
}

