package json;

import person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Person> people = new ArrayList<>();
            people.add(new Person("Alexsey", 21, 74));
            people.add(new Person("Victor", 28, 77));
            people.add(new Person("Grigory", 33, 80));
            people.add(new Person("Vasily", 65, 87));
            people.add(new Person("Aleksander", 48, 90));
            people.add(new Person("Anton", 54, 64));

            ObjectMapper mapper = new ObjectMapper();
            FileManager fileManager = new FileManager();

            // Сериализация и запись в файл
            String serialized = mapper.serializeList(people);
            fileManager.appendToFile(serialized, "person.json");

            // Чтение из файла и десериализация
            String readData = fileManager.readAllFromFile("person.json").get(0);
            List<Person> deserializedPeople = mapper.deserializeList(readData);

            for (Person person : deserializedPeople) {
                System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getWeight());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}