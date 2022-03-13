import com.example.desafiodiopoo.dominio.Curso;
import com.example.desafiodiopoo.dominio.Mentoria;

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


    }
}
