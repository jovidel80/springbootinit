package com.oliverosjose.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by capitanjovi on 26/3/17.
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    List<Course> findByTopicId(String topicId);
}
