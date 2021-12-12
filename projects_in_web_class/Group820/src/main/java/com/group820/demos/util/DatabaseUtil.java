package com.group820.demos.util;

import javax.annotation.Resource;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@WebListener
public class DatabaseUtil {
    @Resource(name = "jdbc/MySQL")
    private static DataSource dataSource;
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
