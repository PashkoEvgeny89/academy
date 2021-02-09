package by.academy.classwork.lesson7;

public class Application {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setAverageMark(5);
		System.out.println(student1.getScholarship(student1.getAverageMark()));

		Aspirant aspirant1 = new Aspirant();
		aspirant1.setAverageMark(5);
		System.out.println(aspirant1.getScholarship(aspirant1.getAverageMark()));
		
	//	Создать массив типа Student, содержащий объекты класса Student и Aspirant. 
	//	Вызвать метод getScholarship() для каждого элемента массива. 

		Student[] person=new Student[4];
		person[0]=new Student("Senko",4.3);
		person[1]=new Student("Demko", 4.5);
		person[2]=new Student("Jakuta", 4.8);
		person[3]=new Aspirant ("Pashko", 5);
		
		for (Student a: person) {
			System.out.println(a.getFirstName()+"  check: "+a.getScholarship(a.getAverageMark())+"$ in hour");
		}
	}

}
