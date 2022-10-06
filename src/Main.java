public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author dostoevsky = new Author("Федор", "Достоевский");

        Book dubrovsky = new Book("Дубровский", 1841, pushkin);
        Book igrok = new Book("Игрок", 1865, dostoevsky);

        printBook(dubrovsky);
        printBook(igrok);

        igrok.setPublicationYear(1866);

        printBook(igrok);
    }

    public static void printBook(Book book) {
        System.out.println("======================");
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("======================");
    }
}