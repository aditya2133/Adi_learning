package mavenjdbc;

public class Runner {
 
	public static void main(String[] args) {
		
		LearningJDBC myConn = new LearningJDBC("jdbc:mysql://localhost:3306/world", "root", "root");
		
		System.out.println(myConn.readCity(4));
		
	}
}
