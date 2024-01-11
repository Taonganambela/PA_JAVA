package com.zmltd.pending.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zmltd.pending.entity.PhoneNumber;


@Repository


public interface NumberRepo extends JpaRepository<PhoneNumber, Integer> {}
