package com.datta.hibernate1.Persistence;

import javax.persistence.*;


@Entity
@Table(name = "T_client")
public class client {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long codCliente;

@Column(name = "NombreCliente", columnDefinition = "VARCHAR(60)")
private String NombreCliente;

@Column(name = "Primer_apellido", columnDefinition = "CHAR(12)")
private String Primer_apellido;

@Column(name = "Segundo_apellido", columnDefinition = "CHAR(12)")
private String Segundo_apellido;
  
@Column(name = "DNI", nullable = false, length = 9, unique = true)
private String DNI;

@OneToOne(mappedBy = "Contrato", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
private Contrato Contrato;


/* Getter y Setter */
public Long getCodCliente() {
	return codCliente;
}

public void setCodCliente(Long codCliente) {
	this.codCliente = codCliente;
}

public String getNombreCliente() {
	return NombreCliente;
}

public void setNombreCliente(String nombreCliente) {
	NombreCliente = nombreCliente;
}

public String getPrimer_apellido() {
	return Primer_apellido;
}

public void setPrimer_apellido(String primer_apellido) {
	Primer_apellido = primer_apellido;
}

public String getSegundo_apellido() {
	return Segundo_apellido;
}

public void setSegundo_apellido(String segundo_apellido) {
	Segundo_apellido = segundo_apellido;
}

public String getDNI() {
	return DNI;
}

public void setDNI(String dNI) {
	DNI = dNI;
}

}