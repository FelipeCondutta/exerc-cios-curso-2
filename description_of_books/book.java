package description_of_books;

public class book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void technicalSheet(){
        System.out.println("Autor do livro: " + author);
        System.out.println("Nome do livro: " + name);
    }
}
