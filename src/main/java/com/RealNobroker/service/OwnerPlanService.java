package com.RealNobroker.service;

import com.RealNobroker.entity.OwnerPlan;
import com.RealNobroker.payload.OwnerPlanDto;
import com.RealNobroker.repositery.OwnerPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public interface OwnerPlanService {
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

//    @Autowired
//    private OwnerPlanRepository ownerPlanRepository;

//    public OwnerPlan subscribeOwnerPlan(long userId, int duration) {
//        // Assuming you want to start the subscription immediately (current date)
//        LocalDate subscriptionActiveDate = LocalDate.now();
//
//        // Calculate the expiration date based on the provided duration
//        LocalDate subscriptionExpirationDate = subscriptionActiveDate.plusDays(duration);
//
//        // Create a new OwnerPlan
//        OwnerPlan newSubscription = new OwnerPlan();
//        newSubscription.setUserId(userId);
//        newSubscription.setSubscriptionActive(true);
//        newSubscription.setSubscriptionActiveDate(subscriptionActiveDate);
//        newSubscription.setSubscriptionExpirationDate(subscriptionExpirationDate);
//        newSubscription.setNumberOfDays(duration);
//
//        // Save the new owner plan to the repository
//        return ownerPlanRepository.save(newSubscription);
//    }
//
//    public OwnerPlan getOwnerPlan(long ownerPlanId) {
//        Optional<OwnerPlan> optionalOwnerPlan = ownerPlanRepository.findById(ownerPlanId);
//
//        // Return the owner plan if found, otherwise return null
//        return optionalOwnerPlan.orElse(null);
//    }
}
