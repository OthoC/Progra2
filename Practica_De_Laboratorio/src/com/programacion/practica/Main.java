package com.programacion.practica;

public class Main {

	public static void main(String[] args) {
		

        CuentaBancaria cuenta1 = new CuentaBancaria("00000001", "Otho Cantos", 1000);

        CuentaBancaria cuenta2 = new CuentaBancaria("00000002", "Ana Peñaherrera", 300);

        System.out.println(">>CUENTA 1");

        cuenta1.depositar(600);
        cuenta1.retirar(200);

        System.out.println();
        
        System.out.println(">>CUENTA 2");

        cuenta2.depositar(100);
        cuenta2.retirar(500);

        System.out.println();
        
        System.out.println(">>ESTADO DE LAS CUENTAS");

        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        System.out.println();

        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo: $" + cuenta2.getSaldo());
        
        System.out.println();

        System.out.println(">>INFORMACION DEL BANCO");

        System.out.println("Banco: " + CuentaBancaria.getNombreBanco());

        System.out.println("Total de cuentas creadas: " + CuentaBancaria.getTotalCuentas());
    }


		
	}

