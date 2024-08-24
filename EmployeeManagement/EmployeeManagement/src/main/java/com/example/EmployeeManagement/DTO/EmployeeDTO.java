package com.example.EmployeeManagement.DTO;


import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String first_name;
    private String last_name;
    private String email;
    private Long departmentId;
    private List<Long> projectIds;
    private List<AddressDTO> addresses;
    private Long roleId;
}


