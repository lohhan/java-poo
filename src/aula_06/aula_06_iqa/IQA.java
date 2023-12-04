// METODO CONSTRUTOR

package aula_06.aula_06_iqa;

public class IQA {
    
    private double indice;
    private String classificacao;
    private String efeitos;

    // CONSTRUTOR
    public IQA(double indice){
        this.indice = indice;
        defineClassificacao();
        defineEfeitos();
    }

    // GET
    public String getClassificacao(){
        return this.classificacao;
    }

    public double getIndice(){
        return this.indice;
    }
    
    public String getEfeitos(){
        return this.efeitos;
    }

    // DEMAIS MÉTODOS
    public void defineClassificacao() {
        if(this.indice>=0 && this.indice<=50){
            this.classificacao = "Boa";
        }
        else if(this.indice>50 && this.indice<=100){
            this.classificacao = "Regular";
        }
        else if(this.indice>100 && this.indice<200){
            this.classificacao = "Inadequada";
        }
        else if(this.indice>=200 && this.indice<300){
            this.classificacao = "Má";
        }
        else if(this.indice>300 && this.indice<400){
            this.classificacao = "Péssima";
        }
        else {
            this.classificacao = "Crítica";
        }
    }

    public void defineEfeitos() {
        if(this.indice>0 && this.indice<=100){
            this.efeitos = "Ausência de sintomas";
        }
        else if(this.indice>100 && this.indice<200){
            this.efeitos = "Leve agravamento dos sintomas de pessoas susceptíveis";
        }
        else if(this.indice>=200 && this.indice<300){
            this.efeitos = "Decréscimo da resistência física e significativo agravamento";
        }
        else if(this.indice>=300 && this.indice<400){
            this.efeitos = "Aparecimento prematuro de certas doenças";
        }
        else{
            this.efeitos = "Morte prematura de pessoas doentes e pessoas idosas";
        }
    }

    public double compararIndice(double indiceAnterior) {
        return this.indice - indiceAnterior;
    }   

}
