class Livro {
    private String title;
    private String author;
    private int numberOfPages;

    public Livro(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getBookInfo() {
        return "Título: " + title + "\nAutor: " + author + "\nNúmero de páginas: " + numberOfPages;
    }
}