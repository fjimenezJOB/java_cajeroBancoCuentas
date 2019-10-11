package paquete;
import java.util.Scanner;
public class General {
    public static void main(String[] args){
        Persona roberto = new Persona("Roberto","Fernandez","608709018");
        Cuenta deRoberto = new Cuenta(608709018, 300.00, roberto);
        Persona juan = new Persona("Monica", "Bolea Miquel", "623297530");
        Cuenta dejuan = new Cuenta(608709017,60000.00, juan);
        for(int i = 0;i<10;i++) {
            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Por favor introduzca EL NUMERO DE CUENTA ->>");
            String numeroCuenta = entradaEscaner.nextLine();
            int numerCuenta = Integer.parseInt(numeroCuenta);
            if(numerCuenta == deRoberto.getNumCuenta()) {
                System.out.println("Hola, "+roberto.getNombre()+ " " +roberto.getApellido());
                System.out.println("MENU");
                System.out.println("1.Retirar.");
                System.out.println("2.Ingresar.");
                String eleccion = entradaEscaner.nextLine();
                switch (eleccion) {
                    case "1":
                        System.out.println("Por favor introduzca la cantidad a RETIRAR ->>");
                        String cantidad = entradaEscaner.nextLine();
                        float cantidadFloat = Float.parseFloat(cantidad);
                        deRoberto.retirar(cantidadFloat);
                        break;
                    case "2":
                        System.out.println("Por favor introduzca la cantidad a INGRESAR ->>");
                        String dinero = entradaEscaner.nextLine();
                        float cantFloat = Float.parseFloat(dinero);
                        deRoberto.ingresar(cantFloat);
                        break;
                    default:
                        System.out.println("Por favor, elija una de las dos opciones!!");
                }
            }else if(numerCuenta == dejuan.getNumCuenta()){
                System.out.println("Hola, "+juan.getNombre()+ " " +juan.getApellido());
                System.out.println("MENU");
                System.out.println("1.Retirar.");
                System.out.println("2.Ingresar.");
                String eleccion = entradaEscaner.nextLine();
                    switch (eleccion) {
                        case "1":
                            System.out.println("Por favor introduzca la cantidad a RETIRAR ->>");
                            String cantidad = entradaEscaner.nextLine();
                            float cantidadFloat = Float.parseFloat(cantidad);
                            dejuan.retirar(cantidadFloat);
                            break;
                        case "2":
                            System.out.println("Por favor introduzca la cantidad a INGRESAR ->>");
                            String dinero = entradaEscaner.nextLine();
                            float cantFloat = Float.parseFloat(dinero);
                            dejuan.ingresar(cantFloat);
                            break;
                        default:
                            System.out.println("Por favor, elija una de las dos opciones!!");
                    }
            }
        }
    }
}
