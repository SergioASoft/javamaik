import java.util.Scanner;
public class sistemaCompras {

    public static void main(String[] args) {
        Boolean menu=true;
        String res=despliegueMenu(menu);
        switch (res) {
            case "1":
                
                break;
        
            default:
                break;
        }


        
    }
    public static String despliegueMenu(Boolean menu){
        String res = preguntarString("Seleccione una opción: \n-1. Añadir un producto al carrito. \n-2. eliminar producto del carrito. \n-3. Ver carrito. \n-4. Cerrar menú. \n");
        return res;

    }
    public static Long preguntarLong (String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        Long respuesta = scanner.nextLong();        
        scanner.close();
        return respuesta;
    }
    public static String preguntarString (String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        String respuesta = scanner.nextLine();        
        scanner.close();
        return respuesta;
    }
    public class productos {
        String nombre;
        Long precio;
        Long stock;
        Long cod;

        public productos(String nombre, Long precio, Long stock, Long cod) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
            this.cod= cod;
        }
        public static void agregar(String nombre){
            
        }
    }
}
