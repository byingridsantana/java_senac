package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtCargaHoraria;
	private JTextField txtValor;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtCpfAluno;
	private JTextField txtIdadeAluno;
	private JTextField txtNomeProfessor;
	private JTextField txtCpfProfessor;
	private JTextField txtEmailProfessor;
	private JTextField txtIdAula;
	private JTextField txtCurso;
	private JTextField txtProfessor;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtSala;
	
	// Declaração dos itens para criar uma aula. 
	
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas; 
	private List<Aluno>listaAluno; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAulas() {
		
		// Vamos instanciar as nossas classes para gerar
		// objetos dos itens relacionados a aula.
		// Estes objetos estão vazio e serão preenchidos quando o
		// usuario clicar nos botoes de incluir
		curso = new Curso();
		listaAluno = new ArrayList<Aluno>();
		sala = new Sala();
		professor = new Professor();
		aulas = new Aulas();
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(SystemColor.controlHighlight);
		panel_curso.setBounds(10, 94, 632, 129);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título do Curso:");
		lblNewLabel.setBounds(10, 11, 91, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(10, 31, 304, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Área:");
		lblNewLabel_1.setBounds(332, 11, 46, 14);
		panel_curso.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Carga Horária:");
		lblNewLabel_2.setBounds(10, 63, 101, 14);
		panel_curso.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor:");
		lblNewLabel_3.setBounds(332, 63, 46, 14);
		panel_curso.add(lblNewLabel_3);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(10, 78, 304, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(332, 78, 290, 20);
		panel_curso.add(txtValor);
		txtValor.setColumns(10);
		
		JComboBox cboArea = new JComboBox();
		cboArea.setModel(new DefaultComboBoxModel(new String[] {"Estética ", "Comunicação", "Marketing", "Desenvolvimento Social", "Design", "Artes", "Arquitetura", "Gestão e Negócios", "Tecnologia", "Moda", "Turismo", "Idiomas"}));
		cboArea.setBounds(332, 30, 290, 22);
		panel_curso.add(cboArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 228, 632, 150);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Identificação:");
		lblNewLabel_4.setBounds(10, 11, 78, 14);
		panel.add(lblNewLabel_4);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(10, 27, 612, 20);
		panel.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 73, 612, 59);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição:");
		lblNewLabel_5.setBounds(10, 57, 78, 14);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(10, 448, 632, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(10, 25, 305, 20);
		panel_1.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome do Aluno:");
		lblNewLabel_6.setBounds(10, 7, 105, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail do Aluno:");
		lblNewLabel_7.setBounds(325, 56, 124, 14);
		panel_1.add(lblNewLabel_7);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setBounds(325, 72, 297, 20);
		panel_1.add(txtEmailAluno);
		txtEmailAluno.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CPF do Aluno:");
		lblNewLabel_8.setBounds(325, 7, 88, 14);
		panel_1.add(lblNewLabel_8);
		
		txtCpfAluno = new JTextField();
		txtCpfAluno.setBounds(325, 25, 297, 20);
		panel_1.add(txtCpfAluno);
		txtCpfAluno.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Idade do Aluno:");
		lblNewLabel_9.setBounds(10, 56, 93, 14);
		panel_1.add(lblNewLabel_9);
		
		txtIdadeAluno = new JTextField();
		txtIdadeAluno.setBounds(10, 72, 305, 20);
		panel_1.add(txtIdadeAluno);
		txtIdadeAluno.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(10, 381, 632, 62);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setBounds(10, 25, 236, 20);
		panel_2.add(txtNomeProfessor);
		txtNomeProfessor.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Nome do Professor:");
		lblNewLabel_10.setBounds(10, 8, 134, 14);
		panel_2.add(lblNewLabel_10);
		
		txtCpfProfessor = new JTextField();
		txtCpfProfessor.setBounds(256, 25, 120, 20);
		panel_2.add(txtCpfProfessor);
		txtCpfProfessor.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("CPF do Professor:");
		lblNewLabel_11.setBounds(259, 8, 102, 14);
		panel_2.add(lblNewLabel_11);
		
		txtEmailProfessor = new JTextField();
		txtEmailProfessor.setBounds(386, 25, 236, 20);
		panel_2.add(txtEmailProfessor);
		txtEmailProfessor.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Email do Professor:");
		lblNewLabel_12.setBounds(386, 8, 122, 14);
		panel_2.add(lblNewLabel_12);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(10, 566, 632, 172);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("ID da Aula:");
		lblNewLabel_13.setBounds(10, 11, 124, 14);
		panel_3.add(lblNewLabel_13);
		
		txtIdAula = new JTextField();
		txtIdAula.setBounds(10, 28, 203, 20);
		panel_3.add(txtIdAula);
		txtIdAula.setColumns(10);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(223, 28, 192, 20);
		panel_3.add(txtCurso);
		txtCurso.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Curso:");
		lblNewLabel_14.setBounds(223, 11, 46, 14);
		panel_3.add(lblNewLabel_14);
		
		txtProfessor = new JTextField();
		txtProfessor.setBounds(425, 28, 197, 20);
		panel_3.add(txtProfessor);
		txtProfessor.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Professor:");
		lblNewLabel_15.setBounds(425, 11, 99, 14);
		panel_3.add(lblNewLabel_15);
		
		txtInicio = new JTextField();
		txtInicio.setBounds(10, 79, 203, 20);
		panel_3.add(txtInicio);
		txtInicio.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Inicio:");
		lblNewLabel_16.setBounds(10, 59, 46, 14);
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Término:");
		lblNewLabel_17.setBounds(223, 59, 74, 14);
		panel_3.add(lblNewLabel_17);
		
		txtTermino = new JTextField();
		txtTermino.setBounds(223, 79, 192, 20);
		panel_3.add(txtTermino);
		txtTermino.setColumns(10);
		
		JComboBox cboAlunos = new JComboBox();
		cboAlunos.setBounds(425, 78, 197, 22);
		panel_3.add(cboAlunos);
		
		JLabel lblNewLabel_18 = new JLabel("Alunos");
		lblNewLabel_18.setBounds(425, 59, 46, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_20 = new JLabel("Sala:");
		lblNewLabel_20.setBounds(10, 110, 46, 14);
		panel_3.add(lblNewLabel_20);
		
		txtSala = new JTextField();
		txtSala.setBounds(10, 129, 203, 20);
		panel_3.add(txtSala);
		txtSala.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("CADASTRO DE AULAS");
		lblNewLabel_19.setForeground(Color.DARK_GRAY);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_19.setBounds(225, 47, 196, 14);
		contentPane.add(lblNewLabel_19);
		
		JButton btnIncluirCurso = new JButton("Incluir Curso");
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obter o texto que está na caixa de titulo do curso e adicionar a caixa curso que está na area do criar aula
				txtCurso.setText(txtTituloCurso.getText());
				
				// Vamos adicionar os elementos do curso ao objeto curso, tais como:
				// titulo, carga, horaria, data/inicio
				
				curso.setTitulo(txtTituloCurso.getText());
				curso.setArea(cboArea.getSelectedItem().toString());
				curso.setCargaHoraria(txtCargaHoraria.getText());
				curso.setPreco(Double.parseDouble(txtValor.getText())); 
				
				// Vamos desativar o painel de curso. 
				// Vamos usar o comando enabled (habilitar) com valor false
				
				txtTituloCurso.setEnabled(false);
				cboArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtValor.setEnabled(false);
				btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 749, 114, 23);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir Sala");
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Preencher os dados do objeto sala
				sala.setIdentificacao(txtIdentificacao.getText());
				sala.setDescricao(txtDescricao.getText());
				
				txtSala.setText(txtIdentificacao.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
			}
		});
		btnIncluirSala.setBounds(137, 749, 107, 23);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir Professor");
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				professor.setNome(txtNomeProfessor.getText());
				professor.setEmail(txtEmailProfessor.getText());
				professor.setCpf(txtCpfProfessor.getText());
				
				
				txtProfessor.setText(txtNomeProfessor.getText());
				btnIncluirProfessor.setEnabled(false);
				txtNomeProfessor.setEnabled(false);
				txtCpfProfessor.setEnabled(false);
				txtEmailProfessor.setEnabled(false);
			}
		});
		btnIncluirProfessor.setBounds(257, 749, 136, 23);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir Aluno");
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno = new Aluno();
				
				aluno.setNome(txtNomeAluno.getText());
				aluno.setEmail(txtEmailAluno.getText());
				aluno.setCpf(txtCpfAluno.getText());
				aluno.setIdade(Integer.parseInt(txtIdadeAluno.getText()));
				listaAluno.add(aluno);
				
				cboAlunos.addItem(txtNomeAluno.getText());
			
				
			}
		});
		btnIncluirAluno.setBounds(406, 749, 114, 23);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAula = new JButton("Criar Aula");
		btnCriarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aulas.setId(Integer.parseInt(txtIdAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setTermino(new Date(Long.parseLong(txtTermino.getText())));
				
				aulas.setAlunos(listaAluno.toArray(new Aluno[0]));
				aulas.setSala(sala);
				
				txtIdAula.setEnabled(false);
				txtCurso.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtSala.setEnabled(false);
				
				System.out.print(cboAlunos.getItemAt(0));
				
				
				
				
				//btnCriarAula.setEnabled(false);
				//txtIdAula.setEnabled(false);
				//txtCurso.setEnabled(false);
				//txtProfessor.setEnabled(false);
				//txtInicio.setEnabled(false);
				//txtTermino.setEnabled(false);
				//cboAlunos.setEnabled(false);
			}
		});
		btnCriarAula.setBounds(533, 749, 101, 23);
		contentPane.add(btnCriarAula);
	}
}
