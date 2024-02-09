package lk.Ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int SId;
    private String name;
    private String address;
    @OneToOne
    private Laptop laptop;

    public Student() {
    }

    public Student(int SId, String name, String address, Laptop laptop) {
        this.SId = SId;
        this.name = name;
        this.address = address;
        this.laptop = laptop;
    }

    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SId=" + SId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
