import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private List<Libro> booksList = new ArrayList<Libro>();
    private Set<Libro> books;

    public Libro searchBook(String str) {
        for (Libro book : booksList) {
            if (book.getTitle().equals(str) || book.getId().equals(str))
                return book;
        }
        return null;
    }

    public Libro searchBook(Autore autore) {
        for (Libro book : booksList) {
            if (book.getAutor().equals(autore))
                return book;
        }
        return null;
    }

    public boolean addBook(Libro book) {
        return booksList.add(book);
    }

    public boolean removeBook(Libro book) {
        return booksList.remove(book);
    }

    public void printByAuthor(Autore author){
        List<Libro> tmp = new ArrayList<Libro>();
        for(Libro book : booksList){
            if(book.getAutor().equals(author))
                tmp.add(book);
        }
        Collections.sort(tmp);
        for(Libro book : tmp)
            System.out.println("Titolo: " + book.getTitle() + ", sinossi: " + book.getSin());
    }
}
 /* Realizzare i metodi della classe Biblioteca che permettano le seguenti azioni:

    inserimento di un Libro
    cancellazione di un Libro
    ricerca di un Libro a partire da codice, titolo o Autore
    stampa di “titolo: sinossi” di tutti i titoli di un determinato Autore, ordinati in ordine lessicografico ascendente
    (in base al titolo) usando "\n" come carattere separatore
    Suggerimento: Effettuare l’override dei metodi equals, hashcode e toString dove necessario
     */