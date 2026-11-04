package com.programacion.practica;


public class CuentaBancaria {

    private static String nombreBanco = "Banco del Guayas";
    private static int totalCuentasCreadas = 0;

    private final String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        
        if(titular==null){
        	this.titular = "Sin titular";
        }else {
        	this.titular = titular;
        }
        
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
        totalCuentasCreadas++;
    }

    public static String getNombreBanco() {
		return nombreBanco;
	}
    
	public static void setNombreBanco(String nombreBanco) {
		CuentaBancaria.nombreBanco = nombreBanco;
	}

	public static int getTotalCuentasCreadas() {
		return totalCuentasCreadas;
	}

	public String getTitular() {
		return titular;
	}
	
	public String setTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void depositar(double monto) {
        double bonificacion = 0;
        if (monto > 0) {
            if (monto >= 500) {
                bonificacion = 50;
            } else {
                bonificacion = 0;
            }
            saldo = saldo + monto + bonificacion;
            System.out.println("Deposito realizado correctamente");
            System.out.println("Bonificacion: $" + bonificacion);
        } else {
            System.out.println("Monto de deposito invalido");
        }
    }

    public boolean retirar(double monto) {
        double comision = 5;
        if (monto > 0 && saldo >= monto + comision) {
            saldo = saldo - monto - comision;
            System.out.println("Retiro realizado correctamente");
            return true;
        } else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }

    public static int getTotalCuentas() {
        return totalCuentasCreadas;
    }
}
