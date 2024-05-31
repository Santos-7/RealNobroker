package com.RealNobroker.repositery;

import com.RealNobroker.entity.OwnerPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OwnerPlanRepository extends JpaRepository<OwnerPlan, Long> {
//    List<OwnerPlan> findBySubscriptionActive(boolean subscriptionActive);
//    List<OwnerPlan> findBySubscriptionExpirationDateBefore(LocalDate date);
//    List<OwnerPlan> findBySubscriptionActiveTrueAndNumberOfDaysGreaterThan(int numberOfDays);
//    List<OwnerPlan> findBySubscriptionActiveTrueAndSubscriptionExpirationDateBefore(LocalDate date);



}
