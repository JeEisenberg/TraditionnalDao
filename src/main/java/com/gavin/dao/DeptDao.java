package com.gavin.dao;

import com.gavin.pojo.Dept;
import com.gavin.pojo.Emp;

public interface DeptDao {


   Dept findEmpByDeptno(Integer deptno);
}