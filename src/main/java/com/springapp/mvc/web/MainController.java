package com.springapp.mvc.web;


import com.springapp.mvc.model.Comment;
import com.springapp.mvc.services.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource
    private CommentService commentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("all");
        modelAndView.addObject("comments", commentService.getAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showAddForm() {
        return new ModelAndView("add_form", "comment", new Comment());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addComment(@ModelAttribute("comment") Comment comment) {
        commentService.add(comment);
        return "redirect:/";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteComment(@RequestParam(required = true) Long id) {
        commentService.remove(id);
        return "redirect:/";
    }
}
