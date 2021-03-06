package com.zdran.btmovie.provider.mapper;

import com.zdran.btmovie.provider.domain.MovieType;
import com.zdran.btmovie.provider.domain.MovieTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieTypeMapper {
    long countByExample(MovieTypeExample example);

    int deleteByExample(MovieTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(MovieType record);

    int insertSelective(MovieType record);

    List<MovieType> selectByExample(MovieTypeExample example);

    MovieType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") MovieType record, @Param("example") MovieTypeExample example);

    int updateByExample(@Param("record") MovieType record, @Param("example") MovieTypeExample example);

    int updateByPrimaryKeySelective(MovieType record);

    int updateByPrimaryKey(MovieType record);
}