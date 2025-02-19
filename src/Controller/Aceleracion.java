package Controller;

import model.Coche;

public class Aceleracion {

    private Coche velocidadMetodo = new Coche();
    private int velocidad = velocidadMetodo.getVelocidad();
    private int km, cv;

    public int acelerar(){
        return acelerar();
    }

    public int acelerar (int aceleracion, int vueltas, int totalVueltas ) {


        velocidad = km*2;
        System.out.println("velocidad "+velocidad);
        int vuelta=  totalVueltas+1 -(vueltas);

        if (vueltas <= 0) {
            System.out.println("km totales: " + km); //vueltas

            return 0;
        }else {
            System.out.println("vuelta: " + vuelta); //vueltas


            if (cv >= 105) {
                velocidad += velocidad + (int) (Math.random() * aceleracion) + 10;
                if (velocidad > 253) {
                    velocidad = 253;
                    km = velocidad / 2;

                    System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );

                    System.out.println("Los km han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                } else {

                    km = velocidad  / 2;

                    System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );

                    System.out.println("Los km han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
            } else {
                velocidad += velocidad + (int) (Math.random() * aceleracion);
                if (velocidad >= 253) {
                    velocidad = 253;
                    km =  velocidad / 2;

                    System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );

                    System.out.println("Los km han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
                if (velocidad < 10) {
                    velocidad += 10;
                    km =  velocidad / 2;

                    System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );

                    System.out.println("Los km han sumado: " + km);
                    return km + acelerar(velocidad, vueltas - 1, totalVueltas);
                }
                km =  velocidad / 2;

                System.out.println("La velocidad del coche tras la aceleracion nº " +vuelta+" es: " + velocidad );
                System.out.println("Los km han sumado: " + km);
                return km + acelerar(velocidad, vueltas - 1, totalVueltas);
            }
        }

    }

}
