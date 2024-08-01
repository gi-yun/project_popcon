package com.store.entity;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class Cart {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(nullable = false, name = "cart_idx")
	    private int cartIdx;

	    @ManyToOne
	    @JoinColumn(name = "customer_idx", nullable = false)
	    private Customer customer;

	    @ManyToOne
	    @JoinColumn(name = "sku_idx", nullable = false)
	    private Sku sku;

	    @Column(name = "sku_value", nullable = false)
	    private int skuValue;
	}