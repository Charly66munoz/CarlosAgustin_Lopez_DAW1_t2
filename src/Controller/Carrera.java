package Controller;

public class Carrera {

    private String ganador;
    private int kmTotales;
    private int vueltas;


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
}
