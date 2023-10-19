package it.dedagroup.project_cea.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Technician extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
    private static int workload;
	@Column(nullable = false)
	private Role role = Role.TECHNICIAN;
	private boolean isAvailable = true;
	
	@OneToMany(mappedBy = "technician")
	private List<Intervention> interventions;
}
