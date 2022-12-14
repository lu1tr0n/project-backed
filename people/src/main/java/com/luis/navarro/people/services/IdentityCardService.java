package com.luis.navarro.people.services;

import java.util.List;

import com.luis.navarro.people.dtos.IdentityCardDTO;

public interface IdentityCardService {
	
	/**
	 * @return
	 */
	public List<IdentityCardDTO> findByAll();

	/**
	 * @param number
	 * @return
	 */
	public IdentityCardDTO findByNumber(String number);

	/**
	 * @param request
	 * @return
	 */
	public IdentityCardDTO saveByIdentityCard(IdentityCardDTO request);
	
	/**
	 * @param request
	 * @return
	 */
	public IdentityCardDTO updateByIdentityCard(IdentityCardDTO request);
	
	/**
	 * @param number
	 * @return
	 */
	public Boolean deleteByIdentityCard(String number);
}
