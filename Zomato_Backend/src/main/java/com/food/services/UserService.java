package com.food.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.User;
import com.food.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // CRUD operations
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(int id, User userDetails) {
        return userRepository.findById(id)
            .map(user -> {
                user.setFirstName(userDetails.getFirstName());
                user.setLastName(userDetails.getLastName());
                user.setContact(userDetails.getContact());
                user.setAlternateContact(userDetails.getAlternateContact());
                user.setEmail(userDetails.getEmail());
                user.setAddressType(userDetails.getAddressType());
                user.setAddress(userDetails.getAddress());
                user.setCity(userDetails.getCity());
                user.setLatitude(userDetails.getLatitude());
                user.setLongitude(userDetails.getLongitude());
                user.setPincode(userDetails.getPincode());
                user.setOtp(userDetails.getOtp());
                user.setActive(userDetails.getActive());
                return userRepository.save(user);
            }).orElseGet(() -> {
                userDetails.setId(id);
                return userRepository.save(userDetails);
            });
    }
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
