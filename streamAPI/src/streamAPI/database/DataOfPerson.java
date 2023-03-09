package streamAPI.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import streamAPI.model.Person;

public class DataOfPerson {
	static private List<Person> persons = new ArrayList<>(
			Arrays.asList(
					new Person("Assane", "Niang", 27),
					new Person("Coumba", "Ndao", 20),
					new Person("Omar", "Diouf", 10),
					new Person("Amadou", "Ndiaye", 18),
					new Person("Habib", "Faye", 13),
					new Person("Mariama", "Diallo", 9),
					new Person("Rama", "Ba", 12),
					new Person("Saliou", "Diop", 15),
					new Person("Astou", "Dia", 30),
					new Person("Wendu", "Kitchen", 19),
					new Person("Karl", "Steinbuch", 50),
					new Person("Baba", "Kitchen", 39),
					new Person("Boury", "Kitchen", 11),
					new Person("Awa", "Ndiaye", 28),
					new Person("Ibrahima", "Ndiaye", 70)
					)
			);
	public List<Person> data() {
		return persons;
	}
}
