package com.ecommerce.service;

import com.ecommerce.model.User;
import com.ecommerce.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAddresses();

    AddressDTO getAddressById(Long addressId);

    List<AddressDTO> getUserAddresses(User user);

    AddressDTO upadateAddress(Long addressId, AddressDTO addressDTO);

    String deleteAddress(Long addressId);
}
