package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "holl_wasabi", schema = "trabalho_netbiis", catalog = "")
public class HollWasabiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idHoll_Wasabi")
    private int idHollWasabi;
    @Basic
    @Column(name = "Nome")
    private String nome;
    @Basic
    @Column(name = "Valor")
    private Double valor;
    @Basic
    @Column(name = "Descricao")
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
