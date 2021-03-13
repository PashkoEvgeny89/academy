package by.academy.classwork.lesson18;

public class Cat {
	
	private static final int kolichestvoLap=4;
	public String color;
	protected short years;
	
	
	Cat(String color, short years){
		this.color=color;
		this.years=years;
	}
	
	Cat(){
		super();
	}
	
	
	public void run() {
		System.out.println("run");
	}
	
	@SuppressWarnings("unused")
	private void say() {
		System.out.println("may-may-may");
	}
	
	protected void eat() {
		System.out.println("I am eating Kiticat");
	

}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public short getYears() {
		return years;
	}

	public void setYears(short years) {
		this.years = years;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}

	public static int getKolichestvolap() {
		return kolichestvoLap;
	}
	
	
	

}
