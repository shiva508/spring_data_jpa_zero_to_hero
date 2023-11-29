package com.comrade.service.associations.manytomany.link;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comrade.model.associations.manytomany.link.AddressManyToManyLink;
import com.comrade.repository.associations.manytomany.link.AddressManyToManyLinkRepository;

@Service
public class AddressManyToManyLinkServiceImpl implements AddressManyToManyLinkService {

    @Autowired
    private AddressManyToManyLinkRepository addressManyToManyLinkRepository;

    @Override
    @Transactional
    public AddressManyToManyLink save(AddressManyToManyLink addressManyToManyLink) {

        return addressManyToManyLinkRepository.save(addressManyToManyLink);
    }

    @Override
    @Transactional
    public List<AddressManyToManyLink> findAll() {

        return addressManyToManyLinkRepository.findAll();
    }

    @Override
    @Transactional
    public AddressManyToManyLink findByAddressId(Long addressId) {

        return addressManyToManyLinkRepository.getById(addressId);
    }

}
