package Lesson_4;

import java.math.BigDecimal;

/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст. 
Конструктор класса должен заполнять эти поля при создании объекта. 
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль. 

*/
public class Person {
	String name;
	String position;
	String emal;
	String phone;
	BigDecimal salary;
	int age;

	public Person() {
		name = "Ivanov Ivan Ivanovich";
		position = "tester AQA";
		emal = "ivanov@gmail.com";
		phone = "32-56-89";
		salary = new BigDecimal("150.67");
		age = 36;
	}

	public Person(String name, String position, String emal, String phone, BigDecimal salary, int age) {
		this.name = name;
		this.position = position;
		this.emal = emal;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", position=" + position + ", emal=" + emal + ", phone=" + phone + ", salary="
				+ salary + ", age=" + age + "]";
	}

}
