package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer citizenid;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus; 
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitDate;
	private String denailreason;
	private LocalDate terminatedDate;
	private String terminationReason;
	
	@Override
	public String toString() {
		return "CitizenPlan [citizenid=" + citizenid + ", citizenName=" + citizenName + ", gender=" + gender
				+ ", planName=" + planName + ", planStatus=" + planStatus + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", benefitDate=" + benefitDate + ", denailreason=" + denailreason
				+ ", terminatedDate=" + terminatedDate + ", terminationReason=" + terminationReason + "]";
	}
	public Integer getCitizenid() {
		return citizenid;
	}
	public void setCitizenid(Integer citizenid) {
		this.citizenid = citizenid;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenefitDate() {
		return benefitDate;
	}
	public void setBenefitDate(Double benefitDate) {
		this.benefitDate = benefitDate;
	}
	public String getDenailreason() {
		return denailreason;
	}
	public void setDenailreason(String denailreason) {
		this.denailreason = denailreason;
	}
	public LocalDate getTerminatedDate() {
		return terminatedDate;
	}
	public void setTerminatedDate(LocalDate terminatedDate) {
		this.terminatedDate = terminatedDate;
	}
	public String getTerminationReason() {
		return terminationReason;
	}
	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}
	public void setBenefitAmt(double d) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
