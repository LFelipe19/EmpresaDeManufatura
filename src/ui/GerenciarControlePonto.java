package ui;

import model.ControlePonto;
import model.Funcionario;
import model.Gerente;
import model.Operador;
import model.Secretaria;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        ControlePonto controlePonto = new ControlePonto();

        Gerente gerente = new Gerente(1, "Carlos Silva","@carlos@hotmail", "26789","carlossilva","12345");

        Operador operador = new Operador(2, "Ana Maria Brega","@anamaria","921837347", 200.0);


        Secretaria secretaria = new Secretaria(3,"Gabigol", "OMaiorDoBrasil@gmail.com", "19283849", "89983-2345","1234");


        System.out.println(controlePonto.registraEntrada(gerente));
        Thread.sleep(1000);


        System.out.println(controlePonto.registraEntrada(operador));
        Thread.sleep(1000);


        System.out.println(controlePonto.registraEntrada(secretaria));
        Thread.sleep(1000);


        System.out.println(controlePonto.registraSaida(gerente));
        Thread.sleep(1000);


        System.out.println(controlePonto.registraSaida(operador));
        Thread.sleep(1000);


        System.out.println(controlePonto.registraSaida(secretaria));

    }
}

