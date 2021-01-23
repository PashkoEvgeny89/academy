package by.academy.classwork.lesson4;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 19   54    1954%(19*54) == 0
		
		for(int i=10; i<100; i++) {
			for(int j=10; j<100; j++) {
				
				if ((i*100+j) %( i*j) ==0) {
					System.out.println("chislo i:"+ i + "chislo j: "+j);
				}
			}
		}
	}

}
