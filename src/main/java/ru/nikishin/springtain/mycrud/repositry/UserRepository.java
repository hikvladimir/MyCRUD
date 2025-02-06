package ru.nikishin.springtain.mycrud.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikishin.springtain.mycrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
