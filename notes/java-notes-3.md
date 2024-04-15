# Herança e Polimorfismo

## Herança

inicialmente:

```java
public class MotoristaCarro {

  private String modeloCarro;
  private String placaCarro;
  private boolean temCarro;
  private String nome;
  private String cpf;
  private String cnh;
  private String tipoCnh;

  // construtores, getters, setters, ...

}

public class MotoristaMoto {

  private String modeloMoto;
  private String placaMoto;
  private boolean temMoto;
  private String nome;
  private String cpf;
  private String cnh;
  private String tipoCnh;

  // construtores, getters, setters, ...

}

public class MotoristaCaminhao {

  private String modeloCaminhao;
  private String placaCaminhao;
  private boolean temCaminhao;
  private String nome;
  private String cpf;
  private String cnh;
  private String tipoCnh;

  // construtores, getters, setters, ...

}
```

melhorando com herança:

> Quando pensamos que um tipo é parte de outro ou continuação de outro, provavelmente podemos usar herança para simplificar o código.

```java
public enum TipoCnh {
  CARRO,
  MOTO,
  CAMINHAO,
  MOTO_E_CARRO,
  MOTO_E_CAMINHAO,
  CARRO_E_CAMINHAO,
  MOTO_E_CARRO_E_CAMINHAO
}

public class Motorista {
  private String nome;
  private String cpf;
  private String cnh;
  private TipoCnh tipoCnh;

  // constructors, getters and setters
}

public class MotoristaCarro extends Motorista {
  private String modeloCarro;
  private String placaCarro;
  private boolean temCarro;

  // constructors, getters and setters
}

public class MotoristaMoto extends Motorista {
  private String modeloMoto;
  private String placaMoto;
  private boolean temMoto;

  // constructors, getters and setters
}

public class MotoristaCaminhoneiro extends Motorista {
  private String empresa;
  private String modeloCaminhoneiro;
  private String placaCaminhoneiro;
  private boolean temCaminhoneiro;

  // constructors, getters and setters
}
```

## Composição

tem um:

```java
public class Carro {
  private String placa;
  private String modelo;
}

public class MotoristaCarro {
  private Carro carro; // motorista tem um carro
}
```

```java
joao.setCarro(new Carro("123abc", "ferrari"));
joao.getCarro().getPlaca();
```

tem varios:

```java
public class Multa {
  private String motivo;
  private double valor;
}

public class Motorista {
  private List<Multa> multas; // um motorista tem varias multas
}
```

```json
{
  "nome" : "Dr. ...",
  "capacidade": 200,
  "endereco" : {
    "rua" : "Rua A",
    "cep" : "111.222-33"
  }
}
```
