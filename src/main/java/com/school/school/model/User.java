package com.school.school.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * 
 * 
 * create a parent class and inherit it's attributes from childs
 * 
 * */

@MappedSuperclass
//@Entity /* pour déclarer  classe comme une entité */
//@Table(name = "User")/* pour nomer  classe comme  */
public abstract class User implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "username",unique = true)
	private String username;
	
	//TODO ajouter les autres attributs 
}
