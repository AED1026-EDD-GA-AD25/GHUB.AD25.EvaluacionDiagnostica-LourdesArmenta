package miPrincipal;
public class DemostrarArreglos{
    public static void main(String[] args) {
        System.out.println("Uso de Arreglos");
        int numeros1[];
        numeros1 = new int[3];

        short []numeros2;
        numeros2 = new short[5];

        double[] numeros3 = new double[10];
        long numeros4[] = new long[3];

       // Libro arregloLibros[] =  new Libro[5];
       Libro arregloLibros[] ;
       arregloLibros = new Libro[5];

       numeros1[2]=10;
       System.out.println("Arreglo de Enteros:");
       for(int i=0;i<3;i++){
        System.out.println(numeros1[i]);
       }
       System.out.println("Arreglo de Short:");
       for(int i=0;i<numeros2.length;i++){
        System.out.println(numeros2[i]);
       }

       System.out.println("Arreglo de Libros:");
       arregloLibros[0]= new Libro("El invencible verano","Ana Cristina",2011);
       arregloLibros[1] = new Libro();
       arregloLibros[1].setAutor("Gabriel Garcia Marquez");
       arregloLibros[1].setTitulo("Cien años de soledad");
       arregloLibros[1].setAnio(1986);
       arregloLibros[2] = new Libro();
       arregloLibros[3] = new Libro();
       arregloLibros[4] = new Libro();

       for(int i=0;i<arregloLibros.length;i++){
        System.out.println(arregloLibros[i]);
        System.out.println(arregloLibros[i].getTitulo());

       }




        
    }
    
}