package com.example.msatest1.customer.controller;
import com.example.msatest1.customer.entity.Customer;
import com.example.msatest1.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
        customer.setName(customer.getName() + " cicd 테스트");
        Customer savedCustomer = customerService.registerCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("test입니다.", HttpStatus.OK);
    }
}
// http://localhost:8080/customers/register
// http://localhost:8080/customers/test
// 게시글
// http://localhost:8080/blog/create
// http://localhost:8080/blog/update
// http://localhost:8080/blog/delete
// http://localhost:8080/blog/retreive

// 신고
// http://localhost:8080/report/post-report/{id}
// http://localhost:8080/report/delete
// http://localhost:8080/report/retreive