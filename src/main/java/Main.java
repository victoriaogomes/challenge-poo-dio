import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Curso java");
        course1.setDescription("Descrição curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course1.setTitle("Curso js");
        course1.setDescription("Descrição curso js");
        course1.setWorkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria de java");
        mentorship.setDescription("Descrição mentoria java");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devVic = new Dev();
        devVic.setName("Victória");
        devVic.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Victória: " + devVic.getSubscribedContents());

        devVic.progress();
        devVic.progress();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Victória: " + devVic.getSubscribedContents());
        System.out.println("Conteúdos concluídos Victória: " + devVic.getFinishedContents());
        System.out.println("XP: " + devVic.calculateTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.subscribeBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos João: " + devJoao.getSubscribedContents());

        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");

        System.out.println("Conteúdos inscritos João: " + devJoao.getSubscribedContents());
        System.out.println("Conteúdos concluídos João: " + devJoao.getFinishedContents());
        System.out.println("XP: " + devJoao.calculateTotalXp());

//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentorship1);
    }
}
