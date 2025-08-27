package miPrincipal;
public class InventarioLibros{
    Libro listaLibros[]; //creando un arreglo de libros
    int contador;
    //constructores
    public InventarioLibros(){
        listaLibros = new Libro[2];
        contador = 0;
    }
    //metodos
    //agrega libros a la lista
    public void agregar(Libro libro){
        //agregar a la lista
        if(contador<listaLibros.length){
            listaLibros[contador]= libro;
            contador++;
        }else{
            //la lista esta llena, por lo tanto hay que aumentarla
            Libro listaTemp[] = new Libro[listaLibros.length*2];
            //copia la lista original
            for(int i=0;i<listaLibros.length;i++){
                listaTemp[i]=listaLibros[i];
            }
            listaLibros = listaTemp; 
            listaLibros[contador]= libro;
            contador++;
        }

    }
    //busca en la lista a un libro por autor
    //si lo encuentra retorna el libro
    //sino retorna null
    public Libro[] buscar(String autor){
        Libro[] librosBuscados = new Libro[listaLibros.length];
        int contEncontrados = 0;
        for (int i=0;i<contador;i++){
            if(listaLibros[i].getAutor().equalsIgnoreCase(autor)){
                librosBuscados[contEncontrados++]=listaLibros[i];              
            }
        }
        return librosBuscados;
    }
    //mostrar por pantalla toda lista de libros
    public void mostrar(){
        for(int i=0;i<contador;i++){
            System.out.println(listaLibros[i]);
        }

    }


}