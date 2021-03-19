package com.esprit.project.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.esprit.project.entity.KinderGarden;





@Repository
public interface KinderGardenRepository extends CrudRepository<KinderGarden, Long> {
	
}
