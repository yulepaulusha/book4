package com.yule.book.book.service;

import com.yule.book.book.model.Document;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
public interface DocumentService {
    Document save(Document document);
    List<Document> fetch();

}
