import Operacoes.Dividir;
import Operacoes.Multiplicar;
import Operacoes.Somar;
import Operacoes.Subtrair;
import logica.ContextMath;

public class Principal_Strategy {
    public static void main(String[] args){
        ContextMath  math = new ContextMath(new Somar());
        System.out.print("Resultado da soma é: ");
        System.out.println(math.calcular(5, 3));

        math = new ContextMath(new Subtrair());
        System.out.print("Resultado da subtração: ");
        System.out.println(math.calcular(5, 3));

        math = new ContextMath(new Multiplicar());
        System.out.print("Resultado da multiplicação: ");
        System.out.println(math.calcular(5, 3));

        math = new ContextMath(new Dividir());
        System.out.print("Resultado da divisão: ");
        System.out.println(math.calcular(5, 3));
    }
}
