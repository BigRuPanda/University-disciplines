package lab17;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        ListContainer listContainer = new ListContainer();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колитчество элементов для добавления: ");
        int numElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Введите название элемента " + (i + 1) + ": ");
            String elementName = scanner.nextLine();
            listContainer.addElement(new ListElement(elementName));
        }

        listContainer.displayAllElements();

        System.out.print("Введите название элемента для удаления: ");
        String elementToDelete = scanner.nextLine();
        listContainer.removeElementByName(elementToDelete);

        listContainer.displayAllElements();

        System.out.println("Лист пуст? " + listContainer.isEmpty());

        listContainer.clearList();

        System.out.println("Лист пуст? " + listContainer.isEmpty());
    }
}
