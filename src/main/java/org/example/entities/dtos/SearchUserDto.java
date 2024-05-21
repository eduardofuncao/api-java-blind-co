package org.example.entities.dtos;

import org.example.entities.User;

import java.util.List;

public record SearchUserDto(int totalItems, List<User> users){

}