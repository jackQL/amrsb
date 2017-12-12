package org.jack.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/12/11.
 */
@Entity(name = "t_book")
public class Book {
    private Long id;
    private String name;
    private String author;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
