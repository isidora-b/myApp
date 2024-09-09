package com.example.myApp.comment;

import com.example.myApp.book.BookModel;
import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class CommentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private BookModel book;
}
