package com.factoria.springbootproject.repositories;

import com.factoria.springbootproject.models.TextMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextMachineRepository extends JpaRepository<TextMachine, Long> {
}
