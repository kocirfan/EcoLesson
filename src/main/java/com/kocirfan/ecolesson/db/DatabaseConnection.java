package com.kocirfan.ecolesson.db;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;

// Database bağlanma işlemlerimin informasyonu extendi ile yönetildiği sınıf.

@Log4j2
public class DatabaseConnection  extends DatabaseInformation{

    // database bağlanmak için konfigurasyon
    private String url = super.getUrl();
    private String user = super.getUser();
    private String password = super.getPassword();
    private String forNameData = super.getForNameData();

    //database-Java bağlantı
    private java.sql.Connection connection;

    //singleton design yapısı
    private static DatabaseConnection instance;

    //parametresiz constructor
    //private parametresiz constructor=instance oluşturulmaz
    private DatabaseConnection(){
        try{
            Class.forName(this.forNameData);
            log.info("Driver yüklendi");
            this.connection = DriverManager.getConnection(url, user, password);
            log.info("Bağlantı başarılı");
        }catch (Exception exception){
            log.error("!! Bağlantı kurulamadı");
            exception.printStackTrace();
        }
    }

    public static  DatabaseConnection getInstance(){
        try{
            if(instance == null || instance.connection.isClosed()){
                instance = new DatabaseConnection();
            }

        }catch (SQLDataException sql){
            log.error("Database Connection failed!!");
            sql.printStackTrace();
        }catch (Exception ex){
            log.error("Database Connection failed!!");
            ex.printStackTrace();
        }
        return instance;
    }

    //connection get-set
    public Connection getConnection(){
        return connection;
    }

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
    }

}
