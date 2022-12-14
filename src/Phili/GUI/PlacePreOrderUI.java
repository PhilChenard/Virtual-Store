package Phili.GUI;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Phili.MainEngine.Product;


/**
 * @author phili
 *
 */
public class PlacePreOrderUI extends javax.swing.JFrame {
	
    private javax.swing.JButton poButtonPlaceOrder;
    private javax.swing.JLabel poLabelCategory;
    private javax.swing.JLabel poLabelDescription;
    private javax.swing.JLabel poLabelName;
    private javax.swing.JLabel poLabelPrice;
    private javax.swing.JLabel poLabelQuantity;
    private javax.swing.JLabel poLabelStock;
    private javax.swing.JPanel poPanel;
    private javax.swing.JScrollPane poScrollPane;
    private javax.swing.JSpinner poSpinnerQuantity;
    private javax.swing.JTextField poTetxFieldStock;
    private javax.swing.JTextArea poTextAreaDescription;
    private javax.swing.JTextField poTextFieldCategory;
    private javax.swing.JTextField poTextFieldName;
    private javax.swing.JTextField poTextFieldPrice;

     
    public PlacePreOrderUI() {
        initComponents();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        poPanel = new javax.swing.JPanel();
        poLabelName = new javax.swing.JLabel();
        poLabelDescription = new javax.swing.JLabel();
        poLabelPrice = new javax.swing.JLabel();
        poLabelCategory = new javax.swing.JLabel();
        poLabelQuantity = new javax.swing.JLabel();
        poTextFieldName = new javax.swing.JTextField();
        poScrollPane = new javax.swing.JScrollPane();
        poTextAreaDescription = new javax.swing.JTextArea();
        poTextFieldPrice = new javax.swing.JTextField();
        poTextFieldCategory = new javax.swing.JTextField();
        poSpinnerQuantity = new javax.swing.JSpinner();
        poButtonPlaceOrder = new javax.swing.JButton();
        poLabelStock = new javax.swing.JLabel();
        poTetxFieldStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order");
        setResizable(false);

        poPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Your order"));

        poLabelName.setText("Name:");

        poLabelDescription.setText("Description:");

        poLabelPrice.setText("Price:");

        poLabelCategory.setText("Category:");

        poLabelQuantity.setText("Quantity:");

        poTextFieldName.setEditable(false);
        poTextFieldName.setBackground(new java.awt.Color(255, 255, 255));

        poTextAreaDescription.setEditable(false);
        poTextAreaDescription.setColumns(20);
        poTextAreaDescription.setRows(5);
        poScrollPane.setViewportView(poTextAreaDescription);

        poTextFieldPrice.setEditable(false);
        poTextFieldPrice.setBackground(new java.awt.Color(255, 255, 255));

        poTextFieldCategory.setEditable(false);
        poTextFieldCategory.setBackground(new java.awt.Color(255, 255, 255));

        poSpinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        poSpinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                poSpinnerQuantityStateChanged(evt);
            }
        });

        poButtonPlaceOrder.setBackground(java.awt.SystemColor.controlHighlight);
        poButtonPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Phili/GUI/Images/confirm order placement.png"))); 
        poButtonPlaceOrder.setText("Add to cart");
        poButtonPlaceOrder.setEnabled(false);
        poButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poButtonPlaceOrderActionPerformed(evt);
            }
        });

        poLabelStock.setText("Stock:");

        poTetxFieldStock.setEditable(false);
        poTetxFieldStock.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout poPanelLayout = new javax.swing.GroupLayout(poPanel);
        poPanel.setLayout(poPanelLayout);
        poPanelLayout.setHorizontalGroup(
            poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poLabelStock)
                    .addComponent(poLabelCategory)
                    .addComponent(poLabelPrice)
                    .addComponent(poLabelDescription)
                    .addComponent(poLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(poScrollPane)
                    .addComponent(poTextFieldName)
                    .addGroup(poPanelLayout.createSequentialGroup()
                        .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(poTextFieldPrice)
                                .addComponent(poTextFieldCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, poPanelLayout.createSequentialGroup()
                                .addComponent(poTetxFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(poPanelLayout.createSequentialGroup()
                                .addComponent(poLabelQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(poSpinnerQuantity))
                            .addComponent(poButtonPlaceOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        poPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {poTetxFieldStock, poTextFieldCategory});

        poPanelLayout.setVerticalGroup(
            poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poLabelName)
                    .addComponent(poTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poLabelDescription)
                    .addComponent(poScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poSpinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(poLabelPrice)
                        .addComponent(poTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(poLabelQuantity)))
                .addGap(18, 18, 18)
                .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poPanelLayout.createSequentialGroup()
                        .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poLabelCategory)
                            .addComponent(poTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(poPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poLabelStock)
                            .addComponent(poTetxFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(poButtonPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void poButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {
    	String name = poTextFieldName.getText();
        String description = poTextAreaDescription.getText();
        double price = Double.parseDouble(poTextFieldPrice.getText());
        String category = poTextFieldCategory.getText();
        int quantity = Integer.parseInt(poSpinnerQuantity.getValue().toString());
        
        Product product = new Product(name, category, price, quantity, description);

        ShoppingCartUI.productsInCart.add(product);
        
        this.dispose();
    }

    private void poSpinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {
  
        if((Integer)poSpinnerQuantity.getValue()>0)
        {
            poButtonPlaceOrder.setEnabled(true);
        }
        else
        {
            poButtonPlaceOrder.setEnabled(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

       try {
        UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      
    }

        java.awt.EventQueue.invokeLater(() -> {
            new PlacePreOrderUI().setVisible(true);
       });
    }


    
    public void setNameText (String name)
    {
        this.poTextFieldName.setText(name);
    }
    
    public void setDescriptionText (String desc)
    {
        this.poTextAreaDescription.setText(desc);
    }
    
    public void setPriceText (String price)
    {
        this.poTextFieldPrice.setText(price);
    }
    
    public void setCategoryName (String category)
    {
        this.poTextFieldCategory.setText(category);
    }
    
    public void SetStockText (String stock)
    {
        this.poTetxFieldStock.setText(stock);
        
        SetSpinnerMaximum();
    }
    
    public void SetSpinnerMaximum()
    {
        poSpinnerQuantity.setModel(new SpinnerNumberModel(0, 0, Integer.parseInt(poTetxFieldStock.getText()), 1));
        
        LoginUI.uiLogic.InitializeSpinner(poSpinnerQuantity);
    }
}
