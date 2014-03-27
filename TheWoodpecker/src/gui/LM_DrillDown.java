
package gui;

import static Visual.WordCloud.WordCloud;
import database.TablesHandler;
import database.tweetHandler;
import model.tweetModel;
import java.util.ArrayList;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.LMDrillModel;
import ngram.NGramDriver;
import tweets.DDTweetCleaner;

/**
 *
 * @author Nancy
 */
public class LM_DrillDown extends javax.swing.JPanel {
 private static DefaultTableModel model;
 private LMDrillModel lmDM;
 
 String title = null; 
         int i=1;
         
    /**
     * Creates new form DD_Level1
     * @param lmDM
     */
    public LM_DrillDown(LMDrillModel lmDM) {
        this.lmDM = lmDM;
        initComponents();
//        insertNgram();
        
        if((JTabbedPane)this.getParent() != null){
            JTabbedPane j = (JTabbedPane)this.getParent();
            title = j.getTitleAt(j.getSelectedIndex()).substring(j.getTitleAt(j.getSelectedIndex()).length()-3, j.getTitleAt(j.getSelectedIndex()).length());
            System.out.println("~~~~~ "+lmDM.getTablename());
            if(title.equals("LM")){
             //   rawDataFld.setText("LANGUAGE MODEL");
            }
        }
        
        WordCloud(lmDM.getTopList(), lmDM.getKeywords());
        
//        insertTweetsList(TweetCleaner.getTweets());
//        insertNgram(TweetCleaner.getTfngrams());
//        WordCloud wc = new WordCloud(TweetCleaner.getTfngrams());
//        wordcloud.setBackground(Color.white);
//        WordCloud.display(wordcloud, WordCloud.getFont());
        
    }
    
    private void insertNgram(){
       model = (DefaultTableModel)ngramtweetTable.getModel();
       model.setRowCount(0);
       
        String t;
        double i;
            for(int num = 0; num < lmDM.getTopList().size(); num++){
               t= lmDM.getTopList().get(num).getTweet();
               i= lmDM.getTopList().get(num).getScore();
                     model.addRow(new Object[]{t,i});
            }
                
    }
   private void insertTweetsList(){
        model = (DefaultTableModel)tweetTable.getModel();
        model.setRowCount(0);
        
        ArrayList<tweetModel> tweets = tweetHandler.getAllTweets(lmDM.getTablename());
        
        for(tweetModel tm : tweets)
            model.addRow(new Object[]{tm.getDate(), tm.getMessage()});
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RawData = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        drillkeyTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        closetabBtn = new javax.swing.JButton();
        drilldownBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        viewtweetsBtn = new javax.swing.JButton();
        wordcloud = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        drillkeyTF1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveBtn3 = new javax.swing.JButton();
        viewtweetsBtn1 = new javax.swing.JButton();
        closetabBtn3 = new javax.swing.JButton();
        drilldownBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngramtweetTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        drillkeyTF2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        viewtweetsBtn2 = new javax.swing.JButton();
        drilldownBtn3 = new javax.swing.JButton();
        saveBtn4 = new javax.swing.JButton();
        closetabBtn4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tweetTable = new javax.swing.JTable();
        drillkeyTF3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        closetabBtn1 = new javax.swing.JButton();
        drilldownBtn2 = new javax.swing.JButton();
        saveBtn1 = new javax.swing.JButton();
        viewtweetsBtn3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setMinimumSize(new java.awt.Dimension(774, 394));
        setPreferredSize(new java.awt.Dimension(774, 394));

        RawData.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        RawData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RawDataMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("KEYWORD/S FOR DRILLDOWN :");

        drillkeyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drillkeyTFActionPerformed(evt);
            }
        });

        closetabBtn.setText("X");
        closetabBtn.setToolTipText("close this tab");
        closetabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closetabBtnActionPerformed(evt);
            }
        });

        drilldownBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drilldownBtn.setText("DRILLDOWN");
        drilldownBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drilldownBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save...");

        viewtweetsBtn.setText("View Tweet Data");
        viewtweetsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtweetsBtnActionPerformed(evt);
            }
        });

        wordcloud.setBackground(new java.awt.Color(0, 0, 0));
        wordcloud.setOpaque(false);
        wordcloud.setPreferredSize(new java.awt.Dimension(745, 483));

        javax.swing.GroupLayout wordcloudLayout = new javax.swing.GroupLayout(wordcloud);
        wordcloud.setLayout(wordcloudLayout);
        wordcloudLayout.setHorizontalGroup(
            wordcloudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        wordcloudLayout.setVerticalGroup(
            wordcloudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drillkeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closetabBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(219, 219, 219))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(drilldownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewtweetsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(wordcloud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(drillkeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closetabBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drilldownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtweetsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordcloud, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RawData.addTab("Word Cloud", jPanel1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("KEYWORD/S FOR DRILLDOWN :");

        saveBtn3.setText("Save...");

        viewtweetsBtn1.setText("View Tweet Data");
        viewtweetsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtweetsBtn1ActionPerformed(evt);
            }
        });

        closetabBtn3.setText("X");
        closetabBtn3.setToolTipText("close this tab");
        closetabBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closetabBtn3ActionPerformed(evt);
            }
        });

        drilldownBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drilldownBtn1.setText("DRILLDOWN");
        drilldownBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drilldownBtn1ActionPerformed(evt);
            }
        });

        ngramtweetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tweet Message", "TF-IDF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngramtweetTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drillkeyTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closetabBtn3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drilldownBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewtweetsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(drillkeyTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(closetabBtn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtweetsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drilldownBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        RawData.addTab("Raw Data", jPanel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("KEYWORD/S FOR DRILLDOWN :");

        viewtweetsBtn2.setText("View Tweet Data");
        viewtweetsBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtweetsBtn2ActionPerformed(evt);
            }
        });

        drilldownBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drilldownBtn3.setText("DRILLDOWN");
        drilldownBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drilldownBtn3ActionPerformed(evt);
            }
        });

        saveBtn4.setText("Save...");

        closetabBtn4.setText("X");
        closetabBtn4.setToolTipText("close this tab");
        closetabBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closetabBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(saveBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(drilldownBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewtweetsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drillkeyTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closetabBtn4))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(drillkeyTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closetabBtn4))
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewtweetsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(drilldownBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        RawData.addTab("Timeline", jPanel3);

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        RawData.addTab("Feature Statistics", jPanel4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("KEYWORD/S FOR DRILLDOWN :");

        tweetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Tweet Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tweetTable);

        drillkeyTF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drillkeyTF3ActionPerformed(evt);
            }
        });

        closetabBtn1.setText("X");
        closetabBtn1.setToolTipText("close this tab");
        closetabBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closetabBtn1ActionPerformed(evt);
            }
        });

        drilldownBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drilldownBtn2.setText("DRILLDOWN");
        drilldownBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drilldownBtn2ActionPerformed(evt);
            }
        });

        saveBtn1.setText("Save...");

        viewtweetsBtn3.setText("View Tweet Data");
        viewtweetsBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewtweetsBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drillkeyTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closetabBtn1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(saveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drilldownBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewtweetsBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(143, 143, 143)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(drillkeyTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closetabBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drilldownBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(viewtweetsBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jLabel3)
                    .addGap(196, 196, 196)))
        );

        RawData.addTab("Tweet Data", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RawData, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RawData)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drilldownBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drilldownBtnActionPerformed
        if( !drillkeyTF.getText().isEmpty()){
            JTabbedPane tabPane = (JTabbedPane)this.getParent();
            String DDkeywords = drillkeyTF.getText();
          
            NGramDriver.emptyNgram();
            DDTweetCleaner ddTC = new DDTweetCleaner();
            LMDrillModel DDlmDrillModel = ddTC.cleanByKeyword(DDkeywords, lmDM);
            
            String keys = DDkeywords;
            keys = keys.replaceAll(",", " ");
            keys = keys.replaceAll(";", " ");
            String[] keywords = keys.split(" ");
            
            DDlmDrillModel.setKeywords(keywords);
            LM_DrillDown p = new LM_DrillDown(DDlmDrillModel);
            String method = "LM";
                
//            p.setLmDM(DDlmDrillModel);
            tabPane.add("LV" + DDlmDrillModel.getLevel() + " - " + DDkeywords + " - " + method, p);
            tabPane.setSelectedComponent(p);
        }
    }//GEN-LAST:event_drilldownBtnActionPerformed

    private void closetabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closetabBtnActionPerformed
        TablesHandler.dropTable(lmDM.getTablename());
        this.getParent().remove(this);
    }//GEN-LAST:event_closetabBtnActionPerformed

    private void viewtweetsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtweetsBtnActionPerformed
        viewTweets vt = new viewTweets();
        vt.setVisible(true);
    }//GEN-LAST:event_viewtweetsBtnActionPerformed

    private void viewtweetsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtweetsBtn1ActionPerformed
        viewTweets vt = new viewTweets();
        vt.setVisible(true);
    }//GEN-LAST:event_viewtweetsBtn1ActionPerformed

    private void closetabBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closetabBtn3ActionPerformed
        this.getParent().remove(this);
    }//GEN-LAST:event_closetabBtn3ActionPerformed

    private void drilldownBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drilldownBtn1ActionPerformed
//      if( !drillkeyTF.getText().isEmpty()){
//            TweetCleaner tc = new TweetCleaner();
//            tc.cleanByKeyword(drillkeyTF.getText());
//            
//          
//                LM_DrillDown p = new LM_DrillDown();
//              String method = "LM";
//                 JTabbedPane j = (JTabbedPane)this.getParent();
//        
//                  j.add(drillkeyTF.getText()+" - "+ method , p);
//                  j.setSelectedComponent(p);
//               
//            
//               
//        }
    }//GEN-LAST:event_drilldownBtn1ActionPerformed

    private void viewtweetsBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtweetsBtn2ActionPerformed
        viewTweets vt = new viewTweets();
        vt.setVisible(true);
    }//GEN-LAST:event_viewtweetsBtn2ActionPerformed

    private void drilldownBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drilldownBtn3ActionPerformed
//     if( !drillkeyTF.getText().isEmpty()){
//            TweetCleaner tc = new TweetCleaner();
//            tc.cleanByKeyword(drillkeyTF.getText());
//            
//          
//                LM_DrillDown p = new LM_DrillDown();
//              String method = "LM";
//                 JTabbedPane j = (JTabbedPane)this.getParent();
//        
//                  j.add(drillkeyTF.getText()+" - "+ method , p);
//                  j.setSelectedComponent(p);
//               
//            
//               
//        }
    }//GEN-LAST:event_drilldownBtn3ActionPerformed

    private void closetabBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closetabBtn4ActionPerformed
        this.getParent().remove(this);
    }//GEN-LAST:event_closetabBtn4ActionPerformed

    private void RawDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RawDataMouseClicked
      insertNgram();
      insertTweetsList();
        /*  JTabbedPane j = (JTabbedPane)this.getParent();
        String title = j.getTitleAt(j.getSelectedIndex()).substring(j.getTitleAt(j.getSelectedIndex()).length()-3, j.getTitleAt(j.getSelectedIndex()).length());
        System.out.println(title);
        
        if(title.contains("LM")){   //topic modeler raw output
            Reader read = new Reader("src\\ngramuaaptweets.txt");
            List<String> lines = read.read();
            String rawdata = "";
            for(String s : lines){
                rawdata = rawdata.concat(s+"\n");
                System.out.println(s);
            }
            rawDataFld.setText(rawdata);
        }else{  //language modeler raw output
            Reader read = new Reader("src\\stm uaap.txt");
            List<String> lines = read.read();
            String rawdata = "";
            for(String s : lines){
                rawdata = rawdata.concat(s+"\n");
                System.out.println(s);
            }
            rawDataFld.setText(rawdata);
        }*/
    }//GEN-LAST:event_RawDataMouseClicked

    private void drillkeyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drillkeyTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drillkeyTFActionPerformed

    private void drillkeyTF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drillkeyTF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drillkeyTF3ActionPerformed

    private void closetabBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closetabBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closetabBtn1ActionPerformed

    private void drilldownBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drilldownBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drilldownBtn2ActionPerformed

    private void viewtweetsBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewtweetsBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewtweetsBtn3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane RawData;
    private javax.swing.JButton closetabBtn;
    private javax.swing.JButton closetabBtn1;
    private javax.swing.JButton closetabBtn3;
    private javax.swing.JButton closetabBtn4;
    private javax.swing.JButton drilldownBtn;
    private javax.swing.JButton drilldownBtn1;
    private javax.swing.JButton drilldownBtn2;
    private javax.swing.JButton drilldownBtn3;
    private javax.swing.JTextField drillkeyTF;
    private javax.swing.JTextField drillkeyTF1;
    private javax.swing.JTextField drillkeyTF2;
    private javax.swing.JTextField drillkeyTF3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable ngramtweetTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JButton saveBtn3;
    private javax.swing.JButton saveBtn4;
    private javax.swing.JTable tweetTable;
    private javax.swing.JButton viewtweetsBtn;
    private javax.swing.JButton viewtweetsBtn1;
    private javax.swing.JButton viewtweetsBtn2;
    private javax.swing.JButton viewtweetsBtn3;
    public static javax.swing.JPanel wordcloud;
    // End of variables declaration//GEN-END:variables

    private Iterable<String> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the lmDM
     */
    public LMDrillModel getLmDM() {
        return lmDM;
    }

    /**
     * @param lmDM the lmDM to set
     */
    public void setLmDM(LMDrillModel lmDM) {
        this.lmDM = lmDM;
    }
}
