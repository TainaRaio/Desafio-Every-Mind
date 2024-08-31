package br.com.bestminds.desafiotrainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bestminds.desafiotrainee.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
