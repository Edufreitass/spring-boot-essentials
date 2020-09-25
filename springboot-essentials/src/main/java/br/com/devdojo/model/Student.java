package br.com.devdojo.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student extends AbstractEntity {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "O campo nome do estudante é obrigatório")
    private String name;

    @Email(message = "Digite um email válido")
    @NotEmpty
    private String email;

    public Student() {
    }

    public Student(String name,String email) {
        this.name = name;
        this.email = email;
    }

    public Student(Long id, String name,String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
