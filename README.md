# Conta Terminal

Este projeto consiste em uma aplicação Java simples para interação via terminal, onde um usuário pode inserir seus dados bancários e visualizar uma mensagem de confirmação com essas informações.

## Funcionalidade

A aplicação solicita ao usuário as seguintes informações:
- Nome do cliente
- Número da agência
- Número da conta
- Saldo da conta

Após a entrada dos dados, a aplicação exibe uma mensagem formatada confirmando as informações inseridas.

## Tecnologias Utilizadas

- Linguagem: Java
- Ferramentas: Scanner (para entrada de dados via terminal)

## Como Executar o Projeto

1. Certifique-se de ter o Java instalado na sua máquina.
2. Compile o código utilizando o seguinte comando:
   ```sh
   javac ContaTerminal.java
   ```
3. Execute o programa com:
   ```sh
   java ContaTerminal
   ```
4. Insira as informações solicitadas no terminal.

## Exemplo de Uso

```sh
Por favor, digite o nome do cliente:
João Silva
Por favor, digite o número da agência:
1234-5
Por favor, digite o número da conta:
98765
Por favor, digite o saldo da conta:
1500.00

Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 1234-5, conta 98765 e seu saldo 1500.0 já está disponível para saque.
```

## Melhorias Futuras

- Implementação de tratamento de erros para entrada inválida.
- Melhor formatação da saída, incluindo casas decimais no saldo.
- Implementação de um menu interativo para realizar operações bancárias básicas.

## Autor

Projeto desenvolvido como parte do aprendizado em Java.

