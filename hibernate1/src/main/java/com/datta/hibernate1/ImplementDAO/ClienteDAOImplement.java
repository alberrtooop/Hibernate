package com.datta.hibernate1.ImplementDAO;
import com.datta.hibernate1.Interfaz.interfazDAO_Cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ClienteDAOImplement implements interfazDAO_Cliente {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(interfazDAO_Cliente newCliente) {
		/* Creamos la session */
		Session currentSession = entityManager.unwrap(Session.class);
		
		/* Importamos la opcion del metodo */
		currentSession.save(newCliente);
		
		/* Cerramos la session */
		currentSession.close();
	}

	@Override
	@Transactional
	public void update(interfazDAO_Cliente updCliente) {

		/* Creamos la session */
		Session currentSession = entityManager.unwrap(Session.class);
		
		/* Importamos la opcion del metodo */
		currentSession.update(updCliente);
		
		/* Cerramos la session */
		currentSession.close();
	}

	@Override
	@Transactional
	public void delete(interfazDAO_Cliente delCliente) {
		/* Creamos la session */
		Session currentSession = entityManager.unwrap(Session.class);
		
		/* Importamos la opcion del metodo */
		currentSession.delete(delCliente);
		
		/* Cerramos la session */
		currentSession.close();
	}

	@Override
	@Transactional
	public interfazDAO_Cliente searchById(final Long interfazDAO) {
		/* Creamos la session */
		Session currentSession = entityManager.unwrap(Session.class);
		
		/* Importamos la opcion del metodo */
		currentSession.get(interfazDAO.class());
		
		/* Cerramos la session */
		currentSession.close();
		
		return null;
	}

	@Override
	@Transactional
	public List<interfazDAO_Cliente> searchAll() {
		/* Creamos la session */
		Session currentSession = entityManager.unwrap(Session.class);
		
		/* Importamos la opcion del metodo */
		currentSession.save(newCliente);
		
		/* Cerramos la session */
		currentSession.close();

		return null;
	}
}
