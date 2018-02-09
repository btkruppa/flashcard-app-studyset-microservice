package com.revature.app.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.app.user.repos.StudySetRepo;
import com.revature.entities.StudySet;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudySetController {

	@Autowired
	private StudySetRepo studySetRepo;

	@RequestMapping
	public List<StudySet> findAll() {
		List<StudySet> studySets = studySetRepo.findAll();
		return studySets;
	}

}
