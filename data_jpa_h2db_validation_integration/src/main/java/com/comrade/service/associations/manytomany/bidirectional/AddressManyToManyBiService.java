package com.comrade.service.associations.manytomany.bidirectional;

import java.util.List;

import com.comrade.model.associations.manytomany.bidirectional.AddressManyToManyBi;

public interface AddressManyToManyBiService {
    public AddressManyToManyBi save(AddressManyToManyBi addressManyToManyUni);

    public List<AddressManyToManyBi> findAll();

    public AddressManyToManyBi findByAddressId(Long addressId);
}
