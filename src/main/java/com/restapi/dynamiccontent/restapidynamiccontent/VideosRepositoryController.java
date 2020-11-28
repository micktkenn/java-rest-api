package com.restapi.dynamiccontent.restapidynamiccontent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideosRepositoryController {

    @Autowired
    private VideosRepository videosRepository;

    public List<Videos> getAllUsers() {
        return videosRepository.findAll();
    }
}
