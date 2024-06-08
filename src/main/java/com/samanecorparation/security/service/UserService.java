package com.samanecorparation.security.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public boolean save(UserDto userDto) {
		return userDao.save(UserMapper.ToUserEntity(userDto));
		
	}

	@Override
	public Optional<UserDto> login(String email, String password) {
		Optional<UserEntity> userEntity = userDao.login(email, password);
		if (userEntity.isPresent()) {
			UserEntity user = userEntity.get();
			return Optional.of(UserMapper.toUserDto(user));
			
		}else {
			return Optional.empty();
		
		}
		
	}

}
