package com.pankaj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name = "trader_question")
public class TraderQuestion {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Type(type = "yes_no")
	@ColumnDefault("'N'")
	@Column(name = "answer")
	private Boolean answer;

	@ManyToOne
	@JoinColumn(name = "loan_id")
	private LoanDetailEntity loanDetailEntity;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private Questions questions;

}
