package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.digital.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
