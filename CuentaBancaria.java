import java.util.Scanner;
public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    Long saldo;

    public CuentaBancaria(String titular,String numeroCuenta,Long saldo){
        this.titular=titular;
        this.numeroCuenta= numeroCuenta;
        this.saldo=saldo;
    }
    public void mostrarCuenta(){
        System.out.println("El titular de la cuenta es: "+titular);
        System.out.println("El número de cuenta es: "+numeroCuenta);
        System.out.println("El saldo actual de la cuenta es: "+saldo);
    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a depositar en la cuenta: ");
        Long deposito= scanner.nextLong();
        saldo+=deposito;
        System.out.println("Depósito exitoso!! Su saldo ahora es de: "+saldo+"$");
        scanner.close();
    }
    public void retirar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar de la cuenta: ");
        Long retiro= scanner.nextLong();
        if (retiro>saldo) {
            System.out.println("El valor a retirar excede el saldo actual, el cuál es de: "+saldo+"$");
        }else{
            saldo-=retiro;    
            System.out.println("Retiro exitoso!! Su saldo ahora es de: "+saldo+"$");        
        }
        scanner.close();
    }
    public void transferir(CuentaBancaria cuenta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a transferir a la cuenta: ");
        Long transferencia= scanner.nextLong();
        if (transferencia>saldo) {
            System.out.println("El valor a transferir excede el saldo actual, el cuál es de: "+saldo+"$");
        }else{
            saldo-=transferencia;    
            cuenta.saldo+=transferencia;
            System.out.println("Transferencia exitosa!! Su saldo ahora es de: "+saldo+"$");        
        }
        scanner.close();
        mostrarMenu();
    }
    public void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        Boolean menu= true;
        while (menu) {
            System.out.println("Bienvenido estimado/a \n"+titular+"\n Qué desea hacer?: \n 1. Mostrar información de la cuenta. \n 2. Depositar. \n 3. Retirar. \n 4. Depositar. \n 5. Salir. \n");
            String res=scanner.nextLine();
            switch (res) {
                case "1":
                    mostrarCuenta();
                    break;
                case "2":
                    depositar();
                    break;
                case "3":
                    retirar();
                    break;
                case "4":
                    System.out.println("Ingrese la cuenta bancaria a la que desea transferir: ");

                default:
                    break;
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta1= new CuentaBancaria ("Sergio",121212,30000);
    }
}
