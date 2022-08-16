/*
 * 2)Develop an application using JPA try to insert employee Information
 * (empno,name,designation,sal ..etc) 
	into database and also fetch all the data from the database then display on console

 */

package com.jpa.emp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.mysql.cj.Query;

public class EmployeeInsert {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
	    EntityManager em=emf.createEntityManager();
		
	    //insert data
	    
	    em.getTransaction().begin();
	    EmployeeEntity e1 = new EmployeeEntity();
	    e1.setEno(1001);
	    e1.setEname("Tom");
	    e1.setDes("Trainee");
	    e1.setSal(50000);
	    
	    
	    
	    em.persist(e1);
	    
	    
	    em.getTransaction().commit();
	    
	    em.getTransaction().begin();
	    CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);
	    
	    Root<EmployeeEntity> emp = cq.from(EmployeeEntity.class);
	    
	    cq.multiselect(emp.get("eno"),emp.get("ename"),emp.get("des"),emp.get("sal"));
	    
	    CriteriaQuery<EmployeeEntity> select = cq.select(emp);
	    TypedQuery<EmployeeEntity> q = em.createQuery(select);
//	    Query q = (Query) em.createQuery("select * from employee1");
	    
	    List <EmployeeEntity> list= q.getResultList();
	    
	    System.out.print("eno\t");
	    System.out.print("ename\t");
	    System.out.print("des\t");
	    System.out.print("sal\t\n");
	    
	    for(EmployeeEntity e :list)
	    {
	    	System.out.print(e.getEno() + "\t");
	    	System.out.print(e.getEname() +"\t");
	    	System.out.print(e.getDes() + "\t");
	    	System.out.print(e.getSal() + "\t\n");
	    }
	    
	    em.getTransaction().commit();
	    em.close();
	    emf.close();

	}

}
