package org.dipayan.SpringStarter.repositories;


import java.util.Optional;

import org.dipayan.SpringStarter.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findOneByEmailIgnoreCase(String email);

    Optional<Account> findByToken(String token);

}