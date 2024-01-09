package Com.Elif.repository;

import Com.Elif.entity.Lesson;

public class LessonRepository extends RepositoryManager<Lesson,Long> {
    public LessonRepository() {
        super(new Lesson());
    }
}
