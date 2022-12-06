/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.BaseBLL;
import BLL.CategoryBLL;
import BLL.CustomersBLL;
import BLL.OrderBLL;
import BLL.OrderDetailBLL;
import BLL.VegetableBLL;
import DAL.ClassEnum;
import Entities.Category;
import Entities.Customers;
import Entities.OrderDetail;
import Entities.Orders;
import Entities.Vegetable;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XUAN HOAI
 */
public class index extends javax.swing.JFrame {

    private VegetableBLL vegBLL = new VegetableBLL();
    private CategoryBLL categoryBLL = new CategoryBLL();
    private CustomersBLL customerBLL = new CustomersBLL();
    private OrderBLL orderBLL = new OrderBLL();
    private OrderDetailBLL orderDetailBLL = new OrderDetailBLL();

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        loadVegetable();
        loadCategory();
        loadComboboxCategory();
        loadcustomer();
        loadComboboxCustomer();
        loadorders();
        loadordersum();
        loadRevenueVegetable();
        loadTK();
    }
private void loadTK(){
           String[] titles = {"Year", "Month"};
        DefaultComboBoxModel<String> customersModel = new DefaultComboBoxModel<String>(titles);
        jComboBox6.setModel(customersModel);
        jComboBox5.setModel(customersModel);
    }

    private void loadVegetable() {
        List<Vegetable> listVegetables = vegBLL.loadData();
        Object[][] data = vegBLL.ConvertListForTable(listVegetables);
        String[] titles = {"Id", "Category", "Name", "Unit", "Amount", "Image", "Price"};
        DefaultTableModel vegtableModel = new DefaultTableModel(data, titles);
        tblVegetable.setModel(vegtableModel);
        tblVegetableInInvoice.setModel(vegtableModel);
    }
    private void loadcustomer(){
        List<Customers> listCustomer = customerBLL.loadData();
        Object[][] data = customerBLL.ConvertListForTable(listCustomer);
        String[] titles = {"CustomerID", "Fullname", "Password", "Address", "City"};
        DefaultTableModel customerModel = new DefaultTableModel(data, titles);
        tblcustomer.setModel(customerModel); 
    }
    private void loadorders(){
        List<Orders> listOrder = orderBLL.loadData();
        Object[][] data = orderBLL.ConvertListForTable(listOrder);
        String[] titles = {"OrderID", "Customer", "Date", "Total", "Note"};
        DefaultTableModel orderModel = new DefaultTableModel(data, titles);
        tblorders.setModel(orderModel); 
    }
    private void loadordersum(){
        List<Orders> listOrder = orderBLL.loadData();
        int orderSum = listOrder.size();
        Object[][] obj = new Object[1][2];
        float sum =0;
        for(int i =0; i < orderSum; i++){
            sum +=listOrder.get(i).getTotal();
        }
        obj[0][0] = orderSum;
        obj[0][1] = sum;
        String[] titles = {"Total Orders", "Total Revenue"};
        DefaultTableModel ordersumModel = new DefaultTableModel(obj, titles);
        tblordersum.setModel(ordersumModel); 
    }
    private void loadComboboxCategory() {
        List<Category> listCategories = categoryBLL.loadData();
        String[] newList = categoryBLL.ConvertListToComboBox(listCategories);
        DefaultComboBoxModel<String> categoryModel = new DefaultComboBoxModel<String>(newList);
        cbCategory.setModel(categoryModel);
    }
    private void loadComboboxCustomer(){
        List<Customers> listCustomers = customerBLL.loadData();
        String[] newList = customerBLL.ConvertListToComboBox(listCustomers);
        DefaultComboBoxModel<String> customersModel = new DefaultComboBoxModel<String>(newList);
        cbCustomers.setModel(customersModel);
    }

    private void loadCategory() {
        List<Category> listCategories = categoryBLL.loadData();
        Object[][] data = categoryBLL.ConvertListForTable(listCategories);
        String[] titles = {"Id", "Name", "Description"};
        DefaultTableModel categoryModel = new DefaultTableModel(data, titles);
        tblCategory.setModel(categoryModel);
    }
    
    private void loadRevenueVegetable() {
        List<OrderDetail> listOrderDetail = orderDetailBLL.GroupById();
        Object[][] data = orderDetailBLL.ConvertListForTable(listOrderDetail);
        String[] titles = {"Vegetable Name", "Quantity", "Price"};
        DefaultTableModel orderDetailModel = new DefaultTableModel(data, titles);
        tblOrderDetail.setModel(orderDetailModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlImport = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlvegetable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVegetableName = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbUnit = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblVegetable = new javax.swing.JTable();
        btnEditVegetable = new javax.swing.JButton();
        btnAddVegetable = new javax.swing.JButton();
        btnDeleteVegetable = new javax.swing.JButton();
        btnResetVegetable = new javax.swing.JButton();
        txtSearchVegetable = new javax.swing.JTextField();
        btnSearchVegetable = new javax.swing.JButton();
        pnlcategory = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNameCategory = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCategoryDescription = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnAddCategory = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtSearchCategory = new javax.swing.JTextField();
        btnSearchIns3 = new javax.swing.JButton();
        pnlOrder = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrderdetail = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbCustomers = new javax.swing.JComboBox<>();
        pn_product = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVegetableInInvoice = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtAmountVegetable = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtVegetableNameInInvoice = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        Filter = new javax.swing.JButton();
        txtfilter = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnSaveBill = new javax.swing.JButton();
        pnlCustomer = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldFullname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButtonaddCus = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        txtSearchCustomer = new javax.swing.JTextField();
        btnSearchIns2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        pnlStatistical = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlSaleRevenue = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblordersum = new javax.swing.JTable();
        txtSearchIns1 = new javax.swing.JTextField();
        btnSearchIns1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblorders = new javax.swing.JTable();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        pnlRevenueByProduct = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        btnSearchIns = new javax.swing.JButton();
        txtSearchIns = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminShop");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AdminShop");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(455, 455, 455))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.setBackground(new java.awt.Color(51, 0, 255));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlImport.setBackground(new java.awt.Color(153, 204, 255));

        jTabbedPane3.setBackground(new java.awt.Color(102, 153, 255));
        jTabbedPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlvegetable.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Vegetable Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Category:");

        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Unit:");

        cbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "bag", "per fruit", "bunch" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Amount:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kg");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Price:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("VND");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Image:");

        tblVegetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVegetableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblVegetable);
        if (tblVegetable.getColumnModel().getColumnCount() > 0) {
            tblVegetable.getColumnModel().getColumn(3).setHeaderValue("Unit");
            tblVegetable.getColumnModel().getColumn(4).setHeaderValue("Amount");
            tblVegetable.getColumnModel().getColumn(5).setHeaderValue("Price");
            tblVegetable.getColumnModel().getColumn(6).setHeaderValue("Images");
        }

        btnEditVegetable.setBackground(new java.awt.Color(102, 102, 255));
        btnEditVegetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditVegetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-pencil-16.png"))); // NOI18N
        btnEditVegetable.setText("Edit");
        btnEditVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditVegetableActionPerformed(evt);
            }
        });

        btnAddVegetable.setBackground(new java.awt.Color(102, 102, 255));
        btnAddVegetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddVegetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        btnAddVegetable.setText("Add");
        btnAddVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVegetableActionPerformed(evt);
            }
        });

        btnDeleteVegetable.setBackground(new java.awt.Color(102, 102, 255));
        btnDeleteVegetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteVegetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-16.png"))); // NOI18N
        btnDeleteVegetable.setText("Delete");
        btnDeleteVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVegetableActionPerformed(evt);
            }
        });

        btnResetVegetable.setBackground(new java.awt.Color(102, 102, 255));
        btnResetVegetable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetVegetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        btnResetVegetable.setText("Reset");
        btnResetVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetVegetableActionPerformed(evt);
            }
        });

        btnSearchVegetable.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchVegetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        btnSearchVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVegetableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlvegetableLayout = new javax.swing.GroupLayout(pnlvegetable);
        pnlvegetable.setLayout(pnlvegetableLayout);
        pnlvegetableLayout.setHorizontalGroup(
            pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvegetableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlvegetableLayout.createSequentialGroup()
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResetVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlvegetableLayout.createSequentialGroup()
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlvegetableLayout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(pnlvegetableLayout.createSequentialGroup()
                                .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlvegetableLayout.createSequentialGroup()
                                        .addComponent(txtAmount)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6))
                                    .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtVegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlvegetableLayout.createSequentialGroup()
                        .addComponent(txtSearchVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlvegetableLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(65, 65, 65)
                        .addComponent(txtImage)))
                .addContainerGap())
        );
        pnlvegetableLayout.setVerticalGroup(
            pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvegetableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlvegetableLayout.createSequentialGroup()
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtSearchVegetable, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVegetableName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlvegetableLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel9))
                            .addGroup(pnlvegetableLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlvegetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        jTabbedPane3.addTab("VEGETABLE", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-vegetable-32.png")), pnlvegetable); // NOI18N

        pnlcategory.setBackground(new java.awt.Color(153, 204, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Name:");

        txtNameCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameCategoryActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Description:");

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Description"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCategory);

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-pencil-16.png"))); // NOI18N
        jButton5.setText("Edit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnAddCategory.setBackground(new java.awt.Color(102, 102, 255));
        btnAddCategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        btnAddCategory.setText("Add");
        btnAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseClicked(evt);
            }
        });
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-16.png"))); // NOI18N
        jButton7.setText("Delete");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        jButton8.setText("Reset");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btnSearchIns3.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchIns3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        btnSearchIns3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchIns3MouseClicked(evt);
            }
        });
        btnSearchIns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIns3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlcategoryLayout = new javax.swing.GroupLayout(pnlcategory);
        pnlcategory.setLayout(pnlcategoryLayout);
        pnlcategoryLayout.setHorizontalGroup(
            pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcategoryLayout.createSequentialGroup()
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(pnlcategoryLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(24, 24, 24)
                        .addComponent(txtCategoryDescription))
                    .addGroup(pnlcategoryLayout.createSequentialGroup()
                        .addComponent(txtSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchIns3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .addGroup(pnlcategoryLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(57, 57, 57)
                        .addComponent(txtNameCategory)))
                .addGap(16, 16, 16))
        );
        pnlcategoryLayout.setVerticalGroup(
            pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcategoryLayout.createSequentialGroup()
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnSearchIns3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNameCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCategoryDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlcategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(185, 185, 185))
                    .addGroup(pnlcategoryLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("CATEGORY", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-sorting-24.png")), pnlcategory); // NOI18N

        javax.swing.GroupLayout pnlImportLayout = new javax.swing.GroupLayout(pnlImport);
        pnlImport.setLayout(pnlImportLayout);
        pnlImportLayout.setHorizontalGroup(
            pnlImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImportLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlImportLayout.setVerticalGroup(
            pnlImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane2.addTab("IMPORT VEGETABLE          ", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-vegetable-53.png")), pnlImport); // NOI18N

        pnlOrder.setBackground(new java.awt.Color(153, 204, 255));

        tblOrderdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "VegetableID", "Vegetable Name", "Unit", "Amount", "Price"
            }
        ));
        jScrollPane3.setViewportView(tblOrderdetail);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Order detail:");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton10.setBackground(new java.awt.Color(102, 102, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        jButton10.setText("Add order");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Full Name:");

        cbCustomers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(cbCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pn_product.setBackground(new java.awt.Color(153, 204, 255));
        pn_product.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vegetable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        tblVegetableInInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "VegetableID", "Vegetable Name", "Unit", "Amount", "Price"
            }
        ));
        tblVegetableInInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVegetableInInvoiceMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblVegetableInInvoice);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Amount:");

        txtAmountVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountVegetableActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Vegetable Name:");

        jButton19.setBackground(new java.awt.Color(102, 102, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        jButton19.setText("Add Product");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(255, 51, 51));
        Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterMouseClicked(evt);
            }
        });
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(102, 102, 255));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        jButton28.setText("Reset");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_productLayout = new javax.swing.GroupLayout(pn_product);
        pn_product.setLayout(pn_productLayout);
        pn_productLayout.setHorizontalGroup(
            pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(pn_productLayout.createSequentialGroup()
                        .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_productLayout.createSequentialGroup()
                                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVegetableNameInInvoice)
                                    .addComponent(txtAmountVegetable)))
                            .addComponent(txtfilter))
                        .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_productLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pn_productLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        pn_productLayout.setVerticalGroup(
            pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtfilter)
                    .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtVegetableNameInInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pn_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtAmountVegetable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("ORDERS");

        btnSaveBill.setBackground(new java.awt.Color(102, 102, 255));
        btnSaveBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSaveBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        btnSaveBill.setText("Save Bill");
        btnSaveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(pnlOrderLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlOrderLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel21)))
                        .addGap(49, 49, 49)
                        .addComponent(pn_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(btnSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addComponent(pn_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CREATE SALES INVOICE       ", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-receipt-and-change-48.png")), pnlOrder); // NOI18N

        pnlCustomer.setBackground(new java.awt.Color(153, 204, 255));

        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblcustomer);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Full Name:");

        jTextFieldFullname.setPreferredSize(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Address:");

        jTextFieldAddress.setPreferredSize(null);
        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("City:");

        jTextFieldCity.setPreferredSize(null);
        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Password:");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-uchiha-eyes-24.png"))); // NOI18N
        jButton14.setPreferredSize(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButtonaddCus.setBackground(new java.awt.Color(102, 102, 255));
        jButtonaddCus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonaddCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-new-16.png"))); // NOI18N
        jButtonaddCus.setText("Add");
        jButtonaddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddCusActionPerformed(evt);
            }
        });

        jButtonEdit.setBackground(new java.awt.Color(102, 102, 255));
        jButtonEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-pencil-16.png"))); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(102, 102, 255));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-16.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonreset.setBackground(new java.awt.Color(102, 102, 255));
        jButtonreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        jButtonreset.setText("Reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });

        jTextFieldPassword.setPreferredSize(null);
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        btnSearchIns2.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchIns2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        btnSearchIns2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchIns2MouseClicked(evt);
            }
        });
        btnSearchIns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIns2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("LIST OF CUSTOMERS");

        javax.swing.GroupLayout pnlCustomerLayout = new javax.swing.GroupLayout(pnlCustomer);
        pnlCustomer.setLayout(pnlCustomerLayout);
        pnlCustomerLayout.setHorizontalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCustomerLayout.createSequentialGroup()
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustomerLayout.createSequentialGroup()
                                .addComponent(jTextFieldFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(pnlCustomerLayout.createSequentialGroup()
                                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCustomerLayout.createSequentialGroup()
                                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonaddCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonreset, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCustomerLayout.createSequentialGroup()
                                .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchIns2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        pnlCustomerLayout.setVerticalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchIns2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCity, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonaddCus, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("CUSTOMER MANAGEMENT", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-girl-with-shopping-bag-50.png")), pnlCustomer); // NOI18N

        pnlStatistical.setBackground(new java.awt.Color(153, 204, 255));

        jTabbedPane4.setBackground(new java.awt.Color(102, 153, 255));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlSaleRevenue.setBackground(new java.awt.Color(153, 204, 255));

        tblordersum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblordersum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Number of invoices", "Revenue"
            }
        ));
        jScrollPane7.setViewportView(tblordersum);

        btnSearchIns1.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchIns1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        btnSearchIns1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchIns1MouseClicked(evt);
            }
        });
        btnSearchIns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIns1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Statistics by:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Start date:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("End date:");

        jButton27.setBackground(new java.awt.Color(102, 102, 255));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        jButton27.setText("Reset");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Overview");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Detail");

        tblorders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Full Name", "Number of orders", "Total", "Revenue"
            }
        ));
        jScrollPane8.setViewportView(tblorders);

        javax.swing.GroupLayout pnlSaleRevenueLayout = new javax.swing.GroupLayout(pnlSaleRevenue);
        pnlSaleRevenue.setLayout(pnlSaleRevenueLayout);
        pnlSaleRevenueLayout.setHorizontalGroup(
            pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaleRevenueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaleRevenueLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(494, 494, 494))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                        .addComponent(txtSearchIns1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchIns1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSaleRevenueLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlSaleRevenueLayout.setVerticalGroup(
            pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchIns1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnSearchIns1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(pnlSaleRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSaleRevenueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel35)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("SALES REVENUE", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-sales-performance-24.png")), pnlSaleRevenue); // NOI18N

        pnlRevenueByProduct.setBackground(new java.awt.Color(153, 204, 255));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Statistics by:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Start date:");

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vegetable Name", "Amount", "Total", "Revenue"
            }
        ));
        jScrollPane10.setViewportView(tblOrderDetail);

        jButton26.setBackground(new java.awt.Color(102, 102, 255));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-24.png"))); // NOI18N
        jButton26.setText("Reset");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        btnSearchIns.setBackground(new java.awt.Color(255, 51, 51));
        btnSearchIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-24.png"))); // NOI18N
        btnSearchIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchInsMouseClicked(evt);
            }
        });
        btnSearchIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInsActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("End date:");

        javax.swing.GroupLayout pnlRevenueByProductLayout = new javax.swing.GroupLayout(pnlRevenueByProduct);
        pnlRevenueByProduct.setLayout(pnlRevenueByProductLayout);
        pnlRevenueByProductLayout.setHorizontalGroup(
            pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                                .addComponent(txtSearchIns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchIns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                                .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRevenueByProductLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        pnlRevenueByProductLayout.setVerticalGroup(
            pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRevenueByProductLayout.createSequentialGroup()
                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchIns, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnSearchIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlRevenueByProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("REVENUE BY PRODUCT", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-total-sales-24 (1).png")), pnlRevenueByProduct); // NOI18N

        javax.swing.GroupLayout pnlStatisticalLayout = new javax.swing.GroupLayout(pnlStatistical);
        pnlStatistical.setLayout(pnlStatisticalLayout);
        pnlStatisticalLayout.setHorizontalGroup(
            pnlStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatisticalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlStatisticalLayout.setVerticalGroup(
            pnlStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisticalLayout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("STATISTICAL                        ", new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-chart-48.png")), pnlStatistical); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchInsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSearchInsMouseClicked

    private void btnSearchInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchInsActionPerformed

    private void btnEditVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditVegetableActionPerformed
        // TODO add your handling code here:
        int i = tblVegetable.getSelectedRow();
        if (i >= 0) {
            int id = Integer.parseInt(tblVegetable.getModel().getValueAt(i, 0).toString());
            Vegetable newVegetableItem = new Vegetable();
            newVegetableItem = vegBLL.getData(id);
           
            //Will be fixed soon
            newVegetableItem.setVegetableName(txtVegetableName.getText());
            newVegetableItem.setCatagoryID(cbCategory.getSelectedIndex() + 1);
            newVegetableItem.setUnit(cbUnit.getSelectedItem().toString());
            newVegetableItem.setAmount(Integer.parseInt(txtAmount.getText()));
            newVegetableItem.setImage(txtImage.getText());
            newVegetableItem.setPrice(Float.parseFloat(txtPrice.getText()));
            System.out.println(newVegetableItem);
            vegBLL.editData(newVegetableItem);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            loadVegetable();
        }

    }//GEN-LAST:event_btnEditVegetableActionPerformed

    private void btnAddVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVegetableActionPerformed

        Vegetable newVegetableItem = new Vegetable();
        newVegetableItem.setVegetableName(txtVegetableName.getText());
        newVegetableItem.setCatagoryID(cbCategory.getSelectedIndex() + 1);
        newVegetableItem.setUnit(cbUnit.getSelectedItem().toString());
        newVegetableItem.setAmount(Integer.parseInt(txtAmount.getText()));
        newVegetableItem.setImage(txtImage.getText());
        newVegetableItem.setPrice(Float.parseFloat(txtPrice.getText()));
        vegBLL.newData(newVegetableItem);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        loadVegetable();

    }//GEN-LAST:event_btnAddVegetableActionPerformed

    private void btnDeleteVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVegetableActionPerformed
        // TODO add your handling code here:
        int i = tblVegetable.getSelectedRow();
        int column = 0;
        if (i >= 0) {
            int id = Integer.parseInt(tblVegetable.getModel().getValueAt(i, column++).toString());
            cbCategory.setSelectedItem(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtVegetableName.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            cbUnit.setSelectedItem(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtAmount.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtImage.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtPrice.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            vegBLL.deleteData(id);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadVegetable();
        }
    }//GEN-LAST:event_btnDeleteVegetableActionPerformed

    private void btnResetVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetVegetableActionPerformed
        // TODO add your handling code here:
        loadCategory();
    }//GEN-LAST:event_btnResetVegetableActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (orderBLL.tempBill != null) {
            JOptionPane.showMessageDialog(null, "Bạn đang có bill đang chờ, không thể add thêm");
            return;
        }
        Orders newOrder = new Orders();
        List<Customers> customerList = customerBLL.FindDataByName(cbCustomers.getSelectedItem().toString());
        int customerID = customerList.get(0).getCustomerID();
        newOrder.setCustomerID(customerID);
        newOrder.setDate("2021-08-15");
        newOrder.setTotal(0);
        newOrder.setNote("Test");        
        orderBLL.tempBill = newOrder;
        JOptionPane.showMessageDialog(null, "Thêm vào hàng chờ thành công");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCityActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButtonaddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddCusActionPerformed
        Customers newCusItem = new Customers();
        newCusItem.setFullname(jTextFieldFullname.getText());
        newCusItem.setPassword(jTextFieldPassword.getText());
        newCusItem.setAddress(jTextFieldAddress.getText());
        newCusItem.setCity(jTextFieldCity.getText());
        customerBLL.newData(newCusItem);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        loadcustomer();
                // TODO add your handling code here:
    }//GEN-LAST:event_jButtonaddCusActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        int i = tblcustomer.getSelectedRow();
        if (i >= 0) {
            int id = Integer.parseInt(tblcustomer.getModel().getValueAt(i, 0).toString());
            Customers newCusItem = new Customers();
            newCusItem = customerBLL.getData(id);
           
            //Will be fixed soon
            newCusItem.setFullname(jTextFieldFullname.getText().toString());
            newCusItem.setPassword(jTextFieldPassword.getText().toString());
            newCusItem.setAddress(jTextFieldAddress.getText().toString());
            newCusItem.setCity(jTextFieldCity.getText().toString());
            customerBLL.editData(newCusItem);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            loadcustomer();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int i = tblcustomer.getSelectedRow();
        int column = 0;
        if (i >= 0) {
            int id = Integer.parseInt(tblcustomer.getModel().getValueAt(i, column++).toString());
            customerBLL.deleteData(id);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadcustomer();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        loadcustomer();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void btnSearchIns1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchIns1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIns1MouseClicked

    private void btnSearchIns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIns1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIns1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        loadorders();
        loadordersum();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void btnSearchIns2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchIns2MouseClicked
        // TODO add your handling code here:
        String queryName = txtSearchCustomer.getText();
        List<Customers> listFound = customerBLL.FindDataByName(queryName);
        if (listFound.size() > 0) {
            Object[][] data = customerBLL.ConvertListForTable(listFound);
            String[] titles = {"Id","FullName","Password","Address" , "City"};
            DefaultTableModel categoryModel = new DefaultTableModel(data, titles);
            tblcustomer.setModel(categoryModel);
            JOptionPane.showMessageDialog(null, "Founded");
        } else {
            JOptionPane.showMessageDialog(null, "Can't find this item");
        }
    }//GEN-LAST:event_btnSearchIns2MouseClicked

    private void btnSearchIns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIns2ActionPerformed
        // TODO add your handling code here:
        String queryName = txtSearchCustomer.getText();
        List<Customers> listFound = customerBLL.FindDataByName(queryName);
        if (listFound.size() > 0) {
            Object[][] data = customerBLL.ConvertListForTable(listFound);
            String[] titles = {"Id", "Fullname", "Password", "Address", "City"};
            DefaultTableModel customerModel = new DefaultTableModel(data, titles);
            tblcustomer.setModel(customerModel);
            JOptionPane.showMessageDialog(null, "Founded");
        } else {
            JOptionPane.showMessageDialog(null, "Can't find this item");
        }
    }//GEN-LAST:event_btnSearchIns2ActionPerformed

    private void btnSearchIns3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchIns3MouseClicked
        // TODO add your handling code here:
        String queryName = txtSearchCategory.getText();
        List<Category> listFound = categoryBLL.FindDataByName(queryName);
        if (listFound.size() > 0) {
            Object[][] data = categoryBLL.ConvertListForTable(listFound);
            String[] titles = {"Id","Name", "Description"};
            DefaultTableModel categoryModel = new DefaultTableModel(data, titles);
            tblCategory.setModel(categoryModel);
            JOptionPane.showMessageDialog(null, "Founded");
        } else {
            JOptionPane.showMessageDialog(null, "Can't find this item");
        }
    }//GEN-LAST:event_btnSearchIns3MouseClicked

    private void btnSearchIns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIns3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIns3ActionPerformed

    private void btnSearchVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVegetableActionPerformed
        // TODO add your handling code here:
        String queryName = txtSearchVegetable.getText();
        List<Vegetable> listFound = vegBLL.FindDataByName(queryName);
        if (listFound.size() > 0) {
            Object[][] data = vegBLL.ConvertListForTable(listFound);
            String[] titles = {"Id", "Category", "Name", "Unit", "Amount", "Image", "Price"};
            DefaultTableModel vegtableModel = new DefaultTableModel(data, titles);
            tblVegetable.setModel(vegtableModel);
            JOptionPane.showMessageDialog(null, "Founded");
        } else {
            JOptionPane.showMessageDialog(null, "Can't find this item");
        }

    }//GEN-LAST:event_btnSearchVegetableActionPerformed

    private void FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterMouseClicked

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        String queryName = txtfilter.getText();
        List<Vegetable> listFound = vegBLL.FindDataByName(queryName);
        if (listFound.size() > 0) {
            Object[][] data = vegBLL.ConvertListForTable(listFound);
            String[] titles = {"Id", "Category", "Name", "Unit", "Amount", "Image", "Price"};
            DefaultTableModel vegtableModel = new DefaultTableModel(data, titles);
            tblVegetableInInvoice.setModel(vegtableModel);
            JOptionPane.showMessageDialog(null, "Founded");
        } else {
            JOptionPane.showMessageDialog(null, "Can't find this item");
        }
    }//GEN-LAST:event_FilterActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (orderBLL.tempBill == null) {
            JOptionPane.showMessageDialog(null, "Chưa có hóa đơn nào trong hàng chờ");
            return;
        }
        float price = 0;
        String vegetableName = txtVegetableNameInInvoice.getText();
        List<Vegetable> vegetableList = vegBLL.FindDataByName(vegetableName);
        int vegetableID = vegetableList.get(0).getVegetableID();
        String unit = vegetableList.get(0).getUnit();
        int Amount = Integer.parseInt(txtAmountVegetable.getText());
        if (Amount > vegetableList.get(0).getAmount()) {
            JOptionPane.showMessageDialog(null, "Số lượng bạn thêm quá lớn so với số lượng mặt hàng hiện có");
            return;
        }
        int k = tblVegetableInInvoice.getSelectedRow();        
        if (k >= 0) {
            price = Float.parseFloat(tblVegetableInInvoice.getModel().getValueAt(k, 6).toString());            
        }
        int dem = 0;
        for (Vegetable vegetable : OrderDetailBLL.vegetableList) {
            if (vegetableID == vegetable.getVegetableID()) {
                vegetable.setAmount(Amount + vegetable.getAmount());
                dem++;
            }
        }
        if (dem == 0) {
            Vegetable newVegetable = new Vegetable();
            newVegetable.setVegetableID(vegetableID);
            newVegetable.setVegetableName(vegetableName);
            newVegetable.setPrice(price);
            newVegetable.setAmount(Amount);
            newVegetable.setUnit(unit);
            OrderDetailBLL.vegetableList.add(newVegetable);
        }        
        Object[][] obj = new Object[OrderDetailBLL.vegetableList.size()][5];
        for (int i = 0; i < OrderDetailBLL.vegetableList.size(); i++) {
            obj[i][0] = OrderDetailBLL.vegetableList.get(i).getVegetableID();            
            obj[i][1] = OrderDetailBLL.vegetableList.get(i).getVegetableName();
            obj[i][2] = OrderDetailBLL.vegetableList.get(i).getUnit();
            obj[i][3] = OrderDetailBLL.vegetableList.get(i).getAmount();            
            obj[i][4] = OrderDetailBLL.vegetableList.get(i).getPrice() * OrderDetailBLL.vegetableList.get(i).getAmount();
        }        
        String[] titles = {"VegetableID","Vegetable Name","Unit", "Quantity", "SubTotal"};
        DefaultTableModel orderDetailModel = new DefaultTableModel(obj, titles);
        tblOrderdetail.setModel(orderDetailModel);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void txtAmountVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountVegetableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountVegetableActionPerformed

    private void tblVegetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVegetableMouseClicked
        // TODO add your handling code here:
        int i = tblVegetable.getSelectedRow();
        int column = 1;
        if (i >= 0) {
            cbCategory.setSelectedItem(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtVegetableName.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            cbUnit.setSelectedItem(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtAmount.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtImage.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
            txtPrice.setText(tblVegetable.getModel().getValueAt(i, column++).toString());
        }
    }//GEN-LAST:event_tblVegetableMouseClicked

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        int i = tblcustomer.getSelectedRow();
        int column = 1;
        if (i >= 0) {
            jTextFieldFullname.setText(tblcustomer.getModel().getValueAt(i, column++).toString());
            jTextFieldPassword.setText(tblcustomer.getModel().getValueAt(i, column++).toString());
            jTextFieldAddress.setText(tblcustomer.getModel().getValueAt(i, column++).toString());
            jTextFieldCity.setText(tblcustomer.getModel().getValueAt(i, column++).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void btnAddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseClicked
        Category newCategoryItem = new Category();              
        newCategoryItem.setName(txtNameCategory.getText());
        newCategoryItem.setDescription(txtCategoryDescription.getText());
        categoryBLL.newData(newCategoryItem);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        loadCategory();
    }//GEN-LAST:event_btnAddCategoryMouseClicked

    private void txtNameCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameCategoryActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int i = tblCategory.getSelectedRow();
        if (i >= 0) {
            int id = Integer.parseInt(tblCategory.getModel().getValueAt(i, 0).toString());
            Category newCategory = new Category();
            newCategory = categoryBLL.getData(id);
            newCategory.setName(txtNameCategory.getText());
            newCategory.setDescription(txtCategoryDescription.getText());
            System.out.println(newCategory);
            categoryBLL.editData(newCategory);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            loadCategory();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        loadCategory();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int i = tblCategory.getSelectedRow();
        int column = 0;
        if (i >= 0) {
            int id = Integer.parseInt(tblCategory.getModel().getValueAt(i, column++).toString());
            categoryBLL.deleteData(id);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadCategory();
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        // TODO add your handling code here:
        int i = tblCategory.getSelectedRow();
        int column = 1;
        if (i >= 0) {
            txtNameCategory.setText(tblCategory.getModel().getValueAt(i, column++).toString());
            txtCategoryDescription.setText(tblCategory.getModel().getValueAt(i, column++).toString());
        }
        
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void tblVegetableInInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVegetableInInvoiceMouseClicked
        // TODO add your handling code here:
        int i = tblVegetableInInvoice.getSelectedRow();
        int column = 2;
        if (i >= 0) {
            txtVegetableNameInInvoice.setText(tblVegetableInInvoice.getModel().getValueAt(i, column).toString());            
        }
    }//GEN-LAST:event_tblVegetableInInvoiceMouseClicked

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void btnSaveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBillActionPerformed
        float total = 0;
        for (Vegetable vegetable : OrderDetailBLL.vegetableList) {
            total += vegetable.getAmount() * vegetable.getPrice();
        }
        orderBLL.tempBill.setTotal(total);        
        orderBLL.newData(orderBLL.tempBill);
        int orderbillID = orderBLL.tempBill.getOrderID();
        for (Vegetable vegetable : OrderDetailBLL.vegetableList) {
            OrderDetail newOrderDetail = new OrderDetail();            
            newOrderDetail.setOrderID(orderbillID);
            newOrderDetail.setVegetableID(vegetable.getVegetableID());
            List<Vegetable> vegetableList = vegBLL.FindDataByName(vegetable.getVegetableName());
            Vegetable updateVegetable = vegetableList.get(0);
            updateVegetable.setAmount(updateVegetable.getAmount() - vegetable.getAmount());
            newOrderDetail.setPrice(vegetable.getPrice());
            newOrderDetail.setQuantity(vegetable.getAmount());
            orderDetailBLL.newData(newOrderDetail);
            vegBLL.editData(updateVegetable);
        }
        orderBLL.tempBill = null;
        OrderDetailBLL.vegetableList.clear();
        Object[][] obj = null;
        String[] titles = {"VegetableID","Vegetable Name","Unit", "Quantity", "Price"};
        DefaultTableModel orderDetailModel = new DefaultTableModel(obj, titles);
        tblOrderdetail.setModel(orderDetailModel);
        JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công");
        loadVegetable();
    }//GEN-LAST:event_btnSaveBillActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        txtfilter.setText("");
        txtVegetableNameInInvoice.setText("");
        txtAmountVegetable.setText("");
        List<Vegetable> listVegetables = vegBLL.loadData();
        Object[][] data = vegBLL.ConvertListForTable(listVegetables);
        String[] titles = {"Id", "Category", "Name", "Unit", "Amount", "Image", "Price"};
        DefaultTableModel vegtableModel = new DefaultTableModel(data, titles);
        tblVegetable.setModel(vegtableModel);
        tblVegetableInInvoice.setModel(vegtableModel);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Filter;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddVegetable;
    private javax.swing.JButton btnDeleteVegetable;
    private javax.swing.JButton btnEditVegetable;
    private javax.swing.JButton btnResetVegetable;
    private javax.swing.JButton btnSaveBill;
    private javax.swing.JButton btnSearchIns;
    private javax.swing.JButton btnSearchIns1;
    private javax.swing.JButton btnSearchIns2;
    private javax.swing.JButton btnSearchIns3;
    private javax.swing.JButton btnSearchVegetable;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbCustomers;
    private javax.swing.JComboBox<String> cbUnit;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonaddCus;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldFullname;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JPanel pn_product;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlImport;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JPanel pnlRevenueByProduct;
    private javax.swing.JPanel pnlSaleRevenue;
    private javax.swing.JPanel pnlStatistical;
    private javax.swing.JPanel pnlcategory;
    private javax.swing.JPanel pnlvegetable;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTable tblOrderdetail;
    private javax.swing.JTable tblVegetable;
    private javax.swing.JTable tblVegetableInInvoice;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTable tblorders;
    private javax.swing.JTable tblordersum;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmountVegetable;
    private javax.swing.JTextField txtCategoryDescription;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtNameCategory;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchCategory;
    private javax.swing.JTextField txtSearchCustomer;
    private javax.swing.JTextField txtSearchIns;
    private javax.swing.JTextField txtSearchIns1;
    private javax.swing.JTextField txtSearchVegetable;
    private javax.swing.JTextField txtVegetableName;
    private javax.swing.JTextField txtVegetableNameInInvoice;
    private javax.swing.JTextField txtfilter;
    // End of variables declaration//GEN-END:variables
}
