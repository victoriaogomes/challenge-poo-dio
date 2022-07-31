import br.com.dio.challenge.domain.Course;
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

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Mentoria de java");
        mentorship1.setDescription("Descrição mentoria java");
        mentorship1.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
    }
}
