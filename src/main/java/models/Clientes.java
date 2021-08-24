package models;
import javax.persistence.*;
import java.util.*;

@Entity
public class Clientes {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String email;

    @Column()
    private Date dataNascimento;

    @Column()
    private String telefone1;

    @Column()
    private String telefone2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(getId(), clientes.getId()) && Objects.equals(getName(), clientes.getName()) && Objects.equals(getCpf(), clientes.getCpf()) && Objects.equals(getEmail(), clientes.getEmail()) && Objects.equals(getDataNascimento(), clientes.getDataNascimento()) && Objects.equals(getTelefone1(), clientes.getTelefone1()) && Objects.equals(getTelefone2(), clientes.getTelefone2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCpf(), getEmail(), getDataNascimento(), getTelefone1(), getTelefone2());
    }
}
