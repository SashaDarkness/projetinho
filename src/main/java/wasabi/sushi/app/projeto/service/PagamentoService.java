package wasabi.sushi.app.projeto.service;

import wasabi.sushi.app.projeto.banco.NumeroCartaoEntity;
import wasabi.sushi.app.projeto.banco.PagamentoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PagamentoService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public void adicionarPagamento(int idCliente, String numeroCard, String nomeCard){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        NumeroCartaoEntity pagCard = new NumeroCartaoEntity(
                idCliente,numeroCard,nomeCard
        );
        tx.begin();
        em.persist(pagCard);
        tx.commit();
        em.close();
    }

    
}
