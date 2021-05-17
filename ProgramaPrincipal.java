import java.sql.*;
import java.util.Scanner;

public class ProgramaPrincipal {

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

			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroPrincipal != 0);

	}

	public static void menuCadastroAlunos(Scanner teclado) {

		int opcaoMenuCadastroPrincipal = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO ALUNOS -------------------\n\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroPrincipal = teclado.nextInt();

			switch (opcaoMenuCadastroPrincipal) {
			case 1:
				cadastraSqlAluno(teclado);
				break;

			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroPrincipal != 6);

	}

	public static boolean cadastraSqlAluno(Scanner teclado) {

		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();
			System.out.print("\nDigite o nome do Aluno: ");
			String nomeAluno = teclado.nextLine();
			System.out.print("\nDigite o CPF do Aluno: ");
			String cpf = teclado.nextLine();
			String sqlCadastro = "INSERT into aluno (nomeAluno, cpf)VALUES" + "('"+ nomeAluno + "','" + cpf + "')";
			
		//	String sqlCadastro = "INSERT into aluno (codigoAluno, nomeAluno, cpf)VALUES" + "('" + codigoAluno + "','"
				//	+ nomeAluno + "','" + cpf + "')";
			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (con != null) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean consultaSqlAluno() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT * FROM ALUNO";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);

			while (result.next()) {

				System.out.println("CONSULTANDO DADOS");
				System.out.println("Codigo aluno....: " + result.getInt(1));
				System.out.println("Nome aluno....: " + result.getString(2));
				System.out.println("CPF aluno....: " + result.getString(3));
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean alteraSqlAluno() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlAltera = "UPDATE ALUNO SET cpf = 35555578369";
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlAltera);

			System.out.println("Atualizando DADOS");
			System.out.println("Dados atualizados na tabela");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean excluiSqlAluno() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlExclui = "DELETE FROM aluno";
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("Atualizando DADOS");
			System.out.println("Dados excluidos da tabela");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/GestaoDisciplinas";
		String usuario = "postgres";
		String senha = "Panda104455!";
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

		// consultando

		// System.out.printf("os dados foram\n", consultaSql());
	}
}
