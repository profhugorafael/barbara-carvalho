# POO

## Trocar duas variaveis

```java
Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt(); // 2
int b = scanner.nextInt(); // 3

// a = 2; b = 3
int antigo_a = a;  // a = 2; b= 3; antigo_a = 2
a = b; // a = 3; b= 3; antigo_a = 2
b = antigo_a; // a = 2; b= 3; antigo_a = 2
```

## Classe

- molde
- classificacao

```java
void main() {
  String[] names = new String[1000];
  int[] ages = new int[1000];
  double[] heights = new double[1000];
}
```

- problemas da abordagem
- temos um maior gasto para interpretar as variaveis
- dificuldade em trocar variaveis
- dificuldade em criar funcoes com todas as informacoes da pessoa

melhorando...

```java
public class Pessoa {
  public String name;
  public int age;
  public double height;

  public double somar(double a, double b){
    return a + b;
  }
}
```

```java
Pessoa joao = new Pessoa();

Pessoa[] pessoas = new Pessoa[1000];

joao.name = "Joao da Silva";
joao.age = 25;
joao.height = 1.8;

double result = joao.somar(2, 3);
```

## objeto

- fruto do molde/classe
- instancia
- caso particular

## construtores

```java
public class Car {

  public String brand;
  public int year;
  public String owner;

  // ...

}
```

construtor padrao ou construtor sem argumentos:

```java
public Car() {
  
}
```

todas as vezes que escrevo um construtor tiro o construtor padrao:

exemplo: AllArgsContructor

```java
public Car(String brand, int year, String owner) {
  this.brand = brand;
  this.year = year;
  this.owner = owner;
}
```

sobrecarga: varios construtores diferenciados pelos parametros

```java
public Car() {
}

public Car(String brand, int year) {
  this.brand = brand;
  this.year = year;
}

public Car(String brand, int year, String owner) {
  this.brand = brand;
  this.year = year;
  this.owner = owner;
}
```

---

sobrecarga em metodos, exemplo com uma possivel estrutura de dados:

```java
public void adicionaNoArray(int elemento) {
  adicionaNoArray(elemento, 0);
}

private void adicionaNoArray(int elemento, int pos) {
  if(array[pos] == null) {
    array[pos] = elemento;
    return;
  }

  adicionaNoArray(elemento, pos + 1);
}
```

```java
adicionaNoArray(2);
```

## Getters and Setters

```java
public class Car {

  private String brand;
  private int year;
  private String owner;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}
```

```java
Car ferrari = new Car();

ferrari.brand = "Ferrari";
ferrari.retrieveYear();

System.out.println(ferrari.brand);
System.out.println(ferrari.retrieveYear());
```

## Encapsulamento

deixar as logicas da classe dentro da classe

ver mais:

- Single Responsability Principle

Classes que tem apenas atributos e seus getters and setters sao chamadas de POJO (Plain Old Java Object) ou de classes anemicas.

```java
public class Account {
  private String holder;
  private double balance;

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  // public void setBalance(double balance) {
  //   this.balance = balance;
  // }

  public void deposit(double amount) {
    balance += amount;
  }

  // early return
  public void withdraw(double amount) {
    if(balance < amount){
      System.out.println("Not enough balance");
      return;
    } 
    
    balance -= amount;
  }
}
```

```java
public class Product {

  private String name;
  private double price;
  private int quantity;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  // public void setQuantity(int quantity) {
  //   this.quantity = quantity;
  // }

  public void increaseQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void decreaseQuantity(int quantity) {
    this.quantity -= quantity;
  }

  public double getValueInStock() {
    return price * quantity;
  }
}
```

## (extra) Early return

```java
public boolean ehPar(int numero) {
  if(numero % 2 == 0) {
    return true;
  } 
  
  return false;
} 
```

```java
public boolean ehPrimo(int numero) {
  for(int i = 2; i < numero; i++){
    if(numero%i == 0)
      return false;
  }

  return true;
}
```
