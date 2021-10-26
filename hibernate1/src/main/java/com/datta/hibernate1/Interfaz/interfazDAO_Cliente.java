package com.datta.hibernate1.Interfaz;
import java.util.List;


public interface interfazDAO_Cliente {
	
	public void insert(interfazDAO_Cliente newCliente);
	
	public void update(interfazDAO_Cliente updCliente);
	
	public void delete(interfazDAO_Cliente delCliente);
	
	public interfazDAO_Cliente searchById(final Long interfazDAO );
	
	public List<interfazDAO_Cliente> searchAll();
}
