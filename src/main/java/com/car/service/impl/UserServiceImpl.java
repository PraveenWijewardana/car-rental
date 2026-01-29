package com.car.service.impl;

import com.car.dto.UsersDto;
import com.car.entity.UsersEntity;
import com.car.repoistory.UserRepository;
import com.car.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void add(UsersDto usersDto) {
        repository.save(mapper.map(usersDto, UsersEntity.class));
    }

    @Override
    public void update(UsersDto usersDto) {
        repository.save(mapper.map(usersDto, UsersEntity.class));
    }

    @Override
    public Boolean login(String un, String pwd) {
        return true;
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public UsersDto findById(String id) {
        return mapper.map(repository.findById(id),UsersDto.class);
    }

    @Override
    public UsersDto findByName(String name) {
        return mapper.map(repository.findByfullName(name),UsersDto.class);
    }

    @Override
    public List<UsersDto> getAll() {
        List<UsersEntity> usersEntities = repository.findAll();
        List<UsersDto> usersDtos = new ArrayList<>();
        usersEntities.forEach(usersEntity -> {
            usersDtos.add(mapper.map(usersEntity,UsersDto.class));
        });
        return usersDtos;
    }

    @Override
    public List<UsersDto> findAllByName(String name) {
        List<UsersEntity> usersEntities = repository.findAll();
        List<UsersDto> usersDtos = new ArrayList<>();
        usersEntities.forEach(usersEntity -> {
            usersDtos.add(mapper.map(usersEntity,UsersDto.class));
        });
        return usersDtos;
    }

    @Override
    public List<UsersDto> findAllByRole(String role) {
        List<UsersEntity> usersEntities = repository.findAll();
        List<UsersDto> usersDtos = new ArrayList<>();
        usersEntities.forEach(usersEntity -> {
            usersDtos.add(mapper.map(usersEntity,UsersDto.class));
        });
        return usersDtos;
    }
}
