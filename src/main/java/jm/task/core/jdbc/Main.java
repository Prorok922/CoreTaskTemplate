package jm.task.core.jdbc;



import com.mysql.fabric.jdbc.FabricMySQLDriver;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();
        userService.saveUser("Иван", "Петров", (byte) 15);
        userService.saveUser("Санек", "Козлов", (byte) 16);
        userService.saveUser("Ибрагим", "Бакров", (byte) 17);
        userService.saveUser("Костя", "Тарков", (byte) 18);

        userService.getAllUsers();

//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();

    }
}
