package wasabi.sushi.app.projeto.banco;

import javax.persistence.*;

@Entity
@Table(name = "produto", schema = "trabalho_netbiis", catalog = "")
public class ProdutoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProduto")
    private int idProduto;
    @Basic
    @Column(name = "Quantidade")
    private int quantidade;
    @Basic
    @Column(name = "Temaki_Especial_idTemaki_Especial1")
    private int temakiEspecialIdTemakiEspecial1;
    @Basic
    @Column(name = "Holl_Wasabi_idHoll_Wasabi")
    private int hollWasabiIdHollWasabi;
    @Basic
    @Column(name = "Promocao_idPromocao")
    private int promocaoIdPromocao;
    @Basic
    @Column(name = "Entradas_idEntradas")
    private int entradasIdEntradas;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTemakiEspecialIdTemakiEspecial1() {
        return temakiEspecialIdTemakiEspecial1;
    }

    public void setTemakiEspecialIdTemakiEspecial1(int temakiEspecialIdTemakiEspecial1) {
        this.temakiEspecialIdTemakiEspecial1 = temakiEspecialIdTemakiEspecial1;
    }

    public int getHollWasabiIdHollWasabi() {
        return hollWasabiIdHollWasabi;
    }

    public void setHollWasabiIdHollWasabi(int hollWasabiIdHollWasabi) {
        this.hollWasabiIdHollWasabi = hollWasabiIdHollWasabi;
    }

    public int getPromocaoIdPromocao() {
        return promocaoIdPromocao;
    }

    public void setPromocaoIdPromocao(int promocaoIdPromocao) {
        this.promocaoIdPromocao = promocaoIdPromocao;
    }

    public int getEntradasIdEntradas() {
        return entradasIdEntradas;
    }

    public void setEntradasIdEntradas(int entradasIdEntradas) {
        this.entradasIdEntradas = entradasIdEntradas;
    }
}
