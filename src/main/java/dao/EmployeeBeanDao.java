package dao;

import entity.EmployeeBean;
import entity.Student;

import java.util.List;

/**
 * @author san vui
 * @create 25/10/2021 - 6:48 PM
 * @sanvankhanh@gmail.com
 */
public interface EmployeeBeanDao {
    List<EmployeeBeanDao> listEmp();
    boolean insert(List<EmployeeBean> employeeBeans);

}