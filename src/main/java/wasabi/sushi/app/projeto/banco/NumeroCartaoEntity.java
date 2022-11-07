package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "numero_cartao", schema = "trabalho_netbiis", catalog = "")
public class NumeroCartaoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idNumero_Cartao", nullable = false)
    private int idNumeroCartao;
    @Basic
    @Column(name = "Cliente_idCliente", nullable = false)
    private int clienteIdCliente;
    @Basic
    @Column(name = "Numero_Cartao", nullable = true, length = 45)
    private String numeroCartao;
    @Basic
    @Column(name = "Nome_Cartao", nullable = true, length = 45)
    private String nomeCartao;

    public NumeroCartaoEntity(int clienteIdCliente, String numeroCartao, String nomeCartao) {
        this.clienteIdCliente = clienteIdCliente;
        this.numeroCartao = numeroCartao;
        this.nomeCartao = nomeCartao;
    }

    public NumeroCartaoEntity() {
    }

    public int getIdNumeroCartao() {
        return idNumeroCartao;
    }

    public void setIdNumeroCartao(int idNumeroCartao) {
        this.idNumeroCartao = idNumeroCartao;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }
}
