package emplado;
/**
 *
 * @author lisbeth ardila
 */
import java.util.Scanner;

public class Emplado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int cedula;
        int sueldo;
        int telefono;
        float interes;
        int porcentaje;
        int total;
        //capturar datos
     System.out.print("introduzca su nombre");
     nombre = sc.nextLine();
     System.out.print("introduzca su apellido");
     apellido = sc.nextLine();
     System.out.print("introduzca su cedula");
     cedula = sc.nextInt();
     System.out.print("introduzca su telefono");
     telefono = sc.nextInt();
     System.out.print("introduzca su sueldo");
     sueldo = sc.nextInt();
     System.out.print("introduzca su interes");
     interes = sc.nextFloat();
     porcentaje =(int) ((interes/100)*sueldo);
     total =(int) (porcentaje + sueldo);
     //imprimir datos
     System.out.println("empleado:"+nombre);
     System.out.println(apellido);
     System.out.println("identificado con la cedula de ciudadania:"+cedula);
     System.out.println("y telefono:"+telefono);
     System.out.println("su sueldo es de :"+total);
     //capturar datos por joption pane
     
    }
    
}
