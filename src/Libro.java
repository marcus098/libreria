public class Libro implements Comparable<Libro>{
    //Ogni Libro ha un codice (univoco), un titolo, una sinossi e un Autore.
    private String id;
    private String title;
    private String sin;

    private Autore autor;

    public Libro(String id, String title, String sin, Autore autor) {
        this.id = id;
        this.title = title;
        this.sin = sin;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public String getSin() {
        return sin;
    }

    public Autore getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public void setAutor(Autore autor) {
        this.autor = autor;
    }

    @Override
    public int compareTo(Libro other) {
        return this.title.charAt(0) - other.title.charAt(0);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", titolo='" + title + '\'' +
                ", sinossi='" + sin + '\'' +
                ", autore=" + autor +
                '}';
    }
}
