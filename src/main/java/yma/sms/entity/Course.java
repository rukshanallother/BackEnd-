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
public class Course {
    // Specifies the primary key of the entity
    @Id
    // Auto-generates the primary key value using the database's identity column (auto-increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Field to store the name of the course
    private String name;

    // Getter method for 'id'
    public int getId() {
        return id;
    }

    // Setter method for 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }
}
