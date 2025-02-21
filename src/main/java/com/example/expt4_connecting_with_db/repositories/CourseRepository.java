package com.example.expt4_connecting_with_db.repositories;

import com.example.expt4_connecting_with_db.entities.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
}


//this line will provide built in methods like findAll(), findById() etc for mongodb thus there is no need to implement CRUD manually. Spring data mongodb which we added as dependency will automatically handle this