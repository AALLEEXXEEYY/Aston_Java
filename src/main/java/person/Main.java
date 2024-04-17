package person;


/***
 * 1) Написать класс с приватными полями (минимум 3),
 * задать для них геттеры и сеттеры, в сеттерах прописать валидацию подстановки значений.
 * После создания класса вывести в консоль класслоадер,
 * который этот класс загрузил и имя созданного класса.
 * 2) Написать утилити класс (статические поля и методы) минимум с 2 методами

 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("c ");
        System.out.println("Person name: "+person.getName());

        person.setAge(1);
        System.out.println("Person age: "+person.getAge());

        person.setWeight(40L);
        System.out.println("Person weight: "+person.getWeight());


        System.out.println(MathUtil.PI);

        System.out.println(MathUtil.calculateCircleArea(5));

        System.out.println(MathUtil.calculateFactorial(4));




    }
}
