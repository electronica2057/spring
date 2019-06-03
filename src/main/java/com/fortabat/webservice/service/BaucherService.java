package com.fortabat.webservice.service;

import com.fortabat.webservice.model.Baucher;
import com.fortabat.webservice.repository.BaucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BaucherService {
	@Autowired
	private BaucherRepository baucherRepository;

	public Baucher agregarBaucher(Baucher baucher) {

		baucherRepository.save(baucher);

		return baucher;


	}


	public Baucher getById(Integer id) {
		return baucherRepository.getOne(id);
	}


	public Baucher getBySerie(int serie) {

		return baucherRepository.getBySerie(serie);

	}
}
