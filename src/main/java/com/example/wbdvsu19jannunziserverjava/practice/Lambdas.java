package com.example.wbdvsu19jannunziserverjava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface MyLambda {
    void myAbstractFunc(int x);
    default void myDefaultFunc(int x) {
        System.out.println(x);
    }
}

interface MyLambda2 {
    String myAbstractFunc(String x);
    default String myDefaultFunc(String x) {
        return x + " Default";
    }
}

interface MyUserLambda {
    void myAbstractUserFunc(User u);
}

class User {
    String username;
    String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String toString() {
        return username + " " + password;
    }
}


public class Lambdas {

    public static void main(String[] args) {
        System.out.println("Hello Lambdas");

//        MyLambda lambda1;
//        lambda1.myDefaultFunc(10);

        MyLambda lambda2 = (int y) -> System.out.println(y);
        lambda2.myAbstractFunc(5);

        List<String> stringList = new ArrayList<String>();
        String[] strings = {"String 1", "String 2", "String 3"};
        stringList = Arrays.asList(strings);
        for(String string: stringList) {
            System.out.println(string);
        }
        stringList.forEach(
            string -> System.out.println(string)
        );

//        MyLambda2 l2 = s -> s + " New";
//        stringList.forEach(l2);

        User[] userArray = {
            new User("alice", "alice"),
            new User("bob", "bob")
        };

        List<User> userList = Arrays.asList(userArray);

        userList.forEach(user ->
            System.out.println(user)
        );

        for(User user: userArray) {
            System.out.println(user);
        }

        for(User user: userList) {
            System.out.println(user);
        }

        MyUserLambda userLambda = (User u) -> System.out.println(u);

    }
}
