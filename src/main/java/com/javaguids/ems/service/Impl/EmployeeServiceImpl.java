package com.javaguids.ems.service.Impl;

import com.javaguids.ems.dto.EmployeeDto;
import com.javaguids.ems.mapper.EmployeeMapper;
import com.javaguids.ems.model.Employee;
import com.javaguids.ems.repository.EmployeeRepository;
import com.javaguids.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
