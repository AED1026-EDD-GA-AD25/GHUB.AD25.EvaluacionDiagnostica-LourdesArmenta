package miPrincipal;
public class Libro{
    //Atributos
    private String titulo;
    private String autor;
    private int anio;
    //contructores
    public Libro(){
        this.titulo = "No Definido";
        this.autor = "No Definido";
        this.anio = 0;
    }
    public Libro(String titulo, String autor,int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    //getter y setter
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    @Override
    public String toString(){
        return "Libro: "+titulo+", "+autor+", "+anio;
    }


}