package com.yule.book.book.controller;

import com.yule.book.book.model.Card;
import com.yule.book.book.model.Document;
import com.yule.book.book.model.Page;
import com.yule.book.book.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
@RestController
@RequestMapping(value = "bookcloud")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/document", method = RequestMethod.POST)
    public Document save(@RequestBody Document document){

        return documentService.save(document);
    }

    @RequestMapping(value = "/document", method = RequestMethod.GET)
    public List<Document> fetch(){
        return documentService.fetch();
    }
}