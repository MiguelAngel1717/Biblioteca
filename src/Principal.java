public class Principal {
    public static void main(String[] args) {

        Libro l1 = new Libro("Pinocho","Carlo Collodi","Cuento",1881,3);
        Libro l2 = new Libro();

        System.out.println("Lbro 1");
        System.out.println(l1.mostrarInformacion());

        System.out.println("libro 2");
        System.out.println(l2.mostrarInformacion());


        System.out.println("Prestando libro...");
        if(l1.prestar() == -1){
            System.out.println("No hay ejemplares disponibles");
        } else {
            System.out.println("Ejemplar prestado");
        }

        System.out.println(l1.mostrarInformacion());


        System.out.println("Devolviendo libro...");
        l1.devolver();
        System.out.println("Libro devuelto");

        System.out.println(l1.mostrarInformacion());


        l1.setTitulo("El Principito");
        l1.setAutor("carlangas");
        l1.setCategoria("Novela");
        l1.setAnio(1943);

        System.out.println("libro 1");
        System.out.println(l1.mostrarInformacion());
    }
}