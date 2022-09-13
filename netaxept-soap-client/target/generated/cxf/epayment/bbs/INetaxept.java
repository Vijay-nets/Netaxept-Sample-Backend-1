package epayment.bbs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.793Z
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://BBS.EPayment", name = "INetaxept")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, org.datacontract.schemas._2004._07.bbs_epayment.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface INetaxept {

    @WebMethod(operationName = "Query", action = "http://BBS.EPayment/INetaxept/Query")
    @Action(input = "http://BBS.EPayment/INetaxept/Query", output = "http://BBS.EPayment/INetaxept/QueryResponse", fault = {@FaultAction(className = INetaxeptQueryAuthenticationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/QueryAuthenticationExceptionFault"), @FaultAction(className = INetaxeptQueryQueryExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/QueryQueryExceptionFault")})
    @WebResult(name = "QueryResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public QueryResponse query(
        @WebParam(partName = "parameters", name = "Query", targetNamespace = "http://BBS.EPayment")
        Query parameters
    ) throws INetaxeptQueryAuthenticationExceptionFaultFaultMessage, INetaxeptQueryQueryExceptionFaultFaultMessage;

    @WebMethod(operationName = "Batch", action = "http://BBS.EPayment/INetaxept/Batch")
    @Action(input = "http://BBS.EPayment/INetaxept/Batch", output = "http://BBS.EPayment/INetaxept/BatchResponse", fault = {@FaultAction(className = INetaxeptBatchAuthenticationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/BatchAuthenticationExceptionFault"), @FaultAction(className = INetaxeptBatchGenericErrorFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/BatchGenericErrorFault"), @FaultAction(className = INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/BatchMerchantTranslationExceptionFault")})
    @WebResult(name = "BatchResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public BatchResponse batch(
        @WebParam(partName = "parameters", name = "Batch", targetNamespace = "http://BBS.EPayment")
        Batch parameters
    ) throws INetaxeptBatchAuthenticationExceptionFaultFaultMessage, INetaxeptBatchGenericErrorFaultFaultMessage, INetaxeptBatchMerchantTranslationExceptionFaultFaultMessage;

    @WebMethod(operationName = "Register", action = "http://BBS.EPayment/INetaxept/Register")
    @Action(input = "http://BBS.EPayment/INetaxept/Register", output = "http://BBS.EPayment/INetaxept/RegisterResponse", fault = {@FaultAction(className = INetaxeptRegisterValidationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterValidationExceptionFault"), @FaultAction(className = INetaxeptRegisterAuthenticationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterAuthenticationExceptionFault"), @FaultAction(className = INetaxeptRegisterGenericErrorFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterGenericErrorFault"), @FaultAction(className = INetaxeptRegisterMerchantTranslationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterMerchantTranslationExceptionFault"), @FaultAction(className = INetaxeptRegisterUniqueTransactionIdExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterUniqueTransactionIdExceptionFault"), @FaultAction(className = INetaxeptRegisterSecurityExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterSecurityExceptionFault"), @FaultAction(className = INetaxeptRegisterBBSExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/RegisterBBSExceptionFault")})
    @WebResult(name = "RegisterResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public RegisterResponse register(
        @WebParam(partName = "parameters", name = "Register", targetNamespace = "http://BBS.EPayment")
        Register parameters
    ) throws INetaxeptRegisterValidationExceptionFaultFaultMessage, INetaxeptRegisterAuthenticationExceptionFaultFaultMessage, INetaxeptRegisterGenericErrorFaultFaultMessage, INetaxeptRegisterMerchantTranslationExceptionFaultFaultMessage, INetaxeptRegisterUniqueTransactionIdExceptionFaultFaultMessage, INetaxeptRegisterSecurityExceptionFaultFaultMessage, INetaxeptRegisterBBSExceptionFaultFaultMessage;

    @WebMethod(operationName = "Process", action = "http://BBS.EPayment/INetaxept/Process")
    @Action(input = "http://BBS.EPayment/INetaxept/Process", output = "http://BBS.EPayment/INetaxept/ProcessResponse", fault = {@FaultAction(className = INetaxeptProcessValidationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessValidationExceptionFault"), @FaultAction(className = INetaxeptProcessAuthenticationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessAuthenticationExceptionFault"), @FaultAction(className = INetaxeptProcessGenericErrorFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessGenericErrorFault"), @FaultAction(className = INetaxeptProcessMerchantTranslationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessMerchantTranslationExceptionFault"), @FaultAction(className = INetaxeptProcessNotSupportedExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessNotSupportedExceptionFault"), @FaultAction(className = INetaxeptProcessBBSExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ProcessBBSExceptionFault")})
    @WebResult(name = "ProcessResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public ProcessResponse process(
        @WebParam(partName = "parameters", name = "Process", targetNamespace = "http://BBS.EPayment")
        Process parameters
    ) throws INetaxeptProcessValidationExceptionFaultFaultMessage, INetaxeptProcessAuthenticationExceptionFaultFaultMessage, INetaxeptProcessGenericErrorFaultFaultMessage, INetaxeptProcessMerchantTranslationExceptionFaultFaultMessage, INetaxeptProcessNotSupportedExceptionFaultFaultMessage, INetaxeptProcessBBSExceptionFaultFaultMessage;

    @WebMethod(operationName = "CheckAvailability", action = "http://BBS.EPayment/INetaxept/CheckAvailability")
    @Action(input = "http://BBS.EPayment/INetaxept/CheckAvailability", output = "http://BBS.EPayment/INetaxept/CheckAvailabilityResponse")
    @WebResult(name = "CheckAvailabilityResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public CheckAvailabilityResponse checkAvailability(
        @WebParam(partName = "parameters", name = "CheckAvailability", targetNamespace = "http://BBS.EPayment")
        CheckAvailability parameters
    );

    @WebMethod(operationName = "Recon", action = "http://BBS.EPayment/INetaxept/Recon")
    @Action(input = "http://BBS.EPayment/INetaxept/Recon", output = "http://BBS.EPayment/INetaxept/ReconResponse", fault = {@FaultAction(className = INetaxeptReconSecurityExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ReconSecurityExceptionFault"), @FaultAction(className = INetaxeptReconValidationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ReconValidationExceptionFault"), @FaultAction(className = INetaxeptReconAuthenticationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ReconAuthenticationExceptionFault"), @FaultAction(className = INetaxeptReconGenericErrorFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ReconGenericErrorFault"), @FaultAction(className = INetaxeptReconMerchantTranslationExceptionFaultFaultMessage.class, value = "http://BBS.EPayment/INetaxept/ReconMerchantTranslationExceptionFault")})
    @WebResult(name = "ReconResponse", targetNamespace = "http://BBS.EPayment", partName = "parameters")
    public ReconResponse recon(
        @WebParam(partName = "parameters", name = "Recon", targetNamespace = "http://BBS.EPayment")
        Recon parameters
    ) throws INetaxeptReconSecurityExceptionFaultFaultMessage, INetaxeptReconValidationExceptionFaultFaultMessage, INetaxeptReconAuthenticationExceptionFaultFaultMessage, INetaxeptReconGenericErrorFaultFaultMessage, INetaxeptReconMerchantTranslationExceptionFaultFaultMessage;
}
