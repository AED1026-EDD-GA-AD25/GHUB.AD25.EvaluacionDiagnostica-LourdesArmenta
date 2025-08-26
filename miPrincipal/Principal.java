package miPrincipal;
import java.util.Scanner;


public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc=0;
        String autor,titulo;
        int anio;
        InventarioLibros inventarioLibros = new InventarioLibros();
        do{
            menu();
            opc = sc.nextInt();
            sc.nextLine();//consume el enter
            switch(opc){
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                case 1:
                    System.out.print("Proporciona nombre de autor:");
                    autor = sc.nextLine();
                    System.out.print("Proporciona titulo:");
                    titulo = sc.nextLine();
                    System.out.print("Proporciona año de publicacion:");
                    anio= sc.nextInt();
                    Libro libro = new Libro(titulo,autor,anio);
                    inventarioLibros.agregar(libro);

                    break;
                case 2:
                    System.out.print("Proporciona autor del libro:");
                    autor = sc.nextLine();
                    Libro libroBuscado;
                    libroBuscado = inventarioLibros.buscar(autor);
                    if (libroBuscado != null)
                        System.out.println("Libro Encontrado: "+libroBuscado);
                    else
                        System.out.println("Libro No encontrado!!");
                    break;

                case 3:
                    inventarioLibros.mostrar();
                    break;
                default:

            }
            
        }while (opc != 0);
       
    }
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar por autor");
        System.out.println("3. Mostrar todos");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccione opción:");
    }
}