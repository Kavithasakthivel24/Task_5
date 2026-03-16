package Qno2;

public class Testing {
	
	public static void main(String[] args) {
        try {
            Voter v = new Voter(101,"Arun",17);
            v.display();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
