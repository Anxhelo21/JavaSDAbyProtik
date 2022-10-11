package advanced.StudentSchool;

public class AltStudentImplement implements AltStudentInterface{
    @Override
    public void changeSchoolSubject(School sch, String location) {
        sch.setLocation(location);
        sch.getLocationAndClassNumber();
    }

    @Override
    public void changeStudentData(Student st, String name, String surname) {
        st.setName(name);
        st.setSurname(surname);
        st.getStudentData();

    }
}
