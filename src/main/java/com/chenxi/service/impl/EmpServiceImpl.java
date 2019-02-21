package com.chenxi.service.impl;
import java.util.List;
import com.chenxi.dao.EmpMapper;
import com.chenxi.entity.Emp;
import com.chenxi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;
    @Override
    public long getEmpRowCount(){
        return empMapper.getEmpRowCount();
    }
    @Override
    public List<Emp> selectEmp(){
        return empMapper.selectEmp();
    }
    @Override
    public Emp selectEmpByObj(Emp obj){
        return empMapper.selectEmpByObj(obj);
    }
    @Override
    public Emp selectEmpById(Integer id){
        return empMapper.selectEmpById(id);
    }
    @Override
    public int insertEmp(Emp value){
        return empMapper.insertEmp(value);
    }
    @Override
    public int insertNonEmptyEmp(Emp value){
        return empMapper.insertNonEmptyEmp(value);
    }
    @Override
    public int deleteEmpById(Integer id){
        return empMapper.deleteEmpById(id);
    }
    @Override
    public int updateEmpById(Emp enti){
        return empMapper.updateEmpById(enti);
    }
    @Override
    public int updateNonEmptyEmpById(Emp enti){
        return empMapper.updateNonEmptyEmpById(enti);
    }

    public EmpMapper getEmpMapper() {
        return this.empMapper;
    }

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

}