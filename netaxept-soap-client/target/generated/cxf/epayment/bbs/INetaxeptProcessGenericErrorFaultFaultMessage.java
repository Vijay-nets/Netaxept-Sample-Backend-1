
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.784Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "GenericError", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptProcessGenericErrorFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.GenericError genericError;

    public INetaxeptProcessGenericErrorFaultFaultMessage() {
        super();
    }
    
    public INetaxeptProcessGenericErrorFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptProcessGenericErrorFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptProcessGenericErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.GenericError genericError) {
        super(message);
        this.genericError = genericError;
    }

    public INetaxeptProcessGenericErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.GenericError genericError, Throwable cause) {
        super(message, cause);
        this.genericError = genericError;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.GenericError getFaultInfo() {
        return this.genericError;
    }
}
