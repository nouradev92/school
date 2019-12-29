package com.school.school.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity /* pour déclarer  classe comme une entité */
@Table(name = "Certificat")/* pour nomer  classe comme  */
public class Certificat {
	
	//TODO to be changed 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne
    private Etudiant etudiant;
	

	//TODO add other attributes 
}
