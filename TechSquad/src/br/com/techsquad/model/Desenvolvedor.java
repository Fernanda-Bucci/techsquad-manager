package br.com.techsquad.model;

public class Desenvolvedor extends Colaborador implements Premiavel{

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double valorHora, String linguagemPrincipal) {
        super(nome, cpf, valorHora);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double calcularSalarioMensal (int horasTrabalhadas) {
        return horasTrabalhadas * getValorHora();
    }

    @Override
    public double calcularBonus() {
        return 500.00;
    }
}
