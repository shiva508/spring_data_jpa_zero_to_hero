package com.pool.dao;

import javax.persistence.EntityManager;

import com.pool.model.entityinheritance.PostComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostCommentDaoImpl implements PostCommentDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePostComment(PostComment postComment) {
		entityManager.persist(postComment);

	}

}
