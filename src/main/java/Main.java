import com.example.desafiodiopoo.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void Main(String[] args){

        Curso curso1 = new Curso();
curso1.setTitulo( ("curso java"));
curso1.setDescricao("descrição curso java");
curso1.setCargahoraria(8);
System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo( ("curso js"));
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);
        System.out.println(curso2);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoria de java");
mentoria.setDescricao("curso de java");
mentoria.setData(LocalDate.now());

System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Gabriela" + devGabriela.getConteudosInscritos());
      devGabriela.progredir();
      System.out.println("Conteudos concluidos Gabriela" + devGabriela.getConteudosConcluidos());


      Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        devCarlos.progredir();
        System.out.println("Conteudos incritos Carlos" + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos concluidos Carlos" + devCarlos.getConteudosConcluidos());

    }
}
