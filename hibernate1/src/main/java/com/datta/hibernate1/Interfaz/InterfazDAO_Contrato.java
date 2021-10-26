package com.datta.hibernate1.Interfaz;
import java.util.List;

public interface InterfazDAO_Contrato {
	
	public void insert(interfazDAO_Cliente newContrato);
	
	public void update(interfazDAO_Cliente updContrato);
	
	public void delete(interfazDAO_Cliente delContrato);
	
	public interfazDAO_Cliente searchById(final Long interfazDAO );
	
	public List<interfazDAO_Cliente> searchAll();

}
