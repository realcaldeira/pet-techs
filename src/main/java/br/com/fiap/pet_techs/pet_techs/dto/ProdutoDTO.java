package br.com.fiap.pet_techs.pet_techs.dto;

import java.util.UUID;

public record ProdutoDTO(
        UUID id,
        String nome,
        String descricao,
        Double preco,
        String urlDaImagem
) {

}
