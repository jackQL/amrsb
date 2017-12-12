package org.jack.service;

import org.jack.dao.BookRepository;
import org.jack.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/12/11.
 */
@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;

    Book getBookById(Long id){
        return bookRepository.getById(2l);
    }
}
