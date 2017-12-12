package org.jack.dao;

import org.jack.model.Book;
import org.springframework.data.repository.Repository;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface BookRepository extends Repository<Book,Long> {
    Book getById(Long id);
}
