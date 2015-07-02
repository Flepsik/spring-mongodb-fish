package com.springapp.mvc.services;

import com.springapp.mvc.model.Comment;
import com.springapp.mvc.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fleps_000 on 02.07.2015.
 */
@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;
    @Autowired
    SequenceService sequenceService;

    public Comment add(Comment comment) {
        comment.setId(sequenceService.getId());
        return commentRepository.save(comment);
    }

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }

    public Comment get(Long id) {
        return commentRepository.findOne(id);
    }

    public void remove(Long id) {
        commentRepository.delete(id);
    }
}
