
## Classes abstratas

São classes que não produzem objetos, servem apenas para serem herdadas e continuadas por outras.

```java
public abstract class Veiculo {
  private String modelo;
  private String marca;
  private int ano;
}

public class Moto extends Veiculo {
  private String numeroChassi;
}

public class Carro extends Veiculo {
  private boolean temPortaMalas;
}


// nao funciona
Veiculo v1 = new Veiculo(); 

// ok
Moto m1 = new Moto();
Carro c1 = new Carro();
```

```java
public abstract class Pessoa {
  private String nome;
  private String cpf;
}

public class Aluno extends Pessoa {
  private String ra;
  private double nota;
}

public class Funcionario extends Pessoa {
  private double salario;
}
```

## Upcasting e Downcasting

> lembrar de casting

Casting signigica elencar. Casting permite converter/ajustar tipos entre int, double, float e afins.

```java
int a = 1;
int b = 2;
double resultado = (double) a / b;
```

```java
Pessoa p1 = new Aluno();
```
