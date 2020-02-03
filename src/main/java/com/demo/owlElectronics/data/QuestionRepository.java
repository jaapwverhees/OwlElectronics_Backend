package com.demo.owlElectronics.data;

import com.demo.owlElectronics.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
}
