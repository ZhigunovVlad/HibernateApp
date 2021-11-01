package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "customer" )
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int age;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avto> avto;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        avto = new ArrayList<>();
    }

    public void addAvto(Avto auto) {
        auto.setCustomer(this);
        avto.add(auto);
    }

    public void removeAuto(Avto auto) {
        avto.remove(auto);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Avto> getAuto() {
        return avto;
    }

    public void setAuto(List<Avto> auto) {
        this.avto = auto;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}