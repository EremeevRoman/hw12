public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    //public Author() {}
    public String getAuthorName() {
        return this.authorName;
    }
    public  String getAuthorSurname() {
        return this.authorSurname;
    }
}
