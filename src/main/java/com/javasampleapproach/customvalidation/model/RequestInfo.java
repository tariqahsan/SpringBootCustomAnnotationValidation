package com.javasampleapproach.customvalidation.model;

import java.math.BigDecimal;

import com.javasampleapproach.customvalidation.util.ConstantUtil;
import com.javasampleapproach.customvalidation.validation.ValidDecimalNumber;
import com.javasampleapproach.customvalidation.validation.ValidEmail;

import lombok.Data;

@Data
public class RequestInfo {

	@ValidEmail(min = 55, message = "Please enter a valid email.")
	private String email;

	@ValidDecimalNumber(min = ConstantUtil.DECIMALPOINT)
	private BigDecimal decimalNumber;

}
