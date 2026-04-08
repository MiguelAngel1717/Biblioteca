public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        System.out.println("Libro 1: "+l1.mostrarInformacion());


        if(l1.prestar()<0){
            System.out.println("No hay ejemplares");
        }else{
            System.out.println("Ejemplar prestado");
        }
        System.out.println("Prestando libro...");
        if(l1.prestar()>0){
            System.out.println("No hay ejemplares");

        }else{
            System.out.println("Ejemplar prestado");
        }
        System.out.println("Libro 1: "+l1.mostrarInformacion());
        System.out.println("Libro 2: "+l2.mostrarInformacion());

    }
}
