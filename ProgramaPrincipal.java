import java.sql.*;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void pausa() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
	}

	public static void cls() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
	}

	public static void menuCadastrosPrincipal(Scanner teclado) {

		int opcaoMenuCadastroPrincipal = 0;

		do {
			System.out.println("\n------------------- MENU CADASTROS -------------------\n\n");
			System.out.println("[1] - Alunos");
			System.out.println("[2] - Professores");
			System.out.println("[3] - Disciplinas");
			System.out.println("[4] - Menu Anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroPrincipal = teclado.nextInt();

			switch (opcaoMenuCadastroPrincipal) {
			case 1:
				menuCadastroAlunos(teclado);
				break;
			case 2: menuCadastroProfessores(teclado);

			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroPrincipal != 0);

	}
	
	public static void menuCadastroAlunos(Scanner teclado) {

		int opcaoMenuCadastroPrincipal = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO ALUNOS -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroPrincipal = teclado.nextInt();

			switch (opcaoMenuCadastroPrincipal) {
			case 1:
				cadastraSqlAluno(teclado);
				pausa();
				break;
			case 2:
				alteraSqlAluno(teclado);
				pausa();
				break;
			case 3:
				excluiSqlAluno(teclado);
				pausa();
				break;
			case 4:
				consultaSqlAluno(teclado);
				pausa();
				break;
			case 5:
				listaTodosSqlAluno();
				pausa();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcaoMenuCadastroPrincipal != 6);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuCadastroProfessores(Scanner teclado) {

		int opcaoMenuCadastroPrincipal = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO PROFESSORES -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroPrincipal = teclado.nextInt();

			switch (opcaoMenuCadastroPrincipal) {
			case 1:
				cadastraSqlAluno(teclado);
				pausa();
				break;
			case 2:
				alteraSqlAluno(teclado);
				pausa();
				break;
			case 3:
				excluiSqlAluno(teclado);
				pausa();
				break;
			case 4:
				consultaSqlAluno(teclado);
				pausa();
				break;
			case 5:
				listaTodosSqlAluno();
				pausa();
				break;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroPrincipal != 6);
		System.out.println("\nRetornando ao menu anterior...");

	}
	
	public static void cadastraSqlAluno(Scanner teclado) {

		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();
			System.out.print("\nDigite o nome do Aluno: ");
			String nomeAluno = teclado.nextLine();
			System.out.print("\nDigite o CPF do Aluno: ");
			String cpf = teclado.nextLine();
			String sqlCadastro = "INSERT into aluno (nomeAluno, cpf)VALUES" + "('" + nomeAluno + "','" + cpf + "')";

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (con != null) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alteraSqlAluno(Scanner teclado) {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nAtualizando DADOS");
			System.out.print("\nDigite o código do aluno: ");
			int codigoAluno = teclado.nextInt();
			teclado.nextLine();
			System.out.print("\nDigite a alteração do nome: ");
			String alteraNome = teclado.nextLine();
			String sqlAltera = "update aluno set nomealuno = '" + alteraNome + "' where codigoAluno=" + codigoAluno;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlAltera);
			System.out.println("Dados atualizados na tabela");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void excluiSqlAluno(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUSÃO DE ALUNOS");
			System.out.print("\nDigite o código do aluno para exclusão: ");
			int codigoAluno = teclado.nextInt();
			String sqlExclui = "DELETE FROM aluno where codigoAluno = " + codigoAluno;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nAtualizando DADOS...");
			pausa();
			System.out.println("\nAluno excluido da tabela com sucesso !");
			pausa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void consultaSqlAluno(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTAS DE ALUNO INDIVIDUAL");
			teclado.nextLine();
			System.out.print("\nDigite o nome completo do aluno:  ");
			String nomeAluno = teclado.nextLine();
			String sqlConsulta = "SELECT * FROM ALUNO where nomealuno like '" + nomeAluno + "'\n";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);

			System.out.println("\n--------------- CONSULTANDO DADOS DOS ALUNOS ---------------\n");
			while (result.next()) {
				System.out.printf("Codigo: %d, Nome: %s, CPF: %s", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlAluno() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT * FROM ALUNO ORDER BY codigoAluno";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			// cls();
			System.out.println("\n--------------- CONSULTANDO DADOS DOS ALUNOS ---------------\n");

			while (result.next()) {
				// if (result == null) {
				// System.out.println("Não temos alunos cadastrados no momento :(");
				// }
				System.out.printf("\nCodigo: %d, Nome: %s, CPF: %s", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//String url = "jdbc:postgresql://localhost:5432/GestaoDisciplinas";
		//String usuario = "postgres";
		//String senha = "Panda104455!";
		ResultSet result = null;

		int opcaoMenuPrincipal = 0;
		do {
			System.out.println("Bem vindo a Gestão de Matrículas \n");
			System.out.println("------------------- MENU PRINCIPAL -------------------\n\n");
			System.out.println("[1] - Cadastros");
			System.out.println("[2] - Matriculas");
			System.out.println("[3] - Relatorios");
			System.out.println("[0] - Para encerrar");
			System.out.print("\nDigite a opção: ");
			opcaoMenuPrincipal = teclado.nextInt();

			switch (opcaoMenuPrincipal) {
			case 1:
				menuCadastrosPrincipal(teclado);
				break;
			// case 2:
			// menuMatriculas(teclado);
			// break;
			// case 3:
			// menuRelatorios(teclado);
			// break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenuPrincipal != 0);

	}
}
