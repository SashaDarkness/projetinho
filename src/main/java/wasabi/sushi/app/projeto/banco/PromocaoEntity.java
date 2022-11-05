package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "promocao", schema = "formacaojava", catalog = "")
public class PromocaoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPromocao")
    private int idPromocao;
    @Basic
    @Column(name = "Nome")
    private String nome;
    @Basic
    @Column(name = "Valor")
    private Double valor;
    @Basic
    @Column(name = "Descricao")
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
