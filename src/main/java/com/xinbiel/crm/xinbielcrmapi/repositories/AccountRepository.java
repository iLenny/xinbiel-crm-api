package com.xinbiel.crm.xinbielcrmapi.repositories;

import com.xinbiel.crm.xinbielcrmapi.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
    public Account findById(int id);
    public Account findByEmail(String email);

}
