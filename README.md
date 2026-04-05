# Lista de Exercícios 01 #
### Exercício 01 — Rastreamento de Variáveis
Considere o trecho de código abaixo:
```java
int a = 5;
int b = 3;
int c = a + b;
int d = a - b;
a = c;
b = d;
```
#### Tabela de rastreamento
| Linha                | a | b | c | d |
|---------------------|---|---|---|---|
| int a = 5           |   |   |   |   |
| int b = 3           |   |   |   |   |
| int c = a + b       |   |   |   |   |
| int d = a - b       |   |   |   |   |
| a = c               |   |   |   |   |
| b = d               |   |   |   |   |

**Observação:** Rastreie o valor de cada variável após cada linha executada. 

### Exercício 02 — Rastreamento de Variáveis
Considere o trecho de código abaixo:
```java
int x = 1;
int y = 2;
int z = 0;
z = z + x;
z = z + y;
z = z + (x * y);
x = z % 3;
```
#### Tabela de rastreamento
| Linha                   | x | y | z |
|------------------------|---|---|---|
| int x = 1              |   |   |   |
| int y = 2              |   |   |   |
| int z = 0              |   |   |   |
| z = z + x              |   |   |   |
| z = z + y              |   |   |   |
| z = z + (x * y)        |   |   |   |
| x = z % 3              |   |   |   |

**Observação:** Atenção: após x = z % 3, o valor de x muda.
