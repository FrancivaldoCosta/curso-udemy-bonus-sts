package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
/* O PROFESSOR APAGOU POR QUE JA INSTANCIOU E SALVOU NA BASE DE DADOS
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
*/		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

/* APAGADO PELO PROFESSOR JUNTAMENTE COM O CODIGO ACIMA
		//QUANDO O JPA FAZ ALGUMA TRANSAÇÃO QUE NÃO É UMA SIMPLES LEITURA ELE PRECISA DE UMA TRANSAÇÃO;
		em.getTransaction().begin(); //INICIA A TRANSAÇÃO;
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();//CONFIRMA AS ALTERAÇÕES
*/		
		System.out.println("Pronto");
		em.close();
		emf.close();
	}

}
