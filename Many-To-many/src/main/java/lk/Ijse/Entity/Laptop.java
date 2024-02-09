package lk.Ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
    @ManyToMany(mappedBy = "laptops")
    private List<Student>students;
}
