package models;

import javax.persistence.*;

@Entity
public class Imoveis {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String endereco;

    @Column
    private String cpf;

    @Column
    private Integer dormitórios;

    @Column
    private Integer banheiros;

    @Column
    private Integer suites;

    @Column
    private Integer metragem;
}
