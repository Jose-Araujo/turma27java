package com.generation.lojaGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaGames.model.Produto;
import com.generation.lojaGames.repository.ProdutoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	//findAllProduto = um endPoint com a capacidade de trazer todos os Produtos .
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//findByIDProduto = um endPoint com a função de trazer uma único Produto por id.
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	//findByDescricaoTitulo = um endPoint com a função de trazer um único Produto por Titulo.
	@GetMapping("preco/{preco}")
	public ResponseEntity<List<Produto>> getByPreco(@PathVariable double preco){
		return ResponseEntity.ok(repository.findAllByPreco(preco));
	}
	
	// postProduto = um endPoint com a função de gravar um novo Produto no banco de dados.
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	// putProduto = um endPoint com a função de atualizar dados de um Produto .
	@PutMapping
	public ResponseEntity<Produto> put (@RequestBody Produto produto){
		return ResponseEntity.ok(repository.save(produto));
	}
	
	// deleteProduto = um endPoint com a função de apagar um Produto do banco de dados).
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
