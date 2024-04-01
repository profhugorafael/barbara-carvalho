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
