package LibreriaEcoforex;
import javax.swing.*;

public class Libreria {

    public static void main(String[] args) {

    }

        public String buscarCategoria(){
            String categoriaIntro;
            categoriaIntro = JOptionPane.showInputDialog("Introduce la categoria:");
            for (Libro libroBuscado : Libreria){
        
                if (libroBuscado.getCategoria().equals(categoriaIntro)){
                    System.out.println(libroBuscado.getCategoria());
                    System.out.println(libroBuscado.getAutor());
                    
        
                }   
        
            }

        }

        public String buscarAutor(){
            String autorIntro;
            autorIntro = JOptionPane.showInputDialog("Introduce el autor:");
            for (Libro libroBuscado : Libreria){
        
                if (libroBuscado.getAutor() == autorIntro){
                    System.out.println(libroBuscado.getCategoria());
                    System.out.println(libroBuscado.getAutor());
                    
        
                }   
        
            }

        }

}

       

