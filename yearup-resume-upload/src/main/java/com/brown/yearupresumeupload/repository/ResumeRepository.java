package com.brown.yearupresumeupload.repository;

import com.brown.yearupresumeupload.model.Resume;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Long> {
}
