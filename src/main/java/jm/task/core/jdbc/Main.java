package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Name 1", "Surname 1", (byte) 20);
        userService.saveUser("Name 2", "Surname 2", (byte) 21);
        userService.saveUser("Name 3", "Surname 3", (byte) 22);
        userService.saveUser("Name 4", "Surname 4", (byte) 23);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
