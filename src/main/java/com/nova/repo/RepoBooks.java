package com.nova.repo;

import com.nova.models.Books;
import com.nova.models.enums.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoBooks extends JpaRepository<Books, Long> {
    List<Books> findAllByGenre(Genre genre);
    List<Books> findAllByYear(int year);
    List<Books> findAllByUserid(long userid);
}
