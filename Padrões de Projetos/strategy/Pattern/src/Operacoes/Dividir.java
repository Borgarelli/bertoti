package Operacoes;

import logica.StrategyMath;

public class Dividir implements StrategyMath{

    @Override
    public int operacao(int numero1, int numero2) {
        return numero1 / numero2;
    }
    
}
