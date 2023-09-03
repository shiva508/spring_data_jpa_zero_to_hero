package com.comrade.service.ENUM.ATTRIBUTECONVERTER;

import com.example.demo.model.ENUM.ATTRIBUTECONVERTER.Photo;

public interface PhotoService {
public Photo savePhoto(Photo photo);
public Photo getPhotosByCaption(String caption);
}
