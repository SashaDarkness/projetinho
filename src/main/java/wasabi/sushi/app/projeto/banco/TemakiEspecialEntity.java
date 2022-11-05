package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "temaki_especial", schema = "trabalho_netbiis", catalog = "")
public class TemakiEspecialEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTemaki_Especial")
    private int idTemakiEspecial;
    @Basic
    @Column(name = "Nome")
    private String nome;
    @Basic
    @Column(name = "Valor")
    private Double valor;
    @Basic
    @Column(name = "Descricao")
    private String descricao;

    public int getIdTemakiEspecial() {
        return idTemakiEspecial;
    }

    public void setIdTemakiEspecial(int idTemakiEspecial) {
        this.idTemakiEspecial = idTemakiEspecial;
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
