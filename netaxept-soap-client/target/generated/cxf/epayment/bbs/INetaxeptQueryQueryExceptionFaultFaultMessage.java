
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-09-08T10:34:38.771Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "QueryException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptQueryQueryExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.QueryException queryException;

    public INetaxeptQueryQueryExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptQueryQueryExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptQueryQueryExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptQueryQueryExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.QueryException queryException) {
        super(message);
        this.queryException = queryException;
    }

    public INetaxeptQueryQueryExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.QueryException queryException, Throwable cause) {
        super(message, cause);
        this.queryException = queryException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.QueryException getFaultInfo() {
        return this.queryException;
    }
}
