//Creamos una clase Ave que esta unida ala interfaz de volar
public class Ave implements Volar {
//Creamos el metodo aterrizar 
    @Override
    public void aterrizar() {
        System.out.println("Ave aterrizando");
    }
//Creamos el metodo volar
    @Override
    public void volar() {
        System.out.println("Ave volar");
    }

}
