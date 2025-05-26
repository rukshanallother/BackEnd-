package yma.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String nic;
    private String gender;
    private String address;
    private String email;
    private String relationship;
    private String dob;
    private String mobile;
    private String code;

    public void setFirstName(String firstName) {
    }

    public void setLastName(String lastName) {
    }

    public void setNic(String nic) {
    }

    public void setGender(String gender) {
    }

    public void setAddress(String address) {
    }

    public void setEmail(String email) {
    }

    public void setPosition(String position) {
    }

    public void setDob(String dob) {
    }

    public void setMobile(String mobile) {
    }

    public void setCode(String code) {
    }


}
