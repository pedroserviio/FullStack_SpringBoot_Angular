package com.pedroservio.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroservio.workshopmongo.domain.Categoria;
import com.pedroservio.workshopmongo.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public List<Categoria> findAll() {
		return repo.findAll();
	}
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElse(null);
	}

}
