package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {
    @NotBlank(message = "Campo não pode estar em branco")
    private String nomeDoProduto;
    @NotBlank(message = "Campo não pode estar em branco")
    private String urlDoProduto;
    @NotBlank(message = "Campo não pode estar em branco")
    private String urlDaImagem;
    private String descricao;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getUrlDoProduto() {
        return urlDoProduto;
    }

    public void setUrlDoProduto(String urlDoProduto) {
        this.urlDoProduto = urlDoProduto;
    }

    public String getUrlDaImagem() {
        return urlDaImagem;
    }

    public void setUrlDaImagem(String urlDaImagem) {
        this.urlDaImagem = urlDaImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(nomeDoProduto);
        pedido.setUrlProduto(urlDoProduto);
        pedido.setUrlImagem(urlDaImagem);
        pedido.setDescricao(descricao);

        return pedido;
    }
}
