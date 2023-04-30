package singleton;

public class main {

	public static void main(String[] args) {
		DB db = DB.getObject();
		db.getConnection();
	}
}
