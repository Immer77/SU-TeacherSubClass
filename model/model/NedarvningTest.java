package model.model;

import java.time.LocalDate;

public class NedarvningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("model.Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

		Teacher teacher = new Teacher("Hanne","Sønderhøj 30", "Datalogi", 250223.1);

		person.udskrivPerson();

		System.out.println();

		System.out.println("model.Student:");

		student.udskrivPerson();// kalder overrided metode

		System.out.println();

		student.udskrivAdresse(); // kalder egen metode

		System.out.println(student.getName()); // kalder nedarvet metode

		teacher.udskrivPerson();
		teacher.yearlySalaryIncrease();
		teacher.udskrivPerson();


	}

}
