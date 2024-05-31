package com.RealNobroker.repositery;
import com.RealNobroker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositery  extends JpaRepository<User,Long> {
}