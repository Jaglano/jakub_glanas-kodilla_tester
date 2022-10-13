package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {



    @Test
    public  void testGetAverageNumberOfPostsForPeopleOlderOrEqualToFortyYearsOfAge(){
        double avg = ForumStats.averageOfPostsOver40(UsersRepository.getUsersList());
        assertEquals(2.25,avg,0.000001);
    }
    @Test
    public void testGetAverageNumberOfPostsForPeopleYoungerThanFortyYearsOfAge() {
        double avg = ForumStats.averageOfPostsUnder40(UsersRepository.getUsersList());
        assertEquals(2381,avg,0.0000001);
    }


}