package programas;

public class Semana1 {
    public static void main(String[] args) {
    int edad = 22;
    double numeroF = 2.5;
    double peso = 70.5;
    double talla = 1.72;
    String nombre= "Russell Socola";
    String nacionalidad = "Peruano";

    int numeroFEntero = (int)numeroF;

        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Tengo de edad: " + edad);
        System.out.println("Mi numero favorito es :"+ numeroF+ " y esta en decimales");
        System.out.printf("Mi peso es %.2f kilos \n", peso);
        System.out.printf("Mi talla es %.2f metros \n",talla);
        System.out.printf("Mi numeroF es %d \n", numeroFEntero);
        System.out.printf("Mi nacionalidad es %s",nacionalidad);

    }
}
