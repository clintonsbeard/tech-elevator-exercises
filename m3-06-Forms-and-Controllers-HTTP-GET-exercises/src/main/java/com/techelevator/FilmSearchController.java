package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/filmSearch")
    public String showFilmSearchForm() {
        return "filmList";
    }
    
    @RequestMapping("/filmResults")
    public String searchFilms(HttpServletRequest request) {
    	
        String genreSearch = request.getParameter("genres");
        int minimumLengthSearch = Integer.parseInt(request.getParameter("minimumLengthSearch"));
		int maximumLengthSearch = Integer.parseInt(request.getParameter("maximumLengthSearch"));
        
        List<Film> films = filmDao.getFilmsBetween(genreSearch, minimumLengthSearch, maximumLengthSearch);
        
        request.setAttribute("films", films);
        
        return "filmList";
    }
    
}