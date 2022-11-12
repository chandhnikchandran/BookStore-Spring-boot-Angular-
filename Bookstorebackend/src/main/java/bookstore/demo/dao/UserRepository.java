package bookstore.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.demo.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
