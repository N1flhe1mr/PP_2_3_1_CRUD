package crud.service;

import crud.model.User;

public interface UserService {
    void create(User user);

    void delete(User user);

    void update(User user);

    User findById(long id);
}
