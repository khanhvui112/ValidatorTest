package dao.Imp;

import dao.StudentDao;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.List;

/**
 * @author san vui
 * @create 27/10/2021 - 1:12 PM
 * @sanvankhanh@gmail.com
 */
public class StudentDaoImp implements StudentDao {
    @Override
    public boolean update(Student student) {
        try (Session session = HibernateUtils.getSession()) {
            Transaction transaction = session.beginTransaction();
            Session session1 = HibernateUtils.getSession();
            Student student12 = session1.load(Student.class, 1);
            System.out.println(student12);
//            detached
            session.evict(student12);

//            set again object
            student12.setName("Nguyen Thi GaaUpdate");

//            execute insert to database
            session.persist(student12);

            return true;
        }
    }

    @Override
    public boolean insert(List<Student> studentList) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtils.getSession();
            transaction = session.beginTransaction();
            int i = 0;
            for (Student student : studentList) {
                session.save(student);
                if(i%20 == 0){
                    System.out.println("Da vao day.");
                    session.flush();
                    session.clear();
                }
                i++;
            }
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
