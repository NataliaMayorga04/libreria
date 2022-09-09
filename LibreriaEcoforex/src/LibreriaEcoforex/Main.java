package LibreriaEcoforex;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean salida = false;

        while(salida==false)
        {
            int opcion = 0;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU PRINCIPAL \n"+
                    "1. BUSCAR \n"+
                    "2. AGREGAR \n"+"3. Salir \n"+ "ELIGA SU OPCIÓN \n"));

            switch (opcion) {
                case 1:
                    //
                    break;
                case 2:
                    Libreria.agregar();
                    break;
                case 3:
                    salida = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
                    break;
            }
        }
        if(salida==true){
            JOptionPane.showMessageDialog(null,"adios");
        }

        
    }
}
