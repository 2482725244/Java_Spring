package com.xing.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xing.constant.Code;
import com.xing.dao.MovieDao;
import com.xing.dao.UserDao;
import com.xing.exception.BusinessException;
import com.xing.model.Movie;
import com.xing.model.User;
import com.xing.service.MovieService;
import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public boolean updateMovie(Movie movie) {
        int count = movieDao.updateById(movie);
        return count > 0 ?true:false;
    }

    @Override
    public List<Movie> selectAllMovie() {

        List<Movie> movies = movieDao.selectList(null);
        return movies;
    }

    @Override
    public boolean deleteMovieById(Long id) {
        int i = movieDao.deleteById(id);
        return i>0?true:false;
    }

    @Override
    public List<Movie> selectRealAllMovies() {
        List<Movie> movies = movieDao.selectRealAllMovies();
        return movies;
    }

}
