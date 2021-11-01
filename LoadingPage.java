package supermarketbillingsystem;


import java.util.Objects;

public class LoadingPage extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LoadingPage() {
        initComponents();
        this.setLocationRelativeTo(null);                                       //to align the frame to centre of the screen

    }

    @SuppressWarnings("SleepWhileInLoop")
     public static void LoadingBar(){                                            //delay loading on progress bar
        LoadingPage load = new LoadingPage();
        load.setVisible(true);
        try{
            for(int i=0;i<101;i++){
               Thread.sleep(40);
               load.loadingBar.setValue(i);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        LoginPage login = new LoginPage();
        load.dispose(); 
        login.setVisible(true);
     }

     // <editor-fold default-state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel loadingPageMainPanel = new javax.swing.JPanel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JLabel bgLabel = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        loadingPageMainPanel.setBackground(new java.awt.Color(153, 0, 153));

        bgLabel.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/supermarketbillingsystem/Loading.jpg")))); // NOI18N

        loadingBar.setForeground(new java.awt.Color(0, 0, 204));
        loadingBar.setBorder(null);
        loadingBar.setBorderPainted(false);

        javax.swing.GroupLayout loadingPageMainPanelLayout = new javax.swing.GroupLayout(loadingPageMainPanel);
        loadingPageMainPanel.setLayout(loadingPageMainPanelLayout);
        loadingPageMainPanelLayout.setHorizontalGroup(
            loadingPageMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 950, Short.MAX_VALUE)
            .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loadingPageMainPanelLayout.setVerticalGroup(
            loadingPageMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingPageMainPanelLayout.createSequentialGroup()
                .addComponent(bgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingPageMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadingPageMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    public static void main(String[] args) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoadingPage().setVisible(true));
    }

    private javax.swing.JProgressBar loadingBar;
    // End of variables declaration//GEN-END:variables
}
