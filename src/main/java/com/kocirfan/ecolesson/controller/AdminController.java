package com.kocirfan.ecolesson.controller;

import com.kocirfan.ecolesson.dao.AdminDao;
import com.kocirfan.ecolesson.dao.IDaoConnection;
import com.kocirfan.ecolesson.dto.AdminDto;

import java.util.ArrayList;

public class AdminController implements IDaoConnection<AdminDto> {
    AdminDao adminDao;
    public AdminController() {
        adminDao=new AdminDao();
    }

    @Override
    public void create(AdminDto adminDto) {
        adminDao.create(adminDto);

    }

    @Override
    public void delete(AdminDto adminDto) {
        adminDao.delete(adminDto);

    }

    @Override
    public void update(AdminDto adminDto) {
        adminDao.update(adminDto);
    }

    @Override
    public ArrayList<AdminDto> list() {
        return adminDao.list();
    }
}
