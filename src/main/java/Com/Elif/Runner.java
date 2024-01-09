package Com.Elif;


import Com.Elif.entity.Contact;
import Com.Elif.entity.Lesson;
import Com.Elif.entity.Student;
import Com.Elif.entity.Teacher;
import Com.Elif.repository.LessonRepository;
import Com.Elif.repository.StudentRepository;
import Com.Elif.repository.TeacherRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
/**
 * Adres adres1 = Adres.builder()
 *                 .il("Ankara")
 *                 .ilce("Yenimahalle")
 *                 .adres("Buralarda bir yerde")
 *                 .build();
 *         Kursiyer kursiyer = Kursiyer.builder()
 *                 .ad("Muhammet")
 *                 .soyad("Hoca")
 *                 .adres(adres1)
 *                 .telefon("05345 365 454")
 *                 .build();
 *         adres1.setKursiyer(kursiyer);
 *         new KursiyerRepository().save(kursiyer);
 */

        //MANYTOMANY
        Teacher teacher = new Teacher();
        teacher.setName("Ayşe");
        teacher.setSurname("gfdgfg");

        Teacher teacher2 = new Teacher();
        teacher2.setName("Fatma");
        teacher2.setSurname("gfdgfg");

        Lesson lesson1 = new Lesson();
        lesson1.setName("Matematik");

        Lesson lesson2 = new Lesson();
        lesson2.setName("Fizik");

        teacher.setLesson(lesson1);
        teacher2.setLesson(lesson2);

        Student student1 = new Student();
        student1.setName("Ayşe");
        student1.setSurname("Gobekli");

        Contact contact = new Contact();
        contact.setPhone("045345345");
        contact.setCity("Ankara");

        student1.setLessonList(List.of(lesson1,lesson2));
        student1.setContact(contact);

        contact.setStudent(student1);

        lesson1.setStudentList(List.of(student1));
        lesson2.setStudentList(List.of(student1));
        lesson1.setTeacher(teacher);
        lesson2.setTeacher(teacher2);
        new TeacherRepository().save(teacher);
        new TeacherRepository().save(teacher2);
    }


}
