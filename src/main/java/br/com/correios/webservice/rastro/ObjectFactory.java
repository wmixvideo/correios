
package br.com.correios.webservice.rastro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.correios.webservice.resource package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Endereco_QNAME = new QName("http://resource.webservice.correios.com.br/", "endereco");
    private final static QName _UnidadesSROResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "UnidadesSROResponse");
    private final static QName _UnidadesSRO_QNAME = new QName("http://resource.webservice.correios.com.br/", "UnidadesSRO");
    private final static QName _RastroJson_QNAME = new QName("http://resource.webservice.correios.com.br/", "RastroJson");
    private final static QName _ListaEntregaExternaResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "ListaEntregaExternaResponse");
    private final static QName _Objeto_QNAME = new QName("http://resource.webservice.correios.com.br/", "objeto");
    private final static QName _ListaEntregaExterna_QNAME = new QName("http://resource.webservice.correios.com.br/", "ListaEntregaExterna");
    private final static QName _BuscaEventosLista_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosLista");
    private final static QName _Evento_QNAME = new QName("http://resource.webservice.correios.com.br/", "evento");
    private final static QName _RastroJsonResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "RastroJsonResponse");
    private final static QName _BuscaEventosResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosResponse");
    private final static QName _Rastro_QNAME = new QName("http://resource.webservice.correios.com.br/", "rastro");
    private final static QName _BuscaEventos_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventos");
    private final static QName _BuscaEventosListaResponse_QNAME = new QName("http://resource.webservice.correios.com.br/", "buscaEventosListaResponse");
    private final static QName _Destino_QNAME = new QName("http://resource.webservice.correios.com.br/", "destino");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.correios.webservice.resource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnidadesSRO }
     * 
     */
    public br.com.correios.webservice.rastro.UnidadesSRO createUnidadesSRO() {
        return new br.com.correios.webservice.rastro.UnidadesSRO();
    }

    /**
     * Create an instance of {@link RastroJson }
     * 
     */
    public br.com.correios.webservice.rastro.RastroJson createRastroJson() {
        return new br.com.correios.webservice.rastro.RastroJson();
    }

    /**
     * Create an instance of {@link EnderecoMobile }
     * 
     */
    public br.com.correios.webservice.rastro.EnderecoMobile createEnderecoMobile() {
        return new br.com.correios.webservice.rastro.EnderecoMobile();
    }

    /**
     * Create an instance of {@link UnidadesSROResponse }
     * 
     */
    public br.com.correios.webservice.rastro.UnidadesSROResponse createUnidadesSROResponse() {
        return new br.com.correios.webservice.rastro.UnidadesSROResponse();
    }

    /**
     * Create an instance of {@link Objeto }
     * 
     */
    public br.com.correios.webservice.rastro.Objeto createObjeto() {
        return new br.com.correios.webservice.rastro.Objeto();
    }

    /**
     * Create an instance of {@link ListaEntregaExternaResponse }
     * 
     */
    public br.com.correios.webservice.rastro.ListaEntregaExternaResponse createListaEntregaExternaResponse() {
        return new br.com.correios.webservice.rastro.ListaEntregaExternaResponse();
    }

    /**
     * Create an instance of {@link BuscaEventosLista }
     * 
     */
    public br.com.correios.webservice.rastro.BuscaEventosLista createBuscaEventosLista() {
        return new br.com.correios.webservice.rastro.BuscaEventosLista();
    }

    /**
     * Create an instance of {@link Eventos }
     * 
     */
    public br.com.correios.webservice.rastro.Eventos createEventos() {
        return new br.com.correios.webservice.rastro.Eventos();
    }

    /**
     * Create an instance of {@link RastroJsonResponse }
     * 
     */
    public br.com.correios.webservice.rastro.RastroJsonResponse createRastroJsonResponse() {
        return new br.com.correios.webservice.rastro.RastroJsonResponse();
    }

    /**
     * Create an instance of {@link ListaEntregaExterna }
     * 
     */
    public br.com.correios.webservice.rastro.ListaEntregaExterna createListaEntregaExterna() {
        return new br.com.correios.webservice.rastro.ListaEntregaExterna();
    }

    /**
     * Create an instance of {@link Sroxml }
     * 
     */
    public br.com.correios.webservice.rastro.Sroxml createSroxml() {
        return new br.com.correios.webservice.rastro.Sroxml();
    }

    /**
     * Create an instance of {@link BuscaEventos }
     * 
     */
    public br.com.correios.webservice.rastro.BuscaEventos createBuscaEventos() {
        return new br.com.correios.webservice.rastro.BuscaEventos();
    }

    /**
     * Create an instance of {@link BuscaEventosListaResponse }
     * 
     */
    public BuscaEventosListaResponse createBuscaEventosListaResponse() {
        return new BuscaEventosListaResponse();
    }

    /**
     * Create an instance of {@link Destinos }
     * 
     */
    public br.com.correios.webservice.rastro.Destinos createDestinos() {
        return new br.com.correios.webservice.rastro.Destinos();
    }

    /**
     * Create an instance of {@link BuscaEventosResponse }
     * 
     */
    public br.com.correios.webservice.rastro.BuscaEventosResponse createBuscaEventosResponse() {
        return new br.com.correios.webservice.rastro.BuscaEventosResponse();
    }

    /**
     * Create an instance of {@link RegistroUnidades }
     * 
     */
    public br.com.correios.webservice.rastro.RegistroUnidades createRegistroUnidades() {
        return new br.com.correios.webservice.rastro.RegistroUnidades();
    }

    /**
     * Create an instance of {@link ListaEntregaExterna2 }
     * 
     */
    public br.com.correios.webservice.rastro.ListaEntregaExterna2 createListaEntregaExterna2() {
        return new br.com.correios.webservice.rastro.ListaEntregaExterna2();
    }

    /**
     * Create an instance of {@link ObjetoPostal }
     * 
     */
    public br.com.correios.webservice.rastro.ObjetoPostal createObjetoPostal() {
        return new br.com.correios.webservice.rastro.ObjetoPostal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoMobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "endereco")
    public JAXBElement<br.com.correios.webservice.rastro.EnderecoMobile> createEndereco(br.com.correios.webservice.rastro.EnderecoMobile value) {
        return new JAXBElement<br.com.correios.webservice.rastro.EnderecoMobile>(_Endereco_QNAME, br.com.correios.webservice.rastro.EnderecoMobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadesSROResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "UnidadesSROResponse")
    public JAXBElement<br.com.correios.webservice.rastro.UnidadesSROResponse> createUnidadesSROResponse(br.com.correios.webservice.rastro.UnidadesSROResponse value) {
        return new JAXBElement<br.com.correios.webservice.rastro.UnidadesSROResponse>(_UnidadesSROResponse_QNAME, br.com.correios.webservice.rastro.UnidadesSROResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadesSRO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "UnidadesSRO")
    public JAXBElement<br.com.correios.webservice.rastro.UnidadesSRO> createUnidadesSRO(br.com.correios.webservice.rastro.UnidadesSRO value) {
        return new JAXBElement<br.com.correios.webservice.rastro.UnidadesSRO>(_UnidadesSRO_QNAME, br.com.correios.webservice.rastro.UnidadesSRO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RastroJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "RastroJson")
    public JAXBElement<br.com.correios.webservice.rastro.RastroJson> createRastroJson(br.com.correios.webservice.rastro.RastroJson value) {
        return new JAXBElement<br.com.correios.webservice.rastro.RastroJson>(_RastroJson_QNAME, br.com.correios.webservice.rastro.RastroJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEntregaExternaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "ListaEntregaExternaResponse")
    public JAXBElement<br.com.correios.webservice.rastro.ListaEntregaExternaResponse> createListaEntregaExternaResponse(br.com.correios.webservice.rastro.ListaEntregaExternaResponse value) {
        return new JAXBElement<br.com.correios.webservice.rastro.ListaEntregaExternaResponse>(_ListaEntregaExternaResponse_QNAME, br.com.correios.webservice.rastro.ListaEntregaExternaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Objeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "objeto")
    public JAXBElement<br.com.correios.webservice.rastro.Objeto> createObjeto(br.com.correios.webservice.rastro.Objeto value) {
        return new JAXBElement<br.com.correios.webservice.rastro.Objeto>(_Objeto_QNAME, br.com.correios.webservice.rastro.Objeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEntregaExterna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "ListaEntregaExterna")
    public JAXBElement<br.com.correios.webservice.rastro.ListaEntregaExterna> createListaEntregaExterna(br.com.correios.webservice.rastro.ListaEntregaExterna value) {
        return new JAXBElement<br.com.correios.webservice.rastro.ListaEntregaExterna>(_ListaEntregaExterna_QNAME, br.com.correios.webservice.rastro.ListaEntregaExterna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosLista")
    public JAXBElement<br.com.correios.webservice.rastro.BuscaEventosLista> createBuscaEventosLista(br.com.correios.webservice.rastro.BuscaEventosLista value) {
        return new JAXBElement<br.com.correios.webservice.rastro.BuscaEventosLista>(_BuscaEventosLista_QNAME, br.com.correios.webservice.rastro.BuscaEventosLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "evento")
    public JAXBElement<br.com.correios.webservice.rastro.Eventos> createEvento(br.com.correios.webservice.rastro.Eventos value) {
        return new JAXBElement<br.com.correios.webservice.rastro.Eventos>(_Evento_QNAME, br.com.correios.webservice.rastro.Eventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RastroJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "RastroJsonResponse")
    public JAXBElement<br.com.correios.webservice.rastro.RastroJsonResponse> createRastroJsonResponse(br.com.correios.webservice.rastro.RastroJsonResponse value) {
        return new JAXBElement<br.com.correios.webservice.rastro.RastroJsonResponse>(_RastroJsonResponse_QNAME, br.com.correios.webservice.rastro.RastroJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosResponse")
    public JAXBElement<br.com.correios.webservice.rastro.BuscaEventosResponse> createBuscaEventosResponse(br.com.correios.webservice.rastro.BuscaEventosResponse value) {
        return new JAXBElement<br.com.correios.webservice.rastro.BuscaEventosResponse>(_BuscaEventosResponse_QNAME, br.com.correios.webservice.rastro.BuscaEventosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sroxml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "rastro")
    public JAXBElement<br.com.correios.webservice.rastro.Sroxml> createRastro(br.com.correios.webservice.rastro.Sroxml value) {
        return new JAXBElement<br.com.correios.webservice.rastro.Sroxml>(_Rastro_QNAME, br.com.correios.webservice.rastro.Sroxml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventos")
    public JAXBElement<br.com.correios.webservice.rastro.BuscaEventos> createBuscaEventos(br.com.correios.webservice.rastro.BuscaEventos value) {
        return new JAXBElement<br.com.correios.webservice.rastro.BuscaEventos>(_BuscaEventos_QNAME, br.com.correios.webservice.rastro.BuscaEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaEventosListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "buscaEventosListaResponse")
    public JAXBElement<BuscaEventosListaResponse> createBuscaEventosListaResponse(BuscaEventosListaResponse value) {
        return new JAXBElement<BuscaEventosListaResponse>(_BuscaEventosListaResponse_QNAME, BuscaEventosListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destinos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://resource.webservice.correios.com.br/", name = "destino")
    public JAXBElement<br.com.correios.webservice.rastro.Destinos> createDestino(br.com.correios.webservice.rastro.Destinos value) {
        return new JAXBElement<br.com.correios.webservice.rastro.Destinos>(_Destino_QNAME, br.com.correios.webservice.rastro.Destinos.class, null, value);
    }

}
