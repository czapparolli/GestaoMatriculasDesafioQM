import java.sql.*;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void pausa() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
	}


	public static void menuCadastrosPrincipal(Scanner teclado) {

		int opcaoMenuCadastroPrincipal = 0;

		do {
			System.out.println("\n------------------- MENU CADASTROS -------------------\n\n");
			System.out.println("[1] - Alunos");
			System.out.println("[2] - Professores");
			System.out.println("[3] - Disciplinas");
			System.out.println("[4] - Menu Anterior");
			System.out.print("\nDigite a op??o: ");
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
				System.out.println("Op??o inv?lida!");

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
			System.out.print("\nDigite a op??o: ");
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
				listaTodosSqlAluno(teclado);
				pausa();
				break;
			case 6:
				break;
			default:
				System.out.println("Op??o inv?lida!");
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
			System.out.print("\nDigite a op??o: ");
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
				System.out.println("Op??o inv?lida!");

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
			System.out.print("\nDigite a op??o: ");
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
				listaTodosSqlDisciplina(teclado);
				pausa();
				break;
			case 6:
				break;
			default:
				System.out.println("Op??o inv?lida!");

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
			System.out.print("\nDigite a op??o: ");
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
				System.out.println("Op??o inv?lida!");

			}
		} while (opcaoMenuCadastroMatriculas != 5);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void menuRelatorios(Scanner teclado) {

		int opcaoMenuRelatorios = 0;

		do {
			System.out.println("\n------------------- MENU DE RELAT?RIOS -------------------\n");
			System.out.println("[1] - Listar disciplinas sem alunos");
			System.out.println("[2] - Listar alunos sem matriculas");
			System.out.println("[3] - Listar todas as matr?culas ativas dos alunos");
			System.out.println("[4] - Listar todas as matr?culas ativas de um aluno");
			System.out.println("[5] - Listar professores sem disciplinas");
			System.out.println("[6] - Listar total de carga hor?rio do aluno ");
			System.out.println("[7] - Menu anterior");
			System.out.print("\nDigite a op??o: ");
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
				listaTodasAsMatriculas();
				pausa();
				break;
			case 4:
				listaTodasAsMatriculasPorAluno(teclado);
				pausa();
				break;
			case 5:
				listaProfessoresSemDisciplinas();
				pausa();
				break;
			case 6:
				listaTotalCargaHorariaAluno();
				pausa();
				break;
			case 7:
				break;
			default:
				System.out.println("Op??o inv?lida!");

			}
		} while (opcaoMenuRelatorios != 7);
		System.out.println("\nRetornando ao menu anterior...");

	}

	public static void cadastraSqlAluno(Scanner teclado) {

		try {
			String cpf = "";
			String cpfVerifica = "";
			String nomeAluno = "";

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			teclado.nextLine();

			while (nomeAluno.equals(null) || nomeAluno.equals("")) {
				System.out.print("\nDigite o nome do Aluno: ");
				nomeAluno = teclado.nextLine();
				if (nomeAluno.equals(null) || nomeAluno.equals("")) {
					System.out.println("\nNome em branco, tente novamente...");
				}
			}

			do {
				System.out.print("\nDigite o CPF do Aluno: ");
				cpf = teclado.nextLine();
				String sqlConsulta = "SELECT cpf FROM aluno where cpf like '" + cpf + "'";
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						cpfVerifica = result.getString("cpf");
					}
				}
				if (cpf.equals(null) || cpf.equals("") || cpf.equals(cpfVerifica)) {
					System.out.println("\nCPF em branco ou duplicado na base de dados, digite novamente...");
				}

			} while (cpf.equals(null) || cpf.equals("") || cpf.equals(cpfVerifica));

			String sqlCadastro = "INSERT into aluno (nomeAluno, cpf)VALUES" + "('" + nomeAluno + "','" + cpf + "')";

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (res > 0) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
			}

		} catch (Exception e) {
			System.out.println("\nCPF digitado com mais de 11 digitos, processo de cadastramento abortado  !");
		}

	}

	public static void cadastraSqlProfessor(Scanner teclado) {

		try {
			String nomeProfessor = "";
			String cpf = "";
			String cpfVerifica = "";

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();

			while (nomeProfessor.equals(null) || nomeProfessor.equals("")) {
				System.out.print("\nDigite o nome do Professor: ");
				nomeProfessor = teclado.nextLine();
				if (nomeProfessor.equals(null) || nomeProfessor.equals("")) {
					System.out.println("\nNome em branco, digite novamente...");
				}
			}
			
			do {
				System.out.print("\nDigite o CPF do Professor: ");
				cpf = teclado.nextLine();
				String sqlConsulta = "SELECT cpf FROM professor where cpf like '" + cpf + "'";
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						cpfVerifica = result.getString("cpf");
					}
				}
				if (cpf.equals(null) || cpf.equals("") || cpf.equals(cpfVerifica)) {
					System.out.println("\nCPF em branco ou duplicado na base de dados, digite novamente...");
				}

			} while (cpf.equals(null) || cpf.equals("") || cpf.equals(cpfVerifica));

			String sqlCadastro = "INSERT into PROFESSOR (nomeProfessor, cpf)VALUES" + "('" + nomeProfessor + "','" + cpf
					+ "')";

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (res > 0) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
			}
		} catch (Exception e) {
			System.out.println("\nCPF digitado com mais de 11 digitos, processo de cadastramento abortado  !");
		}

	}

	public static void cadastraSqlDisciplina(Scanner teclado) {

		try {

			int codigoDisciplina = 0;
			int codDisciplina = 0;
			String nomeDisciplina = "";
			String nomeDisciplina2 = "";
			int cargaHoraria = 0;
			int codigoProfessor = 0;
			int codProfessor = 0;

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			do {
				System.out.print("\nDigite o codigo da Disciplina: ");
				codigoDisciplina = teclado.nextInt();
				String sqlConsulta = "SELECT codigoDisciplina FROM disciplina where codigoDisciplina ="
						+ codigoDisciplina;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codDisciplina = result.getInt("codigoDisciplina");
					}
				}
				if (codigoDisciplina == 0 || codigoDisciplina == codDisciplina) {
					System.out.println("\nC?digo da Disciplina incorreto, duplicado, ou nulo tente novamente...");
				}

			} while (codigoDisciplina == 0 || codigoDisciplina == codDisciplina);

			teclado.nextLine();

			do {
				System.out.print("\nDigite o nome da Disciplina: ");
				nomeDisciplina = teclado.nextLine();
				String sqlConsulta = "SELECT nomeDisciplina FROM disciplina where nomeDisciplina ='" + nomeDisciplina
						+ "'";
				PreparedStatement st = con.prepareStatement(sqlConsulta);
				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						nomeDisciplina2 = result.getString("nomeDisciplina");
					}
				}

				if (nomeDisciplina.equals(null) || nomeDisciplina.equals("")
						|| nomeDisciplina.equals(nomeDisciplina2)) {
					System.out.println("\nNome da disciplina em branco, ou duplicado, digite novamente...");
				}
			} while (nomeDisciplina.equals(null) || nomeDisciplina.equals(null)
					|| nomeDisciplina.equals(nomeDisciplina2));

			while (cargaHoraria == 0) {
				System.out.print("\nDigite a carga hor?ria da disciplina: ");
				cargaHoraria = teclado.nextInt();
				if (cargaHoraria == 0) {
					System.out.println("\nCarga hor?ria nula, tente novamente...");
				}
			}

			do {
				System.out.print("\nDigite o codigo do professor respons?vel pela disciplina: ");
				codigoProfessor = teclado.nextInt();
				String sqlConsulta = "SELECT codigoProfessor FROM professor where codigoProfessor =" + codigoProfessor;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codProfessor = result.getInt("codigoProfessor");
					}
				}
				if (codigoProfessor == 0 || codigoProfessor != codProfessor) {
					System.out.println("\nC?digo do Professor incorreto, ou nulo tente novamente...");
				}

			} while (codigoProfessor == 0 || codigoProfessor != codProfessor);

			String sqlCadastro = "INSERT into DISCIPLINA (codigodisciplina, nomeDisciplina, cargaHoraria, codigoProfessor)VALUES"
					+ "('" + codigoDisciplina + "','" + nomeDisciplina + "','" + cargaHoraria + "','" + codigoProfessor
					+ "')";

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (res > 0) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void cadastraSqlMatricula(Scanner teclado) {

		try {

			int codigoDisciplina = 0;
			int codDisciplina = 0;
			int codigoAluno = 0;
			int codAluno = 0;

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			teclado.nextLine();
			do {

				System.out.print("\nDigite o c?digo da disciplina: ");
				codigoDisciplina = teclado.nextInt();
				String sqlConsulta = "SELECT codigoDisciplina FROM disciplina where codigoDisciplina ="
						+ codigoDisciplina;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codDisciplina = result.getInt("codigoDisciplina");
					}
				}
				if (codigoDisciplina == 0 || codigoDisciplina != codDisciplina) {
					System.out.println("\nC?digo da Disciplina incorreto ou nulo tente novamente...");
				}

			} while (codigoDisciplina == 0 || codigoDisciplina != codDisciplina);

			do {

				System.out.print("\nDigite o c?digo do Aluno: ");
				codigoAluno = teclado.nextInt();
				String sqlConsulta = "SELECT codigoAluno FROM aluno where codigoAluno =" + codigoAluno;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codAluno = result.getInt("codigoAluno");
					}
				}
				if (codigoAluno == 0 || codigoAluno != codAluno) {
					System.out.println("\nC?digo do aluno incorreto ou nulo tente novamente...");
				}

			} while (codigoAluno == 0 || codigoAluno != codAluno);

			String sqlCadastro = "INSERT into matricula (codigoDisciplina, codigoAluno)VALUES" + "('" + codigoDisciplina
					+ "','" + codigoAluno + "')";

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlCadastro);

			if (res > 0) {
				System.out.println("\nCadastrado com sucesso");
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alteraSqlAluno(Scanner teclado) {

		try {
			int codAluno = 0 ;
			int codigoAluno = 0 ;
			String nomeAluno = "";
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			do {
				System.out.print("\nDigite o c?digo do aluno: ");
				codigoAluno = teclado.nextInt();
				String sqlConsulta = "SELECT codigoAluno FROM aluno where codigoAluno ="
						+ codigoAluno;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codAluno = result.getInt("codigoAluno");
					}
				}
				if (codigoAluno == 0 || codigoAluno != codAluno) {
					System.out.println("\nC?digo do Aluno incorreto ou nulo tente novamente...");
				}

			} while (codigoAluno == 0 || codigoAluno != codAluno);

			teclado.nextLine();
			
			while (nomeAluno.equals(null) || nomeAluno.equals("")) {
				System.out.print("\nDigite o novo nome para o aluno: ");
				nomeAluno = teclado.nextLine();
				if (nomeAluno.equals(null) || nomeAluno.equals("")) {
					System.out.println("\nNome do aluno em branco, tente novamente...");
				}
			}
			String sqlAltera = "update aluno set nomealuno = '" + nomeAluno + "' where codigoAluno=" + codigoAluno;
			PreparedStatement st = con.prepareStatement(sqlAltera);
			int resultado = st.executeUpdate();
			if (resultado > 0) {
				System.out.println("\nDados atualizados na tabela");
			} else {
				System.out.println("\nFalha ao atualizar nome de aluno !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void alteraSqlProfessor(Scanner teclado) {
		try {
			
			int codProfessor = 0 ;
			int codigoProfessor = 0 ;
			String nomeProfessor = "";
			PreparedStatement st = null;
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nAtualizando DADOS...");
			
			do {
				System.out.print("\nDigite o c?digo do Professor: ");
				codigoProfessor = teclado.nextInt();
				String sqlConsulta = "SELECT codigoProfessor FROM professor where codigoProfessor ="
						+ codigoProfessor;
				st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codProfessor = result.getInt("codigoProfessor");
					}
				}
				if (codigoProfessor == 0 || codigoProfessor != codProfessor) {
					System.out.println("\nC?digo do Aluno incorreto ou nulo tente novamente...");
				}

			} while (codigoProfessor == 0 || codigoProfessor != codProfessor);

			teclado.nextLine();
			
			while (nomeProfessor.equals(null) || nomeProfessor.equals("")) {
				System.out.print("\nDigite o novo nome para o professor: ");
				nomeProfessor = teclado.nextLine();
				if (nomeProfessor.equals(null) || nomeProfessor.equals("")) {
					System.out.println("\nNome do professor em branco, tente novamente...");
				}
			}
			
			
			
			String sqlAltera = "update professor set nomeprofessor = '" + nomeProfessor + "' where codigoprofessor="
					+ codigoProfessor;
			st = con.prepareStatement(sqlAltera);
			int resultado = st.executeUpdate();
			if (resultado > 0) {
				System.out.println("\nDados atualizados na tabela");
			} else {
				System.out.println("\nFalha ao atualizar nome do professor!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void alteraSqlDisciplina(Scanner teclado) {
		try {

			int codigoDisciplina = 0;
			int codDisciplina = 0;
			String nomeDisciplina = "";
			String nomeDisciplina2 = "";
			int cargaHoraria = 0;
			int codigoProfessor = 0;
			int codProfessor = 0;

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			do {
				System.out.print("\nDigite o codigo da Disciplina: ");
				codigoDisciplina = teclado.nextInt();
				String sqlConsulta = "SELECT codigoDisciplina FROM disciplina where codigoDisciplina ="
						+ codigoDisciplina;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codDisciplina = result.getInt("codigoDisciplina");
					}
				}
				if (codigoDisciplina == 0 || codigoDisciplina != codDisciplina) {
					System.out.println("\nC?digo da Disciplina incorreto, ou nulo tente novamente...");
				}

			} while (codigoDisciplina == 0 || codigoDisciplina != codDisciplina);

			teclado.nextLine();

			do {
				System.out.print("\nDigite o novo nome da Disciplina: ");
				nomeDisciplina = teclado.nextLine();
				String sqlConsulta = "SELECT nomeDisciplina FROM disciplina where nomeDisciplina ='" + nomeDisciplina
						+ "'";
				PreparedStatement st = con.prepareStatement(sqlConsulta);
				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						nomeDisciplina2 = result.getString("nomeDisciplina");
					}
				}

				if (nomeDisciplina.equals(null) || nomeDisciplina.equals("")
						|| nomeDisciplina.equals(nomeDisciplina2)) {
					System.out.println("\nNome da disciplina em branco, ou duplicado, digite novamente...");
				}
			} while (nomeDisciplina.equals(null) || nomeDisciplina.equals(null)
					|| nomeDisciplina.equals(nomeDisciplina2));

			while (cargaHoraria == 0) {
				System.out.print("\nDigite a nova carga hor?ria da Disciplina: ");
				cargaHoraria = teclado.nextInt();
				if (cargaHoraria == 0) {
					System.out.println("\nCarga hor?ria nula, tente novamente...");
				}
			}

			do {
				System.out.print("\nDigite o c?digo do novo professor respons?vel: ");
				codigoProfessor = teclado.nextInt();
				String sqlConsulta = "SELECT codigoProfessor FROM professor where codigoProfessor =" + codigoProfessor;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codProfessor = result.getInt("codigoProfessor");
					}
				}
				if (codigoProfessor == 0 || codigoProfessor != codProfessor) {
					System.out.println("\nC?digo do Professor incorreto, ou nulo tente novamente...");
				}

			} while (codigoProfessor == 0 || codigoProfessor != codProfessor);

			String sqlAltera = "update disciplina set nomedisciplina = '" + nomeDisciplina + "', cargahoraria = '"
					+ cargaHoraria + "', codigoprofessor = '" + codigoProfessor + "'   where codigodisciplina="
					+ codigoDisciplina;

			Statement stmCadastrado = con.createStatement();
			int res = stmCadastrado.executeUpdate(sqlAltera);

			if (res > 0) {
				System.out.println("\nCadastro alterado com sucesso");
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void excluiSqlAluno(Scanner teclado) {

		try {

			int codigoAluno = 0;
			int codAluno = 0;
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUS?O DE ALUNOS");
			do {

				System.out.print("\nDigite o c?digo do aluno para exclus?o: ");
				codigoAluno = teclado.nextInt();
				String sqlConsulta = "SELECT codigoAluno FROM aluno where codigoAluno =" + codigoAluno;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codAluno = result.getInt("codigoAluno");
					}
				}
				if (codigoAluno == 0 || codigoAluno != codAluno) {
					System.out.println("\nC?digo do Aluno incorreto, ou nulo tente novamente...");
				}

			} while (codigoAluno == 0 || codigoAluno != codAluno);
			String sqlExclui = "DELETE FROM aluno where codigoAluno = " + codigoAluno;
			PreparedStatement stmt = con.prepareStatement(sqlExclui);
			int resultado = stmt.executeUpdate();
			if (resultado > 0) {
				System.out.println("\nDados atualizados na tabela");
				System.out.println("\nAluno excluido da tabela com sucesso !");

			} else {
				System.out.println("\nFalha ao excluir aluno, c?digo digitado n?o existe !");
			}

		} catch (Exception e) {

			System.out.println("\nN?o ? poss?vel excluir um aluno que esteja matriculado em alguma disciplina");
		}
	}

	public static void excluiSqlProfessor(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUS?O DE PROFESSORES");
			System.out.print("\nDigite o c?digo do professor para exclus?o: ");
			int codigoProfessor = teclado.nextInt();
			String sqlExclui = "DELETE FROM professor where codigoprofessor = " + codigoProfessor;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nAtualizando DADOS...");
			System.out.println("\nProfessor excluido da tabela com sucesso !");
		} catch (Exception e) {
			System.out.println("\nN?o ? poss?vel excluir uma que tenha alunos matriculados nela");
		}
	}

	public static void excluiSqlDisciplina(Scanner teclado) {

		try {

			int codigoDisciplina = 0;
			int codDisciplina = 0;

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUS?O DE DISCIPLINAS");
			do {
				System.out.print("\nDigite o c?digo da disciplina para exclus?o: ");
				codigoDisciplina = teclado.nextInt();

				String sqlConsulta = "SELECT codigoDisciplina FROM disciplina where codigoDisciplina ="
						+ codigoDisciplina;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();

				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codDisciplina = result.getInt("codigoDisciplina");
					}
				}
				if (codigoDisciplina == 0 || codigoDisciplina != codDisciplina) {
					System.out.println("\nC?digo da Disciplina incorreto, duplicado, ou nulo tente novamente...");
				}

			} while (codigoDisciplina == 0 || codigoDisciplina != codDisciplina);

			String sqlExclui = "DELETE FROM disciplina where codigodisciplina = " + codigoDisciplina;

			Statement st = con.createStatement();
			int result = st.executeUpdate(sqlExclui);

			if (result > 0) {
				System.out.println("\nDisciplina excluida com sucesso da base de dados...");
				con.close();
			}

		} catch (Exception e) {
			System.out.println("\nN?o ? poss?vel excluir disciplinas no qual tenham alunos matriculados\n");
			System.out.println("Digite enteder para continuar");
			teclado.nextLine();
		}
	}

	public static void removeSqlMatricula(Scanner teclado) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			System.out.println("\nTELA DE EXCLUS?O DE MATRICULAS");
			System.out.print("\nDigite o c?digo da matricula para exclus?o: ");
			int codigoMatricula = teclado.nextInt();
			String sqlExclui = "DELETE FROM matricula where codigomatricula = " + codigoMatricula;
			Statement stmConsulta = con.createStatement();
			stmConsulta.executeUpdate(sqlExclui);

			System.out.println("\nExcluindo DADOS...");
			System.out.println("\nMatricula excluida da tabela com sucesso !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void consultaSqlAluno(Scanner teclado) {

		try {
			// PreparedStatement st = null;
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTAS DE ALUNO INDIVIDUAL");
			teclado.nextLine();
			System.out.print("\nDigite o nome completo do aluno:  ");
			String nomeAluno = teclado.nextLine();
			String sqlConsulta = "SELECT * FROM ALUNO where nomealuno ilike '" + nomeAluno + "'\n";
			PreparedStatement stmConsulta = con.prepareStatement(sqlConsulta);
			ResultSet result = stmConsulta.executeQuery();
			System.out.println("\n--------------- CONSULTANDO DADOS DOS ALUNOS ---------------");
			if (result.next()) {
				result = stmConsulta.executeQuery();
				while (result.next()) {

					System.out.printf("\n| Codigo: %d | Aluno: %s | CPF: %s |", result.getInt(1), result.getString(2),
							result.getString(3));
				}
			} else {
				System.out.println("\n Nome do Aluno n?o encontrado, tente novamente !");
			}

		} catch (SQLException e) {
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

			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println("\n--------------- CONSULTANDO DADOS DA DISCIPLINA ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("Codigo: %d | Disciplina: %s | Carga hor?ria: %d | Professor respons?vel: %s |\n",
							result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
					System.out.println();

				}

			} else {

				System.out.println("N?o foi encontrado nenhum resultado para o nome de disciplina digitado...");

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
			System.out.print("\nDigite o c?digo da disciplina: ");
			String codigoDisciplina = teclado.nextLine();
			System.out.println();
			String sqlConsulta = "SELECT ALUNO.nomeAluno FROM MATRICULA,DISCIPLINA, ALUNO "
					+ "where MATRICULA.codigoaluno = ALUNO.codigoaluno and MATRICULA.codigodisciplina = DISCIPLINA.codigodisciplina and MATRICULA.codigoDisciplina = '"
					+ codigoDisciplina + "'\n";
			String sqlConsultaTeste = "SELECT DISCIPLINA.codigoDisciplina, DISCIPLINA.nomeDisciplina FROM disciplina where codigoDisciplina = '"
					+ codigoDisciplina + "'";
			Statement stmConsulta = con.createStatement();
			Statement stmConsulta1 = con.createStatement();
			// ResultSet result = stmConsulta.executeQuery(sqlConsulta);
			ResultSet result1 = null;

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
			int codAluno = 0;
			int codigoAluno = 0;

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");

			System.out.println("\nMENU DE CONSULTA DE DISCIPLINAS DE UM ALUNO");

			do {

				System.out.print("\nDigite o c?digo do aluno: ");
				codigoAluno = teclado.nextInt();
				String sqlConsulta = "SELECT codigoAluno FROM aluno where codigoAluno =" + codigoAluno;
				PreparedStatement st = con.prepareStatement(sqlConsulta);

				ResultSet result = st.executeQuery();
				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codigoAluno = result.getInt("codigoAluno");
					}
				}
				if (codigoAluno == 0 || codigoAluno != codAluno) {
					System.out.println("\nC?digo do aluno incorreto ou nulo tente novamente...");
				}

			} while (codigoAluno == 0 || codigoAluno != codAluno);

			System.out.println();
			String sqlConsulta = "SELECT DISCIPLINA.nomeDisciplina FROM MATRICULA,DISCIPLINA, ALUNO "
					+ "where MATRICULA.codigoaluno = ALUNO.codigoaluno and MATRICULA.codigodisciplina = DISCIPLINA.codigodisciplina and MATRICULA.codigoAluno = '"
					+ codigoAluno + "'\n";
			String sqlConsultaTeste = "SELECT ALUNO.codigoAluno, ALUNO.nomeAluno FROM aluno where codigoAluno = '"
					+ codigoAluno + "'";
			Statement stmConsulta = con.createStatement();
			Statement stmConsulta1 = con.createStatement();
			// ResultSet result = stmConsulta.executeQuery(sqlConsulta);
			ResultSet result1 = stmConsulta1.executeQuery(sqlConsultaTeste);

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

			System.out.println("Digite enter para continuar...");
			teclado.nextLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlAluno(Scanner teclado) {
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
				// System.out.println("N?o temos alunos cadastrados no momento :(");
				// }
				System.out.printf("Codigo: %d | Aluno: %s | CPF: %s", result.getInt(1), result.getString(2),
						result.getString(3));
				System.out.println();

			}
			System.out.println("\nDigite enter para continuar...");
			teclado.nextLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlProfessor() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT * FROM PROFESSOR ORDER BY codigoProfessor";
			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();
			System.out.println("\n--------------- LISTANDO TODOS OS PROFESSORES ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("Codigo: %d | Professor: %s | CPF: %s\n", result.getInt(1), result.getString(2),
							result.getString(3));

				}

			} else {

				System.out.println("No momento n?o temos nenhum professor cadastrado");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodosSqlDisciplina(Scanner teclado) {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT DISCIPLINA.codigodisciplina, DISCIPLINA.nomedisciplina, DISCIPLINA.cargahoraria, PROFESSOR.nomeprofessor FROM DISCIPLINA, PROFESSOR where DISCIPLINA.codigoprofessor = PROFESSOR.codigoprofessor ORDER BY codigodisciplina";

			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println("\n--------------- LISTANDO TODAS AS DISCIPLINAS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("Codigo: %d | Disciplina: %s | Carga hor?ria: %d | Professor respons?vel: %s |\n",
							result.getInt(1), result.getString(2), result.getInt(3), result.getString(4));
					System.out.println();

				}

			} else {

				System.out.println("No momento n?o temos nenhuma disciplina cadastrada");

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Digite enter para continuar...");
			teclado.nextLine();
		}

	}

	public static void listaDisciplinasSemAlunos() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT DISCIPLINA.codigodisciplina, DISCIPLINA.nomedisciplina from disciplina INNER JOIN matricula on MATRICULA.codigoDisciplina = DISCIPLINA.codigoDisciplina where DISCIPLINA.codigomatricula is null order by DISCIPLINA.codigodisciplina";
			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();
			System.out.println("\n--------------- LISTANDO TODAS AS DISCIPLINAS SEM ALUNOS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("| C?digo: %d | Disciplina: %s |\n", result.getInt(1), result.getString(2));

					System.out.println();

				}

			} else {

				System.out.println("No momento n?o temos nenhuma disciplina sem alunos matriculados");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void litaAlunosSemMatriculas() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT ALUNO.codigoaluno, ALUNO.nomealuno from aluno LEFT JOIN MATRICULA on ALUNO.codigoaluno = matricula.codigoaluno where matricula is null order by ALUNO.codigoaluno";

			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println("\n--------------- LISTANDO TODOS OS ALUNOS SEM MATR?CULAS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("| C?digo: %d | Aluno: %s |\n", result.getInt(1), result.getString(2));

				}

			} else {

				System.out.println("No momento n?o temos nenhum aluno sem matr?cula");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void listaProfessoresSemDisciplinas() {
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT PROFESSOR.codigoprofessor, PROFESSOR.nomeprofessor from PROFESSOR left join DISCIPLINA on PROFESSOR.codigoprofessor = DISCIPLINA.codigoprofessor where DISCIPLINA is null order by PROFESSOR.codigoprofessor";
			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println("\n--------------- LISTANDO TODOS OS PROFESSORES SEM DISCIPLINAS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("| C?digo: %d | Professor: %s |\n", result.getInt(1), result.getString(2));
					System.out.println();
				}

			} else {

				System.out.println("No momento n?o temos nenhum professor sem disciplina");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void listaTotalCargaHorariaAluno() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT ALUNO.codigoaluno, ALUNO.nomealuno, count(DISCIPLINA.codigodisciplina), sum(DISCIPLINA.cargahoraria) from aluno, disciplina, matricula where ALUNO.codigoaluno = MATRICULA.codigoaluno and DISCIPLINA.codigodisciplina = MATRICULA.codigodisciplina  group by aluno.codigoaluno order by aluno.codigoaluno";

			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println(
					"\n--------------- LISTANDO CARGA HOR?RIA DE TODOS OS ALUNOS MATRICULADOS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf(
							"Codigo: %d | Aluno: %s | Total de disciplinas: %d | Total de carga hor?ria: %d |\n",
							result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4));
					System.out.println();

				}

			} else {

				System.out.println("No momento n?o temos nenhum aluno matr?culado");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodasAsMatriculas() {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			String sqlConsulta = "SELECT MATRICULA.codigoMAtricula, DISCIPLINA.nomeDisciplina, ALUNO.nomealuno from ALUNO INNER JOIN MATRICULA on MATRICULA.codigoaluno = ALUNO.codigoaluno INNER JOIN DISCIPLINA on DISCIPLINA.codigoDisciplina = MATRICULA.codigoDisciplina where matricula is not null order by ALUNO.nomeAluno";

			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			System.out.println("\n--------------- LISTANDO TODAS AS MATR?CULAS ATIVAS ---------------\n");

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("| N? da Matr?cula: %d | Nome da Disciplina: %s | Aluno: %s |\n",
							result.getInt(1), result.getString(2), result.getString(3));
					System.out.println();

				}

			} else {

				System.out.println("No momento n?o temos nenhum alunos matriculado");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void listaTodasAsMatriculasPorAluno(Scanner teclado) {

		try {

			int codigoAluno = 0;
			int codAluno = 0;
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestaoDisciplinas",
					"postgres", "Panda104455!");
			do {

				System.out.print("\nDigite o c?digo do aluno: ");
				codigoAluno = teclado.nextInt();
				String sqlConsulta2 = "SELECT ALUNO.codigoAluno FROM aluno where codigoAluno = '" + codigoAluno + "' ";
				PreparedStatement st = con.prepareStatement(sqlConsulta2);
				ResultSet result = st.executeQuery();

				if (result.next()) {
					result = st.executeQuery();
					while (result.next()) {
						codAluno = result.getInt("codigoAluno");
					}
				}
				if (codigoAluno == 0 || codigoAluno != codAluno) {
					System.out.println("\nC?digo do aluno incorreto ou nulo tente novamente...");
				}
			} while (codigoAluno == 0 || codigoAluno != codAluno);

			System.out.println("\n--------------- LISTANDO TODAS AS MATR?CULAS DO ALUNO ---------------\n");

			String sqlConsulta = "SELECT MATRICULA.codigoMAtricula, DISCIPLINA.nomeDisciplina, ALUNO.nomealuno from ALUNO INNER JOIN MATRICULA on MATRICULA.codigoaluno = ALUNO.codigoaluno INNER JOIN DISCIPLINA on DISCIPLINA.codigoDisciplina = MATRICULA.codigoDisciplina where matricula is not null and ALUNO.codigoAluno = '"
					+ codigoAluno + "'  order by ALUNO.nomeAluno";
			PreparedStatement st = con.prepareStatement(sqlConsulta);
			ResultSet result = st.executeQuery();

			if (result.next()) {
				result = st.executeQuery();
				while (result.next()) {
					System.out.printf("| N? da Matr?cula: %d | Nome da Disciplina: %s | Aluno: %s |\n",
							result.getInt(1), result.getString(2), result.getString(3));
					System.out.println();

				}

			} else {

				System.out.println("No momento n?o temos nenhum alunos matriculado");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem vindo a Gest?o de Matr?culas");

		int opcaoMenuPrincipal = 0;
		do {

			System.out.println("\n------------------- MENU PRINCIPAL -------------------\n");
			System.out.println("[1] - Cadastros");
			System.out.println("[2] - Matriculas");
			System.out.println("[3] - Relatorios");
			System.out.println("[0] - Para encerrar");
			System.out.print("\nDigite a op??o: ");
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
				System.out.println("Op??o inv?lida!");
			}

		} while (opcaoMenuPrincipal != 0);
		teclado.close();
	}
}