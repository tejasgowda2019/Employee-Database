package com.example.demo.Serviceimp;


import java.lang.module.ResolutionException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Module.Employee;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.ResourceNotFound.ResourceNotFound;
import com.example.demo.Service.EmployeeService;

@Service
public class EmployeeSrviceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee( Employee e) {
		
		return repo.save(e);
	}

	@Override
	public Employee getById(Integer eid) {
		
		return repo.findById(eid).orElseThrow(()->new ResourceNotFound("Employee","Id",eid));
	}

	@Override
	public List<Employee> getByDesignation(String designation) {
		
		return repo.findByDesignation(designation);
	}

	@Override
	public List<Employee> getByLessSal(Double sal) {
		
		return repo.findByLessSal(sal);
	}

	@Override
	public Employee updateEmp(Employee e) {
		Employee e1=repo.findById(e.getEid()).orElse(null);
		if(e1!=null)
		{
			e1.setEname(e.getEname());
			e1.setDesignation(e.getDesignation());
			e1.setPhno(e1.getPhno());
			e1.setSal(e.getSal());
			return repo.save(e1);
		}
		else {
			throw new ResourceNotFound("Employee","id",e.getEid());
		}
	}

}
