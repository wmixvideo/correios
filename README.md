# Correios

```java
final WSCorreios ws = new WSCorreios("USUARIO", "SENHA");
final Sroxml sro = ws.consultaObjeto("PJ907948743BR");
for (Objeto objeto : sro.getObjeto()) { 
    System.out.println(objeto.getNome());
    System.err.println(objeto.getErro());
    for (Eventos evento : objeto.getEvento()) {
        System.out.println(evento.getDescricao());
    }
}
```