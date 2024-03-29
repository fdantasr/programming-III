package br.ufmt.araguaia.ccomp.projeto;

import java.util.Date;

public class Consulta {
    
   private Paciente paciente;
   private Medico medico;
   private Date data;

    public Consulta(Paciente paciente, Medico medico, Date data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void marcarConsulta(Medico medico, Paciente paciente, Date data){
    }
    public void cancelarConsulta(Consulta consulta){
    }
    public void excluirConsulta(Consulta consulta){
    }
    public Consulta[] pesquisarPorPaciente(Paciente paciente){
        return null;
    }


}
