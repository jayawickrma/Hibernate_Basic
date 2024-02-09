package lk.Ijse67.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
    @Id
    private int LId;
    private String model;
    @ManyToOne
    private Student student;
}
