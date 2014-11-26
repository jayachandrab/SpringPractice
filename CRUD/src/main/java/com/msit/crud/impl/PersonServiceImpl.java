package com.msit.crud.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.msit.crud.dao.PersonDAO;
import com.msit.crud.model.Person;
import com.msit.crud.service.PersonService;

public class PersonServiceImpl implements PersonService
{
	 private PersonDAO personDAO;
	 
	    public void setPersonDAO(PersonDAO personDAO) {
	        this.personDAO = personDAO;
	    }
	@Override
	@Transactional
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		this.personDAO.addPerson(p);
		
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		this.personDAO.updatePerson(p);
		
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return this.personDAO.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return this.personDAO.getPersonById(id);
		
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		this.personDAO.removePerson(id);
		
		
	}

}
