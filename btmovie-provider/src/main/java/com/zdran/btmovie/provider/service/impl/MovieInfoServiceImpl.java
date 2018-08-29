package com.zdran.btmovie.provider.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zdran.btmovie.provider.domain.MovieInfo;
import com.zdran.btmovie.provider.domain.MovieInfoExample;
import com.zdran.btmovie.provider.mapper.MovieInfoMapper;
import com.zdran.btmovie.provider.service.IMovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zdRan on 2018/7/28
 *
 * @author cm.zdran@gmail.com
 */
@Service
public class MovieInfoServiceImpl implements IMovieInfoService {
    @Autowired
    private MovieInfoMapper movieInfoMapper;

    @Override
    public MovieInfo getMovieById(String id) {
        return movieInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Page<MovieInfo> getMovieByPage(int pageNum, int pageSize, String type) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPage(() -> {
            MovieInfoExample example = new MovieInfoExample();
            example.or().andMovieTypeLike("%" + type + "%");
            movieInfoMapper.selectByExample(example);
        });
    }


}
