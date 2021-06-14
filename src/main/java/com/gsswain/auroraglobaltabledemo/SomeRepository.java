package com.gsswain.auroraglobaltabledemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SomeRepository extends JpaRepository<SomeModel, String> {
}
