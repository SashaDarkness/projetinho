package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "cliente", schema = "formacaojava", catalog = "")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCliente")
    private int idCliente;
    @Basic
    @Column(name = "Nome")
    private String nome;
    @Basic
    @Column(name = "CPF")
    private Integer cpf;
    @Basic
    @Column(name = "Endereco")
    private String endereco;

    public ClienteEntity(String nome, Integer cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public ClienteEntity() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
