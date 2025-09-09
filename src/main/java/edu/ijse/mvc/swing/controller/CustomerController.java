package edu.ijse.mvc.swing.controller;

import com.mvc.fx.dto.CustomerDto;
import com.mvc.fx.model.CustomerModel;

import java.util.ArrayList;

public class CustomerController {

    private CustomerModel customerModel = new CustomerModel();

    public String addCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.addCustomer(customerDto);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerModel.updateCustomer(customerDto);
    }

    public String deleteCustomer(String customer_id) throws Exception{
        return customerModel.deleteCustomer(customer_id);
    }

    public CustomerDto searchCustomer(String customer_id) throws Exception{
        return customerModel.searchCustomer(customer_id);
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerModel.getAllCustomer();
    }
}
