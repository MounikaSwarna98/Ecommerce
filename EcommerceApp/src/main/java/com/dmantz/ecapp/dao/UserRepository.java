package com.dmantz.ecapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.ecapp.common.User;
import com.dmantz.ecapp.request.CreateSignUpRequestPO;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	

}
