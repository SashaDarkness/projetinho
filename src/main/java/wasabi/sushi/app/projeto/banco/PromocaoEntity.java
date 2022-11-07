package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "promocao", schema = "trabalho_netbiis", catalog = "")
public class PromocaoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPromocao", nullable = false)
    private int idPromocao;
    @Basic
    @Column(name = "Nome", nullable = true, length = 45)
    private String nome;
    @Basic
    @Column(name = "Valor", nullable = true, precision = 0)
    private Double valor;
    @Basic
    @Column(name = "Descricao", nullable = true, length = 100)
    private String descricao;

    public int getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
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
