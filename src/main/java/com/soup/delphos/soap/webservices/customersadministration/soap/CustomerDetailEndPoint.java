package com.soup.delphos.soap.webservices.customersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.pablodelphos.CustomerDetail;
import br.com.pablodelphos.GetCustomerDetailRequest;
import br.com.pablodelphos.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndPoint {
	@PayloadRoot(namespace = "http://pablodelphos.com.br", localPart = "GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailRequest req) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		CustomerDetail customerDetail = new CustomerDetail();
		customerDetail.setId(1);
		customerDetail.setName("Pablo Gonzalez");
		customerDetail.setPhone("94950458");
		customerDetail.setEmail("pablo9495045@gmail.com");
		response.setCustomerDetail(customerDetail);
		return response;
	}
}
