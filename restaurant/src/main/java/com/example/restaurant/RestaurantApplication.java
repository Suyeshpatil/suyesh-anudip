package com.example.restaurant;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.restaurant.model.Restra;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class RestaurantApplication {

	
public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
  
    try
    {
    	emf =Persistence.createEntityManagerFactory("jpa-todo");
    	entityManager = emf.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		
		Restra val =new Restra();
		val.setItem("bun");
		val.setPrice(50);
		val.setQty(2);
		val.setTotal(50);
		entityManager.persist(val);
		transaction.commit();
		Query q = entityManager.createQuery("select v from Restra v");
		List<Restra>resultList = q.getResultList();
		System.out.println("Total:" + resultList.size());
		for (Restra next : resultList) {
			System.out.println("next : " + next);
		}		
		
    }
    catch(Exception e)
    {
    	System.out.println("Error");
    	transaction.rollback();
    }
    finally {
    	entityManager.close();
		emf.close();
    }
       
		}
		
	}


