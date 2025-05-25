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
public class Hall {
    // Specifies the primary key of the entity
    @Id
    // Auto-generates the primary key value using the database's identity column (auto-increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private int capacity;
    private int ac;
    private int projector;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getAc() { return ac; }

    public void setAc(int ac) { this.ac = ac;}

    public int getProjector() { return projector; }

    public void setProjector(int projector) { this.projector = projector; }
}
