public class MainVolador {
    public static void main(String[] args) {
        Volar ave = new Ave();
        Volar avion = new Avion();

        ave.volar();
        ave.aterrizar();
        System.out.println("===============================");
        avion.volar();
        avion.aterrizar();

    }
}