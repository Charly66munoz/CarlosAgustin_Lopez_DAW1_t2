package Controller;

import model.Coche;

import java.util.Scanner;

public class Carrera {
    Scanner scanner = new Scanner(System.in);

    private String ganador;
    private int kmTotales;
    private int vueltas;
    private int totalkmrace;
    private int kmPorVuetla = 60;


    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }
    public int getKmTotales() {
        return kmTotales;
    }
    public void setGanador (String ganador) {
        this.ganador = ganador;
    }
    public String getGanador(){
     return ganador;
    }
    public void setVueltas(int vueltas){
        this.vueltas = vueltas;
    }
    public int getVueltas (){
        return vueltas;
    }
    public void setTotalkmrace(int totalkmrace){
        this.totalkmrace = totalkmrace;
    }
    public int getTotalkmrace (){
        return totalkmrace;
    }
    public int getKmPorVuetla (){
        return kmPorVuetla;
    }

    public void infoRace (){

    }
    public int infoRace (int vueltas, int kmPorVuetla){
        int totalkmrace = kmPorVuetla*vueltas; //total de kilometros de la carrera
        System.out.println("");
        System.out.printf("La carrera tendra %d vuetlas con un total de %dkm",vueltas, totalkmrace);
        System.out.println("");

        return totalkmrace;
    }

    public void iniciarCarrera(){

    }

    public void iniciarCarrera(Coche coche1, Coche coche2){
        System.out.println("Iniciando la carrera...");
        System.out.println();
        coche1.mostrarValores();
        System.out.println();
        coche2.mostrarValores();
        System.out.println();
        System.out.println("Número de vueltas: " + vueltas);
        System.out.println("Kilómetros totales a recorrer: " + totalkmrace);
        System.out.println("Precione cualquier tecla para comenzar la carrera: ");
        scanner.nextLine();

        while(coche1.getKm()<totalkmrace && coche2.getKm() <totalkmrace){

            for (int i = 1; i <= vueltas ; i++) {

                System.out.println("Realizando vuelta numero: "+i);
                coche1.setKm(coche1.acelerar(coche1.getAceleracion(), i, vueltas));
                coche2.setKm(coche2.acelerar(coche2.getAceleracion(), i, vueltas));

                if (coche1.getKm()>= totalkmrace){
                ganador = coche1.getMatricula();

                break;
                } else if (coche2.getKm()>= totalkmrace) {
                    ganador = coche2.getMatricula();
                    break;
                }

            }
            if (coche1.getKm()<totalkmrace && coche2.getKm() < totalkmrace){
                vueltas++;
            }
                System.out.println(" ");

        }

        System.out.println("El ganador es el coche: "+ ganador);

    }


}
