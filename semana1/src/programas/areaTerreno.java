package programas;

public class areaTerreno {
    public static void main(String[] args) {
        int a = 15;
        int b =20;
        int c = 10;
        //System.out.println("ingrese los datos a , b , c");
        areaR(a,b,c);

    }
    static void areaR(int a, int b,int c){
        int area1 = c*b;
        int d = ((a - c) * b) / 2;
        int areaT = area1+d;
        System.out.println("El total es: "+areaT);
    }
}
