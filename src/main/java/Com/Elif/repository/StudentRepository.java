package Com.Elif.repository;

import Com.Elif.entity.Student;

public class StudentRepository extends RepositoryManager<Student,Long> {
    public StudentRepository() {
        super(new Student());}
}
