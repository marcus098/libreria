public class Main {
    /*
    Esercizio Libreria versione 2 🛵 Scrivere un programma Java che permetta di creare e gestire una biblioteca.
    La classe Biblioteca dovrà permettere la gestione di un archivio di libri.
    Ogni Libro ha un codice (univoco), un titolo, una sinossi e un Autore.

    Ogni Autore possiede un codice (univoco), un nome, un cognome e una lista di Libri scritti

    Realizzare i metodi della classe Biblioteca che permettano le seguenti azioni:

    inserimento di un Libro
    cancellazione di un Libro
    ricerca di un Libro a partire da codice, titolo o Autore
    stampa di “titolo: sinossi” di tutti i titoli di un determinato Autore, ordinati in ordine lessicografico ascendente (in base al titolo) usando "\n" come carattere separatore
    Suggerimento: Effettuare l’override dei metodi equals, hashcode e toString dove necessario
     */
    public static void main(String[] args) {
        Libro book1 = new Libro("01", "primo", "sinossi1", new Autore("aut1", "cogn1"));
        Autore auth1 = new Autore("nome1", "cogn1");
        Libro book2 = new Libro("02", "secondo", "sinossi2", auth1);
        Libro book3 = new Libro("04", "aaaa", "sinossi3", auth1);
        Libro book4 = new Libro("08", "ccccc", "sinossi4", auth1);
        Biblioteca b = new Biblioteca();
        b.addBook(book1);
        b.addBook(book2);
        b.addBook(book3);
        b.addBook(book4);
        System.out.println(b.searchBook("aaaa"));
        System.out.println(b.searchBook("aaaas"));
        System.out.println(b.searchBook("02"));
        System.out.println();
        System.out.println("Ricerca per autore: " + auth1);
        b.printByAuthor(auth1);
    }
}
