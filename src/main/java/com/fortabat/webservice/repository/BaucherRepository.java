package com.fortabat.webservice.repository;

import com.fortabat.webservice.model.Baucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaucherRepository extends JpaRepository<Baucher,Integer> {


	public Baucher getBySerie(Integer serie);

}
