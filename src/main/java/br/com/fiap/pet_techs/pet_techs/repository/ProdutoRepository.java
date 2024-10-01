package br.com.fiap.pet_techs.pet_techs.repository;

import br.com.fiap.pet_techs.pet_techs.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
