package tech.thinkoutofthebox.course_web_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.thinkoutofthebox.course_web_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
