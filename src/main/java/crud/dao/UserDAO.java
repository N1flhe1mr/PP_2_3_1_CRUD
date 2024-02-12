package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    void update(User user);

    void deleteUserById(long id);

    User findUserById(long id);

    List<User> getUsers();
}
