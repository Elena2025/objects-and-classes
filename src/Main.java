public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book voina = new Book("Война и мир", tolstoy, 2000);
        Book prestuplenie = new Book("Преступление и наказание", dostoevsky, 2010);
        voina.setPublished(2020);
    }
}