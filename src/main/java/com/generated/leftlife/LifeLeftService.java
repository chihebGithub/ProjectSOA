
package com.generated.leftlife;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LifeLeftService", targetNamespace = "http://lifeleft.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LifeLeftService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "anneeRestantesAVivre", targetNamespace = "http://lifeleft.com/", className = "com.generated.leftlife.AnneeRestantesAVivre")
    @ResponseWrapper(localName = "anneeRestantesAVivreResponse", targetNamespace = "http://lifeleft.com/", className = "com.generated.leftlife.AnneeRestantesAVivreResponse")
    @Action(input = "http://lifeleft.com/LifeLeftService/anneeRestantesAVivreRequest", output = "http://lifeleft.com/LifeLeftService/anneeRestantesAVivreResponse")
    public String anneeRestantesAVivre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2);

}
