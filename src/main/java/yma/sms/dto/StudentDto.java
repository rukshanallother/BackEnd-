package yma.sms.dto;

public class StudentDto {
    private String firstName;
    private String lastName;
    private String course;
    private String gender;
    private String address;
    private String dob;
    private String code;

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getNic() { return course; }
    public void setNic(String nic) { this.course = nic; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }


}
