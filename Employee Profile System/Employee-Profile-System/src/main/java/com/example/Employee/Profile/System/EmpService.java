package com.example.Employee.Profile.System;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class EmpService {
    @Autowired
    private EmpRepository repo;
    public List<EmpSystem> listAll() {
        return repo.findAll();
    }

    public void save(EmpSystem empSystem) {
        repo.save(empSystem);
    }

    public EmpSystem get(long EmployeeCode) {
        return repo.findById(EmployeeCode).get();
    }

    public void delete(long EmployeeCode) {
        repo.deleteById(EmployeeCode);
    }
}