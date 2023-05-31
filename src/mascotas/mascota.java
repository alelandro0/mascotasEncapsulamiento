package mascotas;

import javax.swing.JOptionPane;

public class mascota {
    // Atributos
    private int codigo;
    private String nombre;
    private String especie;
    private int edad;

    // Constructor sin parámetros
    public mascota() {
        nombre = "Firu";
        especie = "Default";
        edad = 0;
    }

    // Constructor con parámetros
    public mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos de acceso (getters y setters)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese nombre");
        especie = JOptionPane.showInputDialog("Ingrese especie");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad de la mascota"));
    }

    public void menu(int opt) {
        switch (opt) {
            case 1:
                ingresar();
                break;
            case 2:

                break;

            default:
                break;
        }
    }

    public void buscarMascota(String nombreM) {
        if (nombre.equalsIgnoreCase(nombreM)) {
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre +
                    "\nEspecie: " + especie +
                    "\nEdad: " + edad + " años");
            hacerSonido();
        }
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre: " + nombre + "\n";
        mensaje += "Especie: " + especie + "\n";
        mensaje += "Edad: " + edad + " años";

        JOptionPane.showMessageDialog(null, mensaje, "Información de la mascota", JOptionPane.INFORMATION_MESSAGE);
    }

    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
}
