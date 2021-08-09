package com.example.counter;

import com.example.counter.models.CountResult;
import com.example.counter.models.RequestTexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private SearchTextService searchTextService;

    @PostMapping("/counter-api/search")
    public CountResult searchText(@RequestBody RequestTexts texts){
        return searchTextService.searchText(texts);
    }

    @GetMapping("/counter-api/top/{number}")
    public void countTopExportToCSV(@PathVariable int number, HttpServletResponse response) {
        searchTextService.countTop(number, response);
    }
}
