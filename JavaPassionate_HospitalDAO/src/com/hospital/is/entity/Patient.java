package com.hospital.is.entity;

public class Patient extends Person {

	private MedicalFolder medicalFolder;

	/**
	 * @return the medicalFolder
	 */
	public MedicalFolder getMedicalFolder() {
		return medicalFolder;
	}

	/**
	 * @param medicalFolder the medicalFolder to set
	 */
	public void setMedicalFolder(MedicalFolder medicalFolder) {
		this.medicalFolder = medicalFolder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "\n   [medicalFolder=" + medicalFolder + "]\n";
	}

}
