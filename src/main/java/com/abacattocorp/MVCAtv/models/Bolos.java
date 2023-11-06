package com.abacattocorp.MVCAtv.models;

public class Bolos {

    private String nome, desc;
    private double preco;

    public Bolos(double preco, String nome, String desc)
    {
        this.preco = preco;
        this.nome = nome;
        this.desc = desc;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
