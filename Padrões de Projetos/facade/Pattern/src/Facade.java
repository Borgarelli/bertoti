import Entrada_saida.Monitor;
import Entrada_saida.Mouse;
import Entrada_saida.Teclado;
import Peças.Cpu;
import Peças.HD;
import Peças.Memoria;
import Peças.SO;

public class Facade {

    private Memoria memoria;
    private HD hd;
    private Cpu cpu;
    private Mouse mouse;
    private Teclado teclado;
    private Monitor monitor;
    private SO so;
    
    public Facade(){

        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new Cpu();
        this.mouse = new Mouse();
        this.teclado = new Teclado();
        this.monitor = new Monitor();
        this.so = new SO();
    }

    public void MontarPC(){
        System.out.println("Montando um novo pc");

        memoria.adicionarMemoria();
        hd.adicionarHD();
        cpu.adicionarCpu();
        mouse.adicionarMouse();
        teclado.adicionarTeclado();
        monitor.adicionarMonitor();
        so.instalarSO();

         System.out.println("Computador montado!");
    }
}
