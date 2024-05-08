package json;

import person.Person;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {
    public String serialize(Person person) {
        return "{ \"name\": \"" + person.getName() + "\", \"age\": " + person.getAge() + ", \"weight\": " + person.getWeight() + " }";
    }
    public Person deserialize(String json)  {
        String name = json.substring(json.indexOf("name\": \"") + 8, json.indexOf("\","));
        int age = Integer.parseInt(json.substring(json.indexOf("age\": ") + 6, json.indexOf(",", json.indexOf("age\": "))).trim());
        int weight = (int) Double.parseDouble(json.substring(json.indexOf("weight\": ") + 9, json.indexOf("}")).trim());
        return new Person(name, age, weight);
    }

    public String serializeList(List<Person> people)  {
        List<String> serializedPeople = new ArrayList<>();
        for (Person person : people) {
            serializedPeople.add(serialize(person));
        }
        return serializedPeople.toString();
    }

    public List<Person> deserializeList(String json) {
        if (json == null || json.trim().isEmpty()) {
            throw new IllegalArgumentException("JSON to deserialize cannot be empty");
        }
        json = json.substring(1, json.length() - 1);
        String[] objects = json.split(", \\{");
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            String object = i == 0 ? objects[i] : "{" + objects[i];
            people.add(deserialize(object));
        }
        return people;
    }
}