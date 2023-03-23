
public class Main {
    public static void main(String[] args) {

        String[] authorName = {"Л.Н.Толстой", "Ф.М.Достоевский"};
        String[] bookName = {"Война и Мир", "Преступление и наказание"};
        int[] publishingYear = {1867, 1866};
        for (int i = 0; i < authorName.length; i++) {
            System.out.println("Имя автора - " + authorName[i] + " Имя книги " + bookName[i] + " Год публикации " + publishingYear[i]);
        }
        Author lev = new Author("Лев", "Толстой");
        System.out.println("lev = " + lev.getName());
        Author tolstoy = new Author("Лев", "Толстой");
        System.out.println("tolstoy = " + tolstoy.getSurname());
        Book warAndPeace = new Book("Война и мир", lev, 1867);
        System.out.println("warAndPeace = " + warAndPeace.getBookName());
        Book authorBook = new Book("Война и мир", lev, 1867);
        System.out.println("authorBook = " + authorBook.getAuthor().getName() + " " + authorBook.getAuthor().getSurname());
        Book yearBook = new Book("Война и мир", lev, 1867);
        System.out.println("yearBook = " + yearBook.getPublishingYear());

        Author fedor = new Author("Фёдор", "Достоевский");
        System.out.println("fedor = " + fedor.getName());
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        System.out.println("dostoevsky = " + dostoevsky.getSurname());
        Book crimeAndPunishment = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("crimeAndPunishment = " + crimeAndPunishment.getBookName());
        Book authorSecondBook = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("authorSecondBook = " + authorSecondBook.getAuthor().getName() + " " + authorSecondBook.getAuthor().getSurname());
        Book yearSecondBook = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("yearSecondBook = " + yearSecondBook.getPublishingYear());
        yearSecondBook.setPublishingYear(2023);
        System.out.println("yearSecondBook.getPublishingYear() = " + yearSecondBook.getPublishingYear());


    }

}