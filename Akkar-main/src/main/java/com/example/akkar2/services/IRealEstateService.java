package com.example.akkar2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.akkar2.entities.AnnouncementType;
import com.example.akkar2.entities.RealEstate;
import com.example.akkar2.entities.RealEstateType;

public interface IRealEstateService {

	public RealEstate addRealEstate(RealEstate Re);

	public void delete_realEstate(Long id);

	RealEstate updateRealEstate(RealEstate Res);

	public Page<RealEstate> getAllRealEstates(Pageable pageable);

	public RealEstate getRealEstate(Long id);

	List<RealEstate> getByLocation(String location);

	List<RealEstate> getByType(RealEstateType estateType);

	List<RealEstate> getByRooms(int rooms);

	List<RealEstate> getBySurfaceAndLocation(int surface, String location);

	List<RealEstate> getLowerSurface(int surface);

	List<RealEstate> findByRealEsAndAnnou(RealEstateType estateType , AnnouncementType announcementType);
	void affecterRealEstateToAnnouncement(Long idR , Long idA);
}
