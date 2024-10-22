package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Lucas", 28, 1.75);
        ordenacaoPessoa.adicionarPessoa("Diego", 33, 1.70);
        ordenacaoPessoa.adicionarPessoa("Luiz", 6, 1.20);
        ordenacaoPessoa.adicionarPessoa("Maria", 60, 1.50);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println();
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        System.out.println();
    }
}
