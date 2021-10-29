package main;

import dao.Imp.EmployeeBeanDaoImp;
import dao.Imp.StudentDaoImp;
import entity.EmployeeBean;
import entity.Student;
import org.hibernate.Session;
import utils.BeanValidatorUtils;
import utils.HibernateUtils;
import utils.ValidationBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author san vui
 * @create 25/10/2021 - 8:10 PM
 * @sanvankhanh@gmail.com
 */
public class main {
    public static void main(String[] args) {

        EmployeeBeanDaoImp employeeBeanDaoImp = new EmployeeBeanDaoImp();
//        EmployeeBean employeeBean1 = new EmployeeBean("San khanh",19,"ssadsadasdasgmail.com");
//        EmployeeBean employeeBean2 = new EmployeeBean("San khanh vui",19,"@gmail");
//        EmployeeBean employeeBean3 = new EmployeeBean("San",17,"sanvankhanh@gmail.com");
//        List<EmployeeBean> employeeBeans = new ArrayList<>();
//        employeeBeans.add(employeeBean1);
//        employeeBeans.add(employeeBean2);
//        employeeBeans.add(employeeBean3);
//        employeeBeanDaoImp.insert(employeeBeans);

//        Student student = new Student("Sa");
//        ValidationBean validationBean = BeanValidatorUtils.validateBean(student);
//        System.out.println(validationBean);

        StudentDaoImp studentDaoImp = new StudentDaoImp();
        Student student1 = new Student("Nguyen Van D");
        Student student2 = new Student("Nguyen Van E");
        Student student3 = new Student("Nguyen Van F");
        Student student4 = new Student("Nguyen Van D");
        Student student5 = new Student("Nguyen Van E");
        Student student6 = new Student("Nguyen Van F");
        Student student7 = new Student("Nguyen Van D");
        Student student8 = new Student("Nguyen Van E");
        Student student9 = new Student("Nguyen Van F");
        Student student10 = new Student("Nguyen Van D");
        Student student11= new Student("Nguyen Van E");
        Student student12= new Student("Nguyen Van F");
        Student student13 = new Student("Nguyen Van D");
        Student student14= new Student("Nguyen Van E");
        Student student15= new Student("Nguyen Van F");
        Student student16= new Student("Nguyen Van D");
        Student student17 = new Student("Nguyen Van E");
        Student student18 = new Student("Nguyen Van F");
        Student student19 = new Student("Nguyen Van D");
        Student student20= new Student("Nguyen Van E");
        Student student21 = new Student("Nguyen Van F");
        Student student22 = new Student("Nguyen Van D");
        Student student23 = new Student("Nguyen Van E");
        Student student24 = new Student("Nguyen Van F");
        Student student25 = new Student("Nguyen Van D");
        Student student26 = new Student("Nguyen Van E");
        Student student27 = new Student("Nguyen Van F");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);
        studentList.add(student16);
        studentList.add(student17);
        studentList.add(student18);
        studentList.add(student19);
        studentList.add(student20);
        studentList.add(student21);
        studentList.add(student22);
        studentList.add(student23);
        studentList.add(student24);
        studentList.add(student25);
        studentList.add(student26);
        studentList.add(student27);
//        studentDaoImp.insert(studentList);

        Student studentUpdate = new Student("Nguyen Van E");
        studentDaoImp.update(studentUpdate);
    }
}
