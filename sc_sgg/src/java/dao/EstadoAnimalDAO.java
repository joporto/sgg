/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author javierOporto
 */
public class EstadoAnimalDAO {
    public boolean add(edm.EstadoAnimal a) throws Exception {
        Session sessionA = NewHibernateUtil.getSessionFactory().openSession();
        sessionA.beginTransaction();
        try 
        {
            sessionA.save(a);
            sessionA.getTransaction().commit();
            sessionA.close();
            return true;            
        } 
        catch (Exception e) 
        {
            sessionA.getTransaction().rollback();
            sessionA.close();
            System.err.println(e.getMessage());
            throw e;            
        }      
    }
    
    public List<edm.EstadoAnimal> getList() throws Exception {
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try 
        {
            return (List<edm.EstadoAnimal>) session.createCriteria(edm.EstadoAnimal.class).list(); 
        } 
        catch (Exception e) 
        {
            session.getTransaction().rollback();
            session.close();
            System.err.println(e.getMessage());
            throw e;
        } 
        finally
        {
            session.close();
        }
    }
    
    public boolean delete(edm.EstadoAnimal a) throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try 
        {
            session.delete(a);
            session.getTransaction().commit();
            session.close();
            return true;  
        } catch (Exception e) 
        {
            session.getTransaction().rollback();
            session.close();
            System.err.println(e.getMessage());
            throw e;
        } 
    }
     
    public boolean update(edm.EstadoAnimal a) throws Exception {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try 
        {
            session.update(a);
            session.getTransaction().commit();
            session.close();
            return true;  
        } catch (Exception e) 
        {
            session.getTransaction().rollback();
            session.close();
            System.err.println(e.getMessage());
            throw e;
        } 
    }
}