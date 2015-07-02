package com.springapp.mvc.repository;

import com.springapp.mvc.model.Sequence;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Fleps_000 on 02.07.2015.
 */
public interface SequenceRepository extends MongoRepository<Sequence, Long> {
}
