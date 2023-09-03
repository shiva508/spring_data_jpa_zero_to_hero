package com.comrade.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.comrade.model.entityinheritance.Tag;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class TagDaoImpl implements TagDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void saveTag(Tag tag) {
		entityManager.persist(tag);
	}

	@Override
	public Tag getTag(String referencace) {
		Session session=entityManager.unwrap(Session.class);
		
		return session.bySimpleNaturalId(Tag.class).getReference(referencace);
	}

}
