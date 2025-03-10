package com.project.service;

import java.util.List;

import com.project.dto.AdminDto;
import com.project.dto.ApiResponse;
import com.project.dto.DeletionRequestDTO;
import com.project.dto.UserDTO;

public interface AdminService {

	AdminDto getAdminById(Long id);

	List<UserDTO> getAllPlayers();

	List<UserDTO> getAllFacilityOwners();

	List<DeletionRequestDTO> getPendingDeletionRequests();

	ApiResponse processDeletionRequest(Long adminId, Long requestId, boolean approve);

}
