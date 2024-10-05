package task7;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task6.HibernateUtil;

public class CompanyDAO {
    public void createCompany(Company company) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(company);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
