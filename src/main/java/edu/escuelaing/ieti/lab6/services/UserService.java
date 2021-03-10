package edu.escuelaing.ieti.lab6.services;

import java.util.List;

import edu.escuelaing.ieti.lab6.model.User;

public interface UserService {
    
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}
