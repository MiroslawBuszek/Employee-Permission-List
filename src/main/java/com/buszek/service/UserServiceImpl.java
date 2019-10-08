package com.buszek.service;

import com.buszek.model.User;
import com.buszek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {
	private final UserRepository repository;

	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {   
    	User currUser = repository.findByUsername(username);
    	
        UserDetails user = new org.springframework.security.core.userdetails.User(username, currUser.getPasswordHash(), true,
        		true, true, true, AuthorityUtils.createAuthorityList(currUser.getRole()));
        
        System.out.println("ROLE: " + currUser.getRole());
        return user;
    }
    
}