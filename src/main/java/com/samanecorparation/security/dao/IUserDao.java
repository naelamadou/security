package com.samanecorparation.security.dao;

import java.util.Optional;

import com.samanecorparation.security.entity.UserEntity;

public interface IUserDao extends Repository<UserEntity> {

	public Optional<UserEntity> login(String email, String password);
}
