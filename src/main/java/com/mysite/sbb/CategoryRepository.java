package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends
        JpaRepository<Category, Integer> {
}
