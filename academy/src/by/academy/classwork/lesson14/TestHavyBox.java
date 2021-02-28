package by.academy.classwork.lesson14;

import java.util.TreeSet;

public class TestHavyBox {

	public static void main(String[] args) {
		
		HavyBox box1=new HavyBox(1,2,3,4);
		HavyBox box2=new HavyBox(2,4,6,8);
		HavyBox box3=new HavyBox(3,7,3,5);
		HavyBox box4=new HavyBox(4,7,3,1);
		
		TreeSet<HavyBox> treeSetBox=new TreeSet<HavyBox>();    
		
		treeSetBox.add(box1);
		treeSetBox.add(box2);
		treeSetBox.add(box3);
		treeSetBox.add(box4);
	
		
	
		
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
