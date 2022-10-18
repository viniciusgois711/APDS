package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Retangulo {

	private int a1, b1, a2, b2, za1, zb1, za2, zb2;
	
	
	public void Colisao() {

		String path = "C:\\Users\\luvin\\OneDrive\\Área de Trabalho\\APDS\\colisoes";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while ((linha) != null) {	

				String[] x = linha.split(" ");

				a1 = Integer.parseInt(x[0]);
				b1 = Integer.parseInt(x[1]);
				a2 = Integer.parseInt(x[2]);
				b2 = Integer.parseInt(x[3]);

				linha = br.readLine();
				String[] y = linha.split(" ");
				za1 = Integer.parseInt(y[0]);
				zb1 = Integer.parseInt(y[1]);
				za2 = Integer.parseInt(y[2]);
				zb2 = Integer.parseInt(y[3]);

				if (a2 < za1 || za2 < a1 || b2 < zb1 || zb2 < b1 || a1 > za2 || za1 > a2 || b1 > zb2 || zb1 > b2) {
					System.out.println("0");

				} else {
					System.out.println("1");
				}

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

}