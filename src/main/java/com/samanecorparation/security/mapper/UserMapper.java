package com.samanecorparation.security.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.samanecorparation.security.dao.UserDao;
import com.samanecorparation.security.dto.UserDto;
import com.samanecorparation.security.entity.UserEntity;

public class UserMapper {
	
	public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users){
		
		return users.stream()
				.map(user -> 
toUserDto(user))
				.collect(Collectors.toList());
	}
	
	private static UserDto toUserDto(UserEntity user) {
		
		return new UserDto(user.getId(), user.getFirstName(),user.getLastName(),user.getEmail());
	}

}
