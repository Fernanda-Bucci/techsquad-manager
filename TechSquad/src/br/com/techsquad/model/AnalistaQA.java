package br.com.techsquad.model;

public class AnalistaQA extends Colaborador implements Premiavel {

    public AnalistaQA(String nome, String cpf, double valorHora) {
        super(nome, cpf, valorHora);
    }

    @Override
    public double calcularSalarioMensal(int horasTrabalhadas) {
        return (horasTrabalhadas * getValorHora()) * 1.05;
    }

    @Override
    public double calcularBonus() {
        return 300.00;
    }
}
