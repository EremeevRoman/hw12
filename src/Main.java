
public class Main {
    public static void Main(String[] args) {

        String[] authorName = {"Л.Н.Толстой", "Ф.М.Достоевский"};
        String[] bookName = {"Война и Мир", "Преступление и наказание"};
        int[] publishingYear = {1867, 1866};
        for (int i = 0; i < authorName.length; i++) {
            System.out.println("Имя автора - " + authorName[i] + " Имя книги " + bookName[i] + " Год публикации " + publishingYear[i]);
        }

    }

}