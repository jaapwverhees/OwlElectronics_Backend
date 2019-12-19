package com.demo.owlElectronics.data;

import com.demo.owlElectronics.model.Form;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//TODO implement DAO?
@Repository //TODO check if correct use and location of annotation Repository
public interface FormRepository extends CrudRepository<Form, Integer> {
}
