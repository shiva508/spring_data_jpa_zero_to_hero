package com.comrade.mappers;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.converter.builtin.DateToStringConverter;

public class ModelDomainMapper {
private MapperFactory  modelDomainFactory = null;

public ModelDomainMapper(MapperFactory mapperFactory) {
	super();
	this.modelDomainFactory = mapperFactory;
	ConverterFactory converterFactory=modelDomainFactory.getConverterFactory();
	converterFactory.registerConverter(new DateToStringConverter("MM-dd-yyyy HH:mm:ss"));
}
public void userFormToUserModel() {
	
}
}
