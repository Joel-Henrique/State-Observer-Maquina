package org.example;

import java.util.Observable;
public class Maquina extends Observable {
    private MaquinaEstado estado;

    public Maquina() {
        this.estado = MaquinaEstadoAguardandoMoeda.getInstance();
    }
    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(estado.getEstado());
    }

    public boolean selecionarProduto() {
        return estado.selecionarProduto(this);
    }
    public boolean dispensarProduto() {
        return estado.dispensarProduto(this);
    }
    public boolean entrarManutencao() {
        return estado.entrarManutencao(this);
    }
    public boolean produtoDisponivel() {
        return estado.produtoDisponivel(this);
    }
    public boolean aguardarMoeda() {
        return estado.aguardarMoeda(this);
    }
}