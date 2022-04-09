package com.kocirfan.ecolesson.db;

import lombok.Data;
import lombok.Getter;

/*** Database bilgilerimizi tutan sınıf*/

@Data
@Getter
public class DatabaseInformation {
    // objecet veriable

    private  String url;
    private  String user;
    private  String password;
    private  String forNameData;

    // parametresiz constructor
    public DatabaseInformation() {
        // Mysql
        this.user= "root";
        this.password = "irfnk.0909";
        this.url = "jdbc:mysql://localhost:3306/springboot";
        this.forNameData = "com.mysql.cj.jdbc.Driver";
    }

    // parametreli constructor


    public DatabaseInformation(String url, String user, String password, String forNameData) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.forNameData = forNameData;
    }
}
