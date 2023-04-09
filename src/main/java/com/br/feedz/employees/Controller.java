package com.br.feedz.employees;

import com.br.feedz.employees.model.Employees;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v2/integracao/employees")
public class Controller {
    private Repository repository;

    @GetMapping
    public ResponseEntity<List<Employees>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
    @PostMapping
    public ResponseEntity<Object> register(@RequestBody Employees employees) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(employees));
    }
}
