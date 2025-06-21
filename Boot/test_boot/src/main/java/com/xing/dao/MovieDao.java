package com.xing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xing.model.Movie;
import com.xing.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieDao extends BaseMapper<Movie> {

    @Select("select * from movie")
    public List<Movie> selectRealAllMovies();
}
