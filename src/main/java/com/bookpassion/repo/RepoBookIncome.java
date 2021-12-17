package com.bookpassion.repo;

import com.bookpassion.models.BookIncome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoBookIncome extends JpaRepository<BookIncome, Long> {
    BookIncome findByBookid(long id);

    BookIncome findByUserid(long id);

    List<BookIncome> findAllByUserid(long id);
}
