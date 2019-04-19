package com.pankaj.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="question_id")
	private Long questionId;

	private String question;

	private Byte status;

	@Enumerated(EnumType.STRING)
	@Column(name = "question_type")
	private QuestionType questionType;

	@ManyToMany
	@JoinTable(name = "trader_question",
	joinColumns = @JoinColumn(name="question_id"),
	inverseJoinColumns = @JoinColumn(name="loan_id"))
	private List<LoanDetailEntity> loanDetailEntitys=new ArrayList<>();
}
