package com.example.expt4_connecting_with_db.controllers;

import com.example.expt4_connecting_with_db.entities.Course;
import com.example.expt4_connecting_with_db.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable String id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable String id) {
    Optional<Course> course = courseService.getCourseById(id);

    if (course.isPresent()) {
        courseService.deleteCourse(id);
        return ResponseEntity.ok("Course with ID " + id + " deleted successfully!");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Course with ID " + id + " not found!");
    }
}

    
}
