package wasabi.sushi.app.projeto.service;

import wasabi.sushi.app.projeto.banco.ClienteEntity;
import wasabi.sushi.app.projeto.banco.PagamentoEntity;


import javax.persistence.*;
import java.util.List;

public class PedidoService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public List<PagamentoEntity> finAllPedidos(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        TypedQuery<PagamentoEntity> query = em.createQuery(
                "Select c from PagamentoEntity c", PagamentoEntity.class
        );
        List<PagamentoEntity> pedidos = query.getResultList();
        return pedidos;

    }

    public void adicionarPedido(int idCliente, int id_produto, double valor_total, String numeroNota, String formaPagamento){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        PagamentoEntity cliente = new PagamentoEntity(
            idCliente,id_produto,valor_total,numeroNota,formaPagamento
        );
        tx.begin();
        em.persist(cliente);
        tx.commit();
        em.close();
    }

    public void alterarClientePedido(int id_pedido, int cpfCLiente, int newCpf, String nome, String endereco){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        ClienteEntity cliente = em.find(ClienteEntity.class,cpfCLiente);
        cliente.setCpf(newCpf);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        tx.begin();
        em.merge(cliente);
        tx.commit();
        em.close();
    }

//    public void alterarProdutoPedido(int idProduto, String tipoProduto){
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        ProdutoEntity produto = em.find(ProdutoEntity.class,idProduto);
//        cliente.setCpf(newCpf);
//        cliente.setNome(nome);
//        cliente.setEndereço(endereco);
//        tx.begin();
//        em.merge(cliente);
//        tx.commit();
//        em.close();
//    }

    public void deletarCliente(int cpf){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        PagamentoEntity cliente = em.find(PagamentoEntity.class,cpf);
        tx.begin();
        em.remove(cliente);
        tx.commit();
        em.close();
    }
    
}
