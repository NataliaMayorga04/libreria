package LibreriaEcoforex;

public class Libro {
     String autor;
     String categoria;

     @Override
     public String toString() {
          return "Libro " +
                  "Autor = " + autor + '\'' +
                  ", Categoria = " + categoria + '\'' ;
     }
}
