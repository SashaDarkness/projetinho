package wasabi.sushi.app.projeto.service;
import wasabi.sushi.app.projeto.banco.ClienteEntity;

import javax.persistence.*;
import java.util.List;

public class ClienteService {

    public ClienteService() {
    }

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    public List<ClienteEntity> finAllCliente(){

        TypedQuery<ClienteEntity> query = em.createQuery(
                "Select c from ClienteEntity c",ClienteEntity.class
        );
        List<ClienteEntity> clientes = query.getResultList();
        return clientes;

    }

//    public void adicionarCliente(String nome, int cpf, String endereco,String email, String telefone){
  //      ClienteEntity cliente = new ClienteEntity(nome,cpf,endereco,email,telefone);
//        tx.begin();
//        em.persist(cliente);
//        tx.commit();
//        em.close();
//    }

    public void alterarCliente(int cpf,int newCpf,String nome,String endereco){
        ClienteEntity cliente = em.find(ClienteEntity.class,cpf);
        cliente.setCpf(newCpf);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        tx.begin();
        em.merge(cliente);
        tx.commit();
        em.close();
    }

    public void deletarCliente(int cpf){
        ClienteEntity cliente = em.find(ClienteEntity.class,cpf);
        tx.begin();
        em.remove(cliente);
        tx.commit();
        em.close();
    }




}
