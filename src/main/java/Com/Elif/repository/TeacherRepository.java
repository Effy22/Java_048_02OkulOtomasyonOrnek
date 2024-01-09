package Com.Elif.repository;

import Com.Elif.entity.Teacher;

public class TeacherRepository extends RepositoryManager<Teacher,Long> {
    public TeacherRepository() {
        super(new Teacher());
    }
}
