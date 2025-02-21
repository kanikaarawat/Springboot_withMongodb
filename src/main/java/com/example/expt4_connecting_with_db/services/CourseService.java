package com.example.expt4_connecting_with_db.services;

import com.example.expt4_connecting_with_db.entities.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(String id);
    Course addCourse(Course course);
    Course updateCourse(String id, Course course);
    void deleteCourse(String id);
}
