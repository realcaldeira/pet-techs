package br.com.fiap.pet_techs.pet_techs;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public Collection<Produto> findAll() {
        return repo.findAll();
    }

    public Produto findById(UUID id) {
        var produto = repo.findById(id).orElseThrow(()-> new ControllerNotFoundException("Produto não encontrado"));
        return produto;
    }

    public Produto save(Produto produto) {
        return repo.save(produto);
    }

    public Produto update(UUID id,  Produto produto) {

        try {
            Produto buscaProduto = repo.getOne(id);
            buscaProduto.setNome(produto.getNome());
            buscaProduto.setDescricao(produto.getDescricao());
            buscaProduto.setUrlDaImagem(produto.getUrlDaImagem());
            buscaProduto.setPreco(produto.getPreco());
            buscaProduto = repo.save(buscaProduto);

            return buscaProduto;
        } catch (EntityNotFoundException e) {
            throw new ControllerNotFoundException("Produto não encontrado.");
        }

    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }

}
