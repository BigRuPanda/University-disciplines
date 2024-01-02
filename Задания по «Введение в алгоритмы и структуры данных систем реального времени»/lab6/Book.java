package laba6;

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
    }
}