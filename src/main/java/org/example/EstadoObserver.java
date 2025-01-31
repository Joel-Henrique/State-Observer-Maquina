package org.example;

import java.util.Observable;
import java.util.Observer;

public class EstadoObserver implements Observer {
    private String nome;
    private String ultimaNotificacao;
    public EstadoObserver(String nome) {
        this.nome = nome;
    }
    public void observar(Maquina maquina) {
        maquina.addObserver(this);
    }
    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }
    @Override
    public void update(Observable maquina, Object arg) {
        this.ultimaNotificacao = (this.nome + " recebeu atualização: Novo estado -> " + arg);
    }
}
