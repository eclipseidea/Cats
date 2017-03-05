package cats;

public abstract class Animal {
	private String color;
	private double weight;
	private int age;
	private boolean bite;

	public Animal(String color, double weight, int age, boolean bite) {
		super();
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.bite = bite;
	}

	public Animal(DomasticCats domasticCats) {
		// TODO Auto-generated constructor stub
	}

	public boolean isBite() {
		return bite;
	}

	public void setBite(boolean bite) {
		this.bite = bite;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void run() {
		System.out.println("Animal runing");
	}

	public void eat() {
		System.out.println("Animal eat");
	}

	public void sleep() {
		System.out.println("Animal sleep");
	}

}
