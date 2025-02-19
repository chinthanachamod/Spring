package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping( "save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res=customerService.addCustomer(customerDTO);
        return res;
    }

    @PutMapping("update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean updated = customerService.updateCustomer(customerDTO);
        return updated;
    }

    @DeleteMapping("delete")
    public boolean deleteCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean deleted = customerService.deleteCustomer(customerDTO.getId());
        return deleted;
    }

    @GetMapping("get")
    public String getCustomer() {
        List<CustomerDTO> customers = customerService.getCustomers();
        return customers.toString();
    }

}
