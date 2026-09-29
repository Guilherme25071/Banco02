/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
/**
 *
 * @author guilherme62977766
 */
public class ContaBancaria {
private double saldo;
private String titular;

public ContaBancaria(String titular) {
this.titular = titular;
this.saldo = 0.00;
    }
public String getTitular() {
return this.titular;
    }
public double getSaldo() {
return this.saldo;
    }
public void setTitular(String titular) {
this.titular = titular;
    }

// If
public void depositar(double valor) {
if (valor > 0) {
this.saldo = this.saldo + valor;
System.out.println("Depósito realizado com sucesso!");
} else {
System.out.println("Valor de depósito inválido.");
        }
    }

// If / Else
public void sacar(double valor) {
if (valor > 0 && valor <= this.saldo) {
this.saldo = this.saldo - valor;
System.out.println("Saque realizado com sucesso!");
} else {
System.out.println("Saldo insuficiente.");
        }
    }

// Else If
public void verificarSaldo() {
if (this.saldo == 0) {
System.out.println("Conta sem saldo.");
} else if (this.saldo <= 500) {
System.out.println("Saldo baixo.");
} else if (this.saldo <= 2000) {
System.out.println("Saldo normal.");
} else {
System.out.println("Saldo elevado.");
        }
    }

// For
public void exibirExtratoSimples() {
for (int i = 1; i <= 5; i++) {
System.out.println("Operação " + i);
        }
    }

// For recebendo quantidade
public void exibirOperacoes(int quantidade) {
for (int i = 1; i <= quantidade; i++) {
System.out.println("Operação " + i);
        }
    }
}
