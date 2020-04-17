package io.github.czliu.petclinic.services;

import io.github.czliu.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
