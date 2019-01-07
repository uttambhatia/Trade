package com.cs.tmt.service.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.cs.tmt.ws.GetInfoDataDetailsRequest;
import com.cs.tmt.ws.GetInfoDataDetailsResponse;
import com.cs.tmt.ws.GetInfoDataRequest;
import com.cs.tmt.ws.GetInfoDataResponse;

@WebService(targetNamespace = "http://ws.tmt.cs.com", name = "InfoDataPortType")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InfoDataPortType {

    @WebMethod
    @WebResult(name = "getInfoDataResponse", targetNamespace = "http://ws.tmt.cs.com", partName = "response")
    public GetInfoDataResponse getInfoData(
        @WebParam(partName = "parameters", name = "getInfoDataRequest", targetNamespace = "http://ws.tmt.cs.com")
        GetInfoDataRequest parameters
    );

    @WebMethod
    @WebResult(name = "getInfoDataDetailsResponse", targetNamespace = "http://ws.tmt.cs.com", partName = "response")
    public GetInfoDataDetailsResponse getInfoDetails(
        @WebParam(partName = "parameters", name = "getInfoDataDetailsRequest", targetNamespace = "http://ws.tmt.cs.com")
        GetInfoDataDetailsRequest parameters
    );
}

