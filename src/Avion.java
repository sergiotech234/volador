//Creamos una clase Ave que esta unida ala interfaz de volar
public class Avion implements Volar {
    //Creamos el metodo aterrizar 
    @Override
    public void aterrizar() {
        System.out.println("Avion aterrizando");
    }
    //Creamos el metodo voalr 
    @Override
    public void volar() {
        System.out.println("Avion volar");
    }
}
