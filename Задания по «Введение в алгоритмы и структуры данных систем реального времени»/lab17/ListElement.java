package lab17;

class ListElement {
    private String name;

    public ListElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayOnScreen() {
        System.out.println("Элемент: " + name);
    }
}
