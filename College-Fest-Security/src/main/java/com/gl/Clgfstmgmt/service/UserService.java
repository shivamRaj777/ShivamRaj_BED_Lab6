package com.gl.Clgfstmgmt.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.Clgfstmgmt.dto.SignUpDto;
import com.gl.Clgfstmgmt.entity.User;

public interface UserService extends UserDetailsService {
	public User save(SignUpDto signUpDto);

}
