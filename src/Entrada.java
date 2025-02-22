
import Controller.Carrera;
import model.Coche;

import java.util.Scanner;

public class Entrada {


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        Carrera carrera = new Carrera();

        System.out.println("Ingrese el numero de vueltas, cada vuelta tiene 60km  ");
        carrera.setVueltas(scanner.nextInt());
        scanner.nextLine();
        carrera.setTotalkmrace(carrera.infoRace(carrera.getVueltas(), carrera.getKmPorVuetla()));

        System.out.println("Ingrese las caractersitisticas del primer concursante ");
        System.out.println(" ");

        System.out.println("Marca: ");
        coche1.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        coche1.setModelo(scanner.nextLine());

        System.out.println("Matricula: ");
        coche1.setMatricula(scanner.nextLine());

        System.out.println(" ");
        System.out.printf("Caballos de Fuerza cv del coche %s matricula %s: ", coche1.getModelo() , coche1.getMatricula());
        System.out.println(" ");
        coche1.setCv(scanner.nextInt());
        System.out.println(" ");
        System.out.printf("Que cilindrada tiene el coche con matricula %s: ", coche1.getMatricula());
        System.out.println(" ");
        coche1.setCc(scanner.nextInt());
        scanner.nextLine();
        System.out.println(" ");


        System.out.println("Ingrese las caractersitisticas del segundo concursante ");
        System.out.println(" ");

        System.out.println("Marca: ");
        coche2.setMarca(scanner.nextLine());

        System.out.println("Modelo: ");
        coche2.setModelo(scanner.nextLine());

        System.out.println("Matricula: ");
        coche2.setMatricula(scanner.nextLine());

        System.out.println(" ");
        System.out.printf("Caballos de Fuerza cv del coche con matricula %s: ", coche2.getMatricula());
        System.out.println(" ");
        coche2.setCv(scanner.nextInt());
        System.out.println(" ");
        System.out.printf("Que cilindrada tiene el coche con matricula %s: ", coche2.getMatricula());
        System.out.println(" ");
        coche2.setCc(scanner.nextInt());
        System.out.println(" ");


        System.out.printf("A que velocidad quiere acelerar el coche con  matricula Nº%s: ", coche1.getMatricula());
        System.out.println(" ");
        coche1.setAceleracion(scanner.nextInt());
        System.out.println(" ");
        System.out.printf("A que velocidad quiere acelerar el coche con  matricula Nº%s: ", coche2.getMatricula());
        System.out.println(" ");
        coche2.setAceleracion(scanner.nextInt());

        carrera.iniciarCarrera(coche1,coche2);



    }

}
