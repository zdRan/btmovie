package com.zdran.btmovie.provider.mapper;

import com.zdran.btmovie.provider.domain.MovieInfo;
import com.zdran.btmovie.provider.domain.MovieInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieInfoMapper {
    long countByExample(MovieInfoExample example);

    int deleteByExample(MovieInfoExample example);

    int deleteByPrimaryKey(String movieId);

    int insert(MovieInfo record);

    int insertSelective(MovieInfo record);

    List<MovieInfo> selectByExample(MovieInfoExample example);

    MovieInfo selectByPrimaryKey(String movieId);

    int updateByExampleSelective(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByExample(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByPrimaryKeySelective(MovieInfo record);

    int updateByPrimaryKey(MovieInfo record);
}