package org.example;

public abstract class MaquinaEstado {
    public abstract String getEstado();

    public boolean selecionarProduto(Maquina maquina) { return false; }
    public boolean dispensarProduto(Maquina maquina) { return false; }
    public boolean entrarManutencao(Maquina maquina) { return false; }
    public boolean produtoDisponivel(Maquina maquina) { return false; }
    public boolean aguardarMoeda(Maquina maquina) { return false; }
}
