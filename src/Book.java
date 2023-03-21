public class Book {
   private String bookName;
   private String authorFullName;
   private int publishingYear;
    public Book(String bookName, String authorFullName, int publishingYear) {
        this.bookName=bookName;
        this.authorFullName=authorFullName;
        this.publishingYear=publishingYear;

    }
    public String getBookName() {
        return this.bookName;
    }
    public  String getAuthorFullName() {
        return this.authorFullName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


}
