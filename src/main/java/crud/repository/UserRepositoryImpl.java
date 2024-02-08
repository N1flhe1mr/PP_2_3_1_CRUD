package crud.repository;

import crud.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void create(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findById(long id) {
        return null;
    }
}
