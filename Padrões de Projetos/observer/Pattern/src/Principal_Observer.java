public class Principal_Observer {
    public static void main(String[] args) {
        CarroPolicia carroPolicia = new CarroPolicia();

        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
    }
}
