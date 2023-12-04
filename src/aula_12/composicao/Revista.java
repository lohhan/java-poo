package aula_12.composicao;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    // Atributos
    private int codigo;
    private String titulo;
    private int reciclagemProduzida;
    private List<Edicao> listaEdicoes;
    
    // Construtor
    public Revista(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.reciclagemProduzida = 0;
        this.listaEdicoes = new ArrayList<Edicao>();
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getReciclagemProduzida() {
        return reciclagemProduzida;
    }

    public List<Edicao> getListaEdicoes() {
        return listaEdicoes;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Demais Métodos
    public void adicionaEdicao(int numeroEdicao, int tiragem) {
        listaEdicoes.add(new Edicao(numeroEdicao, tiragem));
    }

    public void removeEdicao(int numeroEdicao) {
        for (Edicao edicao : listaEdicoes) {
            if (edicao.getNumero() == numeroEdicao) {
                listaEdicoes.remove(edicao);        
            } else {
                System.out.println("Edição não encontrada.");
            }
        }
    }
    
    public String reciclaEdicao(int numeroEdicao) {
        for (Edicao edicao : listaEdicoes) {
            if(edicao.getTiragem() == 0) {
                return "Não houve exemplares para reciclar";
            } else {
                this.reciclagemProduzida += edicao.obtemReciclagem();
                System.out.println("Reciclagem produzida: " + this.getReciclagemProduzida());
                edicao.reciclaExemplares();
            }
        }
        return "Reciclagem realizada";
    }

    
}
