package com.school.school.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity /* pour déclarer  classe comme une entité */
@Table(name = "Etudiant")/* pour nomer  classe comme  */
public class Etudiant extends User implements Serializable {
	
	@Column
	private String carteEtudiant; 

}
