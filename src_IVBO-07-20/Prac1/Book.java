package Prac1;

public class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle(String title){
        return title;
    }
    public String getAuthor(String author) {
        return author;
    }
    public String toString(){
        return this.author+", название "+this.title;
    }
    public void authorPrint(){
        System.out.println("Автор книги "+this.title+" - "+this.author);
    }
    public static class Builder {
        private Book newBook;
        public Builder(){
            newBook = new Book();
        }
        public Book.Builder withTitle(String title){
            newBook.title = title;
            return this;
        }
        public Book.Builder withAuthor(String author){
            newBook.author = author;
            return this;
        }
        public Book build(){
            return newBook;
        }
    }
}
