package com.gavin.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * dept 实体类
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Integer deptno;

    private String dname;

    private String loc;

    private List<Emp> emp;

    private static final long serialVersionUID = 1L;
}