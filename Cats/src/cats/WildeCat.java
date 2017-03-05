package cats;

public class WildeCat extends Cats {
    public WildeCat(String color, double weight, int age, boolean bite,
		int countOfFud, double height) {
		super(color, weight, age, bite, countOfFud, height);
	}
	private int lenghtsOfTail;
	private int countOfTease;
	
	public int getLenghtsOfTail() {
		return lenghtsOfTail;
	}
	public void setLenghtsOfTail(int lenghtsOfTail) {
		this.lenghtsOfTail = lenghtsOfTail;
	}
	public int getCountOfTease() {
		return countOfTease;
	}
	public void setCountOfTease(int countOfTease) {
		this.countOfTease = countOfTease;
	}
	
	public void rrrr(){
		System.out.println("rrrrrrrrrrrrrrrr");
	}	



}
