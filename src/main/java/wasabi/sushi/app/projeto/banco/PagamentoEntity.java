package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "pedido", schema = "formacaojava", catalog = "")
public class PagamentoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPedido")
    private int idPedido;
    @Basic
    @Column(name = "Cliente_idCliente")
    private int clienteIdCliente;
    @Basic
    @Column(name = "Produto_idProduto")
    private int produtoIdProduto;
    @Basic
    @Column(name = "Valor_Total")
    private String valorTotal;
    @Basic
    @Column(name = "Numero_nota")
    private String numeroNota;
    @Basic
    @Column(name = "Forma_pagamento")
    private String formaPagamento;

    public PagamentoEntity(int clienteIdCliente, int produtoIdProduto, String valorTotal, String numeroNota, String formaPagamento) {
        this.clienteIdCliente = clienteIdCliente;
        this.produtoIdProduto = produtoIdProduto;
        this.valorTotal = valorTotal;
        this.numeroNota = numeroNota;
        this.formaPagamento = formaPagamento;
    }

    public PagamentoEntity() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public int getProdutoIdProduto() {
        return produtoIdProduto;
    }

    public void setProdutoIdProduto(int produtoIdProduto) {
        this.produtoIdProduto = produtoIdProduto;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
