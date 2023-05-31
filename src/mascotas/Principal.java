package mascotas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ArrayList<mascota> ListaMascotas = new ArrayList<>();

        String menu = "***MENU***\n\n";
        menu += "1) Ingresar datos\n";
        menu += "2) Listar y buscar por nombre\n\n";
        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opt == 1) {
                mascota m = new mascota(); 
                m.menu(opt);
                ListaMascotas.add(m);
            } else {
               
            }
        } while (opt != 2);

        String validar = JOptionPane.showInputDialog("Ingrese  ('SI') para listar \n" + "las mascotas ingresadas y\n" + "('NO') para salir");
        if (validar.equalsIgnoreCase("si")) {
            for (mascota masc : ListaMascotas) {
                JOptionPane.showMessageDialog(null, "Nombre: " + masc.getNombre() +
                        "\nEspecie: " + masc.getEspecie() +
                        "\nEdad: " + masc.getEdad() + " años");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación finalizada");
        }

        String nombreM = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
        for (mascota masc : ListaMascotas) {
            
                masc.buscarMascota(nombreM);
                System.out.println("entro" );
             break;
        }
    }
}
