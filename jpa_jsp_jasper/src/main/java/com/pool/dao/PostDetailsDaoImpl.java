package com.pool.dao;

import javax.persistence.EntityManager;

import com.pool.model.entityinheritance.PostDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDetailsDaoImpl implements PostDetailsDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePostDetail(PostDetails postDetail) {
		entityManager.persist(postDetail);

	}

}
