package br.com.bestminds.desafiotrainee.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.bestminds.desafiotrainee.entity.Produto;
import br.com.bestminds.desafiotrainee.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository; 
    
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> create(Produto produto) {
        produtoRepository.save(produto);
        return list();
    }

    public List<Produto> list() {
      Sort sort = Sort.by("preco").descending().and(
        Sort.by("nome")).ascending();
      return produtoRepository.findAll(sort);
    }

    public List<Produto> update(Produto produto) {
        produtoRepository.save(produto);
        return list();
    }

    public List<Produto> delete(Long id) {
        produtoRepository.deleteById(id);
        return list();
    }
}
