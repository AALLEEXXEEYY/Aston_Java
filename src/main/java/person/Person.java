package person;


public class Person {

    private String name;
    private int age;
    private float weight;

    public Person() {
    }

    public Person(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    public void setAge(int age) {
        if(age<0 || age>100 ){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age=age;
    }

    public void setWeight(float weight) {
        if(weight<40 || weight>150){
            throw new IllegalArgumentException("Weight must be between 40 and 150");
        }
        this.weight = weight;
    }


}
