package com.comrade.dao;


import com.comrade.model.entityinheritance.Tag;

public interface TagDao {
public void saveTag(Tag tag);
public Tag getTag(String referencace);
}
