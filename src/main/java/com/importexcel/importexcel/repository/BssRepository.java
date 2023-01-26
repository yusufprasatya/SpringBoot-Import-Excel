package com.importexcel.importexcel.repository;

import com.importexcel.importexcel.entity.Bss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BssRepository extends JpaRepository<Bss, UUID> {
}
