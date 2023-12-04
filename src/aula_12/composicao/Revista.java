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
        Edicao edicaoToRemove = null;
        for (Edicao edicao : listaEdicoes) {
            if (edicao.getNumero() == numeroEdicao) {
                edicaoToRemove = edicao;
                break;     
            }
        }
        if (edicaoToRemove != null) {
            listaEdicoes.remove(edicaoToRemove);
        } else {
            System.out.println("Edição não existente");
        }
    }
    
    public String reciclaEdicao(int numeroEdicao) {
        for (Edicao edicao : listaEdicoes) {
            if (edicao.getNumero() == numeroEdicao) {
                if (edicao.obtemReciclagem() == 0) {
                    return "Não houve exemplares para reciclar";
                } 
                if (edicao.isReciclou()) {
                    return "Edição já reciclada";
                } 
                this.reciclagemProduzida += edicao.obtemReciclagem();
                edicao.reciclaExemplares();
                return "Reciclagem realizada";
            }
        }
        return "Edição não encontrada";
    }

    
}
