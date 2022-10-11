package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    public static List<String> filterAgeGroupUsers(int howOld){
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > howOld)
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<String> filterPostsNumber(int postsNumber){
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() <= postsNumber)
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
        return usernames;
    }

    @Test
    public void ageCheckOver48(){
      assertEquals(3, filterAgeGroupUsers(48).size());
    }

    @Test
    public void ageCheckOver57(){
        assertEquals(0, filterAgeGroupUsers(57).size());
    }

    @Test
    public void ageCheckOver18(){
        assertEquals(6, filterAgeGroupUsers(18).size());
    }


    // TESTY DO DRUGIEJ METODY
    @Test
    public void lessThanOrEqual100Posts(){
        assertEquals(4, filterPostsNumber(100).size());
    }

    @Test
    public void lessThanOrEqual1000Posts(){
        assertEquals(5, filterPostsNumber(1000).size());
    }

    @Test
    public void lessThanOrEqual10Posts(){
        assertEquals(4, filterPostsNumber(10).size());
    }
}