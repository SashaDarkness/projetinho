package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "holl_wasabi", schema = "trabalho_netbiis", catalog = "")
public class HollWasabiEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idHoll_Wasabi", nullable = false)
    private int idHollWasabi;
    @Basic
    @Column(name = "Nome", nullable = true, length = 45)
    private String nome;
    @Basic
    @Column(name = "Valor", nullable = true, precision = 0)
    private Double valor;
    @Basic
    @Column(name = "Descricao", nullable = true, length = 100)
    private String descricao;

    public int getIdHollWasabi() {
        return idHollWasabi;
    }

    public void setIdHollWasabi(int idHollWasabi) {
        this.idHollWasabi = idHollWasabi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
