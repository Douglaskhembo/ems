package com.javaguids.ems.mapper;

import com.javaguids.ems.dto.EmployeeDto;
import com.javaguids.ems.model.Employee;

public class EmployeeMapper {

//    Mapping Employee entity(model) to EmployeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

//    Mapping EmployeeDto to Employee entity(Model)
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
