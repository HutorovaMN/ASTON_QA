package Lesson_2;

public class Lesson_2 {

	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}

	private static void printColor() {
		int value = 101;
		if (value <= 0)
			System.out.println("Красный");
		if (0 < value && value <= 100)
			System.out.println("Желтый");
		if (value > 100)
			System.out.println("Зеленый");
	}

	private static void compareNumbers() {
		int a = 15;
		int b = -5;
		System.out.println((a >= b) ? "a >= b" : "a < b");
	}

	private static void checkSumSign() {
		int a = 5;
		int b = 1;
		System.out.println(((a + b) >= 0) ? "Сумма положительная" : "Сумма отрицательная");
	}

	private static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}

}
