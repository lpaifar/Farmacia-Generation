package ong.generation.FarmaciaGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ong.generation.FarmaciaGeneration.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
