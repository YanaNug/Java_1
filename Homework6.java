import java.util.*;

public class Homework6 {
// Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их

// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person people1 = new Person("Капарова", "Анна", "27", "жен", "anna@mail.ru", "Москва");
        Person people2 = new Person("Юсупова", "Диана", "17", "жен", "diana@mail.ru", "Тула");
        Person people3 = new Person("Пчелинцев", "Олег", "25", "муж", "oleg@mail.ru", "Ставрополь");
        Person people4 = new Person("Шевчук", "Роман", "27", "муж", "roman@mail.ru", "Уфа");
        Person people5 = new Person("Иванова", "Оксана", "19", "жен", "oksana@mail.ru", "Уфа");

        persons.add(people1); 
        persons.add(people2); 
        persons.add(people3); 
        persons.add(people4);
        persons.add(people5);

        System.out.println(persons);
        System.out.println();
        for (Person list : persons) {
            if (Integer.parseInt(list.age) > 20) {
                System.out.println(list);
            }
        }
        System.out.println();
        System.out.println(people1.age.equals(people4.age));
        System.out.println();
        System.out.println(people1.surname.hashCode());
        System.out.println(people4.name.hashCode());

    }

}