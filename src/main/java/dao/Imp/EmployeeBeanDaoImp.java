package dao.Imp;

import dao.EmployeeBeanDao;
import entity.EmployeeBean;
import entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Cache;
import utils.BeanValidatorUtils;
import utils.HibernateUtils;
import utils.ValidationBean;

import java.util.List;

/**
 * @author san vui
 * @create 25/10/2021 - 6:49 PM
 * @sanvankhanh@gmail.com
 */
public class EmployeeBeanDaoImp implements EmployeeBeanDao {
    @Override
    public List<EmployeeBeanDao> listEmp() {
        return null;
    }

    @Override
    public boolean insert(List<EmployeeBean> employeeBeans) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSession()) {
            transaction = session.beginTransaction();
            //ValidationBean
            ValidationBean validationBean = BeanValidatorUtils.validateBean(employeeBeans);
            System.out.println(validationBean);
            if (!validationBean.isSuccess()) {
                return false;
            } else {
                System.out.println(employeeBeans);
                for (EmployeeBean employeeBean : employeeBeans) {
                    session.save(employeeBean);
                    System.out.println(employeeBean);
                }
                transaction.commit();
                return true;
            }
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return false;
        }

    }


}
