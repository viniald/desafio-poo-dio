import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =  new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vinicius" + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        System.out.println("-->");
        System.out.println("Conteudos Inscritos Vinicius" + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vinicius" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularXp());
        devVinicius.progredir();
        System.out.println("-->");
        System.out.println("Conteudos Inscritos Vinicius" + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vinicius" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularXp());

        System.out.println("-----------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-->");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXp());


    }
}
