package entities;

import javax.persistence.*;

@Entity
@Table(name = "Endereço")
public class Endereco {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Logradouro")
    private String logradouro;
    @Column(name = "Sigla")
    private String sigla;
}
