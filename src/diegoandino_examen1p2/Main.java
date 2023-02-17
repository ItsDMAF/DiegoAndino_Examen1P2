package diegoandino_examen1p2;

public class Main extends javax.swing.JFrame {

    public Main() {
        setVisible(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CRUD = new javax.swing.JFrame();
        SiTip = new javax.swing.JRadioButton();
        NoTip = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Host = new javax.swing.JTextField();
        SiRGB = new javax.swing.JRadioButton();
        IP = new javax.swing.JTextField();
        NoTar = new javax.swing.JRadioButton();
        Eliminar = new javax.swing.JButton();
        Mask = new javax.swing.JTextField();
        AgreLap = new javax.swing.JButton();
        Almacen = new javax.swing.JTextField();
        SiTar1 = new javax.swing.JRadioButton();
        Lista = new javax.swing.JButton();
        RAM = new javax.swing.JTextField();
        NoRGB = new javax.swing.JRadioButton();
        AgreEscri = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Definicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Salida = new javax.swing.JButton();
        Crud = new javax.swing.JButton();
        Ingrese = new javax.swing.JButton();
        Pc = new javax.swing.JLabel();

        CRUD.setBackground(new java.awt.Color(204, 204, 204));

        SiTip.setForeground(new java.awt.Color(51, 51, 51));
        SiTip.setText("SI");
        SiTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiTipActionPerformed(evt);
            }
        });

        NoTip.setForeground(new java.awt.Color(51, 51, 51));
        NoTip.setText("NO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tarjeta:");

        Host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HostActionPerformed(evt);
            }
        });

        SiRGB.setForeground(new java.awt.Color(51, 51, 51));
        SiRGB.setText("SI");
        SiRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiRGBActionPerformed(evt);
            }
        });

        IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPActionPerformed(evt);
            }
        });

        NoTar.setForeground(new java.awt.Color(51, 51, 51));
        NoTar.setText("NO");
        NoTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoTarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(51, 51, 51));
        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(204, 204, 204));
        Eliminar.setText("Eliminar");

        Mask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaskActionPerformed(evt);
            }
        });

        AgreLap.setBackground(new java.awt.Color(51, 51, 51));
        AgreLap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgreLap.setForeground(new java.awt.Color(204, 204, 204));
        AgreLap.setText("Agregar Laptop");
        AgreLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreLapActionPerformed(evt);
            }
        });

        Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenActionPerformed(evt);
            }
        });

        SiTar1.setForeground(new java.awt.Color(51, 51, 51));
        SiTar1.setText("SI");
        SiTar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiTar1ActionPerformed(evt);
            }
        });

        Lista.setBackground(new java.awt.Color(51, 51, 51));
        Lista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lista.setForeground(new java.awt.Color(204, 204, 204));
        Lista.setText("Listar");

        RAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMActionPerformed(evt);
            }
        });

        NoRGB.setForeground(new java.awt.Color(51, 51, 51));
        NoRGB.setText("NO");

        AgreEscri.setBackground(new java.awt.Color(51, 51, 51));
        AgreEscri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AgreEscri.setForeground(new java.awt.Color(204, 204, 204));
        AgreEscri.setText("Agregar Escritorio");
        AgreEscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreEscriActionPerformed(evt);
            }
        });

        Return.setBackground(new java.awt.Color(51, 51, 51));
        Return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(204, 204, 204));
        Return.setText("RETURN");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("RGB:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Host:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Marca:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Definicion:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("IP:");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mask:");

        Definicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefinicionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("RAM:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Almacen:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CRUDLayout = new javax.swing.GroupLayout(CRUD.getContentPane());
        CRUD.getContentPane().setLayout(CRUDLayout);
        CRUDLayout.setHorizontalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDLayout.createSequentialGroup()
                .addComponent(Return)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CRUDLayout.createSequentialGroup()
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUDLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(CRUDLayout.createSequentialGroup()
                                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AgreEscri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AgreLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel7)))
                    .addGroup(CRUDLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUDLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CRUDLayout.createSequentialGroup()
                                .addComponent(SiTar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoTar)
                                .addContainerGap())
                            .addGroup(CRUDLayout.createSequentialGroup()
                                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RAM, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(Almacen))
                                    .addGroup(CRUDLayout.createSequentialGroup()
                                        .addComponent(SiTip, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NoTip)
                                        .addGap(12, 12, 12)))
                                .addGap(53, 53, 53)
                                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CRUDLayout.createSequentialGroup()
                                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Marca)
                                            .addComponent(Definicion))
                                        .addGap(51, 51, 51))
                                    .addGroup(CRUDLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(SiRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NoRGB)
                                        .addGap(45, 45, 45))))))
                    .addGroup(CRUDLayout.createSequentialGroup()
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Host, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(Mask)
                            .addComponent(IP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AgreLap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgreEscri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lista)
                .addGap(18, 18, 18)
                .addComponent(Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Almacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SiTip)
                    .addComponent(NoTip))
                .addGap(18, 18, 18)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NoTar)
                    .addComponent(SiTar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Return))
            .addGroup(CRUDLayout.createSequentialGroup()
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CRUDLayout.createSequentialGroup()
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Definicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SiRGB)
                    .addComponent(NoRGB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 204));
        Background.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        Title.setBackground(new java.awt.Color(51, 51, 51));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 51));
        Title.setText("MENU EXAMEN");

        Salida.setBackground(new java.awt.Color(51, 51, 51));
        Salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salida.setForeground(new java.awt.Color(204, 204, 204));
        Salida.setText("SALIDA");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        Crud.setBackground(new java.awt.Color(51, 51, 51));
        Crud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Crud.setForeground(new java.awt.Color(204, 204, 204));
        Crud.setText("CRUD PC");
        Crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrudActionPerformed(evt);
            }
        });

        Ingrese.setBackground(new java.awt.Color(51, 51, 51));
        Ingrese.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ingrese.setForeground(new java.awt.Color(204, 204, 204));
        Ingrese.setText("INGRESE");
        Ingrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseActionPerformed(evt);
            }
        });

        Pc.setBackground(new java.awt.Color(51, 51, 51));
        Pc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pc.setForeground(new java.awt.Color(51, 51, 51));
        Pc.setText("PC");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Title)
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Crud, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Pc)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(Crud, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingrese, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pc))
                .addGap(44, 44, 44)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        //SALIDA
        dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    private void CrudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrudActionPerformed
        //CRUD
        CRUD.setVisible(true);
        CRUD.setSize(this.size());
        this.setVisible(false);

    }//GEN-LAST:event_CrudActionPerformed

    private void IngreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseActionPerformed
        //INGRESE PC
    }//GEN-LAST:event_IngreseActionPerformed

    private void SiTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiTipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SiTipActionPerformed

    private void HostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HostActionPerformed

    private void SiRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiRGBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SiRGBActionPerformed

    private void IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IPActionPerformed

    private void MaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaskActionPerformed

    private void AgreLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgreLapActionPerformed

    private void AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenActionPerformed

    private void SiTar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiTar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SiTar1ActionPerformed

    private void RAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAMActionPerformed

    private void AgreEscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreEscriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgreEscriActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        //RETURN
        this.setVisible(true);
        CRUD.setVisible(false);
    }//GEN-LAST:event_ReturnActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void DefinicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefinicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefinicionActionPerformed

    private void NoTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoTarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoTarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgreEscri;
    private javax.swing.JButton AgreLap;
    private javax.swing.JTextField Almacen;
    private javax.swing.JPanel Background;
    private javax.swing.JFrame CRUD;
    private javax.swing.JButton Crud;
    private javax.swing.JTextField Definicion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Host;
    private javax.swing.JTextField IP;
    private javax.swing.JButton Ingrese;
    private javax.swing.JButton Lista;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Mask;
    private javax.swing.JRadioButton NoRGB;
    private javax.swing.JRadioButton NoTar;
    private javax.swing.JRadioButton NoTip;
    private javax.swing.JLabel Pc;
    private javax.swing.JTextField RAM;
    private javax.swing.JButton Return;
    private javax.swing.JButton Salida;
    private javax.swing.JRadioButton SiRGB;
    private javax.swing.JRadioButton SiTar1;
    private javax.swing.JRadioButton SiTip;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
