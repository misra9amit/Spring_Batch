package com.dd.mdr.model;
// Generated Mar 11, 2016 5:28:44 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Communication generated by hbm2java
 */
@Entity
@Table(name = "COMMUNICATION", schema = "DDMDR", uniqueConstraints = @UniqueConstraint(columnNames = "COMM_CODE") )
public class Communication implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5249970953136547024L;
	private BigDecimal commId;
	private Communication communication;
	private BigDecimal cmtId;
	private String commCode;
	private String commDescr;
	private String commExternalId;
	private char commActiveFlag;
	private BigDecimal accId;
	private Date commStartDate;
	private Date commEndDate;
	private String commProjectNo;
	private BigDecimal cchId;
	private Date commCreateDate;
	private String commCreateBy;
	private Date commUpdateDate;
	private String commUpdateBy;
	private Set<Object> communications = new HashSet<Object>(0);
	private Set calls = new HashSet(0);

	public Communication() {
	}

	public Communication(BigDecimal commId, BigDecimal cmtId, String commCode, String commDescr, char commActiveFlag,
			BigDecimal accId) {
		this.commId = commId;
		this.cmtId = cmtId;
		this.commCode = commCode;
		this.commDescr = commDescr;
		this.commActiveFlag = commActiveFlag;
		this.accId = accId;
	}

	public Communication(BigDecimal commId, Communication communication, BigDecimal cmtId, String commCode,
			String commDescr, String commExternalId, char commActiveFlag, BigDecimal accId, Date commStartDate,
			Date commEndDate, String commProjectNo, BigDecimal cchId, Date commCreateDate, String commCreateBy,
			Date commUpdateDate, String commUpdateBy, Set communications, Set calls) {
		this.commId = commId;
		this.communication = communication;
		this.cmtId = cmtId;
		this.commCode = commCode;
		this.commDescr = commDescr;
		this.commExternalId = commExternalId;
		this.commActiveFlag = commActiveFlag;
		this.accId = accId;
		this.commStartDate = commStartDate;
		this.commEndDate = commEndDate;
		this.commProjectNo = commProjectNo;
		this.cchId = cchId;
		this.commCreateDate = commCreateDate;
		this.commCreateBy = commCreateBy;
		this.commUpdateDate = commUpdateDate;
		this.commUpdateBy = commUpdateBy;
		this.communications = communications;
		this.calls = calls;
	}

	@Id

	@Column(name = "COMM_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCommId() {
		return this.commId;
	}

	public void setCommId(BigDecimal commId) {
		this.commId = commId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_COMM_ID")
	public Communication getCommunication() {
		return this.communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	@Column(name = "CMT_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getCmtId() {
		return this.cmtId;
	}

	public void setCmtId(BigDecimal cmtId) {
		this.cmtId = cmtId;
	}

	@Column(name = "COMM_CODE", unique = true, nullable = false, length = 100)
	public String getCommCode() {
		return this.commCode;
	}

	public void setCommCode(String commCode) {
		this.commCode = commCode;
	}

	@Column(name = "COMM_DESCR", nullable = false, length = 250)
	public String getCommDescr() {
		return this.commDescr;
	}

	public void setCommDescr(String commDescr) {
		this.commDescr = commDescr;
	}

	@Column(name = "COMM_EXTERNAL_ID", length = 50)
	public String getCommExternalId() {
		return this.commExternalId;
	}

	public void setCommExternalId(String commExternalId) {
		this.commExternalId = commExternalId;
	}

	@Column(name = "COMM_ACTIVE_FLAG", nullable = false, length = 1)
	public char getCommActiveFlag() {
		return this.commActiveFlag;
	}

	public void setCommActiveFlag(char commActiveFlag) {
		this.commActiveFlag = commActiveFlag;
	}

	@Column(name = "ACC_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAccId() {
		return this.accId;
	}

	public void setAccId(BigDecimal accId) {
		this.accId = accId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COMM_START_DATE", length = 7)
	public Date getCommStartDate() {
		return this.commStartDate;
	}

	public void setCommStartDate(Date commStartDate) {
		this.commStartDate = commStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COMM_END_DATE", length = 7)
	public Date getCommEndDate() {
		return this.commEndDate;
	}

	public void setCommEndDate(Date commEndDate) {
		this.commEndDate = commEndDate;
	}

	@Column(name = "COMM_PROJECT_NO", length = 30)
	public String getCommProjectNo() {
		return this.commProjectNo;
	}

	public void setCommProjectNo(String commProjectNo) {
		this.commProjectNo = commProjectNo;
	}

	@Column(name = "CCH_ID", precision = 22, scale = 0)
	public BigDecimal getCchId() {
		return this.cchId;
	}

	public void setCchId(BigDecimal cchId) {
		this.cchId = cchId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COMM_CREATE_DATE", length = 7)
	public Date getCommCreateDate() {
		return this.commCreateDate;
	}

	public void setCommCreateDate(Date commCreateDate) {
		this.commCreateDate = commCreateDate;
	}

	@Column(name = "COMM_CREATE_BY", length = 30)
	public String getCommCreateBy() {
		return this.commCreateBy;
	}

	public void setCommCreateBy(String commCreateBy) {
		this.commCreateBy = commCreateBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "COMM_UPDATE_DATE", length = 7)
	public Date getCommUpdateDate() {
		return this.commUpdateDate;
	}

	public void setCommUpdateDate(Date commUpdateDate) {
		this.commUpdateDate = commUpdateDate;
	}

	@Column(name = "COMM_UPDATE_BY", length = 30)
	public String getCommUpdateBy() {
		return this.commUpdateBy;
	}

	public void setCommUpdateBy(String commUpdateBy) {
		this.commUpdateBy = commUpdateBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "communication")
	public Set getCommunications() {
		return this.communications;
	}

	public void setCommunications(Set communications) {
		this.communications = communications;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "communication")
	public Set getCalls() {
		return this.calls;
	}

	public void setCalls(Set calls) {
		this.calls = calls;
	}

}
