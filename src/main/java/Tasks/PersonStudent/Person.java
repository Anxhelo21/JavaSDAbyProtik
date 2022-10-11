package Tasks.PersonStudent;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public  class Person {

    String name;
    String address;

    @Override
    public String toString() {
        return String.format("%s->%s",name,address);
    }
}
