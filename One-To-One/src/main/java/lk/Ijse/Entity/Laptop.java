package lk.Ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
    @Id
    private int LId;
    private String Model;

    public Laptop() {
    }

    public Laptop(int LId, String model) {
        this.LId = LId;
        Model = model;
    }

    public int getLId() {
        return LId;
    }

    public void setLId(int LId) {
        this.LId = LId;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LId=" + LId +
                ", Model='" + Model + '\'' +
                '}';
    }
}
