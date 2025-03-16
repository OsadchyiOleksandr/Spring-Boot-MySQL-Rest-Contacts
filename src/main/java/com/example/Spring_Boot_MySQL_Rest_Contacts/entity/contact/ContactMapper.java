package com.example.Spring_Boot_MySQL_Rest_Contacts.entity.contact;

import com.example.Spring_Boot_MySQL_Rest_Contacts.dto.contact.ContactDtoRequest;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact dtoCreateToEntity(ContactDtoRequest request) {
        Contact contact = new Contact();

        Long id = request.id();
        if (id != null) contact.setId(id);

        String firstName = request.name();
        if (firstName != null) {
            if (!firstName.isBlank())
                contact.setName(firstName);
        }

        String lastName = request.surname();
        if (lastName != null) {
            if (!lastName.isBlank())
                contact.setSurname(lastName);
        }

        String email = request.phone();
        if (email != null) {
            if (!email.isBlank())
                contact.setPhone(email);
        }

        return contact;
    }

    public Contact dtoUpdateToEntity(Long id, ContactDtoRequest request,
                                     Contact contactToUpdate) {
        if (id != null) contactToUpdate.setId(id);

        String firstName = request.name();
        if (firstName != null) {
            if (!firstName.isBlank())
                contactToUpdate.setName(firstName);
        }

        String lastName = request.surname();
        if (lastName != null) {
            if (!lastName.isBlank())
                contactToUpdate.setSurname(lastName);
        }

        String email = request.phone();
        if (email != null) {
            if (!email.isBlank())
                contactToUpdate.setPhone(email);
        }

        return contactToUpdate;
    }
}
