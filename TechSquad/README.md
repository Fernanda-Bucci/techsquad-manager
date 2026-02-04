#  TechSquad Manager

Um sistema robusto de gestão de talentos desenvolvido em **Java**, focado na aplicação prática de **Engenharia de Software**, **POO** e **Garantia de Qualidade (QA)**.

##  Objetivo do Projeto
Simular o ecossistema de gestão de colaboradores de uma empresa de tecnologia, permitindo a contratação de diferentes especialistas (Devs e QAs), cálculo automatizado de folha de pagamento com regras de negócio específicas e busca performática de dados.

## 🛠 Pilares Técnicos Implementados

- **Abstração e Herança:** Classe base `Colaborador` servindo de molde para especialidades.
- **Polimorfismo:** Cálculos de salário e bônus que variam conforme o cargo (ex: QA possui adicional de 5%).
- **Encapsulamento:** Proteção de dados sensíveis e validações rigorosas em Setters e Construtores.
- **Tratamento de Exceções:** Implementação de `ValorInvalidoException` para evitar CPFs incorretos e valores negativos.
- **Estruturas de Dados:** Uso de `HashMap` para garantir buscas instantâneas por CPF (O(1)).

##  Organização do Código (Packages)

- `br.com.techsquad.model`: Definição das entidades e interfaces.
- `br.com.techsquad.service`: Lógica de gerenciamento e armazenamento.
- `br.com.techsquad.exception`: Controle de erros personalizados.
- `br.com.techsquad.main`: Ponto de entrada com roteiro de testes (Showcase).

##  Como Executar
1. Certifique-se de ter o Java 17 ou superior instalado.
2. Clone o repositório: `git clone https://github.com/SEU_USUARIO/techsquad-manager.git`
3. Execute a classe `Main.java` e observe os resultados das validações no console.

---
**Desenvolvido por Fernanda Bucci Bortoloti ** *Estudante de Engenharia de Software | Analista de QA em transição para Java.*