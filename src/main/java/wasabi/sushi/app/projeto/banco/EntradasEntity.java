package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "entradas", schema = "trabalho_netbiis", catalog = "")
public class EntradasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEntradas")
    private int idEntradas;
    @Basic
    @Column(name = "Nome")
    private String nome;
    @Basic
    @Column(name = "Valor")
    private Double valor;
    @Basic
    @Column(name = "Descricao")
    private String descricao;

    public int getIdEntradas() {
        return idEntradas;
    }

    public void setIdEntradas(int idEntradas) {
        this.idEntradas = idEntradas;
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
