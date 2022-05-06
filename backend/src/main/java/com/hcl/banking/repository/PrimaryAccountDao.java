package com.hcl.banking.repository;

import com.hcl.banking.entity.PrimaryAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "primaryAccounts", path = "primary-account")
public interface PrimaryAccountDao extends JpaRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}