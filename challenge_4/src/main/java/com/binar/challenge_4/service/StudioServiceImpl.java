package com.binar.challenge_4.service;

import com.binar.challenge_4.models.Studio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudioServiceImpl implements StudioService{
    @Override
    public Page<Studio> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Studio findById(int id) {
        return null;
    }

    @Override
    public Studio save(Studio studio) {
        return null;
    }

    @Override
    public Studio update(Studio updatedStudio) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
