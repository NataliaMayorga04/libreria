package LibreriaEcoforex;

public class Libro {
     String autor;
     String categoria;
     int numeroDeLibros;


     @Override
     public String toString() {
          return "Libro " +
                  "Autor = " + autor + '\'' +
                  ", Categoria = " + categoria + '\''+
                  ", Cantidad de Libros = "+numeroDeLibros+'\n';
     }

     public String getAutor() {
          return autor;
     }

     public String getCategoria() {
          return categoria;
     }

     public void setAutor(String autor) {
          this.autor = autor;
     }

     public void setCategoria(String categoria) {
          this.categoria = categoria;
     }

     public int getNumeroDeLibros() {
          return numeroDeLibros;
     }

     public void setNumeroDeLibros(int numeroDeLibros) {
          this.numeroDeLibros = numeroDeLibros;
     }
}
