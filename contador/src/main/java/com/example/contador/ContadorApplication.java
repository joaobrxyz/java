package com.example.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		int num;
		int n = 1;
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = leitura.nextInt();
		while (n <= num) {
			System.out.println(n);
			n++;
		}

		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Comprar um teclado novo");
		tarefa.setPessoaResponsavel("Estagiário");
		tarefa.setConcluida(false);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json!");

		Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON");
		System.out.println(tarefaLida);
	}
}
