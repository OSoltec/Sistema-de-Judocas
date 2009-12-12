package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;
import org.fpij.jitakyoei.view.gui.ProfessorCadastrarPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class ProfessorCadastrarForm {
	private ProfessorForm professorForm;
	private SwingBinder binder;

	public ProfessorCadastrarForm(ProfessorCadastrarPanel professorCadastrarPanel) {
		professorForm = new ProfessorForm(professorCadastrarPanel.getProfessorPanel());
		binder = new SwingBinder(professorCadastrarPanel, this);
		binder.bind();
	}
	
	@Action
	public void cadastrar() {
		Professor professor = professorForm.pegarBean();
		System.out.println(professor.toString());
	}

}