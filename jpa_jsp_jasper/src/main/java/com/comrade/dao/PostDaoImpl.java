package com.comrade.dao;

import javax.persistence.EntityManager;

import com.comrade.model.entityinheritance.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDaoImpl implements PostDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePost(Post post) {
		entityManager.persist(post);

	}

}
