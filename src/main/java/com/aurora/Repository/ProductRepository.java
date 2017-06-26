package com.aurora.Repository;

import com.aurora.Domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by aurorabanuelos on 6/20/17.
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
