package lk.Ijse.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Laptop {
    @Id
    private int LId;
    private String model;
    @ManyToOne
    private Student student;

}
