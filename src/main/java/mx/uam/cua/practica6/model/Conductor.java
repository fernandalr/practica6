package mx.uam.cua.practica6.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String licencia;

    //constructores

    public Conductor() {}

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getLicencia() {return licencia;}
    public void setLicencia(String licencia) {this.licencia = licencia;}
}
