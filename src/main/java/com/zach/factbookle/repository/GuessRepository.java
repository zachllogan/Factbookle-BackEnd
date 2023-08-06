package com.zach.factbookle.repository;

import com.zach.factbookle.entity.Guess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuessRepository extends JpaRepository<Guess, Integer> {
}
