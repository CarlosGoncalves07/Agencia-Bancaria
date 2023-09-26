package br.senai.sp.jandira;

import com.sun.source.tree.UsesTree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    private String nome;

    private long cpf, rg, telefone;



    public void cadastrarCliente(){
        System.out.println("//// ----- Cadastrar Cliente ----- ////");
        System.out.println(" Informe o seu nome ");
        nome = scanner.nextLine();
        System.out.println("informe o seu CPF");
        cpf = scanner.nextLong();
        System.out.println("Informe o seu RG");
        rg = scanner.nextLong();
        System.out.println("Informe o seu telefone");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");



    }























    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
