package com.dd.mdr.model.f;
// Generated Mar 11, 2016 5:28:44 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CallEvent generated by hbm2java
 */
@Entity
@Table(name = "CALL_EVENT", schema = "DDMDR", uniqueConstraints = @UniqueConstraint(columnNames = { "CALL_ID",
		"DISP_ID" }) )
public class CallEvent implements java.io.Serializable {

	private BigDecimal cevntId;
	private Call call;
	private BigDecimal dispId;
	private BigDecimal cevntSequence;
	private Date cevntCreateDate;
	private String cevntCreateBy;
	private Date cevntUpdateDate;
	private String cevntUpdateBy;

	public CallEvent() {
	}

	public CallEvent(BigDecimal cevntId, Call call, BigDecimal dispId, BigDecimal cevntSequence) {
		this.cevntId = cevntId;
		this.call = call;
		this.dispId = dispId;
		this.cevntSequence = cevntSequence;
	}

	public CallEvent(BigDecimal cevntId, Call call, BigDecimal dispId, BigDecimal cevntSequence, Date cevntCreateDate,
			String cevntCreateBy, Date cevntUpdateDate, String cevntUpdateBy) {
		this.cevntId = cevntId;
		this.call = call;
		this.dispId = dispId;
		this.cevntSequence = cevntSequence;
		this.cevntCreateDate = cevntCreateDate;
		this.cevntCreateBy = cevntCreateBy;
		this.cevntUpdateDate = cevntUpdateDate;
		this.cevntUpdateBy = cevntUpdateBy;
	}

	@Id

	@Column(name = "CEVNT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCevntId() {
		return this.cevntId;
	}

	public void setCevntId(BigDecimal cevntId) {
		this.cevntId = cevntId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CALL_ID", nullable = false)
	public Call getCall() {
		return this.call;
	}

	public void setCall(Call call) {
		this.call = call;
	}

	@Column(name = "DISP_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getDispId() {
		return this.dispId;
	}

	public void setDispId(BigDecimal dispId) {
		this.dispId = dispId;
	}

	@Column(name = "CEVNT_SEQUENCE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getCevntSequence() {
		return this.cevntSequence;
	}

	public void setCevntSequence(BigDecimal cevntSequence) {
		this.cevntSequence = cevntSequence;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CEVNT_CREATE_DATE", length = 7)
	public Date getCevntCreateDate() {
		return this.cevntCreateDate;
	}

	public void setCevntCreateDate(Date cevntCreateDate) {
		this.cevntCreateDate = cevntCreateDate;
	}

	@Column(name = "CEVNT_CREATE_BY", length = 30)
	public String getCevntCreateBy() {
		return this.cevntCreateBy;
	}

	public void setCevntCreateBy(String cevntCreateBy) {
		this.cevntCreateBy = cevntCreateBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CEVNT_UPDATE_DATE", length = 7)
	public Date getCevntUpdateDate() {
		return this.cevntUpdateDate;
	}

	public void setCevntUpdateDate(Date cevntUpdateDate) {
		this.cevntUpdateDate = cevntUpdateDate;
	}

	@Column(name = "CEVNT_UPDATE_BY", length = 30)
	public String getCevntUpdateBy() {
		return this.cevntUpdateBy;
	}

	public void setCevntUpdateBy(String cevntUpdateBy) {
		this.cevntUpdateBy = cevntUpdateBy;
	}

}
