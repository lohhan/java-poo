package cursoemvideo_ex;

public class ProjetoYT {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Aluno a[] = new Aluno[2];

        // VIDEOS
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        // ALUNOS
        a[0] = new Aluno("Vagner Love", 40, 'M', "vagner.love");
        a[1] = new Aluno("Diego Souza", 38, 'M', "diego.souza");

        // VISUALIZAÇÃO
        Visualizacao visu[] = new Visualizacao[5];

        visu[0] = new Visualizacao(a[0], v[1]);
        System.out.println(visu[0].toString());

        visu[1] = new Visualizacao(a[1], v[1]);
        System.out.println(visu[1].toString());

        visu[2] = new Visualizacao(a[1], v[0]);
        System.out.println(visu[2].toString());

        visu[3] = new Visualizacao(a[0], v[2]);
        System.out.println(visu[3].toString());
        
        visu[4] = new Visualizacao(a[1], v[2]);
        System.out.println(visu[4].toString());


        
        /* 
        System.out.println("VIDEOS ---------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println();

        System.out.println("ALUNOS ---------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        */
    }
}