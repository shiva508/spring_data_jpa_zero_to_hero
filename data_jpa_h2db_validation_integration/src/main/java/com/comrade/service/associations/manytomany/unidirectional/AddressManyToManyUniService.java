package com.comrade.service.associations.manytomany.unidirectional;

import java.util.List;

import com.comrade.model.associations.manytomany.unidirectional.AddressManyToManyUni;

public interface AddressManyToManyUniService {
    public AddressManyToManyUni save(AddressManyToManyUni addressManyToManyUni);

    public List<AddressManyToManyUni> findAll();

    public AddressManyToManyUni findByAddressId(Long addressId);
}
