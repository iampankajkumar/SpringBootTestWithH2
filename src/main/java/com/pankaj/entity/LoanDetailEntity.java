package com.pankaj.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="loanDetail")
public class LoanDetailEntity implements Serializable  {

	private static final long serialVersionUID = 1L;

    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="loanDetailID")
	private Integer loanDetailId;

	@Column(name="AmountUnit")
	private Integer amountUnit;

	private String assignedTo;

	@Column(name="CreatedBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedOn")
	private Date createdOn;

	@Column(name="LastUpdatedBy")
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LastUpdatedOn")
	private Date lastUpdatedOn;

	private BigDecimal limitSeekedByOR;

	private Integer limitSeekedByORUOM;

	@Column(name="LoanAmount")
	private BigDecimal loanAmount;

	
	private Integer loanRequestId;

	private Integer  loanStatus;

	@Column(name="LoanTenure")
	private Integer  loanTenure;

	@Column(name="LoanTenureUnit")
	private Integer  loanTenureUnit;

	@Column(name="LoanType")
	private Integer  loanType;

	private Integer  nbfcId;

	private Integer  nbfcPartner;

	@Column(name="PayoutOption")
	private Integer  payoutOption;

	@Column(name="PremiseVerificationStatus")
	private String premiseVerificationStatus;

	@Column(name="PurposeOfLoan")
	private Integer  purposeOfLoan;

	private Integer  reworkCount;
	
	@Column(name="dsaname", length=256)
	private String dsaName;
	
	@Column(name="priority", length= 2)
	private Integer priority;
	
	@ManyToMany(mappedBy="loanDetailEntitys")
	List<Questions> questions=new ArrayList<>();

}