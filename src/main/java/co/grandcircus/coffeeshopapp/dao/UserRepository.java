package co.grandcircus.coffeeshopapp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.coffeeshopapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmailaddress(String emailaddress);
}
