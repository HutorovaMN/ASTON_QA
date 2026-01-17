package Lesson_4;

import java.math.BigDecimal;
import java.util.Arrays;

import Lesson_4.Park.Attraction;

/*2. Создать массив из 5 сотрудников. 
Пример:
// вначале объявляем массив объектов
Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
               "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);*/
public class Controller {

	public static void main(String[] args) {
		Person person = new Person();

		System.out.println("Task_1 " + "One person");
		System.out.println(person.toString());

		Person[] persArray = new Person[5];
		persArray[0] = new Person("Sidorov Petr Petrovich", "Engineer", "ivivan@mailbox.com", "892312312",
				new BigDecimal("30000"), 30);
		persArray[1] = new Person("Vetrov Georg Petrovich", "IT", "vetrov@gmail.com", "892312312",
				new BigDecimal("923.89"), 32);
		persArray[2] = new Person("Kriksin Andrey Nikolaevich", "HR", "kriksin@gmail.com", "892378549",
				new BigDecimal("678.89"), 25);
		persArray[3] = new Person("Fursov Vlad Vladimirovish", "Tester AQA", "fursov@gmail.com", "892332983",
				new BigDecimal("123.89"), 32);
		persArray[4] = new Person("Kasachonok Glev Petrovich", "Tester QA", "kasachonok@gmail.com", "892319832",
				new BigDecimal("678.32"), 29);
		System.out.println("Task_2 " + "Array from 5 persons");
		System.out.println(Arrays.toString(persArray).replace("], ", "]\n"));

		Attraction[] attrArray = new Park.Attraction[3];
		attrArray[0] = new Park.Attraction("slides", "5:00", new BigDecimal("10"));
		attrArray[1] = new Park.Attraction("chamomile", "7:00", new BigDecimal("12"));
		attrArray[2] = new Park.Attraction("airplane", "6:00", new BigDecimal("15"));
		System.out.println("Task_3 " + "Array from 3 attractions");
		System.out.println(Arrays.toString(attrArray).replace("], ", "]\n"));
	}
}
