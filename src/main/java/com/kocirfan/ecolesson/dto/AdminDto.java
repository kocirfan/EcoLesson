package com.kocirfan.ecolesson.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Database objem

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto {

    private int id;
    private String name;
    private String surname;
    private java.util.Date createdDate;
}
