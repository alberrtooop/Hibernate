package com.datta.hibernate1.Persistence;
import java.sql.Date;
import javax.persistence.*;




@Entity
@Table(name = "T_Contrato")
public class Contrato {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long CodContrato;

@Column(name = "FechaVigencia")
private Date FechaVigencia;

@Column(name = "FechaCadicidad")
private Date FechaCadicidad;

@Column(name = "SalarioMensual")
private Float SalarioMensual ;

/* Relacion base de datos */
@JoinColumn(name = "codCliente")
@OneToOne(fetch = FetchType.LAZY)
private client client;



/* Getter y setter */
public Long getCodContrato() {
	return CodContrato;
}

public void setCodContrato(Long codContrato) {
	CodContrato = codContrato;
}

public Date getFechaVigencia() {
	return FechaVigencia;
}

public void setFechaVigencia(Date fechaVigencia) {
	FechaVigencia = fechaVigencia;
}

public Date getFechaCadicidad() {
	return FechaCadicidad;
}

public void setFechaCadicidad(Date fechaCadicidad) {
	FechaCadicidad = fechaCadicidad;
}

public Float getSalarioMensual() {
	return SalarioMensual;
}

public void setSalarioMensual(Float salarioMensual) {
	SalarioMensual = salarioMensual;
}

}