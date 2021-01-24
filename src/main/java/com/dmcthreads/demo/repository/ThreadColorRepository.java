package com.dmcthreads.demo.repository;

import com.dmcthreads.demo.model.ThreadColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadColorRepository extends JpaRepository<ThreadColor, Integer> {

}
