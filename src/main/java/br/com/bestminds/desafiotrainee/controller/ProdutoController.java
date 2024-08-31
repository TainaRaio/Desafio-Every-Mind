package br.com.bestminds.desafiotrainee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bestminds.desafiotrainee.entity.Produto;
import br.com.bestminds.desafiotrainee.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService produtoService;
    
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping 
    List<Produto> create(@RequestBody Produto produto){
        return produtoService.create(produto);
    }

    @GetMapping
    List<Produto> list() {
        return produtoService.list();
    }

    @PutMapping
    List<Produto> update(@RequestBody Produto produto) {
        return produtoService.update(produto);
    }

    @DeleteMapping("{id}")
    List<Produto> delete(@PathVariable("id") Long id) {
        return produtoService.delete(id);
    }
    
}
