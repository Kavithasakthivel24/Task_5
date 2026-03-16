package Qno1;

public class Testing {
	
	public static void main(String[] args) {

        try {
            Student s = new Student(1,"Ramesh",18,"BCA");
            s.display();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
