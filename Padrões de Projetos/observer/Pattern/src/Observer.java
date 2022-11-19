public class Observer {

    public static void main(String[] args) {

        Individuo Individuo1 = new Individuo();
        Individuo Individuo2 = new Individuo();

        Clima Clima = new Clima();
        Clima.inscrever(Individuo1);
        Clima.inscrever(Individuo2);

        Clima.setclima("Clima ensolarado");

        Clima.desinscrever(Individuo2);

        Clima.setclima("Clima chuvoso");

    }

}