package lab19;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SortingStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }

    public Object search(List<Student> students) throws BadFIO {
        System.out.println("Введите ФИО студента");
        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.nextLine();
            System.out.println("Ищем студента");
            for (Student student : students) {
                if (Objects.equals(student.getFullname(), string)) {
                    return student;
                }
            }
            throw new BadFIO("Такого студента нет");
            } catch (BadFIO e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
}