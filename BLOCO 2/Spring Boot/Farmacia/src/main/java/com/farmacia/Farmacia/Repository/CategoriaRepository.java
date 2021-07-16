package com.farmacia.Farmacia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.Farmacia.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	

}
