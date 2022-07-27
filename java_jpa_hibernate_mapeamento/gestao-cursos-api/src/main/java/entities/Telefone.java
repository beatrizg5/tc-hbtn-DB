package entities;

import javax.persistence.*;

@Entity
@Table(name = "Telefone")
public class Telefone {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DDD")
    private String DDD;
    @Column(name = "Número")
    private String numero;
}
