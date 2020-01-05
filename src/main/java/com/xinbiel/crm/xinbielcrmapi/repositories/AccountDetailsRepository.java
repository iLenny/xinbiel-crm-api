package com.xinbiel.crm.xinbielcrmapi.repositories;

import com.xinbiel.crm.xinbielcrmapi.entities.AccountDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsRepository extends CrudRepository<AccountDetails, Integer> {
}
