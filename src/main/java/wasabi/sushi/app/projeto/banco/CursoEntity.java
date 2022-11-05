package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "curso", schema = "formacaojava", catalog = "")
public class CursoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCurso")
    private long idCurso;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "valor")
    private long valor;
    @Basic
    @Column(name = "url")
    private String url;

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
