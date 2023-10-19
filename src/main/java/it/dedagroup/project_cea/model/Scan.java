package it.dedagroup.project_cea.model;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//TODO Implementare la relazione con Condominium
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Scan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private double mcLiter = 0;
	@Column(nullable = false)
	private boolean isAvailable = true;
	@Column(nullable = false)
	private LocalDate scanDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Apartment apartment;
	@OneToMany(mappedBy = "scan")
	private List<Bill> bills;

}
