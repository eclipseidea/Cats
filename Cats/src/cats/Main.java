package cats;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Animal domastic = new DomasticCats("grey", 5, 3, false, 2, 25);
		Animal wild = new WildeCat("black", 8, 4, false, 5, 28);

		Animal[] animals = new Animal[] { domastic, wild };
		for (Animal animal : animals) {

			Class<?> search = animal.getClass();
			Method[] methods = search.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out
						.println("Method of animals: " + methods[i].getName());
			}

			Class<?> searching = animal.getClass();
			while (searching != null) {
				System.out.println(searching.getName());
				searching = searching.getSuperclass();

			}
		}

	}
}
