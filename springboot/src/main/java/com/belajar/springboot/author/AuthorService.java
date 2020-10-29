package com.belajar.springboot.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author create(Author author){
        return this.authorRepository.save(author);
    }
}
