package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookService{}";
    }

    public void addBook(BookDto bookDto){
        books.add(bookDto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookService that = (BookService) o;
        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    public void remove(BookDto bookDto){
        books.remove(bookDto);
    }
}
