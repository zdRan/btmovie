package com.zdran.btmovie.provider.service;

import com.github.pagehelper.Page;
import com.zdran.btmovie.provider.domain.MovieInfo;

/**
 * 电影信息服务
 * Created by zdRan on 2018/7/28
 *
 * @author cm.zdran@gmail.com
 */
public interface IMovieInfoService {
    /**
     * 根据 ID 获取电影信息
     *
     * @param id 电影id
     * @return
     */
    MovieInfo getMovieById(String id);

    /**
     * 按类型分页查询
     *
     * @param pageNum  页码
     * @param pageSize 页大小
     * @param type     类型
     * @return
     */
    Page<MovieInfo> getMovieByPage(int pageNum, int pageSize, String type);

}
