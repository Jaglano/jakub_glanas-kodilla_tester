package com.kodilla.stream.homework;
import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {



    public static double averageOfPostsOver40(List<User> userList) {
        double average = userList
                .stream()
                .filter(a -> a.getAge() >= 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }

    public static double averageOfPostsUnder40(List<User> usersList) {
        double average = usersList
                .stream()
                .filter(a -> a.getAge() < 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }

    public static void main(String[] args) {
        ForumStats.averageOfPostsUnder40(UsersRepository.getUsersList());
    }
}