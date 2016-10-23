package ru.javajava.services;

import ru.javajava.model.UserProfile;

/**
 * Created by ivan on 05.10.16.
 */
public interface AccountService {
    UserProfile addUser(String login, String password, String email);
    UserProfile getUserByLogin(String login);
    UserProfile getUserById(long id);
    int incrementVisits(long userId);
    int setRating(long userId, int rating);
    int incrementRating(long userId);
}
