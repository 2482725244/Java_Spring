package com.xing.controller;

import com.xing.model.Movie;
import com.xing.model.User;
import com.xing.service.MovieService;
import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PutMapping
    public String updateMovie(@RequestBody Movie movie){
        boolean b = movieService.updateMovie(movie);
        return b?"修改成功":"修改失败";
    }

    @PutMapping("/more")
    public String updateMovieLock(){
        List<Movie> movies1 = movieService.selectAllMovie();
        Movie movie1 = movies1.get(0);
        List<Movie> movies2 = movieService.selectAllMovie();
        Movie movie2 = movies2.get(0);

//        movie1.setCount(movie1.getCount()-1);
//        movie2.setCount(movie2.getCount()-1);

//        movie1.setMoviename("666666");
//        movie2.setMoviename("888888");

        boolean b1 = movieService.updateMovie(movie1);
        boolean b2 = movieService.updateMovie(movie2);

        return b1&b2?"修改成功":"修改失败";
    }

    @GetMapping
    public List<Movie> selectAllMovie(){
        List<Movie> movies = movieService.selectAllMovie();
        return movies;
    }

    @GetMapping("/real")
    public List<Movie> selectRealAllMovie(){
        List<Movie> movies = movieService.selectRealAllMovies();
        return movies;
    }
    @DeleteMapping("/{id}")
    public String deleteMovieById(@PathVariable Long id){
        boolean b = movieService.deleteMovieById(id);
        return b?"删除成功":"删除失败";
    }

}
