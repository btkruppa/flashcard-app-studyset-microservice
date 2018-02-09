package com.revature.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CategoryJunction implements Serializable {
	@Id
	private int category_id;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	private StudySet studySet;

	public CategoryJunction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryJunction(int category_id, StudySet studySet) {
		super();
		this.category_id = category_id;
		this.studySet = studySet;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public StudySet getStudySet() {
		return studySet;
	}

	public void setStudySet(StudySet studySet) {
		this.studySet = studySet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category_id;
		result = prime * result + ((studySet == null) ? 0 : studySet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryJunction other = (CategoryJunction) obj;
		if (category_id != other.category_id)
			return false;
		if (studySet == null) {
			if (other.studySet != null)
				return false;
		} else if (!studySet.equals(other.studySet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CategoryJunction [category_id=" + category_id + ", studySet=" + studySet + "]";
	}

}
