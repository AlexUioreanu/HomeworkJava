import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
public class Persoane implements Serializable {
    private String firstName;
    private String lastName;
    private String dateBirth;
    private int monthValue;

    public void setMonthValue() {
        String[] s = getDateBirth().split("-");
        setMonthValue(Integer.parseInt(s[1]));
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateBirth='" + dateBirth +
                '}';
    }
}
