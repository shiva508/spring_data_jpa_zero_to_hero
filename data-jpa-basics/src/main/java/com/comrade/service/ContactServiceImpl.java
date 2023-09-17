package com.comrade.service;

import com.comrade.domine.ContactEntity;
import com.comrade.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    @Transactional
    public ContactEntity save(ContactEntity contact) {
        return contactRepository.save(contact);
    }
}
