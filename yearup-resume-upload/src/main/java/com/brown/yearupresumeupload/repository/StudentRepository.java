package com.brown.yearupresumeupload.repository;

import com.brown.yearupresumeupload.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
