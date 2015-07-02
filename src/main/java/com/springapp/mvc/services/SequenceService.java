package com.springapp.mvc.services;

import com.springapp.mvc.model.Sequence;
import com.springapp.mvc.repository.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Fleps_000 on 02.07.2015.
 */

@Service
public class SequenceService {

    @Autowired
    SequenceRepository sequenceRepository;

    public long getId(){
        Sequence sequence = sequenceRepository.findAll().get(0);
        sequence.setSequence(sequence.getSequence()+1);
        sequenceRepository.save(sequence);
        return sequence.getSequence();
    }

}
