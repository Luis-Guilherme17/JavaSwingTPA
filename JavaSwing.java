//Olá, eu sou Luís e estou fazendo alguns exercicios de JavaSwing.

package com.mycompany.javaswing;

import javax.swing.JOptionPane;

public class JavaSwing {
    public static void main(String[] args)
    
        //Inicio da primeira tarefa
    {
        int ano = 0;
        int mes = 0;
        int dia = 0;
        int TotalDeDias = 0;
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos o mês que você está: "));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos o dia que você está: ")); 
        TotalDeDias = (ano * 365) + (mes * 30) + (dia);
        JOptionPane.showMessageDialog(null, "Você tem " + TotalDeDias + " dias de vida.");
        //Término da primeira tarefa    
    
        //Inicio da segunda tarefa
        //Tive que utilizar "double" ao invés de "int" para definir as variáveis por conta que não deram números inteiros
        double primeiraMedia = (8 + 9 + 7) / 3;
        double segundaMedia = (4 + 5 + 6) / 3;
        double somaDasMedias = primeiraMedia + segundaMedia;
        double mediaDasMedias = (primeiraMedia + segundaMedia) / 2;
        
        JOptionPane.showMessageDialog(null, "A primeira média é: " + primeiraMedia);
        JOptionPane.showMessageDialog(null, "A segunda média é: " + segundaMedia);
        JOptionPane.showMessageDialog(null, "A soma das médias é: " + somaDasMedias);
        JOptionPane.showMessageDialog(null, "A média das médias é: " + mediaDasMedias);
        //Término da segunda tarefa 
    
        //Inicio da terceira tarefa
        double saldo = 0;
        double reajuste = 0.01;
        double valorDoReajuste = 0;
        double valorFinal = 0;
        
        saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo: "));
        valorDoReajuste = saldo * reajuste;
        valorFinal = valorDoReajuste + saldo;
        JOptionPane.showMessageDialog(null, "O saldo após o reajuste é de: " + valorFinal);
        //Término da terceira tarefa
        
        //Inicio da quarta tarefa
        double p = 0;
        double valorUm = 0;
        double quantidadeUm = 0;
        double valorDois = 0;
        double quantidadeDois = 0;
        double valorTotal;
        
        p = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem: "));
        
        valorUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira peça: "));
        quantidadeUm = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da primeira peça: "));
        
        valorDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segunda peça: "));
        quantidadeDois = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da segunda peça: "));
        
        valorTotal = ((valorUm * quantidadeUm) + (valorDois * quantidadeDois)) * (p / 100 + 1);
        JOptionPane.showMessageDialog(null, "O valor total é de: " + "R$" + valorTotal);
        //Término da quarta tarefa
        
        //Inicio da quinta tarefa
        double salarioMin = 1000;
        double salarioDoUsuario = 0;
        double quantidadeDeSalariosMin = 0;
        
        salarioDoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salário: "));
        
        quantidadeDeSalariosMin = salarioDoUsuario / salarioMin;
        JOptionPane.showMessageDialog(null, "Você tem " + quantidadeDeSalariosMin + " salários mínimos");
        //Término da quinta tarefa
        
        //Inicio da sexta tarefa
        double numero = 0;
        double antecessor = 0;
        double sucessor = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        
        antecessor = (numero - 1);
        sucessor = (numero + 1);
        
        JOptionPane.showMessageDialog(null, "O antecessor é: " + antecessor);
        JOptionPane.showMessageDialog(null, "O sucessor é: " + sucessor);
        //Término da sexta tarefa
        
    }
    
}
