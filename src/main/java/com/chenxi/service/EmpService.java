package com.chenxi.service;
import java.util.List;
import com.chenxi.entity.Emp;
public interface EmpService{
	/**
	 * 获得Emp数据的总行数
	 * @return
	 */
    long getEmpRowCount();
	/**
	 * 获得Emp数据集合
	 * @return
	 */
    List<Emp> selectEmp();
	/**
	 * 获得一个Emp对象,以参数Emp对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Emp selectEmpByObj(Emp obj);
	/**
	 * 通过Emp的id获得Emp对象
	 * @param id
	 * @return
	 */
    Emp selectEmpById(Integer id);
	/**
	 * 插入Emp到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEmp(Emp value);
	/**
	 * 插入Emp中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEmp(Emp value);
	/**
	 * 通过Emp的id删除Emp
	 * @param id
	 * @return
	 */
    int deleteEmpById(Integer id);
	/**
	 * 通过Emp的id更新Emp中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEmpById(Emp enti);
	/**
	 * 通过Emp的id更新Emp中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEmpById(Emp enti);
}