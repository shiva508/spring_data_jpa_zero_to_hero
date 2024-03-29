package com.comrade;

import com.comrade.domine.AccountEntity;
import com.comrade.domine.ContactEntity;
import com.comrade.service.AccountService;
import com.comrade.service.ContactService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataJpaBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaBasicsApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(ContactService contactService, AccountService accountService){
        return args -> {
            ContactEntity contact= ContactEntity.builder()
                                                .notes("What is new")
                                                .starred(true)
                                                .website("www.dearcomrade.com")
                                                .build();
            contactService.save(contact);
            AccountEntity accountEntity=AccountEntity.builder().interest(0f).credit(25.0f).rate(2f).build();
            accountService.save(accountEntity);
        };
    }
}
