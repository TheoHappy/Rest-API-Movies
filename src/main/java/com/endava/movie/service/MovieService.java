package com.endava.movie.service;

import com.endava.movie.dao.MovieDao;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class MovieService {

    private final MovieDao movieDao;

}
