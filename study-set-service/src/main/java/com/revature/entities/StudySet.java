package com.revature.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudySet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private int ownerId;

	@Column(nullable = false)
	private boolean isPublic;

	@OneToMany(mappedBy = "studySet")
	private List<CategoryJunction> categoryIds;

	public StudySet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudySet(int id, int ownerId, boolean isPublic, List<CategoryJunction> categoryIds) {
		super();
		this.id = id;
		this.ownerId = ownerId;
		this.isPublic = isPublic;
		this.categoryIds = categoryIds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public List<CategoryJunction> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<CategoryJunction> categoryIds) {
		this.categoryIds = categoryIds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryIds == null) ? 0 : categoryIds.hashCode());
		result = prime * result + id;
		result = prime * result + (isPublic ? 1231 : 1237);
		result = prime * result + ownerId;
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
		StudySet other = (StudySet) obj;
		if (categoryIds == null) {
			if (other.categoryIds != null)
				return false;
		} else if (!categoryIds.equals(other.categoryIds))
			return false;
		if (id != other.id)
			return false;
		if (isPublic != other.isPublic)
			return false;
		if (ownerId != other.ownerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudySet [id=" + id + ", ownerId=" + ownerId + ", isPublic=" + isPublic + ", categoryIds=" + categoryIds
				+ "]";
	}

}
