package com.kodilla.stream.homework;
import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {



    public static double averageOfPostsOver40(List<User> userList) {
        return userList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static double averageOfPostsUnder40(List<User> usersList) {
        return usersList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        ForumStats.averageOfPostsUnder40(UsersRepository.getUsersList());
    }
}