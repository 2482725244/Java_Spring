package com.xing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xing.model.Movie;
import com.xing.model.User;

import java.util.List;

public interface MovieService {

     boolean updateMovie(Movie movie);
     List<Movie> selectAllMovie();
     boolean deleteMovieById(Long id);
     List<Movie> selectRealAllMovies();



}
