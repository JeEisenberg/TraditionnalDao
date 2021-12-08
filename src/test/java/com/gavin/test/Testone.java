package com.gavin.test;

import com.gavin.dao.DeptDao;
import com.gavin.pojo.Dept;
import com.gavin.pojo.Emp;
import lombok.AllArgsConstructor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Testone {
    private SqlSessionFactory factory=null;
    private  SqlSession sqlSession=null;
   // @Before
    public void init() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatisConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = factory.openSession();
    }
    @Test
    public void test (){
      /*  DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        Dept empByDeptno = mapper.findEmpByDeptno(10);
        System.out.println(empByDeptno);*/

        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDaoImp = ac.getBean("deptDao", DeptDao.class);
        Dept empByDeptno = deptDaoImp.findEmpByDeptno(10);
        System.out.println(empByDeptno);
    }


//@After
    public void initclose(){
        sqlSession.close();


    }


}
