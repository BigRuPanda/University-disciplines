package lab17;

import java.util.ArrayList;
import java.util.List;

class ListContainer {
    private List<ListElement> elements;

    public ListContainer() {
        this.elements = new ArrayList<>();
    }

    public void addElement(ListElement element) {
        elements.add(element);
    }

    public void removeElementByName(String elementName) {
        elements.removeIf(element -> element.getName().equals(elementName));
    }

    public void displayAllElements() {
        System.out.println("Вывод всех элементов:");
        for (ListElement element : elements) {
            element.displayOnScreen();
        }
    }

    public void clearList() {
        elements.clear();
        System.out.println("Очищение листа");
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
