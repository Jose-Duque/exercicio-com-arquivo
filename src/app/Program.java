package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pathIn = "C:\\temp\\in.txt";
		String pathOut = "C:\\temp\\out.txt";
		
		List<Product> product = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathIn))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] item = line.split(",");
				String name = item[0];
				double price =  Double.parseDouble(item[1]);
				int qtd = Integer.parseInt(item[2]);
				
				 product.add(new Product(name, price, qtd));
				 line = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){

				for(Product prod : product) {
					bw.write(prod.getName() + "," + String.format("%.2f",prod.total()));
					bw.newLine();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		} catch(IOException e) {
			 e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
