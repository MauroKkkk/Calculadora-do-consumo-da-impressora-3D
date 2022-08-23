/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto;
import java.awt.*;
import javax.swing.*;
import projeto.Calculadora;
import java.text.DecimalFormat;

/**
 *
 * @author IFMaker
 */
public class ViewCalculadora extends javax.swing.JFrame {


    public ViewCalculadora() {
        initComponents();
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        g = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        gg = new javax.swing.JToggleButton();
        ggg = new javax.swing.JToggleButton();
        gggg = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        core = new javax.swing.JToggleButton();
        finder = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        pla = new javax.swing.JToggleButton();
        abs = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora PLA");
        setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(600, 250));
        setResizable(false);

        jLabel1.setText("Hora:");

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Digite a hora");
        jTextField1.setToolTipText("");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setAutoscrolls(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("kWh:");

        jLabel3.setText("R$0,58");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFMaker\\Downloads\\1.png")); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Resultado");

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Filamento preço:");

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Digite o preço");
        jTextField3.setAutoscrolls(false);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        g.setText("250g");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        jLabel7.setText("Peso filamento:");

        gg.setText("500g");
        gg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ggActionPerformed(evt);
            }
        });

        ggg.setText("1kg");
        ggg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gggActionPerformed(evt);
            }
        });

        gggg.setText("1,5kg");
        gggg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ggggActionPerformed(evt);
            }
        });

        jLabel8.setText("Impressora:");

        core.setText("Core A1v2");
        core.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coreActionPerformed(evt);
            }
        });

        finder.setText("Finder");
        finder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finderActionPerformed(evt);
            }
        });

        jLabel9.setText("Material filamento:");

        pla.setText("PLA");
        pla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plaActionPerformed(evt);
            }
        });

        abs.setText("ABS");
        abs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absActionPerformed(evt);
            }
        });

        jLabel10.setText("Tamanho da peça:");

        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Digite o tamanho");
        jTextField4.setAutoscrolls(false);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Preço Energia:");

        jLabel12.setText("Gasto Filamento:");

        jLabel13.setText("Preço Filamento:");

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel14.setText("em metros.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ggg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gggg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abs))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(core)
                                .addGap(4, 4, 4)
                                .addComponent(finder)))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(158, 158, 158))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(g)
                    .addComponent(ggg)
                    .addComponent(gggg)
                    .addComponent(gg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pla)
                    .addComponent(abs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(core)
                    .addComponent(jLabel8)
                    .addComponent(finder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        jLabel1.getAccessibleContext().setAccessibleName("hora");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Calculadora calc = new Calculadora();
        
        if(g.isSelected())
        {
            if(abs.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularAbs(1,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
            }else if(pla.isSelected()){
                if(core.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(1,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }else if(finder.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(1,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaFinder();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }
            }else{
                
            }
        }
        else if(gg.isSelected())
        {
            if(abs.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularAbs(2,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
            }else if(pla.isSelected()){
                if(core.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(2,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }else if(finder.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(2,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaFinder();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }
            }else{
                
            }
        }
        else if(ggg.isSelected())
        {
            if(abs.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularAbs(4,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
            }else if(pla.isSelected()){
                if(core.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(4,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }else if(finder.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(4,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaFinder();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }

            }else{
                
            }
        }
        else if(gggg.isSelected())
        {
            if(abs.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularAbs(6,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
            }else if(pla.isSelected()){
                if(core.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(6,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaCore();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }else if(finder.isSelected()){
                double preco = Double.parseDouble(jTextField3.getText());
                double tpeca = Double.parseDouble(jTextField4.getText());
                double number = Double.parseDouble(jTextField1.getText());
                DecimalFormat formatador = new DecimalFormat("0.00");
                calc.calcularPla(6,tpeca,preco);
                calc.setHora(number);
                calc.calcularEnergiaFinder();
                jTextField2.setText("R$"+formatador.format(calc.getCustoEnergia()));
                jTextField5.setText("R$"+formatador.format(calc.getCustoFilamento()));
                jTextField6.setText(formatador.format(calc.getGastoFilamento())+"%");
                jTextField1.setText("Digite a hora");
                jTextField1.setForeground(new Color(153,153,153));
                jTextField3.setText("Digite o preço");
                jTextField3.setForeground(new Color(153,153,153));
                jTextField4.setText("Digite o tamanho");
                jTextField4.setForeground(new Color(153,153,153));
                }
            }else{
                
            }
        }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Digite a hora"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("Digite a hora");
            jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if(jTextField3.getText().equals("Digite o preço"))
        {
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals(""))
        {
            jTextField3.setText("Digite o preço");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void ggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ggActionPerformed
        if(gg.isSelected())
        {
            g.setSelected(false);
            ggg.setSelected(false);
            gggg.setSelected(false);
        }
    }//GEN-LAST:event_ggActionPerformed

    private void gggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gggActionPerformed
        if(ggg.isSelected())
        {
            g.setSelected(false);
            gg.setSelected(false);
            gggg.setSelected(false);
        }
    }//GEN-LAST:event_gggActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        if(g.isSelected())
        {
            gg.setSelected(false);
            ggg.setSelected(false);
            gggg.setSelected(false);
        }
    }//GEN-LAST:event_gActionPerformed

    private void ggggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ggggActionPerformed
        if(gggg.isSelected())
        {
            g.setSelected(false);
            gg.setSelected(false);
            ggg.setSelected(false);
        }
    }//GEN-LAST:event_ggggActionPerformed

    private void coreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coreActionPerformed
        if(core.isSelected())
        {
            finder.setSelected(false);
        }
    }//GEN-LAST:event_coreActionPerformed

    private void finderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finderActionPerformed
        if(finder.isSelected())
        {
            core.setSelected(false);
            pla.setSelected(true);
            abs.setSelected(false);
        }
    }//GEN-LAST:event_finderActionPerformed

    private void plaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plaActionPerformed
        if(pla.isSelected())
        {
            abs.setSelected(false);
        }
    }//GEN-LAST:event_plaActionPerformed

    private void absActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absActionPerformed
        if(abs.isSelected())
        {
            pla.setSelected(false);
            core.setSelected(true);
            finder.setSelected(false);
        }
    }//GEN-LAST:event_absActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if(jTextField4.getText().equals("Digite o tamanho"))
        {
            jTextField4.setText("");
            jTextField4.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().equals(""))
        {
            jTextField4.setText("Digite o tamanho");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton abs;
    private javax.swing.JToggleButton core;
    private javax.swing.JToggleButton finder;
    private javax.swing.JToggleButton g;
    private javax.swing.JToggleButton gg;
    private javax.swing.JToggleButton ggg;
    private javax.swing.JToggleButton gggg;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton pla;
    // End of variables declaration//GEN-END:variables
}
