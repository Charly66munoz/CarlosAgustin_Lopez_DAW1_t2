import Controller.Aceleracion;
import model.Coche;

import java.util.Scanner;

public class Entrada {


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Aceleracion aceleracion = new Aceleracion();
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        int vueltas = 5;
        System.out.println("Ingrese las caractersitisticas del primer concursante ");
        System.out.println("");
        /*
        System.out.println("Marca: ");
        coche1.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        coche1.setModelo(scanner.nextLine());

        System.out.println("Matricula: ");
        coche1.setMatricula(scanner.nextLine());
        */

        System.out.println("Caballos de Fuerza cv: ");
        coche1.setCv(scanner.nextInt());
        int cv = coche1.getCv();
        System.out.println("Que cilindrada tiene: ");
        coche1.setCc(scanner.nextInt());
        int cc = coche1.getCc();

        System.out.println(" ");
        System.out.println(" ");

        coche1.mostrarValores();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(" A que velocidad quiere acelerar el coche con matricula sefsefses");
        coche1.setAceleracion(scanner.nextInt());
        aceleracion.acelerar(coche1.getAceleracion(),5);







        int  kilometros= coche1.getKm();

    }

}
