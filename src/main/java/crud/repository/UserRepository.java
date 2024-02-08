package crud.repository;

import crud.model.User;

public interface UserRepository {
    void create(User user);

    void delete(User user);

    void update(User user);

    User findById(long id);
}
