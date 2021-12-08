package com.gavin.dao;

import com.gavin.pojo.Dept;
import com.gavin.pojo.Emp;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface DeptDao {

@Transactional(propagation = Propagation.REQUIRED ,isolation = Isolation.DEFAULT)
   Dept findEmpByDeptno(Integer deptno);
}