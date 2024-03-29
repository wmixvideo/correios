
package br.com.correios.webservice.rastro;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "http://resource.webservice.correios.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @param senha
     * @param tipo
     * @param resultado
     * @param lingua
     * @param usuario
     * @param objetos
     * @return
     *     returns br.com.correios.webservice.rastro.Sroxml
     */
    @WebMethod(action = "buscaEventos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaEventos", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.BuscaEventos")
    @ResponseWrapper(localName = "buscaEventosResponse", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.BuscaEventosResponse")
    @Action(input = "buscaEventos", output = "http://resource.webservice.correios.com.br/Service/buscaEventosResponse")
    Sroxml buscaEventos(
            @WebParam(name = "usuario", targetNamespace = "")
                    String usuario,
            @WebParam(name = "senha", targetNamespace = "")
                    String senha,
            @WebParam(name = "tipo", targetNamespace = "")
                    String tipo,
            @WebParam(name = "resultado", targetNamespace = "")
                    String resultado,
            @WebParam(name = "lingua", targetNamespace = "")
                    String lingua,
            @WebParam(name = "objetos", targetNamespace = "")
                    String objetos);

    /**
     * 
     * @param senha
     * @param tipo
     * @param resultado
     * @param lingua
     * @param usuario
     * @param objetos
     * @return
     *     returns br.com.correios.webservice.rastro.Sroxml
     */
    @WebMethod(action = "buscaEventosLista")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscaEventosLista", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.BuscaEventosLista")
    @ResponseWrapper(localName = "buscaEventosListaResponse", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.BuscaEventosListaResponse")
    @Action(input = "buscaEventosLista", output = "http://resource.webservice.correios.com.br/Service/buscaEventosListaResponse")
    Sroxml buscaEventosLista(
            @WebParam(name = "usuario", targetNamespace = "")
                    String usuario,
            @WebParam(name = "senha", targetNamespace = "")
                    String senha,
            @WebParam(name = "tipo", targetNamespace = "")
                    String tipo,
            @WebParam(name = "resultado", targetNamespace = "")
                    String resultado,
            @WebParam(name = "lingua", targetNamespace = "")
                    String lingua,
            @WebParam(name = "objetos", targetNamespace = "")
                    List<String> objetos);

    /**
     * 
     * @param senha
     * @param tipo
     * @param resultado
     * @param lingua
     * @param usuario
     * @param objetos
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RastroJson", action = "RastroJson")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RastroJson", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.RastroJson")
    @ResponseWrapper(localName = "RastroJsonResponse", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.RastroJsonResponse")
    @Action(input = "RastroJson", output = "http://resource.webservice.correios.com.br/Service/RastroJsonResponse")
    String rastroJson(
            @WebParam(name = "usuario", targetNamespace = "")
                    String usuario,
            @WebParam(name = "senha", targetNamespace = "")
                    String senha,
            @WebParam(name = "tipo", targetNamespace = "")
                    String tipo,
            @WebParam(name = "resultado", targetNamespace = "")
                    String resultado,
            @WebParam(name = "lingua", targetNamespace = "")
                    String lingua,
            @WebParam(name = "objetos", targetNamespace = "")
                    String objetos);

    /**
     * 
     * @param loec
     * @return
     *     returns br.com.correios.webservice.rastro.ListaEntregaExterna2
     */
    @WebMethod(operationName = "ListaEntregaExterna", action = "ListaEntregaExterna")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListaEntregaExterna", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.ListaEntregaExterna")
    @ResponseWrapper(localName = "ListaEntregaExternaResponse", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.ListaEntregaExternaResponse")
    @Action(input = "ListaEntregaExterna", output = "http://resource.webservice.correios.com.br/Service/ListaEntregaExternaResponse")
    ListaEntregaExterna2 listaEntregaExterna(
            @WebParam(name = "loec", targetNamespace = "")
                    String loec);

    /**
     * 
     * @param codigoSRO
     * @return
     *     returns java.util.List<br.com.correios.webservice.rastro.RegistroUnidades>
     */
    @WebMethod(operationName = "UnidadesSRO", action = "UnidadesSRO")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UnidadesSRO", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.UnidadesSRO")
    @ResponseWrapper(localName = "UnidadesSROResponse", targetNamespace = "http://resource.webservice.correios.com.br/", className = "br.com.correios.webservice.rastro.UnidadesSROResponse")
    @Action(input = "UnidadesSRO", output = "http://resource.webservice.correios.com.br/Service/UnidadesSROResponse")
    List<RegistroUnidades> unidadesSRO(
            @WebParam(name = "codigoSRO", targetNamespace = "")
                    String codigoSRO);

}
