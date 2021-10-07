package models;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCliente;
    private String cpf;
    private String email;
    private Date dataNascimento;
    private String telefone1;
    private String telefone2;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.nomeCliente = name;
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
        return nomeCliente;
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
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getId(), cliente.getId()) && Objects.equals(getName(), cliente.getName()) && Objects.equals(getCpf(), cliente.getCpf()) && Objects.equals(getEmail(), cliente.getEmail()) && Objects.equals(getDataNascimento(), cliente.getDataNascimento()) && Objects.equals(getTelefone1(), cliente.getTelefone1()) && Objects.equals(getTelefone2(), cliente.getTelefone2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCpf(), getEmail(), getDataNascimento(), getTelefone1(), getTelefone2());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + nomeCliente + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefone1='" + telefone1 + '\'' +
                ", telefone2='" + telefone2 + '\'' +
                '}';
    }
}
