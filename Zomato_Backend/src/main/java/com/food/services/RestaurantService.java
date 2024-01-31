package com.food.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Restaurant;
import com.food.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    // CRUD methods
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurantDetails) {
        return restaurantRepository.findById(id)
            .map(restaurant -> {
                // Updating all fields
                restaurant.setRestaurantName(restaurantDetails.getRestaurantName());
                restaurant.setContactNumber(restaurantDetails.getContactNumber());
                restaurant.setAddress(restaurantDetails.getAddress());
                restaurant.setLatitude(restaurantDetails.getLatitude());
                restaurant.setLongitude(restaurantDetails.getLongitude());
                restaurant.setEmail(restaurantDetails.getEmail());
                restaurant.setContactPerson(restaurantDetails.getContactPerson());
                restaurant.setOpeningTime(restaurantDetails.getOpeningTime());
                restaurant.setClosingTime(restaurantDetails.getClosingTime());
                restaurant.setCurrentStatus(restaurantDetails.getCurrentStatus());
                restaurant.setActive(restaurantDetails.getActive());
                restaurant.setOtp(restaurantDetails.getOtp());
                restaurant.setLogo(restaurantDetails.getLogo());
                restaurant.setCity(restaurantDetails.getCity());
                restaurant.setState(restaurantDetails.getState());
                restaurant.setPincode(restaurantDetails.getPincode());
                restaurant.setType(restaurantDetails.getType());
                restaurant.setCuision(restaurantDetails.getCuision());
                restaurant.setDescription(restaurantDetails.getDescription());
                return restaurantRepository.save(restaurant);
            })
            .orElseGet(() -> {
                restaurantDetails.setRestaurantId(id);
                return restaurantRepository.save(restaurantDetails);
            });
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}
