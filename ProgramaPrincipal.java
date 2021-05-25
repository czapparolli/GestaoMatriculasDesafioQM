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
			case 2:
				menuCadastroProfessores(teclado);
				break;

			case 3:
				menuCadastroDisciplinas(teclado);
				break;

			case 4:
				break;

			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroPrincipal != 4);

	}

	public static void menuCadastroAlunos(Scanner teclado) {

		int opcaoMenuCadastroAlunos = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO ALUNOS -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroAlunos = teclado.nextInt();

			switch (opcaoMenuCadastroAlunos) {
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
			case 6:
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcaoMenuCadastroAlunos != 6);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuCadastroProfessores(Scanner teclado) {

		int opcaoMenuCadastroProfessores = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO PROFESSORES -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroProfessores = teclado.nextInt();

			switch (opcaoMenuCadastroProfessores) {
			case 1:
				cadastraSqlProfessor(teclado);
				pausa();
				break;
			case 2:
				alteraSqlProfessor(teclado);
				pausa();
				break;
			case 3:
				excluiSqlProfessor(teclado);
				pausa();
				break;
			case 4:
				consultaSqlProfessor(teclado);
				pausa();
				break;
			case 5:
				listaTodosSqlProfessor();
				pausa();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroProfessores != 6);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuCadastroDisciplinas(Scanner teclado) {

		int opcaoMenuCadastroDisciplinas = 0;

		do {
			System.out.println("\n------------------- MENU CADASTRO DISCIPLINAS -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Alterar");
			System.out.println("[3] - Excluir");
			System.out.println("[4] - Consultar");
			System.out.println("[5] - Listar Todos");
			System.out.println("[6] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroDisciplinas = teclado.nextInt();

			switch (opcaoMenuCadastroDisciplinas) {
			case 1:
				cadastraSqlDisciplina(teclado);
				pausa();
				break;
			case 2:
				alteraSqlDisciplina(teclado);
				pausa();
				break;
			case 3:
				excluiSqlDisciplina(teclado);
				pausa();
				break;
			case 4:
				consultaSqlDisciplina(teclado);
				pausa();
				break;
			case 5:
				listaTodosSqlDisciplina();
				pausa();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroDisciplinas != 6);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuCadastroMatriculas(Scanner teclado) {

		int opcaoMenuCadastroMatriculas = 0;

		do {
			System.out.println("\n------------------- MENU DE MATRICULAS -------------------\n");
			System.out.println("[1] - Cadastrar");
			System.out.println("[2] - Remover");
			System.out.println("[3] - Disciplinas de um Aluno");
			System.out.println("[4] - Alunos de uma disciplina");
			System.out.println("[5] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuCadastroMatriculas = teclado.nextInt();

			switch (opcaoMenuCadastroMatriculas) {
			case 1:
				cadastraSqlMatricula(teclado);
				pausa();
				break;
			case 2:
				removeSqlMatricula(teclado);
				pausa();
				break;
			case 3:
				consultaDisciplinaSqlAlunos(teclado);
				pausa();
				break;
			case 4:
				consultaAlunosEmSqlDisciplina(teclado);
				pausa();
				break;
			case 5:
				break;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuCadastroMatriculas != 5);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuRelatorios(Scanner teclado) {

		int opcaoMenuRelatorios = 0;

		do {
			System.out.println("\n------------------- MENU DE RELATÓRIOS -------------------\n");
			System.out.println("[1] - Listar disciplinas sem alunos");
			System.out.println("[2] - Listar alunos sem matriculas");
			System.out.println("[3] - Listar professores sem disciplinas");
			System.out.println("[4] - Listar total de carga horário do aluno ");
			System.out.println("[5] - Menu anterior");
			System.out.print("\nDigite a opção: ");
			opcaoMenuRelatorios = teclado.nextInt();

			switch (opcaoMenuRelatorios) {
			case 1:
				listaDisciplinasSemAlunos();
				pausa();
				break;
			case 2:
				litaAlunosSemMatriculas();
				pausa();
				break;
			case 3:
				listaProfessoresSemDisciplinas();
				pausa();
				break;
			case 4:
				listarTotalCargaHorariaAluno();
				pausa();
				break;
			case 5:
				break;
			default:
				System.out.println("Opção inválida!");

			}
		} while (opcaoMenuRelatorios != 5);
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

	public static void cadastraSqlProfessor(Scanner teclado) {

		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();
			System.out.print("\nDigite o nome do Professor: ");
			String nomeProfessor = teclado.nextLine();
			System.out.print("\nDigite o CPF do Professor: ");
			String cpf = teclado.nextLine();
			String sqlCadastro = "INSERT into PROFESSOR (nomeProfessor, cpf)VALUES" + "('" + nomeProfessor + "','" + cpf
					+ "')";

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

	public static void cadastraSqlDisciplina(Scanner teclado) {

		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.print("\nDigite o codigo da Disciplina: ");
			int codigoDisciplina = teclado.nextInt();
			teclado.nextLine();
			System.out.print("\nDigite o nome da disciplina: ");
			String nomeDisciplina = teclado.nextLine();
			System.out.print("\nDigite a carga horária da disciplina: ");
			int cargaHoraria = teclado.nextInt();
			System.out.print("\nDigite o código do professor responsável pela disciplina: ");
			int codigoProfessor = teclado.nextInt();
			String sqlCadastro = "INSERT into DISCIPLINA (codigodisciplina, nomeDisciplina, cargaHoraria, codigoProfessor)VALUES"
					+ "('" + codigoDisciplina + "','" + nomeDisciplina + "','" + cargaHoraria + "','" + codigoProfessor
					+ "')";

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

	public static void cadastraSqlMatricula(Scanner teclado) {

		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();
			System.out.print("\nDigite o código da disciplina: ");
			String codigoDisciplina = teclado.nextLine();
			System.out.print("\nDigite o código do Aluno: ");
			String codigoAluno = teclado.nextLine();
			String sqlCadastro = "INSERT into matricula (codigoDisciplina, codigoAluno)VALUES" + "('" + codigoDisciplina
					+ "','" + codigoAluno + "')";

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

	public static void alteraSqlProfessor(Scanner teclado) {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nAtualizando DADOS...");
			System.out.print("\nDigite o código do Professor: ");
			int codigoProfessor = teclado.nextInt();
			teclado.nextLine();
			System.out.print("\nDigite a alteração do nome: ");
			String alteraNome = teclado.nextLine();
			String sqlAltera = "update professor set nomeprofessor = '" + alteraNome + "' where codigoprofessor="
					+ codigoProfessor;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlAltera);
			System.out.println("\nDados atualizados na tabela");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void alteraSqlDisciplina(Scanner teclado) {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nAtualizando DADOS...");
			System.out.print("\nDigite o código da Disciplina: ");
			int codigoDisciplina = teclado.nextInt();
			teclado.nextLine();
			System.out.print("\nDigite o novo nome da Disciplina: ");
			String alteraNome = teclado.nextLine();
			System.out.print("\nDigite a nova carga horária da Disciplina: ");
			int alteraCargaHoraria = teclado.nextInt();
			System.out.print("\nDigite o código do novo professor responsável: ");
			int alteraCodigoProfessor = teclado.nextInt();
			String sqlAltera = "update disciplina set nomedisciplina = '" + alteraNome + "', cargahoraria = '"
					+ alteraCargaHoraria + "', codigoprofessor = '" + alteraCodigoProfessor
					+ "'   where codigodisciplina=" + codigoDisciplina;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlAltera);
			System.out.println("\nDados atualizados na tabela");
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

	public static void excluiSqlProfessor(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUSÃO DE PROFESSORES");
			System.out.print("\nDigite o código do professor para exclusão: ");
			int codigoProfessor = teclado.nextInt();
			String sqlExclui = "DELETE FROM professor where codigoprofessor = " + codigoProfessor;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nAtualizando DADOS...");
			pausa();
			System.out.println("\nProfessor excluido da tabela com sucesso !");
			pausa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void excluiSqlDisciplina(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUSÃO DE DISCIPLINAS");
			System.out.print("\nDigite o código da disciplina para exclusão: ");
			int codigoDisciplina = teclado.nextInt();
			String sqlExclui = "DELETE FROM disciplina where codigodisciplina = " + codigoDisciplina;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nExcluindo DADOS...");
			pausa();
			System.out.println("\nDisciplina excluido da tabela com sucesso !");
			pausa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSqlMatricula(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUSÃO DE MATRICULAS");
			System.out.print("\nDigite o código da matricula para exclusão: ");
			int codigoMatricula = teclado.nextInt();
			String sqlExclui = "DELETE FROM matricula where codigomatricula = " + codigoMatricula;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nExcluindo DADOS...");
			pausa();
			System.out.println("\nMatricula excluida da tabela com sucesso !");
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
				System.out.printf("| Codigo: %d | Aluno: %s | CPF: %s |", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void consultaSqlProfessor(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTAS DE PROFESSOR INDIVIDUAL");
			teclado.nextLine();
			System.out.print("\nDigite o nome completo do professor:  ");
			String nomeProfessor = teclado.nextLine();
			String sqlConsulta = "SELECT * FROM Professor where nomeprofessor like '" + nomeProfessor + "'\n";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);

			System.out.println("\n--------------- CONSULTANDO DADOS DO PROFESSOR ---------------\n");
			while (result.next()) {
				System.out.printf("| Codigo: %d | Professor: %s | CPF: %s |", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void consultaSqlDisciplina(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTAS DE DISCIPLINAS INDIVIDUAL");
			teclado.nextLine();
			System.out.print("\nDigite o nome da disciplina: ");
			String nomeDisciplina = teclado.nextLine();
			String sqlConsulta = "SELECT DISCIPLINA.codigodisciplina, DISCIPLINA.nomedisciplina, DISCIPLINA.cargahoraria, PROFESSOR.nomeprofessor FROM DISCIPLINA, PROFESSOR "
					+ "where DISCIPLINA.codigoprofessor = PROFESSOR.codigoprofessor AND nomedisciplina like '"
					+ nomeDisciplina + "'\n";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);

			System.out.println("\n--------------- CONSULTANDO DADOS DA DISCIPLINA ---------------\n");
			while (result.next()) {
				System.out.printf("| Codigo: %d | Disciplina: %s | Carga Horária: %d | Professor: %s |",
						result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void consultaAlunosEmSqlDisciplina(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTA DE ALUNOS EM UMA DISCIPLINA");
			teclado.nextLine();
			System.out.print("\nDigite o código da disciplina: ");
			String codigoDisciplina = teclado.nextLine();
			System.out.println();
			String sqlConsulta = "SELECT ALUNO.nomeAluno FROM MATRICULA,DISCIPLINA, ALUNO "
					+ "where MATRICULA.codigoaluno = ALUNO.codigoaluno and MATRICULA.codigodisciplina = DISCIPLINA.codigodisciplina and MATRICULA.codigoDisciplina = '"
					+ codigoDisciplina + "'\n";
			String sqlConsultaTeste = "SELECT DISCIPLINA.codigoDisciplina, DISCIPLINA.nomeDisciplina FROM disciplina where codigoDisciplina = '"
					+ codigoDisciplina + "'";
			Statement stmConsulta = con.createStatement();
			Statement stmConsulta1 = con.createStatement();
			ResultSet result = null;
			ResultSet result1 = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			result1 = stmConsulta1.executeQuery(sqlConsultaTeste);

			boolean results = stmConsulta.execute(sqlConsulta);

			while (result1.next()) {
				System.out.printf("Codigo: %d | Disciplina: %s", result1.getInt(1), result1.getString(2));
				System.out.println();

			}

			do {
				if (results) {
					ResultSet rs = stmConsulta.getResultSet();
					System.out.println();
					while (rs.next()) {

						System.out.println(" Aluno: : " + rs.getString(1));
					}
				}
				System.out.println();
				results = stmConsulta.getMoreResults();
			} while (results);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void consultaDisciplinaSqlAlunos(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTA DE DISCIPLINAS DE UM ALUNO");
			teclado.nextLine();
			System.out.print("\nDigite o código do aluno: ");
			String codigoAluno = teclado.nextLine();
			System.out.println();
			String sqlConsulta = "SELECT DISCIPLINA.nomeDisciplina FROM MATRICULA,DISCIPLINA, ALUNO "
					+ "where MATRICULA.codigoaluno = ALUNO.codigoaluno and MATRICULA.codigodisciplina = DISCIPLINA.codigodisciplina and MATRICULA.codigoAluno = '"
					+ codigoAluno + "'\n";
			String sqlConsultaTeste = "SELECT ALUNO.codigoAluno, ALUNO.nomeAluno FROM aluno where codigoAluno = '"
					+ codigoAluno + "'";
			Statement stmConsulta = con.createStatement();
			Statement stmConsulta1 = con.createStatement();
			ResultSet result = null;
			ResultSet result1 = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			result1 = stmConsulta1.executeQuery(sqlConsultaTeste);

			boolean results = stmConsulta.execute(sqlConsulta);

			while (result1.next()) {
				System.out.printf("Codigo: %d | Aluno: %s", result1.getInt(1), result1.getString(2));
				System.out.println();

			}

			do {
				if (results) {
					ResultSet rs = stmConsulta.getResultSet();
					System.out.println();
					while (rs.next()) {

						System.out.println(" Disciplina: " + rs.getString(1));
					}
				}
				System.out.println();
				results = stmConsulta.getMoreResults();
			} while (results);

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
			System.out.println("\n--------------- LISTANDO TODOS OS ALUNOS ---------------\n");

			while (result.next()) {
				// if (result == null) {
				// System.out.println("Não temos alunos cadastrados no momento :(");
				// }
				System.out.printf("Codigo: %d | Aluno: %s | CPF: %s", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlProfessor() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT * FROM PROFESSOR ORDER BY codigoProfessor";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			System.out.println("\n--------------- LISTANDO TODOS OS PROFESSORES ---------------\n");

			while (result.next()) {
				System.out.printf("Codigo: %d | Professor: %s | CPF: %s\n", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlDisciplina() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT DISCIPLINA.codigodisciplina, DISCIPLINA.nomedisciplina, DISCIPLINA.cargahoraria, PROFESSOR.nomeprofessor FROM DISCIPLINA, PROFESSOR where DISCIPLINA.codigoprofessor = PROFESSOR.codigoprofessor ORDER BY codigodisciplina";

			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			System.out.println("\n--------------- LISTANDO TODAS AS DISCIPLINAS ---------------\n");

			while (result.next()) {
				System.out.printf("Codigo: %d | Disciplina: %s | Carga horária: %d | Professor responsável: %s |\n",
						result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaDisciplinasSemAlunos() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT DISCIPLINA.codigodisciplina, DISCIPLINA.nomedisciplina from disciplina left join matricula on MATRICULA.codigomatricula = DISCIPLINA.codigomatricula where matricula is null order by DISCIPLINA.codigodisciplina";

			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			boolean results = stmConsulta.execute(sqlConsulta);
			System.out.println("\n--------------- LISTANDO TODAS AS DISCIPLINAS SEM MATRICULAS ---------------\n");

			do {
				if (results) {
					ResultSet rs = stmConsulta.getResultSet();
					System.out.println();
					while (rs.next()) {

						System.out.printf("| Código: %d | Disciplina: %s |\n", rs.getInt(1), rs.getString(2)) ;
					}
				}
				System.out.println();
				results = stmConsulta.getMoreResults();
			} while (results);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void litaAlunosSemMatriculas() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT ALUNO.codigoaluno, ALUNO.nomealuno from aluno LEFT JOIN MATRICULA on ALUNO.codigoaluno = matricula.codigoaluno where matricula is null order by ALUNO.codigoaluno";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			boolean results = stmConsulta.execute(sqlConsulta);
			System.out.println("\n--------------- LISTANDO TODOS OS ALUNOS SEM MATRÍCULAS ---------------\n");

			do {
				if (results) {
					ResultSet rs = stmConsulta.getResultSet();
					System.out.println();
					while (rs.next()) {

						System.out.printf("| Código: %d | Aluno: %s |\n", rs.getInt(1), rs.getString(2)) ;
					}
				}
				System.out.println();
				results = stmConsulta.getMoreResults();
			} while (results);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listaProfessoresSemDisciplinas() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT PROFESSOR.codigoprofessor, PROFESSOR.nomeprofessor from PROFESSOR left join DISCIPLINA on PROFESSOR.codigoprofessor = DISCIPLINA.codigoprofessor where DISCIPLINA is null order by PROFESSOR.codigoprofessor";
			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			boolean results = stmConsulta.execute(sqlConsulta);
			System.out.println("\n--------------- LISTANDO TODOS OS PROFESSORES SEM DISCIPLINAS ---------------\n");

			do {
				if (results) {
					ResultSet rs = stmConsulta.getResultSet();
					System.out.println();
					while (rs.next()) {

						System.out.printf("| Código: %d | Professor: %s |\n", rs.getInt(1), rs.getString(2)) ;
					}
				}
				System.out.println();
				results = stmConsulta.getMoreResults();
			} while (results);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listarTotalCargaHorariaAluno() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT ALUNO.codigoaluno, ALUNO.nomealuno, count(DISCIPLINA.codigodisciplina), sum(DISCIPLINA.cargahoraria) from aluno, disciplina, matricula where ALUNO.codigoaluno = MATRICULA.codigoaluno and DISCIPLINA.codigodisciplina = MATRICULA.codigodisciplina  group by aluno.codigoaluno order by aluno.codigoaluno";

			Statement stmConsulta = con.createStatement();
			ResultSet result = null;
			result = stmConsulta.executeQuery(sqlConsulta);
			System.out.println("\n--------------- LISTANDO CARGA HORÁRIA DE TODOS OS ALUNOS MATRICULADOS ---------------\n");

			while (result.next()) {
				System.out.printf("Codigo: %d | Aluno: %s | Total disciplinas: %d | Total carga horária: %d |\n", result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4));
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ResultSet result = null;
		System.out.println("Bem vindo a Gestão de Matrículas");

		int opcaoMenuPrincipal = 0;
		do {

			System.out.println("\n------------------- MENU PRINCIPAL -------------------\n");
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
			case 2:
				menuCadastroMatriculas(teclado);
				break;
			case 3:
				menuRelatorios(teclado);
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcaoMenuPrincipal != 0);
		teclado.close();
	}
}
