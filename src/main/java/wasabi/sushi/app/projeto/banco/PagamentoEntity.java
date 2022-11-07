package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pagamento", schema = "trabalho_netbiis", catalog = "")
public class PagamentoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Column(name = "valor_total", nullable = false, precision = 0)
    private double valorTotal;
    @Basic
    @Column(name = "Numero_nota")
    private String numeroNota;
    @Basic
    @Column(name = "forma_pagamento", nullable = true, length = 45)
    private String formaPagamento;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPagamento", nullable = false)
    private int idPagamento;
    @Basic
    @Column(name = "id_produto", nullable = false)
    private int idProduto;
    @Basic
    @Column(name = "id_cliente", nullable = false)
    private int idCliente;

    public PagamentoEntity(int clienteIdCliente, int produtoIdProduto, double valorTotal, String numeroNota, String formaPagamento) {
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
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

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
