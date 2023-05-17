package com.lcwv.hotel.repositories;

import com.lcwv.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {



}
