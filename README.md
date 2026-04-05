# Lista de Exercícios I #
### Parte 01 - Exercícios de Rastreamento de Variáveis (teste de mesa)
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

**⚠️ Observação:** Rastreie o valor de cada variável após cada linha executada. 

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

**⚠️ Observação:** Atenção: após x = z % 3, o valor de x muda.

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

**⚠️ Observação:** Use / para a parte inteira e % para o resto em cada decomposição.

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

**⚠️ Observação:** Guarde o valor antigo antes de sobrescrever — a ordem das atribuições é essencial.

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

**⚠️ Observação**: diff deve ser 0 — use isso para verificar se todos os passos anteriores estão corretos. Confira o gabarito no final do documento.

## Parte 02 - Exercícios de Programação
### Exercício 06  — Cálculo de salário líquido
Em uma empresa, o departamento de RH precisa calcular o salário líquido dos funcionários. Para isso, é necessário conhecer o valor da hora trabalhada, a quantidade de horas
trabalhadas no mês e a alíquota de desconto do INSS a ser aplicada sobre o salário bruto.

Escreva um programa em Java que leia o valor da hora trabalhada (double), o número de horas trabalhadas no mês (inteiro) e a alíquota do INSS em percentual (double). O programa deverá calcular e exibir o salário bruto, o valor descontado pelo INSS e o salário líquido, todos com duas casas decimais.
#### 📥 ENTRADAS
| Variável       | Tipo    | Descrição                          |
|----------------|---------|-----------------------------------|
| valorHora      | double  | Valor de cada hora trabalhada     |
| horasMes       | int     | Total de horas no mês             |
| aliquotaINSS   | double  | Percentual de desconto do INSS    |

#### 📤 SAÍDAS
| Descrição              | Fórmula                          |
|------------------------|----------------------------------|
| Salário bruto (R$)     | valorHora × horasMes             |
| Desconto INSS (R$)     | bruto × (alíquota / 100)         |
| Salário líquido (R$)   | bruto − desconto                 |

#### EXEMPLO
**Entrada**: valorHora = 25.50  |  horasMes = 160  |  aliquotaINSS = 11.0  
**Saída**:  Salário bruto: R$ 4080.00  |  Desconto INSS: R$ 448.80  |  Líquido: R$ 3631.20

### Exercício 07 — Custo de envio e prazo estimado
Uma transportadora cobra um valor fixo por quilo mais uma taxa de seguro sobre o valor declarado da mercadoria.  
O prazo de entrega é estimado dividindo a distância em km pela velocidade média de **500 km/dia** — o resultado deve ser expresso em **dias inteiros**.
Escreva um programa em Java que leia:
- o peso da encomenda em kg (**double**)
- o valor declarado da mercadoria (**double**)
- a distância até o destino em km (**int**)

O programa deverá calcular e exibir:
- o frete por peso  
- o valor do seguro  
- o total do frete (**todos com duas casas decimais**)  
- o prazo estimado (**dias inteiros**)

#### 📥 ENTRADAS
| Variável   | Tipo   | Descrição                     |
|------------|--------|------------------------------|
| pesoKg     | double | Peso da encomenda            |
| valorMerc  | double | Valor declarado              |
| distKm     | int    | Distância até o destino (km) |

#### 📤 SAÍDAS
| Descrição              | Fórmula                     |
|------------------------|-----------------------------|
| Frete por peso (R$)    | pesoKg × 3.20              |
| Seguro (R$)            | valorMerc × 0.02           |
| Total frete (R$)       | fretePeso + seguro         |
| Prazo (dias)           | distKm / 500               |

#### EXEMPLO

**Entrada**:  pesoKg = 12.5  |  valorMerc = 800.0  |  distKm = 1350  
**Saída**:  Frete: R$ 40.00  |  Seguro: R$ 16.00  |  Total: R$ 56.00  |  Prazo: 2 dia(s)

**⚠️ Observação**: O prazo usa **divisão inteira (int / int)** — o resto dos km é descartado automaticamente.

### Exercício 08 — Rendimento mensal e imposto de renda
Um investidor deseja saber quanto sua aplicação rendeu no mês e qual o imposto de renda a recolher.  
O rendimento bruto é calculado sobre o capital aplicado; o imposto incide sobre o rendimento bruto; o rendimento líquido é o valor que efetivamente fica na conta do investidor.

Escreva um programa em Java que leia:
- o capital aplicado (**double**)
- a taxa mensal em percentual (**double**)
- a alíquota do IR em percentual (**double**)

O programa deverá calcular e exibir:
- o rendimento bruto  
- o imposto  
- o rendimento líquido  
- o saldo total na conta  

Todos os valores devem ser exibidos com **duas casas decimais**.

#### 📥 ENTRADAS
| Variável     | Tipo   | Descrição                             |
|--------------|--------|--------------------------------------|
| capital      | double | Valor aplicado em R$                 |
| taxaMensal   | double | Taxa de rendimento mensal (%)        |
| aliquotaIR   | double | Alíquota do imposto de renda (%)     |

#### 📤 SAÍDAS
| Descrição               | Fórmula                             |
|------------------------|--------------------------------------|
| Rend. bruto (R$)       | capital × (taxaMensal / 100)        |
| Imposto IR (R$)        | rendBruto × (aliquotaIR / 100)      |
| Rend. líquido (R$)     | rendBruto − imposto                 |
| Saldo total (R$)       | capital + rendLiquido               |

#### EXEMPLO
**Entrada**:  capital = 15000.0  |  taxaMensal = 0.85  |  aliquotaIR = 15.0  
**Saída**:  Rend. bruto: R$ 127.50  |  Imposto: R$ 19.13  |  Líquido: R$ 108.38  |  Saldo: R$ 15108.38

**⚠️ Observação**: Use `double` para preservar precisão nos cálculos encadeados.

### Exercício 09 — Preço de venda com margem e desconto
Uma loja de varejo precisa definir o preço de venda de seus produtos.  
O comprador informa o custo de aquisição, a margem de lucro desejada e o percentual de desconto promocional.  
O desconto é aplicado sobre o preço já marcado, **não sobre o custo**.

Escreva um programa em Java que leia:
- o custo do produto (**double**)  
- a margem de lucro em percentual (**double**)  
- o desconto promocional em percentual (**double**)

O programa deverá calcular e exibir:
- o preço base  
- o valor do desconto  
- o preço final ao cliente  
- o lucro real obtido  

Todos os valores devem ser exibidos com **duas casas decimais**.

#### 📥 ENTRADAS
| Variável | Tipo   | Descrição                                   |
|----------|--------|---------------------------------------------|
| custo    | double | Custo de aquisição do produto               |
| margem   | double | Margem de lucro desejada (%)                |
| desconto | double | Desconto promocional (%)                    |

#### 📤 SAÍDAS
| Descrição              | Fórmula                              |
|------------------------|--------------------------------------|
| Preço base (R$)        | custo × (1 + margem / 100)          |
| Valor desconto (R$)    | precoBase × (desconto / 100)        |
| Preço final (R$)       | precoBase − valorDesc               |
| Lucro real (R$)        | precoFinal − custo                  |

#### EXEMPLO
**Entrada**:  custo = 120.0  |  margem = 40.0  |  desconto = 10.0  
**Saída**:  Preço base: R$ 168.00  |  Desconto: R$ 16.80  |  Final: R$ 151.20  |  Lucro: R$ 31.20

**⚠️ Observação**: O desconto incide sobre o **preço base**, não sobre o custo — leia o enunciado com atenção.

### Exercício 10 — Necessidade calórica e macronutrientes
Uma nutricionista precisa calcular a necessidade calórica diária de um paciente e distribuir as calorias entre carboidratos, proteínas e gorduras.  
A necessidade energética é estimada pelo peso multiplicado por um fator de atividade física.

Escreva um programa em Java que leia:
- o peso do paciente em kg (**double**)  
- o fator de atividade física (**double**)

O programa deverá calcular e exibir:
- o total de calorias  
- a distribuição por macronutriente:
  - 50% carboidratos  
  - 30% proteínas  
  - 20% gorduras  
- a soma dos três como verificação  

Utilize '%.0f' para exibir os valores **sem casas decimais**.

#### 📥 ENTRADAS
| Variável         | Tipo   | Descrição                          |
|------------------|--------|------------------------------------|
| pesoKg           | double | Peso do paciente em quilos         |
| fatorAtividade   | double | Fator de atividade (ex: 33.0)      |

#### 📤 SAÍDAS
| Descrição              | Fórmula                           |
|------------------------|-----------------------------------|
| Total kcal             | pesoKg × fatorAtividade           |
| Carboidratos (50%)     | kcalTotal × 0.50                  |
| Proteínas (30%)        | kcalTotal × 0.30                  |
| Gorduras (20%)         | kcalTotal × 0.20                  |
| Verificação            | carbo + proteina + gordura        |

#### EXEMPLO
**Entrada**:  pesoKg = 70.0  |  fatorAtividade = 33.0  
**Saída**:  Total: 2310 kcal  |  Carbo: 1155  |  Proteína: 693  |  Gordura: 462  |  Soma: 2310 kcal

**⚠️ Observação**: A soma dos três macronutrientes deve ser igual ao total — use isso para confirmar que o código está correto.

### Exercício 11 — Distância percorrida e velocidade final (MUV)
O movimento uniformemente variado (MUV) descreve objetos que se movem com aceleração constante.  
Essas fórmulas são usadas em simulações de veículos, jogos e sistemas embarcados.  
A potência \(t^2\) deve ser calculada manualmente como 't * t'.

Escreva um programa em Java que leia:
- a velocidade inicial em m/s (**double**)  
- a aceleração em m/s² (**double**)  
- o tempo em segundos (**double**)

O programa deverá calcular e exibir:
- a velocidade final  
- a distância total percorrida  
- a parcela de distância devida exclusivamente à aceleração  

Todos os valores devem ser exibidos com **duas casas decimais**.  
**Não utilize 'Math.pow()'**.

#### 📥 ENTRADAS
| Variável | Tipo   | Descrição                      |
|----------|--------|--------------------------------|
| v0       | double | Velocidade inicial (m/s)       |
| a        | double | Aceleração (m/s²)              |
| t        | double | Tempo (s)                      |

#### 📤 SAÍDAS
| Descrição                     | Fórmula                              |
|------------------------------|--------------------------------------|
| Velocidade final (m/s)       | v0 + a × t                           |
| Distância total (m)          | v0 × t + (a × t × t) / 2            |
| Parcela acelerada (m)        | (a × t × t) / 2                     |

#### EXEMPLO

**Entrada**:  v0 = 10.0  |  a = 3.0  |  t = 5.0  
**Saída**:  Vel. final: 25.00 m/s  |  Distância: 87.50 m  |  Parcela acelerada: 37.50 m

**⚠️ Observação**: t² deve ser escrito como 't * t' — não utilize funções prontas como 'Math.pow()'.

### Exercício 12 — Estimativa de material para construção
Antes de iniciar uma obra, engenheiros calculam a quantidade de material necessário.  
A área de tinta desconta a área de janelas e portas.  
O volume de concreto da laje é dado pela área multiplicada pela espessura.  
Esses cálculos fazem parte do orçamento preliminar de qualquer projeto.

Escreva um programa em Java que leia:
- a largura e a altura da parede (**double**)  
- a quantidade de aberturas (**int**)  
- a área média de cada abertura (**double**)  
- a espessura da laje (**double**)

O programa deverá calcular e exibir:
- a área bruta  
- a área líquida a pintar  
- o volume de concreto  

Todos com **duas casas decimais**.  

Calcule também a quantidade de latas de tinta como **inteiro** — cada lata cobre **12 m²** (use cast para `int`).

#### 📥 ENTRADAS
| Variável       | Tipo   | Descrição                                 |
|----------------|--------|--------------------------------------------|
| largura        | double | Dimensões da parede (m)                    |
| altura         | double | Dimensões da parede (m)                    |
| aberturas      | int    | Número de janelas e portas                 |
| areaAbertura   | double | Área média de cada abertura (m²)           |
| espessura      | double | Espessura da laje (m)                      |

#### 📤 SAÍDAS
| Descrição              | Fórmula                                  |
|------------------------|-------------------------------------------|
| Área bruta (m²)        | largura × altura                          |
| Área líquida (m²)      | bruta − (aberturas × areaAbertura)        |
| Volume laje (m³)       | areaBruta × espessura                     |
| Latas de tinta         | (int)(areaLiquida / 12)                   |

#### EXEMPLO
**Entrada**:  largura = 8.0  |  altura = 3.0  |  aberturas = 3  |  areaAbertura = 2.0  |  espessura = 0.12  
**Saída**:  Área bruta: 24.00 m²  |  Líquida: 18.00 m²  |  Vol. laje: 2.88 m³  |  Latas: 1

**⚠️ Observação**: O cast '(int)' trunca o decimal — o resultado corresponde ao número inteiro de latas completas.

### Exercício 13 — Franquia de internet e custo do excedente
Operadoras de telefonia cobram uma franquia mensal de dados e, caso o usuário ultrapasse o limite, é cobrado um valor por MB excedente.  
O controle é feito em megabytes, mas a franquia é contratada em gigabytes.  
Converter as unidades corretamente é essencial em sistemas de faturamento.

Escreva um programa em Java que leia:
- a franquia em GB (**double**)  
- o consumo do mês em MB (**double**)  
- o valor mensal do plano (**double**)  
- o preço por MB excedente (**double**)

O programa deverá calcular e exibir:
- a franquia convertida para MB  
- o excedente em MB  
- o custo do excedente  
- o total da fatura  

Todos os valores devem ser exibidos com **duas casas decimais**.  
Considere que o consumo informado **sempre ultrapassa a franquia**.

#### 📥 ENTRADAS
| Variável     | Tipo   | Descrição                              |
|--------------|--------|----------------------------------------|
| franquiaGB   | double | Franquia contratada em GB              |
| consumoMB    | double | Consumo realizado em MB                |
| valorPlano   | double | Mensalidade base em R$                 |
| precoPorMB   | double | Preço por MB excedente em R$           |

#### 📤 SAÍDAS
| Descrição               | Fórmula                             |
|------------------------|--------------------------------------|
| Franquia em MB         | franquiaGB × 1024                   |
| Excedente (MB)         | consumoMB − franquiaMB              |
| Custo excedente (R$)   | excedente × precoPorMB              |
| Total da fatura (R$)   | valorPlano + custoExc               |

#### EXEMPLO
**Entrada**:  franquiaGB = 15.0  |  consumoMB = 16384.0  |  valorPlano = 89.90  |  precoPorMB = 0.05  
**Saída**:  Franquia: 15360.00 MB  |  Excedente: 1024.00 MB  |  Custo: R$ 51.20  |  Total: R$ 141.10

**⚠️ Observação**: 1 GB = 1024 MB. Converta a franquia antes de calcular o excedente.

### Exercício 14 — Montante e juros em aplicação (3 meses)
Juros compostos são calculados sobre o montante acumulado a cada período.  
A fórmula do montante é amplamente usada em simulações de investimentos.  
Para calcular a potência fator³ sem usar **Math.pow()**, basta multiplicar o fator por si mesmo três vezes.

Escreva um programa em Java que leia:
- o capital inicial (**double**)  
- a taxa de juros mensal em percentual (**double**)

Considere um prazo fixo de **3 meses** (não precisa ser lido).
O programa deverá calcular e exibir:
- o fator de juros (**6 casas decimais**)  
- o montante após 3 meses (**2 casas decimais**)  
- o total de juros gerados (**2 casas decimais**)  

**Não utilize 'Math.pow()'**.

#### 📥 ENTRADAS
| Variável     | Tipo   | Descrição                           |
|--------------|--------|-------------------------------------|
| capital      | double | Valor inicial aplicado em R$         |
| taxaMensal   | double | Taxa de juros mensal (%)            |

#### 📤 SAÍDAS
| Descrição               | Fórmula                                      |
|------------------------|----------------------------------------------|
| Fator de juros         | 1 + taxaMensal / 100  (`%.6f`)               |
| Montante (R$)          | capital × fator × fator × fator (`%.2f`)     |
| Juros gerados (R$)     | montante − capital (`%.2f`)                  |

#### EXEMPLO

**Entrada**:  capital = 5000.0  |  taxaMensal = 2.5  
**Saída**:  Fator: 1.025000  |  Montante: R$ 5384.45  |  Juros: R$ 384.45

**⚠️ Observação**: 'fator * fator * fator' é equivalente a fator³ — essa técnica funciona para qualquer número fixo de períodos.

### Exercício 15 — Tempo de viagem interplanetária e decomposição de unidades
Sondas espaciais viajam a velocidades altíssimas, mas as distâncias no sistema solar são tão grandes que o tempo ainda é medido em anos, dias e horas.  
Decompor o tempo total em unidades menores usa o mesmo raciocínio de divisão inteira e resto visto nos exercícios de dígitos.

Escreva um programa em Java que leia:
- a distância até o destino em km (**double**)  
- a velocidade média da sonda em km/h (**double**)

O programa deverá calcular e exibir:
- o tempo total em horas  
- os anos completos  
- os dias restantes  
- as horas restantes  
- os minutos restantes  

O tempo total deve ser exibido com **duas casas decimais** e as demais unidades como **inteiros**.

#### 📥 ENTRADAS
| Variável       | Tipo   | Descrição                        |
|----------------|--------|----------------------------------|
| distanciaKm    | double | Distância até o destino em km    |
| velocidadeKmh  | double | Velocidade média da sonda em km/h |

#### 📤 SAÍDAS
| Descrição              | Fórmula                              |
|------------------------|--------------------------------------|
| Tempo total (horas)    | distanciaKm / velocidadeKmh          |
| Anos completos         | totalHorasInt / 8760                 |
| Dias restantes         | (totalHorasInt % 8760) / 24          |
| Horas restantes        | (totalHorasInt % 8760) % 24          |
| Minutos restantes      | (parte decimal) × 60                 |

#### EXEMPLO
**Entrada**:  distanciaKm = 628730000.0  |  velocidadeKmh = 60000.0  
**Saída**:  Tempo: 10478.83 h  |  Anos: 1  |  Dias: 58  |  Horas: 14  |  Minutos: 49

**⚠️ Observação**: Use '/' e '%' em sequência para cada nível da decomposição — o mesmo raciocínio do exercício de centenas, dezenas e unidades.
