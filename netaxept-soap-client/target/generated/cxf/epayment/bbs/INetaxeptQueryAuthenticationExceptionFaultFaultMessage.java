
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.769Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "AuthenticationException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptQueryAuthenticationExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.AuthenticationException authenticationException;

    public INetaxeptQueryAuthenticationExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptQueryAuthenticationExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptQueryAuthenticationExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptQueryAuthenticationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.AuthenticationException authenticationException) {
        super(message);
        this.authenticationException = authenticationException;
    }

    public INetaxeptQueryAuthenticationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.AuthenticationException authenticationException, Throwable cause) {
        super(message, cause);
        this.authenticationException = authenticationException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.AuthenticationException getFaultInfo() {
        return this.authenticationException;
    }
}
