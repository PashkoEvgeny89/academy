package by.academy.classwork.lesson14;

public class HavyBox extends Box {

	int weight;
	public HavyBox() {
		super();
	}
	
	public HavyBox(int width, int height, int depth, int weight) {
		super();
		this.weight=weight;
		this.width=width;
		this.height=height;
		this.depht=depth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
