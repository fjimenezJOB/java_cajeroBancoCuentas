package paquete;
import java.util.Scanner;
public class Persona {
    private String nombre;
    private String apellido;
    private String numtelefono;
    public Persona(String nombre, String apellido, String numtelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numtelefono = numtelefono;
    }
    public Persona() {}
    public void limitTelefono() {
        System.out.println("Por favor introduzca su numero de telefono-->");
        Scanner entradaEscaner = new Scanner(System.in);
        String tel = entradaEscaner.nextLine();
        if (tel.length() > 9) {
            System.out.println("ERROR!!!--> El telefono NO puede tener mas de 9 numeros");
            numtelefono = "";
        } else {
            numtelefono = tel;
            setNumtelefono(numtelefono);
            System.out.println("El telefono introducido es: "+tel);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNumtelefono() {
        return numtelefono;
    }
    public void setNumtelefono(String numtelefono) {
        this.numtelefono = numtelefono;
    }
}

