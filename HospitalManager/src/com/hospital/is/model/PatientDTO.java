package com.hospital.is.model;

public class PatientDTO extends Person implements Comparable<PatientDTO> {

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
		return "Patient " + super.toString() + " [medicalFolder=" + medicalFolder + "]";
	}

	@Override
	public int compareTo(PatientDTO o) {
//		if (this.getFirstName().subSequence(0, 1).equals(o.getFirstName().substring(0, 1))) {
//			return 0;
//		} else {
//			return -1;
//		}
		return 0;
	}

}
