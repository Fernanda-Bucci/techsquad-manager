package br.com.techsquad.main;

import br.com.techsquad.exception.ValorInvalidoException;
import br.com.techsquad.model.AnalistaQA;
import br.com.techsquad.model.Colaborador;
import br.com.techsquad.model.Desenvolvedor;
import br.com.techsquad.service.SquadService;

public class Main {
    public static void main(String[] args) {
        SquadService service = new SquadService();

        System.out.println("---- Teste 1: Cadastro de Colaboradores ----");
        try {
            Desenvolvedor dev = new Desenvolvedor("Bruna Fernandes", "12345678910", 99.0, "Java");
            AnalistaQA qa = new AnalistaQA("Felipe Almeida", "33333333333", 85.0);

            service.contratar(dev);
            service.contratar(qa);

            System.out.println("Sucesso!");

            service.listarTudo();

        } catch (ValorInvalidoException e) {
            System.err.println("Erro de Validação: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }

        System.out.println("\n--- Teste 2: Validação de Erro (CPF Curto) ---");
        try {
            new AnalistaQA("Erro", "123", 50.0);
        } catch (ValorInvalidoException e) {
            System.out.println("O sistema barrou corretamente: " + e.getMessage());
        }

        System.out.println("\n--- Teste 3: Busca e Polimorfismo ---");
        Colaborador busca = service.buscarPorCpf("33333333333");

        if (busca != null) {
            System.out.println("Colaborador encontrado: " + busca.getNome());
            System.out.println("Salário para 160h: R$ " + busca.calcularSalarioMensal(160));
        } else {
            System.out.println("Colaborador não encontrado.");
        }

    }
}