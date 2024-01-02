package lab19;

import java.util.ArrayList;
import java.util.List;

abstract class zadanie2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Елистратов Михаил Юрьевич", "jdfh", 2, "5", 100));
        list.add(new Student("Курдюков Александр Дмитриевич", "fhj", 2, "asf", 23));
        list.add(new Student("Пупкин Василий Василиевич", "sher", 3, "asf", 32));
        list.add(new Student("Симонов Вадим Евгеньевич", "szehr", 2, "aasegsf", 100));
        list.add(new Student("Банифацин Банифаций Банифациевич", "hwb", 5, "assegf", 11));

        SortingStudent sort = new SortingStudent();
        list.sort(sort);

        for (Student student : list) {
            System.out.println(student.getMark() + " " + student.getFullname());
        }

        System.out.println(sort.search(list));
    }
}