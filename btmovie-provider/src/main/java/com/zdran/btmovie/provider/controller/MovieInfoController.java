package com.zdran.btmovie.provider.controller;

import com.zdran.btmovie.provider.domain.MovieInfo;
import com.zdran.btmovie.provider.service.IMovieInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zdRan on 2018/7/28
 *
 * @author cm.zdran@gmail.com
 */
@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {
    @Autowired
    private IMovieInfoService movieInfoService;

    private Logger logger = LoggerFactory.getLogger(MovieInfoController.class);

    @GetMapping("/queryById/{id}")
    public MovieInfo queryById(@PathVariable(value = "id")String id){
        logger.info("根据id获取电影信息，入参。id：{}",id);
        MovieInfo movieInfo = movieInfoService.getMovieById(id);
        logger.info("根据Id获取电影信息。出参：{}",movieInfo.toString());
        return movieInfo;
    }
}
