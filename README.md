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

### Exercício 03 — Rastreamento de Variáveis
Considere o trecho de código abaixo:
```java
int n = 347;
int centena = n / 100;
int resto1  = n % 100;
int dezena  = resto1 / 10;
int unidade = resto1 % 10;
int soma    = centena + dezena + unidade;
```
#### Tabela de rastreamento
| Linha                      | n   | centena | resto1 | dezena | unidade | soma |
|---------------------------|-----|---------|--------|--------|---------|------|
| int n = 347               |     |         |        |        |         |      |
| centena = n / 100         |     |         |        |        |         |      |
| resto1 = n % 100          |     |         |        |        |         |      |
| dezena = resto1 / 10      |     |         |        |        |         |      |
| unidade = resto1 % 10     |     |         |        |        |         |      |
| soma = centena + dezena + unidade |     |         |        |        |         |      |

**Observação:** Use / para a parte inteira e % para o resto em cada decomposição.

### Exercício 04 — Rastreamento de Variáveis
```java
int a = 0;
int b = 1;
int c = a + b;
a = b;
b = c;
c = a + b;
a = b;
b = c;
int par = b % 2;
```
#### Tabela de rastreamento
| Linha           | a | b | c | par |
| --------------- | - | - | - | --- |
| int a = 0       |   |   |   |     |
| int b = 1       |   |   |   |     |
| c = a + b       |   |   |   |     |
| a = b           |   |   |   |     |
| b = c           |   |   |   |     |
| c = a + b       |   |   |   |     |
| a = b           |   |   |   |     |
| b = c           |   |   |   |     |
| int par = b % 2 |   |   |   |     |

**Observação:** Guarde o valor antigo antes de sobrescrever — a ordem das atribuições é essencial.

### Exercício 04 — Rastreamento de Variáveis
```java
int totalSeg = 3725;
int horas    = totalSeg / 3600;
int resto1   = totalSeg % 3600;
int minutos  = resto1 / 60;
int segundos = resto1 % 60;
int check    = (horas*3600)+(minutos*60)+segundos;
int diff     = totalSeg - check;
int par      = minutos % 2;
```
#### Tabela de rastreamento
| Linha                   | totalSeg | horas | resto1 | minutos | segundos | check | diff | par |
|------------------------|----------|-------|--------|---------|----------|-------|------|-----|
| totalSeg = 3725        |          |       |        |         |          |       |      |     |
| horas = totalSeg / 3600|          |       |        |         |          |       |      |     |
| resto1 = totalSeg % 3600|         |       |        |         |          |       |      |     |
| minutos = resto1 / 60  |          |       |        |         |          |       |      |     |
| segundos = resto1 % 60 |          |       |        |         |          |       |      |     |
| check = (horas*3600)+(minutos*60)+segundos | | | | | | | | |
| diff = totalSeg - check|          |       |        |         |          |       |      |     |
| par = minutos % 2      |          |       |        |         |          |       |      |     |

**⚠️Observação**: diff deve ser 0 — use isso para verificar se todos os passos anteriores estão corretos. Confira o gabarito no final do documento.
