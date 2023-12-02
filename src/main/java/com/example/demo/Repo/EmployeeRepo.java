package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Module.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
	@Query(value="select * from Employee where designation=?1",nativeQuery=true)
	List<Employee> findByDesignation(String designation);
	
	@Query(value="select * from Employee where sal=?1",nativeQuery=true)
	List<Employee> findByLessSal(Double sal);
}
