import Entrada_saida.Monitor;
import Entrada_saida.Mouse;
import Entrada_saida.Teclado;
import Peças.Cpu;
import Peças.HD;
import Peças.Memoria;
import Peças.SO;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Montando novo computador...");

        Memoria memoria = new Memoria();
        memoria.adicionarMemoria();

        HD hd = new HD();
        hd.adicionarHD();

        Cpu cpu = new Cpu();
        cpu.adicionarCpu();

        Mouse mouse = new Mouse();
        mouse.adicionarMouse();

        Teclado teclado = new Teclado();
        teclado.adicionarTeclado();

        Monitor monitor = new Monitor();
        monitor.adicionarMonitor();

        SO so = new SO();
        so.instalarSO();

        System.out.println("Computador montado!");
}
}
