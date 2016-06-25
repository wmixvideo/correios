# Correios

Biblioteca para rastreamento de objetos no webservice dos Correios.

##Forma de uso

```java
final WSCorreios ws = new WSCorreios("USUARIO", "SENHA");

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
final Sroxml sro = ws.consultaObjeto(Arrays.asList("PJ907948743BR", "PJ907948743BR"));
for (Objeto objeto : sro.getObjeto()) { 
    System.out.println(objeto.getNome());
    System.err.println(objeto.getErro());
    for (Eventos evento : objeto.getEvento()) {
        System.out.println(evento.getDescricao());
    }
}
```