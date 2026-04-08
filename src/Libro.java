public class Libro {

    private String titulo;
    private String autor;
    private String categoria;
    private int anio;
    private int cantidadEjemplares;

    public Libro(){
        titulo ="Java para ingeniros";
        autor="Miguel Torres";
        categoria="Programacion";
        anio=2014;
        cantidadEjemplares=5;

    }

    public String mostrarInformacion(){
        String aux="";
        aux="Titulo: "+titulo+"\n";
        aux+="Autor: "+autor+"\n";
        aux+="Categoria: "+categoria+"\n";
        aux+="Año: "+anio+"\n";
        aux+="Cantidad: "+cantidadEjemplares+" ejemplares(es) \n";
        return aux;

    }

    public int prestar(){
        if(cantidadEjemplares>0){
            cantidadEjemplares--;
            return cantidadEjemplares;
        }
        return -1;  // Significa que no no hay ejemlares

    }
}
