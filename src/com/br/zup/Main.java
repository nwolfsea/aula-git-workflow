package com.br.zup;

import java.util.HashMap;

public class Main {

    public static void main(String[] args, HashMap Alunos) {
        System.out.println("Esses são os alunos");
       for (Object alunos : Alunos.values()){
           System.out.println(" ->" + Alunos);
       }
    }
}