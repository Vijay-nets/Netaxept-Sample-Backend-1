
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.775Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "ValidationException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptRegisterValidationExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.ValidationException validationException;

    public INetaxeptRegisterValidationExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptRegisterValidationExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptRegisterValidationExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptRegisterValidationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.ValidationException validationException) {
        super(message);
        this.validationException = validationException;
    }

    public INetaxeptRegisterValidationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.ValidationException validationException, Throwable cause) {
        super(message, cause);
        this.validationException = validationException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.ValidationException getFaultInfo() {
        return this.validationException;
    }
}
