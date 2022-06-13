package Atividade1Aluno;

import java.util.ArrayList;

public class Conta {
    private ArrayList<String>pratos;
    private double valor;
    private int quantidade;

    public Conta(){
      pratos = new ArrayList<>();
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Conta(String pratos) {
        this.pratos = new ArrayList<>();
        this.valor = valor;
    }
    
    public void atualizarValor(double valor){
          this.valor += valor;
    }
    public void adicionarPedido(String pratos, double valor, int quantidade) {
        this.pratos.add(pratos);
        atualizarValor.(valor*quantidade);
    }


}
