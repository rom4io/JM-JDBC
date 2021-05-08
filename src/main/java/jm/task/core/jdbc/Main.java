package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();

        for (int i = 0; i < 4; i++) {
            us.saveUser("Name" + (i + 1), "LastName" + i + 1, (byte) ((i + 1) * 10));
            System.out.println("User с именем – " + ("Name" + (i + 1)) + " добавлен в базу данных");
        }

        System.out.println(us.getAllUsers());

        us.cleanUsersTable();

        us.dropUsersTable();

    }
}
