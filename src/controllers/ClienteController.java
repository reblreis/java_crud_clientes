package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {

	public void cadastrarCliente() {

		System.out.println("\n*** CADASTRO DE CLIENTES ***\n");

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("NOME DO CLIENTE.......: ");
		cliente.setNome(scanner.nextLine());

		System.out.print("EMAIL DO CLIENTE......: ");
		cliente.setEmail(scanner.nextLine());

		System.out.print("TELEFONE DO CLIENTE...: ");
		cliente.setTelefone(scanner.nextLine());

		System.out.print("CPF DO CLIENTE........: ");
		cliente.setCpf(scanner.nextLine());

		ClienteRepository clienteRepository = new ClienteRepository();

		try {
			clienteRepository.create(cliente);
			System.out.println("\nCLIENTE CADASTRADO COM SUCESSO!");
		} catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR CLIENTE!");
			e.printStackTrace(); // imprimir log do erro
		}

	}

}
