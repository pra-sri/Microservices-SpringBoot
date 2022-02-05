package com.CourseCatalogue;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CatalogController {

    @Autowired
    private EurekaClient client;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "displayDefaultHomepage")
    public String getCatalogHome() {
        String courseAppMesage = "";
        //String courseAppURL = "http://localhost:8080/";
        RestTemplate restTemplate = new RestTemplate();
        InstanceInfo instanceInfo = client.getNextServerFromEureka("course-server",false);
        String courseAppURL = instanceInfo.getHomePageUrl();
        courseAppMesage = restTemplate.getForObject(courseAppURL,String.class);

        return("Welcome to FutureX Course Catalog "+courseAppMesage);
    }
    
    public String displayDefaultHomepage() {
    	return "Welcome to Course Catalogue :) \n" + "\t \t \t Please try after sometime."; 
    }

    @RequestMapping("/catalog")
    public String getCatalog() {
        String courses = "";
        //String courseAppURL = "http://localhost:8080/courses";
        InstanceInfo instanceInfo = client.getNextServerFromEureka("course-server",false);
        String courseAppURL = instanceInfo.getHomePageUrl();
        courseAppURL = courseAppURL+"/courses";
        RestTemplate restTemplate = new RestTemplate();
        courses = restTemplate.getForObject(courseAppURL,String.class);

        return("Our courses are "+courses);
    }

    @RequestMapping("/firstcourse")
    public String getSpecificCourse() {
        Course course = new Course();
        //String courseAppURL = "http://localhost:8080/1";
        InstanceInfo instanceInfo = client.getNextServerFromEureka("course-server",false);
        String courseAppURL = instanceInfo.getHomePageUrl();
        courseAppURL = courseAppURL+"/id/100";
        RestTemplate restTemplate = new RestTemplate();
        course = restTemplate.getForObject(courseAppURL,Course.class);
        

        User user = new User();
        instanceInfo = client.getNextServerFromEureka("user-service",false);
        String userAppURL = instanceInfo.getHomePageUrl();
        userAppURL = userAppURL + "/course/" + course.getCourseId() ;
        String userList = restTemplate.getForObject(userAppURL, String.class);
        

        return("Our first course is : \t"+course.getCourseName() + "\n User Enrolled are : \n" + userList);
    }

}
