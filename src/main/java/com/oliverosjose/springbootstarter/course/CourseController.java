package com.oliverosjose.springbootstarter.course;

import com.oliverosjose.springbootstarter.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by capitanjovi on 26/3/17.
 */
@RestController
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}courses/{id}", method = RequestMethod.PUT)
    public void updateCourse(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String topicId, @PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
