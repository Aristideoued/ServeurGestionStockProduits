
package com.example.demo.config.initData;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;

@Component
@Order(2)
public class InitUsers implements ApplicationRunner {
	
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	
	public InitUsers(UserRepository userRepository,RoleRepository roleRepository){
		this.userRepository=userRepository;
		this.roleRepository=roleRepository;}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("init users....");
		
		
	   
	   
	   
	    
	   
	    
	    Role roleUser=roleRepository.findByName(RoleEnum.ROLE_USER.getName());
	    Role roleAdmin=roleRepository.findByName(RoleEnum.ROLE_ADMIN.getName());
	    
	    User user=new User("user","password1",true);
	    user.setRoles(Arrays.asList(roleUser));
	    
	    userRepository.save(user);
	    
	    User admin=new User("admin","password2",true);
	    admin.setRoles(Arrays.asList(roleUser,roleAdmin));
	    
	    userRepository.save(admin);
		}

	


}
