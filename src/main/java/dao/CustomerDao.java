package dao;

import models.Avto;
import models.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

    public class CustomerDao {

        public Customer findById(int id) {
            return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Customer.class, id);
        }

        public void save(Customer customer) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.save(customer);
            tx1.commit();
            session.close();
        }

        public void update(Customer customer) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.update(customer);
            tx1.commit();
            session.close();
        }

        public void delete(Customer customer) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.delete(customer);
            tx1.commit();
            session.close();
        }

        public Avto findAutoById(int id) {
            return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Avto.class, id);
        }

        public List<Customer> findAll() {
            List<Customer> customer = (List<Customer>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Customer").list();
            return customer;
        }
    }
