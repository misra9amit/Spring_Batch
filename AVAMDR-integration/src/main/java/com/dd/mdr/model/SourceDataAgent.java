package com.dd.mdr.model;
// Generated Mar 11, 2016 5:28:44 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SourceDataAgent generated by hbm2java
 */
@Entity
@Table(name = "SOURCE_DATA_AGENT", schema = "DDMDR")
public class SourceDataAgent implements java.io.Serializable {

	private BigDecimal sdagntId;
	private String sdagntExternalId;
	private String sdagntFirstName;
	private String sdagntLastName;
	private String sdagntEmpId;
	private Date sdagntCreateDate;
	private String sdagntCreateBy;
	private Date sdagntUpdateDate;
	private String sdagntUpdateBy;

	public SourceDataAgent() {
	}

	public SourceDataAgent(BigDecimal sdagntId) {
		this.sdagntId = sdagntId;
	}

	public SourceDataAgent(BigDecimal sdagntId, String sdagntExternalId, String sdagntFirstName, String sdagntLastName,
			String sdagntEmpId, Date sdagntCreateDate, String sdagntCreateBy, Date sdagntUpdateDate,
			String sdagntUpdateBy) {
		this.sdagntId = sdagntId;
		this.sdagntExternalId = sdagntExternalId;
		this.sdagntFirstName = sdagntFirstName;
		this.sdagntLastName = sdagntLastName;
		this.sdagntEmpId = sdagntEmpId;
		this.sdagntCreateDate = sdagntCreateDate;
		this.sdagntCreateBy = sdagntCreateBy;
		this.sdagntUpdateDate = sdagntUpdateDate;
		this.sdagntUpdateBy = sdagntUpdateBy;
	}

	@Id

	@Column(name = "SDAGNT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getSdagntId() {
		return this.sdagntId;
	}

	public void setSdagntId(BigDecimal sdagntId) {
		this.sdagntId = sdagntId;
	}

	@Column(name = "SDAGNT_EXTERNAL_ID", length = 20)
	public String getSdagntExternalId() {
		return this.sdagntExternalId;
	}

	public void setSdagntExternalId(String sdagntExternalId) {
		this.sdagntExternalId = sdagntExternalId;
	}

	@Column(name = "SDAGNT_FIRST_NAME", length = 100)
	public String getSdagntFirstName() {
		return this.sdagntFirstName;
	}

	public void setSdagntFirstName(String sdagntFirstName) {
		this.sdagntFirstName = sdagntFirstName;
	}

	@Column(name = "SDAGNT_LAST_NAME", length = 100)
	public String getSdagntLastName() {
		return this.sdagntLastName;
	}

	public void setSdagntLastName(String sdagntLastName) {
		this.sdagntLastName = sdagntLastName;
	}

	@Column(name = "SDAGNT_EMP_ID", length = 20)
	public String getSdagntEmpId() {
		return this.sdagntEmpId;
	}

	public void setSdagntEmpId(String sdagntEmpId) {
		this.sdagntEmpId = sdagntEmpId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SDAGNT_CREATE_DATE", length = 7)
	public Date getSdagntCreateDate() {
		return this.sdagntCreateDate;
	}

	public void setSdagntCreateDate(Date sdagntCreateDate) {
		this.sdagntCreateDate = sdagntCreateDate;
	}

	@Column(name = "SDAGNT_CREATE_BY", length = 30)
	public String getSdagntCreateBy() {
		return this.sdagntCreateBy;
	}

	public void setSdagntCreateBy(String sdagntCreateBy) {
		this.sdagntCreateBy = sdagntCreateBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SDAGNT_UPDATE_DATE", length = 7)
	public Date getSdagntUpdateDate() {
		return this.sdagntUpdateDate;
	}

	public void setSdagntUpdateDate(Date sdagntUpdateDate) {
		this.sdagntUpdateDate = sdagntUpdateDate;
	}

	@Column(name = "SDAGNT_UPDATE_BY", length = 30)
	public String getSdagntUpdateBy() {
		return this.sdagntUpdateBy;
	}

	public void setSdagntUpdateBy(String sdagntUpdateBy) {
		this.sdagntUpdateBy = sdagntUpdateBy;
	}

}
