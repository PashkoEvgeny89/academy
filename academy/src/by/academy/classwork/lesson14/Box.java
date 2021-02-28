package by.academy.classwork.lesson14;

public class Box {
	
 double width;
 double height;
 double depht;



public Box() {
	System.out.println("Create object Box");
	width=10;
	height=10;
	depht=5;
	
}

public Box(double width, double height, double depht ) {
	System.out.println("Create object Box");
	this.depht=depht;
	this.height=height;
	this.width=width;
	
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

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getDepht() {
	return depht;
}

public void setDepht(double depht) {
	this.depht = depht;
}



}
