package visao;

import dominio.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse("2005-09-17", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate data2 = LocalDate.parse("2008-05-19", DateTimeFormatter.ISO_LOCAL_DATE);
		Period periodo = Period.between(data1,data2);
		int years = Math.abs(periodo.getYears());
		int months = Math.abs(periodo.getMonths());
		int days = Math.abs(periodo.getDays());
		
		Pessoa p1 = new Pessoa("Lucas",1,"Coca-cola","17-09-2005","19-05-2008");
		System.out.println("Nome pessoa 1: " + p1.getNome() + ";\nTrabalhou em: " + p1.getQtdEmpresas() + " Empresa(s);\nNome da empresa: " + p1.getnEmpresa() + ";\nData de entrada foi: " + p1.getDataE() + ";\nData de saida foi: " + p1.getDataS() + ";\nTotalizando " + years + " anos, " + months +  " meses " + days + " dias" + " nessa empresa" );
		System.out.println("--------------------------------");
		
		LocalDate data3 = LocalDate.parse("1990-12-20", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate data4 = LocalDate.parse("2003-05-02", DateTimeFormatter.ISO_LOCAL_DATE);
		Period periodo2 = Period.between(data3,data4);
		int years2 = Math.abs(periodo2.getYears());
		int months2 = Math.abs(periodo2.getMonths());
		int days2 = Math.abs(periodo2.getDays());
		
		Pessoa p2 = new Pessoa("Vinicius",1,"Santa Clara","20-12-1990", "02-05-2003");
		System.out.println("Nome pessoa 2: " + p2.getNome() + ";\nTrabalhou em: " + p2.getQtdEmpresas() + " Empresa;\nNome da empresa: " + p2.getnEmpresa() + ";\nData de entrada foi: " + p2.getDataE() + ";\nData de saida foi: " + p2.getDataS() + ";\nTotalizando " + years2 + " anos, " + months2 +  " meses " + days2 + " dias" + " na empresa " );
		System.out.println("--------------------------------");
		
		LocalDate data5 = LocalDate.parse("2004-11-15", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate data6 = LocalDate.parse("2012-08-09", DateTimeFormatter.ISO_LOCAL_DATE);
		Period periodo3 = Period.between(data5,data6);
		int years3 = Math.abs(periodo3.getYears());
		int months3 = Math.abs(periodo3.getMonths());
		int days3 = Math.abs(periodo3.getDays());
		
		Pessoa p3 = new Pessoa("Joao",1,"Honda","15-11-2004", "09-08-2012");
		
		System.out.println("Nome pessoa 3: " + p3.getNome() + ";\nTrabalhou em: " + p3.getQtdEmpresas() + " Empresa;\nNome da empresa: " + p3.getnEmpresa() +";\nData de entrada foi: " + p3.getDataE() + ";\nData de saida foi: " + p3.getDataS() + ";\nTotalizando " + years3 + " anos, " + months3 +  " meses " + days3 + " dias" + " na empresa " );
		System.out.println("--------------------------------");
		
		LocalDate data7 = LocalDate.parse("2007-02-11", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate data8 = LocalDate.parse("2021-09-17", DateTimeFormatter.ISO_LOCAL_DATE);
		Period periodo4 = Period.between(data7,data8	);
		int years4 = Math.abs(periodo4.getYears());
		int months4 = Math.abs(periodo4.getMonths());
		int days4 = Math.abs(periodo4.getDays());
	
		Pessoa p4 = new Pessoa("Maria",1,"Fiat","11-02-2007", "17-09-2021");
		System.out.println("Nome pessoa 4: " + p4.getNome() + ";\nTrabalhou em: " + p4.getQtdEmpresas() + " Empresa;\nNome da empresa: " + p4.getnEmpresa() +";\nData de entrada foi: " + p4.getDataE() + ";\nData de saida foi: " + p4.getDataS() + ";\nTotalizando " + years4 + " anos, " + months4 +  " meses " + days4 + " dias" + " na empresa " );
		System.out.println("--------------------------------");
		
		LocalDate data9 = LocalDate.parse("2019-09-18", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate data10 = LocalDate.parse("2022-03-29", DateTimeFormatter.ISO_LOCAL_DATE);
		Period periodo5 = Period.between(data9,data10);
		int years5 = Math.abs(periodo5.getYears());
		int months5 = Math.abs(periodo5.getMonths());
		int days5 = Math.abs(periodo5.getDays());
		
		Pessoa p5 = new Pessoa("Carlos",1,"Toyota","18-09-2019", "29-03-2022");
		System.out.println("Nome pessoa 5: " + p5.getNome() + ";\nTrabalhou em: " + p5.getQtdEmpresas() + " Empresa;\nNome da empresa: " + p5.getnEmpresa() +";\nData de entrada foi: " + p5.getDataE() + ";\nData de saida foi: " + p5.getDataS() + ";\nTotalizando " + years5 + " anos, " + months5 +  " meses " + days5 + " dias" + " na empresa " );
		System.out.println("--------------------------------");
	}

}