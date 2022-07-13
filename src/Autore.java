import java.util.ArrayList;
import java.util.List;

public class Autore {
    //Ogni Autore possiede un codice (univoco), un nome, un cognome e una lista di Libri scritti
    private int id;
    private String name;
    private String surname;
    private List<Libro> booksList;

    public Autore(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = 0;
        booksList = new ArrayList<Libro>();
    }

    public void addToList(Libro book) {
        booksList.add(book);
    }

    public List<Libro> getBooksList() {
        return booksList;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "nome='" + name + '\'' +
                ", cognome='" + surname + '\'' +
                '}';
    }
}
