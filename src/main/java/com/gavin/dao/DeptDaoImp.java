package com.gavin.dao;

import com.gavin.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.InputStream;

@Repository("deptDao")
public class DeptDaoImp implements DeptDao{
    public DeptDaoImp() {
    }

@Resource(name="sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Dept findEmpByDeptno(Integer deptno) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptDao mapper = sqlSession.getMapper(DeptDao.class);
        Dept empByDeptno = mapper.findEmpByDeptno(10);
        sqlSession.close();
        return empByDeptno;
    }
}
