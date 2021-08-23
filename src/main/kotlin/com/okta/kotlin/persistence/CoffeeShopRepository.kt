package com.okta.kotlin.persistence

import com.okta.kotlin.model.CoffeeShopModel
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeShopRepository: CrudRepository<CoffeeShopModel, Long> {
}