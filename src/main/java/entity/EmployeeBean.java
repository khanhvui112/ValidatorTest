package entity;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author san vui
 * @create 25/10/2021 - 6:38 PM
 * @sanvankhanh@gmail.com
 */
@Entity
@Table(name = "EmployeeBean")
public class EmployeeBean {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Size(max = 50, min = 6, message = "please check length > 6 and < 50.")
    @NotNull(message = "name is null.")
    private String name;

    @Column(name = "age")
    @NotNull(message = "Age cannot null.")
    @Range(min = 18, max = 80, message = "Please inout age < 80 and > 18.")
    private int age;

    @Column(name = "email")
    @NotNull(message = "Email cannot null.")
    @Pattern(regexp = ".+@.+\\..+", message = "{employeeBean.valid.email}")
    @Size(min = 6, max = 100, message = "{employeeBean.name.email}")
    private String email;

    public EmployeeBean() {
    }

    public EmployeeBean(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public EmployeeBean(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
