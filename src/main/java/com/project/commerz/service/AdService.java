package com.project.commerz.service;

import com.project.commerz.model.Ad;
import com.project.commerz.model.Category;
import com.project.commerz.model.Location;

import java.util.List;
import java.util.Optional;

public interface AdService {
    List<Ad> findAllAds();

    List<Ad> searchAds(String fullTextSearch, Category category, Location location);

    Optional<Ad> findAdById(Long id);

    void deleteById(Long id);

    long numberOfAds();

    void save(String name, String description, Long categoryId, Long locationId, Long price, String phone, String email);
}
