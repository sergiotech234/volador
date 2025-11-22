public class MainVolador {
    public static void main(String[] args) {
        Volar ave = new Ave();
        Volar avion = new Avion();
//Introduccion de clases con la interfaz volar
        ave.volar();
        ave.aterrizar();
        System.out.println("===============================");
        avion.volar();
        avion.aterrizar();

    }
}
