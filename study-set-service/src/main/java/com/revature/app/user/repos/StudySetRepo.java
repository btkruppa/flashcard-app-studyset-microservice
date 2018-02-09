package com.revature.app.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.StudySet;

@Repository
public interface StudySetRepo extends JpaRepository<StudySet, Integer> {

}
