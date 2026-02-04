package br.com.techsquad.service;

import br.com.techsquad.model.Colaborador;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SquadService {

    //Busca por CPF [0(1) de complexidade]
    private Map<String, Colaborador> mapaColaboradores = new HashMap<>();

    private PriorityQueue<String> filaDeBugs = new PriorityQueue<>();

    public void contratar(Colaborador c) {

        mapaColaboradores.put(c.getCpf(), c);

    }

    public Colaborador buscarPorCpf(String cpf) {
        return mapaColaboradores.get(cpf);
    }

    public void reportarBug(String descricao, String prioridade) {
        filaDeBugs.add(prioridade + ":" + descricao);
    }

    public void listarTudo() {
        if (mapaColaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }
        System.out.println("\n=== LISTA DE COLABORADORES ===");
        for (Colaborador c : mapaColaboradores.values()) {
            System.out.println("Nome: " + c.getNome() + " | CPF: " + c.getCpf());
        }

    }
}
