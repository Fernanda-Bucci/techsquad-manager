package br.com.techsquad.model;

import br.com.techsquad.exception.ValorInvalidoException;

public abstract class Colaborador implements Premiavel {

    private String nome;
    private String cpf;
    private double valorHora;

    public Colaborador() {
    }

    public Colaborador(String nome, String cpf, double valorHora) {

        if (cpf == null || cpf.length() != 11) {
            throw new ValorInvalidoException("CPF inválido! O documento deve ter 11 dígitos numéricos! Valor recebido: " + cpf);
        }

        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora (double valorHora) {
        if (valorHora <= 0) {
            throw new ValorInvalidoException("Erro no cadastro: O valor da hora dee ser maior que zero. Valor digitado: " + valorHora);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public abstract double calcularSalarioMensal (int horasTrabalhadas);
}

