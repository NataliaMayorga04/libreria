package LibreriaEcoforex;

import javax.swing.*;
import java.util.ArrayList;

public class Libreria {

    public int nl = 0;
    static ArrayList<Libro> libros = new ArrayList<>();

    public static void agregar() {

        Libro nuevoLibro = new Libro();
        int i=0;
        boolean agregarLibroN = false;
        nuevoLibro.autor = JOptionPane.showInputDialog("Ingresa el Autor del libro");
        nuevoLibro.categoria = JOptionPane.showInputDialog("Ingrese la categoria del libro");
        nuevoLibro.numeroDeLibros=1;

        for (Libro libroBuscado : Libreria.libros){
            if(libroBuscado.getAutor().equals(nuevoLibro.autor) && libroBuscado.getCategoria().equals(nuevoLibro.categoria) && i<Libreria.libros.size()){
                int n= libroBuscado.getNumeroDeLibros();
                int nuevoNumeroDeLibros=n+1;
                int restaDeLibro=nuevoNumeroDeLibros-1;
                libroBuscado.setNumeroDeLibros(nuevoNumeroDeLibros);
                if(libroBuscado.getNumeroDeLibros()<= 5){

                    JOptionPane.showMessageDialog(null, "Has agregado exitosamente un libro");
                }
                if(libroBuscado.getNumeroDeLibros()>5){
                    libroBuscado.setNumeroDeLibros(restaDeLibro);
                    JOptionPane.showMessageDialog(null,"El libro ya tiene 5 ejemplares en la Libreria");

                }



            }else{
                i=i+1;

                if(i==Libreria.libros.size()){
                    agregarLibroN = true;
                }

            }



        }
        if(agregarLibroN == true){
            libros.add(nuevoLibro);
        }


        Libreria.mostrarArray();
        System.out.println("----------------------------------------------");


    }

    public static void mostrarArray() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println("---->" + libros.get(i));

        }
    }

    public static void buscarLibro() {
        String categoriaIntro;
        String autorIntro;
        int n=0;

        categoriaIntro = JOptionPane.showInputDialog("Introduce la categoria:");
        autorIntro = JOptionPane.showInputDialog("Introduce el autor:");

        for (Libro libroBuscado : Libreria.libros) {

            if (libroBuscado.getCategoria().equals(categoriaIntro) && n<Libreria.libros.size() && libroBuscado.getAutor().equals(autorIntro)) {

                JOptionPane.showMessageDialog(null,"Si existe!");


            }
            else{
                n=n+1;
                if(n==Libreria.libros.size()){
                    JOptionPane.showMessageDialog(null,"No se ha encontrado un libro con esta categoria y autor");
                }

            }

        }

    }

    public static void crearLibreria() {
        Libro nuevoLibro = new Libro();
        nuevoLibro.autor= "Neruda";
        nuevoLibro.categoria="Realismo";
        nuevoLibro.numeroDeLibros=1;

        libros.add(nuevoLibro);

        Libreria.mostrarArray();
        System.out.println("----------------------------------------------");
    }

}
