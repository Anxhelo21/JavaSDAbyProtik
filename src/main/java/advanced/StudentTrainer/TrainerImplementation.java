package advanced.StudentTrainer;

public class TrainerImplementation implements TrainerInterface{
    @Override
    public void changeCourse(Trainer tr, String course) {
        tr.setCourse(course);
        tr.printCourseAndExp();
    }

    @Override
    public void changeTrainerData(Trainer tr, String name, String surname) {
        tr.setName(name);
        tr.setSurname(surname);
        tr.printFullName();
    }
}
