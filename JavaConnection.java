package week4.week4day1;

public class JavaConnection implements DatabaseConnection{

	public void connect(){
		System.out.println("connect to the database");
	}
	public void disconnect() {
		System.out.println("disconnect from the database");
	}
	public void executeUpdate() {
		System.out.println("execute the update");
	}
	
	public static void main(String[] args) {
		JavaConnection DB = new JavaConnection();
		DB.connect();
		DB.disconnect();
		DB.executeUpdate();
	}
	
	
}
