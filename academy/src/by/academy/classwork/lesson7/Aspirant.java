package by.academy.classwork.lesson7;

public class Aspirant extends Student {

	Boolean sinceWork = true;

	Aspirant() {
		super();
	}
	
	Aspirant(String firstName, double averageMark){
		this.firstName=firstName;
		this.averageMark=averageMark;
	}

	// Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта
	// равна 5, то сумма 200 грн, иначе 180.

	public int getScholarship(double averageMark) {
		int step = 0;
		if (getAverageMark() == 5.0) {
			step = 200;
		} else {
			step = 180;
		}
		return step;
	}
}
