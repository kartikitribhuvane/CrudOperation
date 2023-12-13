package com.BikkadIt.SpringWebMVCCrudUsingDataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.SpringWebMVCCrudUsingDataJPA.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
