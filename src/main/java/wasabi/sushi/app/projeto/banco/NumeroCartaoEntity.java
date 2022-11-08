package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "numero_cartao", schema = "trabalho_netbiis", catalog = "")
public class NumeroCartaoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idNumero_Cartao")
    private int idNumeroCartao;
    @Basic
    @Column(name = "Cliente_idCliente")
    private int clienteIdCliente;
    @Basic
    @Column(name = "Numero_Cartao")
    private String numeroCartao;
    @Basic
    @Column(name = "Nome_Cartao")
    private String nomeCartao;

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
