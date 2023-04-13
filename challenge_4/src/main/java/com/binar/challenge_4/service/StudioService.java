package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Costumer;
import com.binar.challenge_4.models.Studio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudioService {
    Page<Studio> findAll(Pageable pageable);

    Studio findById(int id);

    Studio save(Studio studio);

    Studio update(Studio updatedStudio);

    void delete(int id);
}
