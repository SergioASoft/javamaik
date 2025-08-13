import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean esPrimo =true;
        System.out.println("Ingrese un número: ");
        Long num=scanner.nextLong();

        for(int i=2;i<num;i++){
            if (num%i==0) {
                esPrimo =false;
            }
        }
        if (esPrimo){
            System.out.println("El número ingresado es un número primo");
        }else{
            System.out.println("El número ingresado no es un número primo");
        }

        scanner.close();
    }
}
