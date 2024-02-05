package com.blog.maccodes.repository;


import com.blog.maccodes.model.Admin;
import com.blog.maccodes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
