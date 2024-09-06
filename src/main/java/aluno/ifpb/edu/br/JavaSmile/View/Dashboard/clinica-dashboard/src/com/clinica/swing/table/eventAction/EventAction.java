package com.clinica.swing.table.eventAction;

import com.clinica.model.ModelPaciente;


public interface EventAction {
        
    public void delete(ModelPaciente paciente);
    
    public void update(ModelPaciente paciente);
}
