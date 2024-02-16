package Lesson_3;

import java.util.Arrays;

public class Lesson_3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 11;
		int year = 1978;
		String str = "Java";
		int len = 5;
		int initialValue = 3;
		System.out.println("Task_1_______________________________");
		System.out.println(sumNumbers(a, b));
		System.out.println("Task_2_______________________________");
		positiveOrNegativeNumber(a);
		System.out.println("Task_3_______________________________");
		System.out.println(numberBoolean(a));
		System.out.println("Task_4_______________________________");
		printString(a, str);
		System.out.println("Task_5_______________________________");
		leapYear(year);
		System.out.println("Task_6_______________________________");
		replaceArray();
		System.out.println("Task_7_______________________________");
		arrayHundred();
		System.out.println("Task_8_______________________________");
		arrayByTwo();
		System.out.println("Task_9_______________________________");
		squareArray();
		System.out.println("Task_10_______________________________");
		System.out.println(Arrays.toString(lenArray(len, initialValue)));

	}

	private static boolean sumNumbers(int a, int b) {
		System.out.println("Сумма чисел " + a + " " + b + " = " + (a + b));
		return ((a + b) >= 10 && (a + b) <= 20);
	}

	private static void positiveOrNegativeNumber(int a) {
		System.out.println(a >= 0 ? "Число положительное " + a : "Число отрицательное " + a);
	}

	private static boolean numberBoolean(int a) {
		return (a < 0);
	}

	private static void printString(int a, String str) {
		System.out.println("Печатаем " + str + " " + a + " раз");
		while (a > 0) {
			System.out.println(str);
			a--;
		}
	}

	private static void leapYear(int year) {
		System.out.println(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? "Год високосный " + year
				: "Год невисокосный " + year);
	}

	private static void replaceArray() {
		int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		System.out.println("Массив до замены символов:");
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = 1;
			} else if (array[i] == 1) {
				array[i] = 0;
			}
		}
		System.out.println("Массив после замены символов 1 на 0 и обратно:");
		System.out.println(Arrays.toString(array));
	}

	private static void arrayHundred() {
		System.out.println("Массив - 100 элементов:");
		int[] arrayOne = new int[100];
		System.out.println("Длина массива = " + arrayOne.length);
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = i + 1;
			System.out.print(arrayOne[i] + " ");
		}
		System.out.println();
	}

	private static void arrayByTwo() {
		int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		System.out.println("Массив до замены символов:");
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 6) {
				array[i] = array[i] * 2;
			}
		}
		System.out.println("Массив после умножения чисел меньше шести на два:");
		System.out.println(Arrays.toString(array));
	}

	private static void squareArray() {
		int[][] array = new int[5][5];
		System.out.println("Массив с единицами по диагонали:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j || i == array[i].length - j - 1) {
					array[i][j] = 1;
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[] lenArray(int len, int initialValue) {
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = initialValue;
		}
		System.out.println("Массив с заданным значениями len и initialValue:");
		return array;
	}
}
