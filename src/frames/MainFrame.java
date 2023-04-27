package frames;

import classes.Batch;
import classes.Course;
import classes.DBConnection;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class MainFrame extends javax.swing.JFrame {

    Connection con = new DBConnection().dBConn();
    DefaultTableModel course_model = new DefaultTableModel(new String[]{"Course Code", "Course Name", "Course Level", "Course Type"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel batch_model = new DefaultTableModel(new String[]{"Course Code", "Batch Number", "Batch Name", "Batch Capacity", "Tuition Fee", "Batch Starting Date"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date_format_yyyy = new SimpleDateFormat("yyyy");
    DecimalFormat df = new DecimalFormat("#,##0.00");
    ArrayList<Course> tempCourse;
    ArrayList<Batch> tempBatch;
    String course_Type;

    public MainFrame() {
        initComponents();
        tbl_courseDetails.setModel(course_model);
        tbl_batchDetails.setModel(batch_model);
        tbl_batchDetails.getColumnModel().getColumn(2).setPreferredWidth(150);
        AutoCompleteDecorator.decorate(cb_coCode);
        setDefaults();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab_CoBa = new javax.swing.JTabbedPane();
        pnlCourse = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_courseDetails = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_coCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_courseName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox<>();
        lblValCoCo = new javax.swing.JLabel();
        lblValCoName = new javax.swing.JLabel();
        lblValLevel = new javax.swing.JLabel();
        lblValCoType = new javax.swing.JLabel();
        cbCourseType = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btn_insertCD = new javax.swing.JButton();
        btn_updateCD = new javax.swing.JButton();
        btn_deleteCD = new javax.swing.JButton();
        btn_clearCD = new javax.swing.JButton();
        pnlSearch = new javax.swing.JPanel();
        cbSearchItemCo = new javax.swing.JComboBox<>();
        tfSearchCo = new javax.swing.JTextField();
        lblSearchCo = new javax.swing.JLabel();
        btnClearSearchCo = new javax.swing.JButton();
        btnRefreshCo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_batchDetails = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_batchName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_batchCap = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_tutionFee = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dc_startDate = new com.toedter.calendar.JDateChooser();
        cb_coCode = new javax.swing.JComboBox<>();
        tfBatchNum = new javax.swing.JTextField();
        lblCourseNameAndVal = new javax.swing.JLabel();
        lblValBSDate = new javax.swing.JLabel();
        lblValBaNo = new javax.swing.JLabel();
        lblValBaCapa = new javax.swing.JLabel();
        lblValTuFee = new javax.swing.JLabel();
        tfBatNoNnEdit = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btn_clear = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        pnlSearch1 = new javax.swing.JPanel();
        cbSearchItem = new javax.swing.JComboBox<>();
        tfBatchSearch = new javax.swing.JTextField();
        lblBaSearch = new javax.swing.JLabel();
        btnClearSearch = new javax.swing.JButton();
        btnRefreshBatch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Registration");

        tab_CoBa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_CoBaStateChanged(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_courseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_courseDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_courseDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_courseDetails);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Course Code");

        txt_coCode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_coCodeCaretUpdate(evt);
            }
        });
        txt_coCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_coCodeFocusLost(evt);
            }
        });
        txt_coCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_coCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_coCodeKeyTyped(evt);
            }
        });

        jLabel3.setText("Course Name");

        txt_courseName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_courseNameCaretUpdate(evt);
            }
        });
        txt_courseName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_courseNameFocusLost(evt);
            }
        });
        txt_courseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_courseNameKeyReleased(evt);
            }
        });

        jLabel4.setText("Level");

        jLabel5.setText("Course Type");

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7" }));
        cbLevel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLevelItemStateChanged(evt);
            }
        });
        cbLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbLevelKeyReleased(evt);
            }
        });

        lblValCoCo.setForeground(new java.awt.Color(255, 0, 0));
        lblValCoCo.setText("Ex : HD");

        lblValCoName.setForeground(new java.awt.Color(255, 0, 0));
        lblValCoName.setText("Hairdresser");

        lblValLevel.setForeground(new java.awt.Color(255, 0, 0));
        lblValLevel.setText("level validation");

        lblValCoType.setForeground(new java.awt.Color(255, 0, 0));
        lblValCoType.setText("course type validation");

        cbCourseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course Type", "Full Time", "Part Time" }));
        cbCourseType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbCourseTypeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbCourseTypeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_coCode))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblValCoName)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_courseName)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValCoType)
                                    .addComponent(lblValLevel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbCourseType, 0, 156, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lblValCoCo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_coCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValCoCo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValCoName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbCourseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblValCoType)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_insertCD.setText("Insert");
        btn_insertCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertCDActionPerformed(evt);
            }
        });

        btn_updateCD.setText("Update");
        btn_updateCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateCDActionPerformed(evt);
            }
        });

        btn_deleteCD.setText("Delete");
        btn_deleteCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCDActionPerformed(evt);
            }
        });

        btn_clearCD.setText("Clear");
        btn_clearCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_insertCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_updateCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_deleteCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clearCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_insertCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_updateCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clearCD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbSearchItemCo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Code", "Course Name", "Level", "Type" }));

        tfSearchCo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfSearchCoCaretUpdate(evt);
            }
        });

        lblSearchCo.setForeground(new java.awt.Color(255, 0, 0));
        lblSearchCo.setText("Not Found");

        btnClearSearchCo.setText("Clear");

        btnRefreshCo.setText("Refresh");
        btnRefreshCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSearchItemCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(lblSearchCo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(tfSearchCo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearSearchCo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshCo)))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearchItemCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearchCo)
                    .addComponent(btnRefreshCo))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSearchCo)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCourseLayout = new javax.swing.GroupLayout(pnlCourse);
        pnlCourse.setLayout(pnlCourseLayout);
        pnlCourseLayout.setHorizontalGroup(
            pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCourseLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlCourseLayout.setVerticalGroup(
            pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCourseLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tab_CoBa.addTab("Course Details", pnlCourse);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_batchDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_batchDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_batchDetails.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tbl_batchDetailsMouseDragged(evt);
            }
        });
        tbl_batchDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_batchDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_batchDetails);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Course Code");

        jLabel7.setText("Batch Number");

        jLabel8.setText("Batch Name");

        txt_batchName.setEditable(false);
        txt_batchName.setForeground(new java.awt.Color(0, 102, 204));

        jLabel9.setText("Batch Capacity");

        txt_batchCap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_batchCapFocusLost(evt);
            }
        });

        jLabel10.setText("Tuition Fee");

        txt_tutionFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tutionFeeFocusLost(evt);
            }
        });

        jLabel11.setText("Batch Starting Date");

        dc_startDate.setDateFormatString("yyyy-MM-dd");
        dc_startDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dc_startDatePropertyChange(evt);
            }
        });

        cb_coCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BT", "HD", "AM", "SW" }));
        cb_coCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_coCodeItemStateChanged(evt);
            }
        });
        cb_coCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_coCodeActionPerformed(evt);
            }
        });

        tfBatchNum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfBatchNumCaretUpdate(evt);
            }
        });
        tfBatchNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBatchNumFocusLost(evt);
            }
        });

        lblCourseNameAndVal.setForeground(new java.awt.Color(0, 102, 204));
        lblCourseNameAndVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourseNameAndVal.setText("Course Name");

        lblValBSDate.setForeground(new java.awt.Color(255, 0, 0));
        lblValBSDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValBSDate.setText("jLabel12");

        lblValBaNo.setForeground(new java.awt.Color(255, 0, 0));
        lblValBaNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValBaNo.setText("jLabel13");

        lblValBaCapa.setForeground(new java.awt.Color(255, 0, 0));
        lblValBaCapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValBaCapa.setText("jLabel14");

        lblValTuFee.setForeground(new java.awt.Color(255, 0, 0));
        lblValTuFee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValTuFee.setText("jLabel15");

        tfBatNoNnEdit.setEditable(false);
        tfBatNoNnEdit.setForeground(new java.awt.Color(0, 102, 204));
        tfBatNoNnEdit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tfBatNoNnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBatchNum, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addComponent(txt_batchCap)
                            .addComponent(txt_tutionFee)
                            .addComponent(lblValBSDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValBaCapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValTuFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_coCode, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCourseNameAndVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dc_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_batchName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblValBaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_coCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCourseNameAndVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(dc_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValBSDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfBatchNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBatNoNnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValBaNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_batchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_batchCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValBaCapa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tutionFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValTuFee)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btn_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearch1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbSearchItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Code", "Batch Number", "Batch Name", "Batch Capacity", "Tution Fee", "Batch Start Date" }));

        tfBatchSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfBatchSearchCaretUpdate(evt);
            }
        });

        lblBaSearch.setForeground(new java.awt.Color(255, 0, 0));
        lblBaSearch.setText("Not found");

        btnClearSearch.setText("Clear");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        btnRefreshBatch.setText("Refresh");
        btnRefreshBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshBatchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearch1Layout = new javax.swing.GroupLayout(pnlSearch1);
        pnlSearch1.setLayout(pnlSearch1Layout);
        pnlSearch1Layout.setHorizontalGroup(
            pnlSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearch1Layout.createSequentialGroup()
                        .addComponent(lblBaSearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSearch1Layout.createSequentialGroup()
                        .addComponent(tfBatchSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshBatch)))
                .addContainerGap())
        );
        pnlSearch1Layout.setVerticalGroup(
            pnlSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBatchSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearch)
                    .addComponent(btnRefreshBatch))
                .addGap(0, 0, 0)
                .addComponent(lblBaSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tab_CoBa.addTab("Batch Details", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tab_CoBa)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_CoBa)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1141, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCDActionPerformed
        if (tbl_courseDetails.getSelectedRowCount() == 1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want delete this course data ?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                deleteCourseData();
                resetCourseFields();
                clearValLabelsCourse();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select row to delete");
        }
    }//GEN-LAST:event_btn_deleteCDActionPerformed

    private void btn_insertCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertCDActionPerformed
        if (isCourseDataValidate() && !isDuplicateCourse()) {
            insertCoureDetails();
            resetCourseFields();
            clearValLabelsCourse();
        } else {
            validateCourseData();
        }
    }//GEN-LAST:event_btn_insertCDActionPerformed

    private void tbl_courseDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_courseDetailsMouseClicked
        if (tbl_courseDetails.getSelectedRowCount() == 1) {
            resetCourseFields();
            txt_coCode.setText(course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 0).toString());
            txt_courseName.setText(course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 1).toString());
            cbLevel.setSelectedItem(course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 2).toString());
            String item = course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 3).toString();
            if (item.equals("FT")) {
                cbCourseType.setSelectedIndex(1);
            }
            if (item.equals("PT")) {
                cbCourseType.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_tbl_courseDetailsMouseClicked

    private void btn_clearCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearCDActionPerformed
        resetCourseFields();
        clearValLabelsCourse();
    }//GEN-LAST:event_btn_clearCDActionPerformed

    private void txt_coCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coCodeKeyTyped

    }//GEN-LAST:event_txt_coCodeKeyTyped

    private void btn_updateCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateCDActionPerformed
        if (tbl_courseDetails.getSelectedRowCount() == 1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want update this course data", "Confirm Update", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                if (isCourseDataValidate() && !isDuplicateCourse()) {
                    updateCourseData();
                    resetCourseFields();
                    clearValLabelsCourse();
                } else {
                    validateCourseData();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select row to delete");
        }
    }//GEN-LAST:event_btn_updateCDActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (tbl_batchDetails.getSelectedRowCount() == 1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want delete this batch data ?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                deleteBatchData();
                resetBatchFields();
                clearValFieldLblBatch();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select row to delete");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        if (isValidateBatchData()) {
            insertBatchDetails();
            resetBatchFields();
            clearValFieldLblBatch();
        } else {
            validateBatchFields();
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void cb_coCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_coCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_coCodeActionPerformed

    private void tab_CoBaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_CoBaStateChanged
        setCourseCodeItems("SELECT DISTINCT course_code, course_name FROM course_details");
    }//GEN-LAST:event_tab_CoBaStateChanged

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want update this batch data ?", "Confirm Update", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            if (isValidateBatchData() && tbl_batchDetails.getSelectedRowCount() == 1) {
                updateBatchData();
                resetBatchFields();
                clearValFieldLblBatch();
            } else {
                validateBatchFields();
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tbl_batchDetailsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_batchDetailsMouseDragged

    }//GEN-LAST:event_tbl_batchDetailsMouseDragged

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        resetBatchFields();
        clearValFieldLblBatch();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void cb_coCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_coCodeItemStateChanged
        if (cb_coCode.getSelectedIndex() > 0) {
            lblCourseNameAndVal.setForeground(Color.blue);
            lblCourseNameAndVal.setText(tempCourse.get(cb_coCode.getSelectedIndex() - 1).getCourseName());
            String date = (dc_startDate.getDate() != null) ? date_format_yyyy.format(dc_startDate.getDate()) : "";
            tfBatNoNnEdit.setText(cb_coCode.getSelectedItem() + "-" + date + "-");
            txt_batchName.setText(lblCourseNameAndVal.getText() + "-" + date + "-" + tfBatchNum.getText());
        } else {
            lblCourseNameAndVal.setText("");
            tfBatNoNnEdit.setText("");
            txt_batchName.setText("");
        }
    }//GEN-LAST:event_cb_coCodeItemStateChanged

    private void tfBatchNumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfBatchNumCaretUpdate
        if (cb_coCode.getSelectedIndex() > 0) {
            String date = (dc_startDate.getDate() != null) ? date_format_yyyy.format(dc_startDate.getDate()) : "";
            tfBatNoNnEdit.setText(cb_coCode.getSelectedItem() + "-" + date + "-");
            txt_batchName.setText(lblCourseNameAndVal.getText() + "-" + date + "-" + tfBatchNum.getText());
        } else {
            lblCourseNameAndVal.setText("Please select course code");
            lblCourseNameAndVal.setForeground(Color.red);
            tfBatNoNnEdit.setText("");
            txt_batchName.setText("");
        }
        if (dc_startDate.getDate() == null) {
            lblValBSDate.setText("Please select date");
        }
    }//GEN-LAST:event_tfBatchNumCaretUpdate

    private void dc_startDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dc_startDatePropertyChange
        if (cb_coCode.getSelectedIndex() > 0) {
            String date = (dc_startDate.getDate() != null) ? date_format_yyyy.format(dc_startDate.getDate()) : "";
            tfBatNoNnEdit.setText(cb_coCode.getSelectedItem() + "-" + date + "-");
            txt_batchName.setText(lblCourseNameAndVal.getText() + "-" + date + "-" + tfBatchNum.getText());
        } else {
            lblCourseNameAndVal.setText("Please select course code");
            lblCourseNameAndVal.setForeground(Color.red);
            tfBatNoNnEdit.setText("");
            txt_batchName.setText("");
        }
        if (dc_startDate.getDate() != null) {
            lblValBSDate.setText("");
        }
    }//GEN-LAST:event_dc_startDatePropertyChange

    private void tfBatchNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBatchNumFocusLost
        if (tfBatchNum.getText().isEmpty()) {
            lblValBaNo.setText("Batch Number Required");
        } else if (!Pattern.matches("[0-9]{2}", tfBatchNum.getText())) {
            lblValBaNo.setText("Example : 01");
        } else {
            lblValBaNo.setText("");
        }
    }//GEN-LAST:event_tfBatchNumFocusLost

    private void txt_batchCapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_batchCapFocusLost
        if (txt_batchCap.getText().isEmpty()) {
            lblValBaCapa.setText("Batch Capacity Required");
        } else if (!Pattern.matches("[0-9]{1,3}", txt_batchCap.getText())) {
            lblValBaCapa.setText("Only numbers (1-999)");
        } else {
            lblValBaCapa.setText("");
        }
    }//GEN-LAST:event_txt_batchCapFocusLost

    private void txt_tutionFeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tutionFeeFocusLost
        if (txt_tutionFee.getText().isEmpty()) {
            lblValTuFee.setText("Tution Fee Required");
        } else if (!Pattern.matches("([0-9]{1,3})+([,]{1}[0-9]{3})*([.]{1}[0-9]{0,2})?", txt_tutionFee.getText())) {
            lblValTuFee.setText("Example : 10.00 or 10");
        } else {
            lblValTuFee.setText("");
        }
    }//GEN-LAST:event_txt_tutionFeeFocusLost

    private void tbl_batchDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_batchDetailsMouseClicked
        if (tbl_batchDetails.getSelectedRowCount() == 1) {
            resetBatchFields();
            cb_coCode.setSelectedItem(batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 0).toString());
            try {
                dc_startDate.setDate(date_format.parse(batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 5).toString()));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Error in string convert to date : " + e.getMessage());
            }
            String batchNumber = batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 1).toString();
            tfBatchNum.setText(batchNumber.substring(batchNumber.length() - 2));
            txt_batchCap.setText(batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 3).toString());
            txt_tutionFee.setText(batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tbl_batchDetailsMouseClicked

    private void tfSearchCoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCoCaretUpdate
        if (tfSearchCo.getText().isEmpty()) {
            setCourseTableData("SELECT * FROM course_details");
            lblSearchCo.setText("");
        } else {
            String query = "SELECT * FROM course_details WHERE " + cbSearchItemCo.getSelectedItem().toString().toLowerCase().replace(" ", "_") + " LIKE '%" + tfSearchCo.getText() + "%'";
            setCourseTableData(query);
            if (getCourseList(query).size() > 0) {
                lblSearchCo.setText("");
            } else {
                lblSearchCo.setText("Not found");
            }
        }
    }//GEN-LAST:event_tfSearchCoCaretUpdate

    private void tfBatchSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfBatchSearchCaretUpdate
        if (tfBatchSearch.getText().isEmpty()) {
            setBatchTableData("SELECT * FROM batch_details");
            lblBaSearch.setText("");
        } else {
            String query = "SELECT * FROM batch_details WHERE " + cbSearchItem.getSelectedItem().toString().toLowerCase().replace(" ", "_") + " LIKE '%" + tfBatchSearch.getText() + "%'";
            setBatchTableData(query);
            if (getBatchList(query).size() > 0) {
                lblBaSearch.setText("");
            } else {
                lblBaSearch.setText("Not found");
            }
        }
    }//GEN-LAST:event_tfBatchSearchCaretUpdate

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        tfBatchSearch.setText("");
    }//GEN-LAST:event_btnClearSearchActionPerformed

    private void txt_coCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_coCodeFocusLost

    }//GEN-LAST:event_txt_coCodeFocusLost

    private void txt_courseNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_courseNameFocusLost

    }//GEN-LAST:event_txt_courseNameFocusLost

    private void cbLevelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLevelItemStateChanged
        if (cbLevel.getSelectedIndex() == 0) {
            lblValLevel.setText("Please select course level");
        } else {
            lblValLevel.setText("");
        }
    }//GEN-LAST:event_cbLevelItemStateChanged

    private void txt_coCodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_coCodeCaretUpdate
        if (txt_coCode.getText().isEmpty()) {
            lblValCoCo.setText("Course Code Required");
        } else if (!Pattern.matches("^[A-Z]+$", txt_coCode.getText())) {
            lblValCoCo.setText("Ex : SD");
        } else {
            lblValCoCo.setText("");
        }
    }//GEN-LAST:event_txt_coCodeCaretUpdate

    private void txt_courseNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_courseNameCaretUpdate
        if (txt_courseName.getText().isEmpty()) {
            lblValCoName.setText("Course Name Required");
        } else if (!Pattern.matches("^([A-Z]{1}[a-z]{0,15}[ ]?){1,4}", txt_courseName.getText())) {
            lblValCoName.setText("Ex : Software Developer");
        } else {
            lblValCoName.setText("");

        }
    }//GEN-LAST:event_txt_courseNameCaretUpdate

    private void btnRefreshCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCoActionPerformed
        setCourseTableData("SELECT * FROM course_details");
    }//GEN-LAST:event_btnRefreshCoActionPerformed

    private void btnRefreshBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshBatchActionPerformed
        setBatchTableData("SELECT * FROM batch_details");
    }//GEN-LAST:event_btnRefreshBatchActionPerformed

    private void txt_coCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coCodeKeyReleased
        focusNextField(evt, txt_courseName);
    }//GEN-LAST:event_txt_coCodeKeyReleased

    private void txt_courseNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_courseNameKeyReleased
        focusBeforeField(evt, txt_coCode);
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbLevel.requestFocus();
        }
    }//GEN-LAST:event_txt_courseNameKeyReleased

    private void cbLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbLevelKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbCourseType.requestFocus();
        }
    }//GEN-LAST:event_cbLevelKeyReleased

    private void cbCourseTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCourseTypeKeyReleased
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (isCourseDataValidate() && !isDuplicateCourse()) {
                insertCoureDetails();
                resetCourseFields();
                clearValLabelsCourse();
                txt_coCode.requestFocus();
            } else {
                validateCourseData();
            }
        }
    }//GEN-LAST:event_cbCourseTypeKeyReleased

    private void cbCourseTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCourseTypeKeyTyped
       
    }//GEN-LAST:event_cbCourseTypeKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void setDefaults() {
        setCourseTableData("SELECT * FROM course_details");
        setBatchTableData("SELECT * FROM batch_details");
        resetBatchFields();
        resetCourseFields();
        setLblCoCodeDefault();
        clearValFieldLblBatch();
        clearValLabelsCourse();
    }

    /////Course Table Functions
    private ArrayList<Course> getCourseList(String query) {
        ArrayList<Course> dataList = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Course course;
            while (rs.next()) {
                course = new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                dataList.add(course);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return dataList;
    }

    private void setCourseTableData(String query) {
        course_model.setRowCount(0);
        tempCourse = getCourseList(query);
        for (int i = 0; i < tempCourse.size(); i++) {
            String a = tempCourse.get(i).getCourseCode();
            String b = tempCourse.get(i).getCourseName();
            String c = tempCourse.get(i).getLevel();
            String d = tempCourse.get(i).getCourseType();

            course_model.addRow(new Object[]{a, b, c, d});

        }
    }

    public void insertCoureDetails() {
        if (cbCourseType.getSelectedIndex() == 1) {
            course_Type = "FT";
        }
        if (cbCourseType.getSelectedIndex() == 2) {
            course_Type = "PT";
        }

        try {
            String query = "INSERT INTO course_details VALUES(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_coCode.getText());
            pst.setString(2, txt_courseName.getText());
            pst.setString(3, cbLevel.getSelectedItem().toString());
            pst.setString(4, course_Type);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Course Added");
            setCourseTableData("SELECT * FROM course_details");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in course insert : " + e.getMessage());
        }

    }

    public boolean isDuplicateCourse() {
        if (cbCourseType.getSelectedIndex() == 1) {
            course_Type = "FT";
        }
        if (cbCourseType.getSelectedIndex() == 2) {
            course_Type = "PT";
        }
        for (int i = 0; i < tempCourse.size(); i++) {
            if (txt_coCode.getText().equals(tempCourse.get(i).getCourseCode()) && txt_courseName.getText().equals(tempCourse.get(i).getCourseName()) && cbLevel.getSelectedItem().equals(tempCourse.get(i).getLevel()) && course_Type.equals(tempCourse.get(i).getCourseType())) {
                JOptionPane.showMessageDialog(this, "Found same record in Course Code =  (" + tempCourse.get(i).getCourseCode() + "), Course Name = (" + tempCourse.get(i).getCourseName() + "), Level = (" + tempCourse.get(i).getLevel() + "), Course Type = (" + tempCourse.get(i).getCourseType() + ")", "Duplicate", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
        return false;
    }

    public void resetCourseFields() {
        txt_coCode.setText("");
        txt_courseName.setText("");
        cbLevel.setSelectedIndex(0);
        cbCourseType.setSelectedIndex(0);
    }

    private void clearValLabelsCourse() {
        lblSearchCo.setText("");
        lblValCoCo.setText("");
        lblValCoName.setText("");
        lblValCoType.setText("");
        lblValLevel.setText("");
    }

    public boolean isCourseDataValidate() {
        if (!Pattern.matches("^[A-Z]+$", txt_coCode.getText()) || txt_coCode.getText().isEmpty()) {
            return false;
        }
        if (!Pattern.matches("^([A-Z]{1}[a-z]{0,15}[ ]?){1,4}", txt_courseName.getText()) || txt_courseName.getText().isEmpty()) {
            return false;
        }
        if (cbLevel.getSelectedIndex() == 0) {
            return false;
        }
        if (cbCourseType.getSelectedIndex() == 0) {
            return false;
        }
        return true;
    }

    private void validateCourseData() {
        if (txt_coCode.getText().isEmpty()) {
            lblValCoCo.setText("Course Code Required");
        } else if (!Pattern.matches("^[A-Z]+$", txt_coCode.getText())) {
            lblValCoCo.setText("Ex : SD");
        } else {
            lblValCoCo.setText("");
        }
        if (txt_courseName.getText().isEmpty()) {
            lblValCoName.setText("Course Name Required");
        } else if (!Pattern.matches("^([A-Z]{1}[a-z]{0,15}[ ]?){1,4}", txt_courseName.getText())) {
            lblValCoName.setText("Ex : Software Developer");
        } else {
            lblValCoName.setText("");
        }
        if (cbLevel.getSelectedIndex() == 0) {
            lblValLevel.setText("Please select course level");
        } else {
            lblValLevel.setText("");
        }
        if (cbCourseType.getSelectedIndex() == 0) {
            lblValCoType.setText("Please select course type");
        } else {
            lblValCoType.setText("");
        }
    }

    public void deleteCourseData() {
        if (tbl_courseDetails.getSelectedRowCount() == 1) {
            try {
                String query = "DELETE FROM course_details WHERE course_code = ? AND level = ? AND type = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 0).toString());
                pst.setString(2, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 2).toString());
                pst.setString(3, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 3).toString());
                pst.execute();
                JOptionPane.showMessageDialog(this, "Course Removed Successfully");
                setCourseTableData("SELECT * FROM course_details");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error in course delete : " + e.getMessage());
            }
        }
    }

    public void updateCourseData() {
        if (cbCourseType.getSelectedIndex() == 1) {
            course_Type = "FT";
        }
        if (cbCourseType.getSelectedIndex() == 2) {
            course_Type = "PT";
        }

        try {
            String query = "UPDATE course_details SET course_code = ?, course_name = ?, level = ? , type =? WHERE course_code = ? AND level = ? AND type =? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txt_coCode.getText());
            pst.setString(2, txt_courseName.getText());
            pst.setString(3, cbLevel.getSelectedItem().toString());
            pst.setString(4, course_Type);
            pst.setString(5, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 0).toString());
            pst.setString(6, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 2).toString());
            pst.setString(7, course_model.getValueAt(tbl_courseDetails.getSelectedRow(), 3).toString());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Course Code Updated Successfully");
            setCourseTableData("SELECT * FROM course_details");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in course update: " + e.getMessage());
        }

    }

    /////Batch Table Functions
    private ArrayList<Batch> getBatchList(String query) {
        ArrayList<Batch> dataList = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Batch batch;
            while (rs.next()) {
                batch = new Batch(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6));
                dataList.add(batch);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return dataList;
    }

    private void setBatchTableData(String query) {
        batch_model.setRowCount(0);
        tempBatch = getBatchList(query);
        for (int i = 0; i < tempBatch.size(); i++) {
            String a = tempBatch.get(i).getCourseCode();
            String b = tempBatch.get(i).getBatchNumber();
            String c = tempBatch.get(i).getBatchName();
            String d = tempBatch.get(i).getBatchCapacity();
            int e = tempBatch.get(i).getTiutionFee();
            String f = tempBatch.get(i).getBatchStartingDate().toString();

            batch_model.addRow(new Object[]{a, b, c, d, df.format(e), f});
        }
    }

    private void resetBatchFields() {
        cb_coCode.setSelectedIndex(0);
        dc_startDate.setDate(null);
        tfBatchNum.setText("");
        txt_batchCap.setText("");
        txt_tutionFee.setText("");
    }

    public void insertBatchDetails() {
        try {
            String query = "INSERT INTO batch_details VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, cb_coCode.getSelectedItem().toString());
            pst.setString(2, tfBatNoNnEdit.getText() + tfBatchNum.getText());
            pst.setString(3, txt_batchName.getText());
            pst.setString(4, txt_batchCap.getText());
            String temp = (txt_tutionFee.getText().contains(".") ? txt_tutionFee.getText().replace(".00", "") : txt_tutionFee.getText());
            pst.setDouble(5, Double.parseDouble(temp.replace(",", "")));
            pst.setString(6, date_format.format(dc_startDate.getDate()));
            pst.execute();
            JOptionPane.showMessageDialog(this, "Batch Added Successfully");
            setBatchTableData("SELECT * FROM batch_details");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in inserting BD " + e.getMessage());
        }
    }

    public void updateBatchData() {
        try {
            String query;
            query = "UPDATE batch_details SET course_code =?, batch_number=?, batch_name=?, batch_capacity=?, tution_fee=?, batch_start_date=? WHERE batch_number = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, cb_coCode.getSelectedItem().toString());
            pst.setString(2, tfBatNoNnEdit.getText() + tfBatchNum.getText());
            pst.setString(3, txt_batchName.getText());
            pst.setString(4, txt_batchCap.getText());
            String temp = (txt_tutionFee.getText().contains(".")) ? txt_tutionFee.getText().replace(".00", "") : txt_tutionFee.getText();
            pst.setDouble(5, Double.parseDouble(temp.replace(",", "")));
            pst.setString(6, date_format.format(dc_startDate.getDate()));
            pst.setString(7, batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 1).toString());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Batch Updated Successfully");
            setBatchTableData("SELECT * FROM batch_details");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Batch Update : " + e.getMessage());
        }
    }

    public void deleteBatchData() {
        if (tbl_batchDetails.getSelectedRowCount() == 1) {
            try {
                String query = "DELETE FROM batch_details WHERE batch_number = ? ";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, batch_model.getValueAt(tbl_batchDetails.getSelectedRow(), 1).toString());
                pst.execute();
                JOptionPane.showMessageDialog(this, "Batch Removed Successfully");
                setBatchTableData("SELECT * FROM batch_details");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error in Batch Delete : " + e.getMessage());
            }
        }
    }

    public boolean isValidateBatchData() {
        if (cb_coCode.getSelectedIndex() == 0) {
            return false;
        }
        if (tfBatchNum.getText().isEmpty()) {
            return false;
        }
        if (!Pattern.matches("[0-9]{2}", tfBatchNum.getText())) {
            return false;
        }
        if (dc_startDate.getDate() == null) {
            return false;
        }
        if (txt_batchCap.getText().isEmpty()) {
            return false;
        }
        if (!Pattern.matches("[0-9]{1,3}", txt_batchCap.getText())) {
            return false;
        }
        if (txt_tutionFee.getText().isEmpty()) {
            return false;
        }
        if (!Pattern.matches("([0-9]{1,3})+([,]{1}[0-9]{3})*([.]{1}[0-9]{0,2})?", txt_tutionFee.getText())) {
            return false;
        }

        return true;

    }

    private void validateBatchFields() {
        //validate Course Code
        if (cb_coCode.getSelectedIndex() == 0) {
            cb_coCode.setForeground(Color.red);
            lblCourseNameAndVal.setText("Please Select Course Code");
        } else {
            lblCourseNameAndVal.setText("");
        }
        //Validate Batch Number
        if (tfBatchNum.getText().isEmpty()) {
            lblValBaNo.setText("Batch Number Required");
        } else if (!Pattern.matches("[0-9]{2}", tfBatchNum.getText())) {
            lblValBaNo.setText("Example : 01");
        } else {
            lblValBaNo.setText("");
        }
        //Validate Batch Capacity
        if (txt_batchCap.getText().isEmpty()) {
            lblValBaCapa.setText("Batch Capacity Required");
        } else if (!Pattern.matches("[0-9]{1,3}", txt_batchCap.getText())) {
            lblValBaCapa.setText("Only Numbers (1-999)");
        } else {
            lblValBaCapa.setText("");
        }
        //Validate Start Date
        if (dc_startDate.getDate() == null) {
            lblValBSDate.setText("Please Select Date");
        } else {
            lblValBSDate.setText("");
        }
        //Validate Tution Fee
        if (txt_tutionFee.getText().isEmpty()) {
            lblValTuFee.setText("Tution Fee Required");
        } else if (!Pattern.matches("([0-9]{1,3})+([,]{1}[0-9]{3})*([.]{1}[0-9]{0,2})?", txt_tutionFee.getText())) {
            lblValTuFee.setText("Example : 10.00 or 10");
        } else {
            lblValTuFee.setText("");
        }

    }

    private void clearValFieldLblBatch() {
        lblCourseNameAndVal.setText("");
        lblValBSDate.setText("");
        lblValBaNo.setText("");
        lblValBaCapa.setText("");
        lblValTuFee.setText("");
        lblBaSearch.setText("");
    }

    /////Course Code Functions
    private ArrayList<Course> getCourseListForCCItems(String query) {
        ArrayList<Course> dataList1 = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Course course2;
            while (rs.next()) {
                course2 = new Course(rs.getString(1), rs.getString(2), null, null);
                dataList1.add(course2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in DataList 1 : " + e.getMessage());
        }
        return dataList1;
    }

    private void setCourseCodeItems(String query) {
        cb_coCode.removeAllItems();
        tempCourse = getCourseListForCCItems(query);
        cb_coCode.addItem("Select Course Code");
        for (int i = 0; i < tempCourse.size(); i++) {
            String a = tempCourse.get(i).getCourseCode();

            cb_coCode.addItem(a);

        }
    }

    private void setLblCoCodeDefault() {
        if (cb_coCode.getSelectedIndex() == 0) {
            lblCourseNameAndVal.setText("");
        }
    }

    private void focusNextField(KeyEvent evt, JTextField tf) {
        if (evt.getKeyCode() == evt.VK_ENTER || evt.getKeyCode() == evt.VK_DOWN) {
            tf.requestFocus();
        }
    }

    private void focusBeforeField(KeyEvent evt, JTextField tf) {
        if (evt.getKeyCode() == evt.VK_UP) {
            tf.requestFocus();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnClearSearchCo;
    private javax.swing.JButton btnRefreshBatch;
    private javax.swing.JButton btnRefreshCo;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_clearCD;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_deleteCD;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_insertCD;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_updateCD;
    private javax.swing.JComboBox<String> cbCourseType;
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JComboBox<String> cbSearchItem;
    private javax.swing.JComboBox<String> cbSearchItemCo;
    private javax.swing.JComboBox<String> cb_coCode;
    private com.toedter.calendar.JDateChooser dc_startDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBaSearch;
    private javax.swing.JLabel lblCourseNameAndVal;
    private javax.swing.JLabel lblSearchCo;
    private javax.swing.JLabel lblValBSDate;
    private javax.swing.JLabel lblValBaCapa;
    private javax.swing.JLabel lblValBaNo;
    private javax.swing.JLabel lblValCoCo;
    private javax.swing.JLabel lblValCoName;
    private javax.swing.JLabel lblValCoType;
    private javax.swing.JLabel lblValLevel;
    private javax.swing.JLabel lblValTuFee;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSearch1;
    private javax.swing.JTabbedPane tab_CoBa;
    private javax.swing.JTable tbl_batchDetails;
    private javax.swing.JTable tbl_courseDetails;
    private javax.swing.JTextField tfBatNoNnEdit;
    private javax.swing.JTextField tfBatchNum;
    private javax.swing.JTextField tfBatchSearch;
    private javax.swing.JTextField tfSearchCo;
    private javax.swing.JTextField txt_batchCap;
    private javax.swing.JTextField txt_batchName;
    private javax.swing.JTextField txt_coCode;
    private javax.swing.JTextField txt_courseName;
    private javax.swing.JTextField txt_tutionFee;
    // End of variables declaration//GEN-END:variables
}
