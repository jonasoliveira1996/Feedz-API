package com.br.feedz.employees;

import com.br.feedz.employees.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Employees, Long> {
}
