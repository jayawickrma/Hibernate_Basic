package lk.Ijse67.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    private int SId;
    private String name;
    private String address;
    @OneToMany (mappedBy = "student",fetch = FetchType.EAGER)
    private List<Laptop>laptops;

}
