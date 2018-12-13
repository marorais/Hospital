package com.hospital.is;

import java.util.Map;

import com.hospital.is.model.PatientDTO;
import com.hospital.is.service.Service;
import com.hospital.is.service.impl.ServiceImpl;

public class Main {

	public static void main(String[] args) {

		Service<PatientDTO> service = new ServiceImpl<PatientDTO>(PatientDTO.class);

		Map<Long, PatientDTO> map = service.getAll();

		System.out.println(map);
	}
}
