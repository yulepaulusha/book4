package com.yule.book.book.controller;

import com.yule.book.book.model.Card;
import com.yule.book.book.model.Document;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */

public class RequestWrapper {
    private List<Document> documents;

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
