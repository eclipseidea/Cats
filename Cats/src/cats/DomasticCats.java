package cats;

public class DomasticCats extends Cats {
	private int countOfCityCat;
	private String name;

	public DomasticCats(String color, double weight, int age, boolean bite,
			int countOfFud, double height) {
		super(color, weight, age, bite, countOfFud, height);

	}

	public int getCountOfCityCat() {
		return countOfCityCat;
	}

	public void setCountOfCityCat(int countOfCityCat) {
		this.countOfCityCat = countOfCityCat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eatCat() {
		System.out.println("cat eat");
	}
}
