package LibreriaEcoforex;
import javax.swing.*;

public class Libreria {

    public static void main(String[] args) {

    String categoriaIntro;
    String autorIntro;

    categoriaIntro=JOptionPane.showInputDialog("Introduce la categoria");
    autorIntro=JOptionPane.showInputDialog("Introduce el autor");

    }

    public String buscar(String categoriaIntro, String autorIntro){
        for (Libro libresito : Libreria){
        
            if (libresito == categoriaIntro || autorIntro){
                
    
            }   
    
        }

    }    

}

