package com.hospital.is.model;

import java.util.Map;

public class AppointmentDTO {

	private String dateTimeAppointment;

	private String typeAppointment;

	private Doctor doctor;

	private PatientDTO patient;

	private Map<Integer, Prescription> prescriptionList;

	/**
	 * @return the dateTimeAppointment
	 */
	public String getDateTimeAppointment() {
		return dateTimeAppointment;
	}

	/**
	 * @param dateTimeAppointment the dateTimeAppointment to set
	 */
	public void setDateTimeAppointment(String dateTimeAppointment) {
		this.dateTimeAppointment = dateTimeAppointment;
	}

	/**
	 * @return the typeAppointment
	 */
	public String getTypeAppointment() {
		return typeAppointment;
	}

	/**
	 * @param typeAppointment the typeAppointment to set
	 */
	public void setTypeAppointment(String typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the prescriptionList
	 */
	public Map<Integer, Prescription> getPrescriptionList() {
		return prescriptionList;
	}

	/**
	 * @param prescriptionList the prescriptionList to set
	 */
	public void setPrescriptionList(Map<Integer, Prescription> prescriptionList) {
		this.prescriptionList = prescriptionList;
	}

	/**
	 * @return the patient
	 */
	public PatientDTO getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}

}
