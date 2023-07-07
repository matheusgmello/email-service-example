package com.matheusgmello.userservice.repository;

import com.matheusgmello.userservice.domain.Confirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
   Confirmation findByToken(String token);
}