package LibreriaEcoforex;

import javax.swing.*;
import java.util.ArrayList;

public class Libreria {

    public int nl =0;
    static ArrayList<Libro>libros= new ArrayList<>();

    public static void agregar(){

        Libro nuevoLibro = new Libro();
        nuevoLibro.autor = JOptionPane.showInputDialog("Ingresa el Autor del libro");
        nuevoLibro.categoria = JOptionPane.showInputDialog("Ingrese la categoria del libro");
        JOptionPane.showMessageDialog(null,"Has agregado exitosamente un libro");


        libros.add(nuevoLibro);

        Libreria.mostrarArray();
        System.out.println("----------------------------------------------");


    }
    public static void mostrarArray(){
        for (int i = 0; i < libros.size(); i++) {
            System.out.println("---->"+libros.get(i));

        }
    }
}
