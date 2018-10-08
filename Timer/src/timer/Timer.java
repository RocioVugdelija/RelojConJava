package timer;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos;
		/*horas=0;
		minutos=0;
		segundos=0;*/
		Scanner tecl=new Scanner(System.in);
		System.out.println("Ingrese la hora actual para que empiece a correr el reloj (solo los dos dígitos de hora):");
		horas=tecl.nextInt();
		System.out.println("Ingrese los minutos de la hora actual para que empiece a correr el reloj (solo los dos dígitos de los minutos):");
		minutos=tecl.nextInt();
		System.out.println("Ingrese los segundos de la hora actual para que empiece a correr el reloj (solo los dos dígitos de los segundos):");
		segundos=tecl.nextInt();
		
		while (true){
			Thread.sleep(1000);
			segundos=segundos + 1;
			if (segundos>59){
				minutos= minutos + 1;
				segundos=0;
			}
			if (minutos>59){
				horas= horas + 1;
				minutos=0;
			}
			if (horas>24){
				horas= 0;
			}
			System.out.println("Hora actual: " + horas + ":" + minutos + ":" + segundos );
		}

	}

}
