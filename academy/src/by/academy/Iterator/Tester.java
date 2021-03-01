package by.academy.Iterator;

public class Tester {

		public static void main(String[] args) {
			Integer[][] array2={{1,2,3},{4,5,6},{7,8,9}};

		/*	for (int i=0; i<array2.length;i++) {
				
				for (int q=0; q<array2[i].length; q++) {
					System.out.print(array2[i][q]+" ");
				}	
			}  */

			
		IteratorArray<Integer> iterator= new IteratorArray<>(array2);
			
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");	}
		}

	}