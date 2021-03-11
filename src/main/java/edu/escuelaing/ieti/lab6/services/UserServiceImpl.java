package edu.escuelaing.ieti.lab6.services;

import org.springframework.stereotype.Service;

import edu.escuelaing.ieti.lab6.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private User[] data = {new User(1, "andres", "andres@gmail.com", "sotelo"),new User(2, "orlando", "orlando@gmail.com", "sotelo"),new User(3, "sotelo", "sotelo@gmail.com", "sotelo")};
    private List<User> users = relleno();
    
    private List<User> relleno() {
        ArrayList<User> res= new ArrayList<>();
        for (int i=0; i<data.length;++i){
            res.add(data[i]);
        }
        return res;
    }

    @Override
    public List<User> getAll() {
        return users;
    }


    @Override
    public User getById(String userId)  {
        User res=null;
        for (int i=0; i<users.size();++i){
            if (users.get(i).getId()== Integer.parseInt(userId)){
                res=users.get(i);
            }
        }
    return res;
    }

    @Override
    public User create(User user) {
        users.add(user);
        user.setId(users.size());

        return user;
    }

    @Override
    public User update(User user)  {
        return user;
    }

    @Override
    public void remove(String userId) {

    }

}