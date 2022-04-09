package com.kocirfan.ecolesson.maintest;

import com.kocirfan.ecolesson.controller.AdminController;
import com.kocirfan.ecolesson.dao.AdminDao;
import com.kocirfan.ecolesson.dto.AdminDto;

public class AdminMainTest {

    public static void main(String[] args) {

        AdminController adminController=new AdminController();


        //Create(insert)
//        AdminDto adminDto=AdminDto
//                .builder()
//                .name("test")
//                .surname("test")
//                .build();
//        adminController.create(adminDto);

        //update
//        AdminDto adminDto=AdminDto
//                .builder()
//                .id(1)
//                .name("Mehmet")
//                .surname("Test")
//                .build();
//        adminController.update(adminDto);

        //delete
//        AdminDto adminDto=AdminDto
//                .builder()
//                .id(1)
//                .build();
//        adminController.delete(adminDto);

        adminController.list().forEach(System.out::println);
    }
}

