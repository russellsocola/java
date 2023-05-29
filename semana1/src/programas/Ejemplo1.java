package programas;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("hello wordl");
        System.out.println("¿Ingrese el tipo de hamburguesa?");
        String tipo = sc.nextLine();

        if(tipo.equals("Clasica")){
            System.out.println("¿En que presentacion desea?");
            String presentacion= sc.nextLine();

            if(presentacion.equals("Mediana")) {
                int precio = 20;
                System.out.println("Escogio una hamburguesa Clasica mediana le cuesta : "+precio);

            }else{
                int precio = 24;
                System.out.println("Escogio una hamburguesa Clasica grande le cuesta : "+precio);
            }
        }else if(tipo.equals("Peruana")){
            System.out.println("¿En que presentacion desea?");
            String presentacion= sc.nextLine();

            if(presentacion.equals("Mediana")) {
                int precio = 22;
                System.out.println("Escogio una hamburguesa Peruana mediana le cuesta : "+precio);

            }else{
                int precio = 27;
                System.out.println("Escogio una hamburguesa Peruana grande le cuesta : "+precio);
            }

        }else{
            System.out.println("¿En que presentacion desea?");
            String presentacion= sc.nextLine();

            if(presentacion.equals("Mediana")) {
                int precio = 30;
                System.out.println("Escogio una hamburguesa Extrema mediana le cuesta : "+precio);
            }else{
                int precio = 35;
                System.out.println("Escogio una hamburguesa Extrema grande le cuesta : "+precio);
            }
        }
    }
    static void cupon(){

    }
}
