package entities;

import javax.persistence.*;

@Entity
@Table(name = "Material Curso")
public class MaterialCurso {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "URL")
    private String url;
}
