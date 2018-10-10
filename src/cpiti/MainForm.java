
package cpiti;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import net.sf.jasperreports.data.DataSourceCollection;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.query.JRHibernateQueryExecuterFactory;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.derby.drda.NetworkServerControl;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jgroups.util.Util;



public class MainForm extends javax.swing.JFrame {
 private  SessionFactory sessionFactory;
 private  Session session;
 private  Transaction tx;
 NetworkServerControl nsc;
 private int day_id,countSem=0,SUBMITTED_SEM=0;
 private String trade_id,bank_id,createdBy,value,TRAINEE_SESSION,SEMLIST;
   double fees=0,BALANCE=0;
   boolean login_value=false;
  

   
    public MainForm() {
      
     try {
          nsc = new NetworkServerControl();
          nsc.start(null);
          if(nsc!=null)
              System.out.println("Server Started!");
     } catch (Exception ex) {
         Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
     }
        this.setIconImage(new ImageIcon(getClass().getResource("imageedit_1_2293804988.png")).getImage());
        sessionFactory=new Configuration().configure().buildSessionFactory();
        session=sessionFactory.openSession();
        tx=session.beginTransaction();
        initComponents();
        filterdata();
        hide_all_panel();
        disable_button();
        autocomplete_text();
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        body_pnl = new javax.swing.JPanel();
        left_pnl = new javax.swing.JPanel();
        student_registration_btn = new javax.swing.JButton();
        staff_manage_btn = new javax.swing.JButton();
        trade_btn = new javax.swing.JButton();
        bank_details_btn = new javax.swing.JButton();
        holiday_btn = new javax.swing.JButton();
        student_fee_btn = new javax.swing.JButton();
        attendance_btn = new javax.swing.JButton();
        staff_salary_btn = new javax.swing.JButton();
        reports_btn = new javax.swing.JButton();
        reports_btn1 = new javax.swing.JButton();
        daybook_btn = new javax.swing.JButton();
        front_right_pnl = new javax.swing.JPanel();
        Login_panel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        student_registration_pnl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        trainee_name = new javax.swing.JTextField();
        trainee_fname = new javax.swing.JTextField();
        trainee_mname = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        trainee_gen = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        trainee_nationality = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        trainee_mobile = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        trainee_email = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        trainee_aadhar = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        trainee_address = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        trainee_qualification = new javax.swing.JComboBox();
        jLabel61 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        session_id_cbx = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        trainee_category = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        trainee_hcategory = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        trainee_acategory = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        trainee_mcategory = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        trainee_strn = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        trainee_app_form_no = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        trainee_admission_date = new com.toedter.calendar.JDateChooser();
        jLabel48 = new javax.swing.JLabel();
        trainee_trade = new javax.swing.JComboBox();
        trainee_type = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        trainee_shift = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        trainee_unit = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        trainee_dual_mode = new javax.swing.JComboBox();
        jLabel53 = new javax.swing.JLabel();
        trainee_remarks = new javax.swing.JTextField();
        trainee_submit = new javax.swing.JButton();
        trainee_update = new javax.swing.JButton();
        trainee_reset = new javax.swing.JButton();
        trainee_view = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        photo_container = new javax.swing.JLabel();
        photo_location = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        student_fee_pnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        fee_receipt_no = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fee_student_id = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        fee_trade = new javax.swing.JComboBox();
        fee_pay_mode = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        fee_bank_name = new javax.swing.JComboBox();
        fee_branch_name = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fee_cheque_no = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fee_amount = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        fee_cheque_date = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        fee_balance = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fee_discount = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        fee_remarks = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        trade_pnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        trade_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trade_fees = new javax.swing.JTextField();
        trade_duration = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        trade_total_semester = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        trade_search = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        bank_detail_pnl = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bank_name = new javax.swing.JTextField();
        bank_branch = new javax.swing.JTextField();
        bank_ifsc_code = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        bank_search = new javax.swing.JTextField();
        holiday_pnl = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        holiday_search = new javax.swing.JTextField();
        holiday_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        holiday_date = new com.toedter.calendar.JDateChooser();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        report_pnl = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        attendance_pnl = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel102 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        salary_pnl = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel107 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jComboBox15 = new javax.swing.JComboBox();
        jLabel112 = new javax.swing.JLabel();
        view_trainee_detail = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel60 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton21 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        view_fee_details = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel65 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jButton22 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel131 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        instructor_detail = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jLabel72 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel79 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel80 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel85 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel86 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel90 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel91 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel96 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel97 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        view_instructor_detail = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel111 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        newUser = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        daybook_panel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jDateChooser11 = new com.toedter.calendar.JDateChooser();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jTextField40 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jDateChooser12 = new com.toedter.calendar.JDateChooser();
        jLabel134 = new javax.swing.JLabel();
        jDateChooser13 = new com.toedter.calendar.JDateChooser();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        header_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        footer_pnl = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANDRA PRIVATE INDUSTRIAL TRAINING INSTITUTE ");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        left_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        student_registration_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        student_registration_btn.setText("Student Registration");
        student_registration_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_registration_btnMouseClicked(evt);
            }
        });
        student_registration_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_registration_btnActionPerformed(evt);
            }
        });

        staff_manage_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        staff_manage_btn.setText("Staff Management");
        staff_manage_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                staff_manage_btnFocusGained(evt);
            }
        });
        staff_manage_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_manage_btnMouseClicked(evt);
            }
        });
        staff_manage_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_manage_btnActionPerformed(evt);
            }
        });

        trade_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        trade_btn.setText("Trade");
        trade_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                trade_btnFocusGained(evt);
            }
        });
        trade_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trade_btnMouseClicked(evt);
            }
        });
        trade_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trade_btnActionPerformed(evt);
            }
        });

        bank_details_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_details_btn.setText("Bank Details");
        bank_details_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bank_details_btnFocusGained(evt);
            }
        });
        bank_details_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bank_details_btnMouseClicked(evt);
            }
        });
        bank_details_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_details_btnActionPerformed(evt);
            }
        });

        holiday_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        holiday_btn.setText("Holidays");
        holiday_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                holiday_btnFocusGained(evt);
            }
        });
        holiday_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                holiday_btnMouseClicked(evt);
            }
        });
        holiday_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holiday_btnActionPerformed(evt);
            }
        });

        student_fee_btn.setText("Student Fees");
        student_fee_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_fee_btnMouseClicked(evt);
            }
        });
        student_fee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_fee_btnActionPerformed(evt);
            }
        });

        attendance_btn.setText("Attendence");
        attendance_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                attendance_btnFocusGained(evt);
            }
        });
        attendance_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance_btnMouseClicked(evt);
            }
        });
        attendance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_btnActionPerformed(evt);
            }
        });

        staff_salary_btn.setText("Salary");
        staff_salary_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                staff_salary_btnFocusGained(evt);
            }
        });
        staff_salary_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_salary_btnMouseClicked(evt);
            }
        });
        staff_salary_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_salary_btnActionPerformed(evt);
            }
        });

        reports_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports_btn.setText("Add Files");
        reports_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reports_btnFocusGained(evt);
            }
        });
        reports_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reports_btnMouseClicked(evt);
            }
        });
        reports_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reports_btnActionPerformed(evt);
            }
        });

        reports_btn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reports_btn1.setText("Create User");
        reports_btn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reports_btn1FocusGained(evt);
            }
        });
        reports_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reports_btn1MouseClicked(evt);
            }
        });
        reports_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reports_btn1ActionPerformed(evt);
            }
        });

        daybook_btn.setText("Daybook");
        daybook_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                daybook_btnFocusGained(evt);
            }
        });
        daybook_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daybook_btnMouseClicked(evt);
            }
        });
        daybook_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daybook_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout left_pnlLayout = new javax.swing.GroupLayout(left_pnl);
        left_pnl.setLayout(left_pnlLayout);
        left_pnlLayout.setHorizontalGroup(
            left_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(left_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_registration_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staff_manage_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trade_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bank_details_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(holiday_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(student_fee_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendance_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staff_salary_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reports_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reports_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daybook_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        left_pnlLayout.setVerticalGroup(
            left_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(student_registration_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_fee_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(staff_manage_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff_salary_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daybook_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(trade_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_details_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(holiday_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reports_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reports_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        left_pnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {attendance_btn, bank_details_btn, holiday_btn, reports_btn, staff_manage_btn, staff_salary_btn, student_fee_btn, student_registration_btn, trade_btn});

        front_right_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        front_right_pnl.setLayout(new java.awt.CardLayout());

        Login_panel.setLayout(new java.awt.GridBagLayout());

        jPanel13.setLayout(null);

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel108.setText("User ID");
        jPanel13.add(jLabel108);
        jLabel108.setBounds(330, 100, 85, 30);

        jTextField21.setText("jTextField21");
        jPanel13.add(jTextField21);
        jTextField21.setBounds(430, 100, 143, 30);

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel109.setText("Password");
        jPanel13.add(jLabel109);
        jLabel109.setBounds(330, 140, 85, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPanel13.add(jPasswordField1);
        jPasswordField1.setBounds(430, 140, 143, 30);

        jButton32.setText("Login");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jButton32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton32KeyPressed(evt);
            }
        });
        jPanel13.add(jButton32);
        jButton32.setBounds(360, 180, 80, 30);

        jButton33.setText("Reset");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jButton33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton33KeyPressed(evt);
            }
        });
        jPanel13.add(jButton33);
        jButton33.setBounds(460, 180, 90, 30);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpiti/ITI.jpg"))); // NOI18N
        jPanel13.add(jLabel110);
        jLabel110.setBounds(10, 10, 910, 390);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 934;
        gridBagConstraints.ipady = 415;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 10);
        Login_panel.add(jPanel13, gridBagConstraints);

        front_right_pnl.add(Login_panel, "card10");

        student_registration_pnl.setLayout(new java.awt.GridBagLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Trainee Session ID");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Trainee Name");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Father's Name");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Mother's Name");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Date of Birth");

        trainee_name.setText("jTextField12");

        trainee_fname.setText("jTextField13");

        trainee_mname.setText("jTextField14");

        dob.setDateFormatString("dd-MMM-yy");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Gender");

        trainee_gen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Trans Gender" }));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Nationality");

        trainee_nationality.setEditable(true);
        trainee_nationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indian" }));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Mobile No.");

        trainee_mobile.setText("jTextField15");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("E-mail");

        trainee_email.setText("jTextField16");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Aadhar No");

        trainee_aadhar.setText("jTextField17");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Address");

        trainee_address.setColumns(20);
        trainee_address.setRows(5);
        jScrollPane4.setViewportView(trainee_address);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Qualification");

        trainee_qualification.setEditable(true);
        trainee_qualification.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Qualification", "10th", "12th", "8th", "B Com", "B Ed", "B.C.A", "B.Tech/B.E.", "BA", "BBA", "BSc", "Diploma", "Diploma In Engineering", "ITI", "M Com", "M.C.A", "M.C.A.", "M.Tech", "M.E.", "MA", "MBA", "MS", "MSc", "Others", "PGDBA", "PGDCA", "Ph.D" }));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Session");

        jDateChooser3.setDateFormatString("MMM-yy");
        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });

        session_id_cbx.setEditable(true);
        session_id_cbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type ID" }));
        session_id_cbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                session_id_cbxItemStateChanged(evt);
            }
        });
        session_id_cbx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                session_id_cbxFocusGained(evt);
            }
        });
        session_id_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                session_id_cbxActionPerformed(evt);
            }
        });
        session_id_cbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                session_id_cbxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainee_aadhar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(trainee_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(trainee_fname)
                                                .addComponent(trainee_mname)
                                                .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(trainee_gen, 0, 211, Short.MAX_VALUE)
                                                .addComponent(trainee_nationality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(trainee_mobile)
                                                .addComponent(trainee_name))
                                            .addGap(1, 1, 1)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trainee_qualification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(session_id_cbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob, jDateChooser3, jScrollPane4, trainee_aadhar, trainee_email, trainee_fname, trainee_gen, trainee_mname, trainee_mobile, trainee_name, trainee_nationality, trainee_qualification});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel22, jLabel30, jLabel31, jLabel32, jLabel33, jLabel34, jLabel35, jLabel36, jLabel37, jLabel38, jLabel39, jLabel54, jLabel61});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(session_id_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(trainee_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(trainee_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(trainee_mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(trainee_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(trainee_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(trainee_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(trainee_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(trainee_aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(trainee_qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 3, 0, 0);
        student_registration_pnl.add(jPanel3, gridBagConstraints);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Category");

        trainee_category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "Freedom Fighters", "General", "N.C.C Cadets", "Other Backward", "Other Backward Caste Creamy Layer", "Other Backward Class", "Other Caste", "Others", "Physically Handicapped", "Schedule Castes", "Schedule Tribes", "Wards of Ex-Serviceman", "Wards of Para Military Service Personnel" }));
        trainee_category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                trainee_categoryItemStateChanged(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Horizontal Category");

        trainee_hcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Horizontal Category", "Ex-Serviceman", "Freedom Fighter", "General", "NCC Cadets", "NSS Cadets", "Other Backward Classes", "Others", "Physically Handicapped", "Schedule Castes", "Schedule Tribes", "Special Category", "Sports", "Wards of Ex-Serviceman", "Wards of Para Military Service Personnel" }));
        trainee_hcategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                trainee_hcategoryItemStateChanged(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Admission Category");

        trainee_acategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Admission Category", "Ex-Serviceman", "Freedom Fighter", "General", "N.C.C Cadets", "NSS Cadets", "Other Backward", "Other Backward Caste Creamy Layer", "Other Backward Class", "Other Caste", "Physically Handicapped", "Schedule Castes", "Schedule Tribes", "Special Category", "Sports", "Wards of Ex-Serviceman", "Wards of Para Military Service Personnel" }));
        trainee_acategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                trainee_acategoryItemStateChanged(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Minority Category");

        trainee_mcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Minority Category", "Minority", "Buddhist", "Christian", "Jain", "Muslim", "NA", "Others", "Parsi", "Sikh" }));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("State Registration No.");

        trainee_strn.setText("jTextField18");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Application Form No");

        trainee_app_form_no.setText("jTextField19");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Admission Date");

        trainee_admission_date.setDateFormatString("dd-MMM-yy");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Trade");

        trainee_trade.setEditable(true);
        trainee_trade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Trade", "Agro Processing", "Architectural Assistant", "Architectural Draughtsman", "Attendant Operator (Chemical Plant)", "Baker and Confectioner", "Bamboo Works", "Basic Cosmetology", "Building Maintenance", "Cabin/Room Attendant", "Cane Willow and Bamboo Worker", "Carpenter", "Catering & Hospitality Assistant", "Civil Engineer Assistant", "Computer Aided Embroidery And Designing", "Computer Hardware & Network Maintenance", "Computer Operator & Programming Assistant (VI)", "Computer Operator and Programming Assistant", "Corporate House Keeping", "Counselling Skills", "Craftsman Food Production (Vegetarian)", "Creche Management", "Cutting & Sewing (VI)", "Dairying", "Data Base System Assistant", "Data Entry Operator", "Dental Laboratory Equipment Technician", "Desk Top Publishing Operator", "Desktop Publishing Operator (VI)", "Digital Photographer", "Domestic House Keeping", "Domestic Painter", "Draughtsman (Civil)", "Draughtsman (Mechanical)", "Dress Making", "Driver Cum Mechanic", "Electrician", "Electronics Mechanic", "Electroplater", "Event Management Assitant", "Excavator Operator", "Fashion Design & Technology", "Finance Executive", "Fire Technology and Industrial Safety Management", "Firemen", "Fitter", "Floriculture & Landscaping", "Food & Beverages Services Assistant", "Food Beverage", "Food Production (General)", "Footwear maker", "Foundryman", "Front Office Assistant", "Fruit and Vegetable Processor", "Gold Smith", "Hair & Skin Care (VI)", "Health Safety & Environment", "Health Sanitary Inspector", "Horticulture", "Horticulture (P)", "Hospital House Keeping", "Hospital Waste Management", "House Keeper", "Human Resource Executive", "Industrial Painter", "Information Communication Technology System Maintenance", "Information Technology", "Institution House Keeping", "Instrument Mechanic", "Instrument Mechanic (Chemical Plant)", "Insurance Agent", "Interior Decoration and Designing (P)", "Interior Design & Decoration", "Laboratory Assistant (Chemical Plant)", "Leather Goods Maker", "Library & Information Science", "Lift and Escalator Mechanic", "Lift Mechanic (P)", "Litho- Offset Machine Minder", "Machinist", "Machinist (Grinder)", "Maintenance Mechanic (Chemical Plant)", "Marine Engine Fitter", "Marine Fitter", "Marketing Executive", "Mason (Building Constructor)", "Mech. Repair & Maintenance of Heavy Vehicles", "Mech. Repair & Maintenance of Light Vehicles", "Mechanic (Motor Vehicle)", "Mechanic (Refrigeration and Air-Conditioner)", "Mechanic (Tractor)", "Mechanic Agriculture Machinery", "Mechanic Air-conditioning Plant", "Mechanic Auto Body Painting", "Mechanic Auto Body Repair", "Mechanic Auto Electrical and Electronics", "Mechanic Communication Equipment Maintenance", "Mechanic Computer Hardware", "Mechanic Consumer Electronics", "Mechanic Consumer Electronics Appliances", "Mechanic Cum Operator Electronics Communication System", "Mechanic Diesel", "Mechanic Industrial Electronics", "Mechanic Lens/Prism Grinding", "Mechanic Machine Tool Maintenance", "Mechanic Mechatronics", "Mechanic Medical Electronics", "Mechanic Mining Machinery", "Mechanic Motor Cycle", "Mechanic Radio & T.V.", "Medical Transcription", "Metal Cutting Attendant (VI)", "Milk & Milk Products", "Multimedia Animation & Special Effects", "Network Technician", "Office Assitant cum Computer Operator", "Old Age Care Assistant", "Operator Advanced Machine Tools", "Painter General", "Para Legal Assistant/ Munshi", "Photographer", "Physiotherapy Technician", "Plastic Processing Operator", "Plate Maker-Cum-Impositor", "Plumber", "Pre/Preparatory School Management (Assistant)", "Process Cameraman", "Pump Operator-Cum-Mechanic", "Radiology Technician", "Refractory Technician", "Rubber Technician", "Sanitary Hardware Fitter", "Secretarial Practice (English)", "Sewing Technology", "Sheet Metal Worker", "Software Testing Assistant", "Spa Therapy", "Spinning Technician", "Stenographer & Secretarial Assistant (English)", "Stenographer & Secretarial Assistant (Hindi)", "Stone Mining Machine Operator", "Stone Processing Machine Operator", "Surface Ornamentation Techniques (Embroidery)", "Surveyor", "Technician Power Electronics System", "Textile Mechatronics", "Textile Wet Processing Technician", "Tool & Die Maker (Dies & Moulds)", "Tool & Die Maker (Press Tools, Jigs & Fixtures)", "Tourist Guide", "Travel & Tour Assistant", "Turner", "Vessel Navigator", "Weaving of Woolen Fabrics", "Weaving Technician", "Weaving Technician for Silk & Woolen Fabrics", "Welder", "Welder (Fabrication & Fitting)", "Welder (GMAW & GTAW)", "Welder (Pipe)", "Welder (Structural)", "Welder (Welding & Inspection)", "Wireman" }));

        trainee_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Trainee Type", "Regular", "Private" }));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Trainee Type");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Shift");

        trainee_shift.setText("jTextField20");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Unit");

        trainee_unit.setText("jTextField21");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Dual Trainee Mode");

        trainee_dual_mode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Yes", "No" }));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Remarks");

        trainee_remarks.setText("jTextField22");

        trainee_submit.setText("Submit");
        trainee_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainee_submitActionPerformed(evt);
            }
        });

        trainee_update.setText("Update");
        trainee_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainee_updateActionPerformed(evt);
            }
        });

        trainee_reset.setText("Reset");
        trainee_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainee_resetActionPerformed(evt);
            }
        });

        trainee_view.setText("View");
        trainee_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainee_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(trainee_submit)
                        .addGap(18, 18, 18)
                        .addComponent(trainee_update)
                        .addGap(29, 29, 29)
                        .addComponent(trainee_reset)
                        .addGap(18, 18, 18)
                        .addComponent(trainee_view, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainee_category, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_hcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_acategory, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_mcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_strn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_app_form_no, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_admission_date, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_trade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_type, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_shift, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_dual_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainee_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {trainee_acategory, trainee_admission_date, trainee_app_form_no, trainee_category, trainee_dual_mode, trainee_hcategory, trainee_mcategory, trainee_remarks, trainee_shift, trainee_strn, trainee_trade, trainee_type, trainee_unit});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel41, jLabel42, jLabel43, jLabel44, jLabel45, jLabel46, jLabel47, jLabel48, jLabel49, jLabel50, jLabel51, jLabel52, jLabel53});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(trainee_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(trainee_hcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trainee_acategory)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(trainee_mcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(trainee_strn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(trainee_app_form_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trainee_admission_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(trainee_trade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainee_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(trainee_shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(trainee_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trainee_dual_mode)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(trainee_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainee_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainee_update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainee_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainee_view, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        student_registration_pnl.add(jPanel4, gridBagConstraints);

        photo_container.setBackground(new java.awt.Color(153, 153, 153));
        photo_container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        photo_location.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo_location.setText("Photo Location");

        jButton20.setText("Select Photo");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(photo_container, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photo_location, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo_container, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photo_location, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 153;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 12);
        student_registration_pnl.add(jPanel7, gridBagConstraints);

        front_right_pnl.add(student_registration_pnl, "card7");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Receipt No");

        fee_receipt_no.setText("jTextField8");
        fee_receipt_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fee_receipt_noKeyReleased(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Student ID");

        fee_student_id.setEditable(true);
        fee_student_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ID" }));
        fee_student_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fee_student_idItemStateChanged(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Trade");

        fee_trade.setEditable(true);
        fee_trade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Trade" }));
        fee_trade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fee_tradeItemStateChanged(evt);
            }
        });

        fee_pay_mode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Payment Mode", "Cash", "Cheque/Draft" }));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Select payment Mode");

        fee_bank_name.setEditable(true);
        fee_bank_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bank Name", "ABHYUDAYA CO-OP BANK LTD", "ABU DHABI COMMERCIAL BANK", "AKOLA DISTRICT CENTRAL CO-OPERATIVE BANK", "AKOLA JANATA COMMERCIAL COOPERATIVE BANK", "ALLAHABAD BANK", "ALMORA URBAN CO-OPERATIVE BANK LTD.", "ANDHRA BANK", "ANDHRA PRAGATHI GRAMEENA BANK", "APNA SAHAKARI BANK LTD", "AUSTRALIA AND NEW ZEALAND BANKING GROUP LIMITED.", "AXIS BANK", "BANK INTERNASIONAL INDONESIA", "BANK OF AMERICA", "BANK OF BAHRAIN AND KUWAIT", "BANK OF BARODA", "BANK OF CEYLON", "BANK OF INDIA", "BANK OF MAHARASHTRA", "BANK OF TOKYO-MITSUBISHI UFJ LTD.", "BARCLAYS BANK PLC", "BASSEIN CATHOLIC CO-OP BANK LTD", "BHARATIYA MAHILA BANK LIMITED", "BNP PARIBAS", "CALYON BANK", "CANARA BANK", "CAPITAL LOCAL AREA BANK LTD.", "CATHOLIC SYRIAN BANK LTD.", "CENTRAL BANK OF INDIA", "CHINATRUST COMMERCIAL BANK", "CITIBANK NA", "CITIZENCREDIT CO-OPERATIVE BANK LTD", "CITY UNION BANK LTD", "COMMONWEALTH BANK OF AUSTRALIA", "CORPORATION BANK", "CREDIT SUISSE AG", "DBS BANK LTD", "DENA BANK", "DEUTSCHE BANK", "DEUTSCHE SECURITIES INDIA PRIVATE LIMITED", "DEVELOPMENT CREDIT BANK LIMITED", "DHANLAXMI BANK LTD", "DICGC", "DOMBIVLI NAGARI SAHAKARI BANK LIMITED", "FIRSTRAND BANK LIMITED", "GOPINATH PATIL PARSIK JANATA SAHAKARI BANK LTD", "GURGAON GRAMIN BANK", "HDFC BANK LTD", "HSBC", "ICICI BANK LTD", "IDBI BANK LTD", "IDRBT", "INDIAN BANK", "INDIAN OVERSEAS BANK", "INDUSIND BANK LTD", "INDUSTRIAL AND COMMERCIAL BANK OF CHINA LIMITED", "ING VYSYA BANK LTD", "JALGAON JANATA SAHKARI BANK LTD", "JANAKALYAN SAHAKARI BANK LTD", "JANASEVA SAHAKARI BANK (BORIVLI) LTD", "JANASEVA SAHAKARI BANK LTD. PUNE", "JANATA SAHAKARI BANK LTD (PUNE)", "JPMORGAN CHASE BANK N.A", "KALLAPPANNA AWADE ICH JANATA S BANK", "KAPOL CO OP BANK", "KARNATAKA BANK LTD", "KARNATAKA VIKAS GRAMEENA BANK", "KARUR VYSYA BANK", "KOTAK MAHINDRA BANK", "KURMANCHAL NAGAR SAHKARI BANK LTD", "MAHANAGAR CO-OP BANK LTD", "MAHARASHTRA STATE CO OPERATIVE BANK", "MASHREQBANK PSC", "MIZUHO CORPORATE BANK LTD", "MUMBAI DISTRICT CENTRAL CO-OP. BANK LTD.", "NAGPUR NAGRIK SAHAKARI BANK LTD", "NATIONAL AUSTRALIA BANK", "NEW INDIA CO-OPERATIVE BANK LTD.", "NKGSB CO-OP BANK LTD", "NORTH MALABAR GRAMIN BANK", "NUTAN NAGARIK SAHAKARI BANK LTD", "OMAN INTERNATIONAL BANK SAOG", "ORIENTAL BANK OF COMMERCE", "PARSIK JANATA SAHAKARI BANK LTD", "PRATHAMA BANK", "PRIME CO OPERATIVE BANK LTD", "PUNJAB AND MAHARASHTRA CO-OP BANK LTD.", "PUNJAB AND SIND BANK", "PUNJAB NATIONAL BANK", "RABOBANK INTERNATIONAL (CCRB)", "RAJGURUNAGAR SAHAKARI BANK LTD.", "RAJKOT NAGARIK SAHAKARI BANK LTD", "RESERVE BANK OF INDIA", "SBERBANK", "SHINHAN BANK", "SHRI CHHATRAPATI RAJARSHI SHAHU URBAN CO-OP BANK LTD", "SOCIETE GENERALE", "SOLAPUR JANATA SAHKARI BANK LTD.SOLAPUR", "SOUTH INDIAN BANK", "STANDARD CHARTERED BANK", "STATE BANK OF BIKANER AND JAIPUR", "STATE BANK OF HYDERABAD", "STATE BANK OF INDIA", "STATE BANK OF MAURITIUS LTD", "STATE BANK OF MYSORE", "STATE BANK OF PATIALA", "STATE BANK OF TRAVANCORE", "SUMITOMO MITSUI BANKING CORPORATION", "SYNDICATE BANK", "TAMILNAD MERCANTILE BANK LTD", "THANE BHARAT SAHAKARI BANK LTD", "THE A.P. MAHESH CO-OP URBAN BANK LTD.", "THE AHMEDABAD MERCANTILE CO-OPERATIVE BANK LTD.", "THE ANDHRA PRADESH STATE COOP BANK LTD", "THE BANK OF NOVA SCOTIA", "THE BANK OF RAJASTHAN LTD", "THE BHARAT CO-OPERATIVE BANK (MUMBAI) LTD", "THE COSMOS CO-OPERATIVE BANK LTD.", "THE DELHI STATE COOPERATIVE BANK LTD.", "THE FEDERAL BANK LTD", "THE GADCHIROLI DISTRICT CENTRAL COOPERATIVE BANK LTD", "THE GREATER BOMBAY CO-OP. BANK LTD", "THE GUJARAT STATE CO-OPERATIVE BANK LTD", "THE JALGAON PEOPLES CO-OP BANK", "THE JAMMU AND KASHMIR BANK LTD", "THE KALUPUR COMMERCIAL CO. OP. BANK LTD.", "THE KALYAN JANATA SAHAKARI BANK LTD.", "THE KANGRA CENTRAL CO-OPERATIVE BANK LTD", "THE KANGRA COOPERATIVE BANK LTD", "THE KARAD URBAN CO-OP BANK LTD", "THE KARNATAKA STATE APEX COOP. BANK LTD.", "THE LAKSHMI VILAS BANK LTD", "THE MEHSANA URBAN COOPERATIVE BANK LTD", "THE MUNICIPAL CO OPERATIVE BANK LTD MUMBAI", "THE NAINITAL BANK LIMITED", "THE NASIK MERCHANTS CO-OP BANK LTD., NASHIK", "THE RAJASTHAN STATE COOPERATIVE BANK LTD.", "THE RATNAKAR BANK LTD", "THE ROYAL BANK OF SCOTLAND N.V", "THE SAHEBRAO DESHMUKH CO-OP. BANK LTD.", "THE SARASWAT CO-OPERATIVE BANK LTD", "THE SEVA VIKAS CO-OPERATIVE BANK LTD (SVB)", "THE SHAMRAO VITHAL CO-OPERATIVE BANK LTD", "THE SURAT DISTRICT CO OPERATIVE BANK LTD.", "THE SURAT PEOPLES CO-OP BANK LTD", "THE SUTEX CO.OP. BANK LTD.", "THE TAMILNADU STATE APEX COOPERATIVE BANK LIMITED", "THE THANE DISTRICT CENTRAL CO-OP BANK LTD", "THE THANE JANATA SAHAKARI BANK LTD", "THE VARACHHA CO-OP. BANK LTD.", "THE VISHWESHWAR SAHAKARI BANK LTD.,PUNE", "THE WEST BENGAL STATE COOPERATIVE BANK LTD", "TJSB SAHAKARI BANK LTD.", "TUMKUR GRAIN MERCHANTS COOPERATIVE BANK LTD.,", "UBS AG", "UCO BANK", "UNION BANK OF INDIA", "UNITED BANK OF INDIA", "UNITED OVERSEAS BANK", "VASAI VIKAS SAHAKARI BANK LTD.", "VIJAYA BANK", "WEST BENGAL STATE COOPERATIVE BANK", "WESTPAC BANKING CORPORATION", "WOORI BANK", "YES BANK LTD", "ZILA SAHKARI BANK LTD GHAZIABAD" }));
        fee_bank_name.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fee_bank_nameItemStateChanged(evt);
            }
        });

        fee_branch_name.setEditable(true);
        fee_branch_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Branch" }));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Select Bank");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Cheque/Draft No");

        fee_cheque_no.setText("jTextField9");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Amount");

        fee_amount.setText("0");
        fee_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fee_amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fee_amountFocusLost(evt);
            }
        });
        fee_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fee_amountKeyReleased(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Cheque Date");

        fee_cheque_date.setDateFormatString("dd-MMM-yyy");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Balance/Advance");

        fee_balance.setText("--Balance--");

        jButton16.setText("Submit");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("View");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Select Branch");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Discount");

        fee_discount.setText("0");
        fee_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fee_discountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fee_discountFocusLost(evt);
            }
        });
        fee_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fee_discountKeyReleased(evt);
            }
        });

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Remarks");

        fee_remarks.setText("jTextField1");

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel113.setText("Tution Fees");

        jTextField23.setEditable(false);
        jTextField23.setText("0");
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField23KeyReleased(evt);
            }
        });

        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel114.setText("Addmission Fees");

        jTextField24.setText("0");
        jTextField24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField24FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField24FocusLost(evt);
            }
        });
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField24KeyReleased(evt);
            }
        });

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel115.setText("Workshop Fees");

        jTextField25.setText("0");
        jTextField25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField25FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField25FocusLost(evt);
            }
        });
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField25KeyReleased(evt);
            }
        });

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel116.setText("Examination Fees");

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel117.setText("Computer Fees");

        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel118.setText("I.Card");

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel119.setText("Library");

        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel120.setText("Sports");

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel121.setText("Others");

        jTextField26.setText("0");
        jTextField26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField26FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField26FocusLost(evt);
            }
        });
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField26KeyReleased(evt);
            }
        });

        jTextField27.setText("0");
        jTextField27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField27FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField27FocusLost(evt);
            }
        });
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField27KeyReleased(evt);
            }
        });

        jTextField28.setText("0");
        jTextField28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField28FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField28FocusLost(evt);
            }
        });
        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField28KeyReleased(evt);
            }
        });

        jTextField29.setText("0");
        jTextField29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField29FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField29FocusLost(evt);
            }
        });
        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField29KeyReleased(evt);
            }
        });

        jTextField30.setText("0");
        jTextField30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField30FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField30FocusLost(evt);
            }
        });
        jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField30KeyReleased(evt);
            }
        });

        jTextField31.setText("0");
        jTextField31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField31FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField31FocusLost(evt);
            }
        });
        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField31KeyReleased(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Total Fees");

        jLabel122.setText("----Total Amount----");

        jButton47.setText("Print Challan");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("FOC");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fee_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fee_receipt_no, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fee_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fee_trade, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fee_pay_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fee_branch_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fee_bank_name, 0, 186, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fee_cheque_date, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fee_cheque_no, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fee_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fee_balance, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(fee_discount))))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField23)
                            .addComponent(jTextField24)
                            .addComponent(jTextField25)
                            .addComponent(jTextField26)
                            .addComponent(jTextField27)
                            .addComponent(jTextField28)
                            .addComponent(jTextField29)
                            .addComponent(jTextField30)
                            .addComponent(jTextField31)
                            .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fee_pay_mode, fee_receipt_no, fee_student_id, fee_trade});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel21, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel59});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fee_amount, fee_balance, fee_bank_name, fee_cheque_date, fee_cheque_no});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jCheckBox10)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fee_receipt_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel113)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fee_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fee_trade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fee_pay_mode)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fee_bank_name, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fee_branch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel118)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(fee_cheque_no)
                    .addComponent(jLabel119)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel120)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fee_cheque_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel26))
                            .addComponent(fee_amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fee_discount)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fee_balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(fee_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fee_amount, fee_bank_name, fee_branch_name, fee_cheque_date, fee_cheque_no, fee_discount, fee_pay_mode, fee_receipt_no, fee_remarks, fee_student_id, fee_trade, jLabel16, jLabel17, jLabel18, jLabel21, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel29, jLabel59});

        jLabel19.setText("Select For Semester");

        jCheckBox1.setText("Semester 1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Semester 2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Semester 3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Semester 4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Semester 5");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Semester 6");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Semester 7");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Semester 8");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("Balance");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout student_fee_pnlLayout = new javax.swing.GroupLayout(student_fee_pnl);
        student_fee_pnl.setLayout(student_fee_pnlLayout);
        student_fee_pnlLayout.setHorizontalGroup(
            student_fee_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_fee_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        student_fee_pnlLayout.setVerticalGroup(
            student_fee_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_fee_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_fee_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        front_right_pnl.add(student_fee_pnl, "card2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Trade Name");

        trade_name.setText("jTextField1");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Duration");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fee/Semester");

        trade_fees.setText("jTextField2");

        jLabel6.setText("Months");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Total Semester");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trade Name", "Duration(Months)", "Fees/Semester", "Total Semesters", "Session", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(2);
        }

        jButton4.setText("Add Trade");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel57.setText("Search By Name");

        trade_search.setText("jTextField3");
        trade_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trade_searchKeyReleased(evt);
            }
        });

        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel130.setText("Session");

        jTextField35.setText("jTextField35");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(844, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(10, 10, 10)
                            .addComponent(trade_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(10, 10, 10)
                            .addComponent(trade_fees, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(trade_total_semester, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(trade_name, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(trade_search, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel7});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel57)
                        .addComponent(trade_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trade_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(trade_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel5))
                                .addComponent(trade_fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(trade_total_semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4)
                                .addComponent(jButton5))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6)
                                .addComponent(jButton7)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout trade_pnlLayout = new javax.swing.GroupLayout(trade_pnl);
        trade_pnl.setLayout(trade_pnlLayout);
        trade_pnlLayout.setHorizontalGroup(
            trade_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trade_pnlLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trade_pnlLayout.setVerticalGroup(
            trade_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trade_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        front_right_pnl.add(trade_pnl, "card3");

        bank_detail_pnl.setLayout(new java.awt.GridBagLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Bank Name");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Bank Name", "Branch", "IFCS Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        bank_name.setText("jTextField3");

        bank_branch.setText("jTextField4");

        bank_ifsc_code.setText("jTextField7");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Branch");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("IFSC Code");

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Bank Details");

        jLabel56.setText("Search By Name/Code");

        bank_search.setText("jTextField3");
        bank_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bank_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bank_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bank_ifsc_code, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jButton9)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bank_search, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap()))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bank_branch, bank_ifsc_code, bank_name});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56)
                        .addComponent(bank_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bank_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bank_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bank_ifsc_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8)
                                .addComponent(jButton9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton10)
                                .addComponent(jButton11))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 22, 12);
        bank_detail_pnl.add(jPanel5, gridBagConstraints);

        front_right_pnl.add(bank_detail_pnl, "card4");

        holiday_pnl.setLayout(new java.awt.GridBagLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Holiday Name");

        jLabel12.setText("Search By Date/Name");

        holiday_search.setText("jTextField5");
        holiday_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                holiday_searchKeyReleased(evt);
            }
        });

        holiday_name.setText("jTextField6");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Date");

        holiday_date.setDateFormatString("dd-MMM-yyyy");

        jButton12.setText("Add");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Reset");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Holidays Name", "Days Name", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 272, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(holiday_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(holiday_date, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jButton14)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(6, 6, 6)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(holiday_search, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel12))
                        .addComponent(holiday_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel11))
                        .addComponent(holiday_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(holiday_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton12)
                        .addComponent(jButton13))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton14)
                        .addComponent(jButton15))
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 127, 14, 128);
        holiday_pnl.add(jPanel6, gridBagConstraints);

        front_right_pnl.add(holiday_pnl, "card5");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Files");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jTree1);

        jLabel66.setText("Student ID");

        jLabel68.setText("Choose File");

        jButton23.setText("Select");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel69.setText("Search ID");

        jButton41.setText("Copy To");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("Delete");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(113, 113, 113))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)))
        );

        javax.swing.GroupLayout report_pnlLayout = new javax.swing.GroupLayout(report_pnl);
        report_pnl.setLayout(report_pnlLayout);
        report_pnlLayout.setHorizontalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_pnlLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        report_pnlLayout.setVerticalGroup(
            report_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(report_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        front_right_pnl.add(report_pnl, "card6");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Instructor Name", "Attendence Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable6);

        jLabel102.setText("Select Date :");

        jDateChooser9.setDateFormatString("dd-MMM-yyyy");
        jDateChooser9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser9PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout attendance_pnlLayout = new javax.swing.GroupLayout(attendance_pnl);
        attendance_pnl.setLayout(attendance_pnlLayout);
        attendance_pnlLayout.setHorizontalGroup(
            attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendance_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        attendance_pnlLayout.setVerticalGroup(
            attendance_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendance_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        front_right_pnl.add(attendance_pnl, "card8");

        jLabel103.setText("Select Date");

        jLabel104.setText("Instructor's Name");

        jDateChooser10.setDateFormatString("dd-MM-yyyy");

        jTextField18.setText("jTextField18");

        jTextField19.setText("jTextField19");

        jLabel105.setText("Salary");

        jLabel106.setText("Payment Mode");

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Cheque", "Others" }));

        jButton28.setText("Submit");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Update");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Salary", "Payment Mode"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable7);

        jLabel107.setText("Search");

        jTextField20.setText("jTextField20");
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField20KeyReleased(evt);
            }
        });

        jButton30.setText("Delete");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("Reset");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jComboBox15.setEditable(true);
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ID" }));
        jComboBox15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox15ItemStateChanged(evt);
            }
        });

        jLabel112.setText("Instructor ID");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox15, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField19)
                            .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextField18)
                            .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel103)
                            .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19)
                            .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton28)
                            .addComponent(jButton29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton30)
                            .addComponent(jButton31))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout salary_pnlLayout = new javax.swing.GroupLayout(salary_pnl);
        salary_pnl.setLayout(salary_pnlLayout);
        salary_pnlLayout.setHorizontalGroup(
            salary_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salary_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        salary_pnlLayout.setVerticalGroup(
            salary_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salary_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        front_right_pnl.add(salary_pnl, "card9");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Application Form No", "Trainee Name", "Admission Date", "Father's Name", "DOB", "Contact No", "Email-ID", "Shift", "Unit", "Admission Category", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(45);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(45);
            jTable4.getColumnModel().getColumn(8).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(9).setPreferredWidth(20);
            jTable4.getColumnModel().getColumn(11).setPreferredWidth(0);
            jTable4.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Session");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Session" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Trade");

        jComboBox2.setEditable(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Trade" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Date from :");

        jDateChooser1.setDateFormatString("dd-MMM-yy");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Date to :");

        jDateChooser2.setDateFormatString("dd-MMM-yy");
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });

        jButton21.setText("Export");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton34.setText("Print");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton39.setText("Remove");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Search By Id");

        jTextField36.setText("jTextField36");
        jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField36KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout view_trainee_detailLayout = new javax.swing.GroupLayout(view_trainee_detail);
        view_trainee_detail.setLayout(view_trainee_detailLayout);
        view_trainee_detailLayout.setHorizontalGroup(
            view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_trainee_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(view_trainee_detailLayout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton39))
                    .addGroup(view_trainee_detailLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        view_trainee_detailLayout.setVerticalGroup(
            view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_trainee_detailLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(view_trainee_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton34)
                    .addComponent(jButton39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        front_right_pnl.add(view_trainee_detail, "card11");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No.", "Session ID", "Trainee Name", "Trade", "Paid Amount", "Bal. Amt", "Disc.", "Payment Date", "Sem.", "Remark", "Created/Update", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable5.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable5.getColumnModel().getColumn(4).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable5.getColumnModel().getColumn(5).setMaxWidth(60);
            jTable5.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(6).setMaxWidth(50);
            jTable5.getColumnModel().getColumn(7).setPreferredWidth(80);
            jTable5.getColumnModel().getColumn(7).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(8).setPreferredWidth(40);
            jTable5.getColumnModel().getColumn(8).setMaxWidth(40);
            jTable5.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(10).setMaxWidth(100);
            jTable5.getColumnModel().getColumn(11).setPreferredWidth(20);
            jTable5.getColumnModel().getColumn(11).setMaxWidth(20);
        }

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Seesion");

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Session" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Trade");

        jComboBox4.setEditable(true);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Trade" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("Date from :");

        jDateChooser4.setDateFormatString("dd-MMM-yyyy");
        jDateChooser4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser4PropertyChange(evt);
            }
        });

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Date to :");

        jDateChooser5.setDateFormatString("dd-MMM-yyyy");
        jDateChooser5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser5PropertyChange(evt);
            }
        });

        jButton22.setText("Export");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton40.setText("Remove");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel127.setText("Search ID");

        jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField34KeyReleased(evt);
            }
        });

        jButton43.setText("All ID Balance");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText("ID Report");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setText("Daily Report");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("All ID Challan");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel131.setText("jLabel131");

        jToggleButton1.setText("FOC");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_fee_detailsLayout = new javax.swing.GroupLayout(view_fee_details);
        view_fee_details.setLayout(view_fee_detailsLayout);
        view_fee_detailsLayout.setHorizontalGroup(
            view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_fee_detailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_fee_detailsLayout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, 118, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, 0, 115, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))
                    .addGroup(view_fee_detailsLayout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton40)
                        .addGap(29, 29, 29)
                        .addComponent(jButton43)
                        .addGap(29, 29, 29)
                        .addComponent(jButton44)
                        .addGap(30, 30, 30)
                        .addComponent(jButton45)
                        .addGap(33, 33, 33)
                        .addComponent(jButton46)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_fee_detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(view_fee_detailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        view_fee_detailsLayout.setVerticalGroup(
            view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_fee_detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField34)
                    .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel63)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22)
                    .addComponent(jButton1)
                    .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton40)
                        .addComponent(jButton43))
                    .addComponent(jButton44)
                    .addGroup(view_fee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton45)
                        .addComponent(jButton46)
                        .addComponent(jLabel131)
                        .addComponent(jToggleButton1)))
                .addGap(10, 10, 10))
        );

        view_fee_detailsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox3, jComboBox4, jDateChooser4, jDateChooser5, jLabel127, jLabel62, jLabel63, jLabel64, jLabel65, jTextField34});

        view_fee_detailsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton22, jButton40, jButton43, jButton44, jButton45, jButton46, jLabel131});

        front_right_pnl.add(view_fee_details, "card12");

        instructor_detail.setLayout(new java.awt.GridBagLayout());

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("UID No");

        jComboBox5.setEditable(true);
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type UID" }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Date of Birth");

        jDateChooser6.setDateFormatString("dd-MMM-yyyy");

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Marital Status");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status", "Married", "Unmarried" }));

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("Language Known");

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("Blood Group");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unknown", "A+", "B+", "A-", "B-", "AB+", "AB-", "O+", "O-", " " }));

        jTextField2.setText("jTextField2");

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel75.setText("Photograph");

        jButton24.setText("Choose");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel76.setText("Mobile No.");

        jTextField3.setText("jTextField3");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("Instructor Name");

        jTextField4.setText("jTextField4");

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Gender");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("Category");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category", "General", "OBC", "SC/ST" }));

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("Father/Husband Name");

        jTextField5.setText("jTextField5");

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("GPF/EPF/CPF/NPS No.");

        jTextField6.setText("jTextField6");

        jLabel82.setText("No Image Selected");

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("E-mail");

        jTextField7.setText("jTextField7");

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane8.setViewportView(jTextArea1);

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("State");

        jComboBox10.setEditable(true);
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select State", "Andra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal" }));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("District");

        jComboBox11.setEditable(true);
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select District", "Agra ", "Aligarh ", "Allahabad ", "Ambedkar Nagar ", "Amethi ", "Amroha ", "Auraiya ", "Azamgarh ", "Badaun ", "Baghpat ", "Bahraich ", "Ballia ", "Balrampur ", "Banda ", "Barabanki ", "Bareilly ", "Basti ", "Bhadohi ", "Bijnor ", "Bulandshahar ", "Chandauli ", "Chitrakoot ", "Deoria ", "Etah ", "Etawah ", "Faizabad ", "Farrukhabad ", "Fatehpur ", "Firozabad ", "Gautam Buddha Nagar ", "Ghaziabad ", "Ghazipur ", "Gonda ", "Gorakhpur ", "Hamirpur ", "Hapur", "Hardoi ", "Hathras ", "Jalaun ", "Jaunpur", "Jhansi ", "Kannauj ", "Kanpur Dehat ", "Kanpur Nagar ", "Kasgan ", "Kaushambi ", "Kheri ", "Kushi Nagar ", "Lalitpur ", "Lucknow ", "Maharajganj ", "Mahoba ", "Mainpuri ", "Mathura ", "Mau ", "Meerut ", "Mirzapur ", "Moradabad ", "Muzaffarnagar ", "Pilibhit ", "Pratapgarh ", "Rae Bareli ", "Rampur ", "Saharanpur ", "Sambhal ", "Sant Kabir Nagar ", "Shahjahanpur ", "Shamli, ", "Shrawasti ", "Siddharthnagar ", "Sitapur ", "Sonbhadra ", "Sultanpur ", "Unnao ", "Varanasi" }));

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Pincode");

        jTextField8.setText("jTextField8");

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Home Phone No");

        jTextField9.setText("jTextField9");

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Qualification");

        jComboBox12.setEditable(true);
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Qualification" }));

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("Passing year");

        jDateChooser7.setDateFormatString("yyyy");

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("University/Board");

        jTextField10.setText("jTextField10");

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("Subject");

        jTextField11.setText("jTextField11");

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("Grade");

        jTextField12.setText("jTextField12");

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Percentage");

        jTextField13.setText("jTextField13");

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("Technical Quali.");

        jComboBox13.setEditable(true);
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Qualification" }));

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Passing Year");

        jDateChooser8.setDateFormatString("yyyy");

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("Univarsity/Board");

        jTextField14.setText("jTextField14");

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setText("Subject");

        jTextField15.setText("jTextField15");

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("Grade");

        jTextField16.setText("jTextField16");

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("Percentage");

        jTextField17.setText("jTextField17");

        jButton25.setText("Add");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("Update");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("View");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel101.setText("No Image");
        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox9.setText("same");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox9, 0, 193, Short.MAX_VALUE)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField7)
                                        .addComponent(jComboBox12, 0, 194, Short.MAX_VALUE)
                                        .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField10)
                                        .addComponent(jTextField11)
                                        .addComponent(jTextField12)
                                        .addComponent(jTextField13))))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField14)
                                    .addComponent(jTextField17)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox13, 0, 164, Short.MAX_VALUE)
                                    .addComponent(jDateChooser8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox10, jComboBox11, jComboBox5, jComboBox6, jComboBox7, jDateChooser6, jScrollPane8, jTextField2, jTextField3, jTextField8, jTextField9});

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel100, jLabel95, jLabel96, jLabel97, jLabel98, jLabel99});

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox13, jDateChooser8, jTextField14, jTextField15, jTextField16, jTextField17});

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox12, jComboBox8, jComboBox9, jDateChooser7, jTextField10, jTextField11, jTextField12, jTextField13, jTextField4, jTextField5, jTextField6, jTextField7});

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel70, jLabel71, jLabel72, jLabel73, jLabel74, jLabel75, jLabel76, jLabel84, jLabel85, jLabel86, jLabel87, jLabel88});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel78)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton24)
                                .addComponent(jLabel82)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel76)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel83)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel89)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField10)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel92)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25)
                            .addComponent(jButton26)
                            .addComponent(jButton27)))
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 8);
        instructor_detail.add(jPanel10, gridBagConstraints);

        front_right_pnl.add(instructor_detail, "card13");

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Father/Husband Name", "Language Known", "Mobile No", "E-mail", "GPF/EPF/CPF/NPS", "Home Phone No", "Qualification"
            }
        ));
        jScrollPane11.setViewportView(jTable8);

        jLabel111.setText("Search");

        jTextField22.setText("jTextField22");
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField22KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout view_instructor_detailLayout = new javax.swing.GroupLayout(view_instructor_detail);
        view_instructor_detail.setLayout(view_instructor_detailLayout);
        view_instructor_detailLayout.setHorizontalGroup(
            view_instructor_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_instructor_detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(view_instructor_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                    .addGroup(view_instructor_detailLayout.createSequentialGroup()
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        view_instructor_detailLayout.setVerticalGroup(
            view_instructor_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_instructor_detailLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(view_instructor_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        front_right_pnl.add(view_instructor_detail, "card14");

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel123.setText("User ID");

        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel124.setText("User Name");

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel125.setText("Password");

        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel126.setText("Confirm Password");

        jTextField32.setText("jTextField32");

        jTextField33.setText("jTextField33");

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField2.setText("jPasswordField2");

        jPasswordField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField3.setText("jPasswordField3");

        jButton35.setText("Add User");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("Update");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("Delete");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("Reset");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "Created on Date", "Created By"
            }
        ));
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable9);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField32)
                            .addComponent(jTextField33)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jPasswordField3)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel126)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton35)
                            .addComponent(jButton36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton37)
                            .addComponent(jButton38)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout newUserLayout = new javax.swing.GroupLayout(newUser);
        newUser.setLayout(newUserLayout);
        newUserLayout.setHorizontalGroup(
            newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        newUserLayout.setVerticalGroup(
            newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        front_right_pnl.add(newUser, "card15");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Voucher No");

        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel128.setText("Expence");

        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel129.setText("Amount");

        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText("Date");

        jTextField37.setText("jTextField37");
        jTextField37.setNextFocusableComponent(jTextField38);

        jTextField38.setText("jTextField38");
        jTextField38.setNextFocusableComponent(jTextField39);

        jTextField39.setText("jTextField39");
        jTextField39.setNextFocusableComponent(jDateChooser11);

        jDateChooser11.setNextFocusableComponent(jButton48);

        jButton48.setText("Submit");
        jButton48.setNextFocusableComponent(jButton49);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jButton48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton48KeyPressed(evt);
            }
        });

        jButton49.setText("Reset");
        jButton49.setNextFocusableComponent(jButton51);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jButton49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton49KeyPressed(evt);
            }
        });

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Voucher No", "Expence", "Amount", "Date"
            }
        ));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable10.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable10.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable10.getColumnModel().getColumn(3).setMaxWidth(80);
            jTable10.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable10.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jTextField40.setText("Search by Voucher no or expence name");
        jTextField40.setNextFocusableComponent(jDateChooser12);
        jTextField40.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField40FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField40FocusLost(evt);
            }
        });
        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField40KeyReleased(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel133.setText("From");

        jDateChooser12.setNextFocusableComponent(jDateChooser13);

        jLabel134.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel134.setText("To");

        jDateChooser13.setNextFocusableComponent(jButton50);

        jButton50.setText("Genrate Excel");
        jButton50.setNextFocusableComponent(jButton52);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jButton50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton50KeyPressed(evt);
            }
        });

        jButton51.setText("Voucher");
        jButton51.setNextFocusableComponent(jTextField40);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jButton51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton51KeyPressed(evt);
            }
        });

        jButton52.setText("Delete");
        jButton52.setNextFocusableComponent(jTextField37);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jButton52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton52KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout daybook_panelLayout = new javax.swing.GroupLayout(daybook_panel);
        daybook_panel.setLayout(daybook_panelLayout);
        daybook_panelLayout.setHorizontalGroup(
            daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daybook_panelLayout.createSequentialGroup()
                .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(daybook_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(daybook_panelLayout.createSequentialGroup()
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(daybook_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jDateChooser12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel134)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(daybook_panelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField37)
                                    .addComponent(jTextField38)
                                    .addComponent(jTextField39)
                                    .addComponent(jDateChooser11, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addGroup(daybook_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton50))
                            .addGroup(daybook_panelLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jButton48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton51)))
                        .addGap(12, 12, 12)
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                            .addComponent(jTextField40))))
                .addContainerGap())
        );

        daybook_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDateChooser12, jDateChooser13});

        daybook_panelLayout.setVerticalGroup(
            daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daybook_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daybook_panelLayout.createSequentialGroup()
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel128)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel129)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jDateChooser11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton48)
                            .addComponent(jButton49)
                            .addComponent(jButton51))
                        .addGap(34, 34, 34)
                        .addGroup(daybook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133)
                            .addComponent(jDateChooser12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel134)
                            .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton50))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton52)
                .addContainerGap())
        );

        daybook_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooser12, jDateChooser13, jLabel133, jLabel134});

        front_right_pnl.add(daybook_panel, "card16");

        javax.swing.GroupLayout body_pnlLayout = new javax.swing.GroupLayout(body_pnl);
        body_pnl.setLayout(body_pnlLayout);
        body_pnlLayout.setHorizontalGroup(
            body_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(body_pnlLayout.createSequentialGroup()
                .addComponent(left_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(front_right_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        body_pnlLayout.setVerticalGroup(
            body_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(front_right_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        header_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpiti/cpiti.png"))); // NOI18N
        jLabel1.setText("CHANDRA PRIVATE INDUSTRIAL TRAINING INSTITUTE ");

        javax.swing.GroupLayout header_pnlLayout = new javax.swing.GroupLayout(header_pnl);
        header_pnl.setLayout(header_pnlLayout);
        header_pnlLayout.setHorizontalGroup(
            header_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1303, Short.MAX_VALUE)
                .addContainerGap())
        );
        header_pnlLayout.setVerticalGroup(
            header_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        footer_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout footer_pnlLayout = new javax.swing.GroupLayout(footer_pnl);
        footer_pnl.setLayout(footer_pnlLayout);
        footer_pnlLayout.setHorizontalGroup(
            footer_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footer_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footer_pnlLayout.setVerticalGroup(
            footer_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footer_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footer_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        jMenu3.setText("Import");

        jMenuItem2.setText("Trainee Details");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setText("Trainee Fees");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Holidays");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Bank Names");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenu1.add(jMenu3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("About");

        jMenuItem7.setText("About");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(footer_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staff_manage_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staff_manage_btnFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_staff_manage_btnFocusGained

    private void staff_manage_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_manage_btnMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_staff_manage_btnMouseClicked

    private void trade_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trade_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_trade_btnFocusGained

    private void trade_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trade_btnMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_trade_btnMouseClicked

    private void bank_details_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bank_details_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_details_btnFocusGained

    private void bank_details_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bank_details_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_details_btnMouseClicked

    private void holiday_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_holiday_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_holiday_btnFocusGained

    private void holiday_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holiday_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_holiday_btnMouseClicked

    private void student_registration_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_registration_btnMouseClicked
        // TODO add your handling code here:
//         jPopupMenu1.removeAll();
//        JMenuItem item=null;
//        item=new JMenuItem("button 4 Item 1");
//        jPopupMenu1.add(item);
//        item=new JMenuItem("button 4 Item 2");
//        jPopupMenu1.add(item);
//        jButton4.add(jPopupMenu1);
//        jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
      
     
        
    }//GEN-LAST:event_student_registration_btnMouseClicked

    private void student_registration_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_registration_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        student_registration_pnl.setVisible(true);
        reset_button_color();
        student_registration_btn.setBackground(Color.ORANGE);
        reset_student_registration();
        
    }//GEN-LAST:event_student_registration_btnActionPerformed

    private void student_fee_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_fee_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_student_fee_btnMouseClicked

    private void student_fee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_fee_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        student_fee_pnl.setVisible(true);
        fee_receipt_no.setText(generateId("","select fee_receipt_no  from Fee_Details"));
        reset_button_color();
        student_fee_btn.setBackground(Color.ORANGE);
        reset_student_fees(); 
        
        
       
    }//GEN-LAST:event_student_fee_btnActionPerformed

    private void attendance_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attendance_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_attendance_btnFocusGained

    private void attendance_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendance_btnMouseClicked

    private void staff_salary_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staff_salary_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_salary_btnFocusGained

    private void staff_salary_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_salary_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_salary_btnMouseClicked

    private void reports_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reports_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_reports_btnFocusGained

    private void reports_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reports_btnMouseClicked

    private void trade_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trade_btnActionPerformed
        // trade
        hide_all_panel();
        trade_pnl.setVisible(true);
        reset_button_color();
        trade_btn.setBackground(Color.ORANGE);
        reset_trade();
    }//GEN-LAST:event_trade_btnActionPerformed

    private void holiday_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holiday_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        holiday_pnl.setVisible(true);
         reset_button_color();
        holiday_btn.setBackground(Color.ORANGE);
        //getTableData("select holiday_name,holiday_date,holiday_day from Holidays", holiday_table);
//        try{
//    DefaultTableModel dtm=(DefaultTableModel)holiday_table.getModel();
//    for(int i=dtm.getRowCount()-1;i>=0;i--)
//        dtm.removeRow(i);
//    Query query2=session.createQuery("select holiday_name,holiday_date,holiday_day from Holidays");
//        List list=query2.list();
//        Iterator i=list.iterator();
//        while(i.hasNext())
//            dtm.addRow((Object[])i.next());
//    }catch(Exception e){}
        reset_holiday();
    }//GEN-LAST:event_holiday_btnActionPerformed

    private void bank_details_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_details_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        bank_detail_pnl.setVisible(true);
        reset_button_color();
        bank_details_btn.setBackground(Color.ORANGE);
        reset_bank();
//        TableColumnModel cm=jTable2.getColumnModel();
//        cm.getColumn(0).setPreferredWidth(5);
    }//GEN-LAST:event_bank_details_btnActionPerformed

    private void staff_manage_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_manage_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        instructor_detail.setVisible(true);
        reset_button_color();
        staff_manage_btn.setBackground(Color.ORANGE);
        reset_instructor();
        getDataInCombo("select distinct instructor_qualification from Instructor", jComboBox12);
        getDataInCombo("select distinct instructor_tech_qualification from Instructor", jComboBox13);
    }//GEN-LAST:event_staff_manage_btnActionPerformed

    private void trainee_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainee_resetActionPerformed
        // TODO add your handling code here:
        reset_student_registration();
    }//GEN-LAST:event_trainee_resetActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        reset_student_fees();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        reset_bank();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        reset_holiday();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        reset_trade();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        login_value=false;
        Login_panel.setVisible(true);
        left_pnl.setEnabled(false);
        footer_pnl.setEnabled(false);
        reset_button_color();
        disable_button();
        jTextField21.setEnabled(true);
    jPasswordField1.setEnabled(true);
    jButton33.setEnabled(true);
    jButton32.setEnabled(true);
    jTextField21.requestFocusInWindow();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//         File file=new File("cpiti.lock");
//        if(file.exists())
//            file.delete(); 
     System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void trainee_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainee_submitActionPerformed
        // TODO add your handling code here:
        if(session_id_cbx.getSelectedIndex()!=0)
        if(jDateChooser3.getDate()!=null)
        if(!trainee_name.getText().isEmpty())
        if(dob.getDate()!=null)
        if(trainee_gen.getSelectedIndex()!=0)
        if(!trainee_nationality.getSelectedItem().toString().isEmpty()&&!"null".equals(trainee_nationality.getSelectedItem().toString()))
        if(!"null".equals(trainee_mobile.getText())&&!trainee_mobile.getText().isEmpty())
        if(trainee_qualification.getSelectedIndex()!=0&&!"null".equals(trainee_qualification.getSelectedItem().toString()))
        if(trainee_category.getSelectedIndex()!=0)
        if(trainee_hcategory.getSelectedIndex()!=0)
        if(trainee_acategory.getSelectedIndex()!=0)
        if(trainee_mcategory.getSelectedIndex()!=0)
        if(!trainee_strn.getText().equals("null")&& !trainee_strn.getText().isEmpty())
        if(!trainee_app_form_no.getText().equals("null")&& !trainee_app_form_no.getText().isEmpty())
        if(trainee_admission_date.getDate()!=null)
        if(trainee_trade.getSelectedIndex()!=0)
        if(trainee_type.getSelectedIndex()!=0)
        if(photo_container.getIcon()!=null){
            try{
        Object obj[]=setDataToComponent("select trainee_session_id from Trainee where trainee_session_id='"+session_id_cbx.getSelectedItem().toString()+"' and trainee_session='"+new SimpleDateFormat("MMM-yyyy").format(jDateChooser3.getDate())+"'");
        if(obj==null){ 
         session.beginTransaction();
        Trainee trainee=new Trainee();
        trainee.setTrainee_id(session_id_cbx.getSelectedItem().toString()+new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
        trainee.setTrainee_session_id(session_id_cbx.getSelectedItem().toString());
        trainee.setTrainee_session(new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
        trainee.setTrainee_name(trainee_name.getText());
        trainee.setTrainee_father_name(trainee_fname.getText());
        trainee.setTrainee_mother_name(trainee_mname.getText());
        trainee.setTrainee_date_of_birth(dob.getDate());
        trainee.setTrainee_gender(trainee_gen.getSelectedItem().toString());
        trainee.setTrainee_nationality(trainee_nationality.getSelectedItem().toString());
        trainee.setTrainee_mobile_no(trainee_mobile.getText());
        trainee.setTrainee_email(trainee_email.getText());
        trainee.setTrainee_aadhar_no(trainee_aadhar.getText());
        trainee.setTrainee_address(trainee_address.getText());
        trainee.setTrainee_qualification(trainee_qualification.getSelectedItem().toString());
        trainee.setTrainee_category(trainee_category.getSelectedItem().toString());
        trainee.setTrainee_horizontal_category(trainee_hcategory.getSelectedItem().toString());
        trainee.setTrainee_addmission_category(trainee_acategory.getSelectedItem().toString());
        trainee.setTrainee_minority_category(trainee_mcategory.getSelectedItem().toString());
        trainee.setTrainee_state_reg_no(trainee_strn.getText());
        trainee.setTrainee_app_form_no(trainee_app_form_no.getText());
        trainee.setTrainee_admission_date(trainee_admission_date.getDate());
        trainee.setTrainee_trade_name(trainee_trade.getSelectedItem().toString());
        trainee.setTrainee_type(trainee_type.getSelectedItem().toString());
        trainee.setTrainee_trade_shift(Integer.parseInt(trainee_shift.getText()));
        trainee.setTrainee_trade_unit(Integer.parseInt(trainee_unit.getText()));
        trainee.setTrainee_mode(trainee_dual_mode.getSelectedItem().toString());
        trainee.setTrainee_remarks(trainee_remarks.getText());
        
        File file = new File(photo_location.getText());
        byte[] b = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);
        trainee.setTrainee_photo(b);
        session.save(trainee);
        tx.commit();
        JOptionPane.showMessageDialog(null, "Trainee Detail submitted");
        reset_student_registration();
        createPdf(session_id_cbx.getSelectedItem().toString()+new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
        }
        }catch(Exception e){}
        }else
            JOptionPane.showMessageDialog(null, "Select Photo.");
        else
            JOptionPane.showMessageDialog(null, "Select Trainee Type.");
        else
            JOptionPane.showMessageDialog(null, "Select Trade.");
        else
            JOptionPane.showMessageDialog(null, "Fill Admission Date.");
        else
            JOptionPane.showMessageDialog(null, "Fill Application Form no.");
        else
            JOptionPane.showMessageDialog(null, "Fill State Registration no.");
        else
           JOptionPane.showMessageDialog(null, "Select Minority Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Addmission Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Horizontal Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Qualification!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Mobile Number!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Nationality!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Gender!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Date of Birth!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Trainee Name!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Session!");
        else
           JOptionPane.showMessageDialog(null, "Select Trainee ID!"); 
    }//GEN-LAST:event_trainee_submitActionPerformed

    private void trainee_categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_trainee_categoryItemStateChanged
        // TODO add your handling code here:
//        category_id=onItemchange("select category_id from Category where category_name='"+trainee_category.getSelectedItem().toString()+"'");
//        System.out.println(onItemchange("select category_id from Category where category_name='"+trainee_category.getSelectedItem().toString()+"'"));
    }//GEN-LAST:event_trainee_categoryItemStateChanged

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        session.beginTransaction();
        Holidays h=new Holidays();
        h.setHoliday_name(holiday_name.getText());
        h.setHoliday_date(holiday_date.getDate());
        h.setHoliday_day(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(holiday_date.getDate()));
        session.save(h);
        tx.commit();
       // getTableData("select holiday_name,holiday_date,holiday_day from Holidays", jTable3);
        reset_holiday();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void trainee_hcategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_trainee_hcategoryItemStateChanged
        // TODO add your handling code here:
       // hcategory_id=onItemchange("select hcategory_id from HCategory where hcategory_name='"+trainee_hcategory.getSelectedItem().toString()+"'");
    }//GEN-LAST:event_trainee_hcategoryItemStateChanged

    private void trainee_acategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_trainee_acategoryItemStateChanged
        // TODO add your handling code here:
     //   acategory_id=onItemchange("select acategory_id from ACategory where acategory_name='"+trainee_acategory.getSelectedItem().toString()+"'");
    }//GEN-LAST:event_trainee_acategoryItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println(genId("T", "select max(cast(SUBSTR(trade_id,2) as integer)) from Trade"));
      trade_id=genId("T", "select max(cast(SUBSTR(trade_id,2) as integer)) from Trade");
      session.beginTransaction();
      Trade t=new Trade();
      t.setTrade_id(trade_id);
      t.setTrade_name(trade_name.getText().toUpperCase());
      t.setTrade_duration((Integer)trade_duration.getValue());
      t.setTrade_fee(Double.parseDouble(trade_fees.getText()));
      t.setTrade_total_semester((Integer)trade_total_semester.getValue());
      t.setTrade_session(jTextField35.getText());
      session.save(t);  
      tx.commit();
      reset_trade();
      getTableData("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_session,trade_id from Trade", jTable1);
        JOptionPane.showMessageDialog(null,"Data Added!");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(filter);
        int value=chooser.showOpenDialog(this);
        if(value==JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            photo_location.setText(selectedFile.getAbsolutePath());
           
           photo_container.setIcon(resizeImage(selectedFile.getAbsolutePath()));
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()||jCheckBox2.isSelected()||jCheckBox3.isSelected()||jCheckBox4.isSelected()||jCheckBox5.isSelected()||jCheckBox6.isSelected()||jCheckBox7.isSelected()||jCheckBox8.isSelected()||jCheckBox11.isSelected()){
            session.beginTransaction();
            Fee_Details ff=session.get(Fee_Details.class,fee_receipt_no.getText());
            tx.commit();
       // Non - FOC Students
        if(!jCheckBox10.isSelected())
                if(ff==null)
                    if(fee_receipt_no.getText()!=null)
                        if(fee_student_id.getSelectedIndex()!=0)
                            if(fee_trade.getSelectedIndex()!=0)
                                if(fee_pay_mode.getSelectedIndex()>0)
                                        if(fee_cheque_date.getDate()!=null)
                                            if(!fee_amount.getText().equals("0")){
                                                if(countSem>0){
                                                    depositSemesterFee();
                                                }else
                                                    JOptionPane.showMessageDialog(null, "Select Semester");
                                            }
                                            else
                                                JOptionPane.showMessageDialog(null, "Fill Fee Amount");
                                        else
                                            JOptionPane.showMessageDialog(null, "Fill Cheque Date");
                                else
                                    JOptionPane.showMessageDialog(null, "Select Payment Mode");
                            else
                                JOptionPane.showMessageDialog(null, "Select Trade ");
                        else
                            JOptionPane.showMessageDialog(null, "Fill Session ID");
                    else
                        JOptionPane.showMessageDialog(null, "Fill Receipt No");
                else
                    JOptionPane.showMessageDialog(null, "This Reciept no Already Exist You can Update Only");
 // Non - FOC submission end
        else{
            // FOC Students
            session.beginTransaction();
            FOC_Details f=session.get(FOC_Details.class, fee_receipt_no.getText());
            tx.commit();
            if(f==null)
            {
                if(fee_receipt_no.getText()!=null)
                            if(fee_student_id.getSelectedIndex()!=0)
                                if(fee_trade.getSelectedIndex()!=0){
                                                depositeFoc();
                                }else
                                                JOptionPane.showMessageDialog(null, "Enter Trade !");
                            else
                                            JOptionPane.showMessageDialog(null, "Enter Student ID !");
                    else
                                    JOptionPane.showMessageDialog(null,"FOC No can not be Empty !");
            }else
                JOptionPane.showMessageDialog(null, "This FOC Number Exist !");
// FOC submission end
            
        }
        }else
            JOptionPane.showMessageDialog(null, "No Semester selected");
        
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //update
        // Fee_Details fd=new Fee_Details();
        if(!jCheckBox10.isSelected())
                if(fee_receipt_no.getText()!=null)
                    if(fee_student_id.getSelectedIndex()!=0)
                        if(fee_trade.getSelectedIndex()!=0)
                            if(fee_pay_mode.getSelectedIndex()!=0)
                                if(fee_cheque_date.getDate()!=null)
                                    if(!fee_amount.getText().equals("0")){
                                        updateSemesterFee();               
                                    }
                                    else
                                        JOptionPane.showMessageDialog(null, "Fill Fee Amount");
                                else
                                    JOptionPane.showMessageDialog(null, "Fill Cheque Date");
                            else
                                JOptionPane.showMessageDialog(null, "Select Payment Mode");
                        else
                            JOptionPane.showMessageDialog(null, "Select Trade ");
                    else
                        JOptionPane.showMessageDialog(null, "Fill Session ID");
                else
                    JOptionPane.showMessageDialog(null, "Fill Receipt No");
        else{
                      
           
            if(fee_receipt_no.getText()!=null)
                if(fee_student_id.getSelectedIndex()!=0)
                        if(fee_trade.getSelectedIndex()!=0){
                            updateFoc();
                
                        }else
                                JOptionPane.showMessageDialog(null, "Enter Trade !");
                else
                                JOptionPane.showMessageDialog(null, "Enter Student ID !");
            else
                            JOptionPane.showMessageDialog(null,"FOC No can not be Empty !");
            
            
            
            
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void fee_student_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fee_student_idItemStateChanged
        // TODO add your handling code here:
       try{
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox11.setVisible(false);
        
        JCheckBox check[]={jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4,jCheckBox5,jCheckBox6,jCheckBox7,jCheckBox8};
        manageSemester("select max(fee_total_semester) from Fee_Details where fee_trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"' and ispaid=true", check);
        Query query2=session.createQuery("select trainee_session from Trainee where trainee_session_id='"+fee_student_id.getSelectedItem()+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          TRAINEE_SESSION=(String)i.next();
         Fee_Details foc=session.get(Fee_Details.class, getMaxId("select fee_receipt_no from Fee_Details WHERE fee_trainee_session_id='"+fee_student_id.getSelectedItem()+"'")+"");
         if(foc!=null){
             BALANCE=foc.getBalance();
            }
         else
            BALANCE=0;
         if(BALANCE>0)
             jCheckBox11.setVisible(true);
       
        fee_balance.setText(BALANCE+"");
        getDataInCombo("select trainee_trade_name from Trainee where trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"'", fee_trade); 
        fee_trade.setSelectedItem(fee_trade.getItemAt(1));
         
       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}

    }//GEN-LAST:event_fee_student_idItemStateChanged

    private void fee_bank_nameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fee_bank_nameItemStateChanged
        // TODO add your handling code here:
       bank_id=onItemChange("select bank_id from Bank where bank_name='"+fee_bank_name.getSelectedItem().toString()+"'");
        
        getDataInCombo("select bank_branch from Bank where bank_id='"+bank_id+"'",fee_branch_name);
    }//GEN-LAST:event_fee_bank_nameItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        bank_id=generateId("B","select max(cast(substr(bank_id,2) as integer)) from Bank");
        
        session.beginTransaction();
        Bank bank=new Bank();
        bank.setBank_id(bank_id);
        bank.setBank_name(bank_name.getText());
        bank.setBank_branch(bank_branch.getText());
        bank.setBank_ifsc(bank_ifsc_code.getText());
        session.save(bank);
        tx.commit();
        JOptionPane.showMessageDialog(null,"Data Added!");
        reset_bank();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void trainee_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainee_updateActionPerformed
        // TODO add your handling code here:
        if(session_id_cbx.getSelectedIndex()!=0)
        if(jDateChooser3.getDate()!=null)
        if(!trainee_name.getText().isEmpty())
        if(dob.getDate()!=null)
        if(trainee_gen.getSelectedIndex()!=0)
        if(!trainee_nationality.getSelectedItem().toString().isEmpty()&&!"null".equals(trainee_nationality.getSelectedItem().toString()))
        if(!"null".equals(trainee_mobile.getText())&&!trainee_mobile.getText().isEmpty())
        if(trainee_qualification.getSelectedIndex()!=0&&!"null".equals(trainee_qualification.getSelectedItem().toString()))
        if(trainee_category.getSelectedIndex()!=0)
        if(trainee_hcategory.getSelectedIndex()!=0)
        if(trainee_acategory.getSelectedIndex()!=0)
        if(trainee_mcategory.getSelectedIndex()!=0)
        if(!trainee_strn.getText().equals("null")&& !trainee_strn.getText().isEmpty())
        if(!trainee_app_form_no.getText().equals("null")&& !trainee_app_form_no.getText().isEmpty())
        if(trainee_admission_date.getDate()!=null)
        if(trainee_trade.getSelectedIndex()!=0)
        if(trainee_type.getSelectedIndex()!=0)
        if(photo_container.getIcon()!=null){
    try{  
        session.beginTransaction();
        Trainee trainee=session.load(Trainee.class,session_id_cbx.getSelectedItem().toString()+new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
       // trainee.setTrainee_session_id(session_id_cbx.getSelectedItem().toString());
        trainee.setTrainee_session(new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
        trainee.setTrainee_name(trainee_name.getText());
        trainee.setTrainee_father_name(trainee_fname.getText());
        trainee.setTrainee_mother_name(trainee_mname.getText());
        trainee.setTrainee_date_of_birth(dob.getDate());
        trainee.setTrainee_gender(trainee_gen.getSelectedItem().toString());
        trainee.setTrainee_nationality(trainee_nationality.getSelectedItem().toString());
        trainee.setTrainee_mobile_no(trainee_mobile.getText());
        trainee.setTrainee_email(trainee_email.getText());
        trainee.setTrainee_aadhar_no(trainee_aadhar.getText());
        trainee.setTrainee_address(trainee_address.getText());
        trainee.setTrainee_qualification(trainee_qualification.getSelectedItem().toString());
        trainee.setTrainee_category(trainee_category.getSelectedItem().toString());
        trainee.setTrainee_horizontal_category(trainee_hcategory.getSelectedItem().toString());
        trainee.setTrainee_addmission_category(trainee_acategory.getSelectedItem().toString());
        trainee.setTrainee_minority_category(trainee_mcategory.getSelectedItem().toString());
        trainee.setTrainee_state_reg_no(trainee_strn.getText());
        trainee.setTrainee_app_form_no(trainee_app_form_no.getText());
        trainee.setTrainee_admission_date(trainee_admission_date.getDate());
        trainee.setTrainee_trade_name(trainee_trade.getSelectedItem().toString());
        trainee.setTrainee_type(trainee_type.getSelectedItem().toString());
        trainee.setTrainee_trade_shift(Integer.parseInt(trainee_shift.getText()));
        trainee.setTrainee_trade_unit(Integer.parseInt(trainee_unit.getText()));
        trainee.setTrainee_mode(trainee_dual_mode.getSelectedItem().toString());
        trainee.setTrainee_remarks(trainee_remarks.getText());
        if(photo_location.getText()!=null){
        File file = new File(photo_location.getText());
        byte[] b = new byte[(int) file.length()];
        try{
        FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);}catch(Exception e){}
        trainee.setTrainee_photo(b);}
        session.update(trainee);
        tx.commit();
       JOptionPane.showMessageDialog(null, "Trainee Detail Updated");
       reset_student_registration();
//if(!photo_location.getText().isEmpty()){
//        session.beginTransaction();
//        FileUpload fu=session.load(FileUpload.class,session_id_cbx.getSelectedItem().toString());
//        File file = new File(photo_location.getText());
//        byte[] b = new byte[(int) file.length()];
//        FileInputStream fileInputStream = new FileInputStream(file);
//            fileInputStream.read(b);
//        fu.setPhoto(b);
//        session.update(fu);
//        tx.commit();
//        copyFileUsingJava7Files(file,new File("StudentsImages\\"+session_id_cbx.getSelectedItem().toString()+".jpg"));
 //       JOptionPane.showMessageDialog(null, "Photo Detail Updated");
//        }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
       }else
            JOptionPane.showMessageDialog(null, "Select Photo.");
        else
            JOptionPane.showMessageDialog(null, "Select Trainee Type.");
        else
            JOptionPane.showMessageDialog(null, "Select Trade.");
        else
            JOptionPane.showMessageDialog(null, "Fill Admission Date.");
        else
            JOptionPane.showMessageDialog(null, "Fill Application Form no.");
        else
            JOptionPane.showMessageDialog(null, "Fill State Registration no.");
        else
           JOptionPane.showMessageDialog(null, "Select Minority Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Addmission Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Horizontal Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Category"); 
        else
           JOptionPane.showMessageDialog(null, "Select Qualification!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Mobile Number!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Nationality!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Gender!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Date of Birth!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Trainee Name!"); 
        else
           JOptionPane.showMessageDialog(null, "Select Session!");
        else
           JOptionPane.showMessageDialog(null, "Select Trainee ID!"); 

    
    }//GEN-LAST:event_trainee_updateActionPerformed

    private void trainee_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainee_viewActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        view_trainee_detail.setVisible(true);
        jTextField36.setText(null);
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee", jTable4);
        getDataInCombo("select distinct trainee_session from Trainee", jComboBox1);
        getDataInCombo("select distinct trade_name from Trade", jComboBox2);
//        jDateChooser1.setDate(new Date());
//        jDateChooser2.setDate(new Date());
    }//GEN-LAST:event_trainee_viewActionPerformed

    private void jDateChooser5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser5PropertyChange
        // TODO add your handling code here:
         jLabel131.setText("");
       if(jDateChooser4.getDate()!=null && jDateChooser5.getDate()!=null){
       if(!jToggleButton1.isSelected()){
           if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)  and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       }
       else{
           if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)  and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       }
       
       }
    }//GEN-LAST:event_jDateChooser5PropertyChange

    private void jDateChooser4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser4PropertyChange
        // TODO add your handling code here:
         jLabel131.setText("");
        if(jDateChooser4.getDate()!=null && jDateChooser5.getDate()!=null){
       if(!jToggleButton1.isSelected()){
           if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)  and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       }
       else{
           if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)  and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       }
       
       }
        
    }//GEN-LAST:event_jDateChooser4PropertyChange

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        view_fee_details.setVisible(true);
        
        System.out.println("getting data ..........................");
        jToggleButton1.setText("Non-FOC");
        getTableData("select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Trainee t, Fee_Details f where f.fee_trainee_session_id=t.trainee_session_id  AND LOCATE('FOC',f.fee_receipt_no)=0",jTable5);
        getDataInCombo("select distinct trainee_session from Trainee", jComboBox3);
        getDataInCombo("select distinct trade_name from Trade", jComboBox4);
        System.out.println("data retriieved ..........................");
        jTextField34.setText(null);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Object s[]=setDataToComponent("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_id,trade_session from Trade where trade_id='"+jTable1.getModel().getValueAt(jTable1.getSelectedRow(),5).toString()+"'");
        trade_name.setText(s[0]+"");
        trade_duration.setValue(s[1]);
        trade_fees.setText(s[2]+"");
        trade_total_semester.setValue(s[3]);
        trade_id=s[4]+"";
        jTextField35.setText(s[5]+"");
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      session.beginTransaction();
     
      Trade t=session.load(Trade.class,trade_id);
      t.setTrade_name(trade_name.getText().toUpperCase());
      t.setTrade_duration((Integer)trade_duration.getValue());
      t.setTrade_fee(Double.parseDouble(trade_fees.getText()));
      t.setTrade_total_semester((Integer)trade_total_semester.getValue());
      t.setTrade_session(jTextField35.getText());
      session.update(t);  
      tx.commit();
      getTableData("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_session,trade_id from Trade", jTable1);
      JOptionPane.showMessageDialog(null,"Data Updated!");
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        session.beginTransaction();
        Object o=session.load(Trade.class,trade_id);
        Trade trade=(Trade)o;
        trade.setTrade_id(trade_id);
        session.delete(trade);
        tx.commit();
        getTableData("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_session,trade_id from Trade", jTable1);
        JOptionPane.showMessageDialog(null,"Data Deleted");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void trade_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_trade_searchKeyReleased
        // TODO add your handling code here:
      getTableData("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_session,trade_id from Trade where trade_name like '%"+trade_search.getText()+"%'", jTable1);  
        
    }//GEN-LAST:event_trade_searchKeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        session.beginTransaction();
        Bank bank=session.load(Bank.class,bank_id);
        bank.setBank_name(bank_name.getText());
        bank.setBank_branch(bank_branch.getText());
        bank.setBank_ifsc(bank_ifsc_code.getText());
        session.update(bank);
        tx.commit();
        JOptionPane.showMessageDialog(null,"Data Updated!");
        reset_bank();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        session.beginTransaction();
        Bank bank=session.load(Bank.class,bank_id);
        bank.setBank_id(bank_id);
        session.delete(bank);
        tx.commit();
        JOptionPane.showMessageDialog(null,"Data Deleted!");
        reset_bank();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        Object s[]=setDataToComponent("select bank_id,bank_name,bank_branch,bank_ifsc from Bank where bank_id='"+jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()+"'");
        bank_id=s[0]+"";
        bank_name.setText(s[1]+"");
        bank_branch.setText(s[2]+"");
        bank_ifsc_code.setText(s[3]+"");
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void bank_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bank_searchKeyReleased
        // TODO add your handling code here:
        getTableData("select bank_id,bank_name,bank_branch,bank_ifsc from Bank where bank_name like '%"+bank_search.getText()+"%'", jTable2);
     
    }//GEN-LAST:event_bank_searchKeyReleased

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         session.beginTransaction();
        Holidays h=session.load(Holidays.class,day_id);
        h.setHoliday_name(holiday_name.getText());
        h.setHoliday_date(holiday_date.getDate());
        h.setHoliday_day(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(holiday_date.getDate()));
        session.update(h);
        tx.commit();
         //getTableData("select holiday_name,holiday_date,holiday_day from Holidays", jTable3);
        JOptionPane.showMessageDialog(null, "Data Updated!");
        reset_holiday();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         session.beginTransaction();
        Holidays h=session.load(Holidays.class,day_id);
        h.setHoliday_name(holiday_name.getText());
        h.setHoliday_date(holiday_date.getDate());
        h.setHoliday_day(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(holiday_date.getDate()));
        session.delete(h);
        tx.commit();
        // getTableData("select holiday_name,holiday_date,holiday_day from Holidays", jTable3);
        JOptionPane.showMessageDialog(null, "Data Deleted!");
        reset_holiday();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void holiday_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_holiday_searchKeyReleased
        // TODO add your handling code here:
        getTableData("select holiday_name,holiday_date,holiday_day from Holidays where holiday_name like '%"+holiday_search.getText()+"%'", jTable3);
    }//GEN-LAST:event_holiday_searchKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // import students personal detail file
       JFileChooser fc=new JFileChooser();
        try{
        int state=fc.showOpenDialog(this);
        if(state==JFileChooser.APPROVE_OPTION){
           fc.getSelectedFile().getAbsolutePath();
             Object obj[][]=new ReadExceldemo().uploadFile( fc.getSelectedFile().getAbsolutePath(),"Personal_Details", null);
             for(int x=1;x<obj.length;x++){
                session.beginTransaction();
                 Trainee t=new Trainee();
                 for(int y=0;y<obj[0].length;y++)
                 {  
                     switch(y){
                         case 0:t.setTrainee_id(obj[x][y]+""+obj[x][y+1]);
                         System.out.print("("+obj[x][y]+""+obj[x][y+1]+") \t");
                       //  System.out.print(y+" \t");
                         t.setTrainee_session_id(obj[x][y]+"");
                         System.out.print(obj[x][y]+" \t");
                             break;
                         case 1://t.setTrainee_session_id(obj[x][y]+"");
                             t.setTrainee_session(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 2://t.setTrainee_session(obj[x][y]+"");
                             
                             t.setTrainee_state_reg_no(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 3:// t.setTrainee_state_reg_no(obj[x][y]+"");
                             t.setTrainee_app_form_no(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 4:
                              if(obj[x][y] instanceof Date){
                             t.setTrainee_admission_date((Date)obj[x][y]);
                             System.out.print((Date)obj[x][y]+" \t");
                              }
                              else
                              {
                               t.setTrainee_admission_date(null);
                             System.out.print(null+" \t");   
                              }
                             break;
                         case 5:
                             t.setTrainee_name(obj[x][y]+"");
                             System.out.print(obj[x][y]+"\t");
                            break;
                         case 6://t.setTrainee_name(obj[x][y]+"");
                             t.setTrainee_mobile_no(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 7://t.setTrainee_mobile_no(obj[x][y]+"");
                             t.setTrainee_email(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 8://t.setTrainee_email(obj[x][y]+"");
                             if(obj[x][y] instanceof String){
                             t.setTrainee_date_of_birth(new SimpleDateFormat("dd-MMM-yyyy").parse(obj[x][y]+""));
                             System.out.print(obj[x][y]+" \t");
                             }else{
                                t.setTrainee_date_of_birth((Date)obj[x][y]);
                             System.out.print(obj[x][y]+" \t"); 
                             }
                             break;
                         case 9: //
                              t.setTrainee_gender(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 10:// t.setTrainee_gender(obj[x][y]+"");
                             t.setTrainee_category(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 11://t.setTrainee_category(obj[x][y]+"");
                             t.setTrainee_horizontal_category(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                           break;
                         case 12://t.setTrainee_horizontal_category(obj[x][y]+"");
                             t.setTrainee_father_name(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 13://t.setTrainee_father_name(obj[x][y]+"");
                             t.setTrainee_mother_name(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 14://t.setTrainee_mother_name(obj[x][y]+"");
                             t.setTrainee_addmission_category(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 15: //t.setTrainee_addmission_category(obj[x][y]+"");
                              t.setTrainee_type(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 16:// t.setTrainee_type(obj[x][y]+"");
                             t.setTrainee_trade_name(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 17:
                            System.out.print(Integer.valueOf(obj[x][y]+"")+" \t");
                                                    
                             t.setTrainee_trade_shift(Integer.valueOf(obj[x][y]+""));
                            // System.out.print(y+" \t");
                             break;
                         case 18: 
                             t.setTrainee_trade_unit(Integer.valueOf(obj[x][y]+""));
                             System.out.print(Integer.valueOf(obj[x][y]+"")+" \t");
                             break;
                         case 19://t.setTrainee_trade_unit((Integer)obj[x][y]);
                             t.setTrainee_minority_category(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 20://t.setTrainee_minority_category(obj[x][y]+"");
                             t.setTrainee_aadhar_no(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 21://t.setTrainee_aadhar_no(obj[x][y]+"");
                             t.setTrainee_qualification(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 22://t.setTrainee_qualification(obj[x][y]+"");
                             t.setTrainee_mode(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         case 23://t.setTrainee_mode(obj[x][y]+"");
                             t.setTrainee_remarks(obj[x][y]+"");
                             System.out.print(obj[x][y]+" \t");
                             break;
                         
                     }
                     
                 }  //inner for loop
                 session.save(t);
                 tx.commit();
                 System.out.println("");
                
             }//outer for loop
             JOptionPane.showMessageDialog(null, "File Imported!");
        } //if statement
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e+"  Excel Sheet Name Must Be \"Personal_Details\"");}
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:


       if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()==0)
               getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4);
       else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()!=0)
                getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", jTable4);
        else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()!=0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"' and lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", jTable4);
       else
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee", jTable4);
       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
       if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()==0)
               getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4);
       else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()!=0)
                getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", jTable4);
        else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()!=0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"' and lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", jTable4);
       else
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee", jTable4);
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        // TODO add your handling code here:
      if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null){
        if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"'", jTable4); 
       else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()!=0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_trade_name='"+jComboBox2.getSelectedItem().toString()+"'", jTable4); 
       else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()==0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4); 
         else
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_trade_name='"+jComboBox2.getSelectedItem().toString()+"' and trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4);  
        }
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null){
        if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"'", jTable4); 
       else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()!=0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_trade_name='"+jComboBox2.getSelectedItem().toString()+"'", jTable4); 
       else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()==0)
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4); 
         else
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' trainee_trade_name='"+jComboBox2.getSelectedItem().toString()+"' and trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", jTable4);  
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
       jLabel131.setText("");
       if(!jToggleButton1.isSelected()){
           if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
        else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       }
       else{
           if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
        else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
//        if(jComboBox3.getSelectedIndex()==0)
//        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')", jTable5);
//        else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
//        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,t.trainee_id from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')", jTable5);
        jLabel131.setText("");
        if(!jToggleButton1.isSelected()){
             if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
        else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
       else
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id   AND LOCATE('FOC',f.fee_receipt_no)=0", jTable5);
        }
        else{
         if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
        else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0)
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and lower(t.trainee_trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);
       else
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details f, Trainee t where t.trainee_session_id=f.fee_trainee_session_id   AND LOCATE('FOC',f.fee_receipt_no)!=0", jTable5);    
        }
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Excel File", ".xlsx");
        int i=fc.showSaveDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            String fileName;
            if(!fc.getSelectedFile().getAbsolutePath().endsWith(".xlsx"))
            fileName=fc.getSelectedFile().getAbsolutePath()+".xlsx";
            else
            fileName=fc.getSelectedFile().getAbsolutePath();   
        
        if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==0){
            if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null)
           generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"'", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
            else
            generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee ", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
        }else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()!=0){
            if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null)
        generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' and lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
            else
            generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where  lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
        }else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()==0){
           if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null)
        generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' and trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
         else
        generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"'", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
        }
        else if(jComboBox1.getSelectedIndex()!=0 && jComboBox2.getSelectedIndex()!=0){
           if(jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null)
        generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate())+"' and trainee_session='"+jComboBox1.getSelectedItem().toString()+"' and lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
         else
        generateDataforExcel(fileName, "Personel_Details","select trainee_session,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_name,trainee_mobile_no,trainee_email,trainee_date_of_birth,trainee_gender,trainee_category,trainee_horizontal_category,trainee_father_name,trainee_mother_name,trainee_addmission_category,trainee_type,trainee_trade_name,trainee_trade_shift,trainee_trade_unit,trainee_minority_category,trainee_aadhar_no,trainee_qualification,trainee_mode,trainee_remarks from Trainee where trainee_session='"+jComboBox1.getSelectedItem().toString()+"' and lower(trainee_trade_name)=lower('"+jComboBox2.getSelectedItem().toString()+"')", new Object[]{"Session*","State_Registration_Number","Appliction_Form_Number*","Admission_Date*","Trainee_Name*","Mobile_Number","Email_ID","Date_Of_Birth*","Gender*","Category*","Horizontal_Category*","Father_Guardian_Name*","Mother_Name*","Admission_Given_in_Category*","Trainee_Type*","Trade*","Shift*","Unit*","Minority_Category*","UID_Number","Highest_Qualification","Is_Trainee_Dual_Mode","Remarks"}); 
        }
   
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void session_id_cbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_session_id_cbxItemStateChanged
        // TODO add your handling code here:
      
//      Object obj[]=setDataToComponent("select trainee_session,trainee_trade_name,trainee_father_name,trainee_mother_name,trainee_date_of_birth,trainee_gender,trainee_nationality,trainee_mobile_no,trainee_email,trainee_aadhar_no,trainee_address,trainee_qualification,trainee_category,trainee_horizontal_category,trainee_addmission_category,trainee_minority_category,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_trade_name,trainee_type,trainee_trade_shift,trainee_trade_unit,trainee_mode,trainee_remarks,trainee_name from Trainee where trainee_session_id='"+session_id_cbx.getSelectedItem().toString()+"' and trainee_session='"+new SimpleDateFormat("MMM-yyyy").format(jDateChooser3.getDate())+"'");
     try{
//      session.beginTransaction();
//      if(jDateChooser3.getDate()!=null ){
//      Trainee  t=session.load(Trainee.class,session_id_cbx.getSelectedItem().toString()+new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));        
//     // jDateChooser3.setDate(new SimpleDateFormat("MMM-yy").parse(t.getTrainee_session()));
//      trade_name.setText(t.getTrainee_trade_name());
//      trainee_fname.setText(t.getTrainee_father_name());
//      trainee_mname.setText(t.getTrainee_mother_name());
//      dob.setDate(t.getTrainee_date_of_birth());
//      trainee_gen.setSelectedItem(t.getTrainee_gender());
//      trainee_nationality.setSelectedItem(t.getTrainee_nationality());
//      trainee_mobile.setText(t.getTrainee_mobile_no());
//      trainee_email.setText(t.getTrainee_email());
//      trainee_aadhar.setText(t.getTrainee_aadhar_no());
//      trainee_address.setText(t.getTrainee_address());
//      trainee_qualification.setSelectedItem(t.getTrainee_qualification());
//      trainee_category.setSelectedItem(t.getTrainee_category());
//      trainee_hcategory.setSelectedItem(t.getTrainee_horizontal_category());
//      trainee_acategory.setSelectedItem(t.getTrainee_addmission_category());
//      trainee_mcategory.setSelectedItem(t.getTrainee_minority_category());
//      trainee_strn.setText(t.getTrainee_state_reg_no());
//      trainee_app_form_no.setText(t.getTrainee_app_form_no());
//      trainee_admission_date.setDate(t.getTrainee_admission_date());
//      trainee_trade.setSelectedItem(t.getTrainee_trade_name());
//      trainee_type.setSelectedItem(t.getTrainee_type());
//      trainee_shift.setText(t.getTrainee_trade_shift()+"");
//      trainee_unit.setText(t.getTrainee_trade_unit()+"");
//      trainee_dual_mode.setSelectedItem(t.getTrainee_mode());
//      trainee_remarks.setText(t.getTrainee_remarks());
//      trainee_name.setText(t.getTrainee_name());
//          System.out.println(t.getTrainee_photo());
//      if(t.getTrainee_photo()!=null)
//      photo_container.setIcon(new ImageIcon(new ImageIcon(t.getTrainee_photo()).getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH)));
//      else
//      photo_container.setIcon(null);
//      }else
//          reset_student_registration();
//      tx.commit();
     
//     new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate());
//     new SimpleDateFormat("MMM-yy").format(new Date());
     if(jDateChooser3.getDate()!=null)
     {
         Object obj[]=setDataToComponent("select trainee_session,trainee_trade_name,trainee_father_name,trainee_mother_name,trainee_date_of_birth,trainee_gender,trainee_nationality,trainee_mobile_no,trainee_email,trainee_aadhar_no,trainee_address,trainee_qualification,trainee_category,trainee_horizontal_category,trainee_addmission_category,trainee_minority_category,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_type,trainee_trade_shift,trainee_trade_unit,trainee_mode,trainee_remarks,trainee_name,trainee_photo from Trainee where trainee_session_id='"+session_id_cbx.getSelectedItem().toString()+"'");
        
         if(obj!=null){
             System.out.println(obj[0]);
             jDateChooser3.setDate(new SimpleDateFormat("MMM-yy").parse(obj[0]+""));
             trainee_trade.setSelectedItem(obj[1]+"");
             trainee_fname.setText(obj[2]+"");
             trainee_mname.setText(obj[3]+"");
             dob.setDate((Date)obj[4]);
             trainee_gen.setSelectedItem(obj[5]+"");
             trainee_nationality.setSelectedItem(obj[6]+"");
             trainee_mobile.setText(obj[7]+"");
             trainee_email.setText(obj[8]+"");
             trainee_aadhar.setText(obj[9]+"");
             trainee_address.setText(obj[10]+"");
             trainee_qualification.setSelectedItem(obj[11]+"");
             trainee_category.setSelectedItem(obj[12]+"");
             trainee_hcategory.setSelectedItem(obj[13]+"");
             trainee_acategory.setSelectedItem(obj[14]+"");
             trainee_mcategory.setSelectedItem(obj[15]+"");
             trainee_strn.setText(obj[16]+"");
             trainee_app_form_no.setText(obj[17]+"");
             trainee_admission_date.setDate((Date)obj[18]);
             trainee_type.setSelectedItem(obj[19]+"");
             trainee_shift.setText(obj[20]+"");
             trainee_unit.setText(obj[21]+"");
             trainee_dual_mode.setSelectedItem(obj[22]+"");
             trainee_remarks.setText(obj[23]+"");
             trainee_name.setText(obj[24]+"");
             byte b[]=(byte[])obj[25];
             photo_container.setIcon(new ImageIcon(new ImageIcon(b).getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH)));
         }
         else{
              trainee_name.setText(null);
    trainee_fname.setText(null);
    trainee_mname.setText(null);
    dob.setDate(null);
    trainee_gen.setSelectedIndex(0);
    trainee_nationality.setSelectedIndex(0);
    trainee_mobile.setText(null);
    trainee_email.setText(null);
    trainee_aadhar.setText(null);
    trainee_category.setSelectedIndex(0);
    trainee_hcategory.setSelectedIndex(0);
    trainee_acategory.setSelectedIndex(0);
    trainee_mcategory.setSelectedIndex(0);
    trainee_strn.setText(null);
    trainee_app_form_no.setText(null);
    trainee_admission_date.setDate(new Date());
    trainee_trade.setSelectedIndex(0);
    trainee_type.setSelectedIndex(0);
    trainee_shift.setText(null);
    trainee_unit.setText(null);
    trainee_dual_mode.setSelectedIndex(0);
    trainee_remarks.setText(null);
    trainee_qualification.setSelectedIndex(0);
    photo_location.setText(null);
    photo_container.setText(null);
    photo_container.setIcon(null);
    jDateChooser3.setDate(new Date());
   
         }
     }
     
     }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
     }
                  
    }//GEN-LAST:event_session_id_cbxItemStateChanged

    private void session_id_cbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_session_id_cbxKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_session_id_cbxKeyReleased

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
//        Object obj[]=setDataToComponent("select trainee_session,trainee_trade_name,trainee_father_name,trainee_mother_name,trainee_date_of_birth,trainee_gender,trainee_nationality,trainee_mobile_no,trainee_email,trainee_aadhar_no,trainee_address,trainee_qualification,trainee_category,trainee_horizontal_category,trainee_addmission_category,trainee_minority_category,trainee_state_reg_no,trainee_app_form_no,trainee_admission_date,trainee_trade_name,trainee_type,trainee_trade_shift,trainee_trade_unit,trainee_mode,trainee_remarks from Trainee where trainee_session_id='"+jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0).toString()+"'");
//      jDateChooser3.setDate((Date)obj[0]);
//      trade_name.setText(obj[1]+"");
//      trainee_fname.setText(obj[2]+"");
//      trainee_mname.setText(obj[3]+"");
//      dob.setDate((Date)obj[4]);
//      trainee_gen.setSelectedItem(obj[5]+"");
//      trainee_nationality.setSelectedItem(obj[6]+"");
//      trainee_mobile.setText(obj[7]+"");
//      trainee_email.setText(obj[8]+"");
//      trainee_aadhar.setText(obj[9]+"");
//      trainee_address.setText(obj[10]+"");
//      trainee_qualification.setSelectedItem(obj[11]+"");
//      trainee_category.setSelectedItem(obj[12]+"");
//      trainee_hcategory.setSelectedItem(obj[13]+"");
//      trainee_acategory.setSelectedItem(obj[14]+"");
//      trainee_mcategory.setSelectedItem(obj[15]+"");
//      trainee_strn.setText(obj[16]+"");
//      trainee_app_form_no.setText(obj[17]+"");
//      trainee_admission_date.setDate((Date)obj[18]);
//      trainee_trade.setSelectedItem(obj[19]+"");
//      trainee_type.setSelectedItem(obj[20]+"");
//      trainee_shift.setText(obj[21]+"");
//      trainee_unit.setText(obj[22]+"");
//      trainee_dual_mode.setSelectedItem(obj[23]+"");
//      trainee_remarks.setText(obj[24]+"");
    }//GEN-LAST:event_jTable4MouseClicked

    private void session_id_cbxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_session_id_cbxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_session_id_cbxFocusGained

    private void session_id_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_session_id_cbxActionPerformed
        // TODO add your handling code here:
//    session.beginTransaction();
//   FileUpload fu=session.load(FileUpload.class,session_id_cbx.getSelectedItem().toString());  
//        photo_container.setIcon(new ImageIcon(new ImageIcon(fu.getPhoto()).getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH)));
//    tx.commit();
   // photo_container.setIcon(new ImageIcon(new ImageIcon("StudentsImages\\"+session_id_cbx.getSelectedItem().toString()+".jpg").getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_session_id_cbxActionPerformed

    private void fee_discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fee_discountKeyReleased
        // TODO add your handling code here:
       if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty() && Float.parseFloat(jLabel122.getText())>0)
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Float.parseFloat(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_fee_discountKeyReleased

    private void fee_tradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fee_tradeItemStateChanged
        // TODO add your handling code here:
       Query query2=session.createQuery("select trade_id from Trade where trade_name='"+fee_trade.getSelectedItem()+"' and trade_session='"+TRAINEE_SESSION+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          trade_id=(String)i.next();
    }//GEN-LAST:event_fee_tradeItemStateChanged

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         JFileChooser fc=new JFileChooser();
        int state=fc.showOpenDialog(this);
        if(state==JFileChooser.APPROVE_OPTION){
           fc.getSelectedFile().getAbsolutePath();
        uploadHoliday(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        int state=fc.showOpenDialog(this);
        if(state==JFileChooser.APPROVE_OPTION){
           fc.getSelectedFile().getAbsolutePath();
        uploadBank(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//         File file=new File("cpiti.lock");
//        if(file.exists())
//            file.delete(); 
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void reports_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reports_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        report_pnl.setVisible(true);
        reset_button_color();
        reports_btn.setBackground(Color.ORANGE);
        addDataToTree("select trainee_session_id from Trainee", jTree1);
    }//GEN-LAST:event_reports_btnActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        Object obj[]=setDataToComponent("select holiday_name,holiday_date,day_id from Holidays where holiday_name=\'"+jTable3.getModel().getValueAt(jTable3.getSelectedRow(), 0).toString()+"\'");
        holiday_name.setText(obj[0]+"");
        holiday_date.setDate((Date)obj[1]);
        day_id=(Integer)obj[2];
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
       
        try{
        JFileChooser fc=new JFileChooser();
 
        int i=fc.showSaveDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            String fileName;
            if(!fc.getSelectedFile().getAbsolutePath().endsWith(".xlsx"))
            fileName=fc.getSelectedFile().getAbsolutePath()+".xlsx";
            else
            fileName=fc.getSelectedFile().getAbsolutePath();   
           
        if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0&&jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null)
           generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
            // System.out.println("1");
        else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0){
            if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null)// System.out.println("2");
        generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)  and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
            else //System.out.println("3");
        generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id AND LOWER(t.trainee_trade_name)=lower(trade.trade_name)   and  lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
        }else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0){
             if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null) //System.out.println("4");
        generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
             else //System.out.println("5");
        generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
        }else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0){
             if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null) //System.out.println("6");
        generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"') and f.fee_cheque_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
        else //System.out.println("7");
         generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_trade_semester,f.fee_remarks from Fee_Details  f ,Trainee  t,Trade  trade where t.trainee_session_id=f.fee_trainee_session_id  and t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' AND LOWER(t.trainee_trade_name)=lower(trade.trade_name) and lower(trade.trade_name)=lower('"+jComboBox4.getSelectedItem().toString()+"')", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
        }
        
        else
            generateDataforExcel1(fileName, "Fee_Details","select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks from Trainee t, Fee_Details f where f.fee_trainee_session_id=t.trainee_session_id", new Object[]{"Receipt no","Session ID","Trainee Name","Paid Amount","Balance Amount","Discount","Payment Date","Semester","Remark"}); 
 
        }
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        JFileChooser fc=new JFileChooser();
        int c=fc.showSaveDialog(this);
        if(c==JFileChooser.APPROVE_OPTION){
            try { int count=listFiles("StudentsImages",jLabel67.getText()+"_").length+1;
                String ext = null;
                String s = fc.getSelectedFile().getName();
                int i=fc.getSelectedFile().getName().lastIndexOf('.');
                if (i > 0 &&  i < s.length() - 1) {
                ext ="_("+count+")."+s.substring(i+1).toLowerCase();
                 }
                
                copyFileUsingJava7Files(new File(fc.getSelectedFile().getAbsolutePath()), new File("StudentsImages\\"+jLabel67.getText()+ext));
                model.insertNodeInto(new DefaultMutableTreeNode(jLabel67.getText()+ext), selectedNode, selectedNode.getChildCount());
                jLabel67.setText(null);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

        // addDataToTree("select trainee_session_id from Trainee", jTree1);
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
       // fireDocumentChangeEvent();
        // DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)jTree1.getSelectionPath();
        //DefaultMutableTreeNode root=(DefaultMutableTreeNode)jTree1.getModel().getRoot();
       //searchTree(jTree1,new TreePath(new DefaultMutableTreeNode(jTextField1.getText())),jTextField1.getText());
        
        String q = jTextField1.getText();

        TreePath root = jTree1.getPathForRow(0);
        collapseAll(jTree1, root);
        if (!q.isEmpty()) {
            searchTree(jTree1, root, q);
        }
      


       // System.out.println(find(root,jTextField1.getText()));
       // expandAllNodes(jTree1, 0, jTree1.getRowCount());
       // jTree1.expandPath(new TreePath(new DefaultMutableTreeNode(jTextField1.getText()).getPath()));
                   
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        // TODO add your handling code here:
       //  DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        jLabel67.setText(selectedNode.toString());
    }//GEN-LAST:event_jTree1ValueChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
        // TODO add your handling code here:
        if(jCheckBox9.isSelected()){
           jComboBox13.setSelectedItem(jComboBox12.getSelectedItem());
           jDateChooser8.setDate(jDateChooser7.getDate());
           jTextField14.setText(jTextField10.getText());
           jTextField15.setText(jTextField11.getText());
           jTextField16.setText(jTextField12.getText());
           jTextField17.setText(jTextField13.getText());
        }else{
            jComboBox13.setSelectedIndex(0);
            jDateChooser8.setDate(null);
            jTextField14.setText(null);
            jTextField15.setText(null);
            jTextField16.setText(null);
            jTextField17.setText(null);
        }
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void attendance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        attendance_pnl.setVisible(true);
        reset_button_color();
        attendance_btn.setBackground(Color.ORANGE);
        jDateChooser9.setDate(new Date());
        if(jDateChooser9.getDate()!=null){
       Object obj[]=setDataToComponent("select attendence_instructor_uid,attendence_status from Attendence where attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'");
            System.out.println("obj="+obj);
       if(obj==null)
        getTableData("select instructor_uid,instructor_name from Instructor", jTable6);
       else
        getTableData("select a.attendence_instructor_uid,i.instructor_name,a.attendence_status from Instructor i,Attendence a where i.instructor_uid=a.attendence_instructor_uid and attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'", jTable6);
        }
    }//GEN-LAST:event_attendance_btnActionPerformed

    private void staff_salary_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_salary_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        salary_pnl.setVisible(true);
        reset_button_color();
        staff_salary_btn.setBackground(Color.ORANGE);
        reset_salary();
        getDataInCombo("select instructor_uid from Instructor", jComboBox15);
    }//GEN-LAST:event_staff_salary_btnActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        jTextField21.setText(null);
        jPasswordField1.setText(null);
        jTextField21.requestFocusInWindow();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
       reset_salary();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(jComboBox5.getSelectedIndex()!=0)
               if(!jTextField4.getText().isEmpty())
               if(jComboBox8.getSelectedIndex()!=0)
               if(jDateChooser6.getDate()!=null)
               if(jComboBox6.getSelectedIndex()!=0)
               if(jComboBox9.getSelectedIndex()!=0)
               if(!jTextField2.getText().isEmpty())
               if(!jTextField5.getText().isEmpty())
               if(!jTextField6.getText().isEmpty())
               if(jLabel101.getIcon()!=null)
               if(!jTextField3.getText().isEmpty())
               if(!jTextField7.getText().isEmpty())
               if(jComboBox10.getSelectedIndex()!=0)
               if(jComboBox11.getSelectedIndex()!=0)
               if(jComboBox12.getSelectedIndex()!=0){
        session.beginTransaction();
        Instructor in=new Instructor();
        in.setInstructor_uid(jComboBox5.getSelectedItem().toString());
        in.setInstructor_name(jTextField4.getText());
        in.setInstructor_dob(jDateChooser6.getDate());
        in.setInstructor_gender(jComboBox8.getSelectedItem().toString());
        in.setMarital_status(jComboBox6.getSelectedItem().toString());
        in.setInstructor_category(jComboBox9.getSelectedItem().toString());
        in.setInsructor_language(jTextField2.getText());
        in.setInstructor_father_husband(jTextField5.getText());
        in.setInstructor_blood_grp(jComboBox7.getSelectedItem().toString());
        in.setGpf_epf_no(jTextField6.getText());
        File file = new File(jLabel82.getText());
        byte[] b = new byte[(int) file.length()];
        try{
        FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);}catch(Exception e){}
        in.setInstructor_photo(b);
        in.setMobile_no(jTextField3.getText());
        in.setInstructor_mail(jTextField7.getText());
        in.setInstructor_address(jTextArea1.getText());
        in.setInstructor_state(jComboBox10.getSelectedItem().toString());
        in.setInstructor_district(jComboBox11.getSelectedItem().toString());
        in.setInstructor_pincode(jTextField8.getText());
        in.setInstructor_home_no(jTextField9.getText());
        in.setInstructor_qualification(jComboBox12.getSelectedItem().toString());
        in.setInstructor_passing_year(new SimpleDateFormat("yyyy").format(jDateChooser7.getDate()));
        in.setBoard_name(jTextField10.getText());
        in.setBoard_grade(jTextField12.getText());
        in.setBoard_subjects(jTextField11.getText());
        in.setPercentage(Float.parseFloat(jTextField13.getText()));
        in.setInstructor_tech_qualification(jComboBox13.getSelectedItem().toString());
        in.setInstructor_tech_passing_year(new SimpleDateFormat("yyyy").format(jDateChooser8.getDate()));
        in.setBoard_tech_name(jTextField14.getText());
        in.setBoard_tech_grade(jTextField16.getText());
        in.setBoard_tech_subjects(jTextField15.getText());
        in.setTech_percentage(Float.parseFloat(jTextField17.getText()));
        session.save(in);
        tx.commit();
        session.beginTransaction();
        Attendence a=new Attendence();
        a.setAttendence_instructor_uid(jComboBox5.getSelectedItem().toString());
        a.setAttendence_status(false);
        tx.commit();
        JOptionPane.showMessageDialog(null,"Instructor Details Added!");
        reset_instructor();
        }
        else
                   JOptionPane.showMessageDialog(null, "Enter Qualification");
        else
                   JOptionPane.showMessageDialog(null, "Select District");
        else
                   JOptionPane.showMessageDialog(null, "Select State");
        else
                   JOptionPane.showMessageDialog(null, "Enter Email Address");
        else
                   JOptionPane.showMessageDialog(null, "Enter Mobile Number");
               else
                   JOptionPane.showMessageDialog(null, "Select Photo ");
               else
                   JOptionPane.showMessageDialog(null, "Enter GPF/EFT Number");
        else
                   JOptionPane.showMessageDialog(null, "Enter Father/Husband Name");
        else
                   JOptionPane.showMessageDialog(null, "Enter Language Known");
        else
                   JOptionPane.showMessageDialog(null, "Select Instructor Category");
        else
                   JOptionPane.showMessageDialog(null, "Enter Marital Status");
        else
                   JOptionPane.showMessageDialog(null, "Enter Date of Birth");
               else
                   JOptionPane.showMessageDialog(null, "Select Gender");
        else
                   JOptionPane.showMessageDialog(null, "Enter Name");
        else
                   JOptionPane.showMessageDialog(null, "Enter Aadhar UID");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        FileFilter imageFilter=new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fc.setFileFilter(imageFilter);
        int c=fc.showOpenDialog(this);
        if(c==JFileChooser.APPROVE_OPTION){
            jLabel82.setText(fc.getSelectedFile().getAbsolutePath());
            jLabel101.setIcon(new ImageIcon(new ImageIcon(fc.getSelectedFile().getAbsolutePath()).getImage().getScaledInstance(jLabel101.getWidth(), jLabel101.getHeight(),Image.SCALE_SMOOTH)));
        }
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(jComboBox5.getSelectedIndex()!=0)
               if(!jTextField4.getText().isEmpty())
               if(jComboBox8.getSelectedIndex()!=0)
               if(jDateChooser6.getDate()!=null)
               if(jComboBox6.getSelectedIndex()!=0)
               if(jComboBox9.getSelectedIndex()!=0)
               if(!jTextField2.getText().isEmpty())
               if(!jTextField5.getText().isEmpty())
               if(!jTextField6.getText().isEmpty())
               if(jLabel101.getIcon()!=null)
               if(!jTextField3.getText().isEmpty())
               if(!jTextField7.getText().isEmpty())
               if(jComboBox10.getSelectedIndex()!=0)
               if(jComboBox11.getSelectedIndex()!=0)
               if(jComboBox12.getSelectedIndex()!=0){
         session.beginTransaction();
        Instructor in=session.load(Instructor.class,jComboBox5.getSelectedItem().toString());
      //  in.setInstructor_uid(jComboBox5.getSelectedItem().toString());
        in.setInstructor_name(jTextField4.getText());
        in.setInstructor_dob(jDateChooser6.getDate());
        in.setInstructor_gender(jComboBox8.getSelectedItem().toString());
        in.setMarital_status(jComboBox6.getSelectedItem().toString());
        in.setInstructor_category(jComboBox9.getSelectedItem().toString());
        in.setInsructor_language(jTextField2.getText());
        in.setInstructor_father_husband(jTextField5.getText());
        in.setInstructor_blood_grp(jComboBox7.getSelectedItem().toString());
        in.setGpf_epf_no(jTextField6.getText());
        if(jLabel82.getText()!=null){
        try{
            File file = new File(jLabel82.getText());
        byte[] b = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);
        in.setInstructor_photo(b);}catch(Exception e){}
        }
        in.setMobile_no(jTextField3.getText());
        in.setInstructor_mail(jTextField7.getText());
        in.setInstructor_address(jTextArea1.getText());
        in.setInstructor_state(jComboBox10.getSelectedItem().toString());
        in.setInstructor_district(jComboBox11.getSelectedItem().toString());
        in.setInstructor_pincode(jTextField8.getText());
        in.setInstructor_home_no(jTextField9.getText());
        in.setInstructor_qualification(jComboBox12.getSelectedItem().toString());
        in.setInstructor_passing_year(new SimpleDateFormat("yyyy").format(jDateChooser7.getDate()));
        in.setBoard_name(jTextField10.getText());
        in.setBoard_grade(jTextField12.getText());
        in.setBoard_subjects(jTextField11.getText());
        in.setPercentage(Float.parseFloat(jTextField13.getText()));
        in.setInstructor_tech_qualification(jComboBox13.getSelectedItem().toString());
        in.setInstructor_tech_passing_year(new SimpleDateFormat("yyyy").format(jDateChooser8.getDate()));
        in.setBoard_tech_name(jTextField14.getText());
        in.setBoard_tech_grade(jTextField16.getText());
        in.setBoard_tech_subjects(jTextField15.getText());
        in.setTech_percentage(Float.parseFloat(jTextField17.getText()));
        session.update(in);
        tx.commit();
        JOptionPane.showMessageDialog(null,"Instructor Details Updated!");
        reset_instructor();
        }
        else
                   JOptionPane.showMessageDialog(null, "Enter Qualification");
        else
                   JOptionPane.showMessageDialog(null, "Select District");
        else
                   JOptionPane.showMessageDialog(null, "Select State");
        else
                   JOptionPane.showMessageDialog(null, "Enter Email Address");
        else
                   JOptionPane.showMessageDialog(null, "Enter Mobile Number");
               else
                   JOptionPane.showMessageDialog(null, "Select Photo ");
               else
                   JOptionPane.showMessageDialog(null, "Enter GPF/EFT Number");
        else
                   JOptionPane.showMessageDialog(null, "Enter Father/Husband Name");
        else
                   JOptionPane.showMessageDialog(null, "Enter Language Known");
        else
                   JOptionPane.showMessageDialog(null, "Select Instructor Category");
        else
                   JOptionPane.showMessageDialog(null, "Enter Marital Status");
        else
                   JOptionPane.showMessageDialog(null, "Enter Date of Birth");
               else
                   JOptionPane.showMessageDialog(null, "Select Gender");
        else
                   JOptionPane.showMessageDialog(null, "Enter Name");
        else
                   JOptionPane.showMessageDialog(null, "Enter Aadhar UID");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        view_instructor_detail.setVisible(true);
        getTableData("select instructor_uid,instructor_name,instructor_father_husband,insructor_language,mobile_no,instructor_mail,gpf_epf_no,instructor_home_no,instructor_qualification from Instructor", jTable8);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        // TODO add your handling code here:
   
        try{ session.beginTransaction();
        Instructor in=session.get(Instructor.class,jComboBox5.getSelectedItem().toString());
        if(in!=null){
        jTextField4.setText(in.getInstructor_name());
        jDateChooser6.setDate(in.getInstructor_dob());
        jComboBox8.setSelectedItem(in.getInstructor_gender());
        jComboBox6.setSelectedItem(in.getMarital_status());
        jComboBox9.setSelectedItem(in.getInstructor_category());
        jTextField2.setText(in.getInsructor_language());
        jTextField5.setText(in.getInstructor_father_husband());
        jComboBox7.setSelectedItem(in.getInstructor_blood_grp());
        jTextField6.setText(in.getGpf_epf_no());
        jLabel101.setIcon(new ImageIcon(new ImageIcon(in.getInstructor_photo()).getImage().getScaledInstance(jLabel101.getWidth(), jLabel101.getHeight(),Image.SCALE_SMOOTH)));
        jTextField3.setText(in.getMobile_no());
        jTextField7.setText(in.getInstructor_mail());
        jTextArea1.setText(in.getInstructor_address());
        jTextField10.setText(in.getInstructor_state());
        jTextField11.setText(in.getInstructor_district());
        jTextField8.setText(in.getInstructor_pincode());
        jTextField9.setText(in.getInstructor_home_no());
        jComboBox12.setSelectedItem(in.getInstructor_qualification());
        jDateChooser7.setDate(new SimpleDateFormat("yyyy").parse(in.getInstructor_passing_year()));
        jTextField10.setText(in.getBoard_name());
        jTextField11.setText(in.getBoard_subjects());
        jTextField12.setText(in.getBoard_grade());
        jTextField13.setText(in.getPercentage()+"");
        jComboBox13.setSelectedItem(in.getInstructor_tech_qualification());
        jDateChooser8.setDate(new SimpleDateFormat("yyyy").parse(in.getInstructor_tech_passing_year()));
        jTextField14.setText(in.getBoard_tech_name());
        jTextField15.setText(in.getBoard_tech_subjects());
        jTextField16.setText(in.getBoard_tech_grade());
        jTextField17.setText(in.getTech_percentage()+"");
        tx.commit();
        }else{
        
    jDateChooser6.setDate(null);
    jComboBox6.setSelectedIndex(0);
    jTextField2.setText(null);
    jComboBox7.setSelectedIndex(0);
    jLabel82.setText("No Image Selected");
    jTextField3.setText(null);
    jTextArea1.setText(null);
    jComboBox10.setSelectedIndex(0);
    jComboBox11.setSelectedIndex(0);
    jTextField8.setText(null);
    jTextField9.setText(null);
    jTextField4.setText(null);
    jComboBox8.setSelectedIndex(0);
    jComboBox9.setSelectedIndex(0);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jTextField7.setText(null);
    jComboBox12.setSelectedIndex(0);
    jDateChooser7.setDate(null);
    jTextField10.setText(null);
    jTextField11.setText(null);
    jTextField12.setText(null);
    jTextField13.setText(null);
    jComboBox13.setSelectedIndex(0);
    jDateChooser8.setDate(null);
    jTextField14.setText(null);
    jTextField15.setText(null);
    jTextField16.setText(null);
    jTextField17.setText(null);
    jTextField22.setText(null);
    jLabel101.setIcon(null);
    
        }
        }catch(Exception e){}
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
       long count=0; 
    //  Object obj[]=setDataToComponent("select  count(*) from Attendence where attendence_status='true' and attendence_instructor_uid='"+jComboBox15.getSelectedItem().toString()+"' and MONTH(attendence_date)="+Integer.parseInt(new SimpleDateFormat("MM").format(jDateChooser10.getDate())));
      session.beginTransaction();
    Query query2=session.createQuery("select  count(*) from Attendence where attendence_status='true' and attendence_instructor_uid='"+jComboBox15.getSelectedItem().toString()+"' and MONTH(attendence_date)="+Integer.parseInt(new SimpleDateFormat("MM").format(jDateChooser10.getDate())));
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
        count=(Long)i.next();
        tx.commit();
      
        
       session.beginTransaction(); 
       Salary s=new Salary();
       s.setSalary_instructor_uid(jComboBox15.getSelectedItem().toString());
       s.setPayment_date(jDateChooser10.getDate());
       s.setInstructor_salary(Float.parseFloat(jTextField19.getText())-Float.parseFloat(jTextField19.getText())*count/30);
       s.setPayment_mode(jComboBox14.getSelectedItem().toString());
       session.save(s);
       tx.commit();
       JOptionPane.showMessageDialog(null,"Salary Submitted");
       reset_salary();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // TODO add your handling code here:
//        session.beginTransaction();
//        Salary s=session.load(Salary.class,jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString());
//        jComboBox15.setSelectedItem(jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString());
//        jDateChooser10.setDate(s.getPayment_date());
//        jTextField19.setText(s.getInstructor_salary()+"");
//        jComboBox14.setSelectedItem(s.getPayment_mode());
//        tx.commit();
//        session.beginTransaction();
//        Instructor in=session.load(Instructor.class,jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString());
//        jTextField18.setText(in.getInstructor_name());
//        tx.commit();
        Object obj[]=setDataToComponent("select i.instructor_uid,s.payment_date,i.instructor_name,s.instructor_salary,s.payment_mode from Instructor i,Salary s where i.instructor_uid=s.salary_instructor_uid and s.salary_instructor_uid='"+jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString()+"'");
        jComboBox15.setSelectedItem(obj[0]+"");
        jDateChooser10.setDate((Date)obj[1]);
        jTextField18.setText(obj[2]+"");
        jTextField19.setText(obj[3]+"");
        jComboBox14.setSelectedItem(obj[4]+"");
    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        long count=0; 
    //  Object obj[]=setDataToComponent("select  count(*) from Attendence where attendence_status='true' and attendence_instructor_uid='"+jComboBox15.getSelectedItem().toString()+"' and MONTH(attendence_date)="+Integer.parseInt(new SimpleDateFormat("MM").format(jDateChooser10.getDate())));
      session.beginTransaction();
    Query query2=session.createQuery("select  count(*) from Attendence where attendence_status='true' and attendence_instructor_uid='"+jComboBox15.getSelectedItem().toString()+"' and MONTH(attendence_date)="+Integer.parseInt(new SimpleDateFormat("MM").format(jDateChooser10.getDate())));
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
        count=(Long)i.next();
        tx.commit();
        
       session.beginTransaction();
       Salary s=session.load(Salary.class,jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString());
        s.setSalary_instructor_uid(jComboBox15.getSelectedItem().toString());
       s.setPayment_date(jDateChooser10.getDate());
       s.setInstructor_salary(Float.parseFloat(jTextField19.getText())-Float.parseFloat(jTextField19.getText())*count/30);
       s.setPayment_mode(jComboBox14.getSelectedItem().toString());
       session.update(s);
       tx.commit();
       JOptionPane.showMessageDialog(null,"Salary Submitted");
       reset_salary();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
       session.beginTransaction();
       Salary s=session.load(Salary.class,jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 0).toString());
       session.delete(s);
       tx.commit();
       JOptionPane.showMessageDialog(null,"Salary Submitted");
       reset_salary();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jComboBox15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox15ItemStateChanged
        // TODO add your handling code here:
        try{
        if(jComboBox15.getSelectedItem().toString()!=null){
        session.beginTransaction();
        Instructor in=session.load(Instructor.class,jComboBox15.getSelectedItem().toString());
        jTextField18.setText(in.getInstructor_name());
        tx.commit();
        }
        }catch(Exception e){}
//        Object obj[]=setDataToComponent("select instructor_name from Instructor where instructor_uid='"+jComboBox15.getSelectedItem().toString()+"'");
//        jTextField19.setText(obj[0]+"");
    }//GEN-LAST:event_jComboBox15ItemStateChanged

    private void jDateChooser9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser9PropertyChange
        // TODO add your handling code here:
        if(jDateChooser9.getDate()!=null){
       Object obj[]=setDataToComponent("select attendence_instructor_uid,attendence_status from Attendence where attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'");
            System.out.println("obj="+obj);
       if(obj==null)
        getTableData("select instructor_uid,instructor_name from Instructor", jTable6);
       else
        getTableData("select a.attendence_instructor_uid,i.instructor_name,a.attendence_status from Instructor i,Attendence a where i.instructor_uid=a.attendence_instructor_uid and attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'", jTable6);
        }
//        if(jDateChooser9.getDate()!=null)
//        getTableData("select a.attendence_instructor_uid,i.instructor_name,a.attendence_status from Instructor i,Attendence a where i.instructor_uid=a.attendence_instructor_uid and attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'", jTable6);
    }//GEN-LAST:event_jDateChooser9PropertyChange

    private void jTextField20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyReleased
        // TODO add your handling code here:
        getTableData("select i.instructor_uid,i.instructor_name,s.instructor_salary,s.payment_mode from Instructor i,Salary s where i.instructor_uid=s.salary_instructor_uid and i.instructor_name like '%"+jTextField20.getText()+"%' or i.instructor_uid like '%"+jTextField20.getText()+"%'", jTable7);
    }//GEN-LAST:event_jTextField20KeyReleased

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
      int s=0;  try{
       // Object obj[]=setDataToComponent("select a.attendence_id from Attendence a where a.attendence_instructor_uid='"+jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 0).toString()+"' and attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'");
         session.beginTransaction();
    Query query2=session.createQuery("select a.attendence_id from Attendence a where a.attendence_instructor_uid='"+jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 0).toString()+"' and attendence_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser9.getDate())+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
        s=(Integer)i.next();
        tx.commit();
        boolean bool=Boolean.valueOf(jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 2).toString());
        String id=jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 0).toString();
            
        session.beginTransaction();
        if(s==0){
        Attendence a=new Attendence();
//        a.setAttendence_id((Integer)obj[0]);
        a.setAttendence_instructor_uid(id);
        a.setAttendence_date(jDateChooser9.getDate());
        a.setAttendence_status(bool);
        session.save(a);
        }else{
         Attendence a=session.load(Attendence.class,s);
          a.setAttendence_instructor_uid(id);
        a.setAttendence_date(jDateChooser9.getDate());
        a.setAttendence_status(bool);
        session.update(a);
        }
        tx.commit();}catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jTable6MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        try{
        JFileChooser fc=new JFileChooser();
        int state=fc.showOpenDialog(this);
        if(state==JFileChooser.APPROVE_OPTION){
           fc.getSelectedFile().getAbsolutePath();
             Object obj[][]=new ReadExceldemo().uploadFile( fc.getSelectedFile().getAbsolutePath(),"Fee Details", null);
             for(int x=1;x<obj.length;x++){
                 session.beginTransaction();
                 Fee_Details f=new Fee_Details();
                 for(int y=0;y<obj[0].length;y++)
                 { 
                   switch(y){
                       case 0:if(!(obj[x][y]+"").isEmpty())
                           f.setFee_receipt_no(obj[x][y]+"");
                       else{
                           JOptionPane.showMessageDialog(null,"Fee Receipt no is Empty");
                           break;}
                           System.out.print(obj[x][y]+" \t");
                           break;
                       case 1:if(obj[x][y]!=null)
                           f.setFee_trainee_session_id(obj[x][y]+"");
                       else
                           f.setFee_trainee_session_id(null);
                            System.out.print(obj[x][y]+" \t");
                           break;
                       case 3:if(obj[x][y]!=null)
                           f.setFee_amount(Double.parseDouble(obj[x][y]+""));
                       else
                           f.setFee_amount(0);
                           System.out.print(Double.parseDouble(obj[x][y]+"")+"\t");
                           break;
                       case 4:
                           if(obj[x][y] instanceof Date)
                           f.setFee_cheque_date((Date)obj[x][y]);
                           else
                           f.setFee_cheque_date(null);System.out.print((Date)obj[x][y]+ " \t");
                           break;
                      case 5://if(obj[x][y]!=null)
//                           f.setBalance(Double.parseDouble(obj[x][y]+""));
//                       else
//                           f.setBalance(0);
                           System.out.print(obj[x][y]+"" +" \t");
                           break;
                       case 6:if(obj[x][y]!=null)
                           f.setFee_disc(Float.parseFloat(obj[x][y]+""));
                       else
                           f.setFee_disc(0);
                       System.out.print(obj[x][y]+"");
                           break;
                       case 7:if(obj[x][y]!=null)
                           f.setPayment_mode(obj[x][y]+"");
                       else
                           f.setPayment_mode(null);
                       System.out.print(obj[x][y]+"");
                           break;
                       case 8:if(obj[x][y]!=null)
                           f.setFee_trade_semester(Integer.parseInt(obj[x][y]+""));
                       else
                           f.setFee_trade_semester(0);
                       System.out.print(obj[x][y]+"");
                           break;
                       case 9:if(obj[x][y]!=null)
                           f.setFee_remarks(obj[x][y]+"");
                       else
                           f.setFee_remarks(null);
                       System.out.print(obj[x][y]+"");
                           break;
                   }
                 }
                 session.save(f);
                 tx.commit();
             }
             JOptionPane.showMessageDialog(null, "Fee Data Imported!");
        }
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e+"\n  Excel Sheet Name Must Be \"Fee Details\"");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
       // System.out.println(jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 11).toString());
        if(jTable4.getSelectedRow()!=-1)
        createPdf(jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 11).toString());
        else
        JOptionPane.showMessageDialog(null, "Select row or ID first!");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        
        try{
        String id="Admin";     
        session.beginTransaction();
        Login ln=session.load(Login.class,jTextField21.getText());
        ln.getPassword();
        ln.getUserId();
        createdBy=ln.getUserId()+" ("+ln.getUserName()+")";

            if(ln.getUserId().equalsIgnoreCase(jTextField21.getText())&& new String(jPasswordField1.getPassword()).equals(new String(ln.getPassword()))){
                 jCheckBox10.setEnabled(false);
                if(id.equalsIgnoreCase(jTextField21.getText()))
                {  login_value=true;
                    reports_btn1.setEnabled(true);
                    trade_btn.setEnabled(true);
                    staff_manage_btn.setEnabled(true);
                    bank_details_btn.setEnabled(true);
                    holiday_btn.setEnabled(true);
                    reports_btn.setEnabled(true);
                    staff_salary_btn.setEnabled(true);
                    attendance_btn.setEnabled(true);
                    jButton40.setEnabled(true);
                    jButton39.setEnabled(true); 
                    daybook_btn.setEnabled(true);
                    jCheckBox10.setEnabled(true);

                }

            student_registration_btn.setEnabled(true);
            student_fee_btn.setEnabled(true);

            jTextField21.setEnabled(false);
            jPasswordField1.setEnabled(false);
            jButton33.setEnabled(false);
            jButton32.setEnabled(false);
            jButton33ActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect UserId or Password!", "Error", 0);

            }
            tx.commit();
            
        }catch(Exception e){JOptionPane.showMessageDialog(null,e, "Error", 0);}
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange
        // TODO add your handling code here:
       try{
       session.beginTransaction();
       if(jDateChooser3.getDate()!=null){
      Trainee  t=session.load(Trainee.class,session_id_cbx.getSelectedItem().toString()+new SimpleDateFormat("MMM-yy").format(jDateChooser3.getDate()));
            
     // jDateChooser3.setDate(new SimpleDateFormat("MMM-yy").parse(t.getTrainee_session()));
      trade_name.setText(t.getTrainee_trade_name());
      trainee_fname.setText(t.getTrainee_father_name());
      trainee_mname.setText(t.getTrainee_mother_name());
      dob.setDate(t.getTrainee_date_of_birth());
      trainee_gen.setSelectedItem(t.getTrainee_gender());
      trainee_nationality.setSelectedItem(t.getTrainee_nationality());
      trainee_mobile.setText(t.getTrainee_mobile_no());
      trainee_email.setText(t.getTrainee_email());
      trainee_aadhar.setText(t.getTrainee_aadhar_no());
      trainee_address.setText(t.getTrainee_address());
      trainee_qualification.setSelectedItem(t.getTrainee_qualification());
      trainee_category.setSelectedItem(t.getTrainee_category());
      trainee_hcategory.setSelectedItem(t.getTrainee_horizontal_category());
      trainee_acategory.setSelectedItem(t.getTrainee_addmission_category());
      trainee_mcategory.setSelectedItem(t.getTrainee_minority_category());
      trainee_strn.setText(t.getTrainee_state_reg_no());
      trainee_app_form_no.setText(t.getTrainee_app_form_no());
      trainee_admission_date.setDate(t.getTrainee_admission_date());
      trainee_trade.setSelectedItem(t.getTrainee_trade_name());
      trainee_type.setSelectedItem(t.getTrainee_type());
      trainee_shift.setText(t.getTrainee_trade_shift()+"");
      trainee_unit.setText(t.getTrainee_trade_unit()+"");
      trainee_dual_mode.setSelectedItem(t.getTrainee_mode());
      trainee_remarks.setText(t.getTrainee_remarks());
      trainee_name.setText(t.getTrainee_name());
      if(t.getTrainee_photo()!=null)
      photo_container.setIcon(new ImageIcon(new ImageIcon(t.getTrainee_photo()).getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH)));
      else
      photo_container.setIcon(null);
       }
       else{
          reset_student_registration(); 
       }
       tx.commit();}catch(Exception e){}
    }//GEN-LAST:event_jDateChooser3PropertyChange

    private void jTextField23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyReleased
        // TODO add your handling code here:
       
       
        jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField23KeyReleased

    private void jTextField24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyReleased
        // TODO add your handling code here:
        try{ 
        jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        }catch(Exception e){}
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField24KeyReleased

    private void jTextField25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyReleased
        // TODO add your handling code here:
       jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField25KeyReleased

    private void jTextField26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyReleased
        // TODO add your handling code here:
       jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField26KeyReleased

    private void jTextField27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyReleased
        // TODO add your handling code here:
      jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField27KeyReleased

    private void jTextField28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyReleased
        // TODO add your handling code here:
      jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField28KeyReleased

    private void jTextField29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyReleased
        // TODO add your handling code here:
       jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField29KeyReleased

    private void jTextField30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField30KeyReleased
        // TODO add your handling code here:
      jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField30KeyReleased

    private void jTextField31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyReleased
        // TODO add your handling code here:
       jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty())
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_jTextField31KeyReleased

    private void reports_btn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reports_btn1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_reports_btn1FocusGained

    private void reports_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reports_btn1MouseClicked

    private void reports_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reports_btn1ActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        newUser.setVisible(true);
        reset_button_color();
        reports_btn1.setBackground(Color.ORANGE);
        reset_user();
    }//GEN-LAST:event_reports_btn1ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        reset_user();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void fee_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fee_amountKeyReleased
        // TODO add your handling code here:
        
        if(!fee_discount.getText().isEmpty()&&!fee_amount.getText().isEmpty() && Float.parseFloat(jLabel122.getText())>0)
        if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
    }//GEN-LAST:event_fee_amountKeyReleased

    private void fee_receipt_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fee_receipt_noKeyReleased
        // TODO add your handling code here:
         
        
     Object obj[]=setDataToComponent("select fee_trainee_session_id,fee_amount,fee_disc,balance,fee_remarks from Fee_Details where fee_receipt_no='"+fee_receipt_no.getText()+"'");
       try{ 
           jButton17.setEnabled(false);
       if(obj!=null){
           if(login_value)
        { 
            jButton17.setEnabled(true);
          }
       fee_student_id.setSelectedItem(obj[0]+"");
       fee_amount.setText(obj[1]+"");
       jLabel122.setText(obj[1]+"");
       fee_balance.setText(obj[3]+"");
       fee_remarks.setText(obj[4]+"");
       JCheckBox check[]={jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4,jCheckBox5,jCheckBox6,jCheckBox7,jCheckBox8};
        manageSemester2("select sum(fee_total_semester) from Fee_Details where fee_receipt_no='"+fee_receipt_no.getText()+"'", check); 
      
         for(int i=0;i<9;i++){

                session.beginTransaction();
                FeeType ft=session.get(FeeType.class,fee_receipt_no.getText()+i);
                if(ft!=null){
                        switch(i){
                            case 0: jLabel113.setText(ft.getFeetype());   jTextField23.setText(ft.getFeetype_amount()+""); break;

                            case 1: jLabel114.setText(ft.getFeetype());   jTextField24.setText(ft.getFeetype_amount()+""); break;

                            case 2: jLabel115.setText(ft.getFeetype());    jTextField25.setText(ft.getFeetype_amount()+""); break;

                            case 3: jLabel116.setText(ft.getFeetype());   jTextField26.setText(ft.getFeetype_amount()+""); break;

                            case 4: jLabel117.setText(ft.getFeetype());    jTextField27.setText(ft.getFeetype_amount()+""); break;

                            case 5: jLabel118.setText(ft.getFeetype());    jTextField28.setText(ft.getFeetype_amount()+""); break;

                            case 6: jLabel119.setText(ft.getFeetype());    jTextField29.setText(ft.getFeetype_amount()+""); break;

                            case 7: jLabel120.setText(ft.getFeetype());    jTextField30.setText(ft.getFeetype_amount()+""); break;

                            case 8: jLabel121.setText(ft.getFeetype());    jTextField31.setText(ft.getFeetype_amount()+""); break;

                        }

                }else{
                       jTextField23.setText("0");
                       jTextField24.setText("0");
                       jTextField25.setText("0");
                       jTextField26.setText("0");
                       jTextField27.setText("0");
                       jTextField28.setText("0");
                       jTextField29.setText("0");
                       jTextField30.setText("0");
                       jTextField31.setText("0");  
                }
                tx.commit();
                }
       }
       else
       {
               fee_student_id.setSelectedIndex(0);
               fee_amount.setText("0");
               jLabel122.setText("0"); 
               jTextField23.setText("0");
               jTextField24.setText("0");
               jTextField25.setText("0");
               jTextField26.setText("0");
               jTextField27.setText("0");
               jTextField28.setText("0");
               jTextField29.setText("0");
               jTextField30.setText("0");
               jTextField31.setText("0");
               jCheckBox1.setEnabled(true);
               jCheckBox1.setSelected(false);
               jCheckBox2.setEnabled(true);
               jCheckBox2.setSelected(false);
               jCheckBox3.setEnabled(true);
               jCheckBox3.setSelected(false);
               jCheckBox4.setEnabled(true);
               jCheckBox4.setSelected(false);
               jCheckBox5.setEnabled(true);
               jCheckBox5.setSelected(false);
               jCheckBox6.setEnabled(true);
               jCheckBox6.setSelected(false);
               jCheckBox7.setEnabled(true);
               jCheckBox7.setSelected(false);
               jCheckBox8.setEnabled(true);
               jCheckBox8.setSelected(false);
       }
       

     
if(!jTextField23.getText().isEmpty())
        jLabel122.setText(((Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText())))+"");
       }catch(Exception e){}

    }//GEN-LAST:event_fee_receipt_noKeyReleased

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        if(new String(jPasswordField2.getPassword()).equals(new String(jPasswordField3.getPassword()))){
        session.beginTransaction();
        Login l=new Login();
        l.setUserId(jTextField32.getText());
        l.setUserName(jTextField33.getText());
        l.setPassword(jPasswordField2.getPassword());
        l.setCreatedBy(createdBy);
        l.setCreatedDate(new Date());
        session.save(l);
        tx.commit();
        JOptionPane.showMessageDialog(null,"User Created!");
        reset_user();
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if(new String(jPasswordField2.getPassword()).equals(new String(jPasswordField3.getPassword()))){
        session.beginTransaction();
        Login l=session.load(Login.class,jTable9.getModel().getValueAt(jTable9.getSelectedRow(), 0).toString());
        l.setUserName(jTextField33.getText());
        l.setPassword(jPasswordField2.getPassword());
        l.setCreatedBy(createdBy);
        l.setCreatedDate(new Date());
        session.update(l);
        tx.commit();
        JOptionPane.showMessageDialog(null,"User Updated!");
        reset_user();
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if(new String(jPasswordField2.getPassword()).equals(new String(jPasswordField3.getPassword()))){
        session.beginTransaction();
        Login l=session.load(Login.class,jTable9.getModel().getValueAt(jTable9.getSelectedRow(),0).toString());
        session.delete(l);
        tx.commit();
        JOptionPane.showMessageDialog(null,"User Updated!");
        reset_user();
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
        session.beginTransaction();
        Login ln=session.load(Login.class,jTable9.getModel().getValueAt(jTable9.getSelectedRow(),0).toString());
        jTextField32.setText(ln.getUserId());
        jTextField33.setText(ln.getUserName());
        tx.commit();
        
    }//GEN-LAST:event_jTable9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jTable5.getSelectedRow()!=-1 && !jToggleButton1.isSelected())
         createPdf(jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 0).toString(),
                 jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 11).toString(),
                 jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 1).toString());
        else
         JOptionPane.showMessageDialog(null, "Select Record or ID ");
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
//        File file=new File("cpiti.lock");
//        if(file.exists())
//            file.delete();
    }//GEN-LAST:event_formWindowClosing

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        if(jTable4.getSelectedRow()!=-1){
        session.beginTransaction();
        Trainee t=session.load(Trainee.class,jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 11).toString());
        session.delete(t);
        tx.commit();
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee", jTable4);
        }else
            JOptionPane.showMessageDialog(null, "Select row or ID first!");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
       if(jTable5.getSelectedRow()!=-1){
        session.beginTransaction();
        Fee_Details f=session.load(Fee_Details.class, jTable5.getModel().getValueAt(jTable5.getSelectedRow(),0).toString());
        session.delete(f);
        tx.commit();
         getTableData("select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,t.trainee_id from Trainee t, Fee_Details f where f.fee_trainee_session_id=t.trainee_session_id",jTable5);
       }
       else
        JOptionPane.showMessageDialog(null, "Select row or ID first!");   
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        if(!jLabel67.getText().isEmpty()){
        JFileChooser fc=new JFileChooser();
        fc.setSelectedFile(new File(jLabel67.getText()));
        int c=fc.showSaveDialog(this);
        if(c==JFileChooser.APPROVE_OPTION){
            
            try{
            copyFileUsingJava7Files(new File("StudentsImages\\"+new File("StudentsImages\\"+jLabel67.getText()).getName()), new File(fc.getSelectedFile().getAbsolutePath()));
            JOptionPane.showMessageDialog(null,"File Copied to "+new File(fc.getSelectedFile().getAbsolutePath()));
            }catch(Exception e){}
        
        }}
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jTextField34KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyReleased
        // TODO add your handling code here:
        try{ jLabel131.setText("");      
        if(!jTextField34.getText().isEmpty()){
            if(jToggleButton1.isSelected())
                getTableData("select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Trainee t, Fee_Details f where f.fee_trainee_session_id=t.trainee_session_id  AND LOCATE('FOC',f.fee_receipt_no)!=0 AND f.fee_receipt_no='"+jTextField34.getText()+"'",jTable5);
                else
             filterdata();
        }else{
        getTableData("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id order by f.fee_receipt_no desc", jTable5);

        }
           
        }catch(Exception e){}        
        
    }//GEN-LAST:event_jTextField34KeyReleased

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        if(!jLabel67.getText().isEmpty()){
            try{ if(new File("StudentsImages\\"+jLabel67.getText()).exists())
                new File("StudentsImages\\"+jLabel67.getText()).delete();
             DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
                TreePath path = jTree1.getSelectionPath();
               
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                    if (node.getParent() != null)
                        model.removeNodeFromParent(node);
                    
               
          //  JOptionPane.showMessageDialog(null,jLabel67.getText()+" Deleted!");
            jLabel67.setText(null);
            }catch(Exception e){}
        
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton32KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton32ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton32KeyPressed

    private void jButton33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton33KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton33ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton33KeyPressed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        
        if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()==0&&jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null)
           allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where t.trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'");
            // System.out.println("1");
        else if(jComboBox3.getSelectedIndex()==0 && jComboBox4.getSelectedIndex()!=0){
            if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null)// System.out.println("2");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  LOWER(t.trainee_trade_name)=LOWER('"+jComboBox4.getSelectedItem().toString()+"') and t.trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'  ");
            else //System.out.println("3");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  LOWER(t.trainee_trade_name)=LOWER('"+jComboBox4.getSelectedItem().toString()+"')");
        }else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()==0){
             if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null) //System.out.println("4");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and t.trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'");
             else //System.out.println("5");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"'");
        }else if(jComboBox3.getSelectedIndex()!=0 && jComboBox4.getSelectedIndex()!=0){
             if(jDateChooser4.getDate()!=null&&jDateChooser5.getDate()!=null) //System.out.println("6");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and LOWER(t.trainee_trade_name)=LOWER('"+jComboBox4.getSelectedItem().toString()+"') and t.trainee_admission_date between '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser4.getDate())+"' and '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"' ");
        else //System.out.println("7");
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where  t.trainee_session='"+jComboBox3.getSelectedItem().toString()+"' and LOWER(t.trainee_trade_name)=LOWER('"+jComboBox4.getSelectedItem().toString()+"') ");
        }
        else
        allIdReport("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t");   
        //select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where t.trainee_session_id=f.fee_trainee_session_id or t.trainee_session_id!=f.fee_trainee_session_id
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        if(jTable5.getSelectedRow()!=-1)
        allReportWithId("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where t.trainee_session_id=f.fee_trainee_session_id and f.fee_trainee_session_id='"+jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 1).toString()+"'");
        else
        JOptionPane.showMessageDialog(null, "Select Record or ID");
        
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"This Software is Developed By");
        JOptionPane.showOptionDialog(null, "This Software is Developed By \nDigiketer Technologies","Message", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTextField36KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField36KeyReleased
        // TODO add your handling code here:
        if(!jTextField36.getText().isEmpty())
         getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee where trainee_session_id like '"+jTextField36.getText()+"'", jTable4);
        else
        getTableData("select trainee_session_id,trainee_app_form_no,trainee_name,trainee_admission_date,trainee_father_name,trainee_date_of_birth,trainee_mobile_no,trainee_email,trainee_trade_shift,trainee_trade_unit,trainee_addmission_category,trainee_id from Trainee", jTable4); 
    }//GEN-LAST:event_jTextField36KeyReleased

    private void jTextField22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyReleased
        // TODO add your handling code here:
        getTableData("select instructor_uid,instructor_name,instructor_father_husband,insructor_language,mobile_no,instructor_mail,gpf_epf_no,instructor_home_no,instructor_qualification from Instructor WHERE instructor_uid LIKE '%"+jTextField22.getText()+"%' or LOWER(instructor_name) like LOWER('%"+jTextField22.getText()+"%')", jTable8);
    }//GEN-LAST:event_jTextField22KeyReleased

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        
        if(jDateChooser5.getDate()!=null){
       String query="select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name,t.trainee_session from Trainee t,Fee_Details f where t.trainee_session_id=f.fee_trainee_session_id and f.fee_cheque_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'";
           try{ 
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("StudentsImages\\DateWise"+new SimpleDateFormat("dd-MMM-yyyy").format(jDateChooser5.getDate())+".pdf")));
        document.open();
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Report of "+new SimpleDateFormat("dd-MMM-yyyy").format(jDateChooser5.getDate())), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
        String s[]="S.No,Receipt No,ID No,Name,Created/Updated By,Balance".split(",");
        PdfPTable table=new PdfPTable(new float[]{.5f,.75f,1,2,2,1});
        table.setWidthPercentage(100);
        PdfPCell cell;
                     cell=new PdfPCell(new Phrase(s[0]));
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[1]));
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[2]));
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[3]));
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[4]));
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[5]));
                     table.addCell(cell);
                     //count session id
                     List list_id=new ArrayList();
                      session.beginTransaction();
    Query query2=session.createQuery(query);
           
        List list=query2.list();
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj[]=(Object[])it.next();
            list_id.add(obj[0]);
            
        }
        Object unsort[]=list_id.toArray();
        Arrays.sort(unsort,new AlphanumericSorting());
        //Table Heading
         session.beginTransaction();
          int sno=1;double sum=0;
//          if(query.contains("where"))
//              query=query+" and";
//          else
//             query=query+" where"; 
        for(Object us:unsort){
        
        Query query4=session.createQuery("select distinct f.fee_receipt_no From Fee_Details f where f.fee_trainee_session_id='"+us+"' and f.fee_cheque_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"'");
            List list2=query4.list();
            System.out.println("2");
            System.out.println("list2 ="+list2);
            Object receipt[]=list2.toArray();
        for(int xx=0;xx<receipt.length;xx++){
             System.out.println(receipt[xx]+"");
             query2=session.createQuery(query+" and t.trainee_session_id='"+us+"'");
        System.out.println("t.trainee_session_id='"+us+"'");
        list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext()){ System.out.println("1");
            System.out.println("3");
            System.out.println("4");
        Object obj[]=(Object[])i.next();System.out.println("5");
                     cell=new PdfPCell(new Phrase(sno+""));
                     table.addCell(cell);System.out.println("6");
                     cell=new PdfPCell(new Phrase(receipt[xx]+""));//System.out.println("receiptno= "+receipt[0]+" "+receipt[1]);
                     table.addCell(cell);System.out.println("7");
                     cell=new PdfPCell(new Phrase(obj[0]+""));
                     table.addCell(cell); System.out.println("8");
                     cell=new PdfPCell(new Phrase(obj[1]+""));
                     table.addCell(cell);System.out.println("9");
                     query4=session.createQuery("select distinct f.createdBy From Fee_Details f where f.fee_receipt_no='"+receipt[xx]+"'");
                     list2=query4.list();System.out.println("10");
                     Object receipt1[]=list2.toArray();System.out.println("11");
                     System.out.println("receiptno= "+receipt1[0]+"");
                     cell=new PdfPCell(new Phrase(receipt1[0]+""));System.out.println("12");
                     table.addCell(cell);
                    
                     String trade_name=obj[3]+"";
                    // String trade_session=obj[4]+"";
                 System.out.println("13");
                  Query   query3=session.createQuery("select sum(f.fee_amount) from Fee_Details f where f.fee_receipt_no in(select distinct f.fee_receipt_no From Fee_Details f where f.fee_trainee_session_id='"+obj[0]+"' and f.fee_cheque_date='"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser5.getDate())+"')");
                          System.out.println("select sum(f.fee_amount) from Fee_Details f where f.fee_receipt_no in(select distinct f.fee_receipt_no From Fee_Details f where f.fee_trainee_session_id='"+obj[0]+"')");
                   List  list3=query3.list();
                     float total_fee=0;//double trade_fee=0;
                    System.out.println("14");
//                     if(!list.isEmpty()){
                     Object obj2[]=list3.toArray();
                     if(obj2[0]!=null)
                     total_fee=Float.parseFloat(obj2[0]+"");
                    // }
                    System.out.println("15");
                     cell=new PdfPCell(new Phrase(total_fee+""));
                     table.addCell(cell);
                     sum+=total_fee;System.out.println("16");
           
            sno++;
            }
        }  //if ends
         }
         cell=new PdfPCell(new Phrase("Total Balance= "+sum+""));
         cell.setColspan(6);
         cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
         table.addCell(cell);
        tx.commit();             
                     
        document.add(table);
        document.close();
        Desktop.getDesktop().open(new File("StudentsImages\\DateWise"+new SimpleDateFormat("dd-MMM-yyyy").format(jDateChooser5.getDate())+".pdf"));
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}  
        }
        else
        JOptionPane.showMessageDialog(null, "Select Date to Field!","Error ",0);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:

        if(fee_student_id.getSelectedIndex()!=0)
        {
        int d=0;
        String r="";
//        if(jCheckBox1.isEnabled()&&jCheckBox1.isSelected()){
//            c++;s+=",1";
//        }if(jCheckBox2.isEnabled()&&jCheckBox2.isSelected()){
//            c++;s+=",2";
//        }if(jCheckBox3.isEnabled()&&jCheckBox3.isSelected()){
//            c++;s+=",3";
//        }if(jCheckBox4.isEnabled()&&jCheckBox4.isSelected()){
//            c++;s+=",4";
//        }if(jCheckBox5.isEnabled()&&jCheckBox5.isSelected()){
//            c++;s+=",5";
//        }if(jCheckBox6.isEnabled()&&jCheckBox6.isSelected()){
//            c++;s+=",6";
//        }if(jCheckBox7.isEnabled()&&jCheckBox7.isSelected()){
//            c++;s+=",7";
//        }if(jCheckBox8.isEnabled()&&jCheckBox8.isSelected()){
//            c++;s+=",8";
//        }
        
         if(!jCheckBox1.isEnabled()&&!jCheckBox1.isSelected()){
            d++;r+=",1";
        }if(!jCheckBox2.isEnabled()&&!jCheckBox2.isSelected()){
            d++;r+=",2";
        }if(!jCheckBox3.isEnabled()&&!jCheckBox3.isSelected()){
            d++;r+=",3";
        }if(!jCheckBox4.isEnabled()&&!jCheckBox4.isSelected()){
            d++;r+=",4";
        }if(!jCheckBox5.isEnabled()&&!jCheckBox5.isSelected()){
            d++;r+=",5";
        }if(!jCheckBox6.isEnabled()&&!jCheckBox6.isSelected()){
            d++;r+=",6";
        }if(!jCheckBox7.isEnabled()&&!jCheckBox7.isSelected()){
            d++;r+=",7";
        }if(!jCheckBox8.isEnabled()&&!jCheckBox8.isSelected()){
            d++;r+=",8";
        }
        
        if(countSem>0){
           // s=s.substring(1);
        if(r.length()>0)r=r.substring(1);

        float remain=0,trade_fee=0,tot_sem=0;String trade_ses="";
        session.beginTransaction();
    Query query2=session.createQuery("select trainee_session from Trainee t where t.trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
            trade_ses=(String)i.next();
        tx.commit();

     Object obj[]=setDataToComponent("select trade_fee,trade_total_semester from Trade t where lower(t.trade_name)=lower('"+fee_trade.getSelectedItem().toString()+"') and t.trade_session='"+trade_ses+"'");
     remain=Float.parseFloat(obj[0]+"")*Integer.parseInt(obj[1]+"")-d*Float.parseFloat(obj[0]+"");

      wholePart(fee_receipt_no.getText(),fee_student_id.getSelectedItem().toString(),Float.parseFloat(obj[0]+"")*Integer.parseInt(obj[1]+""),d*Float.parseFloat(obj[0]+""),r+","+SEMLIST);
        reset_student_fees();
        fee_receipt_no.setText(generateId("","select fee_receipt_no from Fee_Details"));
        }
        else
            JOptionPane.showMessageDialog(null, "Select Semester");
        
        }
        else
            JOptionPane.showMessageDialog(null, "Fill Fee Amount");
//        else
//            JOptionPane.showMessageDialog(null, "Fill Cheque Date");
        
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        
       // System.out.println("jTable5.getSelectedRowCount()="+jTable5.getSelectedRowCount());
        if(jTable5.getSelectedRowCount()>0){
        List list_id=new ArrayList();
        int index[]=jTable5.getSelectedRows();
        for(int i=0;i<jTable5.getSelectedRowCount();i++){
          //  System.out.println(jTable5.getValueAt(index[i], 1).toString());
        list_id.add(jTable5.getValueAt(index[i], 1).toString());
        }
        
  
        Object unsort[]=list_id.toArray();
        Arrays.sort(unsort,new AlphanumericSorting());
        Long receipt_no=Long.parseLong(generateId("","select fee_receipt_no  from Fee_Details"));
   
       
         try{ Document document=new Document(PageSize.A4, 20,20,40,20);
              PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("newDemo.pdf")));
              document.open();
          //  document.setMargins(10, 10, 5, 5);
           for(Object id:unsort){
           pages(document,receipt_no+"",id+"", 0f, 0f, "");
           receipt_no++;
           }
            document.close();
            Desktop.getDesktop().open(new File("newDemo.pdf"));
            }catch(Exception e){}
        }
        else
            JOptionPane.showMessageDialog(null, "Select at least One record");
        //wholePart(fee_receipt_no.getText(),fee_student_id.getSelectedItem().toString(),Float.parseFloat(obj[0]+"")*Integer.parseInt(obj[1]+""),d*Float.parseFloat(obj[0]+""),r+","+s);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
            jButton47.setEnabled(true);
            fee_pay_mode.setEnabled(true);
            fee_bank_name.setEnabled(true);
            fee_branch_name.setEnabled(true);
            fee_cheque_no.setEnabled(true);
            fee_cheque_date.setEnabled(true);
            fee_amount.setEnabled(true);
            fee_amount.setText("0");
            jTextField23.setText("0");
            fee_discount.setEnabled(true);
            jTextField23.setEnabled(true);
            jTextField24.setEnabled(true);
            jTextField25.setEnabled(true);
            jTextField26.setEnabled(true);
            jTextField27.setEnabled(true);
            jTextField28.setEnabled(true);
            jTextField29.setEnabled(true);
            jTextField30.setEnabled(true);
            jTextField31.setEnabled(true);
             jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            if(fee_receipt_no.getText().contains("FOC"))
            fee_receipt_no.setText((Integer.parseInt(fee_receipt_no.getText().trim().substring(3))+1)+"");
        if(jCheckBox10.isSelected()){
            fee_pay_mode.setEnabled(false);
            fee_bank_name.setEnabled(false);
            fee_branch_name.setEnabled(false);
            fee_cheque_no.setEnabled(false);
            fee_cheque_date.setEnabled(false);
            fee_amount.setEnabled(false);
            fee_discount.setEnabled(false);
            jTextField23.setEnabled(false);
            jTextField24.setEnabled(false);
            jTextField25.setEnabled(false);
            jTextField26.setEnabled(false);
            jTextField27.setEnabled(false);
            jTextField28.setEnabled(false);
            jTextField29.setEnabled(false);
            jTextField30.setEnabled(false);
            jTextField31.setEnabled(false);
           
            fee_receipt_no.setText("FOC"+fee_receipt_no.getText());
            jLabel122.setText("0");
            jButton47.setEnabled(false);
            
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void daybook_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_daybook_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_daybook_btnFocusGained

    private void daybook_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daybook_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_daybook_btnMouseClicked

    private void daybook_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daybook_btnActionPerformed
        // TODO add your handling code here:
        hide_all_panel();
        daybook_panel.setVisible(true);
        jButton49ActionPerformed(evt);
    }//GEN-LAST:event_daybook_btnActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("Search by Voucher no or expence name");
        jTextField40.setForeground(Color.LIGHT_GRAY);
        jDateChooser11.setDate(new Date());
        jButton52.setVisible(false);
        jButton48.setText("Submit");
        getTableData("SELECT voucherid,voucherno,voucherexpence,voucheramount,voucherdate FROM DaybookEntry", jTable10);
        jTextField37.requestFocusInWindow();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // TODO add your handling code here:
        if(jTable10.getSelectedRow()!=-1){
            session.beginTransaction();
            jButton48.setText("Update");
         jButton52.setVisible(true);
         DaybookEntry de=session.get(DaybookEntry.class, Integer.parseInt(jTable10.getValueAt(jTable10.getSelectedRow(), 0).toString()));
         jTextField37.setText(de.getVoucherno());
         jTextField38.setText(de.getVoucherexpence());
         jTextField39.setText(de.getVoucheramount()+"");
         jDateChooser11.setDate(de.getVoucherdate());
         tx.commit();
        }
         
    }//GEN-LAST:event_jTable10MouseClicked

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        if(!jTextField37.getText().isEmpty())
            if(!jTextField38.getText().isEmpty())
                if(!jTextField39.getText().isEmpty())
                    if(jDateChooser11.getDate()!=null){
                        session.beginTransaction();
                        String choice=jButton48.getText();
                        switch(choice){
                            case "Submit":  
                                DaybookEntry de=new DaybookEntry();
                                de.setVoucherno(jTextField37.getText());
                                de.setVoucherexpence(jTextField38.getText());
                                de.setVoucheramount(new BigDecimal(jTextField39.getText()));
                                de.setVoucherdate(jDateChooser11.getDate());
                                session.save(de);
                                break;
                            case "Update":
                                int id=Integer.parseInt(jTable10.getValueAt(jTable10.getSelectedRow(), 0).toString());
                               if(JOptionPane.showConfirmDialog (null, "Do you want to Update Voucher : "+jTextField37.getText()+" and Id "+id+"?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                                DaybookEntry du=session.get(DaybookEntry.class, id);
                                du.setVoucherno(jTextField37.getText());
                                du.setVoucherexpence(jTextField38.getText());
                                du.setVoucheramount(new BigDecimal(jTextField39.getText()));
                                du.setVoucherdate(jDateChooser11.getDate());
                                session.update(du);
                               }
                                break;
                        }
                        tx.commit();
                        jButton49ActionPerformed(evt);
                    }else
                        JOptionPane.showMessageDialog(null, "Date can not be empty !");
        else
                        JOptionPane.showMessageDialog(null, "Fill amount !");
        else
                        JOptionPane.showMessageDialog(null, "Enter Expence Name !");
        else
                        JOptionPane.showMessageDialog(null, "Voucher No can not be empty !");
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        if(jTable10.getSelectedRow()!=-1)
        if(JOptionPane.showConfirmDialog (null, "Do you want to Delete Voucher : "+jTextField37.getText()+"?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            session.beginTransaction();
            DaybookEntry dd=session.get(DaybookEntry.class, Integer.parseInt(jTable10.getValueAt(jTable10.getSelectedRow(), 0).toString()));
            session.delete(dd);
            tx.commit();
            jButton49ActionPerformed(evt);
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        if(!jTextField37.getText().trim().isEmpty()){
        session.beginTransaction();
        java.util.List collection = new java.util.ArrayList();
        Criteria cr=session.createCriteria(DaybookEntry.class);
                 cr.add(Restrictions.eq("voucherno", jTextField37.getText()));
                 List<DaybookEntry> dbe=cr.list();
            for (DaybookEntry n : dbe) {
               // System.out.println(n.getVoucherid()+","+n.getVoucherno()+","+n.getVoucherexpence());
                collection.add(new DaybookEntry(n.getVoucherid(), n.getVoucherno(),n.getVoucheramount(), n.getVoucherexpence(), n.getVoucherdate()));
            }
        report_jasper(cpiti.DaybookFactory.getDaybookCollection(collection),"/reports/DaybookEntry.jasper");
        tx.commit();  
        jButton49ActionPerformed(evt);
        }
        
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jTextField40KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyReleased
        // Daybook
        getTableData("SELECT voucherid,voucherno,voucherexpence,voucheramount,voucherdate FROM DaybookEntry WHERE UPPER(voucherno) LIKE UPPER('%"+jTextField40.getText()+"%') OR UPPER(voucherexpence) LIKE UPPER('%"+jTextField40.getText()+"%')", jTable10);
    }//GEN-LAST:event_jTextField40KeyReleased

    private void jButton52KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton52KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton52ActionPerformed(null);
    }//GEN-LAST:event_jButton52KeyPressed

    private void jButton51KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton51KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton51ActionPerformed(null);
    }//GEN-LAST:event_jButton51KeyPressed

    private void jButton49KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton49KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton49ActionPerformed(null);
    }//GEN-LAST:event_jButton49KeyPressed

    private void jButton48KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton48KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton48ActionPerformed(null);
    }//GEN-LAST:event_jButton48KeyPressed

    private void jButton50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton50KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton50ActionPerformed(null);
    }//GEN-LAST:event_jButton50KeyPressed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        if(jDateChooser12.getDate()!=null && jDateChooser13.getDate()!=null){
             JFileChooser fc=new JFileChooser();
        int i=fc.showSaveDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            String fileName;
            if(!fc.getSelectedFile().getAbsolutePath().endsWith(".xlsx"))
            fileName=fc.getSelectedFile().getAbsolutePath()+".xlsx";
            else
            fileName=fc.getSelectedFile().getAbsolutePath();
           
            generateDataforExcel(fileName, "daybooksheet", "SELECT voucherno,voucherexpence,voucheramount,voucherdate FROM DaybookEntry WHERE voucherdate BETWEEN '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser12.getDate())+"' AND '"+new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser13.getDate())+"'", new Object[]{"Voucher No","Expence Name","Expence Amount"," Date "});
        }
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jTextField40FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField40FocusGained
        // TODO add your handling code here:
        if(jTextField40.getText().trim().equals("Search by Voucher no or expence name")){
            jTextField40.setForeground(Color.BLACK);
            jTextField40.setText("");
        }
    }//GEN-LAST:event_jTextField40FocusGained

    private void jTextField40FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField40FocusLost
        // TODO add your handling code here:
        if(jTextField40.getText().trim().isEmpty()){
            jTextField40.setForeground(Color.LIGHT_GRAY);
            jTextField40.setText("Search by Voucher no or expence name");
        }
    }//GEN-LAST:event_jTextField40FocusLost

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton3ActionPerformed(null);
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton2ActionPerformed(null);
    }//GEN-LAST:event_jButton2KeyPressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected() || !jCheckBox1.isEnabled())
          calculateFees(fee_student_id.getSelectedItem().toString());
        else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox2.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected() && fee_student_id.getSelectedIndex()!=0)
         calculateFees(fee_student_id.getSelectedItem().toString());
        else
        { jCheckBox1.setSelected(false);
            JOptionPane.showMessageDialog(null, "Select Student ID !");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox2.isSelected() || !jCheckBox2.isEnabled())
           calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox3.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox3.isSelected() || !jCheckBox3.isEnabled())
         calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox4.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox4.isSelected() || !jCheckBox4.isEnabled())
          calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox5.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox5.isSelected() || !jCheckBox5.isEnabled())
          calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox6.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox6.isSelected() || !jCheckBox6.isEnabled())
        calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox7.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox7.isSelected() || !jCheckBox7.isEnabled())
         calculateFees(fee_student_id.getSelectedItem().toString());
          else  {
             JOptionPane.showMessageDialog(null, "Complete previous semesters first !");
             jCheckBox8.setSelected(false);
             calculateFees(fee_student_id.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void fee_amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fee_amountFocusGained
        // TODO add your handling code here:
        if(fee_amount.getText().trim().equals("0"))
            fee_amount.setText("");
    }//GEN-LAST:event_fee_amountFocusGained

    private void fee_amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fee_amountFocusLost
        // TODO add your handling code here:
         if(fee_amount.getText().trim().isEmpty())
             fee_amount.setText("0");
    }//GEN-LAST:event_fee_amountFocusLost

    private void fee_discountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fee_discountFocusGained
        // TODO add your handling code here:
         if(fee_discount.getText().trim().equals("0"))
            fee_discount.setText("");
    }//GEN-LAST:event_fee_discountFocusGained

    private void fee_discountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fee_discountFocusLost
        // TODO add your handling code here:
        if(fee_discount.getText().trim().isEmpty())
             fee_discount.setText("0");
    }//GEN-LAST:event_fee_discountFocusLost

    private void jTextField24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField24FocusGained
        // TODO add your handling code here:
        if(jTextField24.getText().trim().equals("0"))
            jTextField24.setText("");
    }//GEN-LAST:event_jTextField24FocusGained

    private void jTextField25FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField25FocusGained
        // TODO add your handling code here:
        if(jTextField25.getText().trim().equals("0"))
            jTextField25.setText("");
    }//GEN-LAST:event_jTextField25FocusGained

    private void jTextField26FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField26FocusGained
        // TODO add your handling code here:
        if(jTextField26.getText().trim().equals("0"))
            jTextField26.setText("");
    }//GEN-LAST:event_jTextField26FocusGained

    private void jTextField27FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField27FocusGained
        // TODO add your handling code here:
        if(jTextField27.getText().trim().equals("0"))
            jTextField27.setText("");
    }//GEN-LAST:event_jTextField27FocusGained

    private void jTextField28FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField28FocusGained
        // TODO add your handling code here:
        if(jTextField28.getText().trim().equals("0"))
            jTextField28.setText("");
    }//GEN-LAST:event_jTextField28FocusGained

    private void jTextField29FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField29FocusGained
        // TODO add your handling code here:
        if(jTextField29.getText().trim().equals("0"))
            jTextField29.setText("");
    }//GEN-LAST:event_jTextField29FocusGained

    private void jTextField30FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField30FocusGained
        // TODO add your handling code here:
        if(jTextField30.getText().trim().equals("0"))
            jTextField30.setText("");
    }//GEN-LAST:event_jTextField30FocusGained

    private void jTextField31FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField31FocusGained
        // TODO add your handling code here:
        if(jTextField31.getText().trim().equals("0"))
            jTextField31.setText("");
    }//GEN-LAST:event_jTextField31FocusGained

    private void jTextField24FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField24FocusLost
        // TODO add your handling code here:
        if(jTextField24.getText().trim().isEmpty())
             jTextField24.setText("0");
    }//GEN-LAST:event_jTextField24FocusLost

    private void jTextField25FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField25FocusLost
        // TODO add your handling code here:
        if(jTextField25.getText().trim().isEmpty())
             jTextField25.setText("0");
    }//GEN-LAST:event_jTextField25FocusLost

    private void jTextField26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField26FocusLost
        // TODO add your handling code here:
        if(jTextField26.getText().trim().isEmpty())
             jTextField26.setText("0");
    }//GEN-LAST:event_jTextField26FocusLost

    private void jTextField27FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField27FocusLost
        // TODO add your handling code here:
        if(jTextField27.getText().trim().isEmpty())
             jTextField27.setText("0");
    }//GEN-LAST:event_jTextField27FocusLost

    private void jTextField28FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField28FocusLost
        // TODO add your handling code here:
        if(jTextField28.getText().trim().isEmpty())
             jTextField28.setText("0");
    }//GEN-LAST:event_jTextField28FocusLost

    private void jTextField29FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField29FocusLost
        // TODO add your handling code here:
        if(jTextField29.getText().trim().isEmpty())
             jTextField29.setText("0");
    }//GEN-LAST:event_jTextField29FocusLost

    private void jTextField30FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField30FocusLost
        // TODO add your handling code here:
        if(jTextField30.getText().trim().isEmpty())
             jTextField30.setText("0");
    }//GEN-LAST:event_jTextField30FocusLost

    private void jTextField31FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField31FocusLost
        // TODO add your handling code here:
        if(jTextField31.getText().trim().isEmpty())
             jTextField31.setText("0");
    }//GEN-LAST:event_jTextField31FocusLost

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected()){
            jToggleButton1.setText("FOC");
            getTableData("select f.foc_no,f.foc_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.foc_amount,0,0,'',f.foc_total_semester,f.foc_remarks,f.createdBy,t.trainee_id from Trainee t, FOC_Details f where f.foc_trainee_session_id=t.trainee_session_id",jTable5);
        }
        else{
            jToggleButton1.setText("Non-FOC");
            getTableData("select f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Trainee t, Fee_Details f where f.fee_trainee_session_id=t.trainee_session_id  AND LOCATE('FOC',f.fee_receipt_no)=0",jTable5);
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox11.isSelected())
         jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+""); //  Float.parseFloat(jTextField23.getText())+
        else
         jLabel122.setText((Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+""); //  Float.parseFloat(jTextField23.getText())+
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            jButton16ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton16MouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //new MainForm().setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images\\imageedit_1_6513064075.ico")).getImage());
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login_panel;
    private javax.swing.JButton attendance_btn;
    private javax.swing.JPanel attendance_pnl;
    private javax.swing.JTextField bank_branch;
    private javax.swing.JPanel bank_detail_pnl;
    private javax.swing.JButton bank_details_btn;
    private javax.swing.JTextField bank_ifsc_code;
    private javax.swing.JTextField bank_name;
    private javax.swing.JTextField bank_search;
    private javax.swing.JPanel body_pnl;
    private javax.swing.JButton daybook_btn;
    private javax.swing.JPanel daybook_panel;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fee_amount;
    private javax.swing.JLabel fee_balance;
    private javax.swing.JComboBox fee_bank_name;
    private javax.swing.JComboBox fee_branch_name;
    private com.toedter.calendar.JDateChooser fee_cheque_date;
    private javax.swing.JTextField fee_cheque_no;
    private javax.swing.JTextField fee_discount;
    private javax.swing.JComboBox fee_pay_mode;
    private javax.swing.JTextField fee_receipt_no;
    private javax.swing.JTextField fee_remarks;
    private javax.swing.JComboBox fee_student_id;
    private javax.swing.JComboBox fee_trade;
    private javax.swing.JPanel footer_pnl;
    private javax.swing.JPanel front_right_pnl;
    private javax.swing.JPanel header_pnl;
    private javax.swing.JButton holiday_btn;
    private com.toedter.calendar.JDateChooser holiday_date;
    private javax.swing.JTextField holiday_name;
    private javax.swing.JPanel holiday_pnl;
    private javax.swing.JTextField holiday_search;
    private javax.swing.JPanel instructor_detail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser11;
    private com.toedter.calendar.JDateChooser jDateChooser12;
    private com.toedter.calendar.JDateChooser jDateChooser13;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel left_pnl;
    private javax.swing.JPanel newUser;
    private javax.swing.JLabel photo_container;
    private javax.swing.JLabel photo_location;
    private javax.swing.JPanel report_pnl;
    private javax.swing.JButton reports_btn;
    private javax.swing.JButton reports_btn1;
    private javax.swing.JPanel salary_pnl;
    private javax.swing.JComboBox session_id_cbx;
    private javax.swing.JButton staff_manage_btn;
    private javax.swing.JButton staff_salary_btn;
    private javax.swing.JButton student_fee_btn;
    private javax.swing.JPanel student_fee_pnl;
    private javax.swing.JButton student_registration_btn;
    private javax.swing.JPanel student_registration_pnl;
    private javax.swing.JButton trade_btn;
    private javax.swing.JSpinner trade_duration;
    private javax.swing.JTextField trade_fees;
    private javax.swing.JTextField trade_name;
    private javax.swing.JPanel trade_pnl;
    private javax.swing.JTextField trade_search;
    private javax.swing.JSpinner trade_total_semester;
    private javax.swing.JTextField trainee_aadhar;
    private javax.swing.JComboBox trainee_acategory;
    private javax.swing.JTextArea trainee_address;
    private com.toedter.calendar.JDateChooser trainee_admission_date;
    private javax.swing.JTextField trainee_app_form_no;
    private javax.swing.JComboBox trainee_category;
    private javax.swing.JComboBox trainee_dual_mode;
    private javax.swing.JTextField trainee_email;
    private javax.swing.JTextField trainee_fname;
    private javax.swing.JComboBox trainee_gen;
    private javax.swing.JComboBox trainee_hcategory;
    private javax.swing.JComboBox trainee_mcategory;
    private javax.swing.JTextField trainee_mname;
    private javax.swing.JTextField trainee_mobile;
    private javax.swing.JTextField trainee_name;
    private javax.swing.JComboBox trainee_nationality;
    private javax.swing.JComboBox trainee_qualification;
    private javax.swing.JTextField trainee_remarks;
    private javax.swing.JButton trainee_reset;
    private javax.swing.JTextField trainee_shift;
    private javax.swing.JTextField trainee_strn;
    private javax.swing.JButton trainee_submit;
    private javax.swing.JComboBox trainee_trade;
    private javax.swing.JComboBox trainee_type;
    private javax.swing.JTextField trainee_unit;
    private javax.swing.JButton trainee_update;
    private javax.swing.JButton trainee_view;
    private javax.swing.JPanel view_fee_details;
    private javax.swing.JPanel view_instructor_detail;
    private javax.swing.JPanel view_trainee_detail;
    // End of variables declaration//GEN-END:variables
private void hide_all_panel(){
    jTextField21.setText(null);
        jPasswordField1.setText(null);
    attendance_pnl.setVisible(false);
    bank_detail_pnl.setVisible(false);
    holiday_pnl.setVisible(false);
    salary_pnl.setVisible(false);
    student_fee_pnl.setVisible(false);
    student_registration_pnl.setVisible(false);
    trade_pnl.setVisible(false);
    report_pnl.setVisible(false);
    Login_panel.setVisible(false);
    view_trainee_detail.setVisible(false);
    view_fee_details.setVisible(false);
    instructor_detail.setVisible(false);
    view_instructor_detail.setVisible(false);
    newUser.setVisible(false);
    daybook_panel.setVisible(false);
}

private void reset_student_registration(){
    session_id_cbx.setSelectedIndex(0);
    trainee_name.setText(null);
    trainee_fname.setText(null);
    trainee_mname.setText(null);
    dob.setDate(null);
    trainee_gen.setSelectedIndex(0);
    trainee_nationality.setSelectedIndex(0);
    trainee_mobile.setText(null);
    trainee_email.setText(null);
    trainee_aadhar.setText(null);
    trainee_category.setSelectedIndex(0);
    trainee_hcategory.setSelectedIndex(0);
    trainee_acategory.setSelectedIndex(0);
    trainee_mcategory.setSelectedIndex(0);
    trainee_strn.setText(null);
    trainee_app_form_no.setText(null);
    trainee_admission_date.setDate(new Date());
    trainee_trade.setSelectedIndex(0);
    trainee_type.setSelectedIndex(0);
    trainee_shift.setText(null);
    trainee_unit.setText(null);
    trainee_dual_mode.setSelectedIndex(0);
    trainee_remarks.setText(null);
    trainee_qualification.setSelectedIndex(0);
    photo_location.setText(null);
    photo_container.setText(null);
    photo_container.setIcon(null);
    jDateChooser3.setDate(new Date());
   
    getDataInCombo("select trainee_session_id from Trainee",session_id_cbx);
    
}
private void reset_student_fees(){
    jButton17.setEnabled(false);
     fee_receipt_no.setEnabled(false);
     if(login_value)
        { fee_receipt_no.setEnabled(true);
           
          }
    fee_receipt_no.setText(null);
    fee_student_id.setSelectedIndex(0);
    fee_trade.setSelectedIndex(0);
    fee_pay_mode.setSelectedIndex(0);
    fee_bank_name.setSelectedIndex(0);
    fee_branch_name.setSelectedIndex(0);
    fee_cheque_no.setText(null);
    fee_cheque_date.setDate(new Date());
    fee_amount.setText("0");
    fee_balance.setText("0");
    fee_discount.setText("0");
    fee_remarks.setText("");
    jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jCheckBox8.setVisible(true);
            jCheckBox11.setVisible(false);
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    jCheckBox3.setSelected(false);
    jCheckBox4.setSelected(false);
    jCheckBox5.setSelected(false);
    jCheckBox6.setSelected(false);
    jCheckBox7.setSelected(false);
    jCheckBox8.setSelected(false);
    countSem=SUBMITTED_SEM=0;
    fees=0;
    BALANCE=0;trade_id=SEMLIST="";
    jCheckBox1.setEnabled(true);
    jCheckBox2.setEnabled(true);
    jCheckBox3.setEnabled(true);
    jCheckBox4.setEnabled(true);
    jCheckBox5.setEnabled(true);
    jCheckBox6.setEnabled(true);
    jCheckBox7.setEnabled(true);
    jCheckBox8.setEnabled(true);
    jTextField23.setText("0");
    jTextField24.setText("0");
    jTextField25.setText("0");
    jTextField26.setText("0");
    jTextField27.setText("0");
    jTextField28.setText("0");
    jTextField29.setText("0");
    jTextField30.setText("0");
    jTextField31.setText("0");
    jLabel122.setText("0");
    jCheckBox10.setSelected(false);
    fee_receipt_no.setText(generateId("","select fee_receipt_no from Fee_Details"));     
    getDataInCombo("select bank_name from Bank",fee_bank_name);
    getDataInCombo("select trainee_session_id from Trainee",fee_student_id);
    Util.assertNotNull(fee_student_id);
    getDataInCombo("select trainee_trade_name from Trainee where trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"'",fee_trade);
    jCheckBox10.requestFocusInWindow();
}
private void reset_bank(){
    bank_name.setText(null);
    bank_branch.setText(null);
    bank_ifsc_code.setText(null);
    bank_search.setText(null);
    bank_id=null;
    getTableData("select bank_id,bank_name,bank_branch,bank_ifsc from Bank", jTable2);
}
private void reset_holiday(){
    holiday_name.setText(null);
    holiday_date.setDate(null);
    holiday_search.setText(null);
    day_id=0;
    getTableData("select holiday_name,holiday_day,holiday_date from Holidays", jTable3);
}
private void reset_trade(){
    trade_name.setText(null);
    trade_fees.setText(null);
    trade_duration.setValue(0);
    trade_search.setText(null);
    jTextField35.setText(null);
    trade_total_semester.setValue(0);
    
    trade_id=null;
    getTableData("select trade_name,trade_duration,trade_fee,trade_total_semester,trade_session,trade_id from Trade", jTable1);
}
private void getTableData(String query1,javax.swing.JTable table){
    try{
    DefaultTableModel dtm=(DefaultTableModel)table.getModel();
    for(int i=dtm.getRowCount()-1;i>=0;i--)
        dtm.removeRow(i);
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        while(i.hasNext())
            dtm.addRow((Object[])i.next());
    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
}  
 
 private void getDataInCombo(String query1,javax.swing.JComboBox combo){
  try{ 
  while (combo.getItemCount() > 1) 
            combo.removeItemAt(1); 
    Query query2=session.createQuery(query1);
        List list=query2.list();
       if(!list.isEmpty()){
           Iterator i=list.iterator();
        while(i.hasNext())
            combo.addItem((Object)i.next());  }
     }catch(Exception e){e.printStackTrace();
     }    
}
 private String genId(String prefix,String query1){
   int id=10;
    try{
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        id=1+(Integer)i.next();
      
        
    }catch(Exception e){e.printStackTrace();}
     return prefix+id+"";
 }
 // select max(cast(substr(field_name,3) as integer))
private String generateId(String prefix,String query1){
    int id=1000;
    try{
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        Object obj[]=list.toArray();
        String str[]=new String[obj.length];
        for(int x=0;x<obj.length;x++)
            str[x]=obj[x]+"";
         Arrays.sort(str,new AlphanumericSorting());
         for(int x=str.length-1;x>0;x--){
             if(isInteger(str[x])){
                id=Integer.valueOf(str[x])+1;
                
                break;
             }
         }
        
    }catch(Exception e){e.printStackTrace();}
    return id+"";
}
private int getMaxId(String query1){
    int id=0;
    try{
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        Object obj[]=list.toArray();
        String str[]=new String[obj.length];
        for(int x=0;x<obj.length;x++)
            str[x]=obj[x]+"";
         Arrays.sort(str,new AlphanumericSorting());
         for(int x=str.length-1;x>0;x--){
             if(isInteger(str[x])){
                id=Integer.valueOf(str[x]);
                
                break;
             }
         }
        
    }catch(Exception e){e.printStackTrace();}
    return id;
}
public static boolean isInteger(String s) {
    return isInteger(s,10);
}

public static boolean isInteger(String s, int radix) {
    if(s.isEmpty()) return false;
    for(int i = 0; i < s.length(); i++) {
        if(i == 0 && s.charAt(i) == '-') {
            if(s.length() == 1) return false;
            else continue;
        }
        if(Character.digit(s.charAt(i),radix) < 0) return false;
    }
    return true;
}
private Object[] setDataToComponent(String query1){
    session.beginTransaction();
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        Object s[]=null;
        if(i.hasNext())
        s=(Object[])i.next();
        tx.commit();
    return s;
}
private void insertdata(){
    String s[]="Freedom Fighters ,General ,N.C.C Cadets ,Other Backward ,Other Backward Caste Creamy Layer ,Other Backward Class ,Other Caste ,Others ,Physically Handicapped ,Schedule Castes ,Schedule Tribes ,Wards of Ex-Serviceman ,Wards of Para Military Service Personnel".split(",");
    
    session.beginTransaction();
    for(String s1:s){ Category c=new Category();
    c.setCategory_name(s1);
    session.save(c);
    
    }
    try{
      tx.commit();}catch(Exception e){tx.rollback();}
   
 String s1[]="Ex-Serviceman,Freedom Fighter,General,NCC Cadets,NSS Cadets,Other Backward Classes,Others,Physically Handicapped,Schedule Castes,Schedule Tribes,Special Category,Sports,Wards of Ex-Serviceman,Wards of Para Military Service Personnel".split(",");
   
     session.beginTransaction();
    for(String s2:s1){
    HCategory hc=new HCategory();
    hc.setHcategory_name(s2);
    session.save(hc); 
    
    }
     try{
      tx.commit();}catch(Exception e){tx.rollback();}
 String s2[]="Ex-Serviceman,Freedom Fighter,General,N.C.C Cadets,NSS Cadets,Other Backward,Other Backward Caste Creamy Layer,Other Backward Class,Other Caste,Physically Handicapped,Schedule Castes,Schedule Tribes,Special Category,Sports,Wards of Ex-Serviceman,Wards of Para Military Service Personnel".split(",");   
 session.beginTransaction();
   for(String s3:s2){ ACategory ac=new ACategory();
     ac.setAcategory_name(s3);
   session.save(ac);  
   
   }
   try{
      tx.commit();}catch(Exception e){tx.rollback();}
   
    String holy[]="Republic Day,Holi,Mahavir Jayanti,Good Friday,Easter Monday,Labour Day,Polish Constitution Day,Independence Day,Id-ul-Zuha (Bakrid)*,Dussehra,Muharram,Mahatma Gandhi’s Birthday,Diwali,All Saint Day,Guru Nanak’s Birthday,Prophet Mohammad's Birthday (Id-e-Milad)*,Christmas Day".split("\\s+");
    session.beginTransaction();
    for(String holiday:holy){
    Holidays h=new Holidays();
    h.setHoliday_name(holiday);
    session.save(h);
    }
    tx.commit();
}

private int onItemchange(String query1){
  int id=0;
  session.beginTransaction();
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          id=(int)i.next();  
        tx.commit();
 return id;   
}
private String onItemChange(String query1){
  String id=null;
  session.beginTransaction();
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          id=(String)i.next();  
        tx.commit();
 return id;   
}

private void manageSemester(String query1,javax.swing.JCheckBox combo[]){
    long id=0;
    System.out.println("query= "+query1);
    try{
     session.beginTransaction();
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        System.out.println("after query");
        try{
            if(i.hasNext())
            id=(Long)i.next();
        }catch(NullPointerException ne){id=0;}
        System.out.println("id = "+id);
        for(int j=0;j<id;j++){
            System.out.println("checkbox j = "+j);
           combo[j].setEnabled(false);
           
        }
        if(id==0){
                jCheckBox1.setEnabled(true);
                jCheckBox2.setEnabled(true);
                jCheckBox3.setEnabled(true);
                jCheckBox4.setEnabled(true);
                jCheckBox5.setEnabled(true);
                jCheckBox6.setEnabled(true);
                jCheckBox7.setEnabled(true);
                jCheckBox8.setEnabled(true);
        }
      
     tx.commit();
     }catch(Exception e){
         e.printStackTrace();
     }
}
private void manageSemester2(String query1,javax.swing.JCheckBox combo[]){
    long id=0;
    try{
     session.beginTransaction();
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          id=(Long)i.next();  
        for(int j=0;j<id;j++){
           combo[j].setEnabled(false);
           combo[j].setSelected(true);
        }
               try{double amount=0;
       //trade_id=onItemChange("select trade_id from Trade where lower(trade_name)=lower('"+fee_trade.getSelectedItem().toString()+"')"); 
       session.beginTransaction();
        Query query3=session.createQuery("select trade_fee from Trade where lower(trade_name)=lower('"+fee_trade.getSelectedItem().toString()+"') and trade_session in(select trainee_session from Trainee where trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"')");
        List list3=query3.list();
        Iterator i3=list3.iterator();
        if(i3.hasNext())
          amount=(Double)i3.next();
        jTextField23.setText(id*amount+"");
       // jLabel122.setText((id*amount+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
            System.out.println("amount="+amount);
        }catch(Exception e){}
        if(id==0){
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jCheckBox8.setVisible(true);
        jCheckBox1.setEnabled(true);
       jCheckBox1.setSelected(false);
       jCheckBox2.setEnabled(true);
       jCheckBox2.setSelected(false);
       jCheckBox3.setEnabled(true);
       jCheckBox3.setSelected(false);
       jCheckBox4.setEnabled(true);
       jCheckBox4.setSelected(false);
       jCheckBox5.setEnabled(true);
       jCheckBox5.setSelected(false);
       jCheckBox6.setEnabled(true);
       jCheckBox6.setSelected(false);
       jCheckBox7.setEnabled(true);
       jCheckBox7.setSelected(false);
       jCheckBox8.setEnabled(true);
       jCheckBox8.setSelected(false);
        }
        else{
            if(jCheckBox1.isEnabled())
                jCheckBox1.setVisible(false);
            if(jCheckBox2.isEnabled())
                jCheckBox2.setVisible(false);
            if(jCheckBox3.isEnabled())
                jCheckBox3.setVisible(false);
            if(jCheckBox4.isEnabled())
                jCheckBox4.setVisible(false);
            if(jCheckBox5.isEnabled())
                jCheckBox5.setVisible(false);
            if(jCheckBox6.isEnabled())
                jCheckBox6.setVisible(false);
            if(jCheckBox7.isEnabled())
                jCheckBox7.setVisible(false);
            if(jCheckBox8.isEnabled())
                jCheckBox8.setVisible(false);
            
        }
      
     tx.commit();
     }catch(Exception e){
        // e.printStackTrace();
     }
}
private void calculateFees(String id){
  if(fee_student_id.getSelectedIndex()!=0){
      countSem=0;SUBMITTED_SEM=0;
    session.beginTransaction();
        Query query2=session.createQuery("select trade_fee from Trade where lower(trade_name)=lower('"+fee_trade.getSelectedItem().toString()+"') and trade_session in(select trainee_session from Trainee where trainee_session_id='"+id+"')");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
          fees=(Double)i.next();
        
        if(jCheckBox1.isSelected()&&jCheckBox1.isEnabled())
            countSem++;
        if(jCheckBox2.isSelected()&&jCheckBox2.isEnabled())
            countSem++;
        if(jCheckBox3.isSelected()&&jCheckBox3.isEnabled())
            countSem++;
        if(jCheckBox4.isSelected()&&jCheckBox4.isEnabled())
            countSem++;
        if(jCheckBox5.isSelected()&&jCheckBox5.isEnabled())
            countSem++;
        if(jCheckBox6.isSelected()&&jCheckBox6.isEnabled())
            countSem++;
        if(jCheckBox7.isSelected()&&jCheckBox7.isEnabled())
            countSem++;
        if(jCheckBox8.isSelected()&&jCheckBox8.isEnabled())
            countSem++;
        if(!jCheckBox1.isEnabled()){
            SUBMITTED_SEM++;
        }
        if(!jCheckBox2.isEnabled()){
              SUBMITTED_SEM++;
        }
         if(!jCheckBox3.isEnabled()){
              SUBMITTED_SEM++;
        }
          if(!jCheckBox4.isEnabled()){
              SUBMITTED_SEM++;
        }
           if(!jCheckBox5.isEnabled()){
              SUBMITTED_SEM++;
        }
            if(!jCheckBox6.isEnabled()){
              SUBMITTED_SEM++;
        }
             if(!jCheckBox7.isEnabled()){
              SUBMITTED_SEM++;
        }
              if(!jCheckBox8.isEnabled()){
              SUBMITTED_SEM++;
        }
              if(BALANCE>0)jCheckBox11.setSelected(true);
              System.out.println("total SUBMITTED semester = "+SUBMITTED_SEM);
              System.out.println("CHECKED semester = "+countSem);
              System.out.println("TOTAL counted semester = "+(SUBMITTED_SEM+countSem));
              SEMLIST=SUBMITTED_SEM+1+"";
        for(int K=SUBMITTED_SEM+2;K<=SUBMITTED_SEM+countSem;K++)
            SEMLIST+=","+K;
        System.out.println("semester list = "+SEMLIST);
        jTextField23.setText((fees*countSem)+"");
        if(jCheckBox10.isSelected())
            fee_amount.setText(jTextField23.getText());
    
        tx.commit();
        
       // if(!jTextField23.getText().isEmpty()) {
          
        jLabel122.setText((BALANCE+Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+""); //  Float.parseFloat(jTextField23.getText())+
//        }
//       else
//        jLabel122.setText((Float.parseFloat(jTextField23.getText())+Float.parseFloat(jTextField24.getText())+Float.parseFloat(jTextField25.getText())+Float.parseFloat(jTextField26.getText())+Float.parseFloat(jTextField27.getText())+Float.parseFloat(jTextField28.getText())+Float.parseFloat(jTextField29.getText())+Float.parseFloat(jTextField30.getText())+Float.parseFloat(jTextField31.getText()))+"");
         if(fee_discount.getText().contains("%")){
            double d=Float.parseFloat(fee_discount.getText().substring(0, fee_discount.getText().length()-1));
            fee_balance.setText(Float.parseFloat(jLabel122.getText())-Double.parseDouble(jTextField23.getText())+(Double.parseDouble(jTextField23.getText())*(1-d*0.01)-Double.parseDouble(fee_amount.getText()))+"");
        }
        else{ 
            fee_balance.setText((Double.parseDouble(jLabel122.getText())-Float.parseFloat(fee_discount.getText())-Double.parseDouble(fee_amount.getText()))+"");
        }
}

}
private ImageIcon resizeImage(String imagepath){
  ImageIcon icon=new ImageIcon(imagepath);
  Image image=icon.getImage();//new ImageIcon(new ImageIcon("").getImage().getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH));
  Image newImg=image.getScaledInstance(photo_container.getWidth(), photo_container.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon imageicon=new ImageIcon(newImg);
  return imageicon;
}
private static void copyFileUsingJava7Files(File source, File dest)
        throws IOException {
    Files.copy(source.toPath(), dest.toPath());

}

void uploadHoliday(String path){
    Object obj[][]=new ReadExceldemo().uploadFile(path,"Holidays", null);
    try{
    for(int i=1;i<obj.length;i++)
    { session.beginTransaction();
    Holidays h=new Holidays();
        for(int j=0;j<obj[0].length;j++)
        {   if(j==0){
            h.setHoliday_date((Date)obj[i][j]);
             
        }
        else if(j==1){
            h.setHoliday_day(obj[i][j]+"");
            }
        else
        { h.setHoliday_name(obj[i][j]+"");
             }
        }
        
        
        session.save(h);
     tx.commit();
    }
    }catch(Exception e){e.printStackTrace();}
     
}

void uploadBank(String path){
    Object obj[][]=new ReadExceldemo().uploadFile(path,"BankName", null);
    
    try{
    for(int i=1;i<obj.length;i++)
    {       
       session.beginTransaction();
            Bank h=new Bank(); bank_id=generateId("B","select max(cast(substr(bank_id,2) as integer)) from Bank");
        
            h.setBank_id(bank_id);
            h.setBank_name(obj[i][0]+"");
            
              session.save(h);
     tx.commit();
       
   
    }}catch(Exception e){e.printStackTrace();}
     
}
void generateDataforExcel(String fileName,String sheetName,String query1,Object column[]){
//    System.out.println("generating excel............................");
    Map<String,Object[]> data=new HashMap();
    int key=1;
    data.put(key+"",column);
    key++;
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        while(i.hasNext()){
        data.put(key+"", (Object[])i.next());
        key++;
        }
   //   JOptionPane.showMessageDialog(null, key+" Records found !");
     createExcelFile(fileName, sheetName, data);  
}
void generateDataforExcel1(String fileName,String sheetName,String query1,Object column[]){
//    System.out.println("generating excel............................");
    Map<String,Object[]> data=new HashMap();
    int key=1;
    data.put(key+"",column);
    key++;
    Query query2=session.createQuery(query1);
        List list=query2.list();
        Iterator i=list.iterator();
        while(i.hasNext()){
        data.put(key+"", (Object[])i.next());
        key++;
        }
      JOptionPane.showMessageDialog(null, key+" Records found !");
     createExcelFile(fileName, sheetName, data,key+"",jLabel131);  
}
void createExcelFile(String fileName,String sheetName,Map<String,Object[]> data){
     System.out.println("creating excel............................");
    data = new TreeMap<String,Object[]>(data);
    XSSFWorkbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet(sheetName);
                    
                Set<String> keyset = data.keySet();
		int rownum = 0;
                System.out.println("writing data............................");
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object [] objArr=data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
                                sheet.autoSizeColumn(cellnum,true);
                                sheet.setDefaultColumnWidth(50);
				Cell cell = row.createCell(cellnum++);
                                
				if(obj instanceof Date){ 
                                  XSSFCellStyle my_style_1 = workbook.createCellStyle();
                                  my_style_1.setDataFormat(HSSFDataFormat.getBuiltinFormat("d-mmm-yy"));
					cell.setCellValue((Date)obj);
                                        cell.setCellStyle(my_style_1);
                                        System.out.print((Date)obj+" \t");
                                  }
				else if(obj instanceof Boolean){cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
					cell.setCellValue((Boolean)obj);
                                System.out.print((Boolean)obj+" \t");
                                }
				else if(obj instanceof String){ 
                                       
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
					cell.setCellValue((String)obj);
                                       
                                System.out.print((String)obj+" \t");
                                }
				else if(obj instanceof Double){ 
                                   
                                        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
					cell.setCellValue((Double)obj);
                                   
                                    System.out.print((Double)obj+" \t");
                                }
                                else if(obj instanceof Integer){cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                              
					cell.setCellValue((Integer)obj);
                               
                                        System.out.print((Integer)obj+" \t");
                                }
                                else if(obj instanceof Float){cell.setCellType(Cell.CELL_TYPE_NUMERIC);
					cell.setCellValue((Float)obj);
                                 System.out.print((Float)obj+" \t");
                                }
                                else if(obj instanceof BigDecimal){cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                                BigDecimal value=(BigDecimal)obj;
					cell.setCellValue(value.floatValue());
                                 System.out.print(value.floatValue()+" \t");
                                }
                                else if(obj==null){ 
                                cell.setCellType(Cell.CELL_TYPE_BLANK);
                                cell.setCellValue("");
                                System.out.print(" \t");
                                }
			}
                       // System.out.println("key="+key);
                        System.out.println();
		}
                
                 try {FileOutputStream outputStream = new FileOutputStream(fileName) ;
                        workbook.write(outputStream);
                  //   System.out.println("excel file created");
            JOptionPane.showMessageDialog(null, "Excel file created");
                 }catch(Exception e){e.printStackTrace();}
        }
void createExcelFile(String fileName,String sheetName,Map<String,Object[]> data,String totalrecords,javax.swing.JLabel label){
//     System.out.println("creating excel............................");
    data = new TreeMap<String,Object[]>(data);
    XSSFWorkbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet(sheetName);
                    
                Set<String> keyset = data.keySet();
		int rownum = 0;
//                System.out.println(totalrecords+" writing data............................");
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object [] objArr=data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
                                sheet.autoSizeColumn(cellnum,true);
                                sheet.setDefaultColumnWidth(50);
				Cell cell = row.createCell(cellnum++);
                                
				if(obj instanceof Date){ 
                                  XSSFCellStyle my_style_1 = workbook.createCellStyle();
                                  my_style_1.setDataFormat(HSSFDataFormat.getBuiltinFormat("d-mmm-yy"));
					cell.setCellValue((Date)obj);
                                        cell.setCellStyle(my_style_1);
//                                        System.out.print((Date)obj+" \t");
                                  }
				else if(obj instanceof Boolean){cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
					cell.setCellValue((Boolean)obj);
//                                System.out.print((Boolean)obj+" \t");
                                }
				else if(obj instanceof String){ 
                                       
                                    cell.setCellType(Cell.CELL_TYPE_STRING);
					cell.setCellValue((String)obj);
                                       
//                                System.out.print((String)obj+" \t");
                                }
				else if(obj instanceof Double){ 
                                   
                                        cell.setCellType(Cell.CELL_TYPE_NUMERIC);
					cell.setCellValue((Double)obj);
                                   
//                                    System.out.print((Double)obj+" \t");
                                }
                                else if(obj instanceof Integer){cell.setCellType(Cell.CELL_TYPE_NUMERIC);
                              
					cell.setCellValue((Integer)obj);
                               
//                                        System.out.print((Integer)obj+" \t");
                                }
                                else if(obj instanceof Float){cell.setCellType(Cell.CELL_TYPE_NUMERIC);
					cell.setCellValue((Float)obj);
//                                 System.out.print((Float)obj+" \t");
                                }
                                else if(obj==null){ 
                                cell.setCellType(Cell.CELL_TYPE_BLANK);
                                cell.setCellValue("");
//                                System.out.print(" \t");
                                }
			}
                       // System.out.println("key="+key);
//                        System.out.println();
                         jLabel131.setText("Total Records: "+totalrecords+", Record no.: "+rownum);
                          jLabel131.paintImmediately(jLabel131.getVisibleRect());
//                        System.out.println("Total Records: "+totalrecords+", Record no.: "+rownum);
                       
		}
                
                 try {FileOutputStream outputStream = new FileOutputStream(fileName) ;
                        workbook.write(outputStream);jLabel131.setText("");
                  //   System.out.println("excel file created");
            JOptionPane.showMessageDialog(null, "Excel file created");
                 }catch(Exception e){e.printStackTrace();}
        }
                
                
void autocomplete_text(){
  AutoCompleteDecorator.decorate(session_id_cbx);
  AutoCompleteDecorator.decorate(jComboBox1);
  AutoCompleteDecorator.decorate(jComboBox5);
  AutoCompleteDecorator.decorate(jComboBox10);
  AutoCompleteDecorator.decorate(jComboBox11);
  AutoCompleteDecorator.decorate(jComboBox12);
  AutoCompleteDecorator.decorate(jComboBox13);
  AutoCompleteDecorator.decorate(jComboBox15);
  AutoCompleteDecorator.decorate(trainee_trade);
  AutoCompleteDecorator.decorate(trainee_qualification);
  AutoCompleteDecorator.decorate(fee_student_id);
  AutoCompleteDecorator.decorate(fee_trade);
  AutoCompleteDecorator.decorate(fee_bank_name);
  AutoCompleteDecorator.decorate(fee_branch_name);
}
public static byte[] serialize(Object obj) throws IOException {
        try(ByteArrayOutputStream b = new ByteArrayOutputStream()){
            try(ObjectOutputStream o = new ObjectOutputStream(b)){
                o.writeObject(obj);
            }
            return b.toByteArray();
        }
}
private void addDataToTree(String query1,javax.swing.JTree tree){
DefaultTreeModel model=(DefaultTreeModel)tree.getModel();
    DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
    root.removeAllChildren();
    DefaultMutableTreeNode selectedNode=selectedNode=(DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
    Query query2=session.createQuery(query1);
        List<DefaultMutableTreeNode> list=query2.list();
        Iterator i=list.iterator();
        while(i.hasNext()){
            Object obj=i.next();
       DefaultMutableTreeNode top=new DefaultMutableTreeNode(obj);
            String s[]=listFiles("StudentsImages",obj+"_");
            for(String s2:s)
                top.add(new DefaultMutableTreeNode(s2));
             root.add(top);
              }
        //expandAllNodes(tree, 0, tree.getRowCount());
}
private void insertNode(String node[],DefaultMutableTreeNode root){
     DefaultTreeModel model=(DefaultTreeModel)jTree1.getModel();
     for(int i=0;i<node.length;i++)
     model.insertNodeInto(new DefaultMutableTreeNode(node[i]),root, root.getChildCount());
}

private String[] listFiles(String path,String prefix){
    File dir = new File(path);
    File[] foundFiles = dir.listFiles(new FilenameFilter() {public boolean accept(File dir, String name) { 
                                                             return name.contains(prefix)&& name.startsWith(prefix);
                                                                  }
                                                                    });
    String files[]=new String[foundFiles.length];
    int i=0;
    for(File f:foundFiles){
        files[i]=f.getName();
    i++;
    }
return files;
}

private void expandAllNodes(javax.swing.JTree tree, int startingIndex, int rowCount){
    for(int i=startingIndex;i<rowCount;++i){
        tree.expandRow(i);
    }

//    if(tree.getRowCount()!=rowCount){
//        expandAllNodes(tree, rowCount, tree.getRowCount());
//    }
}
private void reset_instructor(){
    jComboBox5.setSelectedIndex(0);
    jDateChooser6.setDate(null);
    jComboBox6.setSelectedIndex(0);
    jTextField2.setText(null);
    jComboBox7.setSelectedIndex(0);
    jLabel82.setText("No Image Selected");
    jTextField3.setText(null);
    jTextArea1.setText(null);
    jComboBox10.setSelectedIndex(0);
    jComboBox11.setSelectedIndex(0);
    jTextField8.setText(null);
    jTextField9.setText(null);
    jTextField4.setText(null);
    jComboBox8.setSelectedIndex(0);
    jComboBox9.setSelectedIndex(0);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jTextField7.setText(null);
    jComboBox12.setSelectedIndex(0);
    jDateChooser7.setDate(null);
    jTextField10.setText(null);
    jTextField11.setText(null);
    jTextField12.setText(null);
    jTextField13.setText(null);
    jComboBox13.setSelectedIndex(0);
    jDateChooser8.setDate(null);
    jTextField14.setText(null);
    jTextField15.setText(null);
    jTextField16.setText(null);
    jTextField17.setText(null);
    jTextField22.setText(null);
    jLabel101.setIcon(null);
     getDataInCombo("select instructor_uid from Instructor", jComboBox5);
}
private void reset_salary(){
        jTextField18.setText(null);
        jTextField19.setText(null);
        jTextField20.setText(null);
        jComboBox14.setSelectedIndex(0);
        jComboBox15.setSelectedIndex(0);
        jDateChooser10.setDate(new Date());
        getTableData("select i.instructor_uid,i.instructor_name,s.instructor_salary,s.payment_mode from Instructor i,Salary s where i.instructor_uid=s.salary_instructor_uid", jTable7);
}
private void reset_button_color(){
    student_registration_btn.setBackground(null);
    student_fee_btn.setBackground(null);
    staff_manage_btn.setBackground(null);
    trade_btn.setBackground(null);
    bank_details_btn.setBackground(null);
    holiday_btn.setBackground(null);
    reports_btn.setBackground(null); 
    reports_btn1.setBackground(null); 
    staff_salary_btn.setBackground(null);
    attendance_btn.setBackground(null);
}
private void reset_user(){
    jTextField32.setText(null);
     jTextField33.setText(null);
     jPasswordField2.setText(null);
     jPasswordField3.setText(null);
     getTableData("select userId,userName,createdDate,createdBy from Login", jTable9);
}
private void disable_button(){
    student_registration_btn.setEnabled(false);
    student_fee_btn.setEnabled(false);
    staff_manage_btn.setEnabled(false);
    trade_btn.setEnabled(false);
    bank_details_btn.setEnabled(false);
    holiday_btn.setEnabled(false);
    reports_btn.setEnabled(false);
    staff_salary_btn.setEnabled(false);
    attendance_btn.setEnabled(false);
    reports_btn1.setEnabled(false);
    jButton40.setEnabled(false);
    jButton39.setEnabled(false);
    daybook_btn.setEnabled(false);
}
  void createPdf(String st_id){
       try{ session.beginTransaction();
       Trainee t=session.load(Trainee.class, st_id);
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("StudentsImages\\"+st_id+".pdf"));
       document.open();
     //  ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER,new Phrase(t.getTrainee_session_id(),FontFactory.getFont(null, Font.BOLD)),(document.right()-document.left())/2 + document.leftMargin(),document.top()+5 , 0);
       ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER,new Phrase("Registration Form"),(document.right()-document.left())/2 + document.leftMargin(),document.top() + 10, 0);
       PdfPTable table = new PdfPTable(12);
            table.setWidthPercentage(100);
            PdfPCell cell = null;
            cell = new PdfPCell(com.itextpdf.text.Image.getInstance("images\\cpiti.jpg"), true);
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            //for space
            cell=new PdfPCell(new Phrase("\t"));
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("CHANDRA PRIVATE INDUSTRIAL TRAINING INSTITUTE"));
            cell.setColspan(6);
            cell.setBorder(Rectangle.TOP|Rectangle.BOTTOM);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            //for space
            cell=new PdfPCell(new Phrase("\t"));
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
       cell=new PdfPCell(com.itextpdf.text.Image.getInstance(t.getTrainee_photo()),true);
       cell.setColspan(2);cell.setBorder(0);
       cell.setRowspan(3);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase("NAHAR ROAD, CHOWDHARY PURWA, JANKIPURAM, LUCKNOW.",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
       cell.setColspan(6);cell.setBorder(0);
       cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase("Website-www.cpitil.in Email- cpitil@rediffmail.com\nCONTACT NO.–9125615587, 9415424827, 9120499876",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
       cell.setColspan(6);cell.setBorder(0);
       cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase(""));
       cell.setColspan(12);
       cell.setBorder(0);
       document.add(table);
     Font  font=FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD);
       table=new PdfPTable(4);
       table.setWidthPercentage(100);
       cell=new PdfPCell(new Phrase("Trade :"+t.getTrainee_trade_name(),font));
       cell.setBorder(0);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase("Shift :"+t.getTrainee_trade_shift(),font));
       cell.setBorder(0);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase("Unit :"+t.getTrainee_trade_unit(),font));
       cell.setBorder(0);
       table.addCell(cell);
       cell=new PdfPCell(new Phrase("\t\t\t\tID :"+t.getTrainee_session_id(),FontFactory.getFont(FontFactory.TIMES_ROMAN, 12,Font.BOLD)));
       cell.setBorder(0);
       table.addCell(cell);
       document.add(table);
      
       
         String s=null;
         float f[]=new float[30];
         for(int i=0;i<30;i++)
             f[i]=.25f;
         table=new PdfPTable(f);
         table.setWidthPercentage(100);
         
         //Name-
        addCell(table,cell,"Name-",t.getTrainee_name(),"");
         //Father Name
         addCell(table,cell,"Father Name-",t.getTrainee_father_name(),"");
         //Mother Name
         addCell(table,cell,"Mother Name-",t.getTrainee_mother_name(),"");
         //Postal Address
         addCell(table,cell,"Postal Address-",t.getTrainee_address(),"");
         //Mobile No
         addCell(table,cell,"Mobile No.-","+91"+t.getTrainee_mobile_no(),"");
         // for Gap
         cell=new PdfPCell(new Phrase("\n"));
         cell.setBorder(0);
         cell.setColspan(30);
         table.addCell(cell);
         //Email ID
         cell=new PdfPCell(new Phrase("E-mail ID:",font));
         cell.setBorder(0);
         cell.setColspan(5);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(t.getTrainee_email(),font));
         cell.setBorder(Rectangle.BOTTOM);
         cell.setColspan(25);
         table.addCell(cell);
         //Date of Birth
         cell=new PdfPCell(new Phrase("Date of Birth :",font));
         cell.setBorder(0);
         cell.setColspan(5);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(new SimpleDateFormat("dd-MMM-yyyy").format(t.getTrainee_date_of_birth()),font));
         cell.setColspan(8);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Gender
         cell=new PdfPCell(new Phrase("",font));
         cell.setColspan(2);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("Gender: ",font));
         cell.setColspan(3);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(t.getTrainee_gender(),font));
         cell.setColspan(12);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Category
         cell=new PdfPCell(new Phrase("Category-",font));
         cell.setColspan(5);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(t.getTrainee_category(),font));
         cell.setColspan(8);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Religion
         cell=new PdfPCell(new Phrase("",font));
         cell.setColspan(2);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("Religion-",font));
         cell.setColspan(3);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(" ",font));
         cell.setColspan(12);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Nationality
         cell=new PdfPCell(new Phrase("Nationality-",font));
         cell.setColspan(5);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("Indian",font));
         cell.setColspan(8);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Minority
         cell=new PdfPCell(new Phrase("",font));
         cell.setColspan(2);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("Minority-",font));
         cell.setColspan(3);
         cell.setHorizontalAlignment(Rectangle.ALIGN_LEFT);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(t.getTrainee_minority_category(),font));
         cell.setColspan(12);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         //Aadhar Card No
         cell=new PdfPCell(new Phrase("Aadhar Card No-",font));
         cell.setColspan(5);
         cell.setBorder(0);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase(t.getTrainee_aadhar_no(),font));
         cell.setColspan(27);
         cell.setBorder(Rectangle.BOTTOM);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("\n"));
         cell.setColspan(30);
         cell.setBorder(0);
         table.addCell(cell);
          //ACADEMIC QUALIFICATIONS:-
         cell=new PdfPCell(new Phrase("ACADEMIC QUALIFICATIONS:-",font));
         cell.setColspan(30);
         cell.setBorder(0);
         table.addCell(cell);
         document.add(table);
        
         table=new PdfPTable(new float[]{.25f,1f,2f,1f,1f,1f,3f});
         table.setWidthPercentage(100);
          font=FontFactory.getFont(FontFactory.COURIER, 8);
         cell=new PdfPCell(new Phrase("S.No",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("EXAM QUALIFIED",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("BOARD/INSTITUTE NAME",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("PASSING YEAR",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("DIVISION",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("MARKS OBTAIN",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         cell=new PdfPCell(new Phrase("SUBJECT NAME ",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
         String as[]={t.getTrainee_qualification(),"","","","",""};
         for(int j=1;j<=5;j++)
         for(int i=1;i<8;i++){
             if(i==1){
             cell=new PdfPCell(new Phrase(j+"",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
             table.addCell(cell);}else if(j==1){
             cell=new PdfPCell(new Phrase(as[i-2]+"",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
             table.addCell(cell);}
             else
             {
                cell=new PdfPCell(new Phrase("",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
             table.addCell(cell); 
             }
         }
         cell=new PdfPCell(new Phrase("\nNOTE: BRING TWO COPIES OF EACH –ACADEMIC QUALIFICATION,ADHAR,  BIRTH CERTIFICATE, CASTE CERTIFICATE, AND 04 PASSPORT SIZE PHOTOGRAFH AND SHOULD BE SELF ATTESTED",font));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         cell.setColspan(7);
         cell.setBorder(0);
         table.addCell(cell);
         document.add(table);
         ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("INSTITUTE RULES AND REGULATION", new Font(Font.FontFamily.HELVETICA, 12, Font.UNDERLINE)),(document.right() - document.left()) / 2 + document.leftMargin(), document.bottom() + 70, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("• 80% Attendance is compulsory. Otherwise trainee will not be allowed to appear in semester examination.", new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL)),30, document.bottom() + 50, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("• Any kind of indiscipline and misconduct behavior can lead to expel from the institute.", new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL)), 30, document.bottom() + 40, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("• If any information filled by candidate is found false on later admission stage, his/her admission will be cancelled and fees will not be refunded to such ", new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL)), 30, document.bottom() + 30, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("  a candidate.", new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL)), 30, document.bottom() + 20, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("• This form doesn’t guarantee the admission of candidate till verifications of documents and further procedure of admission.", new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL)), 30, document.bottom() + 10, 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("The institute reserves the right to alter the course content of the program ,rules and regulations ,teaching schedule ,fees payable ,living ", new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD)), 30, document.bottom(), 0);
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("charges and/or any other matter pertaining  to its working . The director’s decision will be deemed as final in all such matters.", new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD)), 30, document.bottom()-10, 0);
         document.newPage();
        Paragraph p=new Paragraph("\nDECLARATION",new Font(Font.FontFamily.HELVETICA, 8, Font.UNDERLINE|Font.BOLD));
         p.setAlignment(Element.ALIGN_CENTER);
         document.add(p);
         int len="District……………………….hereby declare that all the information provided by me is true as of my knowledge and if ".length();
            String str="I……               \t"+t.getTrainee_name()+"             \t\t       S/o or D/o ……   "+t.getTrainee_father_name()+"…………";
            while(str.length()<len)
                str+=".";
            String str1="Address…            "+t.getTrainee_address()+"……………..Post……………………………………..";
            while(str1.length()<len)
                str1+=".";
            document.add(new Paragraph("\n"+str+"\n"+str1+"\nDistrict……………………….hereby declare that all the information provided by me is true as of my knowledge and if \nany information found false on the lateral stage of admission, my admission should be get cancelled.\n\n", new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
            document.add(new Paragraph("\nGuardian\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCandidate ", new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
            document.add(new Paragraph("\nSignature\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsignature", new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
            p = new Paragraph("");
            DottedLineSeparator dottedline = new DottedLineSeparator();
            dottedline.setOffset(-2);
            dottedline.setGap(2f);
            p.add(dottedline);
            document.add(p);
            p = new Paragraph("\n\n(for Official use Only)", new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC));
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            str="Name -…...  "+t.getTrainee_name()+"    ..............";
            while(str.length()<len)
                str+=".";
            str1="Father name -……………"+t.getTrainee_father_name()+".……………………..";
            while(str1.length()<len)
                str1+=".";
            String str2="Documents are verified and has been given permission for admission in…\t\t"+t.getTrainee_trade_name()+"\t\t..trade.";
            while(str2.length()<len)
                str2+=".";
            document.add(new Paragraph("\n"+str+"\n"+str1+"\n"+str2+"\n\n", new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
         document.add(new Paragraph("\nVerification officer Sign\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPrincipal Sign ",new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
         document.add(new Paragraph("\nCandidate registration number\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDirector Sign",new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL)));
         document.close();
         tx.commit();
            Desktop.getDesktop().open(new File("StudentsImages\\"+st_id+".pdf"));
        }catch(Exception e){} 
    }
     PdfPTable addCell(PdfPTable table,PdfPCell cell,String header,String name,String pin){
         name+=" ";
         Font  font=FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD);
        int len=(name.length()>30)?(30*Math.round((float)name.length()/30)):30;
         len=(len-name.length()<10 && pin!=null)?len+30:len;
        for(int i=name.length();i<len;i++){
            if(i==len-10)
                name+=pin;
            else
                name+=" ";
        }
       
        cell=new PdfPCell(new Phrase(header,font));
        cell.setColspan(30);
        cell.setBorder(0);
        table.addCell(cell);
         for(int i=0;i<len;i++){
             if(i<name.length()){
         cell=new  PdfPCell(new Phrase(name.charAt(i)+"",font));
         cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);
             }else{
         cell=new  PdfPCell(new Phrase(""));
         cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
         table.addCell(cell);}
         }
         return  table;
    }
      void createPdf(String id,String comb_id,String trainee_id){
         try {
            Document document = new Document(PageSize.A4, 80, 80, 30, 10);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("StudentsImages\\"+id+comb_id+".pdf"));
            document.open();
            ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Fee Receipt"), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
            createReceipt(document, writer, id, comb_id, trainee_id);
             
            PdfPTable table=new PdfPTable(5);
            PdfPCell cell=new PdfPCell(new Phrase("\n"));
            cell.setColspan(5);
            cell.setBorder(0);
            table.addCell(cell);   
            document.add(table);
            int height=(int)table.getTotalHeight();
            table=new PdfPTable(5);      
            while(height<document.getPageSize().getHeight()/2){
                cell=new PdfPCell(new Phrase("\n"));
            cell.setColspan(5);
            cell.setBorder(0);
            table.addCell(cell);
               height+=150;
            }
           document.add(table);
           String s="";
           for(int i=0;i<document.getPageSize().getWidth();i++)
               s+="-----";
           ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(s), (document.right() - document.left()) / 2 + document.leftMargin(), document.getPageSize().getHeight()/2, 0);
           ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Fee Receipt"), (document.right() - document.left()) / 2 + document.leftMargin(), document.getPageSize().getHeight()/2-10 , 0);
            createReceipt(document,writer, id, comb_id, trainee_id);
            document.close();
            Desktop.getDesktop().open(new File("StudentsImages\\"+id+comb_id+".pdf"));
         }catch(Exception e){}
    }
private  void createReceipt(Document document,PdfWriter writer,String receipt_no,String comb_id,String trainee_id){
         
          try {

           // ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Receipt"), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
            PdfPTable table = new PdfPTable(12);
            table.setWidthPercentage(100);
            PdfPCell cell = null;
            // getClass().getResource("/images/cpiti.jpg")
            cell = new PdfPCell(com.itextpdf.text.Image.getInstance(getClass().getResource("/images/cpiti.jpg")), true);
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            //for space
            cell=new PdfPCell(new Phrase(""));
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("CHANDRA PRIVATE INDUSTRIAL TRAINING INSTITUTE"));
            cell.setColspan(6);
            cell.setBorder(Rectangle.TOP|Rectangle.BOTTOM);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            //for space
            cell=new PdfPCell(new Phrase(""));
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setRowspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("NAHAR ROAD, CHOWDHARY PURWA, JANKIPURAM, LUCKNOW.", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
            cell.setColspan(6);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Website-www.cpitil.in Email- cpitil@rediffmail.com\nCONTACT NO.–9125615587, 9415424827, 9120499876", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
            cell.setColspan(6);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            //Bottom Border
            cell = new PdfPCell(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(12);
            cell.setBorder(Rectangle.BOTTOM);
            table.addCell(cell);
            // student details
            cell = new PdfPCell(new Phrase("No.", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setBorder(0);cell.setColspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(receipt_no, FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(6);
            cell.setBorder(0);
            table.addCell(cell);
            session.beginTransaction(); Fee_Details f=session.load(Fee_Details.class,receipt_no);
            cell = new PdfPCell(new Phrase("Date\t", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(new SimpleDateFormat("dd-MMM-yyyy").format(f.getFee_cheque_date()), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            tx.commit();
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            //second row
            session.beginTransaction();
            Trainee t=session.load(Trainee.class,comb_id);
            //name
            cell = new PdfPCell(new Phrase("Name. \t", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setBorder(0);cell.setColspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(t.getTrainee_name(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(6);
            cell.setBorder(0);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("ID No. \t", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(t.getTrainee_session_id(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            
            //trade and semester
            cell = new PdfPCell(new Phrase("Trade. \t", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setBorder(0);cell.setColspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(t.getTrainee_trade_name(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(6);
            cell.setBorder(0);
            table.addCell(cell);
            
            String mobile_no=(t.getTrainee_mobile_no()!=null)?t.getTrainee_mobile_no():"";
            tx.commit();
         Query   query2=session.createQuery("select semList from Fee_Details where fee_receipt_no='"+receipt_no+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        Object ob[]=list.toArray();
     
            cell = new PdfPCell(new Phrase("Semester \t", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(ob[0]+"", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            table.addCell(cell);
            
            //mobile no
            cell = new PdfPCell(new Phrase("Mobile No  ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);
            cell.setBorder(0);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase((mobile_no!=null && !mobile_no.equals("null")?mobile_no:""), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(10);
            cell.setBorder(0);
            table.addCell(cell);
            
            //space new linw
            cell = new PdfPCell(new Phrase("\n", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
            cell.setColspan(12);
            cell.setBorder(0);
            table.addCell(cell);
            //discription
            cell = new PdfPCell(new Phrase("S.No.", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Particulars", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(8);cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Rs.", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setColspan(2);cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Ps.", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
            table.addCell(cell);
          
          
             Object[][] arr = new Object[10][];
        int key=0;
       query2=session.createQuery("select feetype,feetype_amount from FeeType where feetype_receipt_no='"+receipt_no+"' and feetype_id like '"+receipt_no+"_'");
         list=query2.list();
        Iterator it=list.iterator();
        double sum=0;
        while(it.hasNext()){
           
        arr[key]=(Object[])it.next();
         for(int j=0;j<2;j++){
                    
                if( j==0)
                { 
                    cell = new PdfPCell(new Phrase(key+1+"", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.NO_BORDER);
                    cell.setCellEvent(new DottedCell(PdfPCell.TOP));
                    table.addCell(cell);
                    
                        cell = new PdfPCell(new Phrase(arr[key][j]+"", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));cell.setColspan(8);
                        cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                        cell.setBorder(PdfPCell.NO_BORDER);
                        cell.setCellEvent(new DottedCell(PdfPCell.TOP));
                        table.addCell(cell);
                }else if(j==1){ 
                sum+=(Double)(arr[key][j]);
                String s=arr[key][j]+"";
                    cell = new PdfPCell(new Phrase(s.substring(0, s.indexOf(".")), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setColspan(2);cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.NO_BORDER);
                    cell.setCellEvent(new DottedCell(PdfPCell.TOP));
                    table.addCell(cell);
                        cell = new PdfPCell(new Phrase(s.substring(s.indexOf(".")+1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                        cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                        cell.setBorder(PdfPCell.NO_BORDER);
                        cell.setCellEvent(new DottedCell(PdfPCell.TOP));
                        table.addCell(cell); 
                }
               
              
                }
            key++;
        }
        list.clear();
        query2=session.createQuery("SELECT fee_amount,balance FROM Fee_Details WHERE fee_receipt_no='"+receipt_no+"'");
         list=query2.list();
        Iterator it1=list.iterator();
        sum=0;
        if(it1.hasNext()){
            Object obj[]=(Object[])it1.next();
            String s=obj[0]+"";
            // SERIAL NUMBER
            cell = new PdfPCell(new Phrase("Paid ", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            // PAID AMOUNT
             cell = new PdfPCell(new Phrase(new originalNumToLetter().convertAll(obj[0]+""), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                    cell.setColspan(8);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            // PAID AMOUNT
            cell = new PdfPCell(new Phrase(s.substring(0, s.indexOf(".")), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setColspan(2);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            //set 00 to cell
               cell = new PdfPCell(new Phrase(s.substring(s.indexOf(".")+1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
              // SERIAL NUMBER
             cell = new PdfPCell(new Phrase("Balance", FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            // BALANCE AMOUNT 
             s=obj[1]+"";
             cell = new PdfPCell(new Phrase(new originalNumToLetter().convertAll(obj[1]+""), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setColspan(8);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            // BALANCE AMOUNT 
            cell = new PdfPCell(new Phrase(s.substring(0, s.indexOf(".")), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setColspan(2);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
            //set 00 to cell
               cell = new PdfPCell(new Phrase(s.substring(s.indexOf(".")+1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8)));
                    cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);cell.setFixedHeight(15f);
                    cell.setBorder(PdfPCell.TOP+PdfPCell.BOTTOM);
                    table.addCell(cell);
        }
           


                    
                    cell=new PdfPCell(new Phrase("\n\nAuthorised Signatory"));
                    cell.setBorder(0);
                    cell.setColspan(12);
                    table.addCell(cell);
            document.add(table);

          //  document.close();
         //   manipulatePdf();
           // Desktop.getDesktop().open(new File("StudentsImages\\"+receipt_no+trainee_id+".pdf"));
         }catch(Exception e){e.printStackTrace();}
     }
 private static void searchTree(JTree tree, TreePath path, String q) {
        Object o = path.getLastPathComponent();
        if (o instanceof TreeNode) {
            TreeNode node = (TreeNode) o;
            if (node.toString().startsWith(q)) {
                tree.expandPath(path.getParentPath());
                tree.scrollPathToVisible(path.getParentPath());

            }
            if (!node.isLeaf() && node.getChildCount() >= 0) {
                Enumeration e = node.children();
                while (e.hasMoreElements()) {
                    searchTree(tree, path.pathByAddingChild(e.nextElement()), q);
                }
            }
        }
    }
 private TreePath find(DefaultMutableTreeNode root, String s) {
    @SuppressWarnings("unchecked")
    Enumeration<DefaultMutableTreeNode> e = root.depthFirstEnumeration();
    while (e.hasMoreElements()) {
        DefaultMutableTreeNode node = e.nextElement();
        if (node.toString().equalsIgnoreCase(s)) {
            return new TreePath(node.getPath());
        }
    }
    return null;
}

    private static void collapseAll(JTree tree, TreePath parent) {
        TreeNode node = (TreeNode) parent.getLastPathComponent();
        if (!node.isLeaf() && node.getChildCount() >= 0) {
            Enumeration e = node.children();
            while (e.hasMoreElements()) {
                TreeNode n = (TreeNode) e.nextElement();
                TreePath path = parent.pathByAddingChild(n);
                collapseAll(tree, path);
            }
        }
        tree.collapsePath(parent);
    }

    void filterdata(){
        DefaultTableModel dtm=(DefaultTableModel)jTable5.getModel();
       for(int i=dtm.getRowCount()-1;i>=0;i--)
        dtm.removeRow(i);
        session.beginTransaction();
    Query query2=session.createQuery("select fee_receipt_no from Fee_Details where fee_trainee_session_id='"+jTextField34.getText()+"'");
        List list=query2.list();
       Object frn[]=list.toArray();
     Arrays.sort(frn,new AlphanumericSorting());
       for(Object o:frn){
       query2=session.createQuery("select distinct f.fee_receipt_no,f.fee_trainee_session_id,t.trainee_name,t.trainee_trade_name,f.fee_amount,f.balance,f.fee_disc,f.fee_cheque_date,f.fee_total_semester,f.fee_remarks,f.createdBy,t.trainee_id from Fee_Details  f ,Trainee  t where t.trainee_session_id=f.fee_trainee_session_id and f.fee_receipt_no='"+o+"'");
         list=query2.list();
         Iterator i=list.iterator();
         if(i.hasNext())
             dtm.addRow((Object[])i.next());
       }
       
       tx.commit();
    }
    void allIdReport(String query){
        try{ 
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("StudentsImages\\AllIdReport"+new SimpleDateFormat("dd-MMM-yyyy").format(new Date())+".pdf")));
        document.open();
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Balance Of All ID NO"), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
        String s[]="S.No,ID No,Name,Phone no,Total Sem. Fee,Collected Amt,Balance".split(",");
        PdfPTable table=new PdfPTable(new float[]{.5f,.75F,2,2,1,1,1});
        table.setWidthPercentage(110);
        PdfPCell cell;// Header 
                     cell=new PdfPCell(new Phrase(s[0]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[1]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[2]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[3]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[4]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[5]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(s[6]));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     //count session id
                     List list_id=new ArrayList();
                      session.beginTransaction();
                    Query query2=session.createQuery(query);

                        List list=query2.list();
                        Iterator it=list.iterator();
                        while(it.hasNext()){
                            Object obj[]=(Object[])it.next();
                            list_id.add(obj[0]);

                        }
                    Object unsort[]=list_id.toArray();
                    Arrays.sort(unsort,new AlphanumericSorting());
        //Table Heading
        String trade_session;
         session.beginTransaction();
          int sno=1;double sum=0;
          if(query.contains("where"))
              query=query+" and";
          else
             query=query+" where"; 
         for(Object us:unsort){
     query2=session.createQuery(query+" t.trainee_session_id='"+us+"'");
         list=query2.list();
        Iterator i=list.iterator();
      
        if(i.hasNext()){
        Object obj[]=(Object[])i.next();
         Query query3=session.createQuery("select f.fee_receipt_no,f.fee_amount from Fee_Details f where f.fee_receipt_no in(select distinct f.fee_receipt_no From Fee_Details f where f.fee_trainee_session_id='"+obj[0]+"')");
                   List  list3=query3.list();
                   Iterator it3=list3.iterator();
                   double trade_fee=0; float total_fee=0;String rec_no="";boolean flag=false;
                   while(it3.hasNext()){
                        Object obj2[]=(Object[])it3.next();
                   
                    // Object obj2[]=list3.toArray();
                    rec_no=obj2[0]+"";
                    flag=rec_no.contains("FOC")?true:false;
                     if(obj2[1]!=null)
                     total_fee+=Float.parseFloat(obj2[1]+"");
                   
                   
                  
                    
                     }
                  Query query4=session.createQuery("select tr.trade_total_semester*tr.trade_fee from Trade tr where lower(tr.trade_name)=lower('"+obj[3]+"') and tr.trade_session='"+obj[4]+"'");
                  List list2=query4.list();
                     Iterator ii4=list2.iterator(); 
                     if(ii4.hasNext()){
                     trade_fee=(Double)ii4.next();
                     
                     
                     //==========
                   }
                  sum+=(flag)?0.0:(trade_fee-total_fee);
                     // serial no
                     cell=new PdfPCell(new Phrase(sno+""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);      
                     // session id
                     cell=new PdfPCell(new Phrase((obj[0]!=null)?obj[0]+"":""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);      
                     // name
                     cell=new PdfPCell(new Phrase((obj[1]!=null)?obj[1]+"":""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     // contact no
                     cell=new PdfPCell(new Phrase((obj[2]!=null && !obj[2].equals("null"))?obj[2]+"":""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     //total trade fee
                     cell=new PdfPCell(new Phrase(trade_fee+""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     
                     // total collected fee
                     cell=new PdfPCell(new Phrase(total_fee+""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                               
                     // balance amount
                     cell=new PdfPCell(new Phrase((flag)?"0":trade_fee-total_fee+""));
                     cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                    

                 
                  //====================
                     
        sno++;
        }
         }
           // NumberFormat f=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
         cell=new PdfPCell(new Phrase("Total Balance = "+sum+" "));
         cell.setColspan(7);
         cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
         table.addCell(cell);
        tx.commit();             
                     
        document.add(table);
        document.close();
        Desktop.getDesktop().open(new File("StudentsImages\\AllIdReport"+new SimpleDateFormat("dd-MMM-yyyy").format(new Date())+".pdf"));
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    void allReportWithId(String query){
        try{ 
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("StudentsImages\\newfile.pdf")));
        document.open();
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Balance Of All Receipt NO"), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
        String s[]="S.No,ID No,Name,Phone no,Balance".split(",");
        PdfPTable table=new PdfPTable(new float[]{2,2});
        PdfPCell cell;
        //Table Heading
        session.beginTransaction();
    Query query2=session.createQuery(query);
        List list=query2.list();
        Iterator i=list.iterator();
        int sno=1;String trade_name="",id="",trade_session="";
        if(i.hasNext()){
        Object obj[]=(Object[])i.next();
                     cell=new PdfPCell(new Phrase("ID NO :"+obj[0]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);id=obj[0]+"";
                     cell=new PdfPCell(new Phrase("Trainee Name :"+obj[1]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Phone no :"+((obj[2]!=null && !obj[2].equals("null"))?obj[2]:"")+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Trade :"+obj[3]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);trade_name=obj[3]+"";trade_session=obj[4]+"";
                      }
        cell=new PdfPCell(new Phrase("\n"));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
        cell=new PdfPCell(new Phrase("Receipt No"));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Fees Amount"));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     float sum=0;
        query2=session.createQuery("select distinct f.fee_receipt_no,f.fee_amount From Fee_Details f where f.fee_trainee_session_id='"+id+"'");
                     list=query2.list();
                    i=list.iterator();
                    while(i.hasNext()){
                     Object obj[]=(Object[])i.next();   
                     cell=new PdfPCell(new Phrase(obj[0]+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     sum+=Float.parseFloat(obj[1]+"");
                     cell=new PdfPCell(new Phrase(obj[1]+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                    }
                    query2=session.createQuery("select tr.trade_total_semester,tr.trade_fee from Trade tr where lower(tr.trade_name)=lower('"+trade_name+"')  and tr.trade_session='"+trade_session+"'");
                     list=query2.list();
                    i=list.iterator();
                    if(i.hasNext()){
                        Object obj[]=(Object[])i.next();
                     cell=new PdfPCell(new Phrase("Balance "));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(obj[0]+"*"+obj[1]+"-"+sum+"="+(Integer.parseInt(obj[0]+"")*Float.parseFloat(obj[1]+"")-sum)+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                                }
        tx.commit();             
                     
        document.add(table);
        document.close();
        Desktop.getDesktop().open(new File("StudentsImages\\newfile.pdf"));
        }catch(Exception e){}
    }
    private void wholePart(String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
        
       try{ Document document=new Document(PageSize.A4, 20,20,40,20);
            PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("newDemo.pdf")));
            document.open();
          //  document.setMargins(10, 10, 5, 5);
            PdfPTable table2=new PdfPTable(1);
            table2.setWidthPercentage(100);
            PdfPCell cell2;//=new PdfPCell(new Phrase(""));
//            cell2.setBorder(0);
//            table2.addCell(cell2);
            
            PdfPTable table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part1(table,receipt_no,id,total_trade_fee,total_paid_fee,sem);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
                      table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part2(table,receipt_no,id,total_trade_fee,total_paid_fee,sem);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
            table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part3(table,receipt_no,id,sem);
             cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
            document.add(table2);
            document.close();
            Desktop.getDesktop().open(new File("newDemo.pdf"));
            }catch(Exception e){}
    }
  private void part1(PdfPTable table,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Student Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");
//            session.beginTransaction();
//            Trainee t=session.load(Trainee.class,"");
//            String student[]={t.getTrainee_name(),t.getTrainee_id(),t.getTrainee_trade_name(),t.getTrainee_mobile_no()};
//            tx.commit();
//            session.beginTransaction();
//            Fee_Details d=session.load(Fee_Details.class,receipt_no);
//            String student_fee[]={};
//            tx.commit();
            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()),FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student: "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            session.beginTransaction();
           // Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t Section : ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents2[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","","Paid Fees"};
            String[] feetype={jTextField23.getText(),jTextField24.getText(),jTextField25.getText(),jTextField26.getText(),jTextField27.getText(),jTextField28.getText(),jTextField29.getText(),jTextField30.getText(),jTextField31.getText()};
           // session.beginTransaction();
           // Fee_Details fd=session.load(Fee_Details.class,receipt_no);
            double sem_fee=0;
           // tx.commit();
            double value1[]=new double[12];
            String contents[]=new String[12];
            float total=0;
            for(int i=0;i<value1.length;i++){
              if(i<9 && i!=0){
                value1[i]=Float.parseFloat(feetype[i]);
                total+=Float.parseFloat(feetype[i]);
               }
//              if(i==9)
//                  value1[i]=Float.parseFloat(jLabel122.getText())-total;
//              if(i==10)
//                  value1[i]=total_trade_fee-total_paid_fee;
              if(i==11)
                  value1[i]=total_paid_fee;
//               else{
//                value1[i]=0;
//                total+=0;
//                } 
                 contents[i]=contents2[i];
                 System.out.println(" "+contents2[i]);
            }
            value1[0]=Float.parseFloat(jLabel122.getText())-total;
               // total+=Float.parseFloat(jLabel122.getText())-total;
            
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0 ){    
             if(y==12)
             cell=new PdfPCell(new Phrase(Float.parseFloat(jLabel122.getText())+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
             else
             cell=new PdfPCell(new Phrase(value1[y]+"",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,com.lowagie.text.Font.BOLD)));    
            cell.setRowspan(2);
            }
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees) - "+Float.parseFloat(jLabel122.getText()),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//new originalNumToLetter().convert((int)total)
            String ss="";
            if(new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).length()>30){
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).substring(30);}
            else
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    
  private void part2(PdfPTable table,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Student Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");
//            session.beginTransaction();
//            Trainee t=session.load(Trainee.class,"");
//            String student[]={t.getTrainee_name(),t.getTrainee_id(),t.getTrainee_trade_name(),t.getTrainee_mobile_no()};
//            tx.commit();
//            session.beginTransaction();
//            Fee_Details d=session.load(Fee_Details.class,receipt_no);
//            String student_fee[]={};
//            tx.commit();
            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()),FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student: "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            session.beginTransaction();
           // Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t Section : ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents2[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","","Paid Fees"};
            String[] feetype={jTextField23.getText(),jTextField24.getText(),jTextField25.getText(),jTextField26.getText(),jTextField27.getText(),jTextField28.getText(),jTextField29.getText(),jTextField30.getText(),jTextField31.getText()};
           // session.beginTransaction();
           // Fee_Details fd=session.load(Fee_Details.class,receipt_no);
            double sem_fee=0;
           // tx.commit();
            double value1[]=new double[12];
            String contents[]=new String[12];
            float total=0;
            for(int i=0;i<value1.length;i++){
              if(i<9 && i!=0){
                value1[i]=Float.parseFloat(feetype[i]);
                total+=Float.parseFloat(feetype[i]);
               }
//              if(i==9)
//                  value1[i]=Float.parseFloat(jLabel122.getText())-total;
//              if(i==10)
//                  value1[i]=total_trade_fee-total_paid_fee;
              if(i==11)
                  value1[i]=total_paid_fee;
//               else{
//                value1[i]=0;
//                total+=0;
//                } 
                 contents[i]=contents2[i];
                 System.out.println(" "+contents2[i]);
            }
            value1[0]=Float.parseFloat(jLabel122.getText())-total;
               // total+=Float.parseFloat(jLabel122.getText())-total;
            
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0 ){    
             if(y==12)
             cell=new PdfPCell(new Phrase(Float.parseFloat(jLabel122.getText())+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
             else
             cell=new PdfPCell(new Phrase(value1[y]+"",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,com.lowagie.text.Font.BOLD)));    
            cell.setRowspan(2);
            }
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees) - "+Float.parseFloat(jLabel122.getText()),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//new originalNumToLetter().convert((int)total)
            String ss="";
            if(new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).length()>30){
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())).substring(30);}
            else
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)Float.parseFloat(jLabel122.getText())),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    private void part3(PdfPTable table,String receipt_no,String id,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Bank Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
             Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");
             
            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date())+" \t\t        ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student : "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
          //  session.beginTransaction();Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Section: ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"        Total        ","    No. of Notes  ","Denomination"};
            String contents[]={"1000 X","500 X","100 X","50 X","20 X","10 X"," "," "," ",""};
            float value1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<11;y++){
            if(x==2 )
                if(y<6)
                cell=new PdfPCell(new Phrase(contents[y]));
                else{
                  cell=new PdfPCell(new Phrase(contents[y]));
                  cell.setBorder(0);
                }
            else if(x==1 && y==6){
                cell=new PdfPCell(new Phrase("Grand Total"));
                cell.setRowspan(2);}
            else if(y>6 && y<11){
                cell=new PdfPCell(new Phrase(""));
                cell.setBorder(0);
            }
            else
               cell=new PdfPCell(new Phrase("")); 
            cell.setFixedHeight(5);
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            float total=0;
//            for(int i=0;i<value1.length;i++){
//                session.beginTransaction();
//                FeeType f=session.get(FeeType.class,receipt_no+i);
//                if(f!=null){
//                total+=f.getFeetype_amount();
//                    System.out.println("not null= "+f.getFeetype_amount());
//                }else
//                {    
//                    total+=0;
//                }
//                tx.commit();
//            }
//            session.beginTransaction();
//            Fee_Details fd=session.load(Fee_Details.class,receipt_no);
            total+=Float.parseFloat(jLabel122.getText());
           // tx.commit();
            if(x==0 && y==9){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees)- "+total,FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String ss="";
            if(new originalNumToLetter().convert((int)total).length()>30){
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)total).substring(30);}
            else
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
//            cell=new PdfPCell(new Phrase("",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
//            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
//            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
//            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    private void AllIdChallan(String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
        
      
    }
    void pages(Document document,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
        try{
            document.newPage();
         PdfPTable table2=new PdfPTable(1);
            table2.setWidthPercentage(100);
            PdfPCell cell2;
             float remain=0,trade_fee=0,tot_sem=0;String trade_ses="",trade_name="";
             Integer sem_count=0;
             System.out.println("1234");
        Object object[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_session from Trainee where trainee_session_id='"+id+"'");
        session.beginTransaction();
    Query query2=session.createQuery("select max(fee_total_semester) from Fee_Details where fee_trainee_session_id='"+id+"'");
        List list=query2.list();
        Iterator i=list.iterator();
        if(i.hasNext())
            sem_count=(Integer)i.next();
        tx.commit();
     //   Object total_semester[]=setDataToComponent("select cast(sum(fee_total_semester) as char) from Fee_Details where fee_trainee_session_id='"+id+"'");
System.out.println("456");String semester="";
System.out.println("total_semester="+sem_count);
if(sem_count>0)
for(int x=1;x<=sem_count;x++) semester+=x+",";
else
 semester+="0,";   
semester=semester.substring(0,semester.length()-1);
semester+=","+(Integer.parseInt(semester.substring(semester.length()-1))+1);
if(semester.startsWith("0"))
    semester=semester.substring(2);
            System.out.println("semester="+semester);
     Object obj[]=setDataToComponent("select trade_fee,trade_total_semester from Trade t where lower(t.trade_name)=lower('"+object[1]+"') and t.trade_session='"+object[2]+"'");
            total_paid_fee=Float.parseFloat(obj[0]+"");
            System.out.println("789");
            PdfPTable table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part4(table,receipt_no,id,total_trade_fee,total_paid_fee,semester);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
            System.out.println("101112");
            table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
             part5(table,receipt_no,id,total_trade_fee,total_paid_fee,semester);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
            table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
           part6(table,receipt_no,id,total_trade_fee,total_paid_fee,semester);
             cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(10);
           cell2.setPaddingTop(10);
            table2.addCell(cell2);
            document.add(table2);
        }catch(Exception e){e.printStackTrace();}
    }
      private void part4(PdfPTable table,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Student Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");

            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()),FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student: "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            session.beginTransaction();
           // Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2]+"\t\t\t\tSection : ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents2[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","","Paid Fees"};
            String[] feetype={total_paid_fee+"","0","0","0","0","0","0","0","0"};
           
            double sem_fee=0;
            double value1[]=new double[12];
            String contents[]=new String[12];
            float total=0;
            for(int i=0;i<value1.length;i++){
              if(i<9 && i!=0){
                value1[i]=Float.parseFloat(feetype[i]);
                total+=Float.parseFloat(feetype[i]);
               }

              if(i==11)
                  value1[i]=total_paid_fee;

                 contents[i]=contents2[i];
                 System.out.println(" "+contents2[i]);
            }
            value1[0]=total_paid_fee;
                total+=total_paid_fee;
            
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0 ){    
             if(y==12)
             cell=new PdfPCell(new Phrase(total+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
             else
             cell=new PdfPCell(new Phrase(value1[y]+"",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,com.lowagie.text.Font.BOLD)));    
            cell.setRowspan(2);
            }
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees) - "+total,FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//new originalNumToLetter().convert((int)total)
            String ss="";
            if(new originalNumToLetter().convert((int)total).length()>30){
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)total).substring(30);}
            else
            cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
      private void part5(PdfPTable table,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Institute Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");

            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()),FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student: "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            session.beginTransaction();
           // Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2]+"\t\t\t\tSection : ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents2[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","","Paid Fees"};
            String[] feetype={total_paid_fee+"","0","0","0","0","0","0","0","0"};
           
            double sem_fee=0;
            double value1[]=new double[12];
            String contents[]=new String[12];
            float total=0;
            for(int i=0;i<value1.length;i++){
              if(i<9 && i!=0){
                value1[i]=Float.parseFloat(feetype[i]);
                total+=Float.parseFloat(feetype[i]);
               }

              if(i==11)
                  value1[i]=total_paid_fee;

                 contents[i]=contents2[i];
                 System.out.println(" "+contents2[i]);
            }
            value1[0]=total_paid_fee;
                total+=total_paid_fee;
            
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0 ){    
             if(y==12)
             cell=new PdfPCell(new Phrase(total+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
             else
             cell=new PdfPCell(new Phrase(value1[y]+"",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,com.lowagie.text.Font.BOLD)));    
            cell.setRowspan(2);
            }
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees) - "+total,FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//new originalNumToLetter().convert((int)total)
            String ss="";
            if(new originalNumToLetter().convert((int)total).length()>30){
                cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)total).substring(30);}
            else
                cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
      private void part6(PdfPTable table,String receipt_no,String id,Float total_trade_fee,Float total_paid_fee,String sem){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Bank Copy",FontFactory.getFont(null,8,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
             Object obj[]=setDataToComponent("select trainee_name,trainee_trade_name,trainee_mobile_no from Trainee where trainee_session_id='"+id+"'");
             
            cell=new PdfPCell(new Phrase("Reciept no: "+receipt_no+"\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\t Date: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date())+" \t\t        ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student : "+obj[0],FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
          //  session.beginTransaction();Fee_Details fdsem=session.load(Fee_Details.class,receipt_no);
            cell=new PdfPCell(new Phrase("ID No.: "+id+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Semester : "+sem,FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);//tx.commit();
            cell=new PdfPCell(new Phrase("Trade.: "+obj[1]+"\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.: "+obj[2]+" \t\t\t\t Section: ",FontFactory.getFont(null,10,com.lowagie.text.Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"        Total        ","    No. of Notes  ","Denomination"};
            String contents[]={"1000 X","500 X","100 X","50 X","20 X","10 X"," "," "," ",""};
            float value1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<11;y++){
            if(x==2 )
                if(y<6)
                cell=new PdfPCell(new Phrase(contents[y]));
                else{
                  cell=new PdfPCell(new Phrase(contents[y]));
                  cell.setBorder(0);
                }
            else if(x==1 && y==6){
                cell=new PdfPCell(new Phrase("Grand Total"));
                cell.setRowspan(2);}
            else if(y>6 && y<11){
                cell=new PdfPCell(new Phrase(""));
                cell.setBorder(0);
            }
            else
               cell=new PdfPCell(new Phrase("")); 
            cell.setFixedHeight(5);
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            float total=0;

            total+=total_paid_fee;
           // tx.commit();
            if(x==0 && y==9){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees)- "+total,FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String ss="";
            if(new originalNumToLetter().convert((int)total).length()>30){
                cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total).substring(0,30),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));ss=new originalNumToLetter().convert((int)total).substring(30);}
            else
                cell=new PdfPCell(new Phrase("(In Words)-"+new originalNumToLetter().convert((int)total),FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));    
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(ss+"",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
//            cell=new PdfPCell(new Phrase("",FontFactory.getFont(null,10,com.lowagie.text.Font.BOLD|com.lowagie.text.Font.UNDERLINE)));
//            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
//            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
//            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
      public void setValue(String value){
          this.value=value;
      }
      public String getValue(){
      return value;    
      }
      
   private static Map getParameters(Session session)
  {
    Map parameters = new HashMap();
    parameters.put(JRHibernateQueryExecuterFactory.PARAMETER_HIBERNATE_SESSION, session);
    parameters.put("ReportTitle", "Address Report");
    List cityFilter = new ArrayList(3);
    cityFilter.add("Boston");
    cityFilter.add("Chicago");
    cityFilter.add("Oslo");
    parameters.put("CityFilter", cityFilter);
    parameters.put("OrderClause", "city");
    return parameters;
  }
      
    public void report(String query,String path) {
        try { 
            JasperDesign jd = JRXmlLoader.load(System.getProperty("user.dir") + File.separator +path);
            JRDesignQuery new_query = new JRDesignQuery();
            new_query.setText(query);
            jd.setQuery(new_query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch(JRException ex) {
          //  Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
     JOptionPane.showMessageDialog(null, ex);
        }

    }
          
    public void report_jasper(java.util.Collection collection,String path) {
        try { 

            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream(path), null, new JRBeanCollectionDataSource(collection));
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch(JRException ex) {
           
             JOptionPane.showMessageDialog(null, ex);
        }

    }
        
  private void depositSemesterFee(){
                        try{
                            session.beginTransaction();
                        Fee_Details fd=new Fee_Details();
                        fd.setFee_receipt_no(fee_receipt_no.getText());
                        fd.setFee_trainee_session_id(fee_student_id.getSelectedItem().toString());
                        fd.setFee_trade_id(trade_id);
                        fd.setPayment_mode(fee_pay_mode.getSelectedItem().toString());
                        if(bank_id!=null)
                            fd.setFee_bank_id(bank_id);
                        if(fee_branch_name.getSelectedIndex()!=0)
                            fd.setFee_bank_branch(fee_branch_name.getSelectedItem().toString());
                        if(!fee_cheque_no.getText().isEmpty())
                            fd.setFee_cheque_no(fee_cheque_no.getText());
                        
                        fd.setFee_cheque_date(fee_cheque_date.getDate());
                        fd.setFee_amount(Double.parseDouble(fee_amount.getText()));
                        fd.setFee_disc(Float.parseFloat(fee_discount.getText()));
                        fd.setBalance(Double.parseDouble(fee_balance.getText()));
                        fd.setFee_remarks(fee_remarks.getText());
                        fd.setFee_total_semester(SUBMITTED_SEM+countSem);
                        fd.setSemList(SEMLIST);
                        fd.setCreatedBy(createdBy);
                        fd.setIsPaid(!(Double.parseDouble(fee_balance.getText())>0));
                        session.save(fd);
                        tx.commit();

                        for(int i=0;i<9;i++){
                        session.beginTransaction();
                        FeeType ft=new FeeType();
                        ft.setFeetype_receipt_no(fee_receipt_no.getText());
                        ft.setFeetype_id(fee_receipt_no.getText()+i);
                        switch(i){

                            case 0: ft.setFeetype(jLabel113.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField23.getText())); break;
                            case 1: ft.setFeetype(jLabel114.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField24.getText())); break;
                            case 2: ft.setFeetype(jLabel115.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField25.getText())); break;
                            case 3: ft.setFeetype(jLabel116.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField26.getText())); break;
                            case 4: ft.setFeetype(jLabel117.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField27.getText())); break;
                            case 5: ft.setFeetype(jLabel118.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField28.getText())); break;
                            case 6: ft.setFeetype(jLabel119.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField29.getText())); break;
                            case 7: ft.setFeetype(jLabel120.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField30.getText())); break;
                            case 8: ft.setFeetype(jLabel121.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField31.getText())); break;
                        }
                        session.save(ft);
                        tx.commit();
                        }


                        String comb_id="";
                          session.beginTransaction();
                    Query query2=session.createQuery("select trainee_id from Trainee where trainee_session_id='"+fee_student_id.getSelectedItem().toString()+"'");
                        List list=query2.list();
                        Iterator i=list.iterator();
                        if(i.hasNext())
                            comb_id=(String)i.next();
                        tx.commit();
                        JOptionPane.showMessageDialog(null, "Fee Added");

                        createPdf(fee_receipt_no.getText(),comb_id,fee_student_id.getSelectedItem().toString());
                    
                        reset_student_fees();
                        fee_receipt_no.setText(generateId("","select fee_receipt_no from Fee_Details"));
                        }catch(NumberFormatException | HeadlessException e){
                            tx.rollback();
                        JOptionPane.showMessageDialog(null, e,"Error!",JOptionPane.ERROR);
                        }
  }      
  private void depositeFoc(){
                                        session.beginTransaction();
                                        Fee_Details fd=new Fee_Details();
                                        fd.setFee_receipt_no(fee_receipt_no.getText());
                                        fd.setFee_trainee_session_id(fee_student_id.getSelectedItem().toString());
                                        fd.setFee_trade_id(trade_id);

                                        fd.setFee_amount(Double.parseDouble(fee_amount.getText()));
                                        fd.setFee_disc(Float.parseFloat(fee_discount.getText()));
                                        fd.setBalance(Double.parseDouble(fee_balance.getText()));
                                        
                                        fd.setFee_remarks(fee_remarks.getText());
                                        fd.setFee_total_semester(SUBMITTED_SEM+countSem);
                                        fd.setSemList(SEMLIST);
                                        fd.setCreatedBy(createdBy);
                                        session.save(fd);
                                        tx.commit();
                                            
                                            for(int i=0;i<9;i++){
                        session.beginTransaction();
                        FeeType ft=new FeeType();
                        ft.setFeetype_receipt_no(fee_receipt_no.getText());
                        ft.setFeetype_id(fee_receipt_no.getText()+i);
                        switch(i){

                            case 0: ft.setFeetype(jLabel113.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField23.getText())); break;
                            case 1: ft.setFeetype(jLabel114.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField24.getText())); break;
                            case 2: ft.setFeetype(jLabel115.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField25.getText())); break;
                            case 3: ft.setFeetype(jLabel116.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField26.getText())); break;
                            case 4: ft.setFeetype(jLabel117.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField27.getText())); break;
                            case 5: ft.setFeetype(jLabel118.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField28.getText())); break;
                            case 6: ft.setFeetype(jLabel119.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField29.getText())); break;
                            case 7: ft.setFeetype(jLabel120.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField30.getText())); break;
                            case 8: ft.setFeetype(jLabel121.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField31.getText())); break;
                        }
                        session.save(ft);
                        tx.commit();
                        }
                                            
                                    session.beginTransaction();        
                                    FOC_Details foc=new FOC_Details();
                                    foc.setFoc_no(fee_receipt_no.getText());
                                    foc.setFoc_trade_id(trade_id);
                                    foc.setFoc_trainee_session_id(fee_student_id.getSelectedItem().toString());
                                    foc.setSemList(SEMLIST);
                                    foc.setFee_amount(new java.math.BigDecimal(fee_amount.getText()));
                                    foc.setFee_remarks(fee_remarks.getText());
                                    foc.setFee_total_semester(SUBMITTED_SEM+countSem);
                                    foc.setCreatedBy(createdBy);
                                    foc.setCreatedOn(new Date());
                                    session.save(foc);
                                    tx.commit();
                                    JOptionPane.showMessageDialog(null, "FOC Student detail submitted !");
                                    reset_student_fees();
  }
  private void updateSemesterFee(){
       session.beginTransaction(); 
                Object o=session.load(Fee_Details.class,fee_receipt_no.getText());
                Fee_Details fd=(Fee_Details)o;

               // fd.setFee_receipt_no(fee_receipt_no.getText());
                fd.setFee_trainee_session_id(fee_student_id.getSelectedItem().toString());
                fd.setFee_trade_id(trade_id);
                fd.setPayment_mode(fee_pay_mode.getSelectedItem().toString());
                if(bank_id!=null)
                    fd.setFee_bank_id(bank_id);
                if(fee_branch_name.getSelectedIndex()!=0)
                    fd.setFee_bank_branch(fee_branch_name.getSelectedItem().toString());
                if(!fee_cheque_no.getText().isEmpty())
                    fd.setFee_cheque_no(fee_cheque_no.getText());
                fd.setFee_cheque_date(fee_cheque_date.getDate());
                fd.setFee_amount(Double.parseDouble(fee_amount.getText()));
                fd.setFee_disc(Float.parseFloat(fee_discount.getText()));
                fd.setBalance(Double.parseDouble(fee_balance.getText()));
                fd.setFee_remarks(fee_remarks.getText());
                fd.setFee_total_semester(SUBMITTED_SEM+countSem);
                fd.setSemList(SEMLIST);
                fd.setCreatedBy(createdBy);
                fd.setIsPaid(!(Double.parseDouble(fee_balance.getText())>0));
                session.update(fd);
                tx.commit();

                 for(int i=0;i<9;i++){
                session.beginTransaction();
                FeeType ft=session.load(FeeType.class,fee_receipt_no.getText()+i);
                ft.setFeetype_receipt_no(fee_receipt_no.getText());

                switch(i){

                    case 0: ft.setFeetype(jLabel113.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField23.getText())); break;
                    case 1: ft.setFeetype(jLabel114.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField24.getText())); break;
                    case 2: ft.setFeetype(jLabel115.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField25.getText())); break;
                    case 3: ft.setFeetype(jLabel116.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField26.getText())); break;
                    case 4: ft.setFeetype(jLabel117.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField27.getText())); break;
                    case 5: ft.setFeetype(jLabel118.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField28.getText())); break;
                    case 6: ft.setFeetype(jLabel119.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField29.getText())); break;
                    case 7: ft.setFeetype(jLabel120.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField30.getText())); break;
                    case 8: ft.setFeetype(jLabel121.getText());   ft.setFeetype_amount(Float.parseFloat(jTextField31.getText())); break;
                }
                session.update(ft);
                tx.commit();
                }

                JOptionPane.showMessageDialog(null, "Fee Updated");
                reset_student_fees();
  }
  private void updateFoc(){
        session.beginTransaction();       
                FOC_Details foc=session.get(FOC_Details.class, fee_receipt_no.getText());
                foc.setFoc_trade_id(trade_id);
                foc.setFoc_trainee_session_id(fee_student_id.getSelectedItem().toString());
                foc.setSemList(SEMLIST);
                foc.setFee_amount(new java.math.BigDecimal(fee_amount.getText()));
                foc.setFee_remarks(fee_remarks.getText());
                foc.setFee_total_semester(SUBMITTED_SEM+countSem);
                foc.setCreatedBy(createdBy);
                foc.setCreatedOn(new Date());
                session.update(foc);
                tx.commit();
                JOptionPane.showMessageDialog(null, "FOC details updated !");
                reset_student_fees();
  }
  
}
