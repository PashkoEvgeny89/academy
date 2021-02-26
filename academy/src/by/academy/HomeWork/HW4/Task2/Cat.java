package by.academy.HomeWork.HW4.Task2;

public class Cat {

	int eyar;
	String color;
	
	public int getEyar() {
		return eyar;
	}

	public void setEyar(int eyar) {
		this.eyar = eyar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void say() {
		System.out.println("may-may-may");
	}
	
	Cat(){
		super();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

	
	
	
}
