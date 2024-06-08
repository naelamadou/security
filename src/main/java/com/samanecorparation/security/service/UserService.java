package com.samanecorparation.security.service;

import java.util.List;

import com.samanecorparation.security.dao.IUserDao;
import com.samanecorparation.security.dao.UserDao;
import com.samanecorparation.security.dto.UserDto;
import com.samanecorparation.security.entity.UserEntity;
import com.samanecorparation.security.mapper.UserMapper;

public class UserService implements IUserService {
	
	private IUserDao userDao = new UserDao();
	
	@Override
	public List<UserDto> getAll() {
		
		return UserMapper.listUserEntityToListUserDto(userDao.list(new UserEntity()));
	}

}
