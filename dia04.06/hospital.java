package luiz_java;


import java.util.Scanner;

public class Hospital {


public static String [] consultasPaciente = new String[255];
public static int [] numeroConsultasMedico = new int [255];

public static String cpfConsulta, medicoConsulta, data;

public static int dia, mes, ano;

public static Scanner entrada = new Scanner(System.in);

Medico medico = new Medico();
	
	public static void registrarConsulta() {
		
		System.out.println("CPF do paciente:");
        cpfConsulta = entrada.nextLine();

        System.out.println("Nome do médico:");
        medicoConsulta = entrada.nextLine();
        
        System.out.println(Paciente.cpfPaciente[0]);
    	System.out.println(Medico.nomeMedico[0]);
        for (int i = 0; i < Paciente.numeroPacientes; i ++) {
        	if (cpfConsulta.equalsIgnoreCase(Paciente.cpfPaciente[i]) && medicoConsulta.equalsIgnoreCase(Medico.nomeMedico[i])) {

                System.out.println("Ano da consulta:");
                ano = entrada.nextInt();
                System.out.println("Mês da consulta:");
                mes = entrada.nextInt();
                System.out.println("Dia da consulta:");
                dia = entrada.nextInt();
                
                entrada.nextLine();
                
                data = dia + "/" + mes + "/" + ano;
                
              
                consultasPaciente[i] = consultasPaciente[i] + "\n" + data;
                
                System.out.println("Consulta registrada.");
        	}
        }
        Main.main(null);
	}
	
	public static void consultasPaciente() {
		System.out.println("CPF do paciente:");
        
        cpfConsulta = entrada.nextLine();
        
        for (int i = 0; i < Paciente.numeroPacientes; i ++) {
        	if (cpfConsulta.equalsIgnoreCase(Paciente.cpfPaciente[i])) {
        		System.out.println(consultasPaciente[i]);
        		Main.main(null);
        	}
        }
	}
}
