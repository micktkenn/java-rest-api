package com.restapi.dynamiccontent.restapidynamiccontent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoPresenterController {

    @Autowired
    VideosRepositoryController videosRepositoryController;

    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos/{videoTopic}")
    public String GetVideos(@PathVariable String videoTopic) {
        switch (videoTopic) {
            case "python":
                return String.format("This is all our Python videos");
            case "java":
                return String.format("This is all our Java videos");
            default:
                return String.format("Sorry, Incorrect input");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/Getall")
    public List<Videos> GetAllVideos() {
        return videosRepositoryController.getAllUsers();
    }

}
