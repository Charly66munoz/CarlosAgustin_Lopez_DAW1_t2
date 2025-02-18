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

        System.out.println("Marca: ");
        coche1.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        coche1.setModelo(scanner.nextLine());

        System.out.println("Matricula: ");
        coche1.setMatricula(scanner.nextLine());


        System.out.printf("Caballos de Fuerza cv del coche %s matricula %s: ", coche1.getModelo() , coche1.getMatricula());
        coche1.setCv(scanner.nextInt());
        System.out.println(" ");
        //System.out.printf("Caballos de Fuerza cv del coche %s matricula%s : ", coche2.getModelo() , coche2.getMatricula());
        //coche1.setCv(scanner.nextInt());
        System.out.println(" ");
        System.out.printf("Que cilindrada tiene el coche con matricula %s: ", coche1.getMatricula());
        coche1.setCc(scanner.nextInt());

        //System.out.printf("Que cilindrada tiene el coche con matricula %s: ", coche2.getMatricula());
        //coche2.setCc(scanner.nextInt());


        System.out.println(" ");
        System.out.println(" ");

        coche1.mostrarValores();

        System.out.println(" ");
        System.out.println(" ");

        System.out.printf(" A que velocidad quiere acelerar el coche con  %s: ", coche1.getMatricula());
        coche1.setAceleracion(scanner.nextInt());
        //System.out.printf(" A que velocidad quiere acelerar el coche con  %s: ", coche2.getMatricula());
        //coche2.setAceleracion(scanner.nextInt());
        //coche2.setAceleracion(scanner.nextInt());

        aceleracion.acelerar(coche1.getAceleracion(),5,5);
        //aceleracion.acelerar(coche2.getAceleracion(),5);


        System.out.println(" ");
        System.out.println(" ");






        System.out.println("km es "+coche1.getKm());

    }

}
