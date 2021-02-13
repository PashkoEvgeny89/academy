package by.academy.deal;

public class Milk extends Product {
	
	double percentFat;
	
	
/*	private static int milkCount = 0;
	private int nonStaticMilkCount = 0;
	public static int getMilkCount() {
		return milkCount;
	}

    public static void setMilkCount(int milkCount) {
		Milk.milkCount = milkCount;
	}

	public int getNonStaticMilkCount() {
		return nonStaticMilkCount;
	}

	public void setNonStaticMilkCount(int nonStaticMilkCount) {
		this.nonStaticMilkCount = nonStaticMilkCount;
	}

	*/
	
	
	public Milk(String type, double price, String manufacturer, int quantity, double percentFat) {
		super(type, price, manufacturer, quantity);
		this.percentFat=percentFat;
		
	//	milkCount++;            //
	//	nonStaticMilkCount++;       //
	}
	
	Milk(){
		super();
	}

	public double getPercentFat() {
		return percentFat;
	}

	public void setPercentFat(double percentFat) {
		this.percentFat = percentFat;
	}

	@Override
	public double discount() {
			if (quantity > 20) {
				return 0.9;
			} else {
				return 1.0;
			}
		}
	
	
}