package com.example.topaz.adddeletedbjpaproj;


import org.springframework.data.repository.CrudRepository;

public interface CustomEntityRepository extends CrudRepository<CustomEntity, Long> {
}
