package com.project.professor.allocation.controller;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.entity.Questao;
import com.project.professor.allocation.service.DepartmentService;
import com.project.professor.allocation.service.QuestaotService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/questao")
public class QuestaoController {

    private final QuestaotService questaotService;

    public QuestaoController(QuestaotService questaotService) {
        super();
        this.questaotService = questaotService;
    }

//    @ApiOperation(value = "Find all departments")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "OK")
//    })
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<Department>> findAll(@RequestParam(name = "name", required = false) String name) {
//        List<Department> departments = departmentService.findAll(name);
//        return new ResponseEntity<>(departments, HttpStatus.OK);
//    }
//
//    @ApiOperation(value = "Find a department by id")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 400, message = "Bad Request"),
//            @ApiResponse(code = 404, message = "Not Found")
//    })
//    @GetMapping(path = "/{department_id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<Department> findById(@PathVariable(name = "department_id") Long id) {
//        Department department = departmentService.findById(id);
//        if (department == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } else {
//            return new ResponseEntity<>(department, HttpStatus.OK);
//        }
//    }

    @ApiOperation(value = "Save a questão")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Questao> save(@RequestBody Questao questao) {
        try {
        	questao = questaotService.save(questao);
            return new ResponseEntity<>(questao, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
//
//    @ApiOperation(value = "Update a department")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 400, message = "Bad Request"),
//            @ApiResponse(code = 404, message = "Not Found")
//    })
//    @PutMapping(path = "/{department_id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<Department> update(@PathVariable(name = "department_id") Long id,
//                                             @RequestBody Department department) {
//        department.setId(id);
//        try {
//            department = departmentService.update(department);
//            if (department == null) {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            } else {
//                return new ResponseEntity<>(department, HttpStatus.OK);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @ApiOperation(value = "Delete a department")
//    @ApiResponses({
//            @ApiResponse(code = 204, message = "No Content")
//    })
//    @DeleteMapping(path = "/{department_id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public ResponseEntity<Void> deleteById(@PathVariable(name = "department_id") Long id) {
//        departmentService.deleteById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @ApiOperation(value = "Delete all departments")
//    @ApiResponses({
//            @ApiResponse(code = 204, message = "No Content")
//    })
//    @DeleteMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public ResponseEntity<Void> deleteAll() {
//        departmentService.deleteAll();
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
