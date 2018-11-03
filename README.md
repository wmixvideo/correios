# Correios

Biblioteca para rastreamento de objetos no webservice dos Correios.

[![Build Status](https://travis-ci.org/wmixvideo/correios.svg?branch=master)](http://travis-ci.org/#!/wmixvideo/correios)
[![Coverage Status](https://coveralls.io/repos/github/wmixlabs/correios/badge.svg?branch=master)](https://coveralls.io/github/wmixlabs/correios?branch=master)
[![Apache 2.0 License](https://img.shields.io/badge/license-apache%202.0-green.svg) ](https://github.com/wmixlabs/correios/blob/master/LICENSE)

## Forma de uso

```java
final WSCorreiosRastreador ws = new WSCorreiosRastreador("USUARIO", "SENHA");

//consultar um unico objeto
final Sroxml sro = ws.consultaObjeto("PJ907948743BR");
for (Objeto objeto : sro.getObjeto()) { 
    System.out.println(objeto.getNome());
    System.err.println(objeto.getErro());
    for (Eventos evento : objeto.getEvento()) {
        System.out.println(evento.getDescricao());
    }
}

//consultar um varios objetos
final Sroxml sro = ws.consultaObjetos(Arrays.asList("PJ907948743BR", "PJ907948743BR"));
for (Objeto objeto : sro.getObjeto()) { 
    System.out.println(objeto.getNome());
    System.err.println(objeto.getErro());
    for (Eventos evento : objeto.getEvento()) {
        System.out.println(evento.getDescricao());
    }
}

//consultar um prazo de entrega
new WSCorreiosCalculador().calculaPrazo("40010", "88101250", "89893000");
```
