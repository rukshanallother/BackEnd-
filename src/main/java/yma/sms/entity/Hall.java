package yma.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
