package sai.service.springbootsecurityjpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sai.service.springbootsecurityjpa.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);
}
