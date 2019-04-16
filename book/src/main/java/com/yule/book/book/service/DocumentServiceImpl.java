package com.yule.book.book.service;

import com.yule.book.book.model.*;
import com.yule.book.book.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Document save(Document document) {
        for(Card card: document.getCards()){
            card.setDocument(document);

            for(Page page: card.getPages()){
                page.setCard(card);

                for(Section section: page.getSections()){
                    section.setPage(page);

                    for(Paragraph paragraph: section.getParagraphs()){
                        paragraph.setSection(section);
                    }
                }
            }

        }

        return documentRepository.save(document);
    }

    @Override
    public List<Document> fetch() {
        return documentRepository.findAll();
    }
}
