package com.feetalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class TestDbController {

    private final DataSource dataSource;

    public TestDbController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/test-db")
    public String testDbConnection() {
        try (Connection conn = dataSource.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                return "数据库连接成功！🎉";
            } else {
                return "数据库连接失败...";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "数据库连接异常: " + e.getMessage();
        }
    }
}

