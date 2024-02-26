package com.p.k.jsfdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long> {

    }
