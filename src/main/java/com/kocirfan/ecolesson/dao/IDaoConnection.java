package com.kocirfan.ecolesson.dao;

import com.kocirfan.ecolesson.db.DatabaseConnection;

import java.sql.Connection;

/// databse üzerinde yapılcak işlerimin neler olduğunu belirleyen interface

public interface IDaoConnection<T> {

    // CRUD işlemlerim
    public void create(T t);
    public  void delete(T t);
    public  void update(T t);
    public java.util.ArrayList<T> list();

    default Connection getInterfaceConnection(){
        return DatabaseConnection.getInstance().getConnection();
    }
}
