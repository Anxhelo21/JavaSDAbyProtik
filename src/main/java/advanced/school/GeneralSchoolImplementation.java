package advanced.school;

public class GeneralSchoolImplementation implements GeneralSchoolInterface{
    @Override
    public void printData(ServeteMaci s) {
        s.getData();
    }

    @Override
    public void printData(AliDemi s) {
        s.getData();

    }

    @Override
    public void changeServeteName(ServeteMaci s, String name) {
        s.setName(name);
        s.getData();
    }

    @Override
    public void changeAliDemiName(AliDemi s, String name) {
        s.setName(name);
        s.getData();

    }
}
