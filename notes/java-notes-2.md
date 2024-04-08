# Palavras-chave e métodos especiais

## toString

```java
public class Car {

  // atributos, getters, setters, construtor

  public String toCsv() {
    return name + "," + color + "," + year;
  }

  // ideia base / implementacao manual
  public String toText() {
    return "Name: " + name + ", Color: " + color + ", Release Year: " + year;
  }

  @Override // sobreescrevendo
  public String toString() {
    String aux = ""
    aux += "Name: " + name;
    aux += ", Color: " + color + ", Release Year: " + year
    return aux;
  }
}
```

```java
Car ferrari = new Car("Ferrari 2018", "Vermelha", 2018);

// OBJETIVO: imprime(ferrari)

// System.out.println(ferrari.getName());
// System.out.println(ferrari.getCor());
// System.out.println(ferrari.getYear());

// sem fazer override no to string
System.out.println(ferrari); // model.Ferrari@2109712ksdja

// fazendo override no to string
System.out.println(ferrari); // Name: Ferrari 2018 Color: Vermelha, Release Year: 2018
```

## @Override

Override é usado quando queremos sobrepor um comportamento já existente em algum objeto.

## palavra `static`

`static`: diz que o atributo ou metodo nao depende de uma instancia de objeto

> Cuidado! static nao significa constante

- parecido com variavel global

- em atributos: as variaveis passam a ser compartilhadas e apenas criadas uma unica vez para todos os objetos. Ou seja, todas as circunferencias buscam na memoria um mesmo lugar guardando o valor de pi.

- em metodo: serve para criar funcoes que podem ser usadas sem o objeto

> Cuidado! essa funcao nao conhece nenhum objeto, eh apenas uma funcao em outra classe

coisas estaticas ja usadas:

```java
int result1 = Math.pow(2, 3); // 8
double result2 = Math.log10(100); // 2.0
```

-----

```java
public class Circle {

  public static double pi = 3.14;
  private String color;
  private double radius;

  // construtores, getters e setters

  public double getArea() {
    return pi*radius*radius;
  }

  public double getPerimeter() {
    return 2*pi*radius;
  }

  // toString

}
```

```java
System.out.println(Circle.pi)
```

----

```java
public class CircleUtils {

  public static double pi = 3.14;

  public static double calculatePerimeter(double radius) {
    return 2*pi*radius;
  }

}
```

```java
double perimeter = CircleUtils.calculatePerimeter(3.0);
```

-----

```java
public class Account {

  public static double operationTax = 5.0;

  private int id;
  private String holder;
  private double balance;

  // constructor, getter, setter

  public void deposit(double amount) {
    double amountToDeposit = amount - operationTax;
    balance += amountToDeposit;
  }

  public void withdraw(double amount) {
    double amountToWithdraw = amount + operationTax;

    if(amountToWithdraw > balance) {
      return;
    }

    balance -= amountToWithdraw;
  }

}
```

```java
Account.operationTax = 7;
```

## final

diz que uma coisa esta em seu estado final

- para atributos significa constante
- para metodos significa que nao podem mais ser sobreescritos

```java
public class Circle {
 public static final double pi = 3.14;
}
```
