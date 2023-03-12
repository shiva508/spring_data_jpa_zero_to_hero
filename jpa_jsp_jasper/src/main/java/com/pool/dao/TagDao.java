package com.pool.dao;


import com.pool.model.entityinheritance.Tag;

public interface TagDao {
public void saveTag(Tag tag);
public Tag getTag(String referencace);
}
