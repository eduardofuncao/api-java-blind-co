package org.example.services;

import org.example.entities.User;
import org.example.entities.dtos.SearchUserDto;
import org.example.repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(){
        userRepository = new UserRepository();
    }

    public SearchUserDto getAll(String nome,
                                   String orderBy, String direction, int limit, int offset){
        var users = userRepository.getAll();
        var totalItems = userRepository.count(nome);
        return new SearchUserDto(totalItems, users);
    }

    public void create(User user){
        var validation = user.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            userRepository.create(user);
    }

    public void update(int id, User user){
        var validation = user.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            userRepository.update(id, user);
    }

    public void delete(int id){
        userRepository.delete(id);
    }


}