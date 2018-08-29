package com.zdran.btmovie.provider.service.impl;

import com.github.pagehelper.Page;
import com.zdran.btmovie.provider.domain.MovieInfo;
import com.zdran.btmovie.provider.service.IMovieInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zdRan on 2018/8/11
 *
 * @author cm.zdran@gmail.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieInfoServiceImplTest {

    @Autowired
    private IMovieInfoService movieInfoService;

    @Test
    public void getMovieById() {
        MovieInfo movieInfo = movieInfoService.getMovieById("dy10053");
        System.out.println(movieInfo.toString());
    }

    @Test
    public void getMovieByPage() {
        Page<MovieInfo> movieInfo = movieInfoService.getMovieByPage(1, 10, "科幻");
        System.out.println(movieInfo.toString());
    }
}