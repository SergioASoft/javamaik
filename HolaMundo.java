import javax.swing.JOptionPane;

public class HolaMundo {
    public static void main(String[] args){
        String respuesta= preguntar("Cual es tu nombre");
        presentarse(respuesta);
    }

    public static void presentarse (String nombre) {
        JOptionPane.showMessageDialog(null, "Hola "+nombre+"!", nombre, 0);;
    }
    public static String preguntar (String mensaje){
        String respuesta=JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }
}