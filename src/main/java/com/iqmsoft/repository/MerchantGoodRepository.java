package com.iqmsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.model.MerchantGood;

@RepositoryRestResource
public interface MerchantGoodRepository extends CrudRepository<MerchantGood, Long> {

}
