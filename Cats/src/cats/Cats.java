package cats;

public class Cats extends Animal  {
    private int countOfFud;
    private double height; 
	public Cats(String color, double weight, int age, boolean bite) {
		super(color, weight, age, bite);
	
	}
	public Cats(String color, double weight, int age, boolean bite,
	int countOfFud, double height) {
		super(color, weight, age, bite);
		this.countOfFud = countOfFud;
		this.height = height;
	}
	public int getCountOfFud() {
		return countOfFud;
	}

	public void setCountOfFud(int countOfFud) {
		this.countOfFud = countOfFud;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void hunt() {
         System.out.println("im hunter");
	}
}
