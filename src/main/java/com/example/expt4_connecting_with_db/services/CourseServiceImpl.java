package com.example.expt4_connecting_with_db.services;

import com.example.expt4_connecting_with_db.entities.Course;
import com.example.expt4_connecting_with_db.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(String id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(String id, Course course) {
        course.setId(id);
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
