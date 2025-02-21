package com.example.expt4_connecting_with_db.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses_db")  // This makes it a MongoDB document
public class Course {
    @Id  // MongoDB uses this as the primary key
    private String id;
    private String title;
    private String description;

    public Course() {}

    public Course(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
