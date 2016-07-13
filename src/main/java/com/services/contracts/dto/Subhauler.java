package com.services.contracts.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subhaulers")
public class Subhauler implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	@Column(name="provider_name")
	private String provider_name;
	
	@Column(name="tax_id")
	private String tax_id;
	
	@Column(name="tow_provider_uid")
	private Long tow_provider_uid;
	
	@Column(name="country_id")
	private Long country_id;
	
	@Column(name="status")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public String getTax_id() {
		return tax_id;
	}

	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}

	public Long getTow_provider_uid() {
		return tow_provider_uid;
	}

	public void setTow_provider_uid(Long tow_provider_uid) {
		this.tow_provider_uid = tow_provider_uid;
	}

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
