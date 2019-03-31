package com.mydrive.products.repositories;

import com.mydrive.products.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductsRepository extends PagingAndSortingRepository<Product, UUID> {
}
