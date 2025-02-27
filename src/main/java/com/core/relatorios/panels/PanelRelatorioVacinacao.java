/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.relatorios.panels;
import javax.swing.JOptionPane;
import com.core.relatorios.RelatorioVacinacao;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Joao Conceicao
 */
public class PanelRelatorioVacinacao extends javax.swing.JPanel {

    /**
     * Creates new form PanelRelatorioVacinacao
     */
    public PanelRelatorioVacinacao(RelatorioVacinacao relatorio) {
        this.relatorio = relatorio;
        initComponents();
    }
    
    private RelatorioVacinacao relatorio;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEntre50e69 = new javax.swing.JTextField();
        jTextFieldMenor50 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDtInicio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelDtFinal = new javax.swing.JLabel();
        jButtonCalcMedia = new javax.swing.JButton();
        jDateDtInicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateDtFinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMaiorIgual90 = new javax.swing.JTextField();
        jTextFieldEntre70e89 = new javax.swing.JTextField();

        jTextFieldEntre50e69.setEditable(false);

        jTextFieldMenor50.setEditable(false);

        jLabel5.setText("Entre 70 e 89");

        jLabel6.setText("Entre 50 e 69");

        jLabelDtInicio.setText("Data de inicio");

        jLabel7.setText("Menor que 50");

        jLabelDtFinal.setText("Data Final");

        jButtonCalcMedia.setText("Calcular Média");
        jButtonCalcMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcMediaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Média de Vacinação por idade nesse período");

        jLabel4.setText("Maior ou igual a 90");

        jTextFieldMaiorIgual90.setEditable(false);

        jTextFieldEntre70e89.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel4)))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldMenor50, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEntre50e69)
                                            .addComponent(jTextFieldEntre70e89, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldMaiorIgual90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(57, 57, 57))
                        .addComponent(jButtonCalcMedia)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelDtInicio)
                            .addGap(16, 16, 16)
                            .addComponent(jDateDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jLabelDtFinal)
                            .addGap(18, 18, 18)
                            .addComponent(jDateDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelDtFinal)
                        .addComponent(jDateDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDtInicio)
                        .addComponent(jDateDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(jButtonCalcMedia)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldMaiorIgual90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldEntre70e89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldEntre50e69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldMenor50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcMediaActionPerformed
        try {
            this.validarCampos();
            this.relatorio.limparParams();
            this.relatorio.execute(this.jDateDtInicio.getDate(), this.jDateDtFinal.getDate());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
        }

        this.jTextFieldMaiorIgual90.setText(this.relatorio.getMaiorOuIgual90().toString());
        this.jTextFieldEntre70e89.setText(this.relatorio.getEntre70e90().toString());
        this.jTextFieldEntre50e69.setText(this.relatorio.getEntre50e70().toString());
        this.jTextFieldMenor50.setText(this.relatorio.getMenorOuIgual50().toString());
    }//GEN-LAST:event_jButtonCalcMediaActionPerformed
    
    private void validarCampos() throws Exception {
        String erro = "";

        if(this.jDateDtInicio.getDate() == null){
            erro += "O campo Data Inicial precisa ser preenchido.\n";
        }
        
        if(this.jDateDtFinal.getDate() == null){
            erro += "O campo Data Final precisa ser preenchido.\n";
        }
        
        if(this.jDateDtFinal.getDate().getTime() < this.jDateDtInicio.getDate().getTime()){
            erro += "A Data Final não pode ser menor que a Data Inicial\n";
        }
        
        if(!erro.isEmpty()){
            throw new Exception(erro);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcMedia;
    private com.toedter.calendar.JDateChooser jDateDtFinal;
    private com.toedter.calendar.JDateChooser jDateDtInicio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDtFinal;
    private javax.swing.JLabel jLabelDtInicio;
    private javax.swing.JTextField jTextFieldEntre50e69;
    private javax.swing.JTextField jTextFieldEntre70e89;
    private javax.swing.JTextField jTextFieldMaiorIgual90;
    private javax.swing.JTextField jTextFieldMenor50;
    // End of variables declaration//GEN-END:variables
}
