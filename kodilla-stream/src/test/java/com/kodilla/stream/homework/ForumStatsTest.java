package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {




    public static List<User> getUsersList(){
        List<User> test = new ArrayList<>();
        test.add(new User("test", 42, 100, "test"));
        test.add(new User("test", 41, 0, "test"));
        test.add(new User("test", 40, 100, "test"));
        test.add(new User("test", 39, 200, "test"));
        test.add(new User("test", 38, 0, "test"));
        test.add(new User("test", 37, 200, "test"));
        return test;
    }



    @Test
    public  void avgOver40(){
        double avg = ForumStats.averageOfPostsOver40(ForumStatsTest.getUsersList());
        assertEquals(66.67,avg,1);
    }
    @Test
    public void avgUnder40() {
        double avg = ForumStats.averageOfPostsUnder40(ForumStatsTest.getUsersList());
        assertEquals(133.33,avg,1);
    }
}